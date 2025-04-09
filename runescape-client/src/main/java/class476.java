import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
class class476 implements Comparator {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lsc;"
	)
	final class477 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lsc;)V"
	)
	class476(class477 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsj;Lsj;B)I",
		garbageValue = "93"
	)
	int method9073(class478 var1, class478 var2) {
		if (var1.field5104 > var2.field5104) {
			return 1;
		} else {
			return var1.field5104 < var2.field5104 ? -1 : 0;
		}
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method9073((class478)var1, (class478)var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class33.World_request == null) {
				class33.World_request = ParamComposition.urlRequester.request(new URL(class59.field405));
			} else if (class33.World_request.isDone()) {
				byte[] var0 = class33.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class171.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class33.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class33.World_request = null;
		}

		return false;
	}
}
