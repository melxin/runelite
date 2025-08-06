import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vd")
class class563 implements Iterator {
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1128794345
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 87997625
	)
	int field5699;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	final class564 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	class563(class564 var1) {
		this.this$0 = var1;
	}

	public Object next() {
		int var1 = ++this.field5699 - 1;
		class523 var2 = (class523)this.this$0.field5704.get((long)var1);
		return var2 != null ? var2 : this.this$0.method11019(var1);
	}

	public boolean hasNext() {
		return this.field5699 < this.this$0.method10490();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lbg;",
		garbageValue = "-9"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class86.getNextWorldListWorld();
	}
}
