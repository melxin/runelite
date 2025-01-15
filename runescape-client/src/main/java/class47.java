import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class47 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	VorbisSample field304;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	RawSound field306;
	@ObfuscatedName("az")
	ReentrantLock field305;

	@ObfuscatedSignature(
		descriptor = "(Lcc;Lbc;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field304 = var1;
		this.field306 = var2;
		this.field305 = new ReentrantLock();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lue;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "744078519"
	)
	static String method906(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lct;",
		garbageValue = "-799303863"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Ljava/lang/String;",
		garbageValue = "972230593"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class298.Widget_unpackTargetMask(class232.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
