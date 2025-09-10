import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("af")
	@Export("members")
	public List members;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -2045762478009047411L
	)
	public long field1922;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("ac")
	public byte field1917;
	@ObfuscatedName("ap")
	public byte field1921;
	@ObfuscatedName("aq")
	boolean field1924;
	@ObfuscatedName("ao")
	boolean field1923;
	@ObfuscatedName("as")
	@Export("sortedMembers")
	int[] sortedMembers;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwb;)V"
	)
	public ClanChannel(Buffer var1) {
		this.name = null;
		this.field1923 = true;
		this.method4072(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "39"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method11910();
			}

			GameObject.method5795(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfx;I)V",
		garbageValue = "200099919"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2125985619"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1523175215"
	)
	public int method4076() {
		return this.members.size();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "178046206"
	)
	public int method4070(String var1) {
		if (!this.field1923) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)V",
		garbageValue = "570663948"
	)
	void method4072(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1924 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1923 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1922 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1921 = var1.readByte();
		this.field1917 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1924) {
					var1.readLong();
				}

				if (this.field1923) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lro;FFFI)F",
		garbageValue = "373009267"
	)
	static float method4084(class456 var0, float var1, float var2, float var3) {
		float var4 = class445.method8902(var0.field5202, var0.field5203, var1);
		if (Math.abs(var4) < class134.field1620) {
			return var1;
		} else {
			float var5 = class445.method8902(var0.field5202, var0.field5203, var2);
			if (Math.abs(var5) < class134.field1620) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;

				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}

					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}

					float var16 = class134.field1617 * Math.abs(var2) + 0.5F * var3;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = var17 * 2.0F * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * (var10 * 2.0F * var17 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
								var10 = (var12 - 1.0F) * (var11 - 1.0F) * (var10 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < 3.0F * var17 * var10 - Math.abs(var16 * var10) && var9 < Math.abs(var12 * 0.5F * var10)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}

						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = class445.method8902(var0.field5202, var0.field5203, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1857404632"
	)
	static final void method4066(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class401.cameraPitch < var0) {
			class401.cameraPitch = (var0 - class401.cameraPitch) * class145.field1725 / 1000 + class401.cameraPitch + class47.field687;
			if (class401.cameraPitch > var0) {
				class401.cameraPitch = var0;
			}
		} else if (class401.cameraPitch > var0) {
			class401.cameraPitch -= (class401.cameraPitch - var0) * class145.field1725 / 1000 + class47.field687;
			if (class401.cameraPitch < var0) {
				class401.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - WorldMapLabel.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			WorldMapLabel.cameraYaw = var2 * class145.field1725 / 1000 + WorldMapLabel.cameraYaw + class47.field687;
			WorldMapLabel.cameraYaw &= 2047;
		} else if (var2 < 0) {
			WorldMapLabel.cameraYaw -= -var2 * class145.field1725 / 1000 + class47.field687;
			WorldMapLabel.cameraYaw &= 2047;
		}

		int var3 = var1 - WorldMapLabel.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			WorldMapLabel.cameraYaw = var1;
		}

	}
}
