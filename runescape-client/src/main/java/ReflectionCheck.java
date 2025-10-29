import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1393129895
	)
	@Export("id")
	int id;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1975307707
	)
	@Export("size")
	int size;
	@ObfuscatedName("ag")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("an")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ae")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aj")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ak")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aw")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lml;Lxo;I)Lmj;",
		garbageValue = "-1590704464"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = class191.method4420();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "327716789"
	)
	static void method3624(int var0, int var1, int var2, int var3, int var4, int var5) {
		SecureUrlRequester.field1536 = (var3 + var0) / 2;
		FloorUnderlayDefinition.field2216 = (var4 + var1) / 2;
		class339.field3865 = (var5 + var2) / 2;
		class142.field1704 = (var3 - var0) / 2;
		VarpDefinition.field1979 = (var4 - var1) / 2;
		Varcs.field1254 = (var5 - var2) / 2;
		class108.field1429 = Math.abs(class142.field1704);
		TileItem.field1203 = Math.abs(VarpDefinition.field1979);
		class146.field1726 = Math.abs(Varcs.field1254);
		ViewportMouse.field3109.method9296((float)(var3 - var0), (float)(var4 - var1), (float)(var5 - var2));
		ViewportMouse.field3109.method9299();
		ViewportMouse.ViewportMouse_false0 = true;
	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	static void method3625() {
		if (Client.field571 != null) {
			Client.field347 = Client.cycle;
			Client.field571.method8816();
			Iterator var0 = Occluder.topLevelWorldView.players.iterator();

			while (var0.hasNext()) {
				Player var1 = (Player)var0.next();
				Client.field571.method8815((var1.x >> 7) + Occluder.topLevelWorldView.baseX, (var1.y >> 7) + Occluder.topLevelWorldView.baseY);
			}
		}

	}
}
