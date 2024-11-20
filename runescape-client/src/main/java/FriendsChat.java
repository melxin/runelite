import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 820025783
	)
	static int field4989;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ae")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ac")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -9692197
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1124885465
	)
	int field4992;

	@ObfuscatedSignature(
		descriptor = "(Luk;Lsa;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4992 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lsv;",
		garbageValue = "-27"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsv;",
		garbageValue = "1120116714"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "58"
	)
	final void method8940(String var1) {
		this.name = FileSystem.method4429(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1899490522"
	)
	final void method8939(String var1) {
		this.owner = FileSystem.method4429(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "0"
	)
	public final void method8941(Buffer var1) {
		this.method8939(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.method8940(ScriptFrame.method1171(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readShortSmartSub();
		if (var4 != -1) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field4992 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-2015464446"
	)
	public final void method8938(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}

		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4992 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2122966994"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2008397823"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsc;S)V",
		garbageValue = "4208"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "957031193"
	)
	static int method8962() {
		return Login.loginIndex;
	}
}
