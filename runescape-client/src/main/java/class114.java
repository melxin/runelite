import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class114 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 398144779
	)
	int field1484;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1807232209
	)
	int field1485;
	@ObfuscatedName("ag")
	byte[] field1488;

	class114() {
		this.field1484 = 0;
		this.field1485 = 0;
		this.field1488 = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1477683223"
	)
	int method3588(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field1485; var1 -= var4) {
			var4 = 8 - this.field1485;
			int var5 = (1 << var4) - 1;
			var2 += (this.field1488[this.field1484] >> this.field1485 & var5) << var3;
			this.field1485 = 0;
			++this.field1484;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field1488[this.field1484] >> this.field1485 & var4) << var3;
			this.field1485 += var1;
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	int method3586() {
		int var1 = this.field1488[this.field1484] >> this.field1485 & 1;
		++this.field1485;
		this.field1484 += this.field1485 >> 3;
		this.field1485 &= 7;
		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1793120611"
	)
	void method3590(byte[] var1, int var2) {
		this.field1488 = var1;
		this.field1484 = var2;
		this.field1485 = 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1975991322"
	)
	public static void method3597() {
		class184.field1864.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)Z",
		garbageValue = "1412810971"
	)
	static boolean method3585(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "77"
	)
	static void method3596(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class468.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && class57.soundEffectCount < 50) {
			GrandExchangeOffer.method8796(AsyncHttpResponse.worldView.id, var1, var2, var3, var4, var5, var6, var7, false);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-809726831"
	)
	public static void method3599() {
		StructComposition.StructDefinition_cached.clear();
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1318049126"
	)
	public static void method3598(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.TELEPORT, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntLE(var0);
		var4.packetBuffer.writeShortAdd(var1);
		var4.packetBuffer.method11690(var3 ? Client.field443 : 0);
		var4.packetBuffer.writeByteNeg(var2);
		Client.packetWriter.addNode(var4);
	}
}
