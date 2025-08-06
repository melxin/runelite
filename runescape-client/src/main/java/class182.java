import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class182 extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	@Export("field1864")
	public static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1066390770"
	)
	public static void method4164() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-662336681"
	)
	public static void method4165(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)[Lxv;",
		garbageValue = "-1632808231"
	)
	public static SpritePixels[] method4168(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class209.method4562(var0, var3, var4);
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;I)V",
		garbageValue = "-1954220082"
	)
	static void method4166(int var0, int var1, int var2, int var3, Object[] var4) {
		boolean var5 = false;
		Widget var6 = class167.widgetDefinition.getWidgetChild(var0, var1);
		if (var5 || var6 != null) {
			int var8;
			if (!var5) {
				var8 = class516.getWidgetFlags(var6);
				boolean var7 = (var8 >> 23 & 1) != 0;
				if (!var7) {
					return;
				}
			}

			PacketBufferNode var16 = class291.getPacketBufferNode(ClientPacket.IF_RUNSCRIPT, Client.packetWriter.isaacCipher);
			var16.packetBuffer.writeShort(0);
			var8 = var16.packetBuffer.offset;
			var16.packetBuffer.writeShortLE(var1);
			var16.packetBuffer.writeIntME(var0);
			var16.packetBuffer.writeShort(var2);
			var16.packetBuffer.writeIntIME(var3);
			Object[] var9 = var4;

			for (int var10 = 0; var10 < var9.length; ++var10) {
				Object var11 = var9[var10];
				if (var11 instanceof Integer) {
					var16.packetBuffer.method11246((Integer)var11);
				} else if (var11 instanceof String) {
					var16.packetBuffer.writeStringCp1252NullTerminated((String)var11);
				} else if (var11 instanceof DynamicArray) {
					DynamicArray var12 = (DynamicArray)var11;
					int var13 = var12.method10351();
					var16.packetBuffer.writeSmartByteShort(var13);
					int var15;
					if (var12.field5399 == class570.field5721) {
						int[] var17 = var12.method10348();

						for (var15 = 0; var15 < var13; ++var15) {
							var16.packetBuffer.method11246(var17[var15]);
						}
					} else {
						Object[] var14 = var12.method10393();

						for (var15 = 0; var15 < var13; ++var15) {
							var16.packetBuffer.writeStringCp1252NullTerminated((String)var14[var15]);
						}
					}
				} else if (var11 == null) {
					var16.packetBuffer.writeByte(0);
				}
			}

			var16.packetBuffer.writeLengthShort(var16.packetBuffer.offset - var8);
			Client.packetWriter.addNode(var16);
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "12"
	)
	static void method4167(int var0) {
		SequenceDefinition var1 = AsyncHttpResponse.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			int var3 = var1.SequenceDefinition_cachedModelId;
			class144 var4 = AttackOption.method2762(var3);
			int var2;
			if (var4 == null) {
				var2 = 2;
			} else {
				var2 = var4.method3716() ? 0 : 1;
			}

			if (var2 == 2) {
				Client.field407.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
