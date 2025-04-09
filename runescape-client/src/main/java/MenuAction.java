import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field917;
	@ObfuscatedName("ql")
	@ObfuscatedSignature(
		descriptor = "[Lws;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -461309019
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1923048325
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -527611115
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1901286549
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -297951819
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1701848227
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("av")
	@Export("action")
	String action;
	@ObfuscatedName("am")
	@Export("target")
	String target;
	@ObfuscatedName("aa")
	boolean field916;

	MenuAction() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "-840097113"
	)
	static float method2256(class135 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1590;
			return (var2 * (var2 * var0.field1584 + var0.field1604) + var0.field1594) * var2 + var0.field1595;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;IB)Ljava/lang/String;",
		garbageValue = "-46"
	)
	static String method2253(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > var1) {
				var2 = var1;
			}

			byte[] var3 = new byte[var2];
			var0.offset += class366.huffman.decompress(var0.array, -2066221813 * var0.offset, var3, 0, var2) * 29699747;
			String var4 = PlayerCompositionColorTextureOverride.decodeStringCp1252(var3, 0, var2);
			return var4;
		} catch (Exception var6) {
			return "Cabbage";
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "5"
	)
	public static void method2254(int var0, int var1) {
		class335.musicPlayerStatus = var0;
		class335.field3692 = var1;
		class335.field3702 = 0;
		class335.field3693 = 0;
		class335.field3698.clear();
		class335.field3699.clear();
		if (class335.midiRequests.isEmpty() || var0 == 0 && var1 == 0) {
			SoundCache.method864();
		} else {
			class335.field3699.add(new DelayFadeTask((SongTask)null, class335.musicPlayerStatus));
			class335.field3699.add(new FadeOutTask((SongTask)null, 0, false, class335.field3692));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class335.midiRequests.iterator();

			while (var4.hasNext()) {
				MidiRequest var5 = (MidiRequest)var4.next();
				var3.add(var5);
			}

			class335.field3699.add(new class459((SongTask)null, var3));
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "34"
	)
	static final int method2255() {
		return Client.menu.menuOptionsCount - 1;
	}
}
