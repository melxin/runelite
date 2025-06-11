import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class205 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("field1909")
	static EvictingDualNodeHashTable field1909;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lwy;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lps;IB)V",
		garbageValue = "-59"
	)
	public static void method4315(AbstractArchive var0, int var1) {
		if (!class335.field3698.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class335.field3698.iterator();

			while (var3.hasNext()) {
				MidiRequest var4 = (MidiRequest)var3.next();
				var4.field3817 = false;
				var4.field3820 = false;
				var4.field3818 = false;
				var4.field3812 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3814 = 0.0F;
				var2.add(var4);
			}

			class30.method451(var2, class335.musicPlayerStatus, class335.field3697, class335.field3702, class335.field3703, false);
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(IIII[Ljava/lang/Object;B)V",
		garbageValue = "8"
	)
	static void method4312(int var0, int var1, int var2, int var3, Object[] var4) {
		boolean var5 = false;
		Widget var6 = ClientPreferences.widgetDefinition.getWidgetChild(var0, var1);
		if (var5 || var6 != null) {
			int var8;
			if (!var5) {
				var8 = class255.method5526(var6);
				boolean var7 = (var8 >> 23 & 1) != 0;
				if (!var7) {
					return;
				}
			}

			PacketBufferNode var16 = class139.getPacketBufferNode(ClientPacket.IF_RUNSCRIPT, Client.packetWriter.isaacCipher);
			var16.packetBuffer.writeShort(0);
			var8 = var16.packetBuffer.offset;
			var16.packetBuffer.writeShort(var1);
			var16.packetBuffer.writeIntIME(var0);
			var16.packetBuffer.writeShortAdd(var2);
			var16.packetBuffer.writeIntLE(var3);
			Object[] var9 = var4;

			for (int var10 = 0; var10 < var9.length; ++var10) {
				Object var11 = var9[var10];
				if (var11 instanceof Integer) {
					var16.packetBuffer.method10852((Integer)var11);
				} else if (var11 instanceof String) {
					var16.packetBuffer.writeStringCp1252NullTerminated((String)var11);
				} else if (var11 instanceof class509) {
					class509 var12 = (class509)var11;
					int var13 = var12.method9937();
					var16.packetBuffer.writeSmartByteShort(var13);
					int var15;
					if (var12.field5288 == class563.field5600) {
						int[] var17 = var12.method9965();

						for (var15 = 0; var15 < var13; ++var15) {
							var16.packetBuffer.method10852(var17[var15]);
						}
					} else {
						Object[] var14 = var12.method9936();

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
}
