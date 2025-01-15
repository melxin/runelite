import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class107 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1735207919
	)
	int field1375;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1917571321
	)
	int field1373;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2071388707
	)
	int field1372;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 670825549
	)
	int field1374;

	class107(int var1, int var2, int var3, int var4) {
		this.field1375 = var1;
		this.field1373 = var2;
		this.field1372 = var3;
		this.field1374 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2142215513"
	)
	int method3090() {
		return this.field1375;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	int method3081() {
		return this.field1373;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-34"
	)
	int method3082() {
		return this.field1372;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "27"
	)
	int method3083() {
		return this.field1374;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1573434342"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		Client.logOut();
		switch(var0) {
		case 1:
			class28.method460();
			break;
		case 2:
			Varcs.method3212(24);
			class150.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
