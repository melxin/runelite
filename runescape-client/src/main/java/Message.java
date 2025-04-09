import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 83124477
	)
	@Export("count")
	int count;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 717380949
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1466319835
	)
	@Export("type")
	int type;
	@ObfuscatedName("af")
	@Export("sender")
	String sender;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lwp;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aq")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("av")
	@Export("text")
	String text;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-356390334"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = class211.method4779();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-81"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class223.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "901059465"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1101714900"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class223.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-379431246"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(Script.method2362(this.sender), class339.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILve;I)Lie;",
		garbageValue = "-872826664"
	)
	public static PlayerCompositionColorTextureOverride method1223(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		boolean var5 = (var2 & 4) != 0;
		boolean var6 = (var2 & 8) != 0;
		PlayerCompositionColorTextureOverride var7 = new PlayerCompositionColorTextureOverride(var0);
		int var8;
		int[] var9;
		boolean var10;
		int var11;
		short var12;
		if (var3) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRecolorTo != null && var9.length == var7.playerCompositionRecolorTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRecolorTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var4) {
			var8 = var1.readUnsignedByte();
			var9 = new int[]{var8 & 15, var8 >> 4 & 15};
			var10 = var7.playerCompositionRetextureTo != null && var9.length == var7.playerCompositionRetextureTo.length;

			for (var11 = 0; var11 < 2; ++var11) {
				if (var9[var11] != 15) {
					var12 = (short)var1.readUnsignedShort();
					if (var10) {
						var7.playerCompositionRetextureTo[var9[var11]] = var12;
					}
				}
			}
		}

		if (var5) {
			var7.field2538 = var1.readUnsignedShort();
			var7.field2539 = var1.readUnsignedShort();
		}

		if (var6) {
			var7.field2545 = var1.readUnsignedShort();
			var7.field2544 = var1.readUnsignedShort();
		}

		return var7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;B)V",
		garbageValue = "0"
	)
	public static void method1224(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
		WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			byte[] var3 = var0.takeFile(35, var2);
			WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
			if (var3 != null) {
				WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
				WorldMapElement.WorldMapElement_cached[var2].method5052();
			}
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIIB)V",
		garbageValue = "51"
	)
	static void method1225(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, GraphicsObject.getTileHeight(DevicePcmPlayerProvider.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		DevicePcmPlayerProvider.worldView.projectiles.addFirst(var14);
	}
}
