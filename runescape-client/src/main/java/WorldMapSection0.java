import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1120940959
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1967860837
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1973728303
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1261586451
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 462359135
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1027011727
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1727492911
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1902155725
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -361083091
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -352972105
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1033187523
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1707349133
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 97520505
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -195734985
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lll;I)V",
		garbageValue = "1896416407"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-739948834"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-51"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-2061697618"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lna;",
		garbageValue = "1"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-1979822224"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2053097418"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lre;",
		garbageValue = "712802527"
	)
	public static class452 method6761(float var0, float var1, float var2) {
		synchronized(class452.field5171) {
			if (class452.field5173 == 0) {
				return new class452(var0, var1, var2);
			} else {
				class452.field5171[--class452.field5173].method8993(var0, var1, var2);
				return class452.field5171[class452.field5173];
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "1478591872"
	)
	static final int method6767(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class49.field705, class49.field706);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		HttpRequestTask.randomDatData2(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class49.field705, class49.field706);
		var7 = WorldMapSection2.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.array = var7 * -290410379;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var4.array * 1216585693 + var8.array * 1216585693 + var5.array * 1216585693 + 5);
		var9.writeByte(2);
		var9.writeByte(var4.array * 1216585693);
		var9.writeBytes(var4.field5916, 0, var4.array * 1216585693);
		var9.writeByte(var5.array * 1216585693);
		var9.writeBytes(var5.field5916, 0, var5.array * 1216585693);
		var9.writeShort(var8.array * 1216585693);
		var9.writeBytes(var8.field5916, 0, var8.array * 1216585693);
		String var10 = ClanSettings.method3992(var9.field5916);

		try {
			URL var11 = new URL(FloorOverlayDefinition.method4756("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + class240.method5442(var10) + "&dest=" + class240.method5442("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.field5916, var9.array * 1216585693, 1000 - var9.array * 1216585693);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var16 = new String(var9.field5916);
					if (var16.startsWith("OFFLINE")) {
						return 4;
					} else if (var16.startsWith("WRONG")) {
						return 7;
					} else if (var16.startsWith("RELOAD")) {
						return 3;
					} else if (var16.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.array * 1216585693 > 0 && var9.field5916[var9.array * 1216585693 - 1] == 0) {
							var9.array -= -290410379;
						}

						var16 = new String(var9.field5916, 0, var9.array * 1216585693);
						if (BuddyRankComparator.method3588(var16)) {
							DevicePcmPlayerProvider.openURL(var16, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.array += -290410379 * var15;
			} while(var9.array * 1216585693 < 1000);

			return 5;
		} catch (Throwable var17) {
			var17.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1342679654"
	)
	static void method6773() {
		Iterator var0 = Client.worldViewManager.iterator();

		while (var0.hasNext()) {
			WorldView var1 = (WorldView)var0.next();

			for (ObjectSound var2 = (ObjectSound)var1.method2684().last(); var2 != null; var2 = (ObjectSound)var1.method2684().previous()) {
				var2.method2252();
			}
		}

	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Loi;Loi;I)V",
		garbageValue = "1753580939"
	)
	static void method6771(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field4248; var2 <= var0.field4214; ++var2) {
				Widget var3 = var1.children[var2];
				if (var3 != null && var0.childIndex * -217986249 == var3.field4165) {
					method6771(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * -217986249] = null;
	}
}
