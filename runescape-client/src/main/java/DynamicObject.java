import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 113093739
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1036644641
	)
	@Export("type")
	final int type;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1825508121
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1174921109
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -692508821
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -447773189
	)
	@Export("y")
	final int y;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	final AnimationSequence field785;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrl;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1422708209
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldm;IIIIIIIZLiy;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		this.field785 = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		if (var8 != -1) {
			this.field785.setSequence(var8);
			this.animationSequence.setSequence(var8);
			SequenceDefinition var11 = this.field785.getSequenceDefinition();
			this.cycleStart = Client.cycle - 1;
			if (var9 && var11.frameCount != -1) {
				this.field785.method9638();
			}

			if (var10 instanceof DynamicObject) {
				DynamicObject var12 = (DynamicObject)var10;
				if (var12.field785.getId() == var8) {
					if (var11.restartMode == 0) {
						this.field785.setSequence(var12.field785);
						this.cycleStart = var12.cycleStart;
					}

					this.animationSequence.setSequence(var12.animationSequence);
				} else if (!var12.field785.method9635()) {
					this.animationSequence.setSequence(var12.animationSequence);
				} else {
					this.animationSequence.setSequence(var12.field785);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-461042632"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = TileItem.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			int var12 = Client.cycle - this.cycleStart;
			this.cycleStart = Client.cycle;
			Client.field472.method11014(this.worldView, var10, var11, false);
			int var13 = CollisionMap.method6234(this.field785, var12, Client.field472);
			Client.field472.method11013();
			if ((var13 & 1) != 0 && (var13 & 8) != 0) {
				this.field785.reset();
			}

			if (this.field785.method9634(30)) {
				if (this.animationSequence.isActive()) {
					int var14 = CollisionMap.method6234(this.animationSequence, var12, (class466)null);
					if ((var14 & 1) != 0 && (var14 & 8) != 0) {
						this.animationSequence.reset();
					}

					if (!this.animationSequence.method9634(30)) {
						return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.animationSequence.getSequenceDefinition(), this.animationSequence.getFrame());
					}
				}

				return null;
			} else {
				return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.field785.getSequenceDefinition(), this.field785.getFrame());
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	protected boolean vmethod5447() {
		ObjectComposition var1 = TileItem.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return false;
		} else if (this.field785.isActive() && this.field785.getSequenceDefinition().method4823(this.field785.getFrame())) {
			return true;
		} else if (this.animationSequence.isActive() && this.animationSequence.getSequenceDefinition().method4823(this.animationSequence.getFrame())) {
			return true;
		} else {
			Model var2 = var1.getModelDynamic(this.type, this.orientation, (int[][])null, 0, 0, 0, (SequenceDefinition)null, -1);
			return var2 != null && var2.faceAlphas != null;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-1485830663"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				Clock.method6092(0, 0);
			} else if (var5 != -1 && !WorldMapData_0.method6385(var5) && class154.clientPreferences.getMusicVolume() != 0) {
				ArrayList var6 = new ArrayList();

				for (int var7 = 0; var7 < var0.size(); ++var7) {
					var6.add(new MidiRequest(class443.field5180, (Integer)var0.get(var7), 0, class154.clientPreferences.getMusicVolume(), false));
				}

				if (Client.playingJingle) {
					class108.method3468(var6, var1, var2, var3, var4);
				} else {
					TextureProvider.method5489(var6, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
