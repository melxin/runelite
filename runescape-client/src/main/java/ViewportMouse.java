import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class448 field2905;
	@ObfuscatedName("bi")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -884646507
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 334517251
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("be")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -942059985
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("bh")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		field2905 = new class448();
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfn;FI)F",
		garbageValue = "444610927"
	)
	static float method5621(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1658;
			return var0.field1646 + ((var0.field1642 * var2 + var0.field1643) * var2 + var0.field1635) * var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1757691329"
	)
	public static void method5645(int var0, int var1, int var2, int var3) {
		if (class337.midiRequests.size() > 1 && class337.midiRequests.get(0) != null && ((MidiRequest)class337.midiRequests.get(0)).midiPcmStream.isReady() && class337.midiRequests.get(1) != null && ((MidiRequest)class337.midiRequests.get(1)).midiPcmStream.isReady()) {
			class166.method4014(var0, var1, var2, var3);
			class337.field3795.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class337.field3789), class337.field3798));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class337.field3797), class337.musicPlayerStatus));
			class337.field3795.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class337.field3790.get(0) != null && class337.field3790.get(1) != null) {
				MidiRequest var5 = (MidiRequest)class337.field3790.get(0);
				class337.field3790.set(0, class337.midiRequests.get(1));
				class337.field3790.set(1, var5);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method5646(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/lang/String;I)V",
		garbageValue = "-1495202470"
	)
	@Export("widgetDefaultMenuAction")
	static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
		int var5 = var0 >>> 16;
		int var6 = var0 & 65535;
		Widget var7 = class167.widgetDefinition.getWidgetChild(var1, var2);
		if (var7 != null) {
			if (var7.onOp != null) {
				ScriptEvent var8 = new ScriptEvent();
				var8.widget = var7;
				var8.opIndex = var6;
				var8.field877 = var5;
				var8.targetName = var4;
				var8.args = var7.onOp;
				SequenceDefinition.runScriptEvent(var8);
			}

			boolean var10 = true;
			if (var7.contentType > 0) {
				var10 = DynamicObject.method1989(var7);
			}

			if (var10) {
				if (AbstractWorldMapIcon.method6880(SequenceDefinition.method4771(var7), var6 - 1)) {
					PacketBufferNode var9;
					if (var5 == 0) {
						var9 = class291.getPacketBufferNode(ClientPacket.IF_BUTTONX, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						Client.packetWriter.addNode(var9);
					} else {
						var9 = class291.getPacketBufferNode(ClientPacket.IF_SUBOP, Client.packetWriter.isaacCipher);
						var9.packetBuffer.writeInt(var1);
						var9.packetBuffer.writeShort(var2);
						var9.packetBuffer.writeShort(var3);
						var9.packetBuffer.writeByte(var6);
						var9.packetBuffer.writeByte(var5 - 1);
						Client.packetWriter.addNode(var9);
					}

				}
			}
		}
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1236043375"
	)
	static void method5644(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
