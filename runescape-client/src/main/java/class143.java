import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public enum class143 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1675(0, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1669(1, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1679(2, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1671(3, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1672(4, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1673(5, 5),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1674(6, 6),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1678(7, 7),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	field1676(8, 8);

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2134354059
	)
	final int field1677;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1952712327
	)
	final int field1668;

	class143(int var3, int var4) {
		this.field1677 = var3;
		this.field1668 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1668;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "108"
	)
	static int method3437(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;Ljava/lang/String;B)I",
		garbageValue = "-26"
	)
	public static int method3436(Buffer var0, String var1) {
		int var2 = var0.offset * -2066221813;
		int var4 = var1.length();
		byte[] var5 = new byte[var4];

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if ((var7 <= 0 || var7 >= 128) && (var7 < 160 || var7 > 255)) {
				if (var7 == 8364) {
					var5[var6] = -128;
				} else if (var7 == 8218) {
					var5[var6] = -126;
				} else if (var7 == 402) {
					var5[var6] = -125;
				} else if (var7 == 8222) {
					var5[var6] = -124;
				} else if (var7 == 8230) {
					var5[var6] = -123;
				} else if (var7 == 8224) {
					var5[var6] = -122;
				} else if (var7 == 8225) {
					var5[var6] = -121;
				} else if (var7 == 710) {
					var5[var6] = -120;
				} else if (var7 == 8240) {
					var5[var6] = -119;
				} else if (var7 == 352) {
					var5[var6] = -118;
				} else if (var7 == 8249) {
					var5[var6] = -117;
				} else if (var7 == 338) {
					var5[var6] = -116;
				} else if (var7 == 381) {
					var5[var6] = -114;
				} else if (var7 == 8216) {
					var5[var6] = -111;
				} else if (var7 == 8217) {
					var5[var6] = -110;
				} else if (var7 == 8220) {
					var5[var6] = -109;
				} else if (var7 == 8221) {
					var5[var6] = -108;
				} else if (var7 == 8226) {
					var5[var6] = -107;
				} else if (var7 == 8211) {
					var5[var6] = -106;
				} else if (var7 == 8212) {
					var5[var6] = -105;
				} else if (var7 == 732) {
					var5[var6] = -104;
				} else if (var7 == 8482) {
					var5[var6] = -103;
				} else if (var7 == 353) {
					var5[var6] = -102;
				} else if (var7 == 8250) {
					var5[var6] = -101;
				} else if (var7 == 339) {
					var5[var6] = -100;
				} else if (var7 == 382) {
					var5[var6] = -98;
				} else if (var7 == 376) {
					var5[var6] = -97;
				} else {
					var5[var6] = 63;
				}
			} else {
				var5[var6] = (byte)var7;
			}
		}

		var0.writeSmartByteShort(var5.length);
		var0.offset += class366.huffman.compress(var5, 0, var5.length, var0.array, -2066221813 * var0.offset) * 29699747;
		return var0.offset * -2066221813 - var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "-1938393144"
	)
	public static PacketBufferNode method3427() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2126843852"
	)
	static int method3435(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field859 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(B)Lqx;",
		garbageValue = "82"
	)
	public static NodeDeque method3438() {
		return Client.scriptEvents;
	}
}
