import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class144 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 334062363
	)
	static int field1686;
	@ObfuscatedName("af")
	static ThreadPoolExecutor field1687;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	static ClanSettings field1684;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1868098605
	)
	int field1682;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[[Lfn;"
	)
	public class136[][] field1681;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Lfn;"
	)
	class136[][] field1685;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	public Skeleton field1683;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1514141941
	)
	int field1691;
	@ObfuscatedName("ac")
	boolean field1692;
	@ObfuscatedName("aa")
	Future field1688;
	@ObfuscatedName("as")
	List field1689;

	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpl;I)V"
	)
	class144(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1681 = null;
		this.field1685 = null;
		this.field1691 = 0;
		this.field1682 = var3;
		byte[] var4 = var1.takeFile(this.field1682 >> 16 & 65535, this.field1682 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1683 = new Skeleton(var7, var8);
		this.field1689 = new ArrayList();
		this.field1688 = field1687.submit(new class143(this, var5, var6));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;IB)V",
		garbageValue = "97"
	)
	void method3411(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1691 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1685 = new class136[this.field1683.method4900().method4841()][];
		this.field1681 = new class136[this.field1683.method4899()][];
		class135[] var4 = new class135[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			class137 var14 = class512.method9563(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			var9 = var1.readUnsignedByte();
			class138[] var15 = new class138[]{class138.field1650, class138.field1641, class138.field1640, class138.field1643, class138.field1644, class138.field1648, class138.field1646, class138.field1649, class138.field1658, class138.field1659, class138.field1642, class138.field1651, class138.field1652, class138.field1653, class138.field1654, class138.field1655, class138.field1656};
			class138 var16 = (class138)class454.findEnumerated(var15, var9);
			if (var16 == null) {
				var16 = class138.field1650;
			}

			class136 var19 = new class136();
			var19.method3376(var1, var2);
			var4[var5] = new class135(this, var19, var14, var16, var7);
			int var12 = var14.method3378();
			class136[][] var13;
			if (var14 == class137.field1632) {
				var13 = this.field1685;
			} else {
				var13 = this.field1681;
			}

			if (var13[var7] == null) {
				var13[var7] = new class136[var12];
			}

			if (var14 == class137.field1634) {
				this.field1692 = true;
			}
		}

		var5 = var3 / field1686;
		int var6 = var3 % field1686;
		int var8 = 0;

		for (var9 = 0; var9 < field1686; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1689.add(field1687.submit(new class139(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "147385430"
	)
	public boolean method3412() {
		if (this.field1688 == null && this.field1689 == null) {
			return true;
		} else {
			if (this.field1688 != null) {
				if (!this.field1688.isDone()) {
					return false;
				}

				this.field1688 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1689.size(); ++var2) {
				if (!((Future)this.field1689.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1689.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1689 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-219163673"
	)
	public int method3413() {
		return this.field1691;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	public boolean method3414() {
		return this.field1692;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILfe;III)V",
		garbageValue = "-1421690665"
	)
	public void method3440(int var1, class133 var2, int var3, int var4) {
		TransformationMatrix var5 = class148.method3476();
		this.method3431(var5, var3, var2, var1);
		this.method3428(var5, var3, var2, var1);
		this.method3417(var5, var3, var2, var1);
		var2.method3287(var5);
		var5.method8413();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lro;ILfe;IB)V",
		garbageValue = "-35"
	)
	void method3431(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3326(this.field1691);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1685[var2] != null) {
			class136 var9 = this.field1685[var2][0];
			class136 var10 = this.field1685[var2][1];
			class136 var11 = this.field1685[var2][2];
			if (var9 != null) {
				var6 = var9.method3370(var4);
			}

			if (var10 != null) {
				var7 = var10.method3370(var4);
			}

			if (var11 != null) {
				var8 = var11.method3370(var4);
			}
		}

		class443 var16 = class433.method8185();
		var16.method8384(1.0F, 0.0F, 0.0F, var6);
		class443 var14 = class433.method8185();
		var14.method8384(0.0F, 1.0F, 0.0F, var7);
		class443 var15 = class433.method8185();
		var15.method8384(0.0F, 0.0F, 1.0F, var8);
		class443 var12 = class433.method8185();
		var12.method8356(var15);
		var12.method8356(var16);
		var12.method8356(var14);
		TransformationMatrix var13 = class148.method3476();
		var13.method8411(var12);
		var1.method8399(var13);
		var16.method8366();
		var14.method8366();
		var15.method8366();
		var12.method8366();
		var13.method8413();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lro;ILfe;II)V",
		garbageValue = "1479824946"
	)
	void method3417(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3300(this.field1691);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1685[var2] != null) {
			class136 var9 = this.field1685[var2][3];
			class136 var10 = this.field1685[var2][4];
			class136 var11 = this.field1685[var2][5];
			if (var9 != null) {
				var6 = var9.method3370(var4);
			}

			if (var10 != null) {
				var7 = var10.method3370(var4);
			}

			if (var11 != null) {
				var8 = var11.method3370(var4);
			}
		}

		var1.field4913[12] = var6;
		var1.field4913[13] = var7;
		var1.field4913[14] = var8;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lro;ILfe;II)V",
		garbageValue = "-2124961065"
	)
	void method3428(TransformationMatrix var1, int var2, class133 var3, int var4) {
		float[] var5 = var3.method3307(this.field1691);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1685[var2] != null) {
			class136 var9 = this.field1685[var2][6];
			class136 var10 = this.field1685[var2][7];
			class136 var11 = this.field1685[var2][8];
			if (var9 != null) {
				var6 = var9.method3370(var4);
			}

			if (var10 != null) {
				var7 = var10.method3370(var4);
			}

			if (var11 != null) {
				var8 = var11.method3370(var4);
			}
		}

		TransformationMatrix var12 = class148.method3476();
		var12.method8404(var6, var7, var8);
		var1.method8399(var12);
		var12.method8413();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3438() {
		VarcInt.VarcInt_cached.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-1070728035"
	)
	public static class144 method3421(int var0) {
		class144 var1 = (class144)SequenceDefinition.SequenceDefinition_cachedModel.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class254.method5253(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, class194.SpotAnimationDefinition_archive, var0);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1222980908"
	)
	public static void method3439() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}
}
