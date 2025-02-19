import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("du")
	static boolean field1200;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -264950195
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -129500495
	)
	@Export("type")
	int type;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 537161461
	)
	@Export("x")
	int x;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -699862693
	)
	@Export("y")
	int y;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 44540057
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -350828057
	)
	int field1204;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1035313237
	)
	int field1205;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 708091383
	)
	int field1206;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1531981645
	)
	int field1207;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -883348197
	)
	int field1215;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1013769865
	)
	int field1210;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -449743165
	)
	int field1213;
	@ObfuscatedName("ak")
	String[] field1208;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1769611737
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1970478967
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1213 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "3"
	)
	void method2577(int var1) {
		this.field1213 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;B)V",
		garbageValue = "34"
	)
	void method2588(String[] var1) {
		this.field1208 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2065967397"
	)
	boolean method2571(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1213 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1720560334"
	)
	boolean method2575(int var1) {
		return this.field1208 != null && var1 >= 0 && var1 < this.field1208.length && this.field1208[var1] != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "22050"
	)
	String method2572(int var1) {
		return this.field1208 != null && var1 >= 0 && var1 < this.field1208.length ? this.field1208[var1] : null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lqt;IB)Lmo;",
		garbageValue = "0"
	)
	public static PacketBufferNode method2583(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class272.getPacketBufferNode(ClientPacket.MESSAGE_PUBLIC, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.field5570;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = class573.method10538(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		ViewportMouse.method5407(var4.packetBuffer, var1);
		if (var0 == class371.field4112.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.field5570 - var5);
		return var4;
	}

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Lnz;I)Z",
		garbageValue = "-392821475"
	)
	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}
