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

@ObfuscatedName("di")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field1254;
	@ObfuscatedName("an")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ai")
	@Export("map")
	Map map;
	@ObfuscatedName("al")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 6209705347131227977L
	)
	long field1253;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = MusicPatchPcmStream.archive2.getGroupFileCount(19);
		this.map = new HashMap();
		this.intsPersistence = new boolean[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			VarcInt var3 = class148.method3652(var2);
			this.intsPersistence[var2] = var3.persist;
		}

		this.read();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1330141377"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1250853369"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "436597820"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "29"
	)
	@Export("clearTransient")
	void clearTransient() {
		for (int var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvp;",
		garbageValue = "2023706791"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return HealthBarConfig.getPreferencesFile("2", FontName.field5530.name, var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
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
						var2 += FriendsChat.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var26 = new Buffer(var2);
			var26.writeByte(2);
			var26.writeShort(var3);
			Iterator var27 = this.map.entrySet().iterator();

			while (var27.hasNext()) {
				Entry var15 = (Entry)var27.next();
				int var16 = (Integer)var15.getKey();
				if (this.intsPersistence[var16]) {
					var26.writeShort(var16);
					Object var8 = var15.getValue();
					class563 var9 = class563.method10644(var8.getClass());
					var26.writeByte(var9.field5598);
					Class var11 = var8.getClass();
					class563 var12 = class563.method10644(var11);
					if (var12 == null) {
						throw new IllegalArgumentException();
					}

					class558 var10 = var12.field5599;
					var10.vmethod10652(var8, var26);
				}
			}

			var1.write(var26.array, 0, var26.offset);
		} catch (Exception var24) {
		} finally {
			try {
				var1.close();
			} catch (Exception var23) {
			}

		}

		this.unwrittenChanges = false;
		this.field1253 = class180.method3973();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label233: {
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
				if (var14.array.length - var14.offset >= 1) {
					int var15 = var14.readUnsignedByte();
					if (var15 < 0 || var15 > 2) {
						return;
					}

					int var7;
					int var8;
					int var9;
					int var16;
					if (var15 >= 2) {
						var16 = var14.readUnsignedShort();
						var7 = 0;

						while (true) {
							if (var7 >= var16) {
								break label233;
							}

							var8 = var14.readUnsignedShort();
							var9 = var14.readUnsignedByte();
							class563 var10 = (class563)class175.findEnumerated(class563.method10641(), var9);
							Object var11 = var10.method10636(var14);
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
								break label233;
							}

							var14.readUnsignedShort();
							var14.readStringCp1252NullTerminated();
							++var8;
						}
					}
				}
			} catch (Exception var25) {
				break label233;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1008401544"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1253 < class180.method3973() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "23"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}
}
