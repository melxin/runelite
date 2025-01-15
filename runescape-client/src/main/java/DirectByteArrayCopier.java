import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ay")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "14"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1288883946"
	)
	@Export("set")
	public void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-40"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ClanChannel.widgetDefinition.loadInterface(var0)) {
			Player.updateInterface(ClanChannel.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
