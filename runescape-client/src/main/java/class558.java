import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vm")
public class class558 implements class468 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldr;"
	)
	WorldView field5761;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1175830375
	)
	int field5759;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -560971733
	)
	int field5760;
	@ObfuscatedName("ac")
	boolean field5762;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lij;IB)V",
		garbageValue = "-52"
	)
	public void vmethod10858(SequenceDefinition var1, int var2) {
		if (this.field5761 != null) {
			class148.method3797(this.field5761, var1, var2, this.field5759, this.field5760, this.field5762);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIZS)V",
		garbageValue = "-3609"
	)
	public void method10862(WorldView var1, int var2, int var3, boolean var4) {
		this.field5761 = var1;
		this.field5759 = var2;
		this.field5760 = var3;
		this.field5762 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "21817"
	)
	public void method10859() {
		this.field5761 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxi;",
		garbageValue = "-1412261425"
	)
	static PrivateChatMode[] method10860() {
		return new PrivateChatMode[]{PrivateChatMode.field6070, PrivateChatMode.field6071, PrivateChatMode.field6072};
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "495857969"
	)
	static final void method10857(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class36.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
