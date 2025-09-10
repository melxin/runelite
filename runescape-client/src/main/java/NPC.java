import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 976788785
	)
	static int field1185;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1401387607
	)
	static int field1186;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ap")
	boolean field1188;
	@ObfuscatedName("aq")
	String field1189;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1952516783
	)
	int field1190;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	@Export("npcOverheadIcons")
	NPCOverheadIcons npcOverheadIcons;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1185 = 1;
		field1186 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1188 = false;
		this.field1189 = "";
		this.field1190 = 31;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1895784021"
	)
	void method2716(String var1) {
		this.field1189 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "-1879635116"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2441();
			AnimationSequence var2 = this.method2419(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1093;
				if (super.field1093.method9567(30)) {
					return null;
				}
			}

			SequenceDefinition var3 = var1 == null ? null : var1.getSequenceDefinition();
			SequenceDefinition var4 = var2 == null ? null : var2.getSequenceDefinition();
			int var5 = var1 == null ? -1 : var1.getFrame();
			int var6 = var2 == null ? -1 : var2.getFrame();
			Model var7 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var7 = HealthBarUpdate.localPlayer.appearance.getModel(var3, var5, var4, var6);
			} else {
				var7 = this.definition.getModel(var3, var5, var4, var6, this.modelOverrides);
			}

			if (var7 == null) {
				return null;
			} else {
				var7.calculateBoundsCylinder();
				super.defaultHeight = var7.height;
				int var8 = var7.indicesCount;
				var7 = this.method2431(var7);
				if (this.definition.size == 1) {
					var7.isSingleTile = true;
				}

				if (super.field1076.method5651() && Client.cycle >= super.npcCycle && Client.cycle < super.field1052) {
					var7.method5491(super.field1076, (short)var8);
				} else {
					var7.method5599();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-75"
	)
	void method2717(int var1) {
		this.field1190 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method2718(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1190 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1902341714"
	)
	final String method2715() {
		if (!this.field1189.isEmpty()) {
			return this.field1189;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILko;S)V",
		garbageValue = "-11531"
	)
	final void method2737(int var1, MoveSpeed var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2485 == 1) {
			this.method2472();
		}

		this.method2421(var3, var4, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "777257420"
	)
	final void method2721(int var1, int var2, boolean var3) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2485 == 1) {
			this.method2472();
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2421(var1, var2, MoveSpeed.field3281);
				return;
			}
		}

		this.method2422(var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "11"
	)
	int[] method2724() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11461() : this.definition.method4335();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1661546749"
	)
	short[] method2748() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11462() : this.definition.method4333();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "7361"
	)
	void method2726(int var1, int var2, short var3) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11463(var1, var2, var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-53"
	)
	void method2727(int[] var1, short[] var2) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11460(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1731560641"
	)
	void method2759() {
		this.npcOverheadIcons = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "-1902077938"
	)
	NpcOverrides method2729() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1641761362"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "-2089731197"
	)
	void method2730(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhq;B)V",
		garbageValue = "4"
	)
	void method2731(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	int vmethod2763() {
		return this.method2440() ? 0 : this.definition.method4345();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1553793305"
	)
	void method2732() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "609621424"
	)
	void method2733() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-370338102"
	)
	int vmethod2734() {
		return this.definition.field2118 == -1 ? super.defaultHeight : this.definition.field2118;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(Ldr;B)V",
		garbageValue = "45"
	)
	static void method2772(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				class390.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIIIIII)V",
		garbageValue = "663919164"
	)
	static void method2771(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		NodeDeque var7 = var0.groundItems[var1][var2][var3];
		if (var7 != null) {
			for (TileItem var8 = (TileItem)var7.last(); var8 != null; var8 = (TileItem)var7.previous()) {
				if ((var4 & 32767) == var8.id && var5 == var8.quantity) {
					var8.quantity = var6;
					break;
				}
			}

			EnumComposition.updateItemPile(var1, var2, var3);
		}

	}
}
