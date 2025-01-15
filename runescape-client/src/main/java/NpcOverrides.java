import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 7261164173229613339L
	)
	public long field2613;
	@ObfuscatedName("ah")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("az")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ao")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ad")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2613 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-170561838"
	)
	static int method5295(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize] == 1;
			ScriptFrame.method1229(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
