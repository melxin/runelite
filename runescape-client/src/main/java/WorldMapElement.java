import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1819976151
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lha;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;
	@ObfuscatedName("qm")
	@ObfuscatedGetter(
		intValue = 553410473
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1655012053
	)
	@Export("objectId")
	public final int objectId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1473142221
	)
	@Export("sprite1")
	public int sprite1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -711737101
	)
	@Export("sprite2")
	int sprite2;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 587110293
	)
	public int field1989;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -376817867
	)
	@Export("textSize")
	public int textSize;
	@ObfuscatedName("ad")
	public boolean field1993;
	@ObfuscatedName("av")
	public boolean field1994;
	@ObfuscatedName("as")
	@Export("menuActions")
	public String[] menuActions;
	@ObfuscatedName("ar")
	@Export("menuTargetName")
	public String menuTargetName;
	@ObfuscatedName("az")
	int[] field1997;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1033447707
	)
	int field1990;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 798780589
	)
	int field2009;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2020598897
	)
	int field2000;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1228399113
	)
	int field2001;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;
	@ObfuscatedName("ai")
	int[] field2004;
	@ObfuscatedName("am")
	byte[] field2005;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1730516973
	)
	@Export("category")
	public int category;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(256);
	}

	WorldMapElement(int var1) {
		this.sprite1 = -1;
		this.sprite2 = -1;
		this.textSize = 0;
		this.field1993 = true;
		this.field1994 = false;
		this.menuActions = new String[5];
		this.field1990 = Integer.MAX_VALUE;
		this.field2009 = Integer.MAX_VALUE;
		this.field2000 = Integer.MIN_VALUE;
		this.field2001 = Integer.MIN_VALUE;
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "356960866"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1208551711"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1989 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var3;
			if (var2 == 7) {
				var3 = var1.readUnsignedByte();
				if ((var3 & 1) == 0) {
					this.field1993 = false;
				}

				if ((var3 & 2) == 2) {
					this.field1994 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var3 = var1.readUnsignedByte();
				this.field1997 = new int[var3 * 2];

				int var4;
				for (var4 = 0; var4 < var3 * 2; ++var4) {
					this.field1997[var4] = var1.readShort();
				}

				var1.method11575();
				var4 = var1.readUnsignedByte();
				this.field2004 = new int[var4];

				int var5;
				for (var5 = 0; var5 < this.field2004.length; ++var5) {
					this.field2004[var5] = var1.method11575();
				}

				this.field2005 = new byte[var3];

				for (var5 = 0; var5 < var3; ++var5) {
					this.field2005[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.method11575();
				} else if (var2 == 22) {
					var1.method11575();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					this.horizontalAlignment = (HorizontalAlignment)ScriptFrame.findEnumerated(class199.method4471(), var1.readUnsignedByte());
				} else if (var2 == 30) {
					this.verticalAlignment = (VerticalAlignment)ScriptFrame.findEnumerated(UserComparator7.method3617(), var1.readUnsignedByte());
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "711881844"
	)
	void method4240() {
		if (this.field1997 != null) {
			for (int var1 = 0; var1 < this.field1997.length; var1 += 2) {
				if (this.field1997[var1] < this.field1990) {
					this.field1990 = this.field1997[var1];
				} else if (this.field1997[var1] > this.field2000) {
					this.field2000 = this.field1997[var1];
				}

				if (this.field1997[var1 + 1] < this.field2009) {
					this.field2009 = this.field1997[var1 + 1];
				} else if (this.field1997[var1 + 1] > this.field2001) {
					this.field2001 = this.field1997[var1 + 1];
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lxl;",
		garbageValue = "-1166607044"
	)
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IS)Lxl;",
		garbageValue = "-1262"
	)
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = (SpritePixels)HitSplatDefinition_cached.get((long)var1);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class455.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					HitSplatDefinition_cached.put(var2, (long)var1);
				}

				return var2;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-205085461"
	)
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-110"
	)
	static final void method4252() {
		Client.packetWriter.close();
		class562.logOut();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		Client.field491.method6096();
		System.gc();
		Clock.method6092(0, 0);
		WorldMapSectionType.method6800();
		Client.playingJingle = false;
		NpcOverrides.method4379();
		class135.updateGameState(10);
		Client.serverCycle = 0;
		class32.method493().method5988();
		class32.method493().method5989();
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-505247851"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = HorizontalAlignment.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
