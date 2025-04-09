import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ae")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("af")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("as")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -854765051
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -28352021
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("am")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("aa")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ap")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "984264039"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "-792304334"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1820882189"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;",
		garbageValue = "31"
	)
	static String method5160(Throwable var0) throws IOException {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIILky;II)V",
		garbageValue = "823043590"
	)
	static void method5159(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) {
			int var5 = var3.sizeX;
			int var6 = var3.sizeY;
			if (var4 == 1 || var4 == 3) {
				var5 = var3.sizeY;
				var6 = var3.sizeX;
			}

			int var7 = (var5 + var1) * 128;
			int var8 = (var6 + var2) * 128;
			var1 *= 128;
			var2 *= 128;
			int var9 = var3.ambientSoundId;
			int var10 = var3.int7 * 16384;
			int var11 = var3.int8 * 128;
			if (var3.transforms != null) {
				ObjectComposition var12 = var3.transform();
				if (var12 != null) {
					var9 = var12.ambientSoundId;
					var10 = var12.int7 * 16384;
					var11 = var12.int8 * 128;
				}
			}

			for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
				if (var0 == var13.plane && var13.x * 16384 == var1 && var2 == var13.y * 16384 && var7 == var13.maxX * 16384 && var8 == var13.maxY * 16384 && var9 == var13.soundEffectId && var10 == var13.field844 && var11 == var13.field838) {
					if (var13.stream1 != null) {
						BufferedSink.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) {
						BufferedSink.pcmStreamMixer.removeSubStream(var13.stream2);
						var13.stream2 = null;
					}

					var13.remove();
					break;
				}
			}
		}

	}
}
