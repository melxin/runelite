import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwc;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aj")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -44662875
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -185634415
	)
	int field5462;

	@ObfuscatedSignature(
		descriptor = "(Lwc;Ltp;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5462 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "2051919340"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltz;",
		garbageValue = "-1205369208"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "922004448"
	)
	final void method10209(String var1) {
		String var3 = class27.base37DecodeLong(VarbitComposition.method4681(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "42"
	)
	final void method10196(String var1) {
		String var3 = class27.base37DecodeLong(VarbitComposition.method4681(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-2004983334"
	)
	public final void method10197(Buffer var1) {
		this.method10196(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.method10209(ApproximateRouteStrategy.method782(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readShortSmartSub();
		if (var4 != -1) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field5462 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "-1400240937"
	)
	public final void method10226(Buffer var1) {
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

			var6.set(var3, ++this.field5462 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "59"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1656508477"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
