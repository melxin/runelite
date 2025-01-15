import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("si")
@Implements("FriendsList")
public class FriendsList extends UserList {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1250552947
	)
	int field4981;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("friendLoginUpdates")
	public LinkDeque friendLoginUpdates;

	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public FriendsList(LoginType var1) {
		super(400);
		this.field4981 = 1;
		this.friendLoginUpdates = new LinkDeque();
		this.loginType = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lso;",
		garbageValue = "35"
	)
	@Export("newInstance")
	User newInstance() {
		return new Friend();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lso;",
		garbageValue = "-1808909632"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Friend[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lwb;ZI)Z",
		garbageValue = "-1389788629"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IS)V",
		garbageValue = "4608"
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
						var11.int2 = ++this.field4981 - 1;
						if (var11.world == -1 && var6 == 0) {
							var11.int2 = -(var11.int2 * -2003439171) * -1806970475;
						}

						var11.world = var6;
					}

					var11.rank = var7;
					var11.field4990 = var9;
					var11.field4991 = var10;
					continue;
				}

				throw new IllegalStateException();
			}

			this.sort();
			return;
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(Lna;I)Z",
		garbageValue = "-1721141643"
	)
	static final boolean method9092(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method7055(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method7087(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method7087(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = ScriptEvent.getPacketBufferNode(ClientPacket.UPDATE_PLAYER_MODEL, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
