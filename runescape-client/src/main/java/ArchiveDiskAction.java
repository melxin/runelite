import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1235301905
	)
	@Export("type")
	int type;
	@ObfuscatedName("at")
	@Export("data")
	byte[] data;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltd;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	@Export("archive")
	Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;I)[Lxc;",
		garbageValue = "1542216846"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!Friend.method10009(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class313.method6975();
			}

			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltl;Ltl;B)V",
		garbageValue = "-29"
	)
	public static void method8324(DynamicArray var0, DynamicArray var1) {
		if (var0 != null && var0.method10433() > 1) {
			PacketBufferNode.method7052(var0, (class572)null, true);
			if (var1 != null) {
				PacketBufferNode.method7052(var1, (class572)null, true);
			}

			int var2 = var0.method10433();
			if (var1 != null && var1.method10433() < var2) {
				throw new RuntimeException();
			} else {
				if (var0.field5571 == class572.field5879) {
					if (var1 == null) {
						class548.method10752(var0.method10430(), class518.field5578, 0, var2 - 1);
					} else if (class572.field5879 == var1.field5571) {
						class548.method10752(var0.method10430(), var1.method10430(), 0, var2 - 1);
					} else if (class572.field5878 == var1.field5571) {
						class85.method2918(var0.method10430(), var1.method10431(), 0, var2 - 1);
					} else {
						GameBuild.method8194(var0.method10430(), var1.method10428(), 0, var2 - 1);
					}
				} else if (var0.field5571 == class572.field5878) {
					if (var1 == null) {
						Arrays.sort(var0.method10431(), 0, var2);
					} else if (class572.field5879 == var1.field5571) {
						class268.method6067(var0.method10431(), var1.method10430(), 0, var2 - 1);
					} else if (class572.field5878 == var1.field5571) {
						AsyncHttpResponse.method259(var0.method10431(), var1.method10431(), 0, var2 - 1);
					} else {
						FloatProjection.method5415(var0.method10431(), var1.method10428(), 0, var2 - 1);
					}
				} else {
					if (var0.field5571 != class572.field5877) {
						throw new RuntimeException();
					}

					if (var1 == null) {
						Arrays.sort(var0.method10428(), 0, var2);
					} else if (class572.field5879 == var1.field5571) {
						class27.quicksortStringsWithCorrespondingIntegers((String[])((String[])var0.method10428()), var1.method10430(), 0, var2 - 1);
					} else if (class572.field5878 == var1.field5571) {
						class166.method4090((String[])((String[])var0.method10428()), var1.method10431(), 0, var2 - 1);
					} else {
						WorldMapEvent.method6974((String[])((String[])var0.method10428()), var1.method10428(), 0, var2 - 1);
					}
				}

			}
		}
	}
}
