import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
@Implements("WorldEntity")
public class WorldEntity extends Node implements CameraFocusableEntity {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("worldEntityCoord")
	public final WorldEntityCoord worldEntityCoord;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 314555321
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	public WorldView worldView;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhv;"
	)
	public class207 field5538;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lto;"
	)
	class519[] field5530;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -535483495
	)
	int field5531;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 965183031
	)
	public int field5535;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	class400 field5532;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -572910741
	)
	int field5534;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	class520 field5527;
	@ObfuscatedName("ai")
	boolean field5536;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	public AnimationSequence field5533;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	public AnimationSequence field5537;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -73411393
	)
	public int field5523;

	@ObfuscatedSignature(
		descriptor = "(ILdd;)V"
	)
	public WorldEntity(int var1, WorldView var2) {
		this.worldEntityCoord = new WorldEntityCoord();
		this.plane = 0;
		this.field5530 = new class519[10];
		this.field5531 = 0;
		this.field5535 = -1;
		this.field5532 = class400.field4844;
		this.field5534 = 31;
		this.field5527 = new class521();
		this.field5536 = false;
		this.field5533 = new AnimationSequence();
		this.field5537 = new AnimationSequence();
		this.field5523 = 0;
		this.plane = var1;
		this.worldView = var2;
		this.field5531 = 0;

		for (int var3 = 0; var3 < 10; ++var3) {
			this.field5530[var3] = new class519();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "446304328"
	)
	@Export("getX")
	public int getX() {
		if (this.field5535 != -1) {
			WorldView var1 = Client.worldViewManager.getWorldView(this.field5535);
			if (var1 != null) {
				return var1.plane;
			}
		}

		return Occluder.topLevelWorldView.plane;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lsj;",
		garbageValue = "-1307993407"
	)
	AnimationSequence method10485() {
		return this.field5523 == 0 && this.field5537.isActive() && this.field5537.getSequenceDefinition().method4925() ? this.field5537 : null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	@Export("initScenePlane")
	public void initScenePlane(boolean var1) {
		AnimationSequence var2 = this.method10485();
		AnimationSequence var3 = var2 != null ? var2 : this.field5533;
		this.worldView.scene.field2939.method9421();
		if (var3 != null && var3.getId() != -1 && var3.method9905() && var3.getSequenceDefinition().isCachedModelIdSet()) {
			class146 var4 = var3.getSequenceDefinition().method4933();
			class251 var5 = var4.field1721.method5545();
			class136 var6 = var5.method5476(0);
			if (var6 != null) {
				var5.method5478(var4, var3.getFrame());
				this.worldView.scene.field2939.method9480(var6.method3785());
				this.worldView.scene.field2939.field5260[13] = -this.worldView.scene.field2939.field5260[13];
			}
		}

		this.worldView.scene.Scene_plane = this.worldView.plane;
		if (var1) {
			this.worldView.scene.field2872 = -1200;
			this.worldView.scene.Scene_scale = 0.01F;
			int var11 = this.field5538.method4658();
			ModelColorOverride var13 = this.worldView.scene.modelColorOverride;
			byte var12 = (byte)(var11 >> 10 & 63);
			byte var8 = (byte)(var11 >> 7 & 7);
			byte var10 = (byte)(var11 & 127);
			var13.method6123(var12, var8, var10, (byte)127);
		} else {
			this.worldView.scene.field2872 = 0;
			this.worldView.scene.Scene_scale = 1.0F;
			this.worldView.scene.modelColorOverride.method6118();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1600404130"
	)
	public boolean method10502() {
		return this.worldView.scene.Scene_scale == 0.01F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "323729723"
	)
	@Export("getZ")
	public int getZ() {
		return this.worldEntityCoord.getZ();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	public int method10529() {
		return this.worldEntityCoord.getCurrentRotationAngle();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-1008881917"
	)
	public WorldEntityCoord method10562() {
		return this.field5531 == 0 ? this.worldEntityCoord : this.field5530[0].field5545;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lhv;I)V",
		garbageValue = "-369965370"
	)
	public void method10494(class207 var1) {
		this.field5538 = var1;
		this.worldView.scene.field2941 = var1.method4628();
		this.worldView.scene.field2873 = var1.method4617();
		this.method10527(var1.method4618());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Lpw;",
		garbageValue = "300"
	)
	public class400 method10495() {
		return this.field5532;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)Lpn;",
		garbageValue = "733677757"
	)
	public class406 method10496(boolean var1) {
		return var1 ? class406.field4905 : this.field5538.method4620();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V",
		garbageValue = "641407105"
	)
	public void method10497(class400 var1) {
		this.field5532 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method10498(int var1) {
		this.field5534 = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "835059066"
	)
	public boolean method10526(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field5534 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1489131279"
	)
	public int method10552() {
		return this.worldView.sizeX * 64 + this.field5538.method4628();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2131959522"
	)
	public int method10508() {
		return this.worldView.sizeY * 64 + this.field5538.method4617();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1115137565"
	)
	void method10527(int var1) {
		this.field5533.setSequence(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "435334531"
	)
	public int method10503() {
		return this.field5537.getId();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1218192168"
	)
	@Export("setPosition")
	public void setPosition(int var1, int var2) {
		for (int var3 = 0; var3 < this.field5530.length; ++var3) {
			this.field5530[var3].field5545.setDirection(var1, var2);
		}

		this.worldEntityCoord.setDirection(var1, var2);
		this.field5527.vmethod10586(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1852269755"
	)
	public final void method10550(WorldEntityCoord var1) {
		int var2 = var1.getTileX();
		int var3 = var1.getTileY();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			int var4 = var1.getX() - this.field5530[0].field5545.getX();
			int var5 = var1.getY() - this.field5530[0].field5545.getY();
			this.method10558(var1, Math.abs(var4), Math.abs(var5));
		} else {
			this.method10506(var1);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V",
		garbageValue = "-1172380292"
	)
	public void method10506(WorldEntityCoord var1) {
		this.worldEntityCoord.method6455(var1);
		this.field5530[0].field5545.method6455(var1);
		this.field5531 = 0;
		this.field5536 = false;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkb;IIS)V",
		garbageValue = "248"
	)
	void method10558(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5531 < 9) {
			++this.field5531;
		}

		for (int var4 = this.field5531; var4 > 0; --var4) {
			class519 var5 = this.field5530[var4];
			this.field5530[var4] = this.field5530[var4 - 1];
			this.field5530[var4 - 1] = var5;
		}

		this.field5530[0].field5545.method6455(var1);
		this.field5530[0].field5542 = Client.cycle;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-84"
	)
	public final void method10492(int var1) {
		if (this.field5531 == 0) {
			this.method10506(this.field5530[0].field5545);
		} else {
			if (!this.field5536) {
				this.field5527.vmethod10584(this.worldEntityCoord, this.field5530[0], var1);
				this.field5536 = true;
			}

			if (this.field5527.vmethod10595(this.worldEntityCoord, var1, this.field5531)) {
				--this.field5531;
				this.field5536 = false;
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)Lrx;",
		garbageValue = "1285583752"
	)
	public ProjectionCoord method10509(int var1, int var2) {
		class456 var3 = BuddyRankComparator.method3741();
		TransformationMatrix var4 = SecureUrlRequester.method3659();
		var3.field5219.method9367(class6.method44(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5215.method9296((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var1 -= this.method10552();
		var2 -= this.method10508();
		var4.method9427(var3);
		var3.method9216();
		ProjectionCoord var5 = var4.method9434((float)var1, 0.0F, (float)var2);
		var4.method9417();
		return var5;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lrx;",
		garbageValue = "1074005120"
	)
	@Export("getProjectionCoord")
	public ProjectionCoord getProjectionCoord(int var1, int var2) {
		class456 var3 = BuddyRankComparator.method3741();
		TransformationMatrix var4 = SecureUrlRequester.method3659();
		var3.field5219.method9367(class6.method44(this.worldEntityCoord.getCurrentRotationAngle()), 0.0F, 0.0F);
		var3.field5215.method9296((float)this.worldEntityCoord.getX(), 0.0F, (float)this.worldEntityCoord.getY());
		var4.method9427(var3);
		var4.method9431();
		var3.method9216();
		ProjectionCoord var5 = var4.method9434((float)var1, 0.0F, (float)var2);
		var5.method9301((float)this.method10552(), 0.0F, (float)this.method10508());
		var4.method9417();
		return var5;
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1790262579"
	)
	@Export("getY")
	public int getY() {
		return this.worldEntityCoord.getX();
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-727737924"
	)
	@Export("getPlane")
	public int getPlane() {
		return this.worldEntityCoord.getY();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1371229274"
	)
	static final void method10566(String var0) {
		PacketBufferNode var1 = ReflectionCheck.getPacketBufferNode(ClientPacket.IGNORE_LIST_ADD, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(AccessFile.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
