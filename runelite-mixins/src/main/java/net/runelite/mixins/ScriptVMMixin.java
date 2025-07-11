/*
 * Copyright (c) 2018 Abex
 * Copyright (c) 2020, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ScriptCallbackEvent;
import net.runelite.api.events.ScriptPostFired;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.JavaScriptCallback;
import static net.runelite.cache.script.Opcodes.CAM_FORCEANGLE;
import static net.runelite.cache.script.Opcodes.INVOKE;
import static net.runelite.cache.script.Opcodes.RETURN;
import static net.runelite.cache.script.RuneLiteOpcodes.RUNELITE_EXECUTE;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSScript;
import net.runelite.rs.api.RSScriptEvent;

@Mixin(RSClient.class)
public abstract class ScriptVMMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private static RSScript currentScript;

	@Inject
	private static RSScriptEvent rootScriptEvent;

	// This field is set by the ScriptVM raw injector
	@Inject
	private static int currentScriptPC;

	// Call is injected by the raw injector
	@Inject
	static void setCurrentScript(RSScript script)
	{
		if (rootScriptEvent != null)
		{
			if (script != null)
			{
				ScriptPreFired event = new ScriptPreFired((int) script.getHash());
				event.setScriptEvent(rootScriptEvent);
				client.getCallbacks().post(event);
			}

			rootScriptEvent = null;
		}

		currentScript = script;
	}

	// Call is injected into runScript by the ScriptVM raw injector
	@Inject
	static boolean vmExecuteOpcode(int opcode)
	{
		switch (opcode)
		{
			case RUNELITE_EXECUTE:
				assert currentScript.getInstructions()[currentScriptPC] == RUNELITE_EXECUTE;

				int stringStackSize = client.getObjectStackSize();
				String stringOp = (String) client.getObjectStack()[--stringStackSize];
				client.setObjectStackSize(stringStackSize);

				if ("debug".equals(stringOp))
				{
					int intStackSize = client.getIntStackSize();

					String fmt = (String) client.getObjectStack()[--stringStackSize];
					StringBuffer out = new StringBuffer();
					Matcher m = Pattern.compile("%(.)").matcher(fmt);
					while (m.find())
					{
						m.appendReplacement(out, "");
						switch (m.group(1).charAt(0))
						{
							case 'i':
							case 'd':
								out.append(client.getIntStack()[--intStackSize]);
								break;
							case 's':
								out.append(client.getObjectStack()[--stringStackSize]);
								break;
							default:
								out.append(m.group(0)).append("=unknown");
						}
					}
					m.appendTail(out);

					client.getLogger().debug(out.toString());

					client.setObjectStackSize(stringStackSize);
					client.setIntStackSize(intStackSize);
					return true;
				}
				else if ("mes".equals(stringOp))
				{
					int intStackSize = client.getIntStackSize();
					int messageType = client.getIntStack()[--intStackSize];
					String message = (String) client.getObjectStack()[--stringStackSize];
					client.setObjectStackSize(stringStackSize);
					client.setIntStackSize(intStackSize);
					client.addChatMessage(ChatMessageType.of(messageType), "", message, null, true);
					return true;
				}
				else if ("scrollWheelZoom".equals(stringOp))
				{
					if (client.isMenuOpen())
					{
						client.getIntStack()[client.getIntStackSize() - 1] = 1;
						return true;
					}
				}
				ScriptCallbackEvent event = new ScriptCallbackEvent();
				event.setScript(currentScript);
				event.setEventName(stringOp);
				client.getCallbacks().post(event);
				return true;
			case INVOKE:
				int scriptId = currentScript.getIntOperands()[currentScriptPC];
				client.getCallbacks().post(new ScriptPreFired(scriptId));
				return false;
			case RETURN:
				client.getCallbacks().post(new ScriptPostFired((int) currentScript.getHash()));
				return false;
			case CAM_FORCEANGLE:
				int[] intStack = client.getIntStack();
				int intStackSize = client.getIntStackSize();
				int var4 = intStack[intStackSize - 1];
				int var3 = intStack[intStackSize - 2];
				if (!client.isCameraLocked())
				{
					client.posToCameraAngle(var4, var3);
				}

				return false;
		}
		return false;
	}

	@Copy("runScript")
	@Replace("runScript")
	static void copy$runScript(RSScriptEvent event, int maxExecutionTime, int var2)
	{
		Object[] arguments = event.getArguments();
		assert arguments != null && arguments.length > 0;
		if (arguments[0] instanceof JavaScriptCallback)
		{
			try
			{
				((JavaScriptCallback) arguments[0]).run(event);
			}
			catch (Exception e)
			{
				client.getLogger().error("Error in JavaScriptCallback", e);
			}
		}
		else
		{
			try
			{
				rootScriptEvent = event;
				copy$runScript(event, maxExecutionTime, var2);
			}
			finally
			{
				currentScript = null;
			}
		}
	}

	@Copy("runScriptLogic")
	@Replace("runScriptLogic")
	static void copy$runScriptLogic(RSScriptEvent event, RSScript var4, int maxExecutionTime, int var2)
	{
		copy$runScriptLogic(event, var4, maxExecutionTime, var2);
	}

	@Inject
	@Override
	public void runScript(Object... args)
	{
		runScriptEvent(createRSScriptEvent(args));
	}

	@Inject
	@Override
	public void runScriptEvent(RSScriptEvent event)
	{
		assert isClientThread() : "runScriptEvent must be called on client thread";
		assert currentScript == null : "scripts are not reentrant";
		runScript(event, 5000000, 0);
		boolean assertionsEnabled = false;
		assert assertionsEnabled = true;

		Object[] args = event.getArguments();
		if (assertionsEnabled && args[0] instanceof Integer)
		{
			int scriptId = (int) args[0];
			RSScript script = (RSScript) client.getScriptCache().get(scriptId);

			if (script != null)
			{
				int intCount = 0, stringCount = 0;
				for (int i = 1; i < args.length; i++)
				{
					if (args[i] instanceof Integer)
					{
						intCount++;
					}
					else
					{
						stringCount++;
					}
				}

				assert script.getIntArgumentCount() == intCount && script.getStringArgumentCount() == stringCount :
					"Script " + scriptId + " was called with the incorrect number of arguments; takes "
						+ script.getIntArgumentCount() + "+" + script.getStringArgumentCount() + ", got " + intCount + "+" + stringCount;
			}
		}
	}

	@Inject
	@Override
	public int getArraySizes(int arrayId)
	{
		return client.getArraySizes()[arrayId];
	}

	@Inject
	@Override
	public int[] getArray(int arrayId)
	{
		return client.getArrays()[arrayId];
	}
}