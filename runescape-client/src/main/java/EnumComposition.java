import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lme;"
	)
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("ag")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("aj")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ah")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -232799901
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 224222619
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("aq")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ac")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("aa")
	@Export("strVals")
	public String[] strVals;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	DynamicArray field2064;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	DynamicArray field2056;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "313082121"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1051106566"
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
			this.defaultInt = var1.method11575();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.method11575();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.method11575();
					this.intVals[var3] = var1.method11575();
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)Ltl;",
		garbageValue = "-23304"
	)
	public DynamicArray method4339() {
		if (this.field2064 == null) {
			this.field2064 = class151.method3914(this.keys);
		}

		return this.field2064;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "2043665788"
	)
	public DynamicArray method4351() {
		if (this.field2056 == null) {
			if (this.outputType == 's') {
				this.field2056 = class393.method8268(this.strVals);
			} else {
				this.field2056 = class151.method3914(this.intVals);
			}
		}

		return this.field2056;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BB)Lxl;",
		garbageValue = "-114"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			if (var1 != null) {
				int var6 = var1.getWidth();
				int var7 = var1.getHeight();
				int[] var4 = new int[var6 * var7];
				PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
				var5.grabPixels();
				return new SpritePixels(var4, var6, var7);
			}
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1990362405"
	)
	public static boolean method4360(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
