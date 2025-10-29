import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("an")
	static AtomicBoolean field3945;
	@ObfuscatedName("ae")
	static ThreadPoolExecutor field3940;
	@ObfuscatedName("aj")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 268210409
	)
	public int field3948;
	@ObfuscatedName("aw")
	int[] field3943;
	@ObfuscatedName("ap")
	int[] field3944;
	@ObfuscatedName("ay")
	int[] field3967;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2096891659
	)
	int field3947;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1900427791
	)
	int field3942;
	@ObfuscatedName("ai")
	int[] field3949;
	@ObfuscatedName("as")
	int[] field3950;
	@ObfuscatedName("ac")
	int[] field3963;
	@ObfuscatedName("ab")
	int[] field3952;
	@ObfuscatedName("ax")
	int[] field3953;
	@ObfuscatedName("ar")
	int[] field3954;
	@ObfuscatedName("ah")
	int[] field3955;
	@ObfuscatedName("aa")
	int[] field3956;
	@ObfuscatedName("aq")
	int[] field3957;
	@ObfuscatedName("be")
	int[] field3960;
	@ObfuscatedName("bo")
	int[] field3959;
	@ObfuscatedName("bg")
	int[] field3939;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "[[Lnd;"
	)
	MusicPatchNode[][] field3961;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "[[Lnd;"
	)
	MusicPatchNode[][] field3962;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lna;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bb")
	boolean field3964;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1501424531
	)
	@Export("track")
	int track;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 715127169
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		longValue = 8489672142859145567L
	)
	long field3958;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		longValue = -4973024566956474005L
	)
	long field3968;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Ldm;"
	)
	PcmPlayer field3970;

	static {
		field3945 = null;
		field3940 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ldm;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class356());
		this.field3948 = 0;
		this.field3943 = new int[16];
		this.field3944 = new int[16];
		this.field3967 = new int[16];
		this.field3947 = 256;
		this.field3942 = 1000000;
		this.field3949 = new int[16];
		this.field3950 = new int[16];
		this.field3963 = new int[16];
		this.field3952 = new int[16];
		this.field3953 = new int[16];
		this.field3954 = new int[16];
		this.field3955 = new int[16];
		this.field3956 = new int[16];
		this.field3957 = new int[16];
		this.field3960 = new int[16];
		this.field3959 = new int[16];
		this.field3939 = new int[16];
		this.field3961 = new MusicPatchNode[16][128];
		this.field3962 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3970 = null;
		this.field3970 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method7386();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3970) {
			this.field3947 = var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1794541496"
	)
	public int method7366() {
		return this.field3947;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnq;Lqm;Lds;B)Z",
		garbageValue = "15"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3970) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class358 var6 = (class358)var1.field4014.first(); var6 != null; var6 = (class358)var1.field4014.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class200.method4539(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method7556(var3, var6.field4060)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field4001.iterator();

						while (var10.hasNext()) {
							class107 var11 = (class107)var10.next();
							this.priorityQueue.add(new class349(var6.field4057, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "92"
	)
	public void method7367() {
		if (this.priorityQueue != null) {
			if (field3945 != null) {
				field3945.set(true);
			}

			field3945 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3945;
			if (field3940 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3940 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class348(this));
			}

			field3940.submit(new class352(this, var1));
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	public void method7369() {
		synchronized(this.field3970) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2._remove();
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "()Ldn;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aw")
	protected int vmethod7569() {
		return 0;
	}

	@ObfuscatedName("ap")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3942 * -727379968 / (EnumComposition.field2063 * 1063377631);

			do {
				long var5 = this.field3958 + (long)var3 * (long)var4;
				if (this.field3968 - var5 >= 0L) {
					this.field3958 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3968 - this.field3958) - 1L) / (long)var4);
				this.field3958 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method7464();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	public void method7462() {
		synchronized(this.field3970) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3942 * -727379968 / (EnumComposition.field2063 * 1063377631);

			do {
				long var3 = (long)var1 * (long)var2 + this.field3958;
				if (this.field3968 - var3 >= 0L) {
					this.field3958 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3968 - this.field3958) - 1L) / (long)var2);
				this.field3958 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method7464();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lnq;ZB)V",
		garbageValue = "71"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3970) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3964 = var2;
			this.field3958 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3968 = this.midiFile.method7501(this.trackLength);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1806462691"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3970) {
			this.midiFile.clear();
			this.method7386();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1406076200"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3970) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-340915720"
	)
	public boolean method7442() {
		synchronized(this.field3970) {
			return this.musicPatches.method8902() > 0;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-3394468"
	)
	public void method7435(int var1, int var2) {
		synchronized(this.field3970) {
			this.method7375(var1, var2);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "85"
	)
	void method7375(int var1, int var2) {
		this.field3952[var1] = var2;
		this.field3954[var1] = var2 & -128;
		this.method7410(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1461542651"
	)
	void method7410(int var1, int var2) {
		if (var2 != this.field3953[var1]) {
			this.field3953[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3962[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1760981052"
	)
	void method7422(int var1, int var2, int var3) {
		this.method7379(var1, var2, 64);
		if ((this.field3943[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field4016 == var1 && var4.field4030 < 0) {
					this.field3961[var1][var4.field4019] = null;
					this.field3961[var1][var2] = var4;
					int var8 = (var4.field4025 * var4.field4026 >> 12) + var4.field4024;
					var4.field4024 += var2 - var4.field4019 << 8;
					var4.field4025 = var8 - var4.field4024;
					var4.field4026 = 4096;
					var4.field4019 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3953[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method3484();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field4016 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field4022 = var9.field3998[var2];
					var6.field4021 = var9.field3999[var2];
					var6.field4019 = var2;
					var6.field4018 = var3 * var3 * var9.field3994[var2] * var9.field3993 + 1024 >> 11;
					var6.field4023 = var9.field3992[var2] & 255;
					var6.field4024 = (var2 << 8) - (var9.field3995[var2] & 32767);
					var6.field4020 = 0;
					var6.field4033 = 0;
					var6.field4017 = 0;
					var6.field4030 = -1;
					var6.field4031 = 0;
					if (this.field3944[var1] == 0) {
						var6.stream = RawPcmStream.method3267(var5, this.method7456(var6), this.method7392(var6), this.method7393(var6));
					} else {
						var6.stream = RawPcmStream.method3267(var5, this.method7456(var6), 0, this.method7393(var6));
						this.method7378(var6, var9.field3995[var2] < 0);
					}

					if (var9.field3995[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field4021 >= 0) {
						MusicPatchNode var7 = this.field3962[var1][var6.field4021];
						if (var7 != null && var7.field4030 < 0) {
							this.field3961[var1][var7.field4019] = null;
							var7.field4030 = 0;
						}

						this.field3962[var1][var6.field4021] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3961[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZS)V",
		garbageValue = "17133"
	)
	void method7378(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1297) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3944[var1.field4016] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method3407();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3944[var1.field4016] >> 6);
		}

		var1.stream.method3425(var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2126339302"
	)
	void method7379(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3961[var1][var2];
		if (var4 != null) {
			this.field3961[var1][var2] = null;
			if ((this.field3943[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field4016 == var5.field4016 && var5.field4030 < 0 && var4 != var5) {
						var4.field4030 = 0;
						break;
					}
				}
			} else {
				var4.field4030 = 0;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method7380(int var1, int var2, int var3) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2070156295"
	)
	void method7469(int var1, int var2) {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	void method7382(int var1, int var2) {
		this.field3955[var1] = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	void method7383(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field4016 == var1) {
				if (var2.stream != null) {
					var2.stream.method3298(EnumComposition.field2063 * 1063377631 / 100);
					if (var2.stream.method3382()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method7595();
				}

				if (var2.field4030 < 0) {
					this.field3961[var2.field4016][var2.field4019] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2025023543"
	)
	void method7384(int var1) {
		if (var1 >= 0) {
			this.field3949[var1] = 12800;
			this.field3950[var1] = 8192;
			this.field3963[var1] = 16383;
			this.field3955[var1] = 8192;
			this.field3956[var1] = 0;
			this.field3957[var1] = 8192;
			this.method7387(var1);
			this.method7388(var1);
			this.field3943[var1] = 0;
			this.field3960[var1] = 32767;
			this.field3959[var1] = 256;
			this.field3944[var1] = 0;
			this.method7434(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method7384(var1);
			}

		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "39"
	)
	void method7377(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field4016 == var1) && var2.field4030 < 0) {
				this.field3961[var2.field4016][var2.field4019] = null;
				var2.field4030 = 0;
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1750419179"
	)
	void method7386() {
		this.method7383(-1);
		this.method7384(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3953[var1] = this.field3952[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3954[var1] = this.field3952[var1] & -128;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1346425022"
	)
	void method7387(int var1) {
		if ((this.field3943[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field4016 == var1 && this.field3961[var1][var2.field4019] == null && var2.field4030 < 0) {
					var2.field4030 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "309020840"
	)
	void method7388(int var1) {
		if ((this.field3943[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field4016 == var1) {
					var2.field4036 = 0;
				}
			}
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1087141330"
	)
	void method7389(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7379(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method7422(var3, var4, var5);
			} else {
				this.method7379(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7380(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3954[var3] = (var5 << 14) + (this.field3954[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3954[var3] = (var5 << 7) + (this.field3954[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3956[var3] = (var5 << 7) + (this.field3956[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3956[var3] = var5 + (this.field3956[var3] & -128);
			}

			if (var4 == 5) {
				this.field3957[var3] = (var5 << 7) + (this.field3957[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3957[var3] = var5 + (this.field3957[var3] & -128);
			}

			if (var4 == 7) {
				this.field3949[var3] = (var5 << 7) + (this.field3949[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3949[var3] = var5 + (this.field3949[var3] & -128);
			}

			if (var4 == 10) {
				this.field3950[var3] = (var5 << 7) + (this.field3950[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3950[var3] = var5 + (this.field3950[var3] & -128);
			}

			if (var4 == 11) {
				this.field3963[var3] = (var5 << 7) + (this.field3963[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3963[var3] = var5 + (this.field3963[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3943;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3943;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3943;
					var10000[var3] |= 2;
				} else {
					this.method7387(var3);
					var10000 = this.field3943;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3960[var3] = (var5 << 7) + (this.field3960[var3] & 127);
			}

			if (var4 == 98) {
				this.field3960[var3] = (this.field3960[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3960[var3] = (var5 << 7) + (this.field3960[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3960[var3] = (this.field3960[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method7383(var3);
			}

			if (var4 == 121) {
				this.method7384(var3);
			}

			if (var4 == 123) {
				this.method7377(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3960[var3];
				if (var6 == 16384) {
					this.field3959[var3] = (var5 << 7) + (this.field3959[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3960[var3];
				if (var6 == 16384) {
					this.field3959[var3] = var5 + (this.field3959[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3944[var3] = (var5 << 7) + (this.field3944[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3944[var3] = var5 + (this.field3944[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3943;
					var10000[var3] |= 4;
				} else {
					this.method7388(var3);
					var10000 = this.field3943;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method7434(var3, (var5 << 7) + (this.field3939[var3] & -16257));
			}

			if (var4 == 49) {
				this.method7434(var3, var5 + (this.field3939[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7410(var3, var4 + this.field3954[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7469(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method7382(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method7386();
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	void method7434(int var1, int var2) {
		this.field3939[var1] = var2;
		this.field3967[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)I",
		garbageValue = "96"
	)
	int method7456(MusicPatchNode var1) {
		int var2 = (var1.field4026 * var1.field4025 >> 12) + var1.field4024;
		var2 += (this.field3955[var1.field4016] - 8192) * this.field3959[var1.field4016] >> 12;
		MusicPatchNode2 var3 = var1.field4022;
		int var4;
		if (var3.field3918 > 0 && (var3.field3920 > 0 || this.field3956[var1.field4016] > 0)) {
			var4 = var3.field3920 << 2;
			int var5 = var3.field3922 << 1;
			if (var1.field4032 < var5) {
				var4 = var4 * var1.field4032 / var5;
			}

			var4 += this.field3956[var1.field4016] >> 7;
			double var6 = Math.sin((double)(var1.field4029 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)(EnumComposition.field2063 * 1063377631) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)I",
		garbageValue = "36914530"
	)
	int method7392(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field4022;
		int var3 = this.field3949[var1.field4016] * this.field3963[var1.field4016] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field4018 + 16384 >> 15;
		var3 = var3 * this.field3947 + 128 >> 8;
		if (var2.field3919 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field4020 * (double)var2.field3919) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3916 != null) {
			var4 = var1.field4033;
			var5 = var2.field3916[var1.field4017 * 4 + 1];
			if (var1.field4017 * 4 < var2.field3916.length - 2) {
				var6 = (var2.field3916[var1.field4017 * 4] & 255) << 8;
				var7 = (var2.field3916[var1.field4017 * 4 + 2] & 255) << 8;
				var5 += (var2.field3916[var1.field4017 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field4030 > 0 && var2.field3915 != null) {
			var4 = var1.field4030;
			var5 = var2.field3915[var1.field4031 * 4 + 1];
			if (var1.field4031 * 4 < var2.field3915.length - 2) {
				var6 = (var2.field3915[var1.field4031 * 4] & 255) << 8;
				var7 = (var2.field3915[var1.field4031 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3915[var1.field4031 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)I",
		garbageValue = "-1328393674"
	)
	int method7393(MusicPatchNode var1) {
		int var2 = this.field3950[var1.field4016];
		return var2 < 8192 ? var2 * var1.field4023 + 32 >> 6 : 16384 - ((128 - var1.field4023) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method7464() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3968; var2 == this.trackLength; var3 = this.midiFile.method7501(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3964 || var2 == 0) {
							this.method7386();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method7389(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3968 = var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)Z",
		garbageValue = "1842254816"
	)
	boolean method7400(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field4030 >= 0) {
				var1.remove();
				if (var1.field4021 > 0 && var1 == this.field3962[var1.field4016][var1.field4021]) {
					this.field3962[var1.field4016][var1.field4021] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lnd;[IIIB)Z",
		garbageValue = "2"
	)
	boolean method7453(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field4035 = EnumComposition.field2063 * 1063377631 / 100;
		if (var1.field4030 < 0 || var1.stream != null && !var1.stream.method3301()) {
			int var5 = var1.field4026;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3957[var1.field4016] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field4026 = var5;
			}

			var1.stream.method3300(this.method7456(var1));
			MusicPatchNode2 var6 = var1.field4022;
			boolean var7 = false;
			++var1.field4032;
			var1.field4029 += var6.field3918;
			double var8 = 5.086263020833333E-6D * (double)((var1.field4019 - 60 << 8) + (var1.field4025 * var1.field4026 >> 12));
			if (var6.field3919 > 0) {
				if (var6.field3914 > 0) {
					var1.field4020 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3914) + 0.5D);
				} else {
					var1.field4020 += 128;
				}
			}

			if (var6.field3916 != null) {
				if (var6.field3917 > 0) {
					var1.field4033 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3917 * var8) + 0.5D);
				} else {
					var1.field4033 += 128;
				}

				while (var1.field4017 * 4 < var6.field3916.length - 2 && var1.field4033 > (var6.field3916[var1.field4017 * 4 + 2] & 255) << 8) {
					var1.field4017 = var1.field4017 * 4 + 2;
				}

				if (var1.field4017 * 4 == var6.field3916.length - 2 && var6.field3916[var1.field4017 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field4030 >= 0 && var6.field3915 != null && (this.field3943[var1.field4016] & 1) == 0 && (var1.field4021 < 0 || var1 != this.field3962[var1.field4016][var1.field4021])) {
				if (var6.field3921 > 0) {
					var1.field4030 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3921 * var8) + 0.5D);
				} else {
					var1.field4030 += 128;
				}

				while (var1.field4031 * 4 < var6.field3915.length - 2 && var1.field4030 > (var6.field3915[var1.field4031 * 4 + 2] & 255) << 8) {
					var1.field4031 = var1.field4031 * 4 + 2;
				}

				if (var1.field4031 * 4 == var6.field3915.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method3298(var1.field4035);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method3382()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method7595();
				if (var1.field4030 >= 0) {
					var1.remove();
					if (var1.field4021 > 0 && var1 == this.field3962[var1.field4016][var1.field4021]) {
						this.field3962[var1.field4016][var1.field4021] = null;
					}
				}

				return true;
			} else {
				var1.stream.method3297(var1.field4035, this.method7392(var1), this.method7393(var1));
				return false;
			}
		} else {
			var1.method7595();
			var1.remove();
			if (var1.field4021 > 0 && var1 == this.field3962[var1.field4016][var1.field4021]) {
				this.field3962[var1.field4016][var1.field4021] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1491939158"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (class226.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = class226.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						LoginType.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}
}
