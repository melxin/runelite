import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ah")
	@Export("owner")
	public String owner;
	@ObfuscatedName("af")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1443159417
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -79410245
	)
	int field5438;

	@ObfuscatedSignature(
		descriptor = "(Lvt;Lsq;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5438 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltk;",
		garbageValue = "1771695542"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltk;",
		garbageValue = "-78"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-126"
	)
	final void method9989(String var1) {
		String var3 = class277.base37DecodeLong(class374.method8159(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1949611912"
	)
	final void method9977(String var1) {
		String var3 = class277.base37DecodeLong(class374.method8159(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-8"
	)
	public final void method9978(Buffer var1) {
		this.method9977(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.method9989(SoundCache.method3222(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readShortSmartSub();
		if (var4 != -1) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, ++this.field5438 - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "-26"
	)
	public final void method9987(Buffer var1) {
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

			var6.set(var3, ++this.field5438 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
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
		garbageValue = "-1327140137"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltp;I)V",
		garbageValue = "707591018"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
