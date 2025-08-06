import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("AddRequestTask")
public class AddRequestTask extends SongTask {
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lxa;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;

	@ObfuscatedSignature(
		descriptor = "(Lsj;)V"
	)
	public AddRequestTask(SongTask var1) {
		super(var1);
		super.field5191 = "AddRequestTask";
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1329200530"
	)
	public boolean vmethod9672() {
		while (!class337.field3791.isEmpty()) {
			MidiRequest var1 = (MidiRequest)class337.field3791.peek();
			if (var1 == null) {
				class337.field3791.pop();
			} else {
				var1.midiPcmStream = this.method9628();
				class337.midiRequests.add(var1);
				class337.field3791.pop();
			}
		}

		return true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lnm;",
		garbageValue = "737729121"
	)
	MidiPcmStream method9628() {
		MidiPcmStream var1 = null;
		Iterator var2 = class337.field3794.iterator();

		while (true) {
			MidiPcmStream var3;
			do {
				do {
					if (!var2.hasNext()) {
						if (var1 != null) {
							++var1.field3806;
							if (var1.method7132() == 0 && var1.isReady()) {
								var1.clear();
								var1.method7210();
								var1.setPcmStreamVolume(0);
							}
						}

						return var1;
					}

					var3 = (MidiPcmStream)var2.next();
				} while(var3 == null);
			} while(var1 != null && var1.field3806 <= var3.field3806 && (var3.method7132() != 0 || !var3.isReady()));

			var1 = var3;
		}
	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(Lox;III)V",
		garbageValue = "-1650133914"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = var0.rawY + (var2 - var0.height * -1326764757) / 2;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * -1326764757 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height * -1326764757) / 2;
		} else {
			var0.y = var2 - var0.height * -1326764757 - (var2 * var0.rawY >> 14);
		}

	}
}
