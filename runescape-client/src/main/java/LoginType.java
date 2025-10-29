import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wc")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5892;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5893;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5895;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5898;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5891;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5897;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	static final LoginType field5901;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	public static final LoginType field5899;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -873290805
	)
	final int field5900;
	@ObfuscatedName("au")
	final String field5894;

	static {
		oldscape = new LoginType(5, 0, "", "");
		field5892 = new LoginType(0, 1, "", "");
		field5893 = new LoginType(4, 2, "", "");
		field5895 = new LoginType(3, 3, "", "");
		field5898 = new LoginType(1, 4, "", "");
		field5891 = new LoginType(2, 5, "", "");
		field5897 = new LoginType(8, 6, "", "");
		field5901 = new LoginType(6, 7, "", "");
		field5899 = new LoginType(7, -1, "", "", true, new LoginType[]{oldscape, field5892, field5893, field5898, field5895});
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field5900 = var1;
		this.field5894 = var4;
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lwc;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field5900 = var1;
		this.field5894 = var4;
	}

	public String toString() {
		return this.field5894;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lcg;IIB)V",
		garbageValue = "-13"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (Sound.isWorldMapEvent(var0.type)) {
			AbstractSocket.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class463.WorldMapElement_get(AbstractSocket.worldMapEvent.mapElement);
			var4 = WorldMapSectionType.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class383.getScript(var5);
		}

		if (var4 != null) {
			WorldViewManager.runScriptLogic(var0, var4, var1, var2);
		}

	}
}
