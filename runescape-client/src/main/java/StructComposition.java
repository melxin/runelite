import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("StructComposition")
public class StructComposition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("StructDefinition_archive")
	public static AbstractArchive StructDefinition_archive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("StructDefinition_cached")
	static EvictingDualNodeHashTable StructDefinition_cached;
	@ObfuscatedName("at")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("params")
	IterableNodeHashTable params;

	static {
		StructDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	StructComposition() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1708629111"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1994852952"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;IB)V",
		garbageValue = "1"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 249) {
			this.params = UrlRequester.readStringIntParameters(var1, this.params);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2087359290"
	)
	@Export("getIntParam")
	public int getIntParam(int var1, int var2) {
		return ObjectSound.method1601(this.params, var1, var2);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1013723568"
	)
	@Export("getStringParam")
	public String getStringParam(int var1, String var2) {
		return TaskHandler.method4701(this.params, var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-68"
	)
	public static byte[] method4358(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-87947730"
	)
	static final int method4357(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lcp;I)Z",
		garbageValue = "905001027"
	)
	static boolean method4351(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (class152.localPlayer != var0) {
				var1 = (Client.drawPlayerNames & 4) != 0;
				return var1 || UserComparator3.method3412() && var0.isFriend() || Widget.method7751() && var0.isFriendsChatMember();
			} else {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			}
		}
	}
}
