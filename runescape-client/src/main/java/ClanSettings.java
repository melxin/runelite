import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field1762;
	@ObfuscatedName("qy")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;
	@ObfuscatedName("ah")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("az")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -3709235999232645775L
	)
	long field1759;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -661585717
	)
	public int field1738;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1276121963
	)
	int field1740;
	@ObfuscatedName("ax")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("at")
	public byte field1742;
	@ObfuscatedName("ac")
	public byte field1753;
	@ObfuscatedName("au")
	public byte field1744;
	@ObfuscatedName("as")
	public byte field1745;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1201920345
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("af")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("aa")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ak")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("al")
	int[] field1757;
	@ObfuscatedName("av")
	@Export("memberJoinDates")
	public int[] memberJoinDates;
	@ObfuscatedName("ag")
	public boolean[] field1749;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2066897607
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 505072089
	)
	public int field1760;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1741264551
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("am")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("ap")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("ab")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lue;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1738 = 0;
		this.name = null;
		this.field1740 = 0;
		this.currentOwner = -1;
		this.field1760 = -1;
		this.method3703(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2138067556"
	)
	void method3753(int var1) {
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

		if (this.field1757 != null) {
			System.arraycopy(this.field1757, 0, this.field1757 = new int[var1], 0, this.memberCount);
		} else {
			this.field1757 = new int[var1];
		}

		if (this.memberJoinDates != null) {
			System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount);
		} else {
			this.memberJoinDates = new int[var1];
		}

		if (this.field1749 != null) {
			System.arraycopy(this.field1749, 0, this.field1749 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1749 = new boolean[var1];
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1821713879"
	)
	void method3686(int var1) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-312021165"
	)
	public int method3712(String var1) {
		if (var1 != null && var1.length() != 0) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-47"
	)
	public int method3711(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1757[var1] & var4) >>> var2;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1059269862"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1423743648"
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

			Renderable.method4461(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "1735897697"
	)
	void method3691(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3753(this.memberCount + 5);
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

			this.field1757[this.memberCount] = 0;
			this.memberJoinDates[this.memberCount] = var4;
			this.field1749[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1089096698"
	)
	void method3692(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1757 = null;
				this.memberJoinDates = null;
				this.field1749 = null;
				this.currentOwner = -1;
				this.field1760 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1757, var1 + 1, this.field1757, var1, this.memberCount - var1);
				System.arraycopy(this.memberJoinDates, var1 + 1, this.memberJoinDates, var1, this.memberCount - var1);
				System.arraycopy(this.field1749, var1 + 1, this.field1749, var1, this.memberCount - var1);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "30"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1760 = -1;
		} else {
			this.currentOwner = -1;
			this.field1760 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1760 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1760 == -1 && this.memberRanks[var3] == 125) {
					this.field1760 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "30"
	)
	void method3693(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method3686(this.bannedMemberCount + 5);
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
		descriptor = "(II)V",
		garbageValue = "1842806052"
	)
	void method3694(int var1) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IBS)I",
		garbageValue = "21359"
	)
	int method3695(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1760 == -1 || this.memberRanks[this.field1760] < 125)) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-635673545"
	)
	boolean method3718(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1760 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-36"
	)
	int method3687(int var1, boolean var2) {
		if (this.field1749[var1] == var2) {
			return -1;
		} else {
			this.field1749[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "1"
	)
	int method3697(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1757[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1757[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "114"
	)
	boolean method3717(int var1, int var2) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)Z",
		garbageValue = "17"
	)
	boolean method3731(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("av")
	boolean method3701(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class512) {
					class512 var5 = (class512)var4;
					if (var2 == var5.field5171) {
						return false;
					}

					var5.field5171 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class512(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1950194387"
	)
	boolean method3702(int var1, String var2) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "551467554"
	)
	void method3703(Buffer var1) {
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

			this.field1738 = var1.readInt();
			this.field1740 = var1.readInt();
			if (var2 <= 3 && this.field1740 != 0) {
				this.field1740 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1742 = var1.readByte();
			this.field1753 = var1.readByte();
			this.field1744 = var1.readByte();
			this.field1745 = var1.readByte();
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

				if (this.field1757 == null || this.field1757.length < this.memberCount) {
					this.field1757 = new int[this.memberCount];
				}

				if (this.memberJoinDates == null || this.memberJoinDates.length < this.memberCount) {
					this.memberJoinDates = new int[this.memberCount];
				}

				if (this.field1749 == null || this.field1749.length < this.memberCount) {
					this.field1749 = new boolean[this.memberCount];
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
						this.field1757[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.memberJoinDates[var4] = var1.readUnsignedShort();
					} else {
						this.memberJoinDates[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1749[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1749[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class357.method7049(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class512(var10), (long)var6);
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1266692188"
	)
	static int method3688(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-591640412"
	)
	static int method3755(int var0, Script var1, boolean var2) {
		return 2;
	}
}
