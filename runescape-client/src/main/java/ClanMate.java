import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-32"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "968316764"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974840189"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = Actor.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1547196927"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2055919573"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = Actor.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lxs;",
		garbageValue = "-1951555505"
	)
	static PrivateChatMode[] method9580() {
		return new PrivateChatMode[]{PrivateChatMode.field5855, PrivateChatMode.field5856, PrivateChatMode.field5857};
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "135299876"
	)
	static int method9567(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field663 - 7.0D) * 256.0D);
	}
}
