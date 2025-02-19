import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class136 {
	@ObfuscatedName("ab")
	boolean field1610;
	@ObfuscatedName("ay")
	boolean field1609;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class134 field1630;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class134 field1616;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lfr;"
	)
	class131[] field1623;
	@ObfuscatedName("ac")
	boolean field1613;
	@ObfuscatedName("ao")
	float field1614;
	@ObfuscatedName("af")
	float field1620;
	@ObfuscatedName("aa")
	float field1619;
	@ObfuscatedName("as")
	float field1617;
	@ObfuscatedName("ae")
	float field1624;
	@ObfuscatedName("ax")
	float field1621;
	@ObfuscatedName("ai")
	float field1611;
	@ObfuscatedName("ak")
	float field1618;
	@ObfuscatedName("aj")
	float field1622;
	@ObfuscatedName("av")
	float field1608;
	@ObfuscatedName("ar")
	boolean field1612;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1416361059
	)
	int field1625;
	@ObfuscatedName("az")
	float[] field1626;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 364688105
	)
	int field1627;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -546558905
	)
	int field1628;
	@ObfuscatedName("aw")
	float field1629;
	@ObfuscatedName("an")
	float field1615;

	class136() {
		this.field1612 = true;
		this.field1625 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)I",
		garbageValue = "-2050386282"
	)
	int method3376(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		MilliClock.method4494(var1.readUnsignedByte());
		this.field1630 = class108.method2966(var1.readUnsignedByte());
		this.field1616 = class108.method2966(var1.readUnsignedByte());
		this.field1610 = var1.readUnsignedByte() != 0;
		this.field1623 = new class131[var3];
		class131 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class131 var6 = new class131();
			var6.method3269(var1, var2);
			this.field1623[var5] = var6;
			if (var4 != null) {
				var4.field1566 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	void method3353() {
		this.field1627 = this.field1623[0].field1564;
		this.field1628 = this.field1623[this.method3366() - 1].field1564;
		this.field1626 = new float[this.method3350() + 1];

		for (int var1 = this.method3348(); var1 <= this.method3344(); ++var1) {
			this.field1626[var1 - this.method3348()] = ClientPreferences.method2810(this, (float)var1);
		}

		this.field1623 = null;
		this.field1629 = ClientPreferences.method2810(this, (float)(this.method3348() - 1));
		this.field1615 = ClientPreferences.method2810(this, (float)(this.method3344() + 1));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "-9524"
	)
	public float method3370(int var1) {
		if (var1 < this.method3348()) {
			return this.field1629;
		} else {
			return var1 > this.method3344() ? this.field1615 : this.field1626[var1 - this.method3348()];
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1797438376"
	)
	int method3348() {
		return this.field1627;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-474274211"
	)
	int method3344() {
		return this.field1628;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method3350() {
		return this.method3344() - this.method3348();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "2012066157"
	)
	int method3351(float var1) {
		if (this.field1625 < 0 || (float)this.field1623[this.field1625].field1564 > var1 || this.field1623[this.field1625].field1566 != null && (float)this.field1623[this.field1625].field1566.field1564 <= var1) {
			if (var1 >= (float)this.method3348() && var1 <= (float)this.method3344()) {
				int var2 = this.method3366();
				int var3 = this.field1625;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1623[var6].field1564) {
							if (var1 > (float)this.field1623[var6 - 1].field1564) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1623[var6].field1564) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1623[var6 + 1].field1564) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1625) {
					this.field1625 = var3;
					this.field1612 = true;
				}

				return this.field1625;
			} else {
				return -1;
			}
		} else {
			return this.field1625;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfr;",
		garbageValue = "-1197347773"
	)
	class131 method3352(float var1) {
		int var2 = this.method3351(var1);
		return var2 >= 0 && var2 < this.field1623.length ? this.field1623[var2] : null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "870087035"
	)
	int method3366() {
		return this.field1623 == null ? 0 : this.field1623.length;
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-1489462158"
	)
	static void method3345(int var0, String var1) {
		int var2 = Client.playerUpdateManager.playerCount;
		int[] var3 = Client.playerUpdateManager.playerIndices;
		boolean var4 = false;
		Username var5 = new Username(var1, class280.loginType);
		WorldView var6 = class132.localPlayer.method2607();
		if (var6 == null) {
			LoginPacket.addGameMessage(4, "", "Unable to find " + var1 + ", current world null.");
		} else {
			for (int var7 = 0; var7 < var2; ++var7) {
				Player var8 = (Player)var6.field1353.method7890((long)var3[var7]);
				if (var8 != null && var8 != class132.localPlayer && var8.username != null && var8.username.equals(var5)) {
					PacketBufferNode var9;
					if (var0 == 1) {
						var9 = class272.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByteSub(0);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 4) {
						var9 = class272.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShortAdd(var3[var7]);
						var9.packetBuffer.writeByteNeg(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 6) {
						var9 = class272.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeShort(var3[var7]);
						var9.packetBuffer.writeByteSub(0);
						Client.packetWriter.addNode(var9);
					} else if (var0 == 7) {
						var9 = class272.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeByteNeg(0);
						var9.packetBuffer.writeShort(var3[var7]);
						Client.packetWriter.addNode(var9);
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				LoginPacket.addGameMessage(4, "", "Unable to find " + var1);
			}

		}
	}
}
