import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class183 extends DualNode {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;ZLrv;I)V",
		garbageValue = "-1353466985"
	)
	public static void method4177(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		class142.ItemDefinition_archive = var0;
		class170.ItemDefinition_modelArchive = var1;
		class303.ItemDefinition_inMembersWorld = var2;
		ItemComposition.ItemDefinition_fileCount = class142.ItemDefinition_archive.getGroupFileCount(10);
		ItemComposition.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static int method4178(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZI)I",
		garbageValue = "827465654"
	)
	static int method4176(int var0, Script var1, boolean var2) {
		DynamicArray var8;
		DynamicArray var9;
		if (var0 == 8000) {
			Interpreter.Interpreter_objectStackSize -= 2;
			var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)null);
			var8 = (DynamicArray)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
			UserComparator4.method3537(var9, var8);
			return 1;
		} else {
			int var3;
			int var4;
			DynamicArray var5;
			if (var0 == 8001) {
				UserComparator7.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
				var5 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
				class516.method10308(var5, var3, var4);
				return 1;
			} else if (var0 == 8002) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 == null ? 1 : 0;
				return 1;
			} else if (var0 == 8003) {
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var9 != null ? var9.method10322() : 0;
				return 1;
			} else if (var0 == 8004) {
				Interpreter.Interpreter_objectStackSize -= 2;
				var9 = (DynamicArray)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
				var8 = (DynamicArray)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = class383.method8183(var9, var8);
				return 1;
			} else {
				DynamicArray var7;
				int var10;
				Object var13;
				if (var0 == 8005) {
					UserComparator7.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					var13 = SecureRandomCallable.method2082(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? AbstractWorldMapIcon.method6894(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8006) {
					UserComparator7.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					var13 = SecureRandomCallable.method2082(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? class38.method741(var7, var13, var3, var4) : -1;
					return 1;
				} else if (var0 == 8007) {
					UserComparator7.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
					var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
					var13 = SecureRandomCallable.method2082(var10);
					var7 = (DynamicArray)Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize];
					Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var7 != null ? class336.method7098(var7, var13, var3, var4) : 0;
					return 1;
				} else {
					String var14;
					if (var0 == 8008) {
						var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
						var4 = FontName.method10842(var9);
						if (var9.field5504 == class574.field5820) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10318()[var4] : -1;
						} else {
							if (var9.field5504 != class574.field5824) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10321()[var4] : null));
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8009) {
						var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
						var4 = Sound.method3884(var9);
						if (var9.field5504 == class574.field5820) {
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = var4 >= 0 ? var9.method10318()[var4] : -1;
						} else {
							if (var9.field5504 != class574.field5824) {
								throw new IllegalStateException();
							}

							var14 = (String)((String)(var4 >= 0 ? var9.method10321()[var4] : null));
							Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var14 != null ? var14 : "";
						}

						return 1;
					} else if (var0 == 8010) {
						UserComparator7.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
						var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
						var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
						var13 = SecureRandomCallable.method2082(var10);
						var7 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
						Varps.method7409(var7, var13, var3, var4);
						return 1;
					} else {
						DynamicArray var6;
						if (var0 == 8011) {
							UserComparator7.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
							var6 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							MoveSpeed.method6323(var6, var3, 1, var4, var10);
							return 1;
						} else if (var0 == 8012) {
							var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							KitDefinition.method4250(var9);
							return 1;
						} else if (var0 == 8013) {
							var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							var8 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							class272.method6110(var8, var3);
							return 1;
						} else if (var0 == 8014) {
							UserComparator7.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var5 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							class31.method478(var5, var3, var4);
							return 1;
						} else if (var0 == 8015) {
							UserComparator7.Interpreter_intStackSize -= 3;
							var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
							var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
							Interpreter.Interpreter_objectStackSize -= 2;
							var6 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)null);
							var7 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1], (String)null);
							class447.method8929(var6, var7, var3, var4, var10);
							return 1;
						} else if (var0 == 8016) {
							var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = (int)class159.method3891(var9);
							return 1;
						} else if (var0 == 8017) {
							var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
							var4 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = SoundSystem.method3116(var9, var4);
							return 1;
						} else {
							String var17;
							if (var0 == 8018) {
								Interpreter.Interpreter_objectStackSize -= 2;
								String var16 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize];
								var17 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = Clock.method6073(var16, var17);
								return 1;
							} else if (var0 == 8019) {
								Interpreter.Interpreter_objectStackSize -= 2;
								var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)null);
								var17 = (String)Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1];
								Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = WorldViewManager.method2396(var9, var17);
								return 1;
							} else {
								EnumComposition var12;
								if (var0 == 8020) {
									UserComparator7.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
									var12 = VarcInt.getEnum(var4);
									if (var3 != var12.inputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var12.method4290();
										return 1;
									}
								} else if (var0 == 8021) {
									UserComparator7.Interpreter_intStackSize -= 2;
									var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
									var12 = VarcInt.getEnum(var4);
									if (var3 != var12.outputType) {
										throw new RuntimeException();
									} else {
										Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = var12.method4287();
										return 1;
									}
								} else if (var0 == 8022) {
									UserComparator7.Interpreter_intStackSize -= 3;
									var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
									var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
									var10 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 2];
									if (var10 < var4) {
										var10 = var4;
									}

									if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
										if (var3 == 115) {
											Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = new DynamicArray(class574.field5824, "", var4, var10);
										} else if (var3 != 105 && var3 != 49) {
											Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = new DynamicArray(class574.field5820, -1, var4, var10);
										} else {
											Interpreter.Interpreter_objectStack[++Interpreter.Interpreter_objectStackSize - 1] = new DynamicArray(class574.field5820, 0, var4, var10);
										}

										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8023) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									var8 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
									if (var3 >= 0 && var3 <= 5000) {
										var8.method10337(var3);
										return 1;
									} else {
										throw new RuntimeException();
									}
								} else if (var0 == 8024) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
									Object var15 = SecureRandomCallable.method2082(var3);
									var5 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
									class390.method8218(var5, var5.method10322(), var15);
									return 1;
								} else {
									Object var11;
									if (var0 == 8025) {
										UserComparator7.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
										var11 = SecureRandomCallable.method2082(var4);
										var6 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
										class390.method8218(var6, var3, var11);
										return 1;
									} else if (var0 == 8026) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
										var8 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
										var11 = HttpRequest.method97(var8, var3);
										ReflectionCheck.method739(var8.field5504, var11);
										return 1;
									} else if (var0 == 8027) {
										Interpreter.Interpreter_objectStackSize -= 2;
										var9 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)null);
										var8 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1], (String)null);
										class305.method6836(var9, var8, var9.method10322());
										return 1;
									} else if (var0 == 8028) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
										Interpreter.Interpreter_objectStackSize -= 2;
										var8 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize], (String)null);
										var5 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[Interpreter.Interpreter_objectStackSize + 1], (String)null);
										class305.method6836(var8, var5, var3);
										return 1;
									} else if (var0 == 8029) {
										UserComparator7.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize];
										var4 = Interpreter.Interpreter_intStack[UserComparator7.Interpreter_intStackSize + 1];
										var5 = DelayFadeTask.method9647(Interpreter.Interpreter_objectStack[--Interpreter.Interpreter_objectStackSize], (String)null);
										NPCComposition.method4339(var5, var3, var4);
										return 1;
									} else {
										return 2;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "1"
	)
	static void method4179(int var0, int var1, int var2, int var3, int var4) {
		Occluder.method5384(HttpHeaders.worldView, var0, var1, var2, var3, var4);
	}
}
