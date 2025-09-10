import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ud")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("af")
	final int field5531;
	@ObfuscatedName("aw")
	final int field5523;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5525;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5526;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5527;
	@ObfuscatedName("aq")
	public final int[][] field5535;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 324299373
	)
	public int field5529;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1724985141
	)
	public int field5539;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -440791843
	)
	public int field5524;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2118646131
	)
	public int field5532;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1505165225
	)
	public int field5528;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1844367507
	)
	public int field5534;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1974990425
	)
	public int field5533;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -638080505
	)
	public int field5536;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -171607197
	)
	public int field5537;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1089927479
	)
	public int field5538;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1800979629
	)
	public int field5530;

	public GraphicsDefaults() {
		this.field5531 = 1;
		this.field5523 = 2;
		this.field5525 = 1;
		this.field5526 = 1;
		this.field5527 = 1;
		this.field5535 = new int[3][5];
		this.field5529 = -1;
		this.field5539 = -1;
		this.field5524 = -1;
		this.field5532 = -1;
		this.field5528 = -1;
		this.field5534 = -1;
		this.field5533 = -1;
		this.field5536 = -1;
		this.field5537 = -1;
		this.field5538 = -1;
		this.field5530 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "1719806131"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5522.group);
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
					this.field5529 = var3.readVarInt();
					this.field5539 = var3.readVarInt();
					this.field5524 = var3.readVarInt();
					this.field5532 = var3.readVarInt();
					this.field5528 = var3.readVarInt();
					this.field5534 = var3.readVarInt();
					this.field5533 = var3.readVarInt();
					this.field5536 = var3.readVarInt();
					this.field5537 = var3.readVarInt();
					this.field5538 = var3.readVarInt();
					this.field5530 = var3.readVarInt();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5535.length; ++var5) {
						for (int var6 = 0; var6 < this.field5535[var5].length; ++var6) {
							this.field5535[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}
}
