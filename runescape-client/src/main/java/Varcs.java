import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("az")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ao")
	@Export("map")
	Map map;
	@ObfuscatedName("ad")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 6896705008618298895L
	)
	long field1437;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class268.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			VarcInt var4 = (VarcInt)VarcInt.VarcInt_cached.get((long)var2);
			VarcInt var3;
			if (var4 != null) {
				var3 = var4;
			} else {
				byte[] var5 = VarcInt.VarcInt_archive.takeFile(19, var2);
				var4 = new VarcInt();
				if (var5 != null) {
					var4.method5201(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		this.read();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "115"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1055164733"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-260194423"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-811823227"
	)
	@Export("clearTransient")
	void clearTransient() {
		for (int var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)Luv;",
		garbageValue = "568662494"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class31.getPreferencesFile("2", StructComposition.field2749.name, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1683180538"
	)
	@Export("write")
	void write() {
		AccessFile var1 = this.getPreferencesFile(true);

		try {
			int var2 = 3;
			int var3 = 0;
			Iterator var4 = this.map.entrySet().iterator();

			while (var4.hasNext()) {
				Entry var5 = (Entry)var4.next();
				int var6 = (Integer)var5.getKey();
				if (this.intsPersistence[var6]) {
					Object var7 = var5.getValue();
					var2 += 3;
					if (var7 instanceof Integer) {
						var2 += 4;
					} else if (var7 instanceof String) {
						var2 += MouseRecorder.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var23 = new Buffer(var2);
			var23.writeByte(2);
			var23.writeShort(var3);
			Iterator var24 = this.map.entrySet().iterator();

			while (var24.hasNext()) {
				Entry var12 = (Entry)var24.next();
				int var13 = (Integer)var12.getKey();
				if (this.intsPersistence[var13]) {
					var23.writeShort(var13);
					Object var8 = var12.getValue();
					class544 var9 = class544.method10119(var8.getClass());
					var23.writeByte(var9.field5391);
					class544.method10136(var8, var23);
				}
			}

			var1.write(var23.array, 0, var23.offset);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1437 = ReflectionCheck.method724();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1663080803"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label245: {
			try {
				byte[] var2 = new byte[(int)var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var14 = new Buffer(var2);
				if (var14.array.length - var14.offset < 1) {
					return;
				}

				int var15 = var14.readUnsignedByte();
				if (var15 >= 0 && var15 <= 2) {
					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label245;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class544 var10 = (class544)StructComposition.findEnumerated(class544.method10125(), var9);
							Object var11 = var10.method10123(var14);
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var11);
							}

							++var7;
						}
					} else {
						var16 = var14.readUnsignedShort();

						for (var7 = 0; var7 < var16; ++var7) {
							var8 = var14.readUnsignedShort();
							var9 = var14.readInt();
							if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
								this.map.put(var8, var9);
							}
						}

						var7 = var14.readUnsignedShort();
						var8 = 0;

						while (true) {
							if (var8 >= var7) {
								break label245;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label245;
			} finally {
				try {
					var1.close();
				} catch (Exception var24) {
				}

			}

			return;
		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "364521518"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1437 < ReflectionCheck.method724() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	static void method3212(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIIIII[Ljava/lang/String;III)V",
		garbageValue = "-51087148"
	)
	static void method3211(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, String[] var9, int var10, int var11) {
		NodeDeque var12 = var0.pendingSpawns;
		PendingSpawn var13 = null;

		for (PendingSpawn var14 = (PendingSpawn)var12.last(); var14 != null; var14 = (PendingSpawn)var12.previous()) {
			if (var14.plane == var1 && var2 == var14.x && var3 == var14.y && var4 == var14.type) {
				var13 = var14;
				break;
			}
		}

		if (var13 == null) {
			var13 = new PendingSpawn();
			var13.plane = var1;
			var13.type = var4;
			var13.x = var2;
			var13.y = var3;
			var13.field1189 = -1;
			ObjectComposition.method5557(var0, var13);
			var12.addFirst(var13);
		}

		var13.field1192 = var5;
		var13.field1194 = var6;
		var13.field1185 = var7;
		var13.delay = var10;
		var13.hitpoints = var11;
		var13.method2754(var8);
		var13.method2757(var9);
	}
}
