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

@ObfuscatedName("dy")
@Implements("Varcs")
public class Varcs {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("at")
	@Export("intsPersistence")
	boolean[] intsPersistence;
	@ObfuscatedName("ac")
	@Export("map")
	Map map;
	@ObfuscatedName("ap")
	@Export("unwrittenChanges")
	boolean unwrittenChanges;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -2684128781197586211L
	)
	long field1279;

	Varcs() {
		this.unwrittenChanges = false;
		int var1 = VarpDefinition.archive2.getGroupFileCount(19);
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
					var4.method4207(new Buffer(var5));
				}

				VarcInt.VarcInt_cached.put(var4, (long)var2);
				var3 = var4;
			}

			this.intsPersistence[var2] = var3.persist;
		}

		this.read();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-333896370"
	)
	@Export("setInt")
	void setInt(int var1, int var2) {
		this.map.put(var1, var2);
		if (this.intsPersistence[var1]) {
			this.unwrittenChanges = true;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-20224"
	)
	@Export("getInt")
	int getInt(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof Integer ? (Integer)var2 : -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1284760077"
	)
	@Export("setString")
	void setString(int var1, String var2) {
		this.map.put(var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/String;",
		garbageValue = "-81"
	)
	@Export("getString")
	String getString(int var1) {
		Object var2 = this.map.get(var1);
		return var2 instanceof String ? (String)var2 : "";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-396416853"
	)
	@Export("clearTransient")
	void clearTransient() {
		for (int var1 = 0; var1 < this.intsPersistence.length; ++var1) {
			if (!this.intsPersistence[var1]) {
				this.map.remove(var1);
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lvx;",
		garbageValue = "1140045067"
	)
	@Export("getPreferencesFile")
	AccessFile getPreferencesFile(boolean var1) {
		return class33.getPreferencesFile("2", class429.field5084.name, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "56"
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
						var2 += WorldMapSection2.stringCp1252NullTerminatedByteSize((String)var7);
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
					class574 var9 = class574.method11012(var8.getClass());
					var23.writeByte(var9.field5815);
					class574.method11013(var8, var23);
				}
			}

			var1.write(var23.field5916, 0, var23.array * 1216585693);
		} catch (Exception var21) {
		} finally {
			try {
				var1.close();
			} catch (Exception var20) {
			}

		}

		this.unwrittenChanges = false;
		this.field1279 = class189.method4284();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-163576607"
	)
	@Export("read")
	void read() {
		AccessFile var1 = this.getPreferencesFile(false);

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
			if (var14.field5916.length - var14.array * 1216585693 < 1) {
				return;
			}

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

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readUnsignedByte();
					class574 var10 = (class574)class173.findEnumerated(class574.method11023(), var9);
					Object var11 = var10.method11020(var14);
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
						this.map.put(var8, var11);
					}
				}
			} else {
				var16 = var14.readUnsignedShort();

				for (var7 = 0; var7 < var16; ++var7) {
					var8 = var14.readUnsignedShort();
					var9 = var14.readShortSmart();
					if (var8 >= 0 && var8 < this.intsPersistence.length && this.intsPersistence[var8]) {
						this.map.put(var8, var9);
					}
				}

				var7 = var14.readUnsignedShort();

				for (var8 = 0; var8 < var7; ++var8) {
					var14.readUnsignedShort();
					var14.readStringCp1252NullTerminated();
				}
			}
		} catch (Exception var25) {
		} finally {
			try {
				var1.close();
			} catch (Exception var24) {
			}

		}

		this.unwrittenChanges = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	@Export("tryWrite")
	void tryWrite() {
		if (this.unwrittenChanges && this.field1279 < class189.method4284() - 60000L) {
			this.write();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1003938773"
	)
	@Export("hasUnwrittenChanges")
	boolean hasUnwrittenChanges() {
		return this.unwrittenChanges;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1234601879"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class109.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1379295961"
	)
	public static void method2891() {
		class180.field1915.clear();
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-789039467"
	)
	static final void method2915(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class86.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method4076()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_CHANNEL_KICK_USER, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + WorldMapSection2.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
