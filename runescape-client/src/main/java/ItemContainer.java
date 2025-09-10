import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("aw")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("at")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968910673"
	)
	static void method2113() {
		try {
			File var0 = new File(class82.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < GameBuild.field4411.length; ++var1) {
					for (var2 = 0; var2 < UserComparator2.field5981.length; ++var2) {
						File var3 = new File(UserComparator2.field5981[var2] + GameBuild.field4411[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lpw;Ljava/lang/String;B)V",
		garbageValue = "-32"
	)
	static void method2100(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field604 += var2.groupCount;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1934380272"
	)
	static final void method2120() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (Client.cycle > var0.cycleEnd) {
				var0.remove();
			} else if (Client.cycle >= var0.cycleStart) {
				var0.setDestination(Client.worldViewManager, Client.cycle, Client.graphicsCycle);
				class333.topLevelWorldView.scene.drawEntity(var0.sourceLevel, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.orientation, -1L, false);
			}
		}

	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1042235089"
	)
	static final void method2122() {
		Client.field352 = Client.cycleCntr;
		class133.field1614 = true;
	}
}
