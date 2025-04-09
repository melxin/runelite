import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class335 {
	@ObfuscatedName("ao")
	public static final List field3695;
	@ObfuscatedName("an")
	public static ArrayList field3697;
	@ObfuscatedName("ae")
	public static LinkedList field3694;
	@ObfuscatedName("af")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	public static AbstractArchive field3696;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	public static AbstractArchive field3703;
	@ObfuscatedName("am")
	public static ArrayList field3698;
	@ObfuscatedName("aa")
	public static ArrayList field3699;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 966139945
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1393237893
	)
	static int field3692;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 598120489
	)
	static int field3702;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 28300105
	)
	static int field3693;
	@ObfuscatedName("ly")
	@Export("worldHost")
	static String worldHost;

	static {
		field3695 = new ArrayList();
		field3697 = null;
		field3694 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3698 = new ArrayList(3);
		field3699 = new ArrayList();
		musicPlayerStatus = 0;
		field3692 = 0;
		field3702 = 0;
		field3693 = 0;
	}
}
