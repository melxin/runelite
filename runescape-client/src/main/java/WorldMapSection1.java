import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1116302597
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1615790461
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 896441279
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 81801567
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -747090081
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 807999039
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)V",
		garbageValue = "-1753900965"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "58"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "719649251"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-439069343"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lny;",
		garbageValue = "-17070"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "2089662585"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-625589052"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "15913241"
	)
	static String method6273(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1741981103"
	)
	static final void method6274(String var0) {
		PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.field3346, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
