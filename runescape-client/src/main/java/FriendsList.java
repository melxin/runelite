import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -730326121
	)
	int field5164;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.friendLoginUpdates = new LinkDeque();
		this.field5164 = 1;
		this.loginType = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "1"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsi;",
		garbageValue = "-308089342"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxm;ZI)Z",
		garbageValue = "-1856088668"
	)
	@Export("isFriended")
	public boolean isFriended(Username var1, boolean var2) {
		Friend var3 = (Friend)this.getByUsername(var1);
		if (var3 == null) {
			return false;
		} else {
			return !var2 || var3.world != 0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-1327791768"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (true) {
			if (var1.offset < var2) {
				boolean var3 = var1.readUnsignedByte() == 1;
				Username var4 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
				int var6 = var1.readUnsignedShort();
				int var7 = var1.readUnsignedByte();
				int var8 = var1.readUnsignedByte();
				boolean var9 = (var8 & 2) != 0;
				boolean var10 = (var8 & 1) != 0;
				if (var6 > 0) {
					var1.readStringCp1252NullTerminated();
					var1.readUnsignedByte();
					var1.readInt();
				}

				var1.readStringCp1252NullTerminated();
				if (var4 != null && var4.hasCleanName()) {
					Friend var11 = (Friend)this.getByCurrentUsername(var4);
					if (var3) {
						Friend var12 = (Friend)this.getByCurrentUsername(var5);
						if (var12 != null && var11 != var12) {
							if (var11 != null) {
								this.remove(var12);
							} else {
								var11 = var12;
							}
						}
					}

					if (var11 != null) {
						this.changeName(var11, var4, var5);
						if (var6 != var11.world) {
							boolean var14 = true;

							for (FriendLoginUpdate var13 = (FriendLoginUpdate)this.friendLoginUpdates.last(); var13 != null; var13 = (FriendLoginUpdate)this.friendLoginUpdates.previous()) {
								if (var13.username.equals(var4)) {
									if (var6 != 0 && var13.world == 0) {
										var13.remove();
										var14 = false;
									} else if (var6 == 0 && var13.world != 0) {
										var13.remove();
										var14 = false;
									}
								}
							}

							if (var14) {
								this.friendLoginUpdates.addFirst(new FriendLoginUpdate(var4, var6));
							}
						}
					} else {
						if (this.getSize() >= 400) {
							continue;
						}

						var11 = (Friend)this.addLast(var4, var5);
					}

					if (var6 != var11.world) {
						var11.int2 = ++this.field5164 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -1995466197) * -1974840189;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field5179 = var9;
					var11.field5176 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "110"
	)
	static int method9520(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
		int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}
}
