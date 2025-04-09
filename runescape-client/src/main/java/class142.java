import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class142 extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1248806185
	)
	public static int field1659;
	@ObfuscatedName("an")
	public static ThreadPoolExecutor field1657;
	@ObfuscatedName("oa")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	static Task field1664;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 63143335
	)
	int field1658;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	public class135[][] field1660;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[[Lfm;"
	)
	class135[][] field1666;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	public Skeleton field1661;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -147121515
	)
	int field1662;
	@ObfuscatedName("am")
	boolean field1665;
	@ObfuscatedName("aa")
	Future field1656;
	@ObfuscatedName("ap")
	List field1663;

	@ObfuscatedSignature(
		descriptor = "(Lph;Lph;I)V"
	)
	public class142(AbstractArchive var1, AbstractArchive var2, int var3) {
		this.field1660 = null;
		this.field1666 = null;
		this.field1662 = 0;
		this.field1658 = var3;
		byte[] var4 = var1.takeFile(this.field1658 >> 16 & 65535, this.field1658 & 65535);
		Buffer var5 = new Buffer(var4);
		int var6 = var5.readUnsignedByte();
		int var7 = var5.readUnsignedShort();
		byte[] var8 = var2.getFile(var7, 0);
		this.field1661 = new Skeleton(var7, var8);
		this.field1663 = new ArrayList();
		this.field1656 = field1657.submit(new class139(this, var5, var6));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "518953973"
	)
	void method3396(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1662 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1666 = new class135[this.field1661.method4046().method3975()][];
		this.field1660 = new class135[this.field1661.method4041()][];
		class134[] var4 = new class134[var3];

		int var5;
		int var7;
		int var9;
		for (var5 = 0; var5 < var3; ++var5) {
			var7 = var1.readUnsignedByte();
			class136 var14 = (class136)ArchiveDiskActionHandler.findEnumerated(AsyncHttpResponse.method267(), var7);
			if (var14 == null) {
				var14 = class136.field1613;
			}

			var9 = var1.readShortSmart();
			class137 var16 = DynamicObject.method2371(var1.readUnsignedByte());
			class135 var17 = new class135();
			var17.method3319(var1, var2);
			var4[var5] = new class134(this, var17, var14, var16, var9);
			int var12 = var14.method3352();
			class135[][] var13;
			if (var14 == class136.field1609) {
				var13 = this.field1666;
			} else {
				var13 = this.field1660;
			}

			if (var13[var9] == null) {
				var13[var9] = new class135[var12];
			}

			if (var14 == class136.field1611) {
				this.field1665 = true;
			}
		}

		var5 = var3 / field1659;
		int var6 = var3 % field1659;
		int var8 = 0;

		for (var9 = 0; var9 < field1659; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1663.add(field1657.submit(new class141(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method3397() {
		if (this.field1656 == null && this.field1663 == null) {
			return true;
		} else {
			if (this.field1656 != null) {
				if (!this.field1656.isDone()) {
					return false;
				}

				this.field1656 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1663.size(); ++var2) {
				if (!((Future)this.field1663.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1663.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1663 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1959577155"
	)
	public int method3421() {
		return this.field1662;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2010872649"
	)
	public boolean method3399() {
		return this.field1665;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILfv;III)V",
		garbageValue = "-1022473126"
	)
	public void method3400(int var1, class132 var2, int var3, int var4) {
		TransformationMatrix var5 = class331.method6572();
		this.method3401(var5, var3, var2, var1);
		this.method3403(var5, var3, var2, var1);
		this.method3402(var5, var3, var2, var1);
		var2.method3271(var5);
		var5.method8500();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILfv;II)V",
		garbageValue = "-655949274"
	)
	void method3401(TransformationMatrix var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3274(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1666[var2] != null) {
			class135 var9 = this.field1666[var2][0];
			class135 var10 = this.field1666[var2][1];
			class135 var11 = this.field1666[var2][2];
			if (var9 != null) {
				var6 = var9.method3321(var4);
			}

			if (var10 != null) {
				var7 = var10.method3321(var4);
			}

			if (var11 != null) {
				var8 = var11.method3321(var4);
			}
		}

		class443 var16 = IntProjection.method3961();
		var16.method8401(1.0F, 0.0F, 0.0F, var6);
		class443 var14 = IntProjection.method3961();
		var14.method8401(0.0F, 1.0F, 0.0F, var7);
		class443 var15 = IntProjection.method3961();
		var15.method8401(0.0F, 0.0F, 1.0F, var8);
		class443 var12 = IntProjection.method3961();
		var12.method8415(var15);
		var12.method8415(var16);
		var12.method8415(var14);
		TransformationMatrix var13 = class331.method6572();
		var13.method8436(var12);
		var1.method8450(var13);
		var16.method8397();
		var14.method8397();
		var15.method8397();
		var12.method8397();
		var13.method8500();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILfv;II)V",
		garbageValue = "1096275993"
	)
	void method3402(TransformationMatrix var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3275(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1666[var2] != null) {
			class135 var9 = this.field1666[var2][3];
			class135 var10 = this.field1666[var2][4];
			class135 var11 = this.field1666[var2][5];
			if (var9 != null) {
				var6 = var9.method3321(var4);
			}

			if (var10 != null) {
				var7 = var10.method3321(var4);
			}

			if (var11 != null) {
				var8 = var11.method3321(var4);
			}
		}

		var1.field4936[12] = var6;
		var1.field4936[13] = var7;
		var1.field4936[14] = var8;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrm;ILfv;IS)V",
		garbageValue = "27976"
	)
	void method3403(TransformationMatrix var1, int var2, class132 var3, int var4) {
		float[] var5 = var3.method3298(this.field1662);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1666[var2] != null) {
			class135 var9 = this.field1666[var2][6];
			class135 var10 = this.field1666[var2][7];
			class135 var11 = this.field1666[var2][8];
			if (var9 != null) {
				var6 = var9.method3321(var4);
			}

			if (var10 != null) {
				var7 = var10.method3321(var4);
			}

			if (var11 != null) {
				var8 = var11.method3321(var4);
			}
		}

		TransformationMatrix var12 = class331.method6572();
		var12.method8432(var6, var7, var8);
		var1.method8450(var12);
		var12.method8500();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Ljs;",
		garbageValue = "581601438"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-999490844"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (SoundCache.friendsChat != null) {
			PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.field3447, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class466.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
