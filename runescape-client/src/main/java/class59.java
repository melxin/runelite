import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class59 {
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = -719340383
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	VorbisFloor field419;
	@ObfuscatedName("ay")
	boolean field417;
	@ObfuscatedName("au")
	int[] field418;
	@ObfuscatedName("ad")
	int[] field421;
	@ObfuscatedName("ah")
	boolean[] field420;

	@ObfuscatedSignature(
		descriptor = "(Lbx;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field419 = var1;
		this.field417 = var2;
		this.field418 = var3;
		this.field421 = var4;
		this.field420 = var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "1010955897"
	)
	void method1125(float[] var1, int var2) {
		int var3 = this.field419.field263.length;
		VorbisFloor var10000 = this.field419;
		int var4 = VorbisFloor.field261[this.field419.multiplier - 1];
		boolean[] var5 = this.field420;
		this.field420[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field419.method743(this.field418, var6);
			var8 = this.field419.method734(this.field418, var6);
			var9 = this.field419.method735(this.field418[var7], this.field421[var7], this.field418[var8], this.field421[var8], this.field418[var6]);
			var10 = this.field421[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field420;
				this.field420[var8] = true;
				var14[var7] = true;
				this.field420[var6] = true;
				if (var10 >= var13) {
					this.field421[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field421[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field420[var6] = false;
				this.field421[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field419.multiplier * this.field421[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field420[var8]) {
				var9 = this.field418[var8];
				var10 = this.field419.multiplier * this.field421[var8];
				this.field419.method736(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field419;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "406254624"
	)
	boolean method1126() {
		return this.field417;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "450158269"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field418[var1];
			int var5 = this.field421[var1];
			boolean var6 = this.field420[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field418[var7];
				if (var8 < var4) {
					this.field418[var3] = var8;
					this.field421[var3] = this.field421[var7];
					this.field420[var3] = this.field420[var7];
					++var3;
					this.field418[var7] = this.field418[var3];
					this.field421[var7] = this.field421[var3];
					this.field420[var7] = this.field420[var3];
				}
			}

			this.field418[var3] = var4;
			this.field421[var3] = var5;
			this.field420[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-1280949381"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "772521672"
	)
	public static void method1134() {
		class201.field2136.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqv;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2052569466"
	)
	static String method1133(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;",
		garbageValue = "18946921"
	)
	static String method1137(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = (RunException)var0;
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = var1 + "| " + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if (var8 >= 0 && var9 >= 0) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = var1 + var10 + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = var1 + var7 + ' ';
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldy;",
		garbageValue = "1292658012"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.field5570 = var2.field5573.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.field5573.length - 2 - var3 - 12;
		var2.field5570 = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? MoveSpeed.method5791(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.field5570 = 0;
		var1.field1019 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.field5570 < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1996037738"
	)
	static final int method1135(int var0, int var1) {
		int var2 = class165.method3642(45365 + var0, var1 + 91923, 4) - 128 + (class165.method3642(var0 + 10294, 37821 + var1, 2) - 128 >> 1) + (class165.method3642(var0, var1, 1) - 128 >> 2);
		var2 = (int)((double)var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2030489805"
	)
	static void method1136(boolean var0) {
		if (var0) {
			GrandExchangeOffer.method7838();
		} else {
			for (int var1 = 0; var1 < class335.midiRequests.size(); ++var1) {
				MidiRequest var2 = (MidiRequest)class335.midiRequests.get(var1);
				if (var2 == null) {
					class335.midiRequests.remove(var1);
					--var1;
				} else if (var2.field3801) {
					if (var2.midiPcmStream.field3728 > 0) {
						--var2.midiPcmStream.field3728;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6619();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class335.midiRequests.remove(var1);
					--var1;
				} else {
					var2.field3801 = true;
				}
			}
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1564088841"
	)
	static final void method1124() {
		if (RestClientThreadFactory.ClanChat_inClanChat) {
			if (class7.friendsChat != null) {
				class7.friendsChat.sort();
			}

			AsyncHttpResponse.method240();
			RestClientThreadFactory.ClanChat_inClanChat = false;
		}

	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1777565712"
	)
	static void method1132(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = class376.worldView.groundItems[var0][var1][var2];
		if (var6 != null) {
			for (class108 var7 = (class108)var6.last(); var7 != null; var7 = (class108)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.field1414) {
					var7.field1414 = var5;
					break;
				}
			}

			Language.updateItemPile(var0, var1, var2);
		}

	}
}
