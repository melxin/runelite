import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ClientPreferences")
public class ClientPreferences {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1604886559
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("au")
	@Export("parameters")
	final Map parameters;
	@ObfuscatedName("as")
	@Export("roofsHidden")
	boolean roofsHidden;
	@ObfuscatedName("ah")
	@Export("hideUsername")
	boolean hideUsername;
	@ObfuscatedName("ap")
	@Export("titleMusicDisabled")
	boolean titleMusicDisabled;
	@ObfuscatedName("am")
	@Export("displayFps")
	boolean displayFps;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1328175181
	)
	int field1124;
	@ObfuscatedName("ag")
	@Export("brightness")
	double brightness;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1571234849
	)
	@Export("musicVolume")
	int musicVolume;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -41942377
	)
	@Export("soundEffectsVolume")
	int soundEffectsVolume;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 287814645
	)
	@Export("areaSoundEffectsVolume")
	int areaSoundEffectsVolume;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -473506497
	)
	@Export("eula")
	int eula;
	@ObfuscatedName("ar")
	@Export("rememberedUsername")
	String rememberedUsername;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 783489357
	)
	@Export("windowMode")
	int windowMode;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 674096531
	)
	@Export("drawDistance")
	int drawDistance;
	@ObfuscatedName("aq")
	boolean field1133;

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
		this.field1133 = true;
		this.method2524(true);
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
		this.field1133 = true;
		if (var1 != null && var1.offset != null) {
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
					this.field1124 = var1.readInt();
				}

				if (var2 > 10) {
					this.drawDistance = var1.readUnsignedByte();
				}

				if (var2 > 11) {
					this.field1133 = var1.readUnsignedByte() == 1;
				}
			} else {
				this.method2524(true);
			}
		} else {
			this.method2524(true);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1790624211"
	)
	void method2524(boolean var1) {
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lwj;",
		garbageValue = "5"
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
		var1.writeInt(this.field1124);
		var1.writeByte(this.drawDistance);
		var1.writeByte(this.field1133 ? 1 : 0);
		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1346019914"
	)
	@Export("isRoofsHidden")
	boolean isRoofsHidden() {
		return this.roofsHidden;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1748187428"
	)
	@Export("updateRoofsHidden")
	void updateRoofsHidden(boolean var1) {
		this.roofsHidden = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1645305057"
	)
	@Export("isUsernameHidden")
	boolean isUsernameHidden() {
		return this.hideUsername;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "28"
	)
	@Export("updateHideUsername")
	void updateHideUsername(boolean var1) {
		this.hideUsername = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "84"
	)
	@Export("isTitleMusicDisabled")
	boolean isTitleMusicDisabled() {
		return this.titleMusicDisabled;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-541558897"
	)
	@Export("updateTitleMusicDisabled")
	void updateTitleMusicDisabled(boolean var1) {
		this.titleMusicDisabled = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2127736767"
	)
	@Export("toggleDisplayFps")
	void toggleDisplayFps() {
		this.updateDisplayFps(!this.displayFps);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-885387198"
	)
	@Export("isDisplayingFps")
	boolean isDisplayingFps() {
		return this.displayFps;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "109"
	)
	@Export("updateDisplayFps")
	void updateDisplayFps(boolean var1) {
		this.displayFps = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method2525() {
		return this.field1124;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("updateEULA")
	void updateEULA(int var1) {
		this.field1124 = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "127"
	)
	@Export("getBrightness")
	double getBrightness() {
		return this.brightness;
	}

	@ObfuscatedName("at")
	@Export("updateBrightness")
	void updateBrightness(double var1) {
		this.brightness = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1331787500"
	)
	@Export("getMusicVolume")
	int getMusicVolume() {
		return this.musicVolume;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "6"
	)
	@Export("updateMusicVolume")
	void updateMusicVolume(int var1) {
		this.musicVolume = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-150650787"
	)
	@Export("getSoundEffectsVolume")
	int getSoundEffectsVolume() {
		return this.soundEffectsVolume;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "379668236"
	)
	@Export("updateSoundEffectVolume")
	void updateSoundEffectVolume(int var1) {
		this.soundEffectsVolume = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "190214644"
	)
	@Export("getAreaSoundEffectsVolume")
	int getAreaSoundEffectsVolume() {
		return this.areaSoundEffectsVolume;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133527638"
	)
	@Export("updateAreaSoundEffectsVolume")
	void updateAreaSoundEffectsVolume(int var1) {
		this.areaSoundEffectsVolume = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1692868952"
	)
	@Export("getRememberedUsername")
	String getRememberedUsername() {
		return this.rememberedUsername;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1669029904"
	)
	@Export("updateRememberedUsername")
	void updateRememberedUsername(String var1) {
		this.rememberedUsername = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-946169240"
	)
	@Export("getEULA")
	int getEULA() {
		return this.eula;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1674724596"
	)
	void method2539(int var1) {
		this.eula = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2009248246"
	)
	@Export("getWindowMode")
	int getWindowMode() {
		return this.windowMode;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1568803728"
	)
	@Export("updateWindowMode")
	void updateWindowMode(int var1) {
		this.windowMode = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "24"
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
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-26"
	)
	@Export("containsKey")
	boolean containsKey(String var1) {
		int var2 = this.getParameterKey(var1);
		return this.parameters.containsKey(var2);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1037515634"
	)
	@Export("getParameterValue")
	int getParameterValue(String var1) {
		int var2 = this.getParameterKey(var1);
		return !this.parameters.containsKey(var2) ? 0 : (Integer)this.parameters.get(var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1873035551"
	)
	@Export("getParameterKey")
	int getParameterKey(String var1) {
		return WorldMapAreaData.method6901(var1.toLowerCase());
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "432641517"
	)
	@Export("setDrawDistance")
	void setDrawDistance(int var1) {
		this.drawDistance = var1;
		if (class7.topLevelWorldView != null) {
			class7.topLevelWorldView.scene.method5320(FriendSystem.clientPreferences.getDrawDistance());
		}

		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1560887056"
	)
	@Export("getDrawDistance")
	int getDrawDistance() {
		return this.drawDistance;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1932142722"
	)
	boolean method2548() {
		return this.field1133;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-104"
	)
	void method2522(boolean var1) {
		this.field1133 = var1;
		SceneTilePaint.savePreferences();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lrm;",
		garbageValue = "1998995038"
	)
	public static class448 method2599(float var0, float var1, float var2) {
		synchronized(class448.field5055) {
			if (class448.field5061 == 0) {
				return new class448(var0, var1, var2);
			} else {
				class448.field5055[--class448.field5061].method9022(var0, var1, var2);
				return class448.field5055[class448.field5061];
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;B)V",
		garbageValue = "6"
	)
	public static void method2621(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
		WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			byte[] var3 = var0.takeFile(35, var2);
			WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
			if (var3 != null) {
				WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
				WorldMapElement.WorldMapElement_cached[var2].method4175();
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lgs;",
		garbageValue = "1842187596"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "6638"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		WorldMapID.method6815();
		ArchiveLoader.method2093(var0, var1, var2, var3);
		class7.topLevelWorldView.scene.setViewportWalking();

		for (int var4 = 0; var4 < class7.topLevelWorldView.field1143.method9810(); ++var4) {
			WorldEntity var5 = (WorldEntity)class7.topLevelWorldView.worldEntities.get((long)class7.topLevelWorldView.field1143.method9817(var4));
			if (var5 != null) {
				var5.worldView.scene.setViewportWalking();
			}
		}

	}
}
