import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ao")
	@Export("name")
	public String name;
	@ObfuscatedName("ad")
	@Export("owner")
	public String owner;
	@ObfuscatedName("an")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1655402779
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -99232999
	)
	int field4989;

	@ObfuscatedSignature(
		descriptor = "(Luo;Lsw;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4989 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lso;",
		garbageValue = "35"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lso;",
		garbageValue = "-1808909632"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1660520999"
	)
	final void method9105(String var1) {
		String var3 = WorldMapRectangle.base37DecodeLong(class429.method8477(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-549241957"
	)
	final void method9109(String var1) {
		String var3 = WorldMapRectangle.base37DecodeLong(class429.method8477(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "864106992"
	)
	public final void method9126(Buffer var1) {
		this.method9109(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.method9105(class92.method2641(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readShortSmartSub();
		if (var4 != -1) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field4989 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "423902017"
	)
	public final void method9108(Buffer var1) {
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

			var6.set(var3, ++this.field4989 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1492487604"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsc;I)V",
		garbageValue = "1219520794"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
