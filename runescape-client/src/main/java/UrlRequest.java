import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -263871951
	)
	static int field1556;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1414257503
	)
	static int field1554;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -154508597
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ag")
	final URL field1555;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -422555101
	)
	volatile int field1559;
	@ObfuscatedName("ah")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1556 = -1;
		field1554 = -2;
	}

	UrlRequest(URL var1) {
		this.field1559 = field1556;
		this.field1555 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1685533273"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1559 != field1556;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "514983085"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "39"
	)
	public String method3590() {
		return this.field1555.toString();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168195709"
	)
	public static final void method3597() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}
}
