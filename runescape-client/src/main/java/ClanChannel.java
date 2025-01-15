import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("ay")
	boolean field1814;
	@ObfuscatedName("ah")
	boolean field1806;
	@ObfuscatedName("az")
	@Export("members")
	public List members;
	@ObfuscatedName("ao")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 5804263768996706621L
	)
	public long field1810;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	public byte field1812;
	@ObfuscatedName("ax")
	public byte field1813;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1806 = true;
		this.name = null;
		this.method3851(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-338552712"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10974();
			}

			Renderable.method4461(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfw;I)V",
		garbageValue = "-564141182"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-561369554"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-730358534"
	)
	public int method3837() {
		return this.members.size();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-91"
	)
	public int method3850(String var1) {
		if (!this.field1806) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "2119647539"
	)
	void method3851(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1814 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1806 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1810 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1813 = var1.readByte();
		this.field1812 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1814) {
					var1.readLong();
				}

				if (this.field1806) {
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

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(Ldz;Lvv;I)V",
		garbageValue = "433669662"
	)
	static void method3857(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
		int var5 = var4.sizeX / 8;
		int var6 = var4.sizeY / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field574[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field574[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class374.field4114 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				class374.field4114[var8][var9] = var1.readInt();
			}
		}

		StructComposition.field2742 = new int[var7];
		class440.field4851 = new int[var7];
		HealthBarDefinition.field2578 = new int[var7];
		WorldMapSectionType.field3193 = new byte[var7][];
		AccessFile.field5365 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field574[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (StructComposition.field2742[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							StructComposition.field2742[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							class440.field4851[var7] = LoginState.archive9.getGroupId("m" + var15 + "_" + var16);
							HealthBarDefinition.field2578[var7] = LoginState.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		class360.updateGameState(25);
		Client.field509 = true;
		class151.field1683 = var4;
		GrandExchangeEvents.method7859(var4);
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1899065248"
	)
	static final void method3839(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class544.clientPreferences.updateSoundEffectVolume(var0);
	}
}
