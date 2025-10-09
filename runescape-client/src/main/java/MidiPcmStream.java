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

@ObfuscatedName("nj")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("aj")
	static AtomicBoolean field3907;
	@ObfuscatedName("ah")
	static ThreadPoolExecutor field3931;
	@ObfuscatedName("af")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1686703023
	)
	public int field3910;
	@ObfuscatedName("aq")
	int[] field3932;
	@ObfuscatedName("ac")
	int[] field3930;
	@ObfuscatedName("aa")
	int[] field3913;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1804823695
	)
	int field3915;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1176794048
	)
	int field3912;
	@ObfuscatedName("as")
	int[] field3917;
	@ObfuscatedName("ar")
	int[] field3923;
	@ObfuscatedName("az")
	int[] field3919;
	@ObfuscatedName("au")
	int[] field3920;
	@ObfuscatedName("ak")
	int[] field3924;
	@ObfuscatedName("ao")
	int[] field3905;
	@ObfuscatedName("ax")
	int[] field3921;
	@ObfuscatedName("al")
	int[] field3904;
	@ObfuscatedName("ay")
	int[] field3925;
	@ObfuscatedName("be")
	int[] field3926;
	@ObfuscatedName("ba")
	int[] field3927;
	@ObfuscatedName("bj")
	int[] field3928;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "[[Lng;"
	)
	MusicPatchNode[][] field3929;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[[Lng;"
	)
	MusicPatchNode[][] field3914;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bm")
	boolean field3909;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1254688329
	)
	@Export("track")
	int track;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 255952153
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 2281189125887998593L
	)
	long field3935;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		longValue = -3588171278852177579L
	)
	long field3936;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lnc;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Ldx;"
	)
	PcmPlayer field3938;

	static {
		field3907 = null;
		field3931 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ldx;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class349());
		this.field3910 = 0;
		this.field3932 = new int[16];
		this.field3930 = new int[16];
		this.field3913 = new int[16];
		this.field3915 = 256;
		this.field3912 = -727379968;
		this.field3917 = new int[16];
		this.field3923 = new int[16];
		this.field3919 = new int[16];
		this.field3920 = new int[16];
		this.field3924 = new int[16];
		this.field3905 = new int[16];
		this.field3921 = new int[16];
		this.field3904 = new int[16];
		this.field3925 = new int[16];
		this.field3926 = new int[16];
		this.field3927 = new int[16];
		this.field3928 = new int[16];
		this.field3929 = new MusicPatchNode[16][128];
		this.field3914 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3938 = null;
		this.field3938 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method7171();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3938) {
			this.field3915 = var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method7150() {
		return this.field3915;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lno;Lpe;Ldb;B)Z",
		garbageValue = "-7"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3938) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class351 var6 = (class351)var1.field3984.first(); var6 != null; var6 = (class351)var1.field3984.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = class136.method3756(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method7339(var3, var6.field4031)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3972.iterator();

						while (var10.hasNext()) {
							class107 var11 = (class107)var10.next();
							this.priorityQueue.add(new class342(var6.field4030, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "950110710"
	)
	public void method7152() {
		if (this.priorityQueue != null) {
			if (field3907 != null) {
				field3907.set(true);
			}

			field3907 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3907;
			if (field3931 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3931 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class341(this));
			}

			field3931.submit(new class345(this, var1));
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "19341530"
	)
	public void method7153() {
		synchronized(this.field3938) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2._remove();
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "()Ldw;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aq")
	protected int vmethod7359() {
		return 0;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3912 * 1000000 / (class349.field4014 * -304735216);

			do {
				long var5 = (long)var4 * (long)var3 + this.field3935;
				if (this.field3936 - var5 >= 0L) {
					this.field3935 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3936 - this.field3935) - 1L) / (long)var4);
				this.field3935 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method7184();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method7225() {
		synchronized(this.field3938) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ap")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3912 * 1000000 / (class349.field4014 * -304735216);

			do {
				long var3 = this.field3935 + (long)var1 * (long)var2;
				if (this.field3936 - var3 >= 0L) {
					this.field3935 = var3;
					break;
				}

				int var5 = (int)((this.field3936 - this.field3935 + (long)var2 - 1L) / (long)var2);
				this.field3935 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method7184();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lno;ZB)V",
		garbageValue = "73"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3938) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3909 = var2;
			this.field3935 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3936 = this.midiFile.method7296(this.trackLength);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1683467795"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3938) {
			this.midiFile.clear();
			this.method7171();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1971234165"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3938) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "60"
	)
	public boolean method7158() {
		synchronized(this.field3938) {
			return this.musicPatches.method8681() > 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2418019"
	)
	public void method7159(int var1, int var2) {
		synchronized(this.field3938) {
			this.method7160(var1, var2);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "615251117"
	)
	void method7160(int var1, int var2) {
		this.field3920[var1] = var2;
		this.field3905[var1] = var2 & -128;
		this.method7229(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "885690540"
	)
	void method7229(int var1, int var2) {
		if (var2 != this.field3924[var1]) {
			this.field3924[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3914[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-445202728"
	)
	void method7162(int var1, int var2, int var3) {
		this.method7208(var1, var2, 64);
		if ((this.field3932[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3993 == var1 && var4.field3990 < 0) {
					this.field3929[var1][var4.field4001] = null;
					this.field3929[var1][var2] = var4;
					int var8 = (var4.field3996 * var4.field3997 >> 12) + var4.field3995;
					var4.field3995 += var2 - var4.field4001 << 8;
					var4.field3996 = var8 - var4.field3995;
					var4.field3997 = 4096;
					var4.field4001 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3924[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method3424();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3993 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field4006 = var9.field3968[var2];
					var6.field3991 = var9.field3969[var2];
					var6.field4001 = var2;
					var6.field4002 = var3 * var3 * var9.field3966[var2] * var9.field3963 + 1024 >> 11;
					var6.field3994 = var9.field3970[var2] & 255;
					var6.field3995 = (var2 << 8) - (var9.field3965[var2] & 32767);
					var6.field3998 = 0;
					var6.field3999 = 0;
					var6.field4000 = 0;
					var6.field3990 = -1;
					var6.field4004 = 0;
					if (this.field3930[var1] == 0) {
						var6.stream = RawPcmStream.method3236(var5, this.method7148(var6), this.method7269(var6), this.method7178(var6));
					} else {
						var6.stream = RawPcmStream.method3236(var5, this.method7148(var6), 0, this.method7178(var6));
						this.method7161(var6, var9.field3965[var2] < 0);
					}

					if (var9.field3965[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3991 >= 0) {
						MusicPatchNode var7 = this.field3914[var1][var6.field3991];
						if (var7 != null && var7.field3990 < 0) {
							this.field3929[var1][var7.field4001] = null;
							var7.field3990 = 0;
						}

						this.field3914[var1][var6.field3991] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3929[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lng;ZI)V",
		garbageValue = "348702620"
	)
	void method7161(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1326) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3930[var1.field3993] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method3232();
			}
		} else {
			var4 = (int)((long)this.field3930[var1.field3993] * (long)var3 >> 6);
		}

		var1.stream.method3263(var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-19"
	)
	void method7208(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3929[var1][var2];
		if (var4 != null) {
			this.field3929[var1][var2] = null;
			if ((this.field3932[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3993 == var4.field3993 && var5.field3990 < 0 && var4 != var5) {
						var4.field3990 = 0;
						break;
					}
				}
			} else {
				var4.field3990 = 0;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1395177225"
	)
	void method7165(int var1, int var2, int var3) {
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-745633827"
	)
	void method7166(int var1, int var2) {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "952123702"
	)
	void method7284(int var1, int var2) {
		this.field3921[var1] = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "182753683"
	)
	void method7253(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3993 == var1) {
				if (var2.stream != null) {
					var2.stream.method3260(class349.field4014 * -304735216 / 100);
					if (var2.stream.method3269()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method7383();
				}

				if (var2.field3990 < 0) {
					this.field3929[var2.field3993][var2.field4001] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1258264546"
	)
	void method7169(int var1) {
		if (var1 >= 0) {
			this.field3917[var1] = 12800;
			this.field3923[var1] = 8192;
			this.field3919[var1] = 16383;
			this.field3921[var1] = 8192;
			this.field3904[var1] = 0;
			this.field3925[var1] = 8192;
			this.method7172(var1);
			this.method7254(var1);
			this.field3932[var1] = 0;
			this.field3926[var1] = 32767;
			this.field3927[var1] = 256;
			this.field3930[var1] = 0;
			this.method7175(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method7169(var1);
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "213114606"
	)
	void method7170(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3993 == var1) && var2.field3990 < 0) {
				this.field3929[var2.field3993][var2.field4001] = null;
				var2.field3990 = 0;
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	void method7171() {
		this.method7253(-1);
		this.method7169(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3924[var1] = this.field3920[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3905[var1] = this.field3920[var1] & -128;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1122915983"
	)
	void method7172(int var1) {
		if ((this.field3932[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3993 == var1 && this.field3929[var1][var2.field4001] == null && var2.field3990 < 0) {
					var2.field3990 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "371202032"
	)
	void method7254(int var1) {
		if ((this.field3932[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3993 == var1) {
					var2.field4007 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "473643851"
	)
	void method7174(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7208(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method7162(var3, var4, var5);
			} else {
				this.method7208(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7165(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3905[var3] = (var5 << 14) + (this.field3905[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3905[var3] = (var5 << 7) + (this.field3905[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3904[var3] = (var5 << 7) + (this.field3904[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3904[var3] = var5 + (this.field3904[var3] & -128);
			}

			if (var4 == 5) {
				this.field3925[var3] = (var5 << 7) + (this.field3925[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3925[var3] = var5 + (this.field3925[var3] & -128);
			}

			if (var4 == 7) {
				this.field3917[var3] = (var5 << 7) + (this.field3917[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3917[var3] = var5 + (this.field3917[var3] & -128);
			}

			if (var4 == 10) {
				this.field3923[var3] = (var5 << 7) + (this.field3923[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3923[var3] = var5 + (this.field3923[var3] & -128);
			}

			if (var4 == 11) {
				this.field3919[var3] = (var5 << 7) + (this.field3919[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3919[var3] = var5 + (this.field3919[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3932;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3932;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3932;
					var10000[var3] |= 2;
				} else {
					this.method7172(var3);
					var10000 = this.field3932;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3926[var3] = (var5 << 7) + (this.field3926[var3] & 127);
			}

			if (var4 == 98) {
				this.field3926[var3] = (this.field3926[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3926[var3] = (var5 << 7) + (this.field3926[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3926[var3] = (this.field3926[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method7253(var3);
			}

			if (var4 == 121) {
				this.method7169(var3);
			}

			if (var4 == 123) {
				this.method7170(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3926[var3];
				if (var6 == 16384) {
					this.field3927[var3] = (var5 << 7) + (this.field3927[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3926[var3];
				if (var6 == 16384) {
					this.field3927[var3] = var5 + (this.field3927[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3930[var3] = (var5 << 7) + (this.field3930[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3930[var3] = var5 + (this.field3930[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3932;
					var10000[var3] |= 4;
				} else {
					this.method7254(var3);
					var10000 = this.field3932;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method7175(var3, (var5 << 7) + (this.field3928[var3] & -16257));
			}

			if (var4 == 49) {
				this.method7175(var3, var5 + (this.field3928[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7229(var3, var4 + this.field3905[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7166(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method7284(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method7171();
			}
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "143261028"
	)
	void method7175(int var1, int var2) {
		this.field3928[var1] = var2;
		this.field3913[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)I",
		garbageValue = "-11"
	)
	int method7148(MusicPatchNode var1) {
		int var2 = (var1.field3996 * var1.field3997 >> 12) + var1.field3995;
		var2 += (this.field3921[var1.field3993] - 8192) * this.field3927[var1.field3993] >> 12;
		MusicPatchNode2 var3 = var1.field4006;
		int var4;
		if (var3.field3887 > 0 && (var3.field3886 > 0 || this.field3904[var1.field3993] > 0)) {
			var4 = var3.field3886 << 2;
			int var5 = var3.field3888 << 1;
			if (var1.field4003 < var5) {
				var4 = var4 * var1.field4003 / var5;
			}

			var4 += this.field3904[var1.field3993] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3992 & 511));
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(class349.field4014 * -304735216) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1092269963"
	)
	int method7269(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field4006;
		int var3 = this.field3919[var1.field3993] * this.field3917[var1.field3993] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field4002 + 16384 >> 15;
		var3 = var3 * this.field3915 + 128 >> 8;
		if (var2.field3890 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var1.field3998 * 1.953125E-5D * (double)var2.field3890) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3883 != null) {
			var4 = var1.field3999;
			var5 = var2.field3883[var1.field4000 * 4 + 1];
			if (var1.field4000 * 4 < var2.field3883.length - 2) {
				var6 = (var2.field3883[var1.field4000 * 4] & 255) << 8;
				var7 = (var2.field3883[var1.field4000 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3883[var1.field4000 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3990 > 0 && var2.field3881 != null) {
			var4 = var1.field3990;
			var5 = var2.field3881[var1.field4004 * 4 + 1];
			if (var1.field4004 * 4 < var2.field3881.length - 2) {
				var6 = (var2.field3881[var1.field4004 * 4] & 255) << 8;
				var7 = (var2.field3881[var1.field4004 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3881[var1.field4004 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1187797013"
	)
	int method7178(MusicPatchNode var1) {
		int var2 = this.field3923[var1.field3993];
		return var2 < 8192 ? var2 * var1.field3994 + 32 >> 6 : 16384 - ((128 - var1.field3994) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	void method7184() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3936; var2 == this.trackLength; var3 = this.midiFile.method7296(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3909 || var2 == 0) {
							this.method7171();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method7174(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3936 = var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Z",
		garbageValue = "566000060"
	)
	boolean method7282(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3990 >= 0) {
				var1.remove();
				if (var1.field3991 > 0 && var1 == this.field3914[var1.field3993][var1.field3991]) {
					this.field3914[var1.field3993][var1.field3991] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lng;[IIII)Z",
		garbageValue = "1260840159"
	)
	boolean method7186(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3987 = class349.field4014 * -304735216 / 100;
		if (var1.field3990 < 0 || var1.stream != null && !var1.stream.method3271()) {
			int var5 = var1.field3997;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3925[var1.field3993] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3997 = var5;
			}

			var1.stream.method3270(this.method7148(var1));
			MusicPatchNode2 var6 = var1.field4006;
			boolean var7 = false;
			++var1.field4003;
			var1.field3992 += var6.field3887;
			double var8 = 5.086263020833333E-6D * (double)((var1.field4001 - 60 << 8) + (var1.field3996 * var1.field3997 >> 12));
			if (var6.field3890 > 0) {
				if (var6.field3882 > 0) {
					var1.field3998 = var1.field3998 * -1996996608 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3882 * var8) + 0.5D) * -1996996608;
				} else {
					var1.field3998 = var1.field3998 * -1996996608 + 2082471936;
				}
			}

			if (var6.field3883 != null) {
				if (var6.field3885 > 0) {
					var1.field3999 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3885) + 0.5D);
				} else {
					var1.field3999 += 128;
				}

				while (var1.field4000 * 4 < var6.field3883.length - 2 && var1.field3999 > (var6.field3883[var1.field4000 * 4 + 2] & 255) << 8) {
					var1.field4000 = var1.field4000 * 4 + 2;
				}

				if (var1.field4000 * 4 == var6.field3883.length - 2 && var6.field3883[var1.field4000 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3990 >= 0 && var6.field3881 != null && (this.field3932[var1.field3993] & 1) == 0 && (var1.field3991 < 0 || var1 != this.field3914[var1.field3993][var1.field3991])) {
				if (var6.field3884 > 0) {
					var1.field3990 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3884) + 0.5D);
				} else {
					var1.field3990 += 128;
				}

				while (var1.field4004 * 4 < var6.field3881.length - 2 && var1.field3990 > (var6.field3881[var1.field4004 * 4 + 2] & 255) << 8) {
					var1.field4004 = var1.field4004 * 4 + 2;
				}

				if (var1.field4004 * 4 == var6.field3881.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method3260(var1.field3987);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method3269()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method7383();
				if (var1.field3990 >= 0) {
					var1.remove();
					if (var1.field3991 > 0 && var1 == this.field3914[var1.field3993][var1.field3991]) {
						this.field3914[var1.field3993][var1.field3991] = null;
					}
				}

				return true;
			} else {
				var1.stream.method3240(var1.field3987, this.method7269(var1), this.method7178(var1));
				return false;
			}
		} else {
			var1.method7383();
			var1.remove();
			if (var1.field3991 > 0 && var1 == this.field3914[var1.field3993][var1.field3991]) {
				this.field3914[var1.field3993][var1.field3991] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;IIB)Ljava/lang/String;",
		garbageValue = "53"
	)
	public static String method7243(Object[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = (CharSequence)var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = (CharSequence)var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = (CharSequence)var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltg;Lwn;I)V",
		garbageValue = "-2126250930"
	)
	static void method7285(WorldEntity var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		int var3 = var1.readUnsignedByte();
		if (var2 == 65535) {
			byte var6 = -1;
			var0.field5493.setSequence(var6);
			var0.field5493.method9630();
			var0.field5494 = var3;
		} else {
			SequenceDefinition var4 = var0.field5493.getSequenceDefinition();
			if (var4 != null) {
				if (var2 == var0.method10183()) {
					int var5 = var4.restartMode;
					if (var5 == 1) {
						var0.field5493.method9630();
						var0.field5494 = var3;
					}

					if (var5 == 2) {
						var0.field5493.method9678();
					}

					return;
				}

				if (class171.SequenceDefinition_get(var2).field2485 < var4.field2485) {
					return;
				}
			}

			var0.field5493.setSequence(var2);
			var0.field5493.method9630();
			var0.field5494 = var3;
		}
	}
}
