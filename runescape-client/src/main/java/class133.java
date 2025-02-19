import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
public class class133 {
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -584768165
	)
	static int field1592;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 775517467
	)
	public final int field1582;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	public class133 field1581;
	@ObfuscatedName("au")
	float[][] field1580;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	final TransformationMatrix[] field1588;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	TransformationMatrix[] field1579;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lro;"
	)
	TransformationMatrix[] field1587;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	TransformationMatrix field1584;
	@ObfuscatedName("af")
	boolean field1585;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	TransformationMatrix field1586;
	@ObfuscatedName("as")
	boolean field1578;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	TransformationMatrix field1591;
	@ObfuscatedName("ax")
	float[][] field1589;
	@ObfuscatedName("ai")
	float[][] field1590;
	@ObfuscatedName("ak")
	float[][] field1583;

	@ObfuscatedSignature(
		descriptor = "(ILvy;Z)V"
	)
	public class133(int var1, Buffer var2, boolean var3) {
		this.field1584 = new TransformationMatrix();
		this.field1585 = true;
		this.field1586 = new TransformationMatrix();
		this.field1578 = true;
		this.field1591 = new TransformationMatrix();
		this.field1582 = var2.readShort();
		this.field1588 = new TransformationMatrix[var1];
		this.field1579 = new TransformationMatrix[this.field1588.length];
		this.field1587 = new TransformationMatrix[this.field1588.length];
		this.field1580 = new float[this.field1588.length][3];

		for (int var4 = 0; var4 < this.field1588.length; ++var4) {
			this.field1588[var4] = new TransformationMatrix(var2, var3);
			this.field1580[var4][0] = var2.method10354();
			this.field1580[var4][1] = var2.method10354();
			this.field1580[var4][2] = var2.method10354();
		}

		this.method3288();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "743040126"
	)
	void method3288() {
		this.field1589 = new float[this.field1588.length][3];
		this.field1590 = new float[this.field1588.length][3];
		this.field1583 = new float[this.field1588.length][3];
		TransformationMatrix var1 = class148.method3476();

		for (int var2 = 0; var2 < this.field1588.length; ++var2) {
			TransformationMatrix var3 = this.method3317(var2);
			var1.method8395(var3);
			var1.method8419();
			this.field1589[var2] = var1.method8406();
			this.field1590[var2][0] = var3.field4913[12];
			this.field1590[var2][1] = var3.field4913[13];
			this.field1590[var2][2] = var3.field4913[14];
			this.field1583[var2] = var3.method8451();
		}

		var1.method8413();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lro;",
		garbageValue = "-106"
	)
	TransformationMatrix method3317(int var1) {
		return this.field1588[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Lro;",
		garbageValue = "11794"
	)
	TransformationMatrix method3289(int var1) {
		if (this.field1579[var1] == null) {
			this.field1579[var1] = new TransformationMatrix(this.method3317(var1));
			if (this.field1581 != null) {
				this.field1579[var1].method8399(this.field1581.method3289(var1));
			} else {
				this.field1579[var1].method8399(TransformationMatrix.field4914);
			}
		}

		return this.field1579[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lro;",
		garbageValue = "-900332566"
	)
	TransformationMatrix method3290(int var1) {
		if (this.field1587[var1] == null) {
			this.field1587[var1] = new TransformationMatrix(this.method3289(var1));
			this.field1587[var1].method8419();
		}

		return this.field1587[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "-1763895459"
	)
	void method3287(TransformationMatrix var1) {
		this.field1584.method8395(var1);
		this.field1585 = true;
		this.field1578 = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lro;",
		garbageValue = "8"
	)
	TransformationMatrix method3292() {
		return this.field1584;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lro;",
		garbageValue = "-1121945249"
	)
	TransformationMatrix method3293() {
		if (this.field1585) {
			this.field1586.method8395(this.method3292());
			if (this.field1581 != null) {
				this.field1586.method8399(this.field1581.method3293());
			}

			this.field1585 = false;
		}

		return this.field1586;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lro;",
		garbageValue = "-1517182260"
	)
	public TransformationMatrix method3294(int var1) {
		if (this.field1578) {
			this.field1591.method8395(this.method3290(var1));
			this.field1591.method8399(this.method3293());
			this.field1578 = false;
		}

		return this.field1591;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-667881249"
	)
	float[] method3326(int var1) {
		return this.field1589[var1];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "117"
	)
	float[] method3300(int var1) {
		return this.field1590[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-37"
	)
	float[] method3307(int var1) {
		return this.field1583[var1];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;Lku;I)Z",
		garbageValue = "-2134496231"
	)
	static boolean method3329(Buffer var0, WorldEntityCoord var1) {
		byte var2 = var0.readByte();
		if (var2 == 0) {
			return false;
		} else {
			int var3 = class224.method4512(var0, var2, 0);
			int var4 = class224.method4512(var0, var2, 2);
			int var5 = class224.method4512(var0, var2, 4);
			int var6 = class224.method4512(var0, var2, 6);
			var1.method5752(var3, var4, var5, var6);
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgv;",
		garbageValue = "67"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = GrandExchangeOfferUnitPriceComparator.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZI)I",
		garbageValue = "465981906"
	)
	static int method3328(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			HealthBarConfig.Interpreter_intStackSize -= 3;
			class478.queueSoundEffect(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				HealthBarConfig.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				FloorOverlayDefinition.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				HealthBarConfig.Interpreter_intStackSize -= 2;
				class466.method8895(Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize], Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class92 var10;
				class91 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							var4 = 0;
							class92 var19 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var3);
							if (var19 != null) {
								var4 = var19 != class92.field1126 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							var4 = 0;
							class91 var13 = (class91)class454.findEnumerated(class146.method3461(), var3);
							if (var13 != null) {
								var4 = var13 != class91.field1114 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								HealthBarConfig.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
								class177.method3764(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								HealthBarConfig.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								FloorOverlayDefinition.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								HealthBarConfig.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[HealthBarConfig.Interpreter_intStackSize + 3];
								class78.method2302(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class92.field1126;
							var11 = class91.field1114;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
								var10 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
								var11 = (class91)class454.findEnumerated(class146.method3461(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class91.field1114) {
								switch(var10.field1129) {
								case 1:
								case 2:
								case 3:
									var18 = 0;
									var6 = 1;
									break;
								case 4:
									var18 = 0;
									var6 = Integer.MAX_VALUE;
									break;
								case 5:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown device option: %s.", var10.toString());
									throw new RuntimeException(var12);
								}
							} else {
								switch(var11.field1115) {
								case 1:
									var18 = 0;
									var6 = 1;
									break;
								case 2:
								case 3:
								case 4:
									var18 = 0;
									var6 = 100;
									break;
								default:
									var12 = String.format("Unkown game option: %s.", var11.toString());
									throw new RuntimeException(var12);
								}
							}

							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class92.field1126;
						var11 = class91.field1114;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							var10 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							var11 = (class91)class454.findEnumerated(class146.method3461(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
							var10 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var6);
							if (var10 == null) {
								var11 = (class91)class454.findEnumerated(class146.method3461(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class92.field1131;
						} else if (var0 == 3204) {
							var11 = class91.field1116;
						} else if (var0 == 3206) {
							var11 = class91.field1117;
						} else if (var0 == 3208) {
							var11 = class91.field1122;
						}

						if (var11 == class91.field1114) {
							switch(var10.field1129) {
							case 1:
								var5 = AbstractWorldMapIcon.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = AbstractWorldMapIcon.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = AbstractWorldMapIcon.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = AbstractWorldMapIcon.clientPreferences.method2713();
								break;
							case 5:
								var5 = class176.method3762();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1115) {
							case 1:
								var5 = AbstractWorldMapIcon.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = AbstractWorldMapIcon.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = AbstractWorldMapIcon.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = AbstractWorldMapIcon.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class92.field1126;
					var11 = class91.field1114;
					var5 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var10 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var11 = (class91)class454.findEnumerated(class146.method3461(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
						var10 = (class92)class454.findEnumerated(LoginScreenAnimation.method2682(), var6);
						if (var10 == null) {
							var11 = (class91)class454.findEnumerated(class146.method3461(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class92.field1131;
					} else if (var0 == 3203) {
						var11 = class91.field1116;
					} else if (var0 == 3205) {
						var11 = class91.field1117;
					} else if (var0 == 3207) {
						var11 = class91.field1122;
					}

					if (var11 == class91.field1114) {
						switch(var10.field1129) {
						case 1:
							AbstractWorldMapIcon.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							AbstractWorldMapIcon.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							AbstractWorldMapIcon.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							AbstractWorldMapIcon.clientPreferences.method2712(var5);
							break;
						case 5:
							ScriptFrame.method1178(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1115) {
						case 1:
							AbstractWorldMapIcon.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class53.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							MusicPatchNode.method6831(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							class329.method6519(var6);
							break;
						default:
							var14 = String.format("Unkown game option: %s.", var11.toString());
							throw new RuntimeException(var14);
						}
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1123172273"
	)
	static final void method3315(int var0) {
		if (class376.widgetDefinition.loadInterface(var0)) {
			Widget[] var1 = class376.widgetDefinition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}
