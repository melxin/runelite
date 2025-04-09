import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public class class210 extends class225 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 858884191
	)
	int field2403;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	final class222 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lig;Ljava/lang/String;I)V"
	)
	class210(class222 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2403 = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1893694447"
	)
	public int vmethod4957() {
		return 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1558945932"
	)
	public int vmethod4959() {
		return this.field2403;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIII[Ljava/lang/String;IIB)V",
		garbageValue = "-23"
	)
	static void method4716(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1207 = -1;
			class157.method3545(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1200 = var5;
		var13.field1204 = var6;
		var13.field1201 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2620(var8);
		var13.method2618(var9);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)Z",
		garbageValue = "858405503"
	)
	static final boolean method4717(Widget var0) {
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
				Client.playerAppearance.method6993(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7021(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7021(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = FloorDecoration.getPacketBufferNode(ClientPacket.field3462, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
