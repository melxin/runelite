import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ao")
	final int field5258;
	@ObfuscatedName("an")
	final int field5250;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5247;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5248;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5261;
	@ObfuscatedName("aq")
	public final int[][] field5257;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -881216073
	)
	public int field5251;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1167286517
	)
	public int field5252;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1520377445
	)
	public int field5253;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1760463217
	)
	public int field5254;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1559085581
	)
	public int field5255;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 713389655
	)
	public int field5256;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1111737643
	)
	public int field5245;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1771711323
	)
	public int field5249;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 640035483
	)
	public int field5259;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1801075787
	)
	public int field5260;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 343375737
	)
	public int field5246;

	public GraphicsDefaults() {
		this.field5258 = 1;
		this.field5250 = 2;
		this.field5247 = 1;
		this.field5248 = 1;
		this.field5261 = 1;
		this.field5257 = new int[3][5];
		this.field5251 = -1;
		this.field5252 = -1;
		this.field5253 = -1;
		this.field5254 = -1;
		this.field5255 = -1;
		this.field5256 = -1;
		this.field5245 = -1;
		this.field5249 = -1;
		this.field5259 = -1;
		this.field5260 = -1;
		this.field5246 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;I)V",
		garbageValue = "-211057514"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5243.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			while (true) {
				int var4 = var3.readUnsignedByte();
				if (var4 == 0) {
					return;
				}

				switch(var4) {
				case 1:
					var3.readMedium();
					break;
				case 2:
					this.field5251 = var3.readNullableLargeSmart();
					this.field5252 = var3.readNullableLargeSmart();
					this.field5253 = var3.readNullableLargeSmart();
					this.field5254 = var3.readNullableLargeSmart();
					this.field5255 = var3.readNullableLargeSmart();
					this.field5256 = var3.readNullableLargeSmart();
					this.field5245 = var3.readNullableLargeSmart();
					this.field5249 = var3.readNullableLargeSmart();
					this.field5259 = var3.readNullableLargeSmart();
					this.field5260 = var3.readNullableLargeSmart();
					this.field5246 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5257.length; ++var5) {
						for (int var6 = 0; var6 < this.field5257[var5].length; ++var6) {
							this.field5257[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lav;I)Laf;",
		garbageValue = "684670561"
	)
	public static class3 method9571(class6 var0) {
		switch(var0.field13) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}
}
