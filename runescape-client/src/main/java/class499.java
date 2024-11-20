import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public abstract class class499 implements class308 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	class544 field5127;

	class499(int var1) {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;IB)V",
		garbageValue = "36"
	)
	abstract void vmethod9344(Buffer var1, int var2);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-2026242031"
	)
	public void method9349(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			class495 var3 = (class495)ScriptEvent.findEnumerated(UserComparator5.method3226(), var2);
			if (var3 != null) {
				switch(var3.field5120) {
				case 0:
					int var4 = var1.readUnsignedByte();
					this.field5127 = TextureProvider.method5186(var4);
					if (this.field5127 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 1:
					var1.readStringCp1252NullCircumfixed();
					break;
				case 2:
					ScriptEvent.findEnumerated(class6.method48(), var1.readUnsignedByte());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
				}
			} else {
				this.vmethod9344(var1, var2);
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "638491425"
	)
	boolean method9346() {
		return this.field5127 != null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-152545867"
	)
	Object method9347() {
		if (this.field5127 == class544.field5392) {
			return 0;
		} else if (this.field5127 == class544.field5391) {
			return -1L;
		} else {
			return this.field5127 == class544.field5399 ? "" : null;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "762089502"
	)
	@Export("focusPasswordWhenUsernameFilled")
	static void focusPasswordWhenUsernameFilled() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1340400621"
	)
	static void method9354() {
		if (class158.worldMap != null) {
			class158.worldMap.method9735(HttpRequest.topLevelWorldView.plane, (HttpResponse.entity.getX() >> 7) + HttpRequest.topLevelWorldView.baseX, (HttpResponse.entity.getY() >> 7) + HttpRequest.topLevelWorldView.baseY, false);
			class158.worldMap.loadCache();
		}

	}
}
