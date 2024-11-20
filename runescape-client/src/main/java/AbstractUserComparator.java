import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("aw")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "389432720"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;B)I",
		garbageValue = "32"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
