import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class158 extends class166 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 965396529
	)
	int field1726;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgv;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgv;)V"
	)
	class158(class167 var1) {
		this.this$0 = var1;
		this.field1726 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "1969161379"
	)
	void vmethod3869(Buffer var1) {
		this.field1726 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgk;I)V",
		garbageValue = "-1263140647"
	)
	void vmethod3870(ClanChannel var1) {
		var1.removeMember(this.field1726);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)Ldm;",
		garbageValue = "642980328"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class167.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class167.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = GrandExchangeOfferAgeComparator.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
