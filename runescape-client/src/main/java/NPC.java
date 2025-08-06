import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1578625189
	)
	static int field1162;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -252801943
	)
	static int field1163;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("au")
	boolean field1165;
	@ObfuscatedName("as")
	String field1170;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 725177569
	)
	int field1167;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwb;"
	)
	@Export("npcOverheadIcons")
	NPCOverheadIcons npcOverheadIcons;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhu;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1162 = 1;
		field1163 = 1;
	}

	NPC(int var1) {
		super(var1);
		this.field1165 = false;
		this.field1170 = "";
		this.field1167 = 31;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "36"
	)
	void method2663(String var1) {
		this.field1170 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			AnimationSequence var1 = this.method2427();
			AnimationSequence var2 = this.method2407(var1);
			if (var1 == null && var2 == null) {
				var2 = super.field1081;
				if (super.field1081.method9601(30)) {
					return null;
				}
			}

			SequenceDefinition var3 = var1 == null ? null : var1.getSequenceDefinition();
			SequenceDefinition var4 = var2 == null ? null : var2.getSequenceDefinition();
			int var5 = var1 == null ? -1 : var1.getFrame();
			int var6 = var2 == null ? -1 : var2.getFrame();
			Model var7 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var7 = class27.localPlayer.appearance.getModel(var3, var5, var4, var6);
			} else {
				var7 = this.definition.getModel(var3, var5, var4, var6, this.modelOverrides);
			}

			if (var7 == null) {
				return null;
			} else {
				var7.calculateBoundsCylinder();
				super.defaultHeight = var7.height;
				int var8 = var7.indicesCount;
				var7 = this.method2396(var7);
				if (this.definition.size == 1) {
					var7.isSingleTile = true;
				}

				if (super.field1066.method5662() && Client.cycle >= super.npcCycle && Client.cycle < super.field1026) {
					var7.method5472(super.field1066, (short)var8);
				} else {
					var7.method5574();
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-72"
	)
	void method2664(int var1) {
		this.field1167 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "121"
	)
	boolean method2665(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1167 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "944624261"
	)
	final String method2666() {
		if (!this.field1170.isEmpty()) {
			return this.field1170;
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
		descriptor = "(ILke;B)V",
		garbageValue = "44"
	)
	final void method2667(int var1, MoveSpeed var2) {
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

		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2439 == 1) {
			this.method2385();
		}

		this.method2387(var3, var4, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "804056854"
	)
	final void method2668(int var1, int var2, boolean var3) {
		if (super.animationSequence.isActive() && super.animationSequence.getSequenceDefinition().field2439 == 1) {
			this.method2385();
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				this.method2387(var1, var2, MoveSpeed.field3194);
				return;
			}
		}

		this.method2462(var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-46"
	)
	int[] method2713() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11477() : this.definition.method4320();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "36"
	)
	short[] method2672() {
		return this.npcOverheadIcons != null ? this.npcOverheadIcons.method11476() : this.definition.method4310();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "127"
	)
	void method2673(int var1, int var2, short var3) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11479(var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-687356208"
	)
	void method2674(int[] var1, short[] var2) {
		if (this.npcOverheadIcons == null) {
			this.npcOverheadIcons = new NPCOverheadIcons(this.definition);
		}

		this.npcOverheadIcons.method11485(var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1668362448"
	)
	void method2675() {
		this.npcOverheadIcons = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lhu;",
		garbageValue = "1822036123"
	)
	NpcOverrides method2728() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113253836"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhu;B)V",
		garbageValue = "16"
	)
	void method2677(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lhu;B)V",
		garbageValue = "25"
	)
	void method2705(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1615218034"
	)
	int vmethod2682() {
		return this.method2405() ? 0 : this.definition.method4324();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	void method2714() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "264443014"
	)
	void method2680() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	int vmethod2681() {
		return this.definition.field2114 == -1 ? super.defaultHeight : this.definition.field2114;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)[I",
		garbageValue = "-40"
	)
	static int[] method2729(int var0, int var1, int var2, int var3, int var4) {
		int[] var5 = new int[256];

		int var6;
		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6] = class513.method10339(var0, var1, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 64] = class513.method10339(var1, var2, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 128] = class513.method10339(var2, var3, var6);
		}

		for (var6 = 0; var6 < 64; ++var6) {
			var5[var6 + 192] = class513.method10339(var3, var4, var6);
		}

		return var5;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(IIIILxv;Lnu;I)V",
		garbageValue = "-1004964289"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method11723(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
