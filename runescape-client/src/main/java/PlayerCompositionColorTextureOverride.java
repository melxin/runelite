import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field1956;
	@ObfuscatedName("ap")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("aq")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1392712751
	)
	int field1950;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1518534525
	)
	int field1951;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -179895527
	)
	int field1944;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1212660207
	)
	int field1952;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 914769109
	)
	public int field1953;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	public Model field1955;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1950 = -1;
		this.field1951 = -1;
		this.field1944 = -1;
		this.field1952 = -1;
		ItemComposition var2 = AttackOption.ItemDefinition_get(var1);
		if (var2.method4672()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4673()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1953 = var2.model;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	public boolean method4121() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-91"
	)
	public boolean method4122() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1499502467"
	)
	boolean method4123(int var1) {
		return var1 == 0 && this.field1950 != -1 || var1 == 1 && this.field1951 != -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1899550101"
	)
	boolean method4139(int var1) {
		return var1 == 0 && this.field1944 != -1 || var1 == 1 && this.field1952 != -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	int method4141(int var1) {
		return var1 == 0 ? this.field1950 : this.field1951;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "74780957"
	)
	int method4142(int var1) {
		return var1 == 0 ? this.field1944 : this.field1952;
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-43"
	)
	static void method4126(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class480.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
