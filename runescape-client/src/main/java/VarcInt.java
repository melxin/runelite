import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("VarcInt_archive")
	public static AbstractArchive VarcInt_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("VarcInt_cached")
	public static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ag")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	public VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1020246739"
	)
	public void method4255(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4256(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "-4"
	)
	void method4256(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lok;Lok;ZI)V",
		garbageValue = "-1264945129"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * -171267385;
		class391.resizeInterface(var0, var1.field4228, var1.field4195, var1.id, var1.childIndex * -2066937045, var3, var4, var2);
		if (var1.children != null) {
			class391.resizeInterface(var1.children, 0, var1.children.length - 1, var1.id, -1, var3, var4, var2);
		}

		if (var1.childIndex * -2066937045 == -1) {
			InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
			if (var5 != null) {
				AsyncRestClient.method175(var5.group, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
