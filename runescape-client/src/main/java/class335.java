import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class335 {
	@ObfuscatedName("ap")
	public static final List field3695;
	@ObfuscatedName("aj")
	public static ArrayList field3694;
	@ObfuscatedName("an")
	public static LinkedList field3704;
	@ObfuscatedName("ai")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	public static AbstractArchive field3693;
	@ObfuscatedName("am")
	public static ArrayList field3698;
	@ObfuscatedName("ah")
	public static ArrayList field3699;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1560560503
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1085459079
	)
	static int field3697;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 274586177
	)
	static int field3702;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -201002495
	)
	static int field3703;

	static {
		field3695 = new ArrayList();
		field3694 = null;
		field3704 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3698 = new ArrayList(3);
		field3699 = new ArrayList();
		musicPlayerStatus = 0;
		field3697 = 0;
		field3702 = 0;
		field3703 = 0;
	}
}
