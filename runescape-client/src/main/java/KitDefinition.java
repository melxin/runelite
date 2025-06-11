import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2122223381
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ba")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("am")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ah")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ag")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("au")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ar")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("ad")
	@Export("models")
	int[] models;
	@ObfuscatedName("af")
	@Export("nonSelectable")
	public boolean nonSelectable;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -504403421
	)
	@Export("bodypartID")
	int bodypartID;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
		this.bodypartID = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "28"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "1203941921"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1231571640"
	)
	public boolean method4043(int var1, int var2) {
		if (var2 == 1) {
			return this.bodypartID == var1 + 7;
		} else {
			return this.bodypartID == var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2092401806"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!class63.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "1616456205"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(class63.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1987932031"
	)
	public boolean method4058() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !class63.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "2135008691"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(class63.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}
}
