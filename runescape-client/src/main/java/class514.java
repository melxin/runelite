import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public class class514 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static final class514 field5546;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	public static final class514 field5547;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static final class514 field5544;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static final class514 field5545;
	@ObfuscatedName("le")
	@ObfuscatedGetter(
		intValue = -159980405
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -35221491
	)
	final int field5552;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1364783901
	)
	final int field5548;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -447841711
	)
	final int field5549;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 17067783
	)
	final int field5543;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -449489329
	)
	final int field5551;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1413977695
	)
	final int field5550;

	static {
		field5546 = new class514(0, 0, 0, 0, 0, 0);
		field5547 = new class514(1, 1, 507, 507, 507, 507);
		field5544 = new class514(2, 2, 338, 338, 338, 507);
		field5545 = new class514(3, 3, 499, 499, 499, 507);
	}

	class514(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field5552 = var1;
		this.field5550 = var2;
		this.field5548 = var3;
		this.field5549 = var4;
		this.field5543 = var5;
		this.field5551 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5550;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZZZI)Z",
		garbageValue = "1791369301"
	)
	boolean method10389(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 1 : 0);
		var6 |= var2 ? 8 : 32;
		var6 |= var4 ? 128 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IZZZB)Z",
		garbageValue = "27"
	)
	boolean method10400(int var1, boolean var2, boolean var3, boolean var4) {
		byte var5 = 0;
		int var6 = var5 | (var3 ? 2 : 0);
		var6 |= var2 ? 16 : 64;
		var6 |= var4 ? 256 : 0;
		return (var1 & var6) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "-1439520740"
	)
	public boolean method10391(boolean var1, boolean var2, boolean var3) {
		return this.method10389(this.field5548, var1, var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-10"
	)
	public boolean method10392(boolean var1, boolean var2, boolean var3) {
		return this.method10389(this.field5549, var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1138677219"
	)
	public boolean method10393(boolean var1, boolean var2, boolean var3) {
		return this.method10389(this.field5543, var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "1509767891"
	)
	public boolean method10414(boolean var1, boolean var2, boolean var3) {
		return this.method10389(this.field5551, var1, var2, var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZZZI)Z",
		garbageValue = "2071512717"
	)
	public boolean method10413(boolean var1, boolean var2, boolean var3) {
		return this.method10400(this.field5548, var1, var2, var3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "21"
	)
	public boolean method10396(boolean var1, boolean var2, boolean var3) {
		return this.method10400(this.field5549, var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZZZB)Z",
		garbageValue = "-11"
	)
	public boolean method10397(boolean var1, boolean var2, boolean var3) {
		return this.method10400(this.field5543, var1, var2, var3);
	}
}
