import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public class class483 extends class482 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 44791921
	)
	static final int field5043;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	static Archive field5042;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	final WorldEntityCoord field5044;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	final WorldEntityCoord field5048;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1157501041
	)
	int field5045;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1558880061
	)
	int field5046;

	static {
		field5043 = Client.field689 + 3;
	}

	class483() {
		this.field5044 = new WorldEntityCoord();
		this.field5048 = new WorldEntityCoord();
		this.field5045 = 0;
		this.field5046 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkj;Lsl;IB)V",
		garbageValue = "0"
	)
	void vmethod9208(WorldEntityCoord var1, class481 var2, int var3) {
		this.field5044.method5695(var1);
		this.field5048.method5695(var2.field5038);
		this.field5045 = var3 - 1;
		this.field5046 = var2.field5037 + field5043;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;III)Z",
		garbageValue = "1905256684"
	)
	boolean vmethod9214(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5045 >= this.field5046) {
			var1.method5695(this.field5048);
			return true;
		} else {
			float var4 = class464.method8873(var2, this.field5045, this.field5046);
			WorldEntityCoord var5 = this.field5044;
			WorldEntityCoord var6 = this.field5048;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.getX() - var5.getX();
			int var10 = var6.getY() - var5.getY();
			var9 = (int)(var8 * (float)var9);
			var10 = (int)(var8 * (float)var10);
			var1.method5696(var5.getX() + var9, var5.getY() + var10);
			int var12 = var5.getCurrentRotationAngle();
			int var13 = var6.getCurrentRotationAngle();
			int var14 = var13 - var12 & 2047;
			int var11;
			if (var14 > 1024) {
				var11 = -(2048 - var14);
			} else {
				var11 = var14;
			}

			var14 = (int)(var8 * (float)var11);
			var1.setCurrentRotationAngle(var5.getCurrentRotationAngle() + var14);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-680568556"
	)
	void vmethod9206(int var1, int var2) {
		this.field5044.setDirection(var1, var2);
		this.field5048.setDirection(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-1717200737"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (class142.World_worlds != null) {
			ArchiveDiskActionHandler.doWorldSorting(0, class142.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-24108"
	)
	static final void method9204() {
		class6.method47(RestClientThreadFactory.field76, class376.field4114, ClanSettings.field1763);
		HealthBarDefinition.method3848(Language.field4677, class328.field3599);
		if (RestClientThreadFactory.field76 == class403.cameraX && class166.cameraY == class376.field4114 && class328.cameraZ == ClanSettings.field1763 && SoundSystem.cameraPitch == Language.field4677 && ReflectionCheck.cameraYaw == class328.field3599) {
			Client.field773 = false;
			Client.isCameraLocked = false;
			Client.field596 = false;
			Client.field512 = false;
			Client.field594 = 0;
			class144.field1638 = 0;
			ApproximateRouteStrategy.field474 = 0;
			GrandExchangeOfferOwnWorldComparator.field479 = 0;
			UserComparator9.field1502 = 0;
			HttpRequest.field55 = 0;
			class53.field357 = 0;
			class153.field1700 = 0;
			PcmPlayer.field290 = 0;
			WorldMapLabelSize.field3089 = 0;
			Client.field770 = null;
			Client.field670 = null;
			Client.field771 = null;
		}

	}
}
