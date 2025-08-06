import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kd")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("al")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ab")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ac")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IIB)I",
		garbageValue = "1"
	)
	static int method5911(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZB)I",
		garbageValue = "69"
	)
	static int method5915(int var0, Script var1, boolean var2) {
		Widget var3 = class167.widgetDefinition.method7456(Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.height * -1326764757;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-373538859"
	)
	static final void method5914(int var0, int var1, int var2) {
		if (Language.cameraX < var0) {
			Language.cameraX = (var0 - Language.cameraX) * UserComparator8.field1544 / 1000 + Language.cameraX + WorldMapData_0.field3211;
			if (Language.cameraX > var0) {
				Language.cameraX = var0;
			}
		}

		if (Language.cameraX > var0) {
			Language.cameraX -= (Language.cameraX - var0) * UserComparator8.field1544 / 1000 + WorldMapData_0.field3211;
			if (Language.cameraX < var0) {
				Language.cameraX = var0;
			}
		}

		if (WorldMapCacheName.cameraY < var1) {
			WorldMapCacheName.cameraY = (var1 - WorldMapCacheName.cameraY) * UserComparator8.field1544 / 1000 + WorldMapCacheName.cameraY + WorldMapData_0.field3211;
			if (WorldMapCacheName.cameraY > var1) {
				WorldMapCacheName.cameraY = var1;
			}
		}

		if (WorldMapCacheName.cameraY > var1) {
			WorldMapCacheName.cameraY -= (WorldMapCacheName.cameraY - var1) * UserComparator8.field1544 / 1000 + WorldMapData_0.field3211;
			if (WorldMapCacheName.cameraY < var1) {
				WorldMapCacheName.cameraY = var1;
			}
		}

		if (class66.cameraZ < var2) {
			class66.cameraZ = (var2 - class66.cameraZ) * UserComparator8.field1544 / 1000 + class66.cameraZ + WorldMapData_0.field3211;
			if (class66.cameraZ > var2) {
				class66.cameraZ = var2;
			}
		}

		if (class66.cameraZ > var2) {
			class66.cameraZ -= (class66.cameraZ - var2) * UserComparator8.field1544 / 1000 + WorldMapData_0.field3211;
			if (class66.cameraZ < var2) {
				class66.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Ltz;ZB)V",
		garbageValue = "59"
	)
	static void method5908(WorldView var0, WorldEntity var1, boolean var2) {
		boolean var3 = var1.field5320.field2178 && !var2;
		long var4 = Skills.calculateTag(var1.getX(), Coord.method7394(var1.getY()), Coord.method7394(var1.getPlane()), 4, var3, var1.plane, var0.id);
		var1.worldEntityCoord.setZ(class477.method9725(var0, var1.getY(), var1.getPlane(), var0.plane));
		var1.worldView.scene.cycle = Client.cycle;
		var1.initScenePlane(var2);
		boolean var6 = var0.scene.drawEntity(var0.plane, var1.getY(), var1.getPlane(), var1.getZ(), 60, var1.worldView.scene, var1.method10098(), var4, false);
		if (var6 && !var2) {
			WorldView var7 = var1.worldView;
			if (Client.renderSelf) {
				InvDefinition.addPlayerToScene(var7, Client.localPlayerIndex, false);
			}

			Archive.method8323(var1.worldView);
			AbstractArchive.addNpcsToScene(var1.worldView, true);
			WorldView var8 = var1.worldView;
			int var9 = Client.playerUpdateManager.playerCount;
			int[] var10 = Client.playerUpdateManager.playerIndices;

			for (int var11 = 0; var11 < var9; ++var11) {
				if (var10[var11] != Client.combatTargetPlayerIndex && var10[var11] != Client.localPlayerIndex) {
					InvDefinition.addPlayerToScene(var8, var10[var11], true);
				}
			}

			AbstractArchive.addNpcsToScene(var1.worldView, false);
			class322.method7010(var1.worldView);
		}

	}
}
