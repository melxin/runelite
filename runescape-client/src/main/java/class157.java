import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class157 extends class165 {
	@ObfuscatedName("ie")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1167216397
	)
	int field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	class157(class166 var1) {
		this.this$0 = var1;
		this.field1793 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	void vmethod4076(Buffer var1) {
		this.field1793 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	void vmethod4077(ClanChannel var1) {
		var1.removeMember(this.field1793);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "834324396"
	)
	static boolean method3868(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field146.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var10.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var3 = class26.method412(class31.field147, var2, new Object[]{(new URL(class31.field147.getCodeBase(), var0)).toString()});
				return var3 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field147.getAppletContext().showDocument(new URL(class31.field147.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class26.method405(class31.field147, "loggedout");
			} catch (Throwable var9) {
			}

			try {
				class31.field147.getAppletContext().showDocument(new URL(class31.field147.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZB)V",
		garbageValue = "4"
	)
	@Export("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		Client.method1485(class81.worldView, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}
}
