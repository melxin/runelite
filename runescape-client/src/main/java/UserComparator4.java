import java.util.Comparator;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;Lst;I)I",
		garbageValue = "-232025448"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lpn;",
		garbageValue = "-7744816"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class379.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, RouteStrategy.masterDisk, AsyncHttpResponse.field77, var0, var1, var2, var3, var4, false);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-127"
	)
	static void method3177() {
		if (Client.field810 != null) {
			Client.field811 = Client.cycle;
			Client.field810.method7860();
			Iterator var0 = class200.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				Client.field810.method7859((var1.x >> 7) + class200.topLevelWorldView.baseX, (var1.y >> 7) + class200.topLevelWorldView.baseY);
			}
		}

	}
}
