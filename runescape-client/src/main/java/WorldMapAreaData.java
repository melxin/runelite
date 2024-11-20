import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("ar")
	HashSet field3273;
	@ObfuscatedName("as")
	HashSet field3275;
	@ObfuscatedName("az")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(Lvj;Lvj;IZI)V",
		garbageValue = "-1768177788"
	)
	void method6326(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.method5839(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.field3273 = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field3273.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.field3275 = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field3275.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lvj;ZI)V",
		garbageValue = "1806818645"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)Ljava/lang/Object;",
		garbageValue = "76"
	)
	static Object method6331(class544 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5394) {
			case 0:
				return Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			case 2:
				return Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "62"
	)
	static int method6330() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field549;
		} else {
			return 10000;
		}
	}
}
