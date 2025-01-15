import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("tu")
public class class508 {
	@ObfuscatedName("an")
	static int[] field5156;
	@ObfuscatedName("ae")
	public static int[] field5161;

	static {
		field5156 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5156[var0] = method9615(var0);
		}

		method9606();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1848177861"
	)
	static final int method9615(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D;
		double var3 = (double)(var0 >> 5 & 31) / 31.0D;
		double var5 = (double)(var0 & 31) / 31.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var9 + var7) / 2.0D;
		if (var9 != var7) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var9 == var1) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var11 = 4.0D + (var1 - var3) / (var9 - var7);
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = 256.0D * var13;
		if (var18 < 0.0D) {
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995D) {
			var15 = 0.995D;
		}

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D);
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	static void method9606() {
		if (field5161 == null) {
			field5161 = new int[65536];
			double var0 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
				double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (1.0D + var5);
					} else {
						var15 = var7 + var5 - var7 * var5;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = var17 + (var15 - var17) * 6.0D * var19;
					} else if (2.0D * var19 < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = var17 + 6.0D * (var15 - var17) * (0.6666666666666666D - var19);
					} else {
						var9 = var17;
					}

					if (6.0D * var3 < 1.0D) {
						var11 = var17 + var3 * (var15 - var17) * 6.0D;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (3.0D * var3 < 2.0D) {
						var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + var23 * (var15 - var17) * 6.0D;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var17 + (0.6666666666666666D - var23) * (var15 - var17) * 6.0D;
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var0);
				var11 = Math.pow(var11, var0);
				var13 = Math.pow(var13, var0);
				int var25 = (int)(var9 * 256.0D);
				int var16 = (int)(256.0D * var11);
				int var26 = (int)(var13 * 256.0D);
				int var18 = var26 + (var16 << 8) + (var25 << 16);
				field5161[var2] = var18 & 16777215;
			}

		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdb;B)Ldz;",
		garbageValue = "54"
	)
	public static WorldView method9616(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2726();
			}

			var3 = (WorldView)var2.next();
		} while(var3.npcs[var0] == null);

		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-24"
	)
	public static int method9604(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-1811127083"
	)
	static final boolean method9614(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label67:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label67;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = class142.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field561;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "17"
	)
	static int method9608(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class134.scriptDotWidget : HttpMethod.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class359 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method7444();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7.method7331().method8533();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class353 var4;
				if (var0 == 1617) {
					var4 = var3.method7445();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3783 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method7445();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3781 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method7444();
					Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7363().method8533() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method7445();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var4 != null ? var4.field3782 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7188() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7189() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7190() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null && var7.method7221() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method7444();
						Interpreter.Interpreter_stringStack[++HealthBarConfig.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7179().method8809() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method7444();
						int var5 = var7 != null ? var7.method7184() : 0;
						int var6 = var7 != null ? var7.method7259() : 0;
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7259() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7157() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7191() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7193() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method7444();
						Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null ? var7.method7371() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method7535();
							Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = var8 != null ? var8.method449(Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method7535();
							Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1] = var8 != null ? var8.method409((char)Interpreter.Interpreter_intStack[ScriptFrame.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7444();
					Interpreter.Interpreter_intStack[++ScriptFrame.Interpreter_intStackSize - 1] = var7 != null && var7.method7181() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-1815579932"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && GameEngine.topLevelWorldView.worldEntities[var5] != null) {
			var10 = GameEngine.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = GameEngine.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			PacketBufferNode var15;
			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOCU, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(class143.Players_count);
				var15.packetBuffer.writeIntIME(class271.field3015);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAddLE(Interpreter.field866);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 2) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeIntME(class33.selectedSpellWidget);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(Client.selectedSpellItemId);
				var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 4) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 5) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeShortAdd(var0 + var11);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			} else if (var2 == 6) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			} else {
				PacketBufferNode var16;
				NPC var20;
				if (var2 == 7) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPCU, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeShort(Interpreter.field866);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortLE(class143.Players_count);
						var16.packetBuffer.writeIntIME(class271.field3015);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 8) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
						var16.packetBuffer.writeIntME(class33.selectedSpellWidget);
						var16.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 9) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 10) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 11) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShortAdd(var3);
						var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 12) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var16.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var16);
					}
				} else if (var2 == 13) {
					var20 = var13[var3];
					if (var20 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
						var16.packetBuffer.writeShort(var3);
						var16.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var16);
					}
				} else {
					Player var22;
					if (var2 == 14) {
						var22 = var14[var3];
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYERU, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeInt(class271.field3015);
							var16.packetBuffer.writeShortAdd(Interpreter.field866);
							var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShort(class143.Players_count);
							var16.packetBuffer.writeShortAddLE(var3);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 15) {
						var22 = var14[var3];
						if (var22 != null) {
							Client.mouseCrossX = var8;
							Client.mouseCrossY = var9;
							Client.mouseCrossColor = 2;
							Client.mouseCrossState = 0;
							Client.destinationX = var0;
							Client.destinationY = var1;
							var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
							var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
							var16.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
							var16.packetBuffer.writeInt(class33.selectedSpellWidget);
							var16.packetBuffer.writeShort(var3);
							var16.packetBuffer.writeShort(Client.selectedSpellItemId);
							Client.packetWriter.addNode(var16);
						}
					} else if (var2 == 16) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJU, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(Interpreter.field866);
						var15.packetBuffer.writeShortAdd(class143.Players_count);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeIntIME(class271.field3015);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 17) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeIntME(class33.selectedSpellWidget);
						var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 18) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeShortLE(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 19) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShortAdd(var0 + var11);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 20) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var0 + var11);
						var15.packetBuffer.writeShort(var3);
						var15.packetBuffer.writeShortAddLE(var12 + var1);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 21) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeShortAdd(var12 + var1);
						var15.packetBuffer.writeShortAdd(var3);
						var15.packetBuffer.writeShortAddLE(var0 + var11);
						var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 22) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var15.packetBuffer.writeShort(var12 + var1);
						var15.packetBuffer.writeShortLE(var0 + var11);
						var15.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var15);
					} else if (var2 == 23) {
						if (Client.isMenuOpen) {
							var10.scene.method4232();
						} else {
							var10.scene.menuOpen(true);
						}
					} else {
						PacketBufferNode var18;
						Widget var23;
						if (var2 == 24) {
							var23 = ClanChannel.widgetDefinition.method7031(var1);
							if (var23 != null) {
								boolean var19 = true;
								if (var23.contentType > 0) {
									var19 = FriendsList.method9092(var23);
								}

								if (var19) {
									var18 = ScriptEvent.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var18.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var18);
								}
							}
						} else {
							if (var2 == 25) {
								var23 = ClanChannel.widgetDefinition.getWidgetChild(var1, var0);
								if (var23 != null) {
									class278.method5969();
									AbstractWorldMapIcon.method6464(var1, var0, class298.Widget_unpackTargetMask(class232.getWidgetFlags(var23)), var4);
									Client.isItemSelected = 0;
									Client.selectedSpellActionName = class47.Widget_getSpellActionName(var23);
									if (Client.selectedSpellActionName == null) {
										Client.selectedSpellActionName = "null";
									}

									if (var23.isIf3) {
										Client.selectedSpellName = var23.dataText + WorldViewManager.colorStartTag(16777215);
									} else {
										Client.selectedSpellName = WorldViewManager.colorStartTag(65280) + var23.field4006 + WorldViewManager.colorStartTag(16777215);
									}
								}

								return;
							}

							if (var2 == 26) {
								AbstractByteArrayCopier.method7584();
							} else {
								int var17;
								Widget var21;
								if (var2 == 28) {
									var15 = ScriptEvent.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = ClanChannel.widgetDefinition.method7031(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
										RouteStrategy.changeGameOptions(var17);
									}
								} else if (var2 == 29) {
									var15 = ScriptEvent.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
									var15.packetBuffer.writeInt(var1);
									Client.packetWriter.addNode(var15);
									var21 = ClanChannel.widgetDefinition.method7031(var1);
									if (var21 != null && var21.cs1Instructions != null && var21.cs1Instructions[0][0] == 5) {
										var17 = var21.cs1Instructions[0][1];
										if (Varps.Varps_main[var17] != var21.cs1ComparisonValues[0]) {
											Varps.Varps_main[var17] = var21.cs1ComparisonValues[0];
											RouteStrategy.changeGameOptions(var17);
										}
									}
								} else if (var2 == 30) {
									if (Client.meslayerContinueWidget == null) {
										class212.resumePauseWidget(var1, var0);
										Client.meslayerContinueWidget = ClanChannel.widgetDefinition.getWidgetChild(var1, var0);
										UserComparator8.invalidateWidget(Client.meslayerContinueWidget);
									}
								} else if (var2 == 44) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortLE(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 45) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 46) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 47) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 48) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShort(var3);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 49) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var16.packetBuffer.writeShortAddLE(var3);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 50) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 == 51) {
									var22 = var14[var3];
									if (var22 != null) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var16 = ScriptEvent.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
										var16.packetBuffer.writeShortAdd(var3);
										var16.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										Client.packetWriter.addNode(var16);
									}
								} else if (var2 != 1007 && var2 != 57) {
									if (var2 == 58) {
										var23 = ClanChannel.widgetDefinition.getWidgetChild(var1, var0);
										if (var23 != null) {
											if (var23.field3985 != null) {
												ScriptEvent var24 = new ScriptEvent();
												var24.widget = var23;
												var24.opIndex = var3;
												var24.targetName = var7;
												var24.args = var23.field3985;
												Friend.runScriptEvent(var24);
											}

											var16 = ScriptEvent.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
											var16.packetBuffer.writeIntLE(class33.selectedSpellWidget);
											var16.packetBuffer.writeShort(var0);
											var16.packetBuffer.writeIntME(var1);
											var16.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
											var16.packetBuffer.writeShortAdd(var4);
											var16.packetBuffer.writeShort(Client.selectedSpellItemId);
											Client.packetWriter.addNode(var16);
										}
									} else if (var2 == 60) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 1;
										Client.mouseCrossState = 0;
										var15 = ScriptEvent.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeByteSub(var3);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1001) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										Client.destinationX = var0;
										Client.destinationY = var1;
										var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
										var15.packetBuffer.writeShortAddLE(var0 + var11);
										var15.packetBuffer.writeShortAdd(var12 + var1);
										var15.packetBuffer.writeShortAddLE(var3);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1002) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeShortAdd(var3);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1003) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var20 = var13[var3];
										if (var20 != null) {
											NPCComposition var25 = var20.definition;
											if (var25.transforms != null) {
												var25 = var25.transform();
											}

											if (var25 != null) {
												var18 = ScriptEvent.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
												var18.packetBuffer.writeShortLE(var25.id);
												Client.packetWriter.addNode(var18);
											}
										}
									} else if (var2 == 1004) {
										Client.mouseCrossX = var8;
										Client.mouseCrossY = var9;
										Client.mouseCrossColor = 2;
										Client.mouseCrossState = 0;
										var15 = ScriptEvent.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
										var15.packetBuffer.writeShortLE(var3);
										var15.packetBuffer.writeShort(var12 + var1);
										var15.packetBuffer.writeShort(var0 + var11);
										Client.packetWriter.addNode(var15);
									} else if (var2 == 1009 || var2 == 1008 || var2 == 1012 || var2 == 1010 || var2 == 1011) {
										class420.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
									}
								} else {
									var23 = ClanChannel.widgetDefinition.getWidgetChild(var1, var0);
									if (var23 != null) {
										UrlRequester.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
									}
								}
							}
						}
					}
				}
			}

			if (Client.isItemSelected != 0) {
				Client.isItemSelected = 0;
				UserComparator8.invalidateWidget(ClanChannel.widgetDefinition.method7031(class271.field3015));
			}

			if (Client.isSpellSelected) {
				class278.method5969();
			}

		}
	}
}
