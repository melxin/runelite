import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = 1305607053
	)
	static int field5219;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -182201495
	)
	public int field5234;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -410844835
	)
	public int field5220;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -355247007
	)
	public int field5222;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -671759667
	)
	public int field5225;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1194135079
	)
	public int field5227;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -695042427
	)
	public int field5224;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -673726825
	)
	public int field5221;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -251757639
	)
	public int field5226;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2085990093
	)
	public int field5236;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 456718737
	)
	public int field5228;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -347045221
	)
	public int field5229;
	@ObfuscatedName("ax")
	final int field5230;
	@ObfuscatedName("ai")
	final int field5231;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5232;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5233;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5223;
	@ObfuscatedName("ar")
	public final int[][] field5235;

	public GraphicsDefaults() {
		this.field5234 = -1;
		this.field5220 = -1;
		this.field5222 = -1;
		this.field5225 = -1;
		this.field5227 = -1;
		this.field5224 = -1;
		this.field5221 = -1;
		this.field5226 = -1;
		this.field5236 = -1;
		this.field5228 = -1;
		this.field5229 = -1;
		this.field5230 = 1;
		this.field5231 = 2;
		this.field5232 = 1;
		this.field5233 = 1;
		this.field5223 = 1;
		this.field5235 = new int[3][5];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "2007066642"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5217.group);
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
					this.field5234 = var3.readNullableLargeSmart();
					this.field5220 = var3.readNullableLargeSmart();
					this.field5222 = var3.readNullableLargeSmart();
					this.field5225 = var3.readNullableLargeSmart();
					this.field5227 = var3.readNullableLargeSmart();
					this.field5224 = var3.readNullableLargeSmart();
					this.field5221 = var3.readNullableLargeSmart();
					this.field5226 = var3.readNullableLargeSmart();
					this.field5236 = var3.readNullableLargeSmart();
					this.field5228 = var3.readNullableLargeSmart();
					this.field5229 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5235.length; ++var5) {
						for (int var6 = 0; var6 < this.field5235[var5].length; ++var6) {
							this.field5235[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}
}
