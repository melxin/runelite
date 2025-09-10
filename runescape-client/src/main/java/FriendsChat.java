import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lse;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("ap")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aq")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1887561389
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1704514931
	)
	int field5378;

	@ObfuscatedSignature(
		descriptor = "(Lva;Lse;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5378 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "690274569"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltl;",
		garbageValue = "-102"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method9892(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = class189.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method9884(String var1) {
		this.owner = class346.method7342(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "122"
	)
	public final void method9886(Buffer var1) {
		this.method9884(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (var2 % 37L == 0L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var8 = var2; 0L != var8; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (var5 != 0L) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class447.base37Table[(int)(var11 - 37L * var5)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.method9892(var4);
		this.minKick = var1.readByte();
		var7 = var1.readLargeSmart();
		if (var7 != -1) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field5378 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "-250321513"
	)
	public final void method9887(Buffer var1) {
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

			var6.set(var3, ++this.field5378 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "127"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-271651505"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ltp;I)V",
		garbageValue = "-819942610"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
