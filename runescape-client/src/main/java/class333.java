import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class333 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static AbstractArchive field3628;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	static AbstractArchive field3624;
	@ObfuscatedName("ao")
	public static ArrayList field3625;
	@ObfuscatedName("ad")
	public static LinkedList field3631;
	@ObfuscatedName("an")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("ae")
	public static ArrayList field3626;
	@ObfuscatedName("ax")
	public static ArrayList field3629;
	@ObfuscatedName("at")
	public static final List field3627;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1151624493
	)
	@Export("musicPlayerStatus")
	static int musicPlayerStatus;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2077797037
	)
	static int field3632;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 959714837
	)
	static int field3633;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 709477055
	)
	static int field3634;

	static {
		field3625 = null;
		field3631 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3626 = new ArrayList(3);
		field3629 = new ArrayList();
		field3627 = new ArrayList();
		musicPlayerStatus = 0;
		field3632 = 0;
		field3633 = 0;
		field3634 = 0;
	}
}
