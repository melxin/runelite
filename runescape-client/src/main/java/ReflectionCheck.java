import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	static Archive field240;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1311560651
	)
	@Export("id")
	int id;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1586039129
	)
	@Export("size")
	int size;
	@ObfuscatedName("ac")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("av")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("au")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("as")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ah")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ap")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("al")
	static double method756(double var0, double var2, double var4) {
		double var8 = (var0 - var2) / var4;
		double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
		return var6 / var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lcf;",
		garbageValue = "-400412993"
	)
	static ClientPreferences method759() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = HttpResponse.getPreferencesFile("", class36.field227.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)Liv;",
		garbageValue = "65"
	)
	static class209 method760(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			boolean var2 = true;
			boolean var3 = false;
			boolean var4 = false;
			boolean var5 = false;
			int var6 = var0.readUnsignedShort();
			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			int var9 = var0.readUnsignedByte();
			int var10 = var0.readUnsignedByte();
			if (var6 >= 1 && var8 >= 1 && var9 >= 0 && var10 >= 0) {
				return new class209(var6, var7, var8, var9, var10);
			}
		}

		return null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "84"
	)
	static final int method757(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-291106468"
	)
	static final void method758() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();
			class322.method7011(var1);
		}

	}
}
