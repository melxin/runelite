import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	static Bounds field1325;
	@ObfuscatedName("ah")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ac")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ao")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("af")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1568356693
	)
	int field1333;
	@ObfuscatedName("as")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -632570257
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1855807577
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1695686289
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1915796753
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("aj")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 368118291
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1275343313
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ag")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		this.method2777(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 11) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.eula = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1333 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}
			} else {
				this.method2777(true);
			}
		} else {
			this.method2777(true);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "77"
	)
	void method2777(boolean var1) {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lvy;",
		garbageValue = "14"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(418, true);
		var1.writeByte(11);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1333);
		var1.writeByte(this.drawDistance);
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "256"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2023959419"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1000647614"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1692423526"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "51"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-309947642"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2139062272"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-832309159"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "26110732"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1094896189"
	)
	void method2712(int var1) {
		this.field1333 = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	int method2713() {
		return this.field1333;
	}

	@ObfuscatedName("aj")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1238453008"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-60315142"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-9"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "20"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "28272467"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "979753064"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-41"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1652280217"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-659600823"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "946880663"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "79"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		class274.savePreferences();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-899691309"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1170973130"
	)
	@Export("put")
	void put(String var1, int var2) {
		int var3 = this.getParameterKey(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		class274.savePreferences();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-758099102"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1294004779"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "3536"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "225333082"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		class36.method663();
		class274.savePreferences();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "21281"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "1112380613"
	)
	public static HealthBarDefinition method2709(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class557.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field1980 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FI)F",
		garbageValue = "4449717"
	)
	static float method2810(class136 var0, float var1) {
		if (var0 != null && var0.method3366() != 0) {
			if (var1 < (float)var0.field1623[0].field1564) {
				return var0.field1630 == class134.field1596 ? var0.field1623[0].field1563 : class553.method10052(var0, var1, true);
			} else if (var1 > (float)var0.field1623[var0.method3366() - 1].field1564) {
				return var0.field1616 == class134.field1596 ? var0.field1623[var0.method3366() - 1].field1563 : class553.method10052(var0, var1, false);
			} else if (var0.field1609) {
				return var0.field1623[0].field1563;
			} else {
				class131 var2 = var0.method3352(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (0.0F == var2.field1562 && var2.field1565 == 0.0F) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1562 && var2.field1565 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1566 != null) {
						if (var0.field1612) {
							var5 = (float)var2.field1564;
							float var9 = var2.field1563;
							var6 = var5 + 0.33333334F * var2.field1562;
							float var10 = var9 + 0.33333334F * var2.field1565;
							float var8 = (float)var2.field1566.field1564;
							float var12 = var2.field1566.field1563;
							float var7 = var8 - var2.field1566.field1560 * 0.33333334F;
							float var11 = var12 - var2.field1566.field1561 * 0.33333334F;
							float var13;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1610) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var29 = new float[]{var18 / var17, var19 / var17};
										var0.field1613 = var29[0] == 0.33333334F && var29[1] == 0.6666667F;
										float var21 = var29[0];
										float var22 = var29[1];
										if (var29[0] < 0.0F) {
											var29[0] = 0.0F;
										}

										if (var29[1] > 1.0F) {
											var29[1] = 1.0F;
										}

										if (var29[0] > 1.0F || var29[1] < -1.0F) {
											MoveSpeed.method5792(var29);
										}

										if (var29[0] != var21) {
											var13 = var17 * var29[0] + var5;
											if (var21 != 0.0F) {
												var15 = var9 + (var10 - var9) * var29[0] / var21;
											}
										}

										if (var22 != var29[1]) {
											var14 = var29[1] * var17 + var5;
											if (var22 != 1.0F) {
												var16 = var12 - (1.0F - var29[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.field1614 = var5;
										var0.field1620 = var8;
										float var23 = var29[0];
										float var24 = var29[1];
										float var25 = var23 - 0.0F;
										float var26 = var24 - var23;
										float var27 = 1.0F - var24;
										float var28 = var26 - var25;
										var0.field1621 = var27 - var26 - var28;
										var0.field1624 = var28 + var28 + var28;
										var0.field1617 = var25 + var25 + var25;
										var0.field1619 = 0.0F;
										var25 = var15 - var9;
										var26 = var16 - var15;
										var27 = var12 - var16;
										var28 = var26 - var25;
										var0.field1608 = var27 - var26 - var28;
										var0.field1622 = var28 + var28 + var28;
										var0.field1618 = var25 + var25 + var25;
										var0.field1611 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1614 = var5;
								var13 = var8 - var5;
								var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (0.0F != var15) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0F != var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var13 * var17;
								var0.field1619 = (var19 + var20 - var14 - var14) * var18 / var13;
								var0.field1617 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1624 = var16;
								var0.field1621 = var9;
							}

							var0.field1612 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1563;
					} else if (var4) {
						return (float)var2.field1564 != var1 && var2.field1566 != null ? var2.field1566.field1563 : var2.field1563;
					} else if (var0.field1610) {
						return class4.method18(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1614;
							var5 = var0.field1621 + (var0.field1624 + var6 * (var6 * var0.field1619 + var0.field1617)) * var6;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lcw;Lcw;IZI)I",
		garbageValue = "1551849476"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1840() ? (var1.method1840() ? 0 : 1) : (var1.method1840() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1880() ? (var1.method1880() ? 0 : 1) : (var1.method1880() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-522147657"
	)
	static void method2821(int var0, int var1, int var2, int var3) {
		class335.musicPlayerStatus = var0;
		class335.field3693 = var1;
		class335.field3690 = var2;
		class335.field3684 = var3;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lki;",
		garbageValue = "7403"
	)
	static RouteStrategy method2700(int var0, int var1) {
		Client.field818.approxDestinationX = var0;
		Client.field818.approxDestinationY = var1;
		Client.field818.approxDestinationSizeX = 1;
		Client.field818.approxDestinationSizeY = 1;
		return Client.field818;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2041277564"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class438.method8247(var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;
		int var9 = 0;

		while (true) {
			int var11 = ViewportMouse.ViewportMouse_entityCount;
			if (var9 >= var11) {
				if (var4 != -1L) {
					var9 = Player.method2521(var4);
					int var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = (Player)class200.topLevelWorldView.players.get((long)Client.combatTargetPlayerIndex);
					class178.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var9, var10, var6);
				}

				return;
			}

			long var33 = ViewportMouse.ViewportMouse_entityTags[var9];
			if (var7 != var33) {
				label460: {
					var7 = var33;
					int var16 = SpriteMask.method6849(var9);
					int var17 = VarbitComposition.method4068(var9);
					int var18 = WorldMapSectionType.method6243(var9);
					int var19 = FaceNormal.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var20 = var19;
					int var21 = class555.method10064(ViewportMouse.ViewportMouse_entityTags[var9]);
					int var22 = var21;
					WorldEntity var23 = null;
					WorldView var24 = null;
					var23 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)var21);
					if (var21 >= 0 && var23 != null) {
						if (var23.method9285()) {
							break label460;
						}

						var24 = var23.worldView;
					} else if (var21 == -1) {
						var23 = null;
						var24 = class200.topLevelWorldView;
					}

					if (var24 != null) {
						int var26 = -1;
						if (var21 == Client.field780) {
							var26 = var24.plane;
						} else if (Client.field780 == -1) {
							var26 = var23.field5149.method4030();
						} else {
							WorldEntity var27 = (WorldEntity)class200.topLevelWorldView.worldEntities.get((long)Client.field780);
							WorldView var28 = var27.worldView;
							if (var28.plane == var27.field5149.method4030()) {
								if (var21 == -1) {
									var26 = ((WorldEntity)class200.topLevelWorldView.worldEntities.get((long)Client.field780)).getPlane();
								} else {
									var26 = var23.field5149.method4030();
								}
							}
						}

						var26 = var26;
						if (var26 != -1) {
							label441: {
								int var30;
								if (var18 == 2 && var24.scene.getObjectFlags(var26, var16, var17, var33) >= 0) {
									ObjectComposition var40 = class177.getObjectDefinition(var19);
									if (var40.transforms != null) {
										var40 = var40.transform();
									}

									if (var40 == null) {
										break label441;
									}

									PendingSpawn var42 = null;

									for (PendingSpawn var29 = (PendingSpawn)var24.pendingSpawns.last(); var29 != null; var29 = (PendingSpawn)var24.pendingSpawns.previous()) {
										if (var26 == var29.plane && var16 == var29.x && var17 == var29.y && var20 == var29.field1206) {
											var42 = var29;
											break;
										}
									}

									if (!class496.field5164 && Client.isItemSelected == 1) {
										WorldMapSprite.insertMenuItem("Use", Client.field674 + " " + "->" + " " + MilliClock.colorStartTag(65535) + var40.name, 1, var20, var16, var17, -1, false, var21);
									} else if (Client.isSpellSelected) {
										if (!class496.field5164 && (Message.selectedSpellFlags & 4) == 4) {
											WorldMapSprite.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MilliClock.colorStartTag(65535) + var40.name, 2, var20, var16, var17, -1, false, var21);
										}
									} else {
										String[] var47 = var40.actions;
										if (var47 != null) {
											for (var30 = 4; var30 >= 0; --var30) {
												if (!class496.field5164 && (var42 == null || var42.method2571(var30))) {
													String var31 = var47[var30];
													if (var42 != null && var42.method2575(var30)) {
														var31 = var42.method2572(var30);
													}

													if (var31 != null) {
														short var32 = 0;
														if (var30 == 0) {
															var32 = 3;
														}

														if (var30 == 1) {
															var32 = 4;
														}

														if (var30 == 2) {
															var32 = 5;
														}

														if (var30 == 3) {
															var32 = 6;
														}

														if (var30 == 4) {
															var32 = 1001;
														}

														WorldMapSprite.insertMenuItem(var31, MilliClock.colorStartTag(65535) + var40.name, var32, var20, var16, var17, -1, false, var22);
													}
												}
											}
										}

										WorldMapSprite.insertMenuItem("Examine", MilliClock.colorStartTag(65535) + var40.name, 1002, var40.id, var16, var17, -1, false, var22);
									}
								}

								int var37;
								NPC var48;
								if (var18 == 1) {
									NPC var41 = (NPC)var24.npcs.get((long)var20);
									if (var41 == null) {
										break label441;
									}

									if (var41.definition.size == 1 && (var41.x & 127) == 64 && (var41.y & 127) == 64) {
										Iterator var45 = var24.npcs.iterator();

										while (var45.hasNext()) {
											var48 = (NPC)var45.next();
											if (var48 != null && var41 != var48 && var48.definition.size == 1 && var41.x == var48.x && var48.y == var41.y) {
												Script.addNpcToMenu(var48, var48.index, var16, var17, var22);
											}
										}

										int var35 = Client.playerUpdateManager.playerCount;
										int[] var36 = Client.playerUpdateManager.playerIndices;

										for (var37 = 0; var37 < var35; ++var37) {
											Player var38 = (Player)var24.players.get((long)var36[var37]);
											if (var38 != null && var38.x == var41.x && var41.y == var38.y) {
												class178.addPlayerToMenu(var38, var36[var37], var16, var17, var22);
											}
										}
									}

									Script.addNpcToMenu(var41, var20, var16, var17, var22);
								}

								if (var18 == 0) {
									Player var43 = (Player)var24.players.get((long)var20);
									if (var43 == null) {
										break label441;
									}

									if ((var43.x & 127) == 64 && (var43.y & 127) == 64) {
										int var39;
										for (var39 = 0; var39 < var24.field1355.method9005(); ++var39) {
											var48 = (NPC)var24.npcs.get((long)var24.field1355.method9007(var39));
											if (var48 != null && var48.definition.size == 1 && var43.x == var48.x && var48.y == var43.y) {
												Script.addNpcToMenu(var48, var24.field1355.method9007(var39), var16, var17, var22);
											}
										}

										var39 = Client.playerUpdateManager.playerCount;
										int[] var49 = Client.playerUpdateManager.playerIndices;

										for (var30 = 0; var30 < var39; ++var30) {
											Player var51 = (Player)var24.players.get((long)var49[var30]);
											if (var51 != null && var43 != var51 && var43.x == var51.x && var43.y == var51.y) {
												class178.addPlayerToMenu(var51, var49[var30], var16, var17, var22);
											}
										}
									}

									if (var20 != Client.combatTargetPlayerIndex) {
										class178.addPlayerToMenu(var43, var20, var16, var17, var22);
									} else {
										var4 = var33;
										var6 = var22;
									}
								}

								if (var18 == 3) {
									NodeDeque var44 = var24.groundItems[var26][var16][var17];
									if (var44 != null) {
										for (TileItem var46 = (TileItem)var44.first(); var46 != null; var46 = (TileItem)var44.next()) {
											ItemComposition var50 = class138.ItemDefinition_get(var46.id);
											if (!PendingSpawn.field1200 && Client.isItemSelected == 1) {
												WorldMapSprite.insertMenuItem("Use", Client.field674 + " " + "->" + " " + MilliClock.colorStartTag(16748608) + var50.name, 16, var46.id, var16, var17, -1, false, var22);
											} else if (Client.isSpellSelected) {
												if (!PendingSpawn.field1200 && (Message.selectedSpellFlags & 1) == 1) {
													WorldMapSprite.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MilliClock.colorStartTag(16748608) + var50.name, 17, var46.id, var16, var17, -1, false, var22);
												}
											} else {
												String[] var53 = var50.groundActions;

												for (var37 = 4; var37 >= 0; --var37) {
													if (!PendingSpawn.field1200 && var46.method2955(var37)) {
														if (var53 != null && var53[var37] != null) {
															byte var52 = 0;
															if (var37 == 0) {
																var52 = 18;
															}

															if (var37 == 1) {
																var52 = 19;
															}

															if (var37 == 2) {
																var52 = 20;
															}

															if (var37 == 3) {
																var52 = 21;
															}

															if (var37 == 4) {
																var52 = 22;
															}

															WorldMapSprite.insertMenuItem(var53[var37], MilliClock.colorStartTag(16748608) + var50.name, var52, var46.id, var16, var17, -1, false, var22);
														} else if (var37 == 2) {
															WorldMapSprite.insertMenuItem("Take", MilliClock.colorStartTag(16748608) + var50.name, 20, var46.id, var16, var17, -1, false, var22);
														}
													}
												}

												WorldMapSprite.insertMenuItem("Examine", MilliClock.colorStartTag(16748608) + var50.name, 1004, var46.id, var16, var17, -1, false, var22);
											}
										}
									}
								}
							}
						}
					}
				}
			}

			++var9;
		}
	}
}
