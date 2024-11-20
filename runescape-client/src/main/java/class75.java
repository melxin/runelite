import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class75 {
	@ObfuscatedName("ao")
	static final BigInteger field901;
	@ObfuscatedName("ac")
	static final BigInteger field906;
	@ObfuscatedName("tf")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	static {
		field901 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field906 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2122271176"
	)
	static final int method2253() {
		float var0 = 200.0F * ((float)SecureUrlRequester.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
