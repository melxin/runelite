import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class151 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = -6218788038161317647L
	)
	long field1721;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2013194585
	)
	public int field1724;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	IterableNodeDeque field1731;

	@ObfuscatedSignature(
		descriptor = "(Lve;)V"
	)
	public class151(Buffer var1) {
		this.field1724 = -1;
		this.field1731 = new IterableNodeDeque();
		this.method3485(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lve;I)V",
		garbageValue = "420715945"
	)
	void method3485(Buffer var1) {
		this.field1721 = var1.readLong();
		this.field1724 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class170(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class163(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class162(this);
			} else if (var2 == 5) {
				var3 = new class147(this);
			} else if (var2 == 2) {
				var3 = new class152(this);
			} else if (var2 == 7) {
				var3 = new class145(this);
			} else if (var2 == 14) {
				var3 = new class149(this);
			} else if (var2 == 8) {
				var3 = new class166(this);
			} else if (var2 == 9) {
				var3 = new class172(this);
			} else if (var2 == 10) {
				var3 = new class158(this);
			} else if (var2 == 11) {
				var3 = new class153(this);
			} else if (var2 == 12) {
				var3 = new class157(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class167(this);
			}

			((class148)var3).vmethod3749(var1);
			this.field1731.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "1923050518"
	)
	public void method3486(ClanSettings var1) {
		if (var1.field1778 == this.field1721 && this.field1724 == var1.field1779) {
			for (class148 var2 = (class148)this.field1731.last(); var2 != null; var2 = (class148)this.field1731.previous()) {
				var2.vmethod3750(var1);
			}

			++var1.field1779;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "-703585412"
	)
	static class143[] method3484() {
		return new class143[]{class143.field1675, class143.field1669, class143.field1679, class143.field1671, class143.field1672, class143.field1673, class143.field1674, class143.field1678, class143.field1676};
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Object;",
		garbageValue = "-2588734"
	)
	static Object method3493(int var0) {
		return class164.method3674((class555)ArchiveDiskActionHandler.findEnumerated(class555.method10145(), var0));
	}
}
