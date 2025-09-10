import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class339 {
	@ObfuscatedName("af")
	public static final List field3893;
	@ObfuscatedName("aw")
	public static ArrayList field3888;
	@ObfuscatedName("at")
	public static LinkedList field3895;
	@ObfuscatedName("ac")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static AbstractArchive field3891;
	@ObfuscatedName("as")
	public static ArrayList field3889;
	@ObfuscatedName("al")
	public static ArrayList field3892;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1796471523
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1233861781
	)
	static int field3896;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -27245767
	)
	static int field3898;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1762687971
	)
	static int field3897;

	static {
		field3893 = new ArrayList();
		field3888 = null;
		field3895 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3889 = new ArrayList(3);
		field3892 = new ArrayList();
		musicPlayerStatus = 0;
		field3896 = 0;
		field3898 = 0;
		field3897 = 0;
	}
}
