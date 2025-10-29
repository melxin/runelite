import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("av")
	@Export("members")
	public List members;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -301898670489180965L
	)
	public long field1899;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	public byte field1901;
	@ObfuscatedName("ae")
	public byte field1909;
	@ObfuscatedName("aj")
	boolean field1898;
	@ObfuscatedName("ak")
	boolean field1904;
	@ObfuscatedName("aw")
	@Export("sortedMembers")
	int[] sortedMembers;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lxa;)V"
	)
	public ClanChannel(Buffer var1) {
		this.name = null;
		this.field1904 = true;
		this.method4198(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-453092939"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method12340();
			}

			class28.method466(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V",
		garbageValue = "1065052685"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1333922535"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2089769915"
	)
	public int method4196() {
		return this.members.size();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1596368249"
	)
	public int method4204(String var1) {
		if (!this.field1904) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "76"
	)
	void method4198(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1898 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1904 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1899 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1909 = var1.readByte();
		this.field1901 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1898) {
					var1.readLong();
				}

				if (this.field1904) {
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

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I",
		garbageValue = "65535"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !HttpRequestTask.method288(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}
}
