import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class144 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 514088199
	)
	public static int field1711;
	@ObfuscatedName("ab")
	public static ThreadPoolExecutor field1714;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 1113495299
	)
	static int field1717;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 153177705
	)
	int field1709;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[Lfn;"
	)
	public class137[][] field1710;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[[Lfn;"
	)
	class137[][] field1712;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	public Skeleton field1708;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 766010951
	)
	int field1713;
	@ObfuscatedName("ap")
	boolean field1707;
	@ObfuscatedName("am")
	Future field1715;
	@ObfuscatedName("aj")
	List field1716;

	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)V"
	)
	public class144(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1710 = null;
		this.field1712 = null;
		this.field1713 = 0;
		this.field1709 = var3;
		byte[] var4 = var1.takeFile(this.field1709 >> 16 & 65535, this.field1709 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1708 = new Skeleton(var7, var8);
		this.field1716 = new ArrayList();
		this.field1715 = field1714.submit(new class141(this, var5, var6));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lwj;II)V",
		garbageValue = "-1400458106"
	)
	void method3713(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1713 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1712 = new class137[this.field1708.method5072().method5015()][];
		this.field1710 = new class137[this.field1708.method5066()][];
		class136[] var4 = new class136[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class138 var14 = (class138)HealthBarConfig.findEnumerated(UrlRequester.method3446(), var7);
			if (var14 == null) {
				var14 = class138.field1664;
			}

			var9 = var1.readShortSmart();
			class139 var16 = AsyncHttpResponse.method284(var1.readUnsignedByte());
			class137 var17 = new class137();
			var17.method3655(var1, var2);
			var4[var5] = new class136(this, var17, var14, var16, var9);
			int var12 = var14.method3677();
			class137[][] var13;
			if (var14 == class138.field1663) {
				var13 = this.field1712;
			} else {
				var13 = this.field1710;
			}

			if (var13[var9] == null) {
				var13[var9] = new class137[var12];
			}

			if (var14 == class138.field1659) {
				this.field1707 = true;
			}
		}

		var5 = var3 / field1711;
		int var6 = var3 % field1711;
		int var8 = 0;

		for (var9 = 0; var9 < field1711; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1716.add(field1714.submit(new class143(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1597930064"
	)
	public boolean method3716() {
		if (this.field1715 == null && this.field1716 == null) {
			return true;
		} else {
			if (this.field1715 != null) {
				if (!this.field1715.isDone()) {
					return false;
				}

				this.field1715 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1716.size(); ++var2) {
				if (!((Future)this.field1716.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1716.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1716 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method3731() {
		return this.field1713;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "512545545"
	)
	public boolean method3719() {
		return this.field1707;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILff;IIB)V",
		garbageValue = "32"
	)
	public void method3712(int var1, class134 var2, int var3, int var4) {
		TransformationMatrix var5 = class166.method4019();
		this.method3717(var5, var3, var2, var1);
		this.method3730(var5, var3, var2, var1);
		this.method3718(var5, var3, var2, var1);
		var2.method3599(var5);
		var5.method9104();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ILff;IB)V",
		garbageValue = "-49"
	)
	void method3717(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3602(this.field1713);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1712[var2] != null) {
			class137 var9 = this.field1712[var2][0];
			class137 var10 = this.field1712[var2][1];
			class137 var11 = this.field1712[var2][2];
			if (var9 != null) {
				var6 = var9.method3652(var4);
			}

			if (var10 != null) {
				var7 = var10.method3652(var4);
			}

			if (var11 != null) {
				var8 = var11.method3652(var4);
			}
		}

		class449 var16 = StudioGame.method8178();
		var16.method9093(1.0F, 0.0F, 0.0F, var6);
		class449 var14 = StudioGame.method8178();
		var14.method9093(0.0F, 1.0F, 0.0F, var7);
		class449 var15 = StudioGame.method8178();
		var15.method9093(0.0F, 0.0F, 1.0F, var8);
		class449 var12 = StudioGame.method8178();
		var12.method9080(var15);
		var12.method9080(var16);
		var12.method9080(var14);
		TransformationMatrix var13 = class166.method4019();
		var13.method9116(var12);
		var1.method9172(var13);
		var16.method9075();
		var14.method9075();
		var15.method9075();
		var12.method9075();
		var13.method9104();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ILff;II)V",
		garbageValue = "1452580433"
	)
	void method3718(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3607(this.field1713);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1712[var2] != null) {
			class137 var9 = this.field1712[var2][3];
			class137 var10 = this.field1712[var2][4];
			class137 var11 = this.field1712[var2][5];
			if (var9 != null) {
				var6 = var9.method3652(var4);
			}

			if (var10 != null) {
				var7 = var10.method3652(var4);
			}

			if (var11 != null) {
				var8 = var11.method3652(var4);
			}
		}

		var1.field5074[12] = var6;
		var1.field5074[13] = var7;
		var1.field5074[14] = var8;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ILff;II)V",
		garbageValue = "2122009091"
	)
	void method3730(TransformationMatrix var1, int var2, class134 var3, int var4) {
		float[] var5 = var3.method3604(this.field1713);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1712[var2] != null) {
			class137 var9 = this.field1712[var2][6];
			class137 var10 = this.field1712[var2][7];
			class137 var11 = this.field1712[var2][8];
			if (var9 != null) {
				var6 = var9.method3652(var4);
			}

			if (var10 != null) {
				var7 = var10.method3652(var4);
			}

			if (var11 != null) {
				var8 = var11.method3652(var4);
			}
		}

		TransformationMatrix var12 = class166.method4019();
		var12.method9139(var6, var7, var8);
		var1.method9172(var12);
		var12.method9104();
	}

	@ObfuscatedName("om")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		DynamicObject.method1988();
		if (MusicPatch.friendsChat != null) {
			MusicPatch.friendsChat.invalidateIgnoreds();
		}

	}
}
