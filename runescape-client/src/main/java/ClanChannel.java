import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ao")
	@Export("members")
	public List members;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 1984400237991481065L
	)
	public long field1854;
	@ObfuscatedName("ae")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	public byte field1853;
	@ObfuscatedName("as")
	public byte field1851;
	@ObfuscatedName("aq")
	boolean field1855;
	@ObfuscatedName("av")
	boolean field1850;
	@ObfuscatedName("am")
	@Export("sortedMembers")
	int[] sortedMembers;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lve;)V"
	)
	public ClanChannel(Buffer var1) {
		this.name = null;
		this.field1850 = true;
		this.method3706(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1620813235"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method11006();
			}

			class377.method7553(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V",
		garbageValue = "-1719904498"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-837262748"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1481562757"
	)
	public int method3704() {
		return this.members.size();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "90379401"
	)
	public int method3700(String var1) {
		if (!this.field1850) {
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
		descriptor = "(Lve;I)V",
		garbageValue = "1691587227"
	)
	void method3706(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1855 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1850 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1854 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1851 = var1.readByte();
		this.field1853 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1855) {
					var1.readLong();
				}

				if (this.field1850) {
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
}
