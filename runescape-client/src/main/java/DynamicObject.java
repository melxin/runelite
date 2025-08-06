import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldj;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 117616549
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1370420631
	)
	@Export("type")
	final int type;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 533161513
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1169014325
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -723908345
	)
	@Export("x")
	final int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -202053319
	)
	@Export("y")
	final int y;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	final AnimationSequence field797;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("animationSequence")
	final AnimationSequence animationSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1451529473
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldj;IIIIIIIZLiq;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		this.field797 = new AnimationSequence();
		this.animationSequence = new AnimationSequence();
		if (var8 != -1) {
			this.field797.setSequence(var8);
			this.animationSequence.setSequence(var8);
			SequenceDefinition var11 = this.field797.getSequenceDefinition();
			this.cycleStart = Client.cycle - 1;
			if (var9 && var11.frameCount != -1) {
				this.field797.method9613();
			}

			if (var10 instanceof DynamicObject) {
				DynamicObject var12 = (DynamicObject)var10;
				if (var12.field797.getId() == var8) {
					if (var11.restartMode == 0) {
						this.field797.setSequence(var12.field797);
						this.cycleStart = var12.cycleStart;
					}

					this.animationSequence.setSequence(var12.animationSequence);
				} else if (!var12.field797.method9581()) {
					this.animationSequence.setSequence(var12.animationSequence);
				} else {
					this.animationSequence.setSequence(var12.field797);
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Ljx;",
		garbageValue = "15"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = SpriteMask.getObjectDefinition(this.id);
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
			int var9 = var8[var5][var7] + var8[var4][var6] + var8[var5][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			int var12 = Client.cycle - this.cycleStart;
			this.cycleStart = Client.cycle;
			Client.field426.method10913(this.worldView, var10, var11, false);
			int var13 = AttackOption.method2764(this.field797, var12, Client.field426);
			Client.field426.method10914();
			if ((var13 & 1) != 0 && (var13 & 8) != 0) {
				this.field797.reset();
			}

			if (this.field797.method9601(30)) {
				if (this.animationSequence.isActive()) {
					int var14 = AttackOption.method2764(this.animationSequence, var12, (class464)null);
					if ((var14 & 1) != 0 && (var14 & 8) != 0) {
						this.animationSequence.reset();
					}

					if (!this.animationSequence.method9601(30)) {
						return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.animationSequence.getSequenceDefinition(), this.animationSequence.getFrame());
					}
				}

				return null;
			} else {
				return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.field797.getSequenceDefinition(), this.field797.getFrame());
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-86"
	)
	static void method1988() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2092670116"
	)
	static void method1987(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2135382816"
	)
	static void method1984() {
		for (class271 var0 = (class271)Client.field416.last(); var0 != null; var0 = (class271)Client.field416.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkq;",
		garbageValue = "-24"
	)
	static RouteStrategy method1990(int var0, int var1) {
		Client.field590.approxDestinationX = var0;
		Client.field590.approxDestinationY = var1;
		Client.field590.approxDestinationSizeX = 1;
		Client.field590.approxDestinationSizeY = 1;
		return Client.field590;
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lox;I)Z",
		garbageValue = "-1061158720"
	)
	static final boolean method1989(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method7516(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7517(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7517(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class291.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
