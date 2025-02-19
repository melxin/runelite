import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	@ObfuscatedName("bi")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;

	AbstractSocket() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "128"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-973602939"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1634388430"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "99"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "125"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-776875768"
	)
	@Export("close")
	public abstract void close();
}
