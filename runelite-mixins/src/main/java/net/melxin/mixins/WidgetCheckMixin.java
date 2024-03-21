/*
 * Copyright (c) 2024 Melxin
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
package net.melxin.mixins;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWidgetDefinition;

@Mixin(RSClient.class)
public abstract class WidgetCheckMixin implements RSClient
{
	@Shadow("client")
	static RSClient client;

	@Inject
	public List<WidgetInfo> getWidgetInfoFieldsReflection()
	{
		final List<WidgetInfo> widgetInfos = new ArrayList<>();
		final Field[] fields = WidgetInfo.class.getDeclaredFields();
		for (Field f : fields)
		{
			if (!f.getType().equals(WidgetInfo.class))
			{
				continue;
			}

			f.setAccessible(true);
			try
			{
				WidgetInfo widgetInfo = (WidgetInfo) f.get(f);
				if (widgetInfo != null && widgetInfo instanceof WidgetInfo)
				{
					widgetInfos.add(widgetInfo);
				}
			}
			catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		return widgetInfos;
	}
	
	@Inject
	@MethodHook("openMenu")
	public void checkWidgetInfo(int x, int y)
	{
		final List<WidgetInfo> widgetInfos = getWidgetInfoFieldsReflection();
		final RSWidgetDefinition widgetDefinition = client.getWidgetDefinition();
		if (widgetDefinition != null)
		{
			for (WidgetInfo widgetInfo : widgetInfos)
			{
				client.getLogger().info("WidgetInfo: {} groupId: {} | childId: {}", widgetInfo, widgetInfo.getGroupId(), widgetInfo.getChildId());
			}

			final RSAbstractArchive widgetArchive = widgetDefinition.getWidgetArchive();
			for (int i = 0; i < widgetArchive.getGroupCount(); i++)
			{
				widgetDefinition.loadInterface(i);
			}

			final RSWidget[][] widgets = widgetDefinition.getWidgets();
			for (int group = 0; group < widgets.length; group++)
			{
				for (RSWidget widgetChild : widgets[group])
				{
					int id = widgetChild.getId();
					int groupId = id >>> 16;
					int childId = id & 0xFFFF;

					if (widgetChild.getRSName() == null || widgetChild.getRSName().length() <= 1)
					{
						continue;
					}
					client.getLogger().info("WidgetChild: id: {} | groupId: {} | childId: {} | rsName: {}", id, groupId, childId, widgetChild.getRSName());
				}
			}
		}
	}
}