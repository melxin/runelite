import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hv")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field2076(1, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	field2072(0, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 346876309
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 432202813
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "83049674"
	)
	static float[] method4374(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lmk;Lxo;I)Lmr;",
		garbageValue = "1607863478"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var2 = new PacketBufferNode();
		} else {
			var2 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var2.clientPacket = var0;
		var2.clientPacketLength = var0.length;
		if (var2.clientPacketLength == -1) {
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000);
		} else if (var2.clientPacketLength <= 18) {
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) {
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260);
		}

		var2.packetBuffer.setIsaacCipher(var1);
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
		var2.index = 0;
		return var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-623118110"
	)
	static final boolean method4376(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIILxl;Lnt;I)V",
		garbageValue = "2000304466"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(WorldView var0, int var1, int var2, int var3, int var4, int var5, SpritePixels var6, SpriteMask var7) {
		class450 var8 = Varcs.method3022(var0, var1, var2);
		var1 = (int)var8.field5216;
		var2 = (int)var8.field5219;
		var8.method9065();
		int var9 = var1 / 32 - Client.field484 / 32;
		int var10 = var2 / 32 - Client.field377 / 32;
		int var11 = var9 * var9 + var10 * var10;
		if (var11 > 4225 && var11 < 90000) {
			int var12 = Rasterizer3D.Rasterizer3D_sine[var5];
			int var13 = Rasterizer3D.Rasterizer3D_cosine[var5];
			int var14 = var13 * var9 + var12 * var10 >> 16;
			int var15 = var13 * var10 - var12 * var9 >> 16;
			double var16 = Math.atan2((double)var14, (double)var15);
			int var18 = var7.width / 2 - 25;
			int var19 = (int)(Math.sin(var16) * (double)var18);
			int var20 = (int)(Math.cos(var16) * (double)var18);
			byte var21 = 20;
			class445.redHintArrowSprite.method11965(var19 + (var3 + var7.width / 2 - var21 / 2), var7.height / 2 + var4 - var21 / 2 - var20 - 10, var21, var21, 15, 15, var16, 256);
		} else {
			class445.drawSpriteOnMinimap(var3, var4, var9, var10, var5, var6, var7);
		}

	}
}
