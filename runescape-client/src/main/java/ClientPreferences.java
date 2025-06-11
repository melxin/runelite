import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 2037321977
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("vj")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("al")
	@Export("parameters")
	final Map parameters;
	@ObfuscatedName("ac")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("aa")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("am")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("ah")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1923069265
	)
	int field1126;
	@ObfuscatedName("au")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1155204527
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -842595355
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2013299677
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1953858913
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("az")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1611794279
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1395618775
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("ae")
	boolean field1121;

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
		this.field1121 = true;
		this.method2402(true);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
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
		this.field1121 = true;
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
					this.field1126 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}

				if (var2 > 11) {
					this.field1121 = var1.readUnsignedByte() == 1;
				}
			} else {
				this.method2402(true);
			}
		} else {
			this.method2402(true);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-354573289"
	)
	void method2402(boolean var1) {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lwt;",
		garbageValue = "-12"
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
		var1.writeByte((int)(this.brightness * 100.0D));
		var1.writeByte(this.musicVolume);
		var1.writeByte(this.soundEffectsVolume);
		var1.writeByte(this.areaSoundEffectsVolume);
		var1.writeByte(this.eula);
		var1.writeByte(this.displayFps ? 1 : 0);
		var1.writeInt(this.field1126);
		var1.writeByte(this.drawDistance);
		var1.writeByte(this.field1121 ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1071324675"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-606366659"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1940932682"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "83"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-93"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2047442229"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-169090307"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "37"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	int method2413() {
		return this.field1126;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "35"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.field1126 = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "37"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("az")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-562665387"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1445922129"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-352091872"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1419284958"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1854878187"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-822849015"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2009526998"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605891095"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1171652884"
	)
	void method2426(int var1) {
		this.eula = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-25"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-758514453"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)V",
		garbageValue = "-1231077917"
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
		Messages.savePreferences();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-3"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1132807526"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "128"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1808719243"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		class203.method4300();
		Messages.savePreferences();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-819637604"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1043862063"
	)
	boolean method2435() {
		return this.field1121;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1970740865"
	)
	void method2436(boolean var1) {
		this.field1121 = var1;
		Messages.savePreferences();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lih;",
		garbageValue = "2"
	)
	public static HitSplatDefinition method2477(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = UserComparator5.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lkt;",
		garbageValue = "19"
	)
	public static MoveSpeed[] method2525() {
		return new MoveSpeed[]{MoveSpeed.field3117, MoveSpeed.field3119, MoveSpeed.field3121, MoveSpeed.field3118};
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)D",
		garbageValue = "53"
	)
	public static double method2527(int var0) {
		return (double)VertexNormal.method5706(var0) / 65536.0D;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-1413898369"
	)
	static int method2470(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			ObjectComposition var4 = HealthBarConfig.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
