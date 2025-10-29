import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class138 implements Callable {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("ItemDefinition_archive")
	public static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Archive field1642;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class139 field1646;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	final class140 field1641;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class141 field1644;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2040720483
	)
	final int field1643;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;Lft;Lfq;Lfz;I)V"
	)
	class138(class146 var1, class139 var2, class140 var3, class141 var4, int var5) {
		this.this$0 = var1;
		this.field1646 = var2;
		this.field1641 = var3;
		this.field1644 = var4;
		this.field1643 = var5;
	}

	public Object call() {
		this.field1646.method3848();
		class139[][] var1;
		if (this.field1641 == class140.field1673) {
			var1 = this.this$0.field1717;
		} else {
			var1 = this.this$0.field1719;
		}

		var1[this.field1643][this.field1644.method3875()] = this.field1646;
		return null;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILcu;ZI)I",
		garbageValue = "-1694757224"
	)
	static int method3831(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ZLxj;I)V",
		garbageValue = "-1570779086"
	)
	static final void method3828(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					NPC var7 = (NPC)var0.npcs.get((long)var5);
					if (var7 == null) {
						var7 = new NPC(var5);
						var0.npcs.add(var7, (long)var5);
						var6 = true;
					}

					var0.field1130.method10036(var5);
					var7.field1165 = false;
					var7.worldViewId = var0.id;
					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(6);
						if (var9 > 31) {
							var9 -= 64;
						}
					}

					boolean var11 = var2.readBits(1) == 1;
					if (var11) {
						var2.readBits(32);
					}

					int var12 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var12;
						var7.field1009 = var7.orientation;
					}

					int var8 = var2.readBits(1);
					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(6);
						if (var10 > 31) {
							var10 -= 64;
						}
					}

					var7.definition = AsyncHttpResponse.getNpcDefinition(var2.readBits(14));
					int var13 = var2.readBits(1);
					if (var13 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					class151.method3976(var7);
					if (var7.field1069 == 0) {
						var7.rotation = 0;
					}

					var7.method2860(var9 + SceneTilePaint.field3136, var10 + GraphicsObject.field645, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}
}
