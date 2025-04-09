import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1869635323
	)
	static int field1363;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1586864773
	)
	static int field1364;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aq")
	boolean field1366;
	@ObfuscatedName("av")
	String field1367;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1018271607
	)
	int field1368;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	class569 field1369;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1363 = 1;
		field1364 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1366 = false;
		this.field1367 = "";
		this.field1368 = 31;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "55"
	)
	void method2892(String var1) {
		this.field1367 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1407261867"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class91.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class91.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = Script.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2649(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1220.method4575() && Client.cycle >= super.npcCycle && Client.cycle < super.field1226) {
					var3.method4491(super.field1220, (short)var4);
				} else {
					var3.method4442();
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2106331653"
	)
	void method2893(int var1) {
		this.field1368 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-40"
	)
	boolean method2894(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1368 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-229234914"
	)
	final String method2895() {
		if (!this.field1367.isEmpty()) {
			return this.field1367;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILkw;I)V",
		garbageValue = "-241987045"
	)
	final void method2948(int var1, MoveSpeed var2) {
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

		if (super.sequence != -1 && class91.SequenceDefinition_get(super.sequence).field3000 == 1) {
			super.sequence = -1;
		}

		this.method2639(var3, var4, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1884750180"
	)
	final void method2897(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class91.SequenceDefinition_get(super.sequence).field3000 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2639(var1, var2, MoveSpeed.field3126);
				return;
			}
		}

		this.method2640(var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1895280440"
	)
	int[] method2923() {
		return this.field1369 != null ? this.field1369.method10557() : this.definition.method5183();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1253794886"
	)
	short[] method2901() {
		return this.field1369 != null ? this.field1369.method10558() : this.definition.method5172();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "-29413"
	)
	void method2902(int var1, int var2, short var3) {
		if (this.field1369 == null) {
			this.field1369 = new class569(this.definition);
		}

		this.field1369.method10559(var1, var2, var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-19477797"
	)
	void method2903(int[] var1, short[] var2) {
		if (this.field1369 == null) {
			this.field1369 = new class569(this.definition);
		}

		this.field1369.method10560(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "704883236"
	)
	void method2904() {
		this.field1369 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lja;",
		garbageValue = "-1365536119"
	)
	NpcOverrides method2905() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "497971202"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V",
		garbageValue = "-1520386917"
	)
	void method2906(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V",
		garbageValue = "-1433095305"
	)
	void method2927(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1613609532"
	)
	void method2908() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	void method2909() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "177433814"
	)
	int vmethod2917() {
		return this.definition.field2695 == -1 ? super.defaultHeight : this.definition.field2695;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1346228911"
	)
	public static int method2949(int var0) {
		var0 += 64;
		return (var0 & 2047) / 128;
	}
}
