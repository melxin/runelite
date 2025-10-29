import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gx")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ae")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("aj")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -948416005
	)
	public int field1936;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -991105343
	)
	public int field1937;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 991060355
	)
	public int field1942;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1539341951
	)
	public int field1939;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2134415799
	)
	public int field1940;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	public Model field1932;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1936 = -1;
		this.field1937 = -1;
		this.field1942 = -1;
		this.field1939 = -1;
		ItemComposition var2 = class150.ItemDefinition_get(var1);
		if (var2.method4843()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4844()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1940 = var2.model;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "533098139"
	)
	public boolean method4243() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-47"
	)
	public boolean method4244() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method4245(int var1) {
		return var1 == 0 && this.field1936 != -1 || var1 == 1 && this.field1937 != -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-257688697"
	)
	boolean method4254(int var1) {
		return var1 == 0 && this.field1942 != -1 || var1 == 1 && this.field1939 != -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1395261477"
	)
	int method4259(int var1) {
		return var1 == 0 ? this.field1936 : this.field1937;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "506682232"
	)
	int method4248(int var1) {
		return var1 == 0 ? this.field1942 : this.field1939;
	}
}
