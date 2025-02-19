import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class335 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static AbstractArchive field3686;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	static AbstractArchive field3685;
	@ObfuscatedName("ad")
	public static ArrayList field3696;
	@ObfuscatedName("ah")
	public static LinkedList field3687;
	@ObfuscatedName("ac")
	@Export("midiRequests")
	public static ArrayList midiRequests;
	@ObfuscatedName("ao")
	public static ArrayList field3689;
	@ObfuscatedName("af")
	public static ArrayList field3694;
	@ObfuscatedName("aa")
	static final List field3691;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1449947273
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 863497349
	)
	static int field3693;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1678791965
	)
	static int field3690;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 643610631
	)
	static int field3684;

	static {
		field3696 = null;
		field3687 = new LinkedList();
		midiRequests = new ArrayList(3);
		field3689 = new ArrayList(3);
		field3694 = new ArrayList();
		field3691 = new ArrayList();
		musicPlayerStatus = 0;
		field3693 = 0;
		field3690 = 0;
		field3684 = 0;
	}
}
