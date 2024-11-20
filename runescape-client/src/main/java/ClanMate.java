import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1507466054"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26155"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = InterfaceParent.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1830251602"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2128501399"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = InterfaceParent.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}
}
