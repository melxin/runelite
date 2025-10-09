import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("ux")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("ah")
	@Export("parameters")
	final Map parameters;
	@ObfuscatedName("af")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ae")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("aq")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ac")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1598516681
	)
	int field1136;
	@ObfuscatedName("ap")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -79788171
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1457037021
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -142494829
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1796898563
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("az")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1590194589
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -346224411
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ao")
	boolean field1141;

	ClientPreferences() {
		this.parameters = new LinkedHashMap();
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
		this.field1141 = true;
		this.method2591(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	ClientPreferences(Buffer var1) {
		this.parameters = new LinkedHashMap();
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
		this.field1141 = true;
		if (var1 != null && var1.array != null) {
			int var2 = var1.readUnsignedByte();
			if (var2 >= 0 && var2 <= 12) {
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
					this.field1136 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}

				if (var2 > 11) {
					this.field1141 = var1.readUnsignedByte() == 1;
				}
			} else {
				this.method2591(true);
			}
		} else {
			this.method2591(true);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-589669194"
	)
	void method2591(boolean var1) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lwj;",
		garbageValue = "67"
	)
	@Export("toBuffer")
	Buffer toBuffer() {
		Buffer var1 = new Buffer(419, true);
		var1.writeByte(12);
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
		var1.writeInt(this.field1136);
		var1.writeByte(this.drawDistance);
		var1.writeByte(this.field1141 ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-568207382"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-957029951"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1187375747"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1341701551"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2030841148"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2040546822"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1812500104"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method2602() {
		return this.field1136;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1674381357"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.field1136 = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "812703245"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("au")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1603080567"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1351345565"
	)
	@Export("getSoundEffectsVolume")
	public int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1733680250"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "62763128"
	)
	@Export("getAreaSoundEffectsVolume")
	public int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-272592289"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-124"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-59"
	)
	void method2615(int var1) {
		this.eula = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-64"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2025869253"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "1021999583"
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
		class404.savePreferences();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-663956078"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1458583799"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "57"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		return GameObject.method5850(var1.toLowerCase());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		if (class547.topLevelWorldView != null) {
			class547.topLevelWorldView.scene.method5195(class154.clientPreferences.getDrawDistance());
		}

		class404.savePreferences();
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-89"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-121"
	)
	boolean method2624() {
		return this.field1141;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1424382530"
	)
	void method2631(boolean var1) {
		this.field1141 = var1;
		class404.savePreferences();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lix;",
		garbageValue = "-92"
	)
	public static FloorOverlayDefinition method2731(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;IB)Z",
		garbageValue = "-116"
	)
	static boolean method2733(AbstractArchive var0, AbstractArchive var1, int var2) {
		byte[] var3 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var3 == null) {
			return false;
		} else {
			int var4 = (var3[1] & 255) << 8 | var3[2] & 255;
			byte[] var5 = var1.getFile(var4, 0);
			return var5 != null;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-96"
	)
	public static int method2732() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;I)V",
		garbageValue = "-1592004308"
	)
	static void method2734(Widget var0, Widget var1) {
		if (var0.type == 0) {
			for (int var2 = var0.field4228; var2 <= var0.field4195; ++var2) {
				Widget var3 = var1.children[var2];
				if (var3 != null && var0.childIndex * -2066937045 == var3.field4173) {
					method2734(var3, var1);
				}
			}
		}

		var1.children[var0.childIndex * -2066937045] = null;
	}

	@ObfuscatedName("oj")
	@ObfuscatedSignature(
		descriptor = "(Lok;B)Ljava/lang/String;",
		garbageValue = "0"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (AsyncRestClient.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && !var0.spellActionName.trim().isEmpty() ? var0.spellActionName : null;
		}
	}
}
