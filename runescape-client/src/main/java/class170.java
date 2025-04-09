import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class170 extends class148 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -3508447851473195791L
	)
	long field1865;
	@ObfuscatedName("an")
	String field1866;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	class170(class151 var1) {
		this.this$0 = var1;
		this.field1865 = -1L;
		this.field1866 = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "53"
	)
	void vmethod3749(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			var1.offset -= 29699747;
			this.field1865 = var1.readLong();
		}

		this.field1866 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1984465176"
	)
	void vmethod3750(ClanSettings var1) {
		var1.method3564(this.field1865, this.field1866);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;B)V",
		garbageValue = "-109"
	)
	public static void method3735(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1597324798"
	)
	public static boolean method3729(int var0) {
		if (class335.field3698.isEmpty()) {
			return false;
		} else {
			MidiRequest var1 = (MidiRequest)class335.field3698.get(0);
			return var1 != null && var0 == var1.musicTrackGroupId;
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "([Lnh;Lnh;ZI)V",
		garbageValue = "-2014773134"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * 624892547;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * 1265510039;
		BufferedNetSocket.method9474(var0, var1.field3962, var1.field3968, var1.id, var1.childIndex * -1626125685, var3, var4, var2);
		if (var1.children != null) {
			BufferedNetSocket.method9474(var1.children, 0, var1.children.length - 1, var1.id, -1, var3, var4, var2);
		}

		if (var1.childIndex * -1626125685 == -1) {
			InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
			if (var5 != null) {
				int var6 = var5.group;
				if (class232.widgetDefinition.loadInterface(var6)) {
					BufferedNetSocket.method9474(class232.widgetDefinition.Widget_interfaceComponents[var6], 0, class232.widgetDefinition.Widget_interfaceComponents[var6].length - 1, -1, -1, var3, var4, var2);
				}
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
