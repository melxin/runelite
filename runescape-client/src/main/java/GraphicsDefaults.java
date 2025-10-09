import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ab")
	final int field5607;
	@ObfuscatedName("at")
	final int field5592;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5591;
	@ObfuscatedName("aj")
	final int field5594;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5595;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5596;
	@ObfuscatedName("ae")
	public final int[][] field5609;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1687487991
	)
	public int field5598;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -25280287
	)
	public int field5604;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1730456703
	)
	public int field5600;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1060800149
	)
	public int field5601;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -915314967
	)
	public int field5602;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1434769579
	)
	public int field5603;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 944321913
	)
	public int field5593;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -162176479
	)
	public int field5605;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 540889057
	)
	public int field5606;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2062780163
	)
	public int field5608;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1379575525
	)
	public int field5597;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -429837049
	)
	public int field5599;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1150521927
	)
	public int field5610;

	public GraphicsDefaults() {
		this.field5607 = 1;
		this.field5592 = 2;
		this.field5591 = 1;
		this.field5594 = 4;
		this.field5595 = 1;
		this.field5596 = 1;
		this.field5609 = new int[3][5];
		this.field5598 = -1;
		this.field5604 = -1;
		this.field5600 = -1;
		this.field5601 = -1;
		this.field5602 = -1;
		this.field5603 = -1;
		this.field5593 = -1;
		this.field5605 = -1;
		this.field5606 = -1;
		this.field5608 = -1;
		this.field5597 = -1;
		this.field5599 = -1;
		this.field5610 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "14"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5587.group);
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
					this.field5598 = var3.readNullableLargeSmart();
					this.field5604 = var3.readNullableLargeSmart();
					this.field5600 = var3.readNullableLargeSmart();
					this.field5601 = var3.readNullableLargeSmart();
					this.field5602 = var3.readNullableLargeSmart();
					this.field5603 = var3.readNullableLargeSmart();
					this.field5593 = var3.readNullableLargeSmart();
					this.field5605 = var3.readNullableLargeSmart();
					this.field5606 = var3.readNullableLargeSmart();
					this.field5608 = var3.readNullableLargeSmart();
					this.field5597 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5609.length; ++var5) {
						for (int var6 = 0; var6 < this.field5609[var5].length; ++var6) {
							this.field5609[var5][var6] = var3.readMedium();
						}
					}
					break;
				case 4:
					this.field5599 = var3.readNullableLargeSmart();
					this.field5610 = var3.readNullableLargeSmart();
				}
			}
		}
	}
}
