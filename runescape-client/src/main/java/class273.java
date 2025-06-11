import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class273 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3096;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3087;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3088;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3089;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3094;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3091;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	static final class273 field3092;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lkq;"
	)
	static final class273[] field3093;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 136649251
	)
	final int field3086;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1934162049
	)
	final int field3095;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1289016071
	)
	final int field3090;

	static {
		field3096 = new class273(4, 8, 8);
		field3087 = new class273(5, 16, 16);
		field3088 = new class273(3, 32, 32);
		field3089 = new class273(2, 48, 48);
		field3094 = new class273(1, 64, 64);
		field3091 = new class273(0, 96, 96);
		field3092 = new class273(6, 128, 128);
		field3093 = FloatProjection.method5436();
		Arrays.sort(field3093, new class280());
	}

	class273(int var1, int var2, int var3) {
		this.field3086 = var1;
		this.field3095 = var2;
		this.field3090 = var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "620059588"
	)
	int method5991() {
		return this.field3090 * this.field3095;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lmk;",
		garbageValue = "117"
	)
	public static PacketBufferNode method5999() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1078160846"
	)
	public static void method5992() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3911.clearFiles();
		PlayerComposition.field3910 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZZB)Lwy;",
		garbageValue = "-18"
	)
	static IndexedSprite method6000(boolean var0, boolean var1) {
		return var0 ? (var1 ? GameEngine.field181 : class82.options_buttons_2Sprite) : (var1 ? ApproximateRouteStrategy.field270 : class164.options_buttons_0Sprite);
	}
}
