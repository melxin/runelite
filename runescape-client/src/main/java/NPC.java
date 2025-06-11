import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1459075309
	)
	static int field1165;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 880008649
	)
	static int field1164;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ac")
	boolean field1168;
	@ObfuscatedName("aa")
	String field1172;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2030963523
	)
	int field1169;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lwj;"
	)
	@Export("npcOverheadIcons")
	NPCOverheadIcons npcOverheadIcons;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1165 = 1;
		field1164 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1168 = false;
		this.field1172 = "";
		this.field1169 = 31;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "27"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? VarpDefinition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? VarpDefinition.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = class152.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2327(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1054.method5714() && Client.cycle >= super.npcCycle && Client.cycle < super.field1027) {
					var3.method5661(super.field1054, (short)var4);
				} else {
					var3.method5611();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	void method2571(String var1) {
		this.field1172 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "22"
	)
	void method2573(int var1) {
		this.field1169 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "37"
	)
	boolean method2574(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1169 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "280623754"
	)
	final String method2636() {
		if (!this.field1172.isEmpty()) {
			return this.field1172;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILkt;I)V",
		garbageValue = "443022046"
	)
	final void method2576(int var1, MoveSpeed var2) {
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

		if (super.sequence != -1 && VarpDefinition.SequenceDefinition_get(super.sequence).field2366 == 1) {
			super.sequence = -1;
		}

		this.method2317(var3, var4, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-15"
	)
	final void method2627(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && VarpDefinition.SequenceDefinition_get(super.sequence).field2366 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2317(var1, var2, MoveSpeed.field3118);
				return;
			}
		}

		this.method2328(var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1103522935"
	)
	int[] method2580() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11114() : this.definition.method4161();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1809823740"
	)
	short[] method2581() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11107() : this.definition.method4204();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-2040815781"
	)
	void method2587(int var1, int var2, short var3) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11108(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1121487031"
	)
	void method2583(int[] var1, short[] var2) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11109(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-108"
	)
	void method2584() {
		this.npcOverheadIcons = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lht;",
		garbageValue = "0"
	)
	NpcOverrides method2585() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-55"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1576632536"
	)
	void method2586(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "379500147"
	)
	void method2607(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1771493466"
	)
	void method2588() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	void method2589() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "22549"
	)
	int vmethod2621() {
		return this.definition.field2069 == -1 ? super.defaultHeight : this.definition.field2069;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method2638() {
		class188.field2007.clear();
	}
}
