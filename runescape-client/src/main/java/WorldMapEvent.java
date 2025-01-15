import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("at")
	@Export("ItemDefinition_inMembersWorld")
	static boolean ItemDefinition_inMembersWorld;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1192052067
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnz;Lnz;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpq;II)Z",
		garbageValue = "286865598"
	)
	public static boolean method6538(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class443.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(Lka;S)V",
		garbageValue = "17104"
	)
	static void method6537(class268 var0) {
		if (var0 != null && var0.field2971 != null) {
			if (var0.field2971.childIndex >= 0) {
				Widget var1 = ClanChannel.widgetDefinition.method7031(var0.field2971.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2971.childIndex >= var1.children.length || var0.field2971 != var1.children[var0.field2971.childIndex]) {
					return;
				}
			}

			if (var0.field2971.type == 11 && var0.field2970 == 0) {
				if (var0.field2971.method7432(var0.field2968, var0.field2969, 0, 0)) {
					var0.field2971.method7440().method4873().method4976(1, var0.field2971.method7440().method4853());
					switch(var0.field2971.method7441()) {
					case 0:
						WorldMapRectangle.openURL(var0.field2971.method7436(), true, false);
						break;
					case 1:
						int var2 = class232.getWidgetFlags(var0.field2971);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field2971.method7536();
							if (var3 != null) {
								PacketBufferNode var4 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntLE(var3[2]);
								var4.packetBuffer.writeInt(var0.field2971.method7437());
								var4.packetBuffer.writeIntME(var3[1]);
								var4.packetBuffer.writeIntLE(var3[0]);
								var4.packetBuffer.writeShort(var0.field2971.childIndex);
								var4.packetBuffer.writeIntME(var0.field2971.id);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field2971.type == 12) {
				class359 var6 = var0.field2971.method7444();
				if (var6 != null && var6.method7181()) {
					switch(var0.field2970) {
					case 0:
						Client.field575.method5727(var0.field2971);
						var6.method7129(true);
						var6.method7317(var0.field2968, var0.field2969, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method7169(var0.field2968, var0.field2969);
					}
				}
			}

		}
	}
}
