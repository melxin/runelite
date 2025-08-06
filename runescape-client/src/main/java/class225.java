import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class225 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	class134[] field2606;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1019577757
	)
	int field2605;

	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V"
	)
	class225(Buffer var1, int var2) {
		this.field2606 = new class134[var2];
		this.field2605 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2606.length; ++var3) {
			class134 var4 = new class134(this.field2605, var1, false);
			this.field2606[var3] = var4;
		}

		this.method5022();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1585187515"
	)
	void method5022() {
		class134[] var1 = this.field2606;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class134 var3 = var1[var2];
			if (var3.field1606 >= 0) {
				var3.field1616 = this.field2606[var3.field1606];
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-3"
	)
	public int method5015() {
		return this.field2606.length;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lff;",
		garbageValue = "-750613294"
	)
	class134 method5001(int var1) {
		return var1 >= this.method5015() ? null : this.field2606[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lff;",
		garbageValue = "-785951614"
	)
	class134[] method5002() {
		return this.field2606;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfh;II)V",
		garbageValue = "-906996525"
	)
	void method5012(class144 var1, int var2) {
		this.method5003(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I[ZZI)V",
		garbageValue = "-2111879365"
	)
	void method5003(class144 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3731();
		int var6 = 0;
		class134[] var7 = this.method5002();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class134 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3712(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "1"
	)
	public static byte[] method5020(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lxv;IIIB)V",
		garbageValue = "-23"
	)
	static void method4999(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lox;IZLce;I)V",
		garbageValue = "-1572709672"
	)
	static void method5019(Widget var0, int var1, boolean var2, Script var3) {
		if (var0.children == null) {
			var0.children = new Widget[var1 + 1];
		}

		if (var0.children.length <= var1) {
			Widget[] var4 = new Widget[var1 + 1];
			System.arraycopy(var0.children, 0, var4, 0, var0.children.length);
			var0.children = var4;
		} else {
			Widget var5 = var0.children[var1];
			if (var5 != null) {
				if (var2) {
					throw new RuntimeException("");
				}

				class372.method8108(var5, var0);
			}
		}

	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-47"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class291.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class283.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
