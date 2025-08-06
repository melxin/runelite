import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fg")
public class class152 {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	static ClanChannel field1772;
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 3236241687114764857L
	)
	long field1762;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1990795579
	)
	public int field1771;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	IterableNodeDeque field1770;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public class152(Buffer var1) {
		this.field1771 = -1;
		this.field1770 = new IterableNodeDeque();
		this.method3804(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1318790398"
	)
	void method3804(Buffer var1) {
		this.field1762 = var1.readLong();
		this.field1771 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class171(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class164(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class163(this);
			} else if (var2 == 5) {
				var3 = new class148(this);
			} else if (var2 == 2) {
				var3 = new class153(this);
			} else if (var2 == 7) {
				var3 = new class146(this);
			} else if (var2 == 14) {
				var3 = new class150(this);
			} else if (var2 == 8) {
				var3 = new class167(this);
			} else if (var2 == 9) {
				var3 = new class173(this);
			} else if (var2 == 10) {
				var3 = new class159(this);
			} else if (var2 == 11) {
				var3 = new class154(this);
			} else if (var2 == 12) {
				var3 = new class158(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class168(this);
			}

			((class149)var3).vmethod4086(var1);
			this.field1770.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "962817729"
	)
	public void method3809(ClanSettings var1) {
		if (var1.field1811 == this.field1762 && this.field1771 == var1.field1812) {
			for (class149 var2 = (class149)this.field1770.last(); var2 != null; var2 = (class149)this.field1770.previous()) {
				var2.vmethod4088(var1);
			}

			++var1.field1812;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "-1119600409"
	)
	public static byte[] method3808(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? WorldMapDecoration.method6801(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILce;ZI)I",
		garbageValue = "-112079935"
	)
	static int method3810(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			EnumComposition var10 = class159.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--AbstractWorldMapIcon.Interpreter_intStackSize];
				EnumComposition var4 = class159.getEnum(var3);
				Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			AbstractWorldMapIcon.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[AbstractWorldMapIcon.Interpreter_intStackSize + 3];
			EnumComposition var7 = class159.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_objectStack[++SecureRandomFuture.Interpreter_objectStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++AbstractWorldMapIcon.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Ldj;Lpq;I)V",
		garbageValue = "-1864821771"
	)
	static void method3811(WorldView var0, class391 var1) {
		int var2 = 0;

		for (int var3 = 0; var3 < var0.field1143.method9810(); ++var3) {
			WorldEntity var4 = (WorldEntity)var0.worldEntities.get((long)var0.field1143.method9817(var3));
			if (var4 != null && var4.worldView.id != Client.field326 && var4.method10101() == var1) {
				boolean var5 = var2 < Client.field535;
				if (var5) {
					++var2;
					boolean var6 = false;
					if (var1 == class391.field4696) {
						Bounds var8 = class564.method11020(var4.worldEntityCoord, var4.field5320.method4453());

						boolean var7;
						label116: {
							int var9;
							for (var9 = 0; var9 < Client.playerUpdateManager.playerCount; ++var9) {
								Player var10 = (Player)var0.players.get((long)Client.playerUpdateManager.playerIndices[var9]);
								if (var10 != null && var8.method8987(var10.x, var10.y)) {
									var8.method8977();
									var7 = true;
									break label116;
								}
							}

							var9 = 0;

							label99:
							while (true) {
								if (var9 >= var0.field1150.method9810()) {
									for (var9 = 0; var9 < var0.field1143.method9810(); ++var9) {
										WorldEntity var14 = (WorldEntity)var0.worldEntities.get((long)var0.field1143.method9817(var9));
										if (var14 != null && var4 != var14 && var14.worldView.scene.cycle == Client.cycle) {
											Bounds var11 = class564.method11020(var14.worldEntityCoord, var14.field5320.method4453());
											if (var8.method9003(var11)) {
												var8.method8977();
												var11.method8977();
												var7 = true;
												break label99;
											}

											var11.method8977();
										}
									}

									var8.method8977();
									var7 = false;
									break;
								}

								NPC var13 = (NPC)var0.npcs.get((long)var0.field1150.method9817(var9));
								if (var13 != null && var8.method8987(var13.x, var13.y)) {
									for (int var12 = 0; var12 < var13.definition.actions.length; ++var12) {
										if (var13.definition.actions[var12] != null) {
											var8.method8977();
											var7 = true;
											break label99;
										}
									}
								}

								++var9;
							}
						}

						var6 = var7;
					}

					FileSystem.method5908(var0, var4, var6);
				}
			}
		}

	}
}
