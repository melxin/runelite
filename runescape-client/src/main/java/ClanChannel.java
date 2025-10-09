import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ak")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("ab")
	@Export("members")
	public List members;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -7827761027663485443L
	)
	public long field1913;
	@ObfuscatedName("ag")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	public byte field1917;
	@ObfuscatedName("ah")
	public byte field1916;
	@ObfuscatedName("af")
	boolean field1919;
	@ObfuscatedName("ae")
	boolean field1918;
	@ObfuscatedName("aq")
	@Export("sortedMembers")
	int[] sortedMembers;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public ClanChannel(Buffer var1) {
		this.name = null;
		this.field1918 = true;
		this.method4127(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-243030340"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method12080();
			}

			class332.method7071(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfs;I)V",
		garbageValue = "-308501089"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-614304750"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "882373112"
	)
	public int method4121() {
		return this.members.size();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)I",
		garbageValue = "-21210"
	)
	public int method4120(String var1) {
		if (!this.field1918) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "754680367"
	)
	void method4127(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1919 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1918 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1913 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1916 = var1.readByte();
		this.field1917 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1919) {
					var1.readLong();
				}

				if (this.field1918) {
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

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-174629891"
	)
	static final void method4122(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class154.clientPreferences.updateSoundEffectVolume(var0);
	}
}
