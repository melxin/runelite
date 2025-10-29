import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 796966857
	)
	@Export("sourceLevel")
	int sourceLevel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1749589321
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1278611793
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2026580493
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1394484031
	)
	@Export("sourceIndex")
	int sourceIndex;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 778233715
	)
	@Export("targetLevel")
	int targetLevel;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1272370825
	)
	@Export("targetX")
	int targetX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1087868863
	)
	@Export("targetY")
	int targetY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1590814649
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1701463869
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1357932181
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 105886935
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 201594795
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1850999055
	)
	@Export("startPos")
	int startPos;
	@ObfuscatedName("as")
	@Export("x")
	double x;
	@ObfuscatedName("ac")
	@Export("y")
	double y;
	@ObfuscatedName("ab")
	@Export("z")
	double z;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -157277177
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -876768025
	)
	int field742;
	@ObfuscatedName("ah")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("al")
	double field738;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 687491927
	)
	@Export("id")
	int id;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		this.isMoving = false;
		this.animationSequence = new AnimationSequence();
		this.sourceLevel = var1;
		this.sourceX = var2;
		this.sourceY = var3;
		this.startHeight = var4;
		this.sourceIndex = var5;
		this.targetLevel = var6;
		this.targetX = var7;
		this.targetY = var8;
		this.endHeight = var9;
		this.targetIndex = var10;
		this.id = var11;
		this.cycleStart = var12;
		this.cycleEnd = var13;
		this.slope = var14;
		this.startPos = var15;
		this.animationSequence.setSequence(class181.SpotAnimationDefinition_get(this.id).sequence);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "566725961"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.animationSequence.method9876(30)) {
			return null;
		} else {
			SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.getModel(this.animationSequence.getFrame());
			if (var2 == null) {
				return null;
			} else {
				var2.rotateZ(this.field742);
				return var2;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1841545705"
	)
	protected boolean vmethod5839() {
		if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4938(this.animationSequence.getFrame())) {
			return true;
		} else {
			SpotAnimationDefinition var1 = class181.SpotAnimationDefinition_get(this.id);
			Model var2 = var1.method4564();
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-903085797"
	)
	protected int vmethod5827() {
		return this.animationSequence.isActive() ? this.animationSequence.getSequenceDefinition().animationHeightOffset : 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-124"
	)
	void method2009(int var1, int var2) {
		this.sourceX += var1;
		this.sourceY += var2;
		this.targetX += var1;
		this.targetY += var2;
		this.x += (double)Coord.method7702(var1);
		this.y += (double)Coord.method7702(var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lcv;III)V",
		garbageValue = "1337199369"
	)
	@Export("setDestination")
	void setDestination(WorldViewManager var1, int var2, int var3) {
		if (var2 >= this.cycleStart) {
			ProjectionCoord var4 = DevicePcmPlayerProvider.method327(this.targetIndex, this.targetX, this.targetY, this.targetLevel, var1);
			int var5 = (int)var4.x;
			int var6 = (int)var4.y;
			int var7 = (int)var4.z - this.endHeight;
			var4.release();
			double var12;
			double var14;
			double var16;
			if (!this.isMoving) {
				ProjectionCoord var8 = DevicePcmPlayerProvider.method327(this.sourceIndex, this.sourceX, this.sourceY, this.sourceLevel, var1);
				int var9 = (int)var8.x;
				int var10 = (int)var8.y;
				int var11 = (int)var8.z - this.startHeight;
				var8.release();
				var12 = (double)(var5 - var9);
				var14 = (double)(var6 - var10);
				var16 = Math.sqrt(var12 * var12 + var14 * var14);
				this.x = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : var12 * (double)this.startPos / var16 + (double)var9;
				this.y = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : var14 * (double)this.startPos / var16 + (double)var10;
				this.z = (double)var11;
			}

			double var18 = (double)(this.cycleEnd + 1 - var2);
			double var20 = ((double)var5 - this.x) / var18;
			var12 = ((double)var6 - this.y) / var18;
			var14 = Math.sqrt(var20 * var20 + var12 * var12);
			if (!this.isMoving) {
				this.field738 = -var14 * Math.tan(0.02454369D * (double)this.slope);
			}

			var16 = 2.0D * ((double)var7 - this.z - var18 * this.field738) / (var18 * var18);
			this.isMoving = true;
			this.x += (double)var3 * var20;
			this.y += (double)var3 * var12;
			this.z += this.field738 * (double)var3 + (double)var3 * 0.5D * var16 * (double)var3;
			this.field738 += var16 * (double)var3;
			this.orientation = (int)(Math.atan2(var20, var12) * 325.949D) + 1024 & 2047;
			this.field742 = (int)(Math.atan2(this.field738, var14) * 325.949D) & 2047;
			Client.field315.method11277(Occluder.topLevelWorldView, (int)this.x, (int)this.y, false);
			GrandExchangeOfferUnitPriceComparator.method8811(this.animationSequence, var3, Client.field315);
			Client.field315.method11278();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lql;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1790282734"
	)
	static String method2008(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lut;I)I",
		garbageValue = "1393891487"
	)
	public static int method2029(DynamicArray var0) {
		class585.method11429(var0);
		byte var1 = 0;
		int var2 = var0.method10652();
		int var3 = -1;
		int var8;
		if (var0.field5584 == class586.field5937) {
			int[] var4 = var0.method10650();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var4[var8] > var4[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5584 == class586.field5942) {
			long[] var9 = var0.method10651();

			for (var8 = var1; var8 < var2; ++var8) {
				if (var3 == -1 || var9[var8] > var9[var3]) {
					var3 = var8;
				}
			}
		} else if (var0.field5584 == class586.field5939) {
			String var10 = null;
			Object[] var5 = var0.method10681();

			for (int var6 = var1; var6 < var2; ++var6) {
				String var7 = (String)var5[var6];
				if (var3 == -1 || var7 != null && var7.compareTo(var10) > 0) {
					var3 = var6;
					var10 = var7;
				}
			}
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "1277556611"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			var2 = (var2 << 5) - var2 + Sound.charToByteCp1252(var0.charAt(var3));
		}

		return var2;
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Lof;III)V",
		garbageValue = "-1844377419"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width * -1946208531) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width * -1946208531 - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width * -1946208531) / 2;
		} else {
			var0.x = var1 - var0.width * -1946208531 - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = (var2 - var0.height * -905446999) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * -905446999 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height * -905446999) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height * -905446999 - (var2 * var0.rawY >> 14);
		}

	}
}
