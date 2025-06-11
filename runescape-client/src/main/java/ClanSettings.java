import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ol")
	@ObfuscatedGetter(
		longValue = 1177452753148642601L
	)
	static long field1809;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 2512164053598525247L
	)
	long field1784;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 620751083
	)
	public int field1785;
	@ObfuscatedName("ah")
	@Export("name")
	public String name;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2050215255
	)
	int field1787;
	@ObfuscatedName("au")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("ar")
	public byte field1800;
	@ObfuscatedName("ad")
	public byte field1806;
	@ObfuscatedName("af")
	public byte field1789;
	@ObfuscatedName("ak")
	public byte field1792;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -89876629
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("aw")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("at")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ae")
	int[] field1796;
	@ObfuscatedName("av")
	@Export("memberJoinDates")
	public int[] memberJoinDates;
	@ObfuscatedName("ao")
	public boolean[] field1798;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -657726603
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -4811049
	)
	public int field1801;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2037407203
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("aq")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("ay")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("ba")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;
	@ObfuscatedName("bl")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("bi")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("bv")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1785 = 0;
		this.name = null;
		this.field1787 = 0;
		this.currentOwner = -1;
		this.field1801 = -1;
		this.method3800(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3741(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}

		if (this.field1796 != null) {
			System.arraycopy(this.field1796, 0, this.field1796 = new int[var1], 0, this.memberCount);
		} else {
			this.field1796 = new int[var1];
		}

		if (this.memberJoinDates != null) {
			System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount);
		} else {
			this.memberJoinDates = new int[var1];
		}

		if (this.field1798 != null) {
			System.arraycopy(this.field1798, 0, this.field1798 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1798 = new boolean[var1];
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-589916447"
	)
	void method3742(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}

		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1450129536"
	)
	public int method3743(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}

			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-53317489"
	)
	public int method3749(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1796[var1] & var4) >>> var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-204519868"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-975818350"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			AuthenticationScheme.method3634(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "1118505887"
	)
	void method3747(long var1, String var3, int var4) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3741(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1796[this.memberCount] = 0;
			this.memberJoinDates[this.memberCount] = var4;
			this.field1798[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1694175745"
	)
	void method3748(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1796 = null;
				this.memberJoinDates = null;
				this.field1798 = null;
				this.currentOwner = -1;
				this.field1801 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1796, var1 + 1, this.field1796, var1, this.memberCount - var1);
				System.arraycopy(this.memberJoinDates, var1 + 1, this.memberJoinDates, var1, this.memberCount - var1);
				System.arraycopy(this.field1798, var1 + 1, this.field1798, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-24"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1801 = -1;
		} else {
			this.currentOwner = -1;
			this.field1801 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1801 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1801 == -1 && this.memberRanks[var3] == 125) {
					this.field1801 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "1756472906"
	)
	void method3766(long var1, String var3) {
		if (var3 != null && var3.isEmpty()) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method3742(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-44"
	)
	void method3751(int var1) {
		--this.bannedMemberCount;
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null;
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "563384149"
	)
	int method3752(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1801 == -1 || this.memberRanks[this.field1801] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2015003065"
	)
	boolean method3753(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1801 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-385151813"
	)
	int method3754(int var1, boolean var2) {
		if (this.field1798[var1] == var2) {
			return -1;
		} else {
			this.field1798[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-76"
	)
	int method3790(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1796[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1796[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIS)Z",
		garbageValue = "1176"
	)
	boolean method3756(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
					if (var2 == var4.integer) {
						return false;
					}

					var4.integer = var2;
					return true;
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "2134959985"
	)
	boolean method3805(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
					if ((var9.integer & var7) == var2) {
						return false;
					}

					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}

				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("at")
	boolean method3758(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class532) {
					class532 var5 = (class532)var4;
					if (var2 == var5.field5386) {
						return false;
					}

					var5.field5386 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class532(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "-60"
	)
	boolean method3759(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}

						var4.remove();
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}

				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-735549750"
	)
	void method3800(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) {
				this.useNames = true;
			}

			if (!this.useHashes) {
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}

			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}

			this.field1785 = var1.readInt();
			this.field1787 = var1.readInt();
			if (var2 <= 3 && this.field1787 != 0) {
				this.field1787 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1800 = var1.readByte();
			this.field1806 = var1.readByte();
			this.field1789 = var1.readByte();
			this.field1792 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1796 == null || this.field1796.length < this.memberCount) {
					this.field1796 = new int[this.memberCount];
				}

				if (this.memberJoinDates == null || this.memberJoinDates.length < this.memberCount) {
					this.memberJoinDates = new int[this.memberCount];
				}

				if (this.field1798 == null || this.field1798.length < this.memberCount) {
					this.field1798 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) {
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field1796[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.memberJoinDates[var4] = var1.readUnsignedShort();
					} else {
						this.memberJoinDates[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1798[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1798[var4] = false;
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) {
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.parameters = new IterableNodeHashTable(var4 < 16 ? HealthBarUpdate.method2362(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class532(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-330686398"
	)
	public static String method3771(CharSequence var0) {
		String var1 = FloatProjection.base37DecodeLong(WorldMapElement.method4020(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "-42"
	)
	static int method3808(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			NPCComposition var6 = UserComparator3.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = UserComparator3.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method4156(var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method4164(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = UserComparator3.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIB)V",
		garbageValue = "7"
	)
	@Export("checkIfMinimapClicked")
	static final void checkIfMinimapClicked(Widget var0, int var1, int var2) {
		if (Client.minimapState == 0 || Client.minimapState == 3) {
			if (!Client.isMenuOpen && (MouseHandler.MouseHandler_lastButton == 1 || !class7.mouseCam && MouseHandler.MouseHandler_lastButton == 4)) {
				SpriteMask var3 = var0.method7762(ClientPreferences.widgetDefinition, true);
				if (var3 == null) {
					return;
				}

				int var4 = MouseHandler.MouseHandler_lastPressedX - var1;
				int var5 = MouseHandler.MouseHandler_lastPressedY - var2;
				if (var3.contains(var4, var5)) {
					var4 -= var3.width / 2;
					var5 -= var3.height / 2;
					int var6 = Client.camAngleY & 2047;
					int var7 = Rasterizer3D.Rasterizer3D_sine[var6];
					int var8 = Rasterizer3D.Rasterizer3D_cosine[var6];
					int var9 = var8 * var4 + var5 * var7 >> 11;
					int var10 = var8 * var5 - var7 * var4 >> 11;
					int var11 = var9 + Client.field527 >> 7;
					int var12 = Client.field387 - var10 >> 7;
					class508 var13 = Client.worldViewManager.method2231(-1);
					if (var13 == class508.field5283) {
						MenuAction.method1863(var11, var12, var4, var5);
					} else if (var13 == class508.field5284) {
						Client.field485 = class163.method3836(var1, var2, var3);
						Client.field312 = 30;
						WorldMapID.method6628(Client.field485);
					}
				}
			}

		}
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ldl;ZLwx;B)V",
		garbageValue = "41"
	)
	static final void method3799(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					NPC var7 = (NPC)var0.npcs.get((long)var5);
					if (var7 == null) {
						var7 = new NPC(var5);
						var0.npcs.add(var7, (long)var5);
						var6 = true;
					}

					var0.field1147.method9428(var5);
					var7.field1168 = false;
					var7.worldViewId = var0.id;
					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(6);
						if (var9 > 31) {
							var9 -= 64;
						}
					}

					boolean var11 = var2.readBits(1) == 1;
					if (var11) {
						var2.readBits(32);
					}

					int var8 = var2.readBits(1);
					int var12 = var2.readBits(1);
					if (var12 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(6);
						if (var10 > 31) {
							var10 -= 64;
						}
					}

					int var13 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var13;
					}

					var7.definition = UserComparator3.getNpcDefinition(var2.readBits(14));
					Skeleton.method5174(var7);
					if (var7.field1079 == 0) {
						var7.rotation = 0;
					}

					var7.method2627(var9 + class1.field4, var10 + Player.field938, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "([Lov;Lov;ZB)V",
		garbageValue = "3"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width * -1805166981;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height * -2133353239;
		ViewportMouse.resizeInterface(var0, var1.field4002, var1.field4003, var1.id, var1.childIndex * -744024149, var3, var4, var2);
		if (var1.children != null) {
			ViewportMouse.resizeInterface(var1.children, 0, var1.children.length - 1, var1.id, -1, var3, var4, var2);
		}

		if (var1.childIndex * -744024149 == -1) {
			InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
			if (var5 != null) {
				int var6 = var5.group;
				if (ClientPreferences.widgetDefinition.loadInterface(var6)) {
					ViewportMouse.resizeInterface(ClientPreferences.widgetDefinition.Widget_interfaceComponents[var6], 0, ClientPreferences.widgetDefinition.Widget_interfaceComponents[var6].length - 1, -1, -1, var3, var4, var2);
				}
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
