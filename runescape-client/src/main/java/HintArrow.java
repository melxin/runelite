import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("HintArrow")
public class HintArrow {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1767929617
	)
	@Export("targetType")
	int targetType;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -883261445
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 674999191
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 334577551
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2034889953
	)
	@Export("subX")
	int subX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2066425043
	)
	@Export("subY")
	int subY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 921756565
	)
	@Export("height")
	int height;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	public void method8228() {
		this.targetType = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-804930991"
	)
	public boolean method8229() {
		return this.targetType != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-26080"
	)
	public int method8230() {
		return this.targetType;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	public int method8231() {
		return this.targetIndex;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1282567917"
	)
	public int method8250() {
		return this.x;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "835459243"
	)
	public int method8235() {
		return this.y;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-26"
	)
	public int method8232() {
		return this.subX;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-978517788"
	)
	public int method8234() {
		return this.subY;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1238636034"
	)
	public int method8246() {
		return this.height;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-1015716018"
	)
	public void method8236(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		switch(var2) {
		case 1:
			this.targetType = 1;
			break;
		case 2:
			this.subX = 64;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 3:
			this.subX = 0;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 4:
			this.subX = 128;
			this.subY = 64;
			this.targetType = 2;
			break;
		case 5:
			this.subX = 64;
			this.subY = 0;
			this.targetType = 2;
			break;
		case 6:
			this.subX = 64;
			this.subY = 128;
			this.targetType = 2;
		case 7:
		case 8:
		case 9:
		default:
			break;
		case 10:
			this.targetType = 3;
			break;
		case 11:
			this.targetType = 4;
		}

		switch(this.targetType) {
		case 0:
			break;
		case 1:
		case 3:
			this.targetIndex = var1.readUnsignedShort();
			break;
		case 2:
			this.x = var1.readUnsignedShort();
			this.y = var1.readUnsignedShort();
			this.height = var1.readUnsignedByte();
			break;
		case 4:
			this.targetIndex = var1.readUnsignedShort();
			this.height = var1.readMedium();
			break;
		default:
			throw new RuntimeException("");
		}

	}
}
