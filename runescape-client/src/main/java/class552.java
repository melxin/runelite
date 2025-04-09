import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vr")
final class class552 implements class551 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lve;B)V",
		garbageValue = "-59"
	)
	public void vmethod10161(Object var1, Buffer var2) {
		this.method10114((Integer)var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)Ljava/lang/Object;",
		garbageValue = "-651548546"
	)
	public Object vmethod10160(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lve;I)V",
		garbageValue = "87545707"
	)
	void method10114(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
