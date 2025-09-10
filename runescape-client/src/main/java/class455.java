import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
public class class455 {
	@ObfuscatedName("af")
	float field5201;
	@ObfuscatedName("aw")
	float field5191;
	@ObfuscatedName("at")
	float field5192;
	@ObfuscatedName("ac")
	float field5190;
	@ObfuscatedName("ap")
	float field5194;
	@ObfuscatedName("aq")
	float field5195;
	@ObfuscatedName("ao")
	float field5196;
	@ObfuscatedName("as")
	float field5197;
	@ObfuscatedName("al")
	float field5198;
	@ObfuscatedName("au")
	float field5199;
	@ObfuscatedName("ai")
	float field5200;
	@ObfuscatedName("aa")
	float field5193;

	static {
		new class455();
	}

	public class455() {
		this.method9193();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1639274494"
	)
	void method9193() {
		this.field5193 = 0.0F;
		this.field5200 = 0.0F;
		this.field5199 = 0.0F;
		this.field5197 = 0.0F;
		this.field5196 = 0.0F;
		this.field5195 = 0.0F;
		this.field5190 = 0.0F;
		this.field5192 = 0.0F;
		this.field5191 = 0.0F;
		this.field5198 = 1.0F;
		this.field5194 = 1.0F;
		this.field5201 = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	public void method9181(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5191;
		float var5 = this.field5194;
		float var6 = this.field5197;
		float var7 = this.field5200;
		this.field5191 = var4 * var2 - var3 * this.field5192;
		this.field5192 = var3 * var4 + this.field5192 * var2;
		this.field5194 = var5 * var2 - var3 * this.field5195;
		this.field5195 = var2 * this.field5195 + var3 * var5;
		this.field5197 = var6 * var2 - var3 * this.field5198;
		this.field5198 = this.field5198 * var2 + var6 * var3;
		this.field5200 = var7 * var2 - var3 * this.field5193;
		this.field5193 = this.field5193 * var2 + var7 * var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "-7249"
	)
	public void method9182(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5201;
		float var5 = this.field5190;
		float var6 = this.field5196;
		float var7 = this.field5199;
		this.field5201 = var2 * var4 + this.field5192 * var3;
		this.field5192 = var2 * this.field5192 - var4 * var3;
		this.field5190 = var5 * var2 + var3 * this.field5195;
		this.field5195 = var2 * this.field5195 - var3 * var5;
		this.field5196 = var2 * var6 + this.field5198 * var3;
		this.field5198 = var2 * this.field5198 - var6 * var3;
		this.field5199 = this.field5193 * var3 + var2 * var7;
		this.field5193 = var2 * this.field5193 - var3 * var7;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "2"
	)
	void method9183(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field5201;
		float var5 = this.field5190;
		float var6 = this.field5196;
		float var7 = this.field5199;
		this.field5201 = var2 * var4 - var3 * this.field5191;
		this.field5191 = this.field5191 * var2 + var4 * var3;
		this.field5190 = var5 * var2 - this.field5194 * var3;
		this.field5194 = var2 * this.field5194 + var5 * var3;
		this.field5196 = var2 * var6 - this.field5197 * var3;
		this.field5197 = var3 * var6 + this.field5197 * var2;
		this.field5199 = var2 * var7 - this.field5200 * var3;
		this.field5200 = this.field5200 * var2 + var7 * var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "-106"
	)
	public void method9197(float var1, float var2, float var3) {
		this.field5199 += var1;
		this.field5200 += var2;
		this.field5193 += var3;
	}

	public String toString() {
		return this.field5201 + "," + this.field5190 + "," + this.field5196 + "," + this.field5199 + "\n" + this.field5191 + "," + this.field5194 + "," + this.field5197 + "," + this.field5200 + "\n" + this.field5192 + "," + this.field5195 + "," + this.field5198 + "," + this.field5193;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2006292693"
	)
	static void method9187(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = UserComparator6.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeIntLE(var0 + class333.topLevelWorldView.baseX);
		var4.packetBuffer.writeIntLE(var1 + class333.topLevelWorldView.baseY);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(HealthBarUpdate.localPlayer.x);
		var4.packetBuffer.writeShort(HealthBarUpdate.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}
}
