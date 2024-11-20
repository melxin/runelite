import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -1145371687
	)
	static int field1763;
	@ObfuscatedName("aw")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("at")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 4540207457111008239L
	)
	long field1740;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1711204941
	)
	public int field1741;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2046090961
	)
	int field1743;
	@ObfuscatedName("av")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("au")
	public byte field1744;
	@ObfuscatedName("an")
	public byte field1764;
	@ObfuscatedName("af")
	public byte field1747;
	@ObfuscatedName("ai")
	public byte field1737;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1923713233
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("ar")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("as")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("az")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ak")
	int[] field1753;
	@ObfuscatedName("ap")
	@Export("memberJoinDates")
	public int[] memberJoinDates;
	@ObfuscatedName("ah")
	public boolean[] field1739;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -876856483
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -415684737
	)
	public int field1761;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -166363441
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("aa")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("aq")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("am")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lvj;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1741 = 0;
		this.name = null;
		this.field1743 = 0;
		this.currentOwner = -1;
		this.field1761 = -1;
		this.method3563(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "902470329"
	)
	void method3534(int var1) {
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

		if (this.field1753 != null) {
			System.arraycopy(this.field1753, 0, this.field1753 = new int[var1], 0, this.memberCount);
		} else {
			this.field1753 = new int[var1];
		}

		if (this.memberJoinDates != null) {
			System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount);
		} else {
			this.memberJoinDates = new int[var1];
		}

		if (this.field1739 != null) {
			System.arraycopy(this.field1739, 0, this.field1739 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1739 = new boolean[var1];
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "246847714"
	)
	void method3535(int var1) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1922959353"
	)
	public int method3553(String var1) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1236327559"
	)
	public int method3537(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1753[var1] & var4) >>> var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "13"
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
		garbageValue = "-912492998"
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

			ItemContainer.method2454(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "2072787236"
	)
	void method3540(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3534(this.memberCount + 5);
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

			this.field1753[this.memberCount] = 0;
			this.memberJoinDates[this.memberCount] = var4;
			this.field1739[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1769090758"
	)
	void method3541(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1753 = null;
				this.memberJoinDates = null;
				this.field1739 = null;
				this.currentOwner = -1;
				this.field1761 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1753, var1 + 1, this.field1753, var1, this.memberCount - var1);
				System.arraycopy(this.memberJoinDates, var1 + 1, this.memberJoinDates, var1, this.memberCount - var1);
				System.arraycopy(this.field1739, var1 + 1, this.field1739, var1, this.memberCount - var1);
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-810067845"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1761 = -1;
		} else {
			this.currentOwner = -1;
			this.field1761 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1761 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1761 == -1 && this.memberRanks[var3] == 125) {
					this.field1761 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)V",
		garbageValue = "1"
	)
	void method3543(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method3535(this.bannedMemberCount + 5);
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-869267183"
	)
	void method3544(int var1) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-1853012275"
	)
	int method3548(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1761 == -1 || this.memberRanks[this.field1761] < 125)) {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2056537099"
	)
	boolean method3546(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1761 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-68"
	)
	int method3547(int var1, boolean var2) {
		if (this.field1739[var1] == var2) {
			return -1;
		} else {
			this.field1739[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "77"
	)
	int method3598(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1753[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1753[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "0"
	)
	boolean method3550(int var1, int var2) {
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "1871438457"
	)
	boolean method3560(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("ap")
	boolean method3573(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class512) {
					class512 var5 = (class512)var4;
					if (var5.field5175 == var2) {
						return false;
					}

					var5.field5175 = var2;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "1982577433"
	)
	boolean method3549(int var1, String var2) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "-1943705914"
	)
	void method3563(Buffer var1) {
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

			this.field1741 = var1.readInt();
			this.field1743 = var1.readInt();
			if (var2 <= 3 && this.field1743 != 0) {
				this.field1743 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1744 = var1.readByte();
			this.field1764 = var1.readByte();
			this.field1747 = var1.readByte();
			this.field1737 = var1.readByte();
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

				if (this.field1753 == null || this.field1753.length < this.memberCount) {
					this.field1753 = new int[this.memberCount];
				}

				if (this.memberJoinDates == null || this.memberJoinDates.length < this.memberCount) {
					this.memberJoinDates = new int[this.memberCount];
				}

				if (this.field1739 == null || this.field1739.length < this.memberCount) {
					this.field1739 = new boolean[this.memberCount];
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
						this.field1753[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.memberJoinDates[var4] = var1.readUnsignedShort();
					} else {
						this.memberJoinDates[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1739[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1739[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? ServerPacket.method6470(var4) : 16);

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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lnp;I)V",
		garbageValue = "693528849"
	)
	static void method3599(Widget var0) {
		var0.method7278();
		var0.method7284().method7026(new class110(var0));
		var0.method7284().method7025(new class111(var0));
	}
}
