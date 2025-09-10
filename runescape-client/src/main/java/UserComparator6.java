import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1180206329
	)
	static int field1591;
	@ObfuscatedName("af")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;I)I",
		garbageValue = "666734756"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmn;Lxj;I)Lmy;",
		garbageValue = "-1906970444"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lff;FB)F",
		garbageValue = "-13"
	)
	static float method3592(class138 var0, float var1) {
		if (var0 != null && var0.method3697() != 0) {
			if (var1 < (float)var0.field1673[0].field1612) {
				return var0.field1659 == class136.field1647 ? var0.field1673[0].field1606 : WorldViewManager.method2395(var0, var1, true);
			} else if (var1 > (float)var0.field1673[var0.method3697() - 1].field1612) {
				return var0.field1660 == class136.field1647 ? var0.field1673[var0.method3697() - 1].field1606 : WorldViewManager.method2395(var0, var1, false);
			} else if (var0.field1676) {
				return var0.field1673[0].field1606;
			} else {
				class133 var2 = var0.method3677(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (var2.field1613 == 0.0F && 0.0F == var2.field1608) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1613 && var2.field1608 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1609 != null) {
						if (var0.field1658) {
							var5 = (float)var2.field1612;
							float var9 = var2.field1606;
							var6 = var5 + 0.33333334F * var2.field1613;
							float var10 = 0.33333334F * var2.field1608 + var9;
							float var8 = (float)var2.field1609.field1612;
							float var12 = var2.field1609.field1606;
							float var7 = var8 - 0.33333334F * var2.field1609.field1605;
							float var11 = var12 - var2.field1609.field1603 * 0.33333334F;
							float var13;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1680) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1662 = var29[0] == 0.33333334F && var29[1] == 0.6666667F;
										float var21 = var29[0];
										float var22 = var29[1];
										if (var29[0] < 0.0F) {
											var29[0] = 0.0F;
										}

										if (var29[1] > 1.0F) {
											var29[1] = 1.0F;
										}

										float var23;
										if (var29[0] > 1.0F || var29[1] < -1.0F) {
											var29[1] = 1.0F - var29[1];
											if (var29[0] < 0.0F) {
												var29[0] = 0.0F;
											}

											if (var29[1] < 0.0F) {
												var29[1] = 0.0F;
											}

											if (var29[0] > 1.0F || var29[1] > 1.0F) {
												var23 = (var29[1] - 2.0F) * var29[1] + var29[0] * (var29[1] + (var29[0] - 2.0F)) + 1.0F;
												if (var23 + class134.field1620 > 0.0F) {
													class157.method3871(var29);
												}
											}

											var29[1] = 1.0F - var29[1];
										}

										if (var21 != var29[0]) {
											var13 = var17 * var29[0] + var5;
											if (0.0F != var21) {
												var15 = var9 + (var10 - var9) * var29[0] / var21;
											}
										}

										if (var29[1] != var22) {
											float var10000 = var5 + var17 * var29[1];
											if (var22 != 1.0F) {
												var16 = var12 - (var12 - var11) * (1.0F - var29[1]) / (1.0F - var22);
											}
										}

										var0.field1663 = var5;
										var0.field1661 = var8;
										var23 = var29[0];
										float var24 = var29[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1668 = var27 - var26 - var28;
										var0.field1667 = var28 + var28 + var28;
										var0.field1657 = var25 + var25 + var25;
										var0.field1664 = 0.0F;
										HttpMethod.method81(var9, var15, var16, var12, var0);
									}
								}
							} else if (var0 != null) {
								var0.field1663 = var5;
								var13 = var8 - var5;
								float var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0F != var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var17 * var13;
								var0.field1664 = var18 * (var19 + var20 - var14 - var14) / var13;
								var0.field1657 = (var14 + var14 + var14 - var19 - var19 - var20) * var18;
								var0.field1667 = var16;
								var0.field1668 = var9;
							}

							var0.field1658 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1606;
					} else if (var4) {
						return (float)var2.field1612 != var1 && var2.field1609 != null ? var2.field1609.field1606 : var2.field1606;
					} else if (var0.field1680) {
						return AsyncHttpResponse.method282(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1663;
							var5 = var6 * ((var6 * var0.field1664 + var0.field1657) * var6 + var0.field1667) + var0.field1668;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
