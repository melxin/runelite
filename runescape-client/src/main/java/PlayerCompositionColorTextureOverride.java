import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("au")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("as")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1018613229
	)
	int field1922;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -251654771
	)
	int field1923;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -945320457
	)
	int field1924;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1856736553
	)
	int field1925;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1003534401
	)
	public int field1926;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	public Model field1927;

	public PlayerCompositionColorTextureOverride(int var1) {
		this.field1922 = -1;
		this.field1923 = -1;
		this.field1924 = -1;
		this.field1925 = -1;
		ItemComposition var2 = ObjectComposition.ItemDefinition_get(var1);
		if (var2.method4632()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4633()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

		this.field1926 = var2.model;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	public boolean method4095() {
		return this.playerCompositionRecolorTo != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-82"
	)
	public boolean method4114() {
		return this.playerCompositionRetextureTo != null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "51"
	)
	boolean method4094(int var1) {
		return var1 == 0 && this.field1922 != -1 || var1 == 1 && this.field1923 != -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "837034683"
	)
	boolean method4100(int var1) {
		return var1 == 0 && this.field1924 != -1 || var1 == 1 && this.field1925 != -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "317397435"
	)
	int method4099(int var1) {
		return var1 == 0 ? this.field1922 : this.field1923;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "4"
	)
	int method4096(int var1) {
		return var1 == 0 ? this.field1924 : this.field1925;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1318575728"
	)
	static void method4118() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}
}
