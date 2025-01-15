import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class163 extends class166 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1594708939
	)
	int field1772;
	@ObfuscatedName("ah")
	byte field1769;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 789016747
	)
	int field1770;
	@ObfuscatedName("ao")
	String field1771;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	class163(class167 var1) {
		this.this$0 = var1;
		this.field1772 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	void vmethod3869(Buffer var1) {
		var1.readUnsignedByte();
		this.field1772 = var1.readUnsignedShort();
		this.field1769 = var1.readByte();
		this.field1770 = var1.readUnsignedShort();
		var1.readLong();
		this.field1771 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	void vmethod3870(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1772);
		var2.rank = this.field1769;
		var2.world = this.field1770;
		var2.username = new Username(this.field1771);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-1302635542"
	)
	public static void method3778(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class580.ByteArrayPool_alternativeSizes = var0;
			KitDefinition.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class225.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class580.ByteArrayPool_alternativeSizes.length; ++var2) {
				class225.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4887.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4887);
		} else {
			class580.ByteArrayPool_alternativeSizes = null;
			KitDefinition.ByteArrayPool_altSizeArrayCounts = null;
			class225.ByteArrayPool_arrays = null;
			ByteArrayPool.field4887.clear();
			ByteArrayPool.field4887.add(100);
			ByteArrayPool.field4887.add(5000);
			ByteArrayPool.field4887.add(10000);
			ByteArrayPool.field4887.add(30000);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "1669839859"
	)
	static boolean method3775(String var0, int var1) {
		return class440.method8813(var0, var1, "openjs");
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Z",
		garbageValue = "-812239853"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
