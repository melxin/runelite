import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ab")
	boolean field1804;
	@ObfuscatedName("aw")
	boolean field1805;
	@ObfuscatedName("at")
	@Export("members")
	public List members;
	@ObfuscatedName("ae")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 7624214741550657247L
	)
	public long field1806;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	public byte field1809;
	@ObfuscatedName("av")
	public byte field1810;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1805 = true;
		this.name = null;
		this.method3664(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1074479956"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10785();
			}

			ItemContainer.method2454(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfp;I)V",
		garbageValue = "-2070268071"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-23013"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-83294454"
	)
	public int method3676() {
		return this.members.size();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "6"
	)
	public int method3663(String var1) {
		if (!this.field1805) {
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-878009835"
	)
	void method3664(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1804 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1805 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1806 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1810 = var1.readByte();
		this.field1809 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1804) {
					var1.readLong();
				}

				if (this.field1805) {
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

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldm;B)V",
		garbageValue = "1"
	)
	static void method3677(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				GameBuild.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}
}
