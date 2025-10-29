import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class146 extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1886450023
	)
	public static int field1720;
	@ObfuscatedName("at")
	public static ThreadPoolExecutor field1722;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 50295743
	)
	static int field1726;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1843348099
	)
	int field1718;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[[Lft;"
	)
	public class139[][] field1719;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[[Lft;"
	)
	class139[][] field1717;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	public Skeleton field1721;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -157771145
	)
	int field1716;
	@ObfuscatedName("aw")
	boolean field1723;
	@ObfuscatedName("ap")
	Future field1724;
	@ObfuscatedName("ay")
	List field1725;

	@ObfuscatedSignature(
		descriptor = "(Lqm;Lqm;I)V"
	)
	public class146(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1719 = null;
		this.field1717 = null;
		this.field1716 = 0;
		this.field1718 = var3;
		byte[] var4 = var1.takeFile(this.field1718 >> 16 & 65535, this.field1718 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1721 = new Skeleton(var7, var8);
		this.field1725 = new ArrayList();
		this.field1724 = field1722.submit(new class143(this, var5, var6));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-1334730354"
	)
	void method3928(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1716 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1717 = new class139[this.field1721.method5545().method5475()][];
		this.field1719 = new class139[this.field1721.method5544()][];
		class138[] var4 = new class138[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class140 var12 = WorldMapSection1.method7031(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class141 var13 = SoundCache.method3248(var1.readUnsignedByte());
			class139 var14 = new class139();
			var14.method3833(var1, var2);
			var4[var5] = new class138(this, var14, var12, var13, var7);
			int var10 = var12.method3864();
			class139[][] var15;
			if (var12 == class140.field1673) {
				var15 = this.field1717;
			} else {
				var15 = this.field1719;
			}

			if (var15[var7] == null) {
				var15[var7] = new class139[var10];
			}

			if (var12 == class140.field1675) {
				this.field1723 = true;
			}
		}

		var5 = var3 / field1720;
		int var6 = var3 % field1720;
		int var8 = 0;

		for (int var9 = 0; var9 < field1720; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var7 == var8) {
				break;
			}

			this.field1725.add(field1722.submit(new class145(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1632678446"
	)
	public boolean method3905() {
		if (this.field1724 == null && this.field1725 == null) {
			return true;
		} else {
			if (this.field1724 != null) {
				if (!this.field1724.isDone()) {
					return false;
				}

				this.field1724 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1725.size(); ++var2) {
				if (!((Future)this.field1725.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1725.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1725 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	public int method3906() {
		return this.field1716;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "12"
	)
	public boolean method3935() {
		return this.field1723;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILfs;III)V",
		garbageValue = "-1295019965"
	)
	public void method3908(int var1, class136 var2, int var3, int var4) {
		TransformationMatrix var5 = SecureUrlRequester.method3659();
		this.method3909(var5, var3, var2, var1);
		this.method3911(var5, var3, var2, var1);
		this.method3910(var5, var3, var2, var1);
		var2.method3786(var5);
		var5.method9417();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lry;ILfs;II)V",
		garbageValue = "1654084282"
	)
	void method3909(TransformationMatrix var1, int var2, class136 var3, int var4) {
		float[] var5 = var3.method3789(this.field1716);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1717[var2] != null) {
			class139 var9 = this.field1717[var2][0];
			class139 var10 = this.field1717[var2][1];
			class139 var11 = this.field1717[var2][2];
			if (var9 != null) {
				var6 = var9.method3835(var4);
			}

			if (var10 != null) {
				var7 = var10.method3835(var4);
			}

			if (var11 != null) {
				var8 = var11.method3835(var4);
			}
		}

		class461 var16 = class151.method3974();
		var16.method9400(1.0F, 0.0F, 0.0F, var6);
		class461 var14 = class151.method3974();
		var14.method9400(0.0F, 1.0F, 0.0F, var7);
		class461 var15 = class151.method3974();
		var15.method9400(0.0F, 0.0F, 1.0F, var8);
		class461 var12 = class151.method3974();
		var12.method9373(var15);
		var12.method9373(var16);
		var12.method9373(var14);
		TransformationMatrix var13 = SecureUrlRequester.method3659();
		var13.method9457(var12);
		var1.method9426(var13);
		var16.method9362();
		var14.method9362();
		var15.method9362();
		var12.method9362();
		var13.method9417();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lry;ILfs;II)V",
		garbageValue = "-1593470736"
	)
	void method3910(TransformationMatrix var1, int var2, class136 var3, int var4) {
		float[] var5 = var3.method3790(this.field1716);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1717[var2] != null) {
			class139 var9 = this.field1717[var2][3];
			class139 var10 = this.field1717[var2][4];
			class139 var11 = this.field1717[var2][5];
			if (var9 != null) {
				var6 = var9.method3835(var4);
			}

			if (var10 != null) {
				var7 = var10.method3835(var4);
			}

			if (var11 != null) {
				var8 = var11.method3835(var4);
			}
		}

		var1.field5260[12] = var6;
		var1.field5260[13] = var7;
		var1.field5260[14] = var8;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lry;ILfs;II)V",
		garbageValue = "-176495510"
	)
	void method3911(TransformationMatrix var1, int var2, class136 var3, int var4) {
		float[] var5 = var3.method3791(this.field1716);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1717[var2] != null) {
			class139 var9 = this.field1717[var2][6];
			class139 var10 = this.field1717[var2][7];
			class139 var11 = this.field1717[var2][8];
			if (var9 != null) {
				var6 = var9.method3835(var4);
			}

			if (var10 != null) {
				var7 = var10.method3835(var4);
			}

			if (var11 != null) {
				var8 = var11.method3835(var4);
			}
		}

		TransformationMatrix var12 = SecureUrlRequester.method3659();
		var12.method9425(var6, var7, var8);
		var1.method9426(var12);
		var12.method9417();
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V",
		garbageValue = "1143496681"
	)
	static final void method3937(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class101.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
