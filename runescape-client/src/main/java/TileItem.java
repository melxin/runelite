import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -902100307
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -537901135
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 423478139
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -45367871
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1682482499
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ae")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1199726375
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	PlayerCompositionColorTextureOverride field1225;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	ProjectionCoord field1226;

	TileItem() {
		this.flag = 31;
		this.field1226 = ProjectionCoord.field5220;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-891792479"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1983291362"
	)
	boolean method2886(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = WorldMapIcon_1.ItemDefinition_get(this.id);
		Model var2 = this.field1225 == null ? var1.getModel(this.quantity) : var1.method4731(this.field1225);
		if (var2 == null) {
			return null;
		} else {
			Model var3 = null;
			if (this.field1226 != ProjectionCoord.field5220) {
				class451 var4 = class135.method3746();
				var4.method9153(ProjectionCoord.field5213, this.field1226);
				var4.method9128();
				var3 = var2.toSharedSequenceModel(false);
				var3.method5549(var4);
				var4.method9120();
			}

			return var3 == null ? var2 : var3;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		ItemComposition var1 = WorldMapIcon_1.ItemDefinition_get(this.id);
		Model var2 = this.field1225 == null ? var1.getModel(this.quantity) : var1.method4731(this.field1225);
		return var2 != null && var2.faceAlphas != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lgv;",
		garbageValue = "-90"
	)
	PlayerCompositionColorTextureOverride method2910() {
		return this.field1225;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lgv;B)V",
		garbageValue = "44"
	)
	void method2889(PlayerCompositionColorTextureOverride var1) {
		this.field1225 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073802202"
	)
	void method2884() {
		this.field1225 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)V",
		garbageValue = "1424941640"
	)
	void method2891(ProjectionCoord var1) {
		this.field1226 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lia;",
		garbageValue = "1"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class266.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIILcr;I)Lre;",
		garbageValue = "-1640047933"
	)
	static ProjectionCoord method2915(int var0, int var1, int var2, int var3, WorldViewManager var4) {
		ProjectionCoord var5 = null;
		WorldView var6 = null;
		boolean var7 = var0 != 0;
		int var10;
		if (var7) {
			boolean var9 = var0 > 0;
			Object var8;
			WorldView var11;
			Iterator var12;
			WorldView var13;
			if (var9) {
				var10 = Widget.method7962(var0);
				var12 = var4.iterator();

				while (true) {
					if (var12.hasNext()) {
						var13 = (WorldView)var12.next();
						if (var13.npcs.get((long)var10) == null) {
							continue;
						}

						var11 = var13;
						break;
					}

					var11 = var4.method2366();
					break;
				}

				var6 = var11;
				var8 = (Actor)var11.npcs.get((long)var10);
			} else {
				var10 = class263.method5980(var0);
				var12 = var4.iterator();

				while (true) {
					if (var12.hasNext()) {
						var13 = (WorldView)var12.next();
						Player var14 = (Player)var13.players.get((long)var10);
						if (var14 == null || var13.id == -1) {
							continue;
						}

						var11 = var13;
						break;
					}

					var11 = var4.method2366();
					break;
				}

				var6 = var11;
				var8 = var11.method2745(var10);
			}

			if (var8 != null) {
				Coord var15 = ((Actor)var8).method2463(var6);
				var5 = class147.method3882();
				var5.x = (float)var15.x;
				var5.y = (float)var15.y;
			}
		}

		if (var5 == null) {
			var6 = var4.getWorldViewFromWorldPoint(var1, var2);
			int var16 = var1 - var6.baseX;
			int var19 = var2 - var6.baseY;
			WorldEntity var21 = (WorldEntity)var4.method2366().worldEntities.get((long)var6.id);
			if (var21 != null) {
				var5 = var21.method10213(Coord.method7425(var16), Coord.method7425(var19));
			} else {
				var5 = IndexCheck.method6169((float)Coord.method7425(var16), 0.0F, (float)Coord.method7425(var19));
			}
		}

		var10 = (int)var5.x;
		int var17 = (int)var5.y;
		int var18 = class280.getTileHeight(var6, var10, var17, var3);
		WorldEntity var20 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var6.id);
		if (var20 != null) {
			var18 += class280.getTileHeight(class547.topLevelWorldView, var20.getY(), var20.getPlane(), var20.getX());
		}

		var5.z = (float)var18;
		return var5;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "67340847"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class441.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-291621225"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class154.clientPreferences.updateRoofsHidden(!class154.clientPreferences.isRoofsHidden());
			if (class154.clientPreferences.isRoofsHidden()) {
				class292.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class292.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class349.method7392(var0.substring(5).trim()) == 1;
			class32.client.method516(var1);
			Rasterizer3D.method4988(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class154.clientPreferences.toggleDisplayFps();
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
				class154.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var7) {
				class292.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.startsWith("settilerendermode")) {
			var3 = var0.split(" ");

			try {
				var2 = Integer.parseInt(var3[1]);
				class547.topLevelWorldView.scene.method5171(TileRenderMode.method4889()[var2]);
			} catch (NumberFormatException var6) {
				class292.addGameMessage(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			class292.addGameMessage(99, "", String.format("%d", class154.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				class50.worldMap.showCoord = !class50.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class154.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class154.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class199.method4473();
			}

			if (var0.equalsIgnoreCase("clientreload")) {
				Occluder.method5462();
			} else if (var0.equalsIgnoreCase("sfx8bit")) {
				class154.clientPreferences.method2631(true);
			} else if (var0.equalsIgnoreCase("sfx16bit")) {
				class154.clientPreferences.method2631(false);
			} else if (var0.startsWith("playsong ")) {
				String var8 = var0.substring("playsong ".length());

				try {
					if (class154.clientPreferences.getMusicVolume() == 0) {
						Clock.method6092(0, 0);
					} else {
						TriBool.method10172(var8, class154.clientPreferences.getMusicVolume());
					}
				} catch (Exception var5) {
					class292.addGameMessage(99, "", "Can't play the midi named " + var8);
				}
			} else if (var0.equalsIgnoreCase("stopsong")) {
				Clock.method6092(0, 0);
			}
		}

		PacketBufferNode var9 = HorizontalAlignment.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var9.packetBuffer.writeByte(var0.length() + 1);
		var9.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var9);
	}
}
