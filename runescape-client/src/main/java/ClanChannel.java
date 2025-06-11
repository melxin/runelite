import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ap")
	@Export("members")
	public List members;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6173762561185738429L
	)
	public long field1849;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	public byte field1851;
	@ObfuscatedName("al")
	public byte field1852;
	@ObfuscatedName("ac")
	boolean field1853;
	@ObfuscatedName("aa")
	boolean field1854;
	@ObfuscatedName("am")
	@Export("sortedMembers")
	int[] sortedMembers;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
	)
	public ClanChannel(Buffer var1) {
		this.name = null;
		this.field1854 = true;
		this.method3891(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1982180383"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method11543();
			}

			AuthenticationScheme.method3634(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfm;I)V",
		garbageValue = "1054867355"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1477063582"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-88"
	)
	public int method3878() {
		return this.members.size();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "889221205"
	)
	public int method3877(String var1) {
		if (!this.field1854) {
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
		descriptor = "(Lwt;B)V",
		garbageValue = "75"
	)
	void method3891(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1853 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1854 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1849 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1852 = var1.readByte();
		this.field1851 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1853) {
					var1.readLong();
				}

				if (this.field1854) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lov;II)V",
		garbageValue = "388896101"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4058 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4130 == null) {
				var0.field4130 = new int[var0.field4058.length];
			}

			var0.field4130[var1] = Integer.MAX_VALUE;
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ltp;ILtp;III)V",
		garbageValue = "1145049713"
	)
	static void method3879(class509 var0, int var1, class509 var2, int var3, int var4) {
		if (var0.field5288 == class563.field5600) {
			System.arraycopy(var0.field5294, var1, var2.field5294, var3, var4);
		} else if (var0.field5288 == class563.field5594) {
			System.arraycopy(var0.field5289, var1, var2.field5289, var3, var4);
		} else {
			System.arraycopy(var0.field5295, var1, var2.field5295, var3, var4);
		}

	}
}
