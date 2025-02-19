import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class7 {
	@ObfuscatedName("af")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ds")
	static boolean field23;
	@ObfuscatedName("sw")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("ab")
	ExecutorService field29;
	@ObfuscatedName("ay")
	Future field28;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvy;"
	)
	final Buffer field30;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final class3 field24;

	@ObfuscatedSignature(
		descriptor = "(Lvy;Lad;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field29 = Executors.newSingleThreadExecutor();
		this.field30 = var1;
		this.field24 = var2;
		this.method41();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "288940032"
	)
	public boolean method45() {
		return this.field28.isDone();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1561274356"
	)
	public void method43() {
		this.field29.shutdown();
		this.field29 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lvy;",
		garbageValue = "-636785931"
	)
	public Buffer method52() {
		try {
			return (Buffer)this.field28.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2006309083"
	)
	void method41() {
		this.field28 = this.field29.submit(new class1(this, this.field30, this.field24));
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	static final int method44() {
		if (AbstractWorldMapIcon.clientPreferences.isRoofsHidden()) {
			return class200.topLevelWorldView.plane;
		} else {
			int var0 = class181.cameraX >> 7;
			int var1 = ApproximateRouteStrategy.cameraZ >> 7;
			if (var0 >= 0 && 104 > var0 && var1 >= 0 && 104 > var1) {
				int var2 = DevicePcmPlayerProvider.getTileHeight(class200.topLevelWorldView, class181.cameraX, ApproximateRouteStrategy.cameraZ, class200.topLevelWorldView.plane);
				return var2 - GrandExchangeOfferUnitPriceComparator.cameraY < 800 && (class200.topLevelWorldView.tileSettings[class200.topLevelWorldView.plane][var0][var1] & 4) != 0 ? class200.topLevelWorldView.plane : 3;
			} else {
				return class200.topLevelWorldView.plane;
			}
		}
	}
}
