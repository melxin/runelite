import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	static IndexedSprite field43;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1559372579
	)
	static int field42;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 968537279
	)
	int field32;
	@ObfuscatedName("aa")
	@Export("name")
	String name;
	@ObfuscatedName("am")
	boolean field39;
	@ObfuscatedName("ah")
	boolean field40;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field32 = var1;
		this.name = var2;
		this.field39 = var3;
		this.field40 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "77197743"
	)
	boolean method81() {
		return this.field39;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field32;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1238252449"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1334592352"
	)
	boolean method69() {
		return this.field40;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ldl;[BIIIII)V",
		garbageValue = "-1862927163"
	)
	static final void method80(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var8;
		int var9;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				CollisionMap var13 = var0.collisionMaps[var6];

				for (var8 = var2; var8 < var2 + 64; ++var8) {
					for (var9 = var3; var9 < var3 + 64; ++var9) {
						if (var13.method5960(var8, var9)) {
							var13.method5933(var8, var9, 1073741824);
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (int var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					FriendSystem.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lov;I)Z",
		garbageValue = "-2019078946"
	)
	static final boolean method75(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method7321(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7322(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7322(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
