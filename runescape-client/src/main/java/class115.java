import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ed")
public class class115 {
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	static Archive field1514;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1543146597
	)
	int field1513;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 396490617
	)
	int field1519;
	@ObfuscatedName("at")
	byte[] field1515;

	class115() {
		this.field1513 = 0;
		this.field1519 = 0;
		this.field1515 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "127593742"
	)
	int method3467(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field1519; var1 -= var4) {
			var4 = 8 - this.field1519;
			int var5 = (1 << var4) - 1;
			var2 += (this.field1515[this.field1513] >> this.field1519 & var5) << var3;
			this.field1519 = 0;
			++this.field1513;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field1515[this.field1513] >> this.field1519 & var4) << var3;
			this.field1519 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1158358734"
	)
	int method3465() {
		int var1 = this.field1515[this.field1513] >> this.field1519 & 1;
		++this.field1519;
		this.field1513 += this.field1519 >> 3;
		this.field1519 &= 7;
		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-1141874831"
	)
	void method3462(byte[] var1, int var2) {
		this.field1515 = var1;
		this.field1513 = var2;
		this.field1519 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2023138579"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "833434344"
	)
	static int method3460(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "122"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = UserComparator6.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntLE(var1);
		var2.packetBuffer.writeIntIME(var0);
		Client.packetWriter.addNode(var2);
	}
}
