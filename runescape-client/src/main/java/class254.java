import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
public class class254 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static EvictingDualNodeHashTable field2801;
	@ObfuscatedName("ay")
	String[] field2805;
	@ObfuscatedName("ak")
	public boolean field2804;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 113731071
	)
	int field2807;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1210494031
	)
	int field2808;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 577290357
	)
	int field2813;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -127416189
	)
	int field2810;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 441538663
	)
	int field2811;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1589721311
	)
	int field2812;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -367222243
	)
	int field2803;

	static {
		field2801 = new EvictingDualNodeHashTable(64);
	}

	public class254() {
		this.field2805 = new String[5];
		this.field2804 = false;
		this.field2807 = 0;
		this.field2808 = 0;
		this.field2813 = 0;
		this.field2810 = 0;
		this.field2811 = 0;
		this.field2812 = 0;
		this.field2803 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "126"
	)
	public void method5291(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method5287(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;IB)V",
		garbageValue = "-40"
	)
	void method5287(Buffer var1, int var2) {
		switch(var2) {
		case 2:
			this.field2803 = var1.readUnsignedByte();
		case 3:
		case 10:
		case 11:
		case 13:
		default:
			break;
		case 4:
			this.field2807 = var1.readShort();
			break;
		case 5:
			this.field2808 = var1.readShort();
			break;
		case 6:
			this.field2813 = var1.readShort();
			break;
		case 7:
			this.field2810 = var1.readShort();
			break;
		case 8:
			this.field2811 = var1.readUnsignedShort();
			break;
		case 9:
			this.field2812 = var1.readUnsignedShort();
			break;
		case 12:
			var1.readStringCp1252NullTerminated();
			break;
		case 14:
			this.field2804 = true;
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			int var3 = var2 - 15;
			this.field2805[var3] = var1.readStringCp1252NullTerminated();
			if (this.field2805[var3].equalsIgnoreCase("Hidden")) {
				this.field2805[var3] = null;
			}
			break;
		case 20:
			var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1955495319"
	)
	public int method5312() {
		return this.field2803;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "437600317"
	)
	public int method5289() {
		return this.field2807;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	public int method5290() {
		return this.field2808;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1239639579"
	)
	public int method5305() {
		return this.field2813;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1620898827"
	)
	public int method5292() {
		return this.field2810;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1169791776"
	)
	public int method5303() {
		return this.field2811;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-24"
	)
	public int method5294() {
		return this.field2812;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIILjc;I)Lqs;",
		garbageValue = "1301037532"
	)
	public static Bounds method5318(int var0, int var1, int var2, class254 var3) {
		int var4 = var3.method5305();
		int var5 = var3.method5292();
		int var6 = var3.method5303() / 2;
		int var7 = var3.method5294() / 2;
		int var10 = class520.field5298[var2 & 2047];
		double var8 = (double)var10 / 65536.0D;
		double var12 = (double)Archive.method7679(var2) / 65536.0D;
		int var16 = (int)((double)var4 * var8 - var12 * (double)var5);
		int var17 = (int)((double)var4 * var12 + (double)var5 * var8);
		var0 += var16;
		var1 += var17;
		int var18 = (int)((double)var6 * var8 - (double)var7 * var12);
		int var19 = (int)(var8 * (double)var7 + (double)var6 * var12);
		int var20 = (int)((double)var7 * var12 + var8 * (double)var6);
		int var21 = (int)(var8 * (double)var7 - var12 * (double)var6);
		int var22 = var0 - var18;
		int var23 = var19 + var1;
		int var24 = var0 + var20;
		int var25 = var21 + var1;
		int var26 = var0 + var18;
		int var27 = var1 - var19;
		int var28 = var0 - var20;
		int var29 = var1 - var21;
		int var30 = Math.min(var22, Math.min(var24, Math.min(var26, var28)));
		int var31 = Math.max(var22, Math.max(var24, Math.max(var26, var28)));
		int var32 = Math.min(var23, Math.min(var25, Math.min(var27, var29)));
		int var33 = Math.max(var23, Math.max(var25, Math.max(var27, var29)));
		int var35 = var31 - var30 + 1;
		int var36 = var33 - var32 + 1;
		synchronized(Bounds.field4903) {
			Bounds var34;
			if (Bounds.field4906 == 0) {
				var34 = new Bounds(var30, var32, var35, var36);
			} else {
				--Bounds.field4906;
				Bounds.field4903[Bounds.field4906].setLow(var30, var32);
				Bounds.field4903[Bounds.field4906].setHigh(var35, var36);
				var34 = Bounds.field4903[Bounds.field4906];
			}

			return var34;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcr;B)V",
		garbageValue = "1"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			ClanSettings.method3630(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = class357.archive8;
			int var2 = var0.properties;
			if ((var2 & class563.field5582.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & class563.field5575.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var2 & class563.field5565.rsOrdinal()) != 0) {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				WorldMapDecorationType.logoSprite = UserComparator7.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		class335.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		HealthBarUpdate.field1292 = var0.field827;
		WorldMapData_0.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class438.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		ServerPacket.currentPort = WorldMapData_0.worldPort;
	}
}
