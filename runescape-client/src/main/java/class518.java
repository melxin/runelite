import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public abstract class class518 implements class310 {
	@ObfuscatedName("af")
	static byte[][][] field5341;
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 1976217619
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	class563 field5339;

	class518(int var1) {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-2054197163"
	)
	abstract void vmethod10097(Buffer var1, int var2);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "1171517870"
	)
	public void method10096(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class514 var3 = (class514)class175.findEnumerated(MouseRecorder.method2126(), var2);
			if (var3 != null) {
				switch(var3.field5333) {
				case 0:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 1:
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				case 2:
					int var4 = var1.readUnsignedByte();
					this.field5339 = class282.method6156(var4);
					if (this.field5339 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 3:
					class390[] var5 = new class390[]{class390.field4611, class390.field4608, class390.field4610, class390.field4612};
					class175.findEnumerated(var5, var1.readUnsignedByte());
				}
			} else {
				this.vmethod10097(var1, var2);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1950642532"
	)
	boolean method10085() {
		return this.field5339 != null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "839639554"
	)
	Object method10086() {
		if (this.field5339 == class563.field5600) {
			return 0;
		} else if (this.field5339 == class563.field5594) {
			return -1L;
		} else {
			return this.field5339 == class563.field5595 ? "" : null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "733867921"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
		if (var4 == null) {
			var4 = new ChatChannel();
			Messages.Messages_channels.put(var0, var4);
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3);
		Messages.Messages_hashTable.put(var5, (long)var5.count);
		Messages.Messages_queue.add(var5);
		Client.chatCycle = Client.cycleCntr;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	static void method10083() {
		if (Projection.clearLoginScreen) {
			class173.titleboxSprite = null;
			class131.titlebuttonSprite = null;
			class7.runesSprite = null;
			InterfaceParent.leftTitleSprite = null;
			UserComparator4.rightTitleSprite = null;
			class348.logoSprite = null;
			WorldMapSection1.title_muteSprite = null;
			class164.options_buttons_0Sprite = null;
			class82.options_buttons_2Sprite = null;
			Skeleton.worldSelectBackSprites = null;
			MidiPcmStream.worldSelectFlagSprites = null;
			Login.worldSelectArrows = null;
			class320.worldSelectStars = null;
			HttpMethod.field43 = null;
			class584.loginScreenRunesAnimation.method2376();
			HttpResponse.method306(0, 100);
			JagNetThread var0 = class330.field3669;
			var0.method8187(true);
			Projection.clearLoginScreen = false;
		}
	}
}
