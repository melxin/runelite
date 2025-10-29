import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("av")
	final int field5619;
	@ObfuscatedName("at")
	final int field5610;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5611;
	@ObfuscatedName("an")
	final int field5616;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5618;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5612;
	@ObfuscatedName("ak")
	public final int[][] field5615;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -913113921
	)
	public int field5614;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2103662955
	)
	public int field5617;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -907069361
	)
	public int field5609;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1155561851
	)
	public int field5620;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1998660545
	)
	public int field5628;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -970907119
	)
	public int field5621;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1341684087
	)
	public int field5622;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -838050011
	)
	public int field5623;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1895564125
	)
	public int field5624;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1497782373
	)
	public int field5625;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 564143983
	)
	public int field5626;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1962490815
	)
	public int field5627;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 496146203
	)
	public int field5613;

	public GraphicsDefaults() {
		this.field5619 = 1;
		this.field5610 = 2;
		this.field5611 = 1;
		this.field5616 = 4;
		this.field5618 = 1;
		this.field5612 = 1;
		this.field5615 = new int[3][5];
		this.field5614 = -1;
		this.field5617 = -1;
		this.field5609 = -1;
		this.field5620 = -1;
		this.field5628 = -1;
		this.field5621 = -1;
		this.field5622 = -1;
		this.field5623 = -1;
		this.field5624 = -1;
		this.field5625 = -1;
		this.field5626 = -1;
		this.field5627 = -1;
		this.field5613 = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqm;B)V",
		garbageValue = "0"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5605.group);
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
					this.field5614 = var3.readNullableLargeSmart();
					this.field5617 = var3.readNullableLargeSmart();
					this.field5609 = var3.readNullableLargeSmart();
					this.field5620 = var3.readNullableLargeSmart();
					this.field5628 = var3.readNullableLargeSmart();
					this.field5621 = var3.readNullableLargeSmart();
					this.field5622 = var3.readNullableLargeSmart();
					this.field5623 = var3.readNullableLargeSmart();
					this.field5624 = var3.readNullableLargeSmart();
					this.field5625 = var3.readNullableLargeSmart();
					this.field5626 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5615.length; ++var5) {
						for (int var6 = 0; var6 < this.field5615[var5].length; ++var6) {
							this.field5615[var5][var6] = var3.readMedium();
						}
					}
					break;
				case 4:
					this.field5627 = var3.readNullableLargeSmart();
					this.field5613 = var3.readNullableLargeSmart();
				}
			}
		}
	}
}
