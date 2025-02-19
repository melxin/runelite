import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 7989917339610278775L
	)
	long field4604;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -6935304082437014645L
	)
	long field4599;
	@ObfuscatedName("au")
	public boolean field4600;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = -5153540442769448995L
	)
	long field4601;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -3992193137707866651L
	)
	long field4606;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8564107248365794285L
	)
	long field4603;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1923135181
	)
	int field4602;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -712332113
	)
	int field4605;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -347387541
	)
	int field4607;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 976925115
	)
	int field4598;

	public Timer() {
		this.field4604 = -1L;
		this.field4599 = -1L;
		this.field4600 = false;
		this.field4601 = 0L;
		this.field4606 = 0L;
		this.field4603 = 0L;
		this.field4602 = 0;
		this.field4605 = 0;
		this.field4607 = 0;
		this.field4598 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	public void method7544() {
		this.field4604 = InterfaceParent.method2434();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "90"
	)
	public void method7545() {
		if (-1L != this.field4604) {
			this.field4606 = InterfaceParent.method2434() - this.field4604;
			this.field4604 = -1L;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-69"
	)
	public void method7546(int var1) {
		this.field4599 = InterfaceParent.method2434();
		this.field4602 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2044944855"
	)
	public void method7547() {
		if (-1L != this.field4599) {
			this.field4601 = InterfaceParent.method2434() - this.field4599;
			this.field4599 = -1L;
		}

		++this.field4607;
		this.field4600 = true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-174407209"
	)
	public void method7549() {
		this.field4600 = false;
		this.field4605 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2035907827"
	)
	public void method7554() {
		this.method7547();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-10"
	)
	@Export("write")
	public void write(Buffer var1) {
		MusicPatchNode.method6832(var1, this.field4606);
		MusicPatchNode.method6832(var1, this.field4601);
		MusicPatchNode.method6832(var1, this.field4603);
		var1.writeShort(this.field4602);
		var1.writeShort(this.field4605);
		var1.writeShort(this.field4607);
		var1.writeShort(this.field4598);
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvp;",
		garbageValue = "-115"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AsyncHttpResponse.field76, class72.method2202(var0), DbTable.method10109(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
