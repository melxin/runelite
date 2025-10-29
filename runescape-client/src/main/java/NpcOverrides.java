import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7709241557646364001L
	)
	public long field2099;
	@ObfuscatedName("at")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("ag")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("an")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ae")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2099 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(Lbf;I)V",
		garbageValue = "384338867"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (AbstractWorldMapData.loginState != var0) {
			AbstractWorldMapData.loginState = var0;
		}
	}
}
