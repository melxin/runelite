import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("iz")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("ab")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("aw")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ao")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ac")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-578572592"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lig;",
		garbageValue = "-1682257032"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lig;",
		garbageValue = "1937338846"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;IB)Lig;",
		garbageValue = "-51"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-166363441"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = GameEngine.getPreferencesFile("", Language.field4687.name, true);
			Buffer var1 = SecureUrlRequester.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method4407(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			PrivateChatMode.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
			AsyncHttpResponse.privateChatMode = Projectile.method2339(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
			if (AsyncHttpResponse.privateChatMode == null) {
				AsyncHttpResponse.privateChatMode = PrivateChatMode.field5624;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = Message.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(AsyncHttpResponse.privateChatMode.field5626);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var6 = Message.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					PrivateChatMode.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
					var5 = class142.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var4 = class145.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (AsyncHttpResponse.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = AsyncHttpResponse.privateChatMode.field5626;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var12 = Client.method1455(var7, var8, class276.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var12 = Message.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							ScriptFrame.method1172(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							PrivateChatMode.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
							var6 = Client.method1455(var7, var8, class276.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = PcmPlayer.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = WorldMapDecoration.method6231(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								UserComparator5.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field787 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field787;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
								var5 = class142.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								var4 = class145.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (AsyncHttpResponse.localPlayer != null && AsyncHttpResponse.localPlayer.username != null) {
								var8 = AsyncHttpResponse.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "197335248"
	)
	static final void method4408(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		SecureUrlRequester.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
