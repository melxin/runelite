import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class162 extends class148 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1145051343
	)
	int field1821;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class162(class151 var1) {
		this.this$0 = var1;
		this.field1821 = -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		this.field1821 = var1.readUnsignedShort();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3565(this.field1821);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-1253146871"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldb;",
		garbageValue = "1068792685"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapRenderer.method6198(var1, var0);
		Script var4 = class421.getScript(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = class421.getScript(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				var3 = RouteStrategy.method5754(var0);
				var4 = class421.getScript(var3, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1406486016"
	)
	static final void method3657() {
		for (PendingSpawn var0 = (PendingSpawn)class509.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class509.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class157.method3545(class509.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
