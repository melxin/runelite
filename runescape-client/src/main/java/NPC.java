import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1536866937
	)
	static int field1180;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 527588571
	)
	static int field1181;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ah")
	boolean field1183;
	@ObfuscatedName("af")
	String field1186;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1655508883
	)
	int field1190;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	@Export("npcOverheadIcons")
	NPCOverheadIcons npcOverheadIcons;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1180 = 1;
		field1181 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1183 = false;
		this.field1186 = "";
		this.field1190 = 31;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2136565230"
	)
	void method2778(String var1) {
		this.field1186 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2443();
			AnimationSequence var2 = this.method2470(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1074;
				if (super.field1074.method9634(30)) {
					return null;
				}
			}

			SequenceDefinition var3 = var1 == null ? null : var1.getSequenceDefinition();
			SequenceDefinition var4 = var2 == null ? null : var2.getSequenceDefinition();
			int var5 = var1 == null ? -1 : var1.getFrame();
			int var6 = var2 == null ? -1 : var2.getFrame();
			Model var7 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var7 = class159.localPlayer.appearance.getModel(var3, var5, var4, var6);
			} else {
				var7 = this.definition.getModel(var3, var5, var4, var6, this.modelOverrides);
			}

			if (var7 == null) {
				return null;
			} else {
				var7.calculateBoundsCylinder();
				super.defaultHeight = var7.height;
				int var8 = var7.indicesCount;
				var7 = this.method2534(var7);
				if (this.definition.size == 1) {
					var7.isSingleTile = true;
				}

				if (super.field1071.method5733() && Client.cycle >= super.npcCycle && Client.cycle < super.field1041) {
					var7.method5547(super.field1071, (short)var8);
				} else {
					var7.method5568();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		if (this.definition == null) {
			return false;
		} else if (this.method2540()) {
			return true;
		} else if (this.method2459()) {
			return true;
		} else {
			Model var1;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var1 = class159.localPlayer.appearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
			} else {
				var1 = this.definition.getModel((SequenceDefinition)null, 1, (SequenceDefinition)null, 1, this.modelOverrides);
			}

			return var1 != null && var1.faceAlphas != null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1782158701"
	)
	void method2779(int var1) {
		this.field1190 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-3154"
	)
	boolean method2780(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1190 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "52"
	)
	final String method2828() {
		if (!this.field1186.isEmpty()) {
			return this.field1186;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILkj;I)V",
		garbageValue = "-155003350"
	)
	final void method2782(int var1, MoveSpeed var2) {
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

		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2490 == 1) {
			this.method2446();
		}

		this.method2527(var3, var4, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1969661468"
	)
	final void method2799(int var1, int var2, boolean var3) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2490 == 1) {
			this.method2446();
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2527(var1, var2, MoveSpeed.field3276);
				return;
			}
		}

		this.method2449(var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-367992205"
	)
	int[] method2787() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11629() : this.definition.method4392();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-356913866"
	)
	short[] method2781() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11637() : this.definition.method4394();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "290239828"
	)
	void method2789(int var1, int var2, short var3) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11642(var1, var2, var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1810576667"
	)
	void method2790(int[] var1, short[] var2) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11628(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1926445378"
	)
	void method2791() {
		this.npcOverheadIcons = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhk;",
		garbageValue = "1890127040"
	)
	NpcOverrides method2826() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2136021980"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhk;B)V",
		garbageValue = "-122"
	)
	void method2819(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhk;I)V",
		garbageValue = "1311657425"
	)
	void method2794(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1173982593"
	)
	int vmethod2813() {
		return this.method2538() ? 0 : this.definition.method4396();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1563488147"
	)
	void method2795() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-23888381"
	)
	void method2796() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("di")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int vmethod2797() {
		return this.definition.field2133 == -1 ? super.defaultHeight : this.definition.field2133;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwj;BIS)I",
		garbageValue = "-24368"
	)
	public static int method2823(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lre;I)Lre;",
		garbageValue = "591003887"
	)
	public static class450 method2793(class450 var0) {
		synchronized(class450.field5214) {
			if (class450.field5210 == 0) {
				return new class450(var0);
			} else {
				class450.field5214[--class450.field5210].method9067(var0);
				return class450.field5214[class450.field5210];
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lre;B)Lre;",
		garbageValue = "-9"
	)
	public static final class450 method2851(class450 var0, class450 var1) {
		class450 var2 = method2793(var0);
		var2.method9075(var1);
		return var2;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2129882148"
	)
	static final void method2849(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class154.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
