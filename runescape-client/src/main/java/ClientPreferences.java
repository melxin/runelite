import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ad")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("an")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ae")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ax")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 360808631
	)
	int field1308;
	@ObfuscatedName("ac")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 171288421
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1833607591
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -990493507
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1053727429
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("aa")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1867215081
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -971491863
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("av")
	@Export("parameters")
	final Map parameters;

	ClientPreferences() {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		this.method2958(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	ClientPreferences(Buffer var1) {
		this.hideUsername = false;
		this.displayFps = false;
		this.brightness = 0.8D;
		this.musicVolume = 127;
		this.soundEffectsVolume = 127;
		this.areaSoundEffectsVolume = 127;
		this.eula = -1;
		this.rememberedUsername = null;
		this.windowMode = 1;
		this.drawDistance = 25;
		this.parameters = new LinkedHashMap();
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 11) {
				if (var1.readUnsignedByte() == 1) {
					this.roofsHidden = true;
				}

				if (var2 > 1) {
					this.titleMusicDisabled = var1.readUnsignedByte() == 1;
				}

				if (var2 > 3) {
					this.windowMode = var1.readUnsignedByte();
				}

				if (var2 > 2) {
					int var3 = var1.readUnsignedByte();

					for (int var4 = 0; var4 < var3; ++var4) {
						int var5 = var1.readInt();
						int var6 = var1.readInt();
						this.parameters.put(var5, var6);
					}
				}

				if (var2 > 4) {
					this.rememberedUsername = var1.readStringCp1252NullTerminatedOrNull();
				}

				if (var2 > 5) {
					this.hideUsername = var1.readBoolean();
				}

				if (var2 > 6) {
					this.brightness = (double)var1.readUnsignedByte() / 100.0D;
					this.musicVolume = var1.readUnsignedByte();
					this.soundEffectsVolume = var1.readUnsignedByte();
					this.areaSoundEffectsVolume = var1.readUnsignedByte();
				}

				if (var2 > 7) {
					this.eula = var1.readUnsignedByte();
				}

				if (var2 > 8) {
					this.displayFps = var1.readUnsignedByte() == 1;
				}

				if (var2 > 9) {
					this.field1308 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}
			} else {
				this.method2958(true);
			}
		} else {
			this.method2958(true);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2087838146"
	)
	void method2958(boolean var1) {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lvy;",
		garbageValue = "1462724230"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(418, true);
		var1.writeByte(11);
		var1.writeByte(this.roofsHidden ? 1 : 0);
		var1.writeByte(this.titleMusicDisabled ? 1 : 0);
		var1.writeByte(this.windowMode);
		var1.writeByte(this.parameters.size());
		Iterator var2 = this.parameters.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.writeInt((Integer)var3.getKey());
			var1.writeInt((Integer)var3.getValue());
		}

		var1.writeStringCp1252NullTerminated(this.rememberedUsername != null ? this.rememberedUsername : "");
		var1.writeBoolean(this.hideUsername);
		var1.writeByte((int)(100.0D * this.brightness));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1308);
		var1.writeByte(this.drawDistance);
		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-65"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1009742491"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-417120502"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-46"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "60"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1833834664"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1426224813"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1572518213"
	)
	void method2891(int var1) {
		this.field1308 = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "653163305"
	)
	int method2892() {
		return this.field1308;
	}

	@ObfuscatedName("aa")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-92"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1119003790"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-87"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1475397758"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1972871382"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1048848"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "18"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1521571253"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1193428060"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-971303773"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1679225530"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		Projectile.savePreferences();
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "120"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-992090634"
	)
	@Export("put")
	void put(String var1, int var2) {
		int var3 = this.getParameterKey(var1);
		if (this.parameters.size() >= 10 && !this.parameters.containsKey(var3)) {
			Iterator var4 = this.parameters.entrySet().iterator();
			var4.next();
			var4.remove();
		}

		this.parameters.put(var3, var2);
		Projectile.savePreferences();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-673907911"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-6"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "370313994"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		return class419.method8220(var1.toLowerCase());
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-480240068"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		class230.method5124();
		Projectile.savePreferences();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1062681713"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("ao")
	public static int method2988(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1874840281"
	)
	static void method2989() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.length() == 0) {
			class150.setLoginResponseString("", "Please enter your username/email address.", "");
		} else if (Login.Login_password.length() == 0) {
			class150.setLoginResponseString("", "Please enter your password.", "");
		} else {
			class150.setLoginResponseString("", "Connecting to server...", "");
			Client.authenticationScheme = class544.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
			class360.updateGameState(20);
		}
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		FloatProjection.method4443();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
