import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class154 extends class149 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1863327413
	)
	int field1776;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -734796741
	)
	int field1777;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1594262163
	)
	int field1778;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -75714889
	)
	int field1779;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class154(class152 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1324754926"
	)
	void vmethod4086(Buffer var1) {
		this.field1776 = var1.readInt();
		this.field1779 = var1.readInt();
		this.field1777 = var1.readUnsignedByte();
		this.field1778 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "1924878263"
	)
	void vmethod4088(ClanSettings var1) {
		var1.method3927(this.field1776, this.field1779, this.field1777, this.field1778);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltz;IIIIB)V",
		garbageValue = "80"
	)
	static void method3823(WorldEntity var0, int var1, int var2, int var3, int var4) {
		Iterator var5 = Client.worldViewManager.iterator();

		while (var5.hasNext()) {
			WorldView var6 = (WorldView)var5.next();

			for (ObjectSound var7 = (ObjectSound)var6.method2638().last(); var7 != null; var7 = (ObjectSound)var6.method2638().previous()) {
				var7.method2222(var0, var1, var2, var3, var4);
			}
		}

	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1521413573"
	)
	static void method3822(int var0) {
		WorldView var1 = Client.worldViewManager.getWorldView(var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < Client.playerUpdateManager.playerCount; ++var2) {
				int var3 = Client.playerUpdateManager.playerIndices[var2];
				Client.playerUpdateManager.method2807((Player)var1.players.get((long)var3));
			}

			Client.worldViewManager.method2311(var0);
		}
	}
}
