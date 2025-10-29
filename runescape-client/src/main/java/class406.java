import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public enum class406 implements Enum {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4903(0, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4905(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4904(2, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4907(3, 3),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	field4908 = field4904;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1100652897
	)
	final int field4906;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 523319105
	)
	final int field4902;

	class406(int var3, int var4) {
		this.field4906 = var3;
		this.field4902 = var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4902;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;Lql;B)Lql;",
		garbageValue = "-69"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class161.method4040(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "112"
	)
	static final boolean method8492(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class189.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class575.field5903;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class575.field5905;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1588402824"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (Huffman.World_request == null) {
				Huffman.World_request = class164.urlRequester.request(new URL(WorldMapEvent.field3547));
			} else if (Huffman.World_request.isDone()) {
				byte[] var0 = Huffman.World_request.getResponse();
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

				class154.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				Huffman.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			Huffman.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method8489(int var0, int var1, int var2, int var3) {
		Widget var4 = class226.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class141.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		Skills.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		DesktopPlatformInfoProvider.selectedSpellFlags = var2;
		class376.invalidateWidget(var4);
	}
}
