import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class145 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1818534029
	)
	int field1645;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class137[][] field1644;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class137[][] field1642;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	public Skeleton field1648;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1823329399
	)
	int field1646;
	@ObfuscatedName("ac")
	boolean field1647;
	@ObfuscatedName("au")
	Future field1650;
	@ObfuscatedName("an")
	List field1649;

	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;IZ)V"
	)
	class145(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1644 = null;
		this.field1642 = null;
		this.field1646 = 0;
		this.field1645 = var3;
		byte[] var5 = var1.takeFile(this.field1645 >> 16 & 65535, this.field1645 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9;
		if (var4) {
			var9 = var2.getFile(0, var8);
		} else {
			var9 = var2.getFile(var8, 0);
		}

		this.field1648 = new Skeleton(var8, var9);
		this.field1649 = new ArrayList();
		this.field1650 = FriendsList.field4979.submit(new class144(this, var6, var7));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IS)V",
		garbageValue = "13424"
	)
	void method3403(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1646 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1642 = new class137[this.field1648.method4867().method4808()][];
		this.field1644 = new class137[this.field1648.method4870()][];
		class136[] var4 = new class136[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class138 var14 = (class138)ScriptEvent.findEnumerated(class132.method3270(), var7);
			if (var14 == null) {
				var14 = class138.field1600;
			}

			var9 = var1.readShortSmart();
			class139 var16 = NPCComposition.method3912(var1.readUnsignedByte());
			class137 var17 = new class137();
			var17.method3357(var1, var2);
			var4[var5] = new class136(this, var17, var14, var16, var9);
			int var12 = var14.method3362();
			class137[][] var13;
			if (var14 == class138.field1597) {
				var13 = this.field1642;
			} else {
				var13 = this.field1644;
			}

			if (var13[var9] == null) {
				var13[var9] = new class137[var12];
			}

			if (var14 == class138.field1598) {
				this.field1647 = true;
			}
		}

		var5 = var3 / class580.field5637;
		int var6 = var3 % class580.field5637;
		int var8 = 0;

		for (var9 = 0; var9 < class580.field5637; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1649.add(FriendsList.field4979.submit(new class140(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-472996717"
	)
	public boolean method3404() {
		if (this.field1650 == null && this.field1649 == null) {
			return true;
		} else {
			if (this.field1650 != null) {
				if (!this.field1650.isDone()) {
					return false;
				}

				this.field1650 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1649.size(); ++var2) {
				if (!((Future)this.field1649.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1649.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1649 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1615916140"
	)
	public int method3405() {
		return this.field1646;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-213925968"
	)
	public boolean method3406() {
		return this.field1647;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILfe;III)V",
		garbageValue = "-453873409"
	)
	public void method3424(int var1, class134 var2, int var3, int var4) {
		TransformationMatrix var5 = MidiPcmStream.method6684();
		this.method3419(var5, var3, var2, var1);
		this.method3409(var5, var3, var2, var1);
		this.method3425(var5, var3, var2, var1);
		var2.method3303(var5);
		var5.method8266();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqb;ILfe;IB)V",
		garbageValue = "-65"
	)
	void method3419(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3284(this.field1646);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1642[var2] != null) {
			class137 var9 = this.field1642[var2][0];
			class137 var10 = this.field1642[var2][1];
			class137 var11 = this.field1642[var2][2];
			if (var9 != null) {
				var6 = var9.method3349(var4);
			}

			if (var10 != null) {
				var7 = var10.method3349(var4);
			}

			if (var11 != null) {
				var8 = var11.method3349(var4);
			}
		}

		class427 var16 = class309.method6386();
		var16.method8163(1.0F, 0.0F, 0.0F, var6);
		class427 var14 = class309.method6386();
		var14.method8163(0.0F, 1.0F, 0.0F, var7);
		class427 var15 = class309.method6386();
		var15.method8163(0.0F, 0.0F, 1.0F, var8);
		class427 var12 = class309.method6386();
		var12.method8166(var15);
		var12.method8166(var16);
		var12.method8166(var14);
		TransformationMatrix var13 = MidiPcmStream.method6684();
		var13.method8298(var12);
		var1.method8216(var13);
		var16.method8199();
		var14.method8199();
		var15.method8199();
		var12.method8199();
		var13.method8266();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lqb;ILfe;IS)V",
		garbageValue = "3632"
	)
	void method3425(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3294(this.field1646);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1642[var2] != null) {
			class137 var9 = this.field1642[var2][3];
			class137 var10 = this.field1642[var2][4];
			class137 var11 = this.field1642[var2][5];
			if (var9 != null) {
				var6 = var9.method3349(var4);
			}

			if (var10 != null) {
				var7 = var10.method3349(var4);
			}

			if (var11 != null) {
				var8 = var11.method3349(var4);
			}
		}

		var1.field4777[12] = var6;
		var1.field4777[13] = var7;
		var1.field4777[14] = var8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;ILfe;II)V",
		garbageValue = "-34385776"
	)
	void method3409(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3295(this.field1646);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1642[var2] != null) {
			class137 var9 = this.field1642[var2][6];
			class137 var10 = this.field1642[var2][7];
			class137 var11 = this.field1642[var2][8];
			if (var9 != null) {
				var6 = var9.method3349(var4);
			}

			if (var10 != null) {
				var7 = var10.method3349(var4);
			}

			if (var11 != null) {
				var8 = var11.method3349(var4);
			}
		}

		TransformationMatrix var12 = MidiPcmStream.method6684();
		var12.method8214(var6, var7, var8);
		var1.method8216(var12);
		var12.method8266();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lcd;",
		garbageValue = "-927712437"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1457487259"
	)
	static int method3431(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize];
			NPCComposition var6 = DynamicObject.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				PrivateChatMode.Interpreter_intStackSize -= 2;
				var3 = DynamicObject.getNpcDefinition(Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[PrivateChatMode.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.method3915(var4);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3.method3952(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = DynamicObject.getNpcDefinition(Interpreter.Interpreter_intStack[--PrivateChatMode.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++PrivateChatMode.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-31"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		FloorDecoration.method4686();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = FileSystem.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					Rasterizer3D.buildPalette(0.9D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.9D);
					if (class158.worldMap != null) {
						class158.worldMap.method9546();
					}

					class416.method7985();
					SecureUrlRequester.clientPreferences.updateBrightness(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.buildPalette(0.8D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.8D);
					if (class158.worldMap != null) {
						class158.worldMap.method9546();
					}

					class416.method7985();
					SecureUrlRequester.clientPreferences.updateBrightness(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.buildPalette(0.7D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.7D);
					if (class158.worldMap != null) {
						class158.worldMap.method9546();
					}

					class416.method7985();
					SecureUrlRequester.clientPreferences.updateBrightness(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.buildPalette(0.6D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.6D);
					if (class158.worldMap != null) {
						class158.worldMap.method9546();
					}

					class416.method7985();
					SecureUrlRequester.clientPreferences.updateBrightness(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					class73.setMusicVolume(255);
				}

				if (var2 == 1) {
					class73.setMusicVolume(192);
				}

				if (var2 == 2) {
					class73.setMusicVolume(128);
				}

				if (var2 == 3) {
					class73.setMusicVolume(64);
				}

				if (var2 == 4) {
					class73.setMusicVolume(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					Calendar.method7437(127);
				}

				if (var2 == 1) {
					Calendar.method7437(96);
				}

				if (var2 == 2) {
					Calendar.method7437(64);
				}

				if (var2 == 3) {
					Calendar.method7437(32);
				}

				if (var2 == 4) {
					Calendar.method7437(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
			}

			if (var3 == 10) {
				if (var2 == 0) {
					TaskHandler.method4408(127);
				}

				if (var2 == 1) {
					TaskHandler.method4408(96);
				}

				if (var2 == 2) {
					TaskHandler.method4408(64);
				}

				if (var2 == 3) {
					TaskHandler.method4408(32);
				}

				if (var2 == 4) {
					TaskHandler.method4408(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)ScriptEvent.findEnumerated(ClientPreferences.method2867(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)ScriptEvent.findEnumerated(ClientPreferences.method2867(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
