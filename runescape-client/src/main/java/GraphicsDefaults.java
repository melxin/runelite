import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("al")
	final int field5432;
	@ObfuscatedName("ab")
	final int field5422;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5434;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1431655765
	)
	final int field5433;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -858993459
	)
	final int field5431;
	@ObfuscatedName("as")
	public final int[][] field5426;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1966681971
	)
	public int field5427;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1460023799
	)
	public int field5421;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -988951467
	)
	public int field5429;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2106077787
	)
	public int field5430;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 563273011
	)
	public int field5425;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -383243991
	)
	public int field5424;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1729741393
	)
	public int field5423;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 96968723
	)
	public int field5428;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1660236571
	)
	public int field5435;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1937987387
	)
	public int field5436;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1049098717
	)
	public int field5437;

	public GraphicsDefaults() {
		this.field5432 = 1;
		this.field5422 = 2;
		this.field5434 = 1;
		this.field5433 = 1;
		this.field5431 = 1;
		this.field5426 = new int[3][5];
		this.field5427 = -1;
		this.field5421 = -1;
		this.field5429 = -1;
		this.field5430 = -1;
		this.field5425 = -1;
		this.field5424 = -1;
		this.field5423 = -1;
		this.field5428 = -1;
		this.field5435 = -1;
		this.field5436 = -1;
		this.field5437 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;B)V",
		garbageValue = "3"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field5419.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			while (true) {
				int var4 = var3.readUnsignedByte();
				if (var4 == 0) {
					return;
				}

				switch(var4) {
				case 1:
					var3.readMedium();
					break;
				case 2:
					this.field5427 = var3.readNullableLargeSmart();
					this.field5421 = var3.readNullableLargeSmart();
					this.field5429 = var3.readNullableLargeSmart();
					this.field5430 = var3.readNullableLargeSmart();
					this.field5425 = var3.readNullableLargeSmart();
					this.field5424 = var3.readNullableLargeSmart();
					this.field5423 = var3.readNullableLargeSmart();
					this.field5428 = var3.readNullableLargeSmart();
					this.field5435 = var3.readNullableLargeSmart();
					this.field5436 = var3.readNullableLargeSmart();
					this.field5437 = var3.readNullableLargeSmart();
					break;
				case 3:
					for (int var5 = 0; var5 < this.field5426.length; ++var5) {
						for (int var6 = 0; var6 < this.field5426[var5].length; ++var6) {
							this.field5426[var5][var6] = var3.readMedium();
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lxe;",
		garbageValue = "1704556844"
	)
	public static PrivateChatMode method10477(int var0) {
		PrivateChatMode[] var1 = BufferedSink.method10278();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field5973) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)I",
		garbageValue = "-111"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Player.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1564995620"
	)
	static void method10476(int var0, int var1, int var2, int var3) {
		PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.MINIMAP_CLICK, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(18);
		var4.packetBuffer.writeShortLE(var0 + class7.topLevelWorldView.baseX);
		var4.packetBuffer.writeShortLE(var1 + class7.topLevelWorldView.baseY);
		var4.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? (Client.indexCheck.isValidIndexInRange(81) ? 2 : 1) : 0);
		var4.packetBuffer.writeByte(var2);
		var4.packetBuffer.writeByte(var3);
		var4.packetBuffer.writeShort(Client.camAngleY);
		var4.packetBuffer.writeByte(57);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(0);
		var4.packetBuffer.writeByte(89);
		var4.packetBuffer.writeShort(class27.localPlayer.x);
		var4.packetBuffer.writeShort(class27.localPlayer.y);
		var4.packetBuffer.writeByte(63);
		Client.packetWriter.addNode(var4);
		Client.destinationX = var0;
		Client.destinationY = var1;
	}
}
