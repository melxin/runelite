import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("al")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	final Buffer field21;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class3 field19;
	@ObfuscatedName("at")
	ExecutorService field24;
	@ObfuscatedName("ac")
	Future field22;

	@ObfuscatedSignature(
		descriptor = "(Lwb;Lac;)V"
	)
	public SpriteBufferProperties(Buffer var1, class3 var2) {
		this.field24 = Executors.newSingleThreadExecutor();
		this.field21 = var1;
		this.field19 = var2;
		this.method44();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-1"
	)
	public boolean method43() {
		return this.field22.isDone();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "381"
	)
	public void method52() {
		this.field24.shutdown();
		this.field24 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lwb;",
		garbageValue = "-1239446823"
	)
	public Buffer method54() {
		try {
			return (Buffer)this.field22.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "14689"
	)
	void method44() {
		this.field22 = this.field24.submit(new class1(this, this.field21, this.field19));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-249506631"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
