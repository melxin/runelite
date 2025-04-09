import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lws;"
	)
	static IndexedSprite field5123;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("af")
	@Export("name")
	public String name;
	@ObfuscatedName("as")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aq")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1596001837
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -906112747
	)
	int field5115;

	@ObfuscatedSignature(
		descriptor = "(Luw;Lsa;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field5115 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsh;",
		garbageValue = "-1223410224"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsh;",
		garbageValue = "11"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1565814698"
	)
	final void method9150(String var1) {
		this.name = class447.method8529(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1809180863"
	)
	final void method9146(String var1) {
		this.owner = class447.method8529(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lve;B)V",
		garbageValue = "87"
	)
	public final void method9142(Buffer var1) {
		this.method9146(var1.readStringCp1252NullTerminated());
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
					var10.append(class437.base37Table[(int)(var11 - var5 * 37L)]);
				}

				var4 = var10.reverse().toString();
			}
		} else {
			var4 = null;
		}

		this.method9150(var4);
		this.minKick = var1.readByte();
		var7 = var1.readShortSmartSub();
		if (var7 != -1) {
			this.clear();

			for (int var13 = 0; var13 < var7; ++var13) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var14 = var1.readUnsignedShort();
				var9.set(var14, ++this.field5115 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "1785872515"
	)
	public final void method9148(Buffer var1) {
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

			var6.set(var3, ++this.field5115 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2104574146"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)V",
		garbageValue = "65"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
