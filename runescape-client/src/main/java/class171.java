import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class171 extends class149 {
	@ObfuscatedName("ot")
	@ObfuscatedGetter(
		intValue = 365250699
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -7142222862133581841L
	)
	long field1872;
	@ObfuscatedName("ay")
	String field1869;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class152 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class171(class152 var1) {
		this.this$0 = var1;
		this.field1872 = -1L;
		this.field1869 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "25"
	)
	void vmethod3702(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.field5570;
			this.field1872 = var1.readLong();
		}

		this.field1869 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "2011970201"
	)
	void vmethod3705(ClanSettings var1) {
		var1.method3556(this.field1872, this.field1869);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static void method3693() {
		if (class521.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "-28"
	)
	static final void method3687(String var0, int var1) {
		PacketBufferNode var2 = class272.getPacketBufferNode(ClientPacket.FRIEND_CHAT_SETRANK, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(AsyncRestClient.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByte(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("mv")
	@ObfuscatedSignature(
		descriptor = "(Lnz;IIIIIII)V",
		garbageValue = "-1149803579"
	)
	static final void method3694(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field716) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field716 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class466.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				MilliClock.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				MilliClock.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				MilliClock.invalidateWidget(var0);
				Client.field716 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width * 779142065;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				MilliClock.invalidateWidget(var0);
			}
		}

	}
}
