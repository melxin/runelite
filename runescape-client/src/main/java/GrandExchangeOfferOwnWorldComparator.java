import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field248;
	@ObfuscatedName("av")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqk;Lqk;B)I",
		garbageValue = "97"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "147042880"
	)
	public static void method840() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "627648485"
	)
	public static void method839(int var0) {
		if (!class345.midiRequests.isEmpty()) {
			Iterator var1 = class345.midiRequests.iterator();

			while (var1.hasNext()) {
				MidiRequest var2 = (MidiRequest)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MidiRequest var3 = (MidiRequest)class345.midiRequests.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field4050) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field4046 = (float)var0;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvu;IIIIB)Z",
		garbageValue = "-96"
	)
	public static boolean method828(class563 var0, int var1, int var2, int var3, int var4) {
		return !class151.method3975(var0, var1, var2, var3, var4) ? false : WorldMapSection1.method7061(var0.method11205(0), var0.method11206(0), var0.method11205(1), var0.method11206(1), var0.method11205(2), var0.method11206(2), var0.method11205(3), var0.method11206(3), var1, var2, var3, var4);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lof;IZLcu;I)V",
		garbageValue = "555015274"
	)
	static void method838(Widget var0, int var1, boolean var2, Script var3) {
		if (var0.children == null) {
			var0.children = new Widget[var1 + 1];
		}

		if (var0.children.length <= var1) {
			Widget[] var4 = new Widget[var1 + 1];
			System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
			var0.children = var4;
		} else {
			Widget var5 = var0.children[var1];
			if (var5 != null) {
				if (var2) {
					throw new RuntimeException("");
				}

				class526.method10648(var5, var0);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILof;Lof;I)Lof;",
		garbageValue = "-1609870633"
	)
	static Widget method837(int var0, Widget var1, Widget var2) {
		int var3 = 0;
		Widget var4 = null;

		for (int var5 = var2.childIndex * 2077538819 + 1; var5 < var1.children.length; ++var5) {
			Widget var6 = var1.children[var5];
			if (var6 != null && var2.childIndex * 2077538819 == var6.field4234) {
				++var3;
				if (var0 == var3 - 1) {
					var4 = var6;
					break;
				}
			}
		}

		return var4;
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "371066558"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class468.clientPreferences.updateRoofsHidden(!class468.clientPreferences.isRoofsHidden());
			if (class468.clientPreferences.isRoofsHidden()) {
				class356.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class356.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = Message.method778(var0.substring(5).trim()) == 1;
			SecureUrlRequester.client.method536(var1);
			Rasterizer3D.method5362(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class468.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		int var2;
		String[] var3;
		if (var0.startsWith("setdrawdistance")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				class468.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var7) {
				class356.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				Occluder.topLevelWorldView.scene.method5592(TileRenderMode.method5254()[var2]);
			} catch (NumberFormatException var6) {
				class356.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			class356.addGameMessage(99, "", String.format("%d", class468.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				Skills.worldMap.showCoord = !Skills.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class468.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class468.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class165.method4149();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				class144.method3892();
			} else if (var0.equalsIgnoreCase("sfx8bit")) {
				class468.clientPreferences.method2746(true);
			} else if (var0.equalsIgnoreCase("sfx16bit")) {
				class468.clientPreferences.method2746(false);
			} else if (var0.startsWith("playsong ")) {
				String var8 = var0.substring("playsong ".length());

				try {
					if (class468.clientPreferences.getMusicVolume() == 0) {
						class167.method4167(0, 0);
					} else {
						class148.method3950(var8, class468.clientPreferences.getMusicVolume());
					}
				} catch (Exception var5) {
					class356.addGameMessage(99, "", "Can't play the midi named " + var8);
				}
			} else if (var0.equalsIgnoreCase("stopsong")) {
				class167.method4167(0, 0);
			}
		}

		PacketBufferNode var9 = ReflectionCheck.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var9.packetBuffer.writeByte(var0.length() + 1);
		var9.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var9);
	}
}
