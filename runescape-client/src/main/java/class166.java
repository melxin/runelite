import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class166 {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -3846091845792541665L
	)
	long field1868;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 872392788691478369L
	)
	public long field1867;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	IterableNodeDeque field1863;

	@ObfuscatedSignature(
		descriptor = "(Lwj;)V"
	)
	public class166(Buffer var1) {
		this.field1867 = -1L;
		this.field1863 = new IterableNodeDeque();
		this.method4010(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;B)V",
		garbageValue = "7"
	)
	void method4010(Buffer var1) {
		this.field1868 = var1.readLong();
		this.field1867 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class161(this);
			} else if (var2 == 4) {
				var3 = new class172(this);
			} else if (var2 == 3) {
				var3 = new class157(this);
			} else if (var2 == 2) {
				var3 = new class155(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class162(this);
			}

			((class165)var3).vmethod4076(var1);
			this.field1863.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "595352516"
	)
	public void method4011(ClanChannel var1) {
		if (var1.key == this.field1868 && var1.field1885 == this.field1867) {
			for (class165 var2 = (class165)this.field1863.last(); var2 != null; var2 = (class165)this.field1863.previous()) {
				var2.vmethod4077(var1);
			}

			++var1.field1885;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V",
		garbageValue = "-1792281244"
	)
	public static void method4016(AbstractArchive var0) {
		class554.field5659 = var0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "-1699754054"
	)
	public static TransformationMatrix method4019() {
		synchronized(TransformationMatrix.field5073) {
			if (class359.field3967 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field5073[--class359.field3967].method9108();
				return TransformationMatrix.field5073[class359.field3967];
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1754283513"
	)
	static void method4014(int var0, int var1, int var2, int var3) {
		class337.musicPlayerStatus = var0;
		class337.field3797 = var1;
		class337.field3798 = var2;
		class337.field3789 = var3;
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1680957230"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
