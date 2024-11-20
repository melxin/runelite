import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = 1683852811
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1111201649
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1653262049
	)
	@Export("size")
	int size;
	@ObfuscatedName("at")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ae")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ao")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ac")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aj")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("av")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1296580033"
	)
	public static void method684() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
