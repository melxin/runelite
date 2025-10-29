import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class class557 extends class559 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1574013177
	)
	int field5746;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -518960405
	)
	int field5747;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1021701547
	)
	int field5750;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1511321315
	)
	int field5749;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -756774739
	)
	int field5748;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1012492251
	)
	int field5751;

	public class557(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5746 = 0;
		this.field5747 = 0;
		this.field5750 = 0;
		this.field5749 = 0;
		this.field5748 = 0;
		this.field5751 = 0;
		this.field5746 = var1;
		this.field5747 = var2;
		this.field5750 = var3;
		this.field5749 = var4;
		this.field5748 = var5;
		this.field5751 = var6;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1159791844"
	)
	public int vmethod10971() {
		double var1 = this.method10984();
		return (int)Math.round(var1 * (double)(this.field5749 - this.field5746) + (double)this.field5746);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1928238764"
	)
	public int vmethod10974() {
		double var1 = this.method10984();
		return (int)Math.round((double)(this.field5748 - this.field5747) * var1 + (double)this.field5747);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "814091759"
	)
	public int vmethod10970() {
		double var1 = this.method10984();
		return (int)Math.round((double)this.field5750 + var1 * (double)(this.field5751 - this.field5750));
	}

	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)Z",
		garbageValue = "-215288251"
	)
	static final boolean method10965(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method7772(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7806(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7806(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ReflectionCheck.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
