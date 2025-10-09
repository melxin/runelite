import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class158 extends class166 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1264877865
	)
	int field1827;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgc;)V"
	)
	class158(class167 var1) {
		this.this$0 = var1;
		this.field1827 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "2073998337"
	)
	void vmethod4154(Buffer var1) {
		this.field1827 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgr;I)V",
		garbageValue = "2002767604"
	)
	void vmethod4151(ClanChannel var1) {
		var1.removeMember(this.field1827);
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-441146242"
	)
	static final void method3965(int var0, int var1) {
		if (Client.hintArrow.method8230() == 4) {
			WorldEntity var2 = (WorldEntity)class547.topLevelWorldView.worldEntities.get((long)Client.hintArrow.method8231());
			if (var2 != null) {
				int var3 = var2.worldView.sizeX * 64;
				int var4 = var2.worldView.sizeY * 64;
				class203.method4563(var2.worldView, var3, var4, Client.hintArrow.method8246() * 2, 0);
				if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
					ArchiveDisk.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
				}

			}
		}
	}
}
