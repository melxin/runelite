import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("Sound")
public class Sound extends class151 {
	@ObfuscatedName("af")
	boolean field1819;
	@ObfuscatedName("aw")
	byte field1820;
	@ObfuscatedName("at")
	byte field1823;
	@ObfuscatedName("ac")
	byte field1821;
	@ObfuscatedName("ap")
	byte field1822;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class154 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	Sound(class154 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-2943315"
	)
	void vmethod4111(Buffer var1) {
		this.field1819 = var1.readUnsignedByte() == 1;
		this.field1820 = var1.readByte();
		this.field1823 = var1.readByte();
		this.field1821 = var1.readByte();
		this.field1822 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgs;I)V",
		garbageValue = "2108880901"
	)
	void vmethod4112(ClanSettings var1) {
		var1.allowGuests = this.field1819;
		var1.field1850 = this.field1820;
		var1.field1846 = this.field1823;
		var1.field1852 = this.field1821;
		var1.field1853 = this.field1822;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILwb;B)Lgq;",
		garbageValue = "-98"
	)
	public static PlayerCompositionColorTextureOverride method3879(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		boolean var5 = (var2 & 4) != 0;
		boolean var6 = (var2 & 8) != 0;
		PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
		int var8;
		int[] var9;
		boolean var10;
		int var11;
		short var12;
		if (var3) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRecolorTo != null && var9.length == var7.playerCompositionRecolorTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRecolorTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var4) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRetextureTo != null && var9.length == var7.playerCompositionRetextureTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRetextureTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var5) {
			var7.field1950 = var1.readUnsignedShort();
			var7.field1951 = var1.readUnsignedShort();
		}

		if (var6) {
			var7.field1944 = var1.readUnsignedShort();
			var7.field1952 = var1.readUnsignedShort();
		}

		return var7;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lil;",
		garbageValue = "631872554"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lti;I)I",
		garbageValue = "-2111630728"
	)
	public static int method3884(DynamicArray var0) {
		ItemLayer.method4826(var0, (class574)null, false);
		byte var1 = 0;
		int var2 = var0.method10322();
		int var3 = -1;
		int var8;
		if (var0.field5504 == class574.field5820) {
			int[] var4 = var0.method10318();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] > var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5504 == class574.field5816) {
			long[] var9 = var0.method10320();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] > var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5504 == class574.field5824) {
			String var10 = null;
			Object[] var5 = var0.method10321();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) > 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-6162"
	)
	static final int method3883() {
		return Client.menu.menuOptionsCount - 1;
	}
}
