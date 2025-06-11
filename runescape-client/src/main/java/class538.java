import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uj")
public class class538 extends class541 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -600395387
	)
	int field5431;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -266566681
	)
	int field5435;
	@ObfuscatedName("an")
	double field5432;
	@ObfuscatedName("ai")
	double field5433;
	@ObfuscatedName("al")
	double field5430;
	@ObfuscatedName("ac")
	double field5434;
	@ObfuscatedName("aa")
	double field5436;

	public class538(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5431 = 0;
		this.field5435 = 0;
		this.field5432 = 0.0D;
		this.field5433 = 0.0D;
		this.field5430 = 0.0D;
		this.field5434 = 0.0D;
		this.field5436 = 0.0D;
		this.field5431 = var3;
		this.field5435 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5432 = (double)var4;
			this.field5433 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5432 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
			this.field5433 = var13 + var19 * (this.field5432 - var11);
			this.field5430 = Math.sqrt(Math.pow(this.field5432 - (double)var1, 2.0D) + Math.pow(this.field5433 - (double)var2, 2.0D));
			this.field5434 = Math.atan2((double)var2 - this.field5433, (double)var1 - this.field5432);
			double var23 = Math.atan2((double)var8 - this.field5433, (double)var7 - this.field5432);
			this.field5436 = Math.atan2((double)var5 - this.field5433, (double)var4 - this.field5432);
			boolean var25 = this.field5434 <= var23 && var23 <= this.field5436 || this.field5436 <= var23 && var23 <= this.field5434;
			if (!var25) {
				this.field5436 += (double)(this.field5434 - this.field5436 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133851745"
	)
	public int vmethod10247() {
		double var1 = this.method10259();
		double var3 = var1 * (this.field5436 - this.field5434) + this.field5434;
		return (int)Math.round(this.field5432 + this.field5430 * Math.cos(var3));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2145780228"
	)
	public int vmethod10248() {
		double var1 = this.method10259();
		double var3 = this.field5434 + (this.field5436 - this.field5434) * var1;
		return (int)Math.round(this.field5433 + this.field5430 * Math.sin(var3));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	public int vmethod10249() {
		double var1 = this.method10259();
		return (int)Math.round((double)this.field5431 + (double)(this.field5435 - this.field5431) * var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lqt;II)Lmk;",
		garbageValue = "-745180121"
	)
	public static PacketBufferNode method10225(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = class139.getPacketBufferNode(ClientPacket.MESSAGE_PUBLIC, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
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
			var8 = GZipDecompressor.method11537(var6);
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

		UserComparator8.method3396(var4.packetBuffer, var1);
		if (var0 == class373.field4151.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}
}
