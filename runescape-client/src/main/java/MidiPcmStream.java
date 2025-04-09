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

@ObfuscatedName("mv")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("af")
	static AtomicBoolean field3731;
	@ObfuscatedName("as")
	static ThreadPoolExecutor field3712;
	@ObfuscatedName("aq")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -717095901
	)
	public int field3708;
	@ObfuscatedName("am")
	int[] field3713;
	@ObfuscatedName("aa")
	int[] field3730;
	@ObfuscatedName("ap")
	int[] field3714;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -145318113
	)
	int field3716;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 37958287
	)
	int field3717;
	@ObfuscatedName("au")
	int[] field3718;
	@ObfuscatedName("aj")
	int[] field3719;
	@ObfuscatedName("al")
	int[] field3720;
	@ObfuscatedName("ai")
	int[] field3721;
	@ObfuscatedName("ad")
	int[] field3722;
	@ObfuscatedName("ah")
	int[] field3711;
	@ObfuscatedName("az")
	int[] field3725;
	@ObfuscatedName("at")
	int[] field3728;
	@ObfuscatedName("ab")
	int[] field3726;
	@ObfuscatedName("br")
	int[] field3709;
	@ObfuscatedName("bp")
	int[] field3705;
	@ObfuscatedName("bz")
	int[] field3729;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[[Lnl;"
	)
	MusicPatchNode[][] field3723;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "[[Lnl;"
	)
	MusicPatchNode[][] field3727;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bh")
	boolean field3733;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1980324641
	)
	@Export("track")
	int track;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -699925813
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		longValue = -2598926591776576823L
	)
	long field3736;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -981286143346657965L
	)
	long field3737;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	PcmPlayer field3739;

	static {
		field3731 = null;
		field3712 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbe;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class346());
		this.field3708 = 0;
		this.field3713 = new int[16];
		this.field3730 = new int[16];
		this.field3714 = new int[16];
		this.field3716 = 256;
		this.field3717 = 1000000;
		this.field3718 = new int[16];
		this.field3719 = new int[16];
		this.field3720 = new int[16];
		this.field3721 = new int[16];
		this.field3722 = new int[16];
		this.field3711 = new int[16];
		this.field3725 = new int[16];
		this.field3728 = new int[16];
		this.field3726 = new int[16];
		this.field3709 = new int[16];
		this.field3705 = new int[16];
		this.field3729 = new int[16];
		this.field3723 = new MusicPatchNode[16][128];
		this.field3727 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3739 = null;
		this.field3739 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6654();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "17"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3739) {
			this.field3716 = var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "71"
	)
	public int method6633() {
		return this.field3716;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Lph;Lbt;I)Z",
		garbageValue = "441992907"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3739) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class348 var6 = (class348)var1.field3786.first(); var6 != null; var6 = (class348)var1.field3786.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class28.method444(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6810(var3, var6.field3827)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3770.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class339(var6.field3826, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-20395493"
	)
	public void method6635() {
		if (this.priorityQueue != null) {
			if (field3731 != null) {
				field3731.set(true);
			}

			field3731 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3731;
			if (field3712 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3712 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class338(this));
			}

			field3712.submit(new class342(this, var1));
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6604631"
	)
	public void method6634() {
		synchronized(this.field3739) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6811();
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("am")
	protected int vmethod6832() {
		return 0;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3717 * -727379968 / (class4.field7 * -70401264);

			do {
				long var5 = (long)var4 * (long)var3 + this.field3736;
				if (this.field3737 - var5 >= 0L) {
					this.field3736 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3737 - this.field3736) - 1L) / (long)var4);
				this.field3736 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6667();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1300928381"
	)
	public void method6637() {
		synchronized(this.field3739) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ax")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3717 * -727379968 / (class4.field7 * -70401264);

			do {
				long var3 = (long)var2 * (long)var1 + this.field3736;
				if (this.field3737 - var3 >= 0L) {
					this.field3736 = var3;
					break;
				}

				int var5 = (int)((this.field3737 - this.field3736 + (long)var2 - 1L) / (long)var2);
				this.field3736 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6667();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnn;ZB)V",
		garbageValue = "13"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3739) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3733 = var2;
			this.field3736 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3737 = this.midiFile.method6767(this.trackLength);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3739) {
			this.midiFile.clear();
			this.method6654();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2057562869"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3739) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	public boolean method6641() {
		synchronized(this.field3739) {
			return this.musicPatches.method7982() > 0;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-939022348"
	)
	public void method6642(int var1, int var2) {
		synchronized(this.field3739) {
			this.method6643(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1059491947"
	)
	void method6643(int var1, int var2) {
		this.field3721[var1] = var2;
		this.field3711[var1] = var2 & -128;
		this.method6735(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2000726057"
	)
	void method6735(int var1, int var2) {
		if (var2 != this.field3722[var1]) {
			this.field3722[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3727[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "119"
	)
	void method6645(int var1, int var2, int var3) {
		this.method6725(var1, var2, 64);
		if ((this.field3713[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3802 == var1 && var4.field3801 < 0) {
					this.field3723[var1][var4.field3792] = null;
					this.field3723[var1][var2] = var4;
					int var8 = (var4.field3796 * var4.field3803 >> 12) + var4.field3790;
					var4.field3790 += var2 - var4.field3792 << 8;
					var4.field3796 = var8 - var4.field3790;
					var4.field3803 = 4096;
					var4.field3792 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3722[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1089();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3802 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3797 = var9.field3767[var2];
					var6.field3791 = var9.field3773[var2];
					var6.field3792 = var2;
					var6.field3793 = var3 * var3 * var9.field3771[var2] * var9.field3776 + 1024 >> 11;
					var6.field3794 = var9.field3772[var2] & 255;
					var6.field3790 = (var2 << 8) - (var9.field3769[var2] & 32767);
					var6.field3798 = 0;
					var6.field3799 = 0;
					var6.field3800 = 0;
					var6.field3801 = -1;
					var6.field3807 = 0;
					if (this.field3730[var1] == 0) {
						var6.stream = RawPcmStream.method896(var5, this.method6659(var6), this.method6660(var6), this.method6730(var6));
					} else {
						var6.stream = RawPcmStream.method896(var5, this.method6659(var6), 0, this.method6730(var6));
						this.method6696(var6, var9.field3769[var2] < 0);
					}

					if (var9.field3769[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3791 >= 0) {
						MusicPatchNode var7 = this.field3727[var1][var6.field3791];
						if (var7 != null && var7.field3801 < 0) {
							this.field3723[var1][var7.field3792] = null;
							var7.field3801 = 0;
						}

						this.field3727[var1][var6.field3791] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3723[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnl;ZI)V",
		garbageValue = "103002332"
	)
	void method6696(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field243) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3730[var1.field3802] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method923();
			}
		} else {
			var4 = (int)((long)this.field3730[var1.field3802] * (long)var3 >> 6);
		}

		var1.stream.method922(var4);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1948442704"
	)
	void method6725(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3723[var1][var2];
		if (var4 != null) {
			this.field3723[var1][var2] = null;
			if ((this.field3713[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3802 == var4.field3802 && var5.field3801 < 0 && var4 != var5) {
						var4.field3801 = 0;
						break;
					}
				}
			} else {
				var4.field3801 = 0;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1277475693"
	)
	void method6648(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-1758"
	)
	void method6649(int var1, int var2) {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1135428138"
	)
	void method6650(int var1, int var2) {
		this.field3725[var1] = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1994164524"
	)
	void method6651(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3802 == var1) {
				if (var2.stream != null) {
					var2.stream.method927(class4.field7 * -70401264 / 100);
					if (var2.stream.method1011()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6855();
				}

				if (var2.field3801 < 0) {
					this.field3723[var2.field3802][var2.field3792] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1602194128"
	)
	void method6652(int var1) {
		if (var1 >= 0) {
			this.field3718[var1] = 12800;
			this.field3719[var1] = 8192;
			this.field3720[var1] = 16383;
			this.field3725[var1] = 8192;
			this.field3728[var1] = 0;
			this.field3726[var1] = 8192;
			this.method6655(var1);
			this.method6713(var1);
			this.field3713[var1] = 0;
			this.field3709[var1] = 32767;
			this.field3705[var1] = 256;
			this.field3730[var1] = 0;
			this.method6658(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6652(var1);
			}

		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "540045019"
	)
	void method6653(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3802 == var1) && var2.field3801 < 0) {
				this.field3723[var2.field3802][var2.field3792] = null;
				var2.field3801 = 0;
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2049248478"
	)
	void method6654() {
		this.method6651(-1);
		this.method6652(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3722[var1] = this.field3721[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3711[var1] = this.field3721[var1] & -128;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "59"
	)
	void method6655(int var1) {
		if ((this.field3713[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3802 == var1 && this.field3723[var1][var2.field3792] == null && var2.field3801 < 0) {
					var2.field3801 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "255"
	)
	void method6713(int var1) {
		if ((this.field3713[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3802 == var1) {
					var2.field3787 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-858681809"
	)
	void method6638(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6725(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6645(var3, var4, var5);
			} else {
				this.method6725(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6648(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3711[var3] = (var5 << 14) + (this.field3711[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3711[var3] = (var5 << 7) + (this.field3711[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3728[var3] = (var5 << 7) + (this.field3728[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3728[var3] = var5 + (this.field3728[var3] & -128);
			}

			if (var4 == 5) {
				this.field3726[var3] = (var5 << 7) + (this.field3726[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3726[var3] = var5 + (this.field3726[var3] & -128);
			}

			if (var4 == 7) {
				this.field3718[var3] = (var5 << 7) + (this.field3718[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3718[var3] = var5 + (this.field3718[var3] & -128);
			}

			if (var4 == 10) {
				this.field3719[var3] = (var5 << 7) + (this.field3719[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3719[var3] = var5 + (this.field3719[var3] & -128);
			}

			if (var4 == 11) {
				this.field3720[var3] = (var5 << 7) + (this.field3720[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3720[var3] = var5 + (this.field3720[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3713;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3713;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3713;
					var10000[var3] |= 2;
				} else {
					this.method6655(var3);
					var10000 = this.field3713;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3709[var3] = (var5 << 7) + (this.field3709[var3] & 127);
			}

			if (var4 == 98) {
				this.field3709[var3] = (this.field3709[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3709[var3] = (var5 << 7) + (this.field3709[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3709[var3] = (this.field3709[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6651(var3);
			}

			if (var4 == 121) {
				this.method6652(var3);
			}

			if (var4 == 123) {
				this.method6653(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3709[var3];
				if (var6 == 16384) {
					this.field3705[var3] = (var5 << 7) + (this.field3705[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3709[var3];
				if (var6 == 16384) {
					this.field3705[var3] = var5 + (this.field3705[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3730[var3] = (var5 << 7) + (this.field3730[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3730[var3] = var5 + (this.field3730[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3713;
					var10000[var3] |= 4;
				} else {
					this.method6713(var3);
					var10000 = this.field3713;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6658(var3, (var5 << 7) + (this.field3729[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6658(var3, var5 + (this.field3729[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6735(var3, var4 + this.field3711[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6649(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6650(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6654();
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2008649354"
	)
	void method6658(int var1, int var2) {
		this.field3729[var1] = var2;
		this.field3714[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnl;B)I",
		garbageValue = "-93"
	)
	int method6659(MusicPatchNode var1) {
		int var2 = (var1.field3803 * var1.field3796 >> 12) + var1.field3790;
		var2 += (this.field3725[var1.field3802] - 8192) * this.field3705[var1.field3802] >> 12;
		MusicPatchNode2 var3 = var1.field3797;
		int var4;
		if (var3.field3681 > 0 && (var3.field3687 > 0 || this.field3728[var1.field3802] > 0)) {
			var4 = var3.field3687 << 2;
			int var5 = var3.field3686 << 1;
			if (var1.field3788 < var5) {
				var4 = var4 * var1.field3788 / var5;
			}

			var4 += this.field3728[var1.field3802] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3804 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class4.field7 * -70401264) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)I",
		garbageValue = "-57384818"
	)
	int method6660(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3797;
		int var3 = this.field3718[var1.field3802] * this.field3720[var1.field3802] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3793 + 16384 >> 15;
		var3 = var3 * this.field3716 + 128 >> 8;
		if (var2.field3682 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3682 * (double)var1.field3798 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3688 != null) {
			var4 = var1.field3799;
			var5 = var2.field3688[var1.field3800 * 4 + 1];
			if (var1.field3800 * 4 < var2.field3688.length - 2) {
				var6 = (var2.field3688[var1.field3800 * 4] & 255) << 8;
				var7 = (var2.field3688[var1.field3800 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3688[var1.field3800 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3801 > 0 && var2.field3680 != null) {
			var4 = var1.field3801;
			var5 = var2.field3680[var1.field3807 * 4 + 1];
			if (var1.field3807 * 4 < var2.field3680.length - 2) {
				var6 = (var2.field3680[var1.field3807 * 4] & 255) << 8;
				var7 = (var2.field3680[var1.field3807 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3680[var1.field3807 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lnl;I)I",
		garbageValue = "-44522690"
	)
	int method6730(MusicPatchNode var1) {
		int var2 = this.field3719[var1.field3802];
		return var2 < 8192 ? var2 * var1.field3794 + 32 >> 6 : 16384 - ((128 - var1.field3794) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1125466082"
	)
	void method6667() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3737; var2 == this.trackLength; var3 = this.midiFile.method6767(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3733 || var2 == 0) {
							this.method6654();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6638(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3737 = var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnl;B)Z",
		garbageValue = "81"
	)
	boolean method6668(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3801 >= 0) {
				var1.remove();
				if (var1.field3791 > 0 && var1 == this.field3727[var1.field3802][var1.field3791]) {
					this.field3727[var1.field3802][var1.field3791] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lnl;[IIIB)Z",
		garbageValue = "-31"
	)
	boolean method6669(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3806 = class4.field7 * -70401264 / 100;
		if (var1.field3801 < 0 || var1.stream != null && !var1.stream.method930()) {
			int var5 = var1.field3803;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3726[var1.field3802] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3803 = var5;
			}

			var1.stream.method1043(this.method6659(var1));
			MusicPatchNode2 var6 = var1.field3797;
			boolean var7 = false;
			++var1.field3788;
			var1.field3804 += var6.field3681;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3792 - 60 << 8) + (var1.field3796 * var1.field3803 >> 12));
			if (var6.field3682 > 0) {
				if (var6.field3685 > 0) {
					var1.field3798 = var1.field3798 * 353124352 + (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3685) + 0.5D) * 353124352;
				} else {
					var1.field3798 = var1.field3798 * 353124352 + -2044723200;
				}
			}

			if (var6.field3688 != null) {
				if (var6.field3683 > 0) {
					var1.field3799 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3683 * var8) + 0.5D);
				} else {
					var1.field3799 += 128;
				}

				while (var1.field3800 * 4 < var6.field3688.length - 2 && var1.field3799 > (var6.field3688[var1.field3800 * 4 + 2] & 255) << 8) {
					var1.field3800 = var1.field3800 * 4 + 2;
				}

				if (var1.field3800 * 4 == var6.field3688.length - 2 && var6.field3688[var1.field3800 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3801 >= 0 && var6.field3680 != null && (this.field3713[var1.field3802] & 1) == 0 && (var1.field3791 < 0 || var1 != this.field3727[var1.field3802][var1.field3791])) {
				if (var6.field3689 > 0) {
					var1.field3801 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3689) + 0.5D);
				} else {
					var1.field3801 += 128;
				}

				while (var1.field3807 * 4 < var6.field3680.length - 2 && var1.field3801 > (var6.field3680[var1.field3807 * 4 + 2] & 255) << 8) {
					var1.field3807 = var1.field3807 * 4 + 2;
				}

				if (var1.field3807 * 4 == var6.field3680.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method927(var1.field3806);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method1011()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6855();
				if (var1.field3801 >= 0) {
					var1.remove();
					if (var1.field3791 > 0 && var1 == this.field3727[var1.field3802][var1.field3791]) {
						this.field3727[var1.field3802][var1.field3791] = null;
					}
				}

				return true;
			} else {
				var1.stream.method926(var1.field3806, this.method6660(var1), this.method6730(var1));
				return false;
			}
		} else {
			var1.method6855();
			var1.remove();
			if (var1.field3791 > 0 && var1 == this.field3727[var1.field3802][var1.field3791]) {
				this.field3727[var1.field3802][var1.field3791] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "136"
	)
	static void method6754(int var0) {
		TransformationMatrix.field4935 = var0;
		TransformationMatrix.field4932 = new TransformationMatrix[var0];
		class339.field3763 = 0;
	}
}
