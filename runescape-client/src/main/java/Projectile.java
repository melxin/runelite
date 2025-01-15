import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 739120569
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1349592311
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -865782673
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -141392581
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1900685121
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -587423577
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1673977269
	)
	int field985;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1065381413
	)
	int field967;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -706453793
	)
	int field964;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1633593095
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1931084429
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1958929093
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1795420119
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1310000737
	)
	int field975;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -278059355
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ak")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("al")
	@Export("x")
	double x;
	@ObfuscatedName("av")
	@Export("y")
	double y;
	@ObfuscatedName("ag")
	@Export("z")
	double z;
	@ObfuscatedName("aw")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ai")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ar")
	@Export("speed")
	double speed;
	@ObfuscatedName("am")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ap")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1609779233
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1117073495
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1645215705
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1043117971
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
		int var12 = ObjectComposition.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = class33.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
		this.field975 = var10;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "36"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field985 = var1;
		this.field967 = var2;
		this.field964 = var3;
		double var5;
		if (!this.isMoving) {
			var5 = (double)(this.field985 - this.sourceX);
			double var7 = (double)(this.field967 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)this.field985 - this.x) / var5;
		this.speedY = ((double)this.field967 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)this.field964 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1469246305"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += this.speedX * (double)var1;
		this.y += (double)var1 * this.speedY;
		this.z += this.speedZ * (double)var1 + (double)var1 * 0.5D * this.accelerationZ * (double)var1;
		this.speedZ += (double)var1 * this.accelerationZ;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lhv;",
		garbageValue = "-7"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ObjectComposition.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "474346292"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = class31.getPreferencesFile("", StructComposition.field2749.name, true);
			Buffer var1 = class544.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIZIII)J",
		garbageValue = "959258606"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-15"
	)
	static final void method2454(boolean var0) {
		class113.method3178();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = ScriptEvent.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
