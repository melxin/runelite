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

@ObfuscatedName("dh")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("pq")
	@ObfuscatedSignature(
		descriptor = "[Lxl;"
	)
	@Export("headIconPrayerSprites")
	static SpritePixels[] headIconPrayerSprites;
	@ObfuscatedName("ag")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("aj")
	@Export("map")
	Map map;
	@ObfuscatedName("ah")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -7558736912938490383L
	)
	long field1280;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = class206.archive2.getGroupFileCount(19);
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
					var4.method4255(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		this.read();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-60"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1719742859"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-32"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1886450135"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13397"
	)
	@Export("clearTransient")
	void clearTransient() {
		for (int var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvp;",
		garbageValue = "-1490606118"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return LoginState.getPreferencesFile("2", NpcOverrides.field2082.name, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
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
						var2 += WorldMapArea.stringCp1252NullTerminatedByteSize((String)var7);
					}

					++var3;
				}
			}

			Buffer var29 = new Buffer(var2);
			var29.writeByte(2);
			var29.writeShort(var3);
			Iterator var30 = this.map.entrySet().iterator();

			label153:
			while (true) {
				Entry var18;
				int var19;
				do {
					if (!var30.hasNext()) {
						var1.write(var29.array, 0, var29.offset);
						break label153;
					}

					var18 = (Entry)var30.next();
					var19 = (Integer)var18.getKey();
				} while(!this.intsPersistence[var19]);

				var29.writeShort(var19);
				Object var8 = var18.getValue();
				class572 var9 = class572.method11202(var8.getClass());
				var29.writeByte(var9.field5882);
				Class var11 = var8.getClass();
				class572[] var13 = class572.method11189();
				int var14 = 0;

				class572 var12;
				while (true) {
					if (var14 >= var13.length) {
						var12 = null;
						break;
					}

					class572 var15 = var13[var14];
					if (var11 == var15.field5885) {
						var12 = var15;
						break;
					}

					++var14;
				}

				if (var12 == null) {
					throw new IllegalArgumentException();
				}

				class567 var10 = var12.field5884;
				var10.vmethod11207(var8, var29);
			}
		} catch (Exception var27) {
		} finally {
			try {
				var1.close();
			} catch (Exception var26) {
			}

		}

		this.unwrittenChanges = false;
		this.field1280 = class281.method6373();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-933675920"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

		label247: {
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
									break label247;
								}

								var8 = var14.readUnsignedShort();
								var9 = var14.readUnsignedByte();
								class572 var10 = (class572)ScriptFrame.findEnumerated(class572.method11189(), var9);
								Object var11 = var10.method11191(var14);
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
									break label247;
								}

								var14.readUnsignedShort();
								var14.readStringCp1252NullTerminated();
								++var8;
							}
						}
					}

					return;
				}
			} catch (Exception var25) {
				break label247;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "304362670"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1280 < class281.method6373() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-110"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "277343030"
	)
	public static void method2985() {
		class198.field2022.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfv;",
		garbageValue = "1390108066"
	)
	static class146[] method3018() {
		return new class146[]{class146.field1750, class146.field1740, class146.field1753, class146.field1746, class146.field1743, class146.field1744, class146.field1745, class146.field1739, class146.field1747};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1958087207"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1700755604"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ldm;III)Lre;",
		garbageValue = "1079492693"
	)
	static ProjectionCoord method3022(WorldView var0, int var1, int var2) {
		if (var0 != null && class547.topLevelWorldView != var0) {
			WorldEntity var3 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? IndexCheck.method6169((float)var1, 0.0F, (float)var2) : var3.method10213(var1, var2);
		} else {
			return IndexCheck.method6169((float)var1, 0.0F, (float)var2);
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	static void method3024() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (int var2 = 0; var2 < var1.field1170.method9887(); ++var2) {
				int var3 = var1.field1170.method9886(var2);
				WorldEntity var4 = (WorldEntity)var1.worldEntities.get((long)var3);
				if (var4 != null) {
					var4.method10198(Client.cycle);
				}

				Client.field472.method11014(var1, var4.getY(), var4.getPlane(), false);
				int var5;
				if (var4.field5493.getSequenceDefinition() != null && var4.field5493.getSequenceDefinition().method4867() != -1) {
					if (var4.field5494 > 0) {
						--var4.field5494;
					} else {
						var5 = CollisionMap.method6234(var4.field5493, 1, Client.field472);
						if ((var5 & 2) != 0) {
							var4.field5493.reset();
							var4.field5492.method9630();
						}
					}
				}

				if (var4.field5492.getSequenceDefinition() != null && var4.field5492.getSequenceDefinition().method4867() != -1) {
					var5 = CollisionMap.method6234(var4.field5492, 1, Client.field472);
					if ((var5 & 2) != 0) {
						var4.field5492.method9630();
					}
				}

				Client.field472.method11013();
			}
		}

	}
}
