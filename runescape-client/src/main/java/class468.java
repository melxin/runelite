import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class468 extends AbstractQueue {
	@ObfuscatedName("ij")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "Lcl;"
	)
	@Export("clientPreferences")
	public static ClientPreferences clientPreferences;
	@ObfuscatedName("av")
	final Comparator field5298;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	class466[] field5300;
	@ObfuscatedName("ag")
	Map field5295;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1002980573
	)
	int field5296;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 161248051
	)
	int field5297;

	public class468(int var1, Comparator var2) {
		this.field5297 = 0;
		this.field5300 = new class466[var1];
		this.field5295 = new HashMap();
		this.field5298 = var2;
	}

	public class468(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-827158672"
	)
	void method9552() {
		int var1 = (this.field5300.length << 1) + 1;
		this.field5300 = (class466[])((class466[])Arrays.copyOf(this.field5300, var1));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "2"
	)
	void method9535(int var1) {
		class466 var2;
		int var3;
		for (var2 = this.field5300[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class466 var4 = this.field5300[var3];
			if (this.field5298 != null) {
				if (this.field5298.compare(var2.field5286, var4.field5286) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field5286).compareTo(var4.field5286) >= 0) {
				break;
			}

			this.field5300[var1] = var4;
			this.field5300[var1].field5287 = var1;
		}

		this.field5300[var1] = var2;
		this.field5300[var1].field5287 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method9547(int var1) {
		class466 var2 = this.field5300[var1];

		int var8;
		for (int var3 = this.field5296 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class466 var5 = this.field5300[var4];
			int var6 = (var1 << 1) + 2;
			class466 var7 = this.field5300[var6];
			if (this.field5298 != null) {
				if (var6 < this.field5296 && this.field5298.compare(var5.field5286, var7.field5286) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5296 && ((Comparable)var5.field5286).compareTo(var7.field5286) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field5298 != null) {
				if (this.field5298.compare(var2.field5286, this.field5300[var8].field5286) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field5286).compareTo(this.field5300[var8].field5286) <= 0) {
				break;
			}

			this.field5300[var1] = this.field5300[var8];
			this.field5300[var1].field5287 = var1;
		}

		this.field5300[var1] = var2;
		this.field5300[var1].field5287 = var1;
	}

	public boolean remove(Object var1) {
		class466 var2 = (class466)this.field5295.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field5297;
			--this.field5296;
			if (var2.field5287 == this.field5296) {
				this.field5300[this.field5296] = null;
				return true;
			} else {
				class466 var3 = this.field5300[this.field5296];
				this.field5300[this.field5296] = null;
				this.field5300[var2.field5287] = var3;
				this.field5300[var2.field5287].field5287 = var2.field5287;
				this.method9547(var2.field5287);
				if (var3 == this.field5300[var2.field5287]) {
					this.method9535(var2.field5287);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field5296 == 0 ? null : this.field5300[0].field5286;
	}

	public Object poll() {
		if (this.field5296 == 0) {
			return null;
		} else {
			++this.field5297;
			Object var1 = this.field5300[0].field5286;
			this.field5295.remove(var1);
			--this.field5296;
			if (this.field5296 == 0) {
				this.field5300[this.field5296] = null;
			} else {
				this.field5300[0] = this.field5300[this.field5296];
				this.field5300[0].field5287 = 0;
				this.field5300[this.field5296] = null;
				this.method9547(0);
			}

			return var1;
		}
	}

	public Iterator iterator() {
		return new class467(this);
	}

	public boolean contains(Object var1) {
		return this.field5295.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5298 != null) {
			Arrays.sort(var1, this.field5298);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public boolean offer(Object var1) {
		if (this.field5295.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field5297;
			int var2 = this.field5296;
			if (var2 >= this.field5300.length) {
				this.method9552();
			}

			++this.field5296;
			if (var2 == 0) {
				this.field5300[0] = new class466(var1, 0);
				this.field5295.put(var1, this.field5300[0]);
			} else {
				this.field5300[var2] = new class466(var1, var2);
				this.field5295.put(var1, this.field5300[var2]);
				this.method9535(var2);
			}

			return true;
		}
	}

	public int size() {
		return this.field5296;
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(Lmj;I)V",
		garbageValue = "1645549667"
	)
	static void method9561(PacketBufferNode var0) {
		var0.packetBuffer.writeInt(Varps.field4092.hash);
		var0.packetBuffer.writeInt(class189.archive4.hash);
		var0.packetBuffer.writeIntIME(AsyncHttpResponse.field67.hash);
		var0.packetBuffer.writeInt(ParamComposition.field2290.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeInt(class160.field1815.hash);
		var0.packetBuffer.writeIntIME(Skeleton.field2836.hash);
		var0.packetBuffer.writeInt(Tile.archive9.hash);
		var0.packetBuffer.writeIntLE(UserComparator4.archive6.hash);
		var0.packetBuffer.writeInt(PcmPlayer.field1328.hash);
		var0.packetBuffer.writeIntIME(class138.field1642.hash);
		var0.packetBuffer.writeIntIME(AbstractWorldMapIcon.field3529.hash);
		var0.packetBuffer.writeIntIME(VarcInt.field2017.hash);
		var0.packetBuffer.writeIntME(class136.field1619.hash);
		var0.packetBuffer.writeIntLE(StructComposition.archive2.hash);
		var0.packetBuffer.writeIntIME(WorldMapRectangle.archive12.hash);
	}
}
