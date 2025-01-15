import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		intValue = 1258490961
	)
	static int field998;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1431261661
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1007371593
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1852874499
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1067861687
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 152877433
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1957331331
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1279605387
	)
	int field974;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1412261829
	)
	int field975;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1580630927
	)
	int field976;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1543724799
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2122648551
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1988058801
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -282841737
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2117105735
	)
	int field981;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1005331715
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("az")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ak")
	@Export("x")
	double x;
	@ObfuscatedName("ap")
	@Export("y")
	double y;
	@ObfuscatedName("ah")
	@Export("z")
	double z;
	@ObfuscatedName("ad")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ay")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ax")
	@Export("speed")
	double speed;
	@ObfuscatedName("aa")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("aq")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1923221613
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 842926313
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -859888387
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1148963125
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = ViewportMouse.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = HealthBarDefinition.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field981 = var10;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "612420119"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field974 = var1;
		this.field975 = var2;
		this.field976 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field974 - this.sourceX);
			double var7 = (double)(this.field975 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field974 - this.x) / var5;
		this.speedY = ((double)this.field975 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field976 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-953194232"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += (double)var1 * this.speedZ + 0.5D * this.accelerationZ * (double)var1 * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.getMayaAnimFrame();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljt;",
		garbageValue = "-1562991930"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ViewportMouse.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lwm;",
		garbageValue = "-326601103"
	)
	public static PrivateChatMode method2339(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5627, PrivateChatMode.field5625, PrivateChatMode.field5624};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5626) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2109851870"
	)
	public static void method2345() {
		class178.field1913.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-190831216"
	)
	static int method2344(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			PrivateChatMode.Interpreter_intStackSize -= 3;
			MoveSpeed.queueSoundEffect(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2]);
			return 1;
		} else {
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.SOUND_SONG) {
				PrivateChatMode.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 4];
				ArrayList var15 = new ArrayList();
				var15.add(var3);
				class278.playSong(var15, var4, var5, var6, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				class328.method6475(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize], Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1]);
				return 1;
			} else {
				class93 var10;
				class92 var11;
				String var14;
				if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
					boolean var16;
					if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
						if (var0 == 3211) {
							return 1;
						} else if (var0 == 3216) {
							var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var4 = 0;
							class93 var19 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var3);
							if (var19 != null) {
								var4 = var19 != class93.field1120 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 == 3218) {
							var3 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var4 = 0;
							class92 var13 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var3);
							if (var13 != null) {
								var4 = var13 != class92.field1108 ? 1 : 0;
							}

							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var4;
							return 1;
						} else if (var0 != 3217 && var0 != 3219) {
							if (var0 == 3220) {
								PrivateChatMode.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
								WorldMapSprite.method6235(var3, var4);
								return 1;
							} else if (var0 == 3221) {
								PrivateChatMode.Interpreter_intStackSize -= 6;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
								var7 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 4];
								int var8 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 5];
								ArrayList var9 = new ArrayList();
								var9.add(var3);
								var9.add(var4);
								class278.playSong(var9, var5, var6, var7, var8);
								return 1;
							} else if (var0 == 3222) {
								PrivateChatMode.Interpreter_intStackSize -= 4;
								var3 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize];
								var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
								var5 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 2];
								var6 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 3];
								World.method1931(var3, var4, var5, var6);
								return 1;
							} else {
								return 2;
							}
						} else {
							var10 = class93.field1120;
							var11 = class92.field1108;
							var16 = true;
							boolean var17 = true;
							if (var0 == 3217) {
								var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								var10 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var7);
								if (var10 == null) {
									throw new RuntimeException(String.format("Unrecognized device option %d", var7));
								}
							}

							if (var0 == 3219) {
								var7 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
								var11 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var7);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized game option %d", var7));
								}
							}

							String var12;
							byte var18;
							if (var11 == class92.field1108) {
								switch(var10.field1115) {
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
								switch(var11.field1110) {
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

							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var18;
							Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var6;
							return 1;
						}
					} else {
						var10 = class93.field1120;
						var11 = class92.field1108;
						var16 = false;
						if (var0 == 3214) {
							var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var10 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var6);
							if (var10 == null) {
								throw new RuntimeException(String.format("Unrecognized device option %d", var6));
							}
						}

						if (var0 == 3215) {
							var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var11 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized game option %d", var6));
							}
						}

						if (var0 == 3210) {
							var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
							var10 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var6);
							if (var10 == null) {
								var11 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var6);
								if (var11 == null) {
									throw new RuntimeException(String.format("Unrecognized client option %d", var6));
								}
							}
						} else if (var0 == 3182) {
							var10 = class93.field1114;
						} else if (var0 == 3204) {
							var11 = class92.field1105;
						} else if (var0 == 3206) {
							var11 = class92.field1107;
						} else if (var0 == 3208) {
							var11 = class92.field1109;
						}

						if (var11 == class92.field1108) {
							switch(var10.field1115) {
							case 1:
								var5 = SecureUrlRequester.clientPreferences.isUsernameHidden() ? 1 : 0;
								break;
							case 2:
								var5 = SecureUrlRequester.clientPreferences.isTitleMusicDisabled() ? 1 : 0;
								break;
							case 3:
								var5 = SecureUrlRequester.clientPreferences.isDisplayingFps() ? 1 : 0;
								break;
							case 4:
								var5 = SecureUrlRequester.clientPreferences.method2754();
								break;
							case 5:
								var5 = class75.method2253();
								break;
							default:
								var14 = String.format("Unkown device option: %s.", var10.toString());
								throw new RuntimeException(var14);
							}
						} else {
							switch(var11.field1110) {
							case 1:
								var5 = SecureUrlRequester.clientPreferences.isRoofsHidden() ? 1 : 0;
								break;
							case 2:
								var6 = SecureUrlRequester.clientPreferences.getMusicVolume();
								var5 = Math.round((float)(var6 * 100) / 255.0F);
								break;
							case 3:
								var6 = SecureUrlRequester.clientPreferences.getSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							case 4:
								var6 = SecureUrlRequester.clientPreferences.getAreaSoundEffectsVolume();
								var5 = Math.round((float)(var6 * 100) / 127.0F);
								break;
							default:
								var14 = String.format("Unkown game option: %s.", var11.toString());
								throw new RuntimeException(var14);
							}
						}

						Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var5;
						return 1;
					}
				} else {
					var10 = class93.field1120;
					var11 = class92.field1108;
					var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
					if (var0 == 3212) {
						var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var10 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var6);
						if (var10 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3213) {
						var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var11 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var6);
						if (var11 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3209) {
						var6 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
						var10 = (class93)ScriptEvent.findEnumerated(class320.method6452(), var6);
						if (var10 == null) {
							var11 = (class92)ScriptEvent.findEnumerated(class141.method3392(), var6);
							if (var11 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3181) {
						var10 = class93.field1114;
					} else if (var0 == 3203) {
						var11 = class92.field1105;
					} else if (var0 == 3205) {
						var11 = class92.field1107;
					} else if (var0 == 3207) {
						var11 = class92.field1109;
					}

					if (var11 == class92.field1108) {
						switch(var10.field1115) {
						case 1:
							SecureUrlRequester.clientPreferences.updateHideUsername(var5 == 1);
							break;
						case 2:
							SecureUrlRequester.clientPreferences.updateTitleMusicDisabled(var5 == 1);
							break;
						case 3:
							SecureUrlRequester.clientPreferences.updateDisplayFps(var5 == 1);
							break;
						case 4:
							if (var5 < 0) {
								var5 = 0;
							}

							SecureUrlRequester.clientPreferences.method2753(var5);
							break;
						case 5:
							WidgetDefinition.method6885(var5);
							break;
						default:
							var14 = String.format("Unkown device option: %s.", var10.toString());
							throw new RuntimeException(var14);
						}
					} else {
						switch(var11.field1110) {
						case 1:
							SecureUrlRequester.clientPreferences.updateRoofsHidden(var5 == 1);
							break;
						case 2:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 255) / 100.0F);
							class73.setMusicVolume(var6);
							break;
						case 3:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							Calendar.method7437(var6);
							break;
						case 4:
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round((float)(var5 * 127) / 100.0F);
							TaskHandler.method4408(var6);
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
}
