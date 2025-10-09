import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -469250073
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2073350929
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2059830927
	)
	@Export("size")
	int size;
	@ObfuscatedName("ag")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("aj")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ah")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("af")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ae")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aq")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-832400261"
	)
	static int method737(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
