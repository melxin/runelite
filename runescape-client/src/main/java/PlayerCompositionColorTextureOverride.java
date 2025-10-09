import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = 1616809093
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ah")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("af")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2477213
	)
	public int field1946;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1719168563
	)
	public int field1945;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1638469209
	)
	public int field1948;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1342559047
	)
	public int field1949;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 172449657
	)
	public int field1950;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	public Model field1942;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1946 = -1;
		this.field1945 = -1;
		this.field1948 = -1;
		this.field1949 = -1;
		ItemComposition var2 = WorldMapIcon_1.ItemDefinition_get(var1);
		if (var2.method4741()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4789()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1950 = var2.model;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1811842349"
	)
	public boolean method4169() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1986115917"
	)
	public boolean method4170() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method4176(int var1) {
		return var1 == 0 && this.field1946 != -1 || var1 == 1 && this.field1945 != -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-13"
	)
	boolean method4168(int var1) {
		return var1 == 0 && this.field1948 != -1 || var1 == 1 && this.field1949 != -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "942772025"
	)
	int method4177(int var1) {
		return var1 == 0 ? this.field1946 : this.field1945;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1390174060"
	)
	int method4173(int var1) {
		return var1 == 0 ? this.field1948 : this.field1949;
	}
}
