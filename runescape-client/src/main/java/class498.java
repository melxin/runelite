import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class498 extends class497 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -951086109
	)
	static final int field5226;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5225;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	final WorldEntityCoord field5224;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -795039625
	)
	int field5232;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1909085059
	)
	int field5228;

	static {
		field5226 = Client.revision + 3;
	}

	class498() {
		this.field5225 = new WorldEntityCoord();
		this.field5224 = new WorldEntityCoord();
		this.field5232 = 0;
		this.field5228 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lks;Lta;IB)V",
		garbageValue = "-111"
	)
	void vmethod9786(WorldEntityCoord var1, class496 var2, int var3) {
		this.field5225.method6070(var1);
		this.field5224.method6070(var2.field5222);
		this.field5232 = var3 - 1;
		this.field5228 = var2.field5220 + field5226;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lks;III)Z",
		garbageValue = "1653046752"
	)
	boolean vmethod9791(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5232 >= this.field5228) {
			var1.method6070(this.field5224);
			return true;
		} else {
			int var5 = this.field5232;
			int var6 = this.field5228;
			float var4 = (float)(var2 - var5) / (float)(var6 - var5);
			class173.method3918(this.field5225, this.field5224, var4, var1);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-112"
	)
	void vmethod9787(int var1, int var2) {
		this.field5225.setDirection(var1, var2);
		this.field5224.setDirection(var1, var2);
	}
}
