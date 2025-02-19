import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public final class class108 extends TileItem {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 615821129
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2030489805
	)
	int field1414;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1456276453
	)
	int field1413;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -54592355
	)
	int field1419;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 801428717
	)
	int field1415;
	@ObfuscatedName("ac")
	boolean field1416;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -124891725
	)
	int field1418;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	PlayerCompositionColorTextureOverride field1411;

	class108() {
		this.field1418 = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "8"
	)
	void method2953(int var1) {
		this.field1418 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = class138.ItemDefinition_get(this.id);
		return this.field1411 == null ? var1.getModel(this.field1414) : var1.method4216(this.field1411);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1144349934"
	)
	boolean method2955(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1418 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgf;B)V",
		garbageValue = "20"
	)
	void method2957(PlayerCompositionColorTextureOverride var1) {
		this.field1411 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lgf;",
		garbageValue = "-52"
	)
	PlayerCompositionColorTextureOverride method2958() {
		return this.field1411;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1885633619"
	)
	void method2975() {
		this.field1411 = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "645107852"
	)
	static class134 method2966(int var0) {
		class134[] var1 = new class134[]{class134.field1596, class134.field1594, class134.field1595, class134.field1597, class134.field1598};
		class134 var2 = (class134)class454.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class134.field1596;
		}

		return var2;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(Ldp;Lvu;B)V",
		garbageValue = "61"
	)
	static void method2976(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedByte();
		int var4;
		if (var2 < var0.field1357.method9005()) {
			for (int var3 = var2; var3 < var0.field1357.method9005(); ++var3) {
				var4 = var0.field1357.method9007(var3);
				class391.method7542(var4);
				class492 var22 = (class492)var0.field1358.get((long)var4);
				if (var22 != null) {
					var22.remove();
				}
			}
		}

		if (var2 > var0.field1357.method9005()) {
			throw new RuntimeException("");
		} else {
			var0.field1357.method9009();
			WorldEntityCoord var16 = new WorldEntityCoord();

			int var5;
			int var7;
			for (var4 = 0; var4 < var2; ++var4) {
				var5 = var0.field1357.method9007(var4);
				class492 var17 = (class492)var0.field1358.get((long)var5);
				var7 = var1.readUnsignedByte();
				if (var7 == 0) {
					class391.method7542(var5);
					if (var17 != null) {
						var17.remove();
					}
				} else {
					var0.field1357.method9006(var5);
					if (var7 != 1) {
						var16.method5747(var17.method9342());
						byte var8 = var1.readByte();
						if (var8 != 0) {
							int var18 = class224.method4512(var1, var8, 0);
							int var19 = class224.method4512(var1, var8, 2);
							int var20 = class224.method4512(var1, var8, 4);
							int var21 = class224.method4512(var1, var8, 6);
							var16.method5752(var18, var19, var20, var21);
						}

						if (var7 == 2) {
							var17.method9303(var16);
						} else {
							var17.method9299(var16);
						}
					}
				}
			}

			while (var1.method10178(Client.packetWriter.serverPacketLength) >= 10) {
				var4 = var1.readUnsignedShort();
				var0.field1357.method9006(var4);
				var5 = var1.readUnsignedByte();
				int var6 = var1.readUnsignedByte();
				var7 = var5 * 8;
				int var23 = var6 * 8;
				WorldView var9 = Client.worldViewManager.method2528(var4, var7, var23, AbstractWorldMapIcon.clientPreferences.getDrawDistance(), class232.field2515);
				class492 var10 = new class492(var4, var9);
				var0.field1358.put(var10, (long)var4);
				var10.field5147 = var4;
				var10.field5156 = var0.field1354;
				int var13 = var1.readUnsignedShort();
				class200 var14 = (class200)class200.field2139.get((long)var13);
				class200 var12;
				if (var14 != null) {
					var12 = var14;
				} else {
					byte[] var15 = class28.field137.takeFile(72, var13);
					var14 = new class200();
					if (var15 != null) {
						var14.method4028(new Buffer(var15));
					}

					class200.field2139.put(var14, (long)var13);
					var12 = var14;
				}

				var10.method9292(var12);
				AddRequestTask.method8839(var1, var10.field5150, 0, 0);
				var10.method9303(var10.field5150);
				class386[] var24 = new class386[]{class386.field4552, class386.field4553, class386.TOKEN};
				var10.method9293((class386)class454.findEnumerated(var24, var1.readUnsignedByte()));
			}

		}
	}
}
