import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ap")
	final int field5318;
	@ObfuscatedName("aj")
	final int field5313;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5314;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5315;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5316;
	@ObfuscatedName("ac")
	public final int[][] field5317;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 454829303
	)
	public int field5325;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1494529275
	)
	public int field5319;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1445050151
	)
	public int field5322;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1693420037
	)
	public int field5320;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1547157943
	)
	public int field5312;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -686775403
	)
	public int field5323;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1399935551
	)
	public int field5324;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -98215633
	)
	public int field5328;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -93119203
	)
	public int field5326;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1503883711
	)
	public int field5327;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -42548993
	)
	public int field5321;

	public GraphicsDefaults() {
		this.field5318 = 1;
		this.field5313 = 2;
		this.field5314 = 1;
		this.field5315 = 1;
		this.field5316 = 1;
		this.field5317 = new int[3][5];
		this.field5325 = -1;
		this.field5319 = -1;
		this.field5322 = -1;
		this.field5320 = -1;
		this.field5312 = -1;
		this.field5323 = -1;
		this.field5324 = -1;
		this.field5328 = -1;
		this.field5326 = -1;
		this.field5327 = -1;
		this.field5321 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;I)V",
		garbageValue = "784420122"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5309.group);
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
					this.field5325 = var3.readNullableLargeSmart();
					this.field5319 = var3.readNullableLargeSmart();
					this.field5322 = var3.readNullableLargeSmart();
					this.field5320 = var3.readNullableLargeSmart();
					this.field5312 = var3.readNullableLargeSmart();
					this.field5323 = var3.readNullableLargeSmart();
					this.field5324 = var3.readNullableLargeSmart();
					this.field5328 = var3.readNullableLargeSmart();
					this.field5326 = var3.readNullableLargeSmart();
					this.field5327 = var3.readNullableLargeSmart();
					this.field5321 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5317.length; ++var5) {
						for (int var6 = 0; var6 < this.field5317[var5].length; ++var6) {
							this.field5317[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}
}
