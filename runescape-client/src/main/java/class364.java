import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class364 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	public class366 field4066;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	class360 field4065;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	class28 field4071;
	@ObfuscatedName("ac")
	public Object[] field4067;
	@ObfuscatedName("ap")
	public Object[] field4068;
	@ObfuscatedName("aq")
	public Object[] field4069;
	@ObfuscatedName("ao")
	public Object[] field4070;

	class364() {
		this.field4066 = new class366();
		this.field4065 = new class360();
		this.field4071 = new class28();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ltj;Lwf;I)V",
		garbageValue = "765183961"
	)
	static void method7523(WorldEntity var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
		}

		if ((var2 & 2) != 0) {
			var0.method10075(var1.readUnsignedByte());
		}

	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "38"
	)
	static final void method7522(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class269.field3187 || SpotAnimationDefinition.field2210 != var1) {
			class269.field3187 = var0;
			SpotAnimationDefinition.field2210 = var1;
			UrlRequest.updateGameState(25);
			Client.field556 = true;
			class464.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class333.topLevelWorldView.baseX;
			int var4 = class333.topLevelWorldView.baseY;
			class333.topLevelWorldView.baseX = (var0 - 6) * 8;
			class333.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class333.topLevelWorldView.baseX - var3;
			int var6 = class333.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var25 = (NPC)class333.topLevelWorldView.npcs.get((long)var9);
				if (var25 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var25.pathX;
						var10000[var11] -= var5;
						var10000 = var25.pathY;
						var10000[var11] -= var6;
					}

					var25.x -= var7;
					var25.y -= var8;
					var25.field1089 -= var5;
					var25.field1091 -= var6;
					var25.field1072 -= var5;
					var25.field1084 -= var6;
				}
			}

			Iterator var21 = class333.topLevelWorldView.players.iterator();

			while (true) {
				Player var28;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var24 = (WorldEntity)class333.topLevelWorldView.worldEntities.get((long)var10);
							if (var24 != null) {
								var24.setPosition(-var7, -var8);
							}
						}

						byte var26 = 0;
						byte var27 = 104;
						byte var12 = 1;
						if (var5 < 0) {
							var26 = 103;
							var27 = -1;
							var12 = -1;
						}

						byte var13 = 0;
						byte var14 = 104;
						byte var15 = 1;
						if (var6 < 0) {
							var13 = 103;
							var14 = -1;
							var15 = -1;
						}

						int var18;
						for (int var16 = var26; var16 != var27; var16 += var12) {
							for (int var23 = var13; var23 != var14; var23 += var15) {
								var18 = var5 + var16;
								int var19 = var23 + var6;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										class333.topLevelWorldView.groundItems[var20][var16][var23] = class333.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										class333.topLevelWorldView.groundItems[var20][var16][var23] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)class333.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)class333.topLevelWorldView.pendingSpawns.previous()) {
							var22.x -= var5;
							var22.y -= var6;
							if (var22.x < 0 || 104 <= var22.x || var22.y < 0 || 104 <= var22.y) {
								var22.remove();
							}
						}

						if (Client.destinationX != 0) {
							Client.destinationX -= var5;
							Client.destinationY -= var6;
						}

						for (Projectile var17 = (Projectile)Client.projectiles.last(); var17 != null; var17 = (Projectile)Client.projectiles.previous()) {
							var17.method1972(-var5, -var6);
						}

						class58.soundEffectCount = 0;
						Client.isCameraLocked = false;
						HealthBarDefinition.cameraX -= var5 << 7;
						HttpRequest.cameraZ -= var6 << 7;
						class172.oculusOrbFocalPointX -= var5 << 7;
						BuddyRankComparator.oculusOrbFocalPointY -= var6 << 7;
						Client.field552 -= var5 << 7;
						Client.field337 -= var6 << 7;
						Client.field576 = -1;
						class333.topLevelWorldView.graphicsObjects.clear();

						for (var18 = 0; var18 < 4; ++var18) {
							class333.topLevelWorldView.collisionMaps[var18].clear();
						}

						return;
					}

					var28 = (Player)var21.next();
				} while(var28 == null);

				for (var11 = 0; var11 < 10; ++var11) {
					var10000 = var28.pathX;
					var10000[var11] -= var5;
					var10000 = var28.pathY;
					var10000[var11] -= var6;
				}

				var28.x -= var7;
				var28.y -= var8;
				var28.field1089 -= var5;
				var28.field1091 -= var6;
				var28.field1072 -= var5;
				var28.field1084 -= var6;
			}
		}
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Loi;I)Z",
		garbageValue = "-2084658164"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
