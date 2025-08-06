import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("av")
	@Export("name")
	public String name;
	@ObfuscatedName("au")
	@Export("owner")
	public String owner;
	@ObfuscatedName("as")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1609222115
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 734901931
	)
	int field5277;

	@ObfuscatedSignature(
		descriptor = "(Lvy;Lsx;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5277 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ltb;",
		garbageValue = "0"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltb;",
		garbageValue = "-4"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-72"
	)
	final void method9915(String var1) {
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

		while (var5 % 37L == 0L && var5 != 0L) {
			var5 /= 37L;
		}

		String var10 = MilliClock.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "988168988"
	)
	final void method9894(String var1) {
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

		String var10 = MilliClock.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2008217147"
	)
	public final void method9898(Buffer var1) {
		this.method9894(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		long var5 = var2;
		String var4;
		int var7;
		if (var2 > 0L && var2 < 6582952005840035281L) {
			if (0L == var2 % 37L) {
				var4 = null;
			} else {
				var7 = 0;

				for (long var8 = var2; var8 != 0L; var8 /= 37L) {
					++var7;
				}

				StringBuilder var10 = new StringBuilder(var7);

				while (0L != var5) {
					long var11 = var5;
					var5 /= 37L;
					var10.append(class443.base37Table[(int)(var11 - 37L * var5)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.method9915(var4);
		this.minKick = var1.readByte();
		var7 = var1.readShortSmartSub();
		if (var7 != -1) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field5277 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "1423507213"
	)
	public final void method9919(Buffer var1) {
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

			var6.set(var3, ++this.field5277 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lts;I)V",
		garbageValue = "-1517911516"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-842759049"
	)
	public static int method9923(int var0) {
		return class531.field5461[var0 & 16383];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ltn;III)V",
		garbageValue = "-1778693379"
	)
	public static void method9903(DynamicArray var0, int var1, int var2) {
		class150.method3792(var0, (class570)null, true);
		if (var1 >= 0 && var2 >= 0 && var1 < var0.method10351() && var2 < var0.method10351()) {
			if (var2 != var1) {
				if (var0.field5399 == class570.field5721) {
					int[] var3 = var0.method10348();
					int var8 = var3[var1];
					var3[var1] = var3[var2];
					var3[var2] = var8;
				} else if (var0.field5399 == class570.field5724) {
					long[] var9 = var0.method10377();
					long var6 = var9[var1];
					var9[var1] = var9[var2];
					var9[var2] = var6;
				} else {
					Object[] var10 = var0.method10393();
					Object var4 = var10[var1];
					var10[var1] = var10[var2];
					var10[var2] = var4;
				}
			}

		} else {
			throw new RuntimeException();
		}
	}
}
