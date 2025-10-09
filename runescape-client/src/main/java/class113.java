import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class113 {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	static Archive field1508;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	VorbisFloor field1509;
	@ObfuscatedName("at")
	boolean field1512;
	@ObfuscatedName("ag")
	int[] field1504;
	@ObfuscatedName("aj")
	int[] field1505;
	@ObfuscatedName("ah")
	boolean[] field1506;

	@ObfuscatedSignature(
		descriptor = "(Ldr;Z[I[I[Z)V"
	)
	class113(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field1509 = var1;
		this.field1512 = var2;
		this.field1504 = var3;
		this.field1505 = var4;
		this.field1506 = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FIB)V",
		garbageValue = "113"
	)
	void method3521(float[] var1, int var2) {
		int var3 = this.field1509.field1328.length;
		VorbisFloor var10000 = this.field1509;
		int var4 = VorbisFloor.field1335[this.field1509.multiplier - 1];
		boolean[] var5 = this.field1506;
		this.field1506[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field1509.method3127(this.field1504, var6);
			var8 = this.field1509.method3126(this.field1504, var6);
			var9 = this.field1509.method3137(this.field1504[var7], this.field1505[var7], this.field1504[var8], this.field1505[var8], this.field1504[var6]);
			var10 = this.field1505[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field1506;
				this.field1506[var8] = true;
				var14[var7] = true;
				this.field1506[var6] = true;
				if (var10 >= var13) {
					this.field1505[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field1505[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field1506[var6] = false;
				this.field1505[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field1509.multiplier * this.field1505[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field1506[var8]) {
				var9 = this.field1504[var8];
				var10 = this.field1509.multiplier * this.field1505[var8];
				this.field1509.method3130(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field1509;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-617663141"
	)
	boolean method3522() {
		return this.field1512;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1827018417"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field1504[var1];
			int var5 = this.field1505[var1];
			boolean var6 = this.field1506[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field1504[var7];
				if (var8 < var4) {
					this.field1504[var3] = var8;
					this.field1505[var3] = this.field1505[var7];
					this.field1506[var3] = this.field1506[var7];
					++var3;
					this.field1504[var7] = this.field1504[var3];
					this.field1505[var7] = this.field1505[var3];
					this.field1506[var7] = this.field1506[var3];
				}
			}

			this.field1504[var3] = var4;
			this.field1505[var3] = var5;
			this.field1506[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	public static void method3528() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lpn;",
		garbageValue = "1287546700"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4870, PlayerType.field4872, PlayerType.field4866, PlayerType.field4875, PlayerType.PlayerType_ultimateIronman, PlayerType.field4869, PlayerType.field4865, PlayerType.field4867, PlayerType.field4873, PlayerType.PlayerType_ironman, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4874, PlayerType.PlayerType_playerModerator, PlayerType.field4880, PlayerType.PlayerType_jagexModerator, PlayerType.field4878, PlayerType.PlayerType_normal};
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lok;I)Z",
		garbageValue = "1998629561"
	)
	static final boolean method3527(Widget var0) {
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
				Client.playerAppearance.method7541(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7542(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7542(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = HorizontalAlignment.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
