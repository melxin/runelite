import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ai")
	@Export("name")
	public String name;
	@ObfuscatedName("al")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ac")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1806065849
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1026475387
	)
	int field5169;

	@ObfuscatedSignature(
		descriptor = "(Lvf;Lsr;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5169 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "1"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsi;",
		garbageValue = "-308089342"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "261798949"
	)
	final void method9525(String var1) {
		this.name = ClanSettings.method3771(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "14"
	)
	final void method9526(String var1) {
		this.owner = ClanSettings.method3771(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwt;S)V",
		garbageValue = "26731"
	)
	public final void method9527(Buffer var1) {
		this.method9526(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.method9525(WorldMapID.method6627(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readLargeSmart();
		if (var4 != -1) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field5169 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "195051048"
	)
	public final void method9528(Buffer var1) {
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

			var6.set(var3, ++this.field5169 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "700549413"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsh;I)V",
		garbageValue = "-1230092492"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-627052889"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
