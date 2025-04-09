import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2066494245
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1397380011
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1340035301
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 631629789
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 653861525
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("av")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1049769071
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	PlayerCompositionColorTextureOverride field1395;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1574702239"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "-1407261867"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = class231.ItemDefinition_get(this.id);
		return this.field1395 == null ? var1.getModel(this.quantity) : var1.method5564(this.field1395);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1300904730"
	)
	boolean method2989(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lie;",
		garbageValue = "95"
	)
	PlayerCompositionColorTextureOverride method2977() {
		return this.field1395;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lie;I)V",
		garbageValue = "-1652120036"
	)
	void method2978(PlayerCompositionColorTextureOverride var1) {
		this.field1395 = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	void method2979() {
		this.field1395 = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "256"
	)
	public static int method2980() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1441099135"
	)
	static void method2992() {
		if (Login.Login_username == null || Login.Login_username.isEmpty()) {
			if (Renderable.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = Renderable.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "673925099"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = FloorDecoration.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeInt(var0);
		Client.packetWriter.addNode(var2);
	}
}
