import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("IndexCheck")
public class IndexCheck implements class29 {
	@ObfuscatedName("ay")
	char[] field3056;
	@ObfuscatedName("au")
	int[] field3065;
	@ObfuscatedName("ad")
	public int[] field3059;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -50924041
	)
	public int field3057;
	@ObfuscatedName("ac")
	int[] field3060;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2015532411
	)
	int field3061;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1258374563
	)
	int field3069;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2125689789
	)
	int field3063;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1876751631
	)
	int field3067;
	@ObfuscatedName("ae")
	boolean[] field3058;
	@ObfuscatedName("ax")
	boolean[] field3066;
	@ObfuscatedName("ai")
	boolean[] field3055;
	@ObfuscatedName("ak")
	public char field3068;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 64151427
	)
	public int field3064;

	public IndexCheck() {
		this.field3056 = new char[128];
		this.field3065 = new int[128];
		this.field3059 = new int[128];
		this.field3057 = 0;
		this.field3060 = new int[128];
		this.field3061 = 0;
		this.field3069 = 0;
		this.field3063 = 0;
		this.field3067 = 0;
		this.field3058 = new boolean[112];
		this.field3066 = new boolean[112];
		this.field3055 = new boolean[112];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1127197184"
	)
	public boolean vmethod5612(int var1) {
		this.method5594(var1);
		this.field3058[var1] = true;
		this.field3066[var1] = true;
		this.field3055[var1] = false;
		if (this.field3057 < 128) {
			this.field3059[++this.field3057 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-213709659"
	)
	public boolean vmethod5592(int var1) {
		this.field3058[var1] = false;
		this.field3066[var1] = false;
		this.field3055[var1] = true;
		if (this.field3061 < 128) {
			this.field3060[++this.field3061 - 1] = var1;
		}

		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1961110507"
	)
	public boolean vmethod5590(char var1) {
		int var2 = this.field3063 + 1 & 127;
		if (var2 != this.field3069) {
			this.field3065[this.field3063] = -1;
			this.field3056[this.field3063] = var1;
			this.field3063 = var2;
		}

		return false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "1163673127"
	)
	public boolean vmethod5595(boolean var1) {
		return false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-755231824"
	)
	void method5594(int var1) {
		int var2 = this.field3063 + 1 & 127;
		if (var2 != this.field3069) {
			this.field3065[this.field3063] = var1;
			this.field3056[this.field3063] = 0;
			this.field3063 = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-988010735"
	)
	public void method5603() {
		this.field3069 = this.field3067;
		this.field3067 = this.field3063;
		this.field3057 = 0;
		this.field3061 = 0;
		Arrays.fill(this.field3066, false);
		Arrays.fill(this.field3055, false);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "121"
	)
	public final boolean method5597() {
		if (this.field3067 == this.field3069) {
			return false;
		} else {
			this.field3064 = this.field3065[this.field3069];
			this.field3068 = this.field3056[this.field3069];
			this.field3069 = this.field3069 + 1 & 127;
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1652404492"
	)
	public boolean method5598(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3066[var1] : false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1636775427"
	)
	@Export("isValidIndexInRange")
	public boolean isValidIndexInRange(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3058[var1] : false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method5600(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3055[var1] : false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "56"
	)
	public int[] method5601() {
		int[] var1 = new int[this.field3057];

		for (int var2 = 0; var2 < this.field3057; ++var2) {
			var1[var2] = this.field3059[var2];
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2113721410"
	)
	public int[] method5602() {
		int[] var1 = new int[this.field3061];

		for (int var2 = 0; var2 < this.field3061; ++var2) {
			var1[var2] = this.field3060[var2];
		}

		return var1;
	}

	@ObfuscatedName("ab")
	public static int method5626(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(256.0D * var5);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "1363937954"
	)
	static float method5629(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var3 * var2;
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnz;B)I",
		garbageValue = "-23"
	)
	static int method5621(Widget var0) {
		if (var0.type != 11) {
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = var0.method7321(var1);
			return 1;
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "328602059"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = class272.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(AsyncRestClient.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
