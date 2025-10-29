import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -801688845
	)
	static int field1168;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -669175765
	)
	static int field1167;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aj")
	boolean field1165;
	@ObfuscatedName("ak")
	String field1162;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1586529363
	)
	int field1159;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lxe;"
	)
	@Export("npcOverheadIcons")
	NPCOverheadIcons npcOverheadIcons;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;
	@ObfuscatedName("az")
	boolean field1158;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	final ModelColorOverride field1170;

	static {
		field1168 = 1;
		field1167 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1165 = false;
		this.field1162 = "";
		this.field1159 = 31;
		this.field1170 = new ModelColorOverride((byte)0, (byte)0, (byte)0, (byte)0);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1504322904"
	)
	void method2808(String var1) {
		this.field1162 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2507();
			AnimationSequence var2 = this.method2508(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1015;
				if (super.field1015.method9876(30)) {
					return null;
				}
			}

			SequenceDefinition var3 = var1 == null ? null : var1.getSequenceDefinition();
			SequenceDefinition var4 = var2 == null ? null : var2.getSequenceDefinition();
			int var5 = var1 == null ? -1 : var1.getFrame();
			int var6 = var2 == null ? -1 : var2.getFrame();
			Model var7 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var7 = class330.localPlayer.appearance.getModel(var3, var5, var4, var6);
			} else {
				var7 = this.definition.getModel(var3, var5, var4, var6, this.modelOverrides);
			}

			if (var7 == null) {
				return null;
			} else {
				var7.calculateBoundsCylinder();
				super.defaultHeight = var7.height;
				int var8 = var7.indicesCount;
				var7 = this.method2495(var7);
				if (this.definition.size == 1) {
					var7.isSingleTile = true;
				}

				if (super.field1065.method6121() && Client.cycle >= super.npcCycle && Client.cycle < super.field1022) {
					var7.method5953(super.field1065, (short)var8);
				} else {
					var7.method5954();
				}

				if (this.field1158) {
					int var9 = this.definition.method4483();
					ModelColorOverride var10 = this.field1170;
					byte var11 = (byte)(var9 >> 10 & 63);
					byte var13 = (byte)(var9 >> 7 & 7);
					byte var15 = (byte)(var9 & 127);
					var10.method6123(var11, var13, var15, (byte)127);
					var7.method5953(this.field1170, (short)var7.indicesCount);
					var7.method5955(0.01F);
					var7.method5956(-5);
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		if (this.definition == null) {
			return false;
		} else if (this.method2496()) {
			return true;
		} else if (this.method2537()) {
			return true;
		} else {
			Model var1;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var1 = class330.localPlayer.appearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
			} else {
				var1 = this.definition.getModel((SequenceDefinition)null, 1, (SequenceDefinition)null, 1, this.modelOverrides);
			}

			return var1 != null && var1.faceAlphas != null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
	)
	void method2844(int var1) {
		this.field1159 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1831974512"
	)
	boolean method2875(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1159 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "944066099"
	)
	final String method2810() {
		if (!this.field1162.isEmpty()) {
			return this.field1162;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILlz;B)V",
		garbageValue = "46"
	)
	final void method2811(int var1, MoveSpeed var2) {
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

		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2517 == 1) {
			this.method2486();
		}

		this.method2557(var3, var4, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1777612090"
	)
	final void method2860(int var1, int var2, boolean var3) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2517 == 1) {
			this.method2486();
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2557(var1, var2, MoveSpeed.field3304);
				return;
			}
		}

		this.method2482(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1478052042"
	)
	int[] method2816() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11905() : this.definition.method4477();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-2000951187"
	)
	short[] method2817() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11912() : this.definition.method4487();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1874393823"
	)
	void method2818(int var1, int var2, short var3) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11911(var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "76"
	)
	void method2819(int[] var1, short[] var2) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11907(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-74638402"
	)
	void method2820() {
		this.npcOverheadIcons = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lha;",
		garbageValue = "1827789378"
	)
	NpcOverrides method2821() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1481041478"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lha;I)V",
		garbageValue = "-838502520"
	)
	void method2822(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lha;S)V",
		garbageValue = "23331"
	)
	void method2823(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-458299933"
	)
	int vmethod2828() {
		return this.method2506() ? 0 : this.definition.method4481();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1584202160"
	)
	void method2824() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	void method2825() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "612699424"
	)
	int vmethod2826() {
		return (this.definition.field2150 == -1 ? super.defaultHeight : this.definition.field2150) + this.vmethod5827();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1103379065"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}
}
