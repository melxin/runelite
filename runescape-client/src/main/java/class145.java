import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class145 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 249705995
	)
	static int field1728;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 855384109
	)
	int field1732;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[Lfu;"
	)
	public class137[][] field1729;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lfu;"
	)
	class137[][] field1730;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	public Skeleton field1731;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 839559417
	)
	int field1737;
	@ObfuscatedName("aq")
	boolean field1733;
	@ObfuscatedName("ac")
	Future field1734;
	@ObfuscatedName("aa")
	List field1727;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)V"
	)
	class145(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1729 = null;
		this.field1730 = null;
		this.field1737 = 0;
		this.field1732 = var3;
		byte[] var4 = var1.takeFile(this.field1732 >> 16 & 65535, this.field1732 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1731 = new Skeleton(var7, var8);
		this.field1727 = new ArrayList();
		this.field1734 = class30.field134.submit(new class142(this, var5, var6));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "597158814"
	)
	void method3836(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1737 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1730 = new class137[this.field1731.method5147().method5089()][];
		this.field1729 = new class137[this.field1731.method5152()][];
		class136[] var4 = new class136[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class138[] var16 = new class138[]{class138.field1675, class138.field1681, class138.field1677, class138.field1678, class138.field1684, class138.field1680};
			class138 var17 = (class138)ScriptFrame.findEnumerated(var16, var7);
			if (var17 == null) {
				var17 = class138.field1675;
			}

			var9 = var1.readShortSmart();
			int var11 = var1.readUnsignedByte();
			class139[] var12 = new class139[]{class139.field1689, class139.field1707, class139.field1708, class139.field1688, class139.field1705, class139.field1693, class139.field1694, class139.field1695, class139.field1696, class139.field1697, class139.field1698, class139.field1699, class139.field1700, class139.field1701, class139.field1690, class139.field1703, class139.field1692};
			class139 var13 = (class139)ScriptFrame.findEnumerated(var12, var11);
			if (var13 == null) {
				var13 = class139.field1689;
			}

			class137 var21 = new class137();
			var21.method3758(var1, var2);
			var4[var5] = new class136(this, var21, var17, var13, var9);
			int var14 = var17.method3796();
			class137[][] var15;
			if (var17 == class138.field1681) {
				var15 = this.field1730;
			} else {
				var15 = this.field1729;
			}

			if (var15[var9] == null) {
				var15[var9] = new class137[var14];
			}

			if (var17 == class138.field1684) {
				this.field1733 = true;
			}
		}

		var5 = var3 / field1728;
		int var6 = var3 % field1728;
		int var8 = 0;

		for (var9 = 0; var9 < field1728; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1727.add(class30.field134.submit(new class140(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	public boolean method3863() {
		if (this.field1734 == null && this.field1727 == null) {
			return true;
		} else {
			if (this.field1734 != null) {
				if (!this.field1734.isDone()) {
					return false;
				}

				this.field1734 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1727.size(); ++var2) {
				if (!((Future)this.field1727.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1727.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1727 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-99406202"
	)
	public int method3862() {
		return this.field1737;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-31"
	)
	public boolean method3839() {
		return this.field1733;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILfa;IIS)V",
		garbageValue = "-22987"
	)
	public void method3840(int var1, class134 var2, int var3, int var4) {
		TransformationMatrix var5 = AbstractArchive.method8450();
		this.method3841(var5, var3, var2, var1);
		this.method3860(var5, var3, var2, var1);
		this.method3842(var5, var3, var2, var1);
		var2.method3695(var5);
		var5.method9171();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfa;II)V",
		garbageValue = "1781086543"
	)
	void method3841(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3698(this.field1737);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1730[var2] != null) {
			class137 var9 = this.field1730[var2][0];
			class137 var10 = this.field1730[var2][1];
			class137 var11 = this.field1730[var2][2];
			if (var9 != null) {
				var6 = var9.method3760(var4);
			}

			if (var10 != null) {
				var7 = var10.method3760(var4);
			}

			if (var11 != null) {
				var8 = var11.method3760(var4);
			}
		}

		class451 var16 = class135.method3746();
		var16.method9123(1.0F, 0.0F, 0.0F, var6);
		class451 var14 = class135.method3746();
		var14.method9123(0.0F, 1.0F, 0.0F, var7);
		class451 var15 = class135.method3746();
		var15.method9123(0.0F, 0.0F, 1.0F, var8);
		class451 var12 = class135.method3746();
		var12.method9129(var15);
		var12.method9129(var16);
		var12.method9129(var14);
		TransformationMatrix var13 = AbstractArchive.method8450();
		var13.method9258(var12);
		var1.method9181(var13);
		var16.method9120();
		var14.method9120();
		var15.method9120();
		var12.method9120();
		var13.method9171();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfa;II)V",
		garbageValue = "-1868867222"
	)
	void method3842(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3700(this.field1737);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1730[var2] != null) {
			class137 var9 = this.field1730[var2][3];
			class137 var10 = this.field1730[var2][4];
			class137 var11 = this.field1730[var2][5];
			if (var9 != null) {
				var6 = var9.method3760(var4);
			}

			if (var10 != null) {
				var7 = var10.method3760(var4);
			}

			if (var11 != null) {
				var8 = var11.method3760(var4);
			}
		}

		var1.field5229[12] = var6;
		var1.field5229[13] = var7;
		var1.field5229[14] = var8;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrz;ILfa;II)V",
		garbageValue = "-1789558006"
	)
	void method3860(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3730(this.field1737);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1730[var2] != null) {
			class137 var9 = this.field1730[var2][6];
			class137 var10 = this.field1730[var2][7];
			class137 var11 = this.field1730[var2][8];
			if (var9 != null) {
				var6 = var9.method3760(var4);
			}

			if (var10 != null) {
				var7 = var10.method3760(var4);
			}

			if (var11 != null) {
				var8 = var11.method3760(var4);
			}
		}

		TransformationMatrix var12 = AbstractArchive.method8450();
		var12.method9179(var6, var7, var8);
		var1.method9181(var12);
		var12.method9171();
	}
}
