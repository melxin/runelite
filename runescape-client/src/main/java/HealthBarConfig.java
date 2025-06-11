import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("db")
@Implements("HealthBarConfig")
public class HealthBarConfig extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhs;)V"
	)
	HealthBarConfig(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "55"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lcv;",
		garbageValue = "1365167264"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1998216227"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method8452();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lik;",
		garbageValue = "1210455784"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZB)Lvp;",
		garbageValue = "10"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(StructComposition.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (class28.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (class28.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class4.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lvf;I)Ljava/lang/String;",
		garbageValue = "-287520103"
	)
	public static String method2568(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && RestClientThreadFactory.method212(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && RestClientThreadFactory.method212(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= class542.method10267(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					if (WorldMapElement.method4004(var7)) {
						char var8;
						switch(var7) {
						case ' ':
						case '-':
						case '_':
						case ' ':
							var8 = '_';
							break;
						case '#':
						case '[':
						case ']':
							var8 = var7;
							break;
						case 'À':
						case 'Á':
						case 'Â':
						case 'Ã':
						case 'Ä':
						case 'à':
						case 'á':
						case 'â':
						case 'ã':
						case 'ä':
							var8 = 'a';
							break;
						case 'Ç':
						case 'ç':
							var8 = 'c';
							break;
						case 'È':
						case 'É':
						case 'Ê':
						case 'Ë':
						case 'è':
						case 'é':
						case 'ê':
						case 'ë':
							var8 = 'e';
							break;
						case 'Í':
						case 'Î':
						case 'Ï':
						case 'í':
						case 'î':
						case 'ï':
							var8 = 'i';
							break;
						case 'Ñ':
						case 'ñ':
							var8 = 'n';
							break;
						case 'Ò':
						case 'Ó':
						case 'Ô':
						case 'Õ':
						case 'Ö':
						case 'ò':
						case 'ó':
						case 'ô':
						case 'õ':
						case 'ö':
							var8 = 'o';
							break;
						case 'Ù':
						case 'Ú':
						case 'Û':
						case 'Ü':
						case 'ù':
						case 'ú':
						case 'û':
						case 'ü':
							var8 = 'u';
							break;
						case 'ß':
							var8 = 'b';
							break;
						case 'ÿ':
						case 'Ÿ':
							var8 = 'y';
							break;
						default:
							var8 = Character.toLowerCase(var7);
						}

						if (var8 != 0) {
							var5.append(var8);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-1954113687"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "94"
	)
	static int method2566(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = PlayerType.method7974(var3);
			var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var6 = class361.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = FadeOutTask.method9257(var5);
				class385.field4242 = var6.method10684(var4, var7);
				if (class385.field4242 != null) {
					Client.field373 = class393.method7981(var5);
					class564.field5606 = class385.field4242.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class385.field4242.size();
					}
				} else {
					Client.field373 = -1;
					class564.field5606 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var20 = class393.method7981(var19);
				var7 = Projectile.method1944(var19);
				int var21 = FadeOutTask.method9257(var19);
				DbRowType var26 = WorldView.getDbRowType(var3);
				DbTableType var27 = class153.getDbTableType(var20);
				int[] var28 = var27.types[var7];
				int var12 = 0;
				int var13 = var28.length;
				if (var21 >= 0) {
					if (var21 >= var13) {
						throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
					}

					var12 = var21;
					var13 = var21 + 1;
				}

				Object[] var14 = var26.getColumnType(var7);
				if (var14 == null && var27.defaultValues != null) {
					var14 = var27.defaultValues[var7];
				}

				int var15;
				int var16;
				if (var14 == null) {
					for (var15 = var12; var15 < var13; ++var15) {
						var16 = var28[var15];
						class563 var22 = class282.method6156(var16);
						if (var22 == class563.field5595) {
							Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class217.method4697(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class563 var18 = class282.method6156(var28[var16]);
							if (var18 == class563.field5595) {
								Interpreter.Interpreter_objectStack[++class175.Interpreter_objectStackSize - 1] = var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = class393.method7981(var19);
				var7 = Projectile.method1944(var19);
				DbRowType var25 = WorldView.getDbRowType(var3);
				DbTableType var9 = class153.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--Interpreter.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				DbTable var24 = class63.method2106(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					class385.field4242 = var24.method10684(0, 0);
					var5 = 0;
					if (class385.field4242 != null) {
						Client.field373 = var3;
						class564.field5606 = class385.field4242.iterator();
						var5 = class385.field4242.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				DbRowType var23 = WorldView.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var19 = -1;
				if (class385.field4242 != null && var3 >= 0 && var3 < class385.field4242.size()) {
					var19 = (Integer)class385.field4242.get(var3);
				}

				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var4 = PlayerType.method7974(var3);
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var6 = class361.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (class393.method7981(var5) != Client.field373) {
					throw new RuntimeException();
				} else if (class385.field4242 == null && class385.field4242.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = FadeOutTask.method9257(var5);
					List var8 = var6.method10684(var4, var7);
					class385.field4242 = new LinkedList(class385.field4242);
					if (var8 != null) {
						class385.field4242.retainAll(var8);
					} else {
						class385.field4242.clear();
					}

					class564.field5606 = class385.field4242.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class385.field4242.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (class564.field5606 != null && class564.field5606.hasNext()) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (Integer)class564.field5606.next();
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	static final void method2569() {
		Scene.Scene_isLowDetail = false;
		Client.isLowDetail = false;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "122"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field491.method5864();
			}

			if (Client.gameState == 0) {
				class36.client.method555();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				WorldMapIcon_1.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field396 = 0;
				Client.field397 = 0;
				Client.timer.method7985(var0);
				if (var0 != 20) {
					Client.authenticationScheme = ClientPacket.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && ObjectSound.field653 != null) {
				ObjectSound.field653.close();
				ObjectSound.field653 = null;
			}

			if (Client.gameState == 25) {
				Client.field404 = 0;
				Client.field591 = 0;
				Client.field325 = 1;
				Client.field576 = 0;
				Client.field403 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class71.method2214(class198.archive10, GrandExchangeOfferAgeComparator.archive8, class330.field3671, false, var1);
				} else if (var0 == 11) {
					class71.method2214(class198.archive10, GrandExchangeOfferAgeComparator.archive8, class330.field3671, false, 4);
				} else if (var0 == 50) {
					MenuAction.setLoginResponseString("", "Updating date of birth...", "");
					class71.method2214(class198.archive10, GrandExchangeOfferAgeComparator.archive8, class330.field3671, false, 7);
				} else if (var0 != 0) {
					class518.method10083();
				}
			} else {
				var1 = class1.method6() ? 0 : 12;
				class71.method2214(class198.archive10, GrandExchangeOfferAgeComparator.archive8, class330.field3671, true, var1);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1304785428"
	)
	static final void method2564() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = (Player)var3.players.get((long)var1[var4]);
				if (var5 != null) {
					WorldMapSectionType.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
