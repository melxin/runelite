import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ax")
	@Export("osName")
	static String osName;
	@ObfuscatedName("ao")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ac")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aj")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("av")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1591948589
	)
	int field1311;
	@ObfuscatedName("an")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1215907791
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -500348149
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -823817623
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2056421703
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("as")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2116456001
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -462032681
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ap")
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
		this.method2742(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
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
					this.field1311 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}
			} else {
				this.method2742(true);
			}
		} else {
			this.method2742(true);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2033350799"
	)
	void method2742(boolean var1) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lvj;",
		garbageValue = "-1882404607"
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
		var1.writeByte((int)(this.brightness * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1311);
		var1.writeByte(this.drawDistance);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "4"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1181470298"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-12307"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-148771084"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-452642864"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-6569891"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1646856013"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1256052585"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-730417350"
	)
	void method2753(int var1) {
		this.field1311 = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "523602283"
	)
	int method2754() {
		return this.field1311;
	}

	@ObfuscatedName("as")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-442221193"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-7"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "714"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1119900416"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "25"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1406083070"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1596216235"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "711193182"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "64"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "962338095"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.eula = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2075584008"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-24960"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "422986468"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "280285469"
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
		TaskHandler.savePreferences();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1008464927"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "78"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1859269660"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		String var3 = var1.toLowerCase();
		int var4 = var3.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			var5 = (var5 << 5) - var5 + var3.charAt(var6);
		}

		return var5;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "94784099"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		if (HttpRequest.topLevelWorldView != null) {
			HttpRequest.topLevelWorldView.scene.method5034(SecureUrlRequester.clientPreferences.getDrawDistance());
		}

		TaskHandler.savePreferences();
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-795431702"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lej;",
		garbageValue = "-1188967714"
	)
	static AttackOption[] method2867() {
		return new AttackOption[]{AttackOption.field1377, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1379, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick};
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "16711680"
	)
	public static int method2745() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)F",
		garbageValue = "-1864992945"
	)
	public static final float method2865(float var0) {
		float var1 = 75.0F;
		float var2 = 10000.0F;
		float var3 = 750000.0F / (10000.0F - 9925.0F * var0);
		return (var3 - 75.0F) / 9925.0F;
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)Z",
		garbageValue = "1945849662"
	)
	static final boolean method2781(Widget var0) {
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
				Client.playerAppearance.method6905(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6906(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6906(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = Message.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
