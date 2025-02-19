import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("Projectile")
public final class Projectile extends Renderable
{
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static Archive field996;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1772812479
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2006813189
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 54788331
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1416635687
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1173903731
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 530315563
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1378628045
	)
	int field987;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 459866531
	)
	int field988;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1037752795
	)
	int field989;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -934038291
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 829282721
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1749876389
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2099677945
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1124979031
	)
	int field994;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1387578407
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("av")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ar")
	@Export("x")
	double x;
	@ObfuscatedName("ag")
	@Export("y")
	double y;
	@ObfuscatedName("az")
	@Export("z")
	double z;
	@ObfuscatedName("am")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("aq")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("aw")
	@Export("speed")
	double speed;
	@ObfuscatedName("an")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("at")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 279973185
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2139517277
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1500047213
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1666801517
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = class176.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = WorldMapData_1.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field994 = var10;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-74512933"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field987 = var1;
		this.field988 = var2;
		this.field989 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field987 - this.sourceX);
			double var7 = (double)(this.field988 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX;
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field987 - this.x) / var5;
		this.speedY = ((double)this.field988 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)this.field989 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljf;",
		garbageValue = "-516720946"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class176.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += this.accelerationZ * (double)var1;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			if (!this.sequenceDefinition.isCachedModelIdSet()) {
				this.frameCycle += var1;

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
								return;
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while(this.frame < this.sequenceDefinition.frameIds.length);

						this.frame -= this.sequenceDefinition.frameCount;
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

					this.frame = 0;
				}
			} else {
				this.frame += var1;
				int var2 = this.sequenceDefinition.getMayaAnimFrame();
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Ldy;",
		garbageValue = "-1896183295"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = TextureProvider.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = TextureProvider.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class59.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1620007148"
	)
	public static void method2302(int var0, int var1, int var2, int var3) {
		if (class335.midiRequests.size() > 1 && class335.midiRequests.get(0) != null && ((MidiRequest)class335.midiRequests.get(0)).midiPcmStream.isReady() && class335.midiRequests.get(1) != null && ((MidiRequest)class335.midiRequests.get(1)).midiPcmStream.isReady()) {
			ClientPreferences.method2821(var0, var1, var2, var3);
			class335.field3694.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class335.field3684), class335.field3690));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class335.field3693), class335.musicPlayerStatus));
			class335.field3694.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class335.field3689.get(0) != null && class335.field3689.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class335.field3689.get(0);
				class335.field3689.set(0, class335.midiRequests.get(1));
				class335.field3689.set(1, var5);
			}
		}

	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-979894773"
	)
	public static final void method2303(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field729[var4] = true;
			}
		}

	}
}
