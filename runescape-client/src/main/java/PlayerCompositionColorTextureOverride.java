import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("gl")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	static WorldView field3434;
	@ObfuscatedName("al")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ac")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1173085653
	)
	public int field1881;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 350215871
	)
	public int field1882;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1266681117
	)
	public int field1880;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1995365423
	)
	public int field1884;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -479740965
	)
	public int field1885;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	public Model field1886;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1881 = -1;
		this.field1882 = -1;
		this.field1880 = -1;
		this.field1884 = -1;
		ItemComposition var2 = SceneTilePaint.ItemDefinition_get(var1);
		if (var2.method4465()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4487()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1885 = var2.model;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	public boolean method3919() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1251576803"
	)
	public boolean method3921() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-897570821"
	)
	boolean method3922(int var1) {
		return var1 == 0 && this.field1881 != -1 || var1 == 1 && this.field1882 != -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2139345355"
	)
	boolean method3923(int var1) {
		return var1 == 0 && this.field1880 != -1 || var1 == 1 && this.field1884 != -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "116"
	)
	int method3924(int var1) {
		return var1 == 0 ? this.field1881 : this.field1882;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1722946087"
	)
	int method3925(int var1) {
		return var1 == 0 ? this.field1880 : this.field1884;
	}
}
