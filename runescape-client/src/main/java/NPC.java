import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1158988943
	)
	static int field1352;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1940611065
	)
	static int field1349;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -299363553
	)
	int field1350;
	@ObfuscatedName("az")
	String field1348;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 777313087
	)
	int field1351;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	class557 field1356;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1352 = 1;
		field1349 = 1;
	}

	NPC() {
		this.field1348 = "";
		this.field1351 = 31;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "105"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.field1350;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class33.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class33.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = ModeWhere.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2807(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1208 != 0 && Client.cycle >= super.field1256 && Client.cycle < super.field1252) {
					var3.overrideHue = super.field1258;
					var3.overrideSaturation = super.field1211;
					var3.overrideLuminance = super.field1261;
					var3.overrideAmount = super.field1208;
					var3.field2193 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1244068072"
	)
	void method3022(String var1) {
		this.field1348 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "13"
	)
	void method3013(int var1) {
		this.field1351 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "50"
	)
	boolean method3066(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1351 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1259463685"
	)
	final String method3015() {
		if (!this.field1348.isEmpty()) {
			return this.field1348;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILkq;I)V",
		garbageValue = "-433229914"
	)
	final void method3012(int var1, MoveSpeed var2) {
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

		if (super.sequence != -1 && class33.SequenceDefinition_get(super.sequence).field2942 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-22"
	)
	final void method3049(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class33.SequenceDefinition_get(super.sequence).field2942 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = MoveSpeed.field3045;
				return;
			}
		}

		super.pathLength = 0;
		super.field1270 = 0;
		super.field1269 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.pathX[0] * 128 + super.field1268 * 936633408;
		super.y = super.pathY[0] * 128 + super.field1268 * 936633408;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "339049754"
	)
	int[] method3020() {
		return this.field1356 != null ? this.field1356.method10527() : this.definition.method5338();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "1000"
	)
	short[] method3021() {
		return this.field1356 != null ? this.field1356.method10528() : this.definition.method5308();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1597186844"
	)
	void method3068(int var1, int var2, short var3) {
		if (this.field1356 == null) {
			this.field1356 = new class557(this.definition);
		}

		this.field1356.method10531(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1689305792"
	)
	void method3023(int[] var1, short[] var2) {
		if (this.field1356 == null) {
			this.field1356 = new class557(this.definition);
		}

		this.field1356.method10530(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1859745266"
	)
	void method3024() {
		this.field1356 = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "-1463505074"
	)
	void method3019(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "-770341048"
	)
	NpcOverrides method3063() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "485692558"
	)
	void method3027(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "3"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "486172024"
	)
	void method3028() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "990492198"
	)
	void method3014() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "140502690"
	)
	int vmethod3030() {
		return this.definition.field2662 == -1 ? super.defaultHeight : this.definition.field2662;
	}
}
