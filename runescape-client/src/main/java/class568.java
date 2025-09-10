import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
public class class568 extends class526 implements class316 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	final DemotingHashTable field5809;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	final AbstractArchive field5808;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 773267705
	)
	final int field5807;

	@ObfuscatedSignature(
		descriptor = "(Lop;ILqh;Lpx;)V"
	)
	public class568(StudioGame var1, int var2, Language var3, AbstractArchive var4) {
		super(var1, var3, var4 != null ? var4.getGroupFileCount(var2) : 0);
		this.field5809 = new DemotingHashTable(64);
		this.field5808 = var4;
		this.field5807 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Luo;",
		garbageValue = "1856887071"
	)
	protected class528 vmethod10961(int var1) {
		synchronized(this.field5809) {
			class527 var2 = (class527)this.field5809.get((long)var1);
			if (var2 == null) {
				var2 = this.method10962(var1);
				this.field5809.method6980(var2, (long)var1);
			}

			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lux;",
		garbageValue = "-2000988974"
	)
	class527 method10962(int var1) {
		byte[] var2 = this.field5808.takeFile(this.field5807, var1);
		class527 var3 = new class527(var1);
		if (var2 != null) {
			var3.method10462(new Buffer(var2));
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1812988703"
	)
	public void method10966() {
		synchronized(this.field5809) {
			this.field5809.clear();
		}
	}

	public Iterator iterator() {
		return new class567(this);
	}

	@ObfuscatedName("im")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "-1960750308"
	)
	@Export("playSong")
	static void playSong(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class257.method5884(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class339.field3889.isEmpty()) {
					var6 = false;
				} else {
					MidiRequest var7 = (MidiRequest)class339.field3889.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && class36.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MidiRequest(WidgetDefinition.field4042, (Integer)var0.get(var8), 0, class36.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class204.method4497(var9, var1, var2, var3, var4);
					} else {
						Clock.method6081(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
