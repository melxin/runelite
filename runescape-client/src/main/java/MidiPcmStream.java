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

@ObfuscatedName("mt")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ai")
	static AtomicBoolean field3709;
	@ObfuscatedName("al")
	static ThreadPoolExecutor field3707;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("ac")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 100551355
	)
	public int field3739;
	@ObfuscatedName("am")
	int[] field3710;
	@ObfuscatedName("ah")
	int[] field3711;
	@ObfuscatedName("ag")
	int[] field3712;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1309766171
	)
	int field3724;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -419497415
	)
	int field3715;
	@ObfuscatedName("af")
	int[] field3716;
	@ObfuscatedName("ak")
	int[] field3717;
	@ObfuscatedName("az")
	int[] field3718;
	@ObfuscatedName("ao")
	int[] field3719;
	@ObfuscatedName("as")
	int[] field3720;
	@ObfuscatedName("ax")
	int[] field3723;
	@ObfuscatedName("ab")
	int[] field3736;
	@ObfuscatedName("aq")
	int[] field3727;
	@ObfuscatedName("ay")
	int[] field3735;
	@ObfuscatedName("ba")
	int[] field3725;
	@ObfuscatedName("bx")
	int[] field3726;
	@ObfuscatedName("bl")
	int[] field3721;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3728;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[[Lne;"
	)
	MusicPatchNode[][] field3729;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bm")
	boolean field3714;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1138591593
	)
	@Export("track")
	int track;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1627871829
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		longValue = -348765912245905445L
	)
	long field3734;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		longValue = -5739573981979140621L
	)
	long field3731;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Ldc;"
	)
	PcmPlayer field3737;

	static {
		field3709 = null;
		field3707 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ldc;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class346());
		this.field3739 = 0;
		this.field3710 = new int[16];
		this.field3711 = new int[16];
		this.field3712 = new int[16];
		this.field3724 = 256;
		this.field3715 = 1000000;
		this.field3716 = new int[16];
		this.field3717 = new int[16];
		this.field3718 = new int[16];
		this.field3719 = new int[16];
		this.field3720 = new int[16];
		this.field3723 = new int[16];
		this.field3736 = new int[16];
		this.field3727 = new int[16];
		this.field3735 = new int[16];
		this.field3725 = new int[16];
		this.field3726 = new int[16];
		this.field3721 = new int[16];
		this.field3728 = new MusicPatchNode[16][128];
		this.field3729 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3737 = null;
		this.field3737 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6941();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1349348817"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3737) {
			this.field3724 = var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1626548053"
	)
	public int method7043() {
		return this.field3724;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnh;Lps;Ldz;B)Z",
		garbageValue = "73"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3737) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class348 var6 = (class348)var1.field3782.first(); var6 != null; var6 = (class348)var1.field3782.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					byte[] var10 = var2.takeFileFlat(var14);
					MusicPatch var9;
					if (var10 == null) {
						var9 = null;
					} else {
						var9 = new MusicPatch(var10);
					}

					var8 = var9;
					if (var9 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var9, (long)var14);
				}

				if (!var8.method7105(var3, var6.field3826)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3772.iterator();

						while (var18.hasNext()) {
							class107 var11 = (class107)var18.next();
							this.priorityQueue.add(new class339(var6.field3828, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1238819805"
	)
	public void method7044() {
		if (this.priorityQueue != null) {
			if (field3709 != null) {
				field3709.set(true);
			}

			field3709 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3709;
			if (field3707 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3707 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class338(this));
			}

			field3707.submit(new class342(this, var1));
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	public void method6982() {
		synchronized(this.field3737) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method7104();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Ldf;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("am")
	protected int vmethod7122() {
		return 0;
	}

	@ObfuscatedName("ah")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3715 * -727379968 / UserComparator3.field1521;

			do {
				long var5 = (long)var4 * (long)var3 + this.field3734;
				if (this.field3731 - var5 >= 0L) {
					this.field3734 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3731 - this.field3734) - 1L) / (long)var4);
				this.field3734 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6960();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-320224391"
	)
	public void method6981() {
		synchronized(this.field3737) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3715 * -727379968 / UserComparator3.field1521;

			do {
				long var3 = this.field3734 + (long)var2 * (long)var1;
				if (this.field3731 - var3 >= 0L) {
					this.field3734 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3731 - this.field3734) - 1L) / (long)var2);
				this.field3734 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6960();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnh;ZI)V",
		garbageValue = "1396955417"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3737) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3714 = var2;
			this.field3734 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3731 = this.midiFile.method7059(this.trackLength);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "354234421"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3737) {
			this.midiFile.clear();
			this.method6941();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2142649350"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3737) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-697417340"
	)
	public boolean method6951() {
		synchronized(this.field3737) {
			return this.musicPatches.method8358() > 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1920583486"
	)
	public void method6929(int var1, int var2) {
		synchronized(this.field3737) {
			this.method6930(var1, var2);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-34"
	)
	void method6930(int var1, int var2) {
		this.field3719[var1] = var2;
		this.field3723[var1] = var2 & -128;
		this.method6958(var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2001892277"
	)
	void method6958(int var1, int var2) {
		if (var2 != this.field3720[var1]) {
			this.field3720[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3729[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-674881064"
	)
	void method6924(int var1, int var2, int var3) {
		this.method6934(var1, var2, 64);
		if ((this.field3710[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3784 == var1 && var4.field3798 < 0) {
					this.field3728[var1][var4.field3789] = null;
					this.field3728[var1][var2] = var4;
					int var8 = (var4.field3799 * var4.field3793 >> 12) + var4.field3786;
					var4.field3786 += var2 - var4.field3789 << 8;
					var4.field3793 = var8 - var4.field3786;
					var4.field3799 = 4096;
					var4.field3789 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3720[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method3218();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3784 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3787 = var9.field3770[var2];
					var6.field3788 = var9.field3764[var2];
					var6.field3789 = var2;
					var6.field3791 = var3 * var3 * var9.field3773[var2] * var9.field3768 + 1024 >> 11;
					var6.field3801 = var9.field3769[var2] & 255;
					var6.field3786 = (var2 << 8) - (var9.field3771[var2] & 32767);
					var6.field3795 = 0;
					var6.field3796 = 0;
					var6.field3797 = 0;
					var6.field3798 = -1;
					var6.field3783 = 0;
					if (this.field3711[var1] == 0) {
						var6.stream = RawPcmStream.method3017(var5, this.method6946(var6), this.method6947(var6), this.method7010(var6));
					} else {
						var6.stream = RawPcmStream.method3017(var5, this.method6946(var6), 0, this.method7010(var6));
						this.method6933(var6, var9.field3771[var2] < 0);
					}

					if (var9.field3771[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3788 >= 0) {
						MusicPatchNode var7 = this.field3729[var1][var6.field3788];
						if (var7 != null && var7.field3798 < 0) {
							this.field3728[var1][var7.field3789] = null;
							var7.field3798 = 0;
						}

						this.field3729[var1][var6.field3788] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3728[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lne;ZI)V",
		garbageValue = "1746515813"
	)
	void method6933(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1292) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3711[var1.field3784] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method3044();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3711[var1.field3784] >> 6);
		}

		var1.stream.method3043(var4);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1820148035"
	)
	void method6934(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3728[var1][var2];
		if (var4 != null) {
			this.field3728[var1][var2] = null;
			if ((this.field3710[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3784 == var4.field3784 && var5.field3798 < 0 && var5 != var4) {
						var4.field3798 = 0;
						break;
					}
				}
			} else {
				var4.field3798 = 0;
			}

		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1472598465"
	)
	void method6935(int var1, int var2, int var3) {
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1508317930"
	)
	void method6936(int var1, int var2) {
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	void method7025(int var1, int var2) {
		this.field3736[var1] = var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-611554175"
	)
	void method6938(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3784 == var1) {
				if (var2.stream != null) {
					var2.stream.method3123(UserComparator3.field1521 / 100);
					if (var2.stream.method3052()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method7146();
				}

				if (var2.field3798 < 0) {
					this.field3728[var2.field3784][var2.field3789] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "6196944"
	)
	void method6939(int var1) {
		if (var1 >= 0) {
			this.field3716[var1] = 12800;
			this.field3717[var1] = 8192;
			this.field3718[var1] = 16383;
			this.field3736[var1] = 8192;
			this.field3727[var1] = 0;
			this.field3735[var1] = 8192;
			this.method6948(var1);
			this.method6943(var1);
			this.field3710[var1] = 0;
			this.field3725[var1] = 32767;
			this.field3726[var1] = 256;
			this.field3711[var1] = 0;
			this.method7029(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6939(var1);
			}

		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1691185455"
	)
	void method6940(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3784 == var1) && var2.field3798 < 0) {
				this.field3728[var2.field3784][var2.field3789] = null;
				var2.field3798 = 0;
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-378931642"
	)
	void method6941() {
		this.method6938(-1);
		this.method6939(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3720[var1] = this.field3719[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3723[var1] = this.field3719[var1] & -128;
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2119911940"
	)
	void method6948(int var1) {
		if ((this.field3710[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3784 == var1 && this.field3728[var1][var2.field3789] == null && var2.field3798 < 0) {
					var2.field3798 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "7"
	)
	void method6943(int var1) {
		if ((this.field3710[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3784 == var1) {
					var2.field3804 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1721035935"
	)
	void method6944(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6934(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6924(var3, var4, var5);
			} else {
				this.method6934(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6935(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3723[var3] = (var5 << 14) + (this.field3723[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3723[var3] = (var5 << 7) + (this.field3723[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3727[var3] = (var5 << 7) + (this.field3727[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3727[var3] = var5 + (this.field3727[var3] & -128);
			}

			if (var4 == 5) {
				this.field3735[var3] = (var5 << 7) + (this.field3735[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3735[var3] = var5 + (this.field3735[var3] & -128);
			}

			if (var4 == 7) {
				this.field3716[var3] = (var5 << 7) + (this.field3716[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3716[var3] = var5 + (this.field3716[var3] & -128);
			}

			if (var4 == 10) {
				this.field3717[var3] = (var5 << 7) + (this.field3717[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3717[var3] = var5 + (this.field3717[var3] & -128);
			}

			if (var4 == 11) {
				this.field3718[var3] = (var5 << 7) + (this.field3718[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3718[var3] = var5 + (this.field3718[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3710;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3710;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3710;
					var10000[var3] |= 2;
				} else {
					this.method6948(var3);
					var10000 = this.field3710;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3725[var3] = (var5 << 7) + (this.field3725[var3] & 127);
			}

			if (var4 == 98) {
				this.field3725[var3] = (this.field3725[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3725[var3] = (var5 << 7) + (this.field3725[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3725[var3] = (this.field3725[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6938(var3);
			}

			if (var4 == 121) {
				this.method6939(var3);
			}

			if (var4 == 123) {
				this.method6940(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3725[var3];
				if (var6 == 16384) {
					this.field3726[var3] = (var5 << 7) + (this.field3726[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3725[var3];
				if (var6 == 16384) {
					this.field3726[var3] = var5 + (this.field3726[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3711[var3] = (var5 << 7) + (this.field3711[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3711[var3] = var5 + (this.field3711[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3710;
					var10000[var3] |= 4;
				} else {
					this.method6943(var3);
					var10000 = this.field3710;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method7029(var3, (var5 << 7) + (this.field3721[var3] & -16257));
			}

			if (var4 == 49) {
				this.method7029(var3, var5 + (this.field3721[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6958(var3, var4 + this.field3723[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6936(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method7025(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6941();
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "825335636"
	)
	void method7029(int var1, int var2) {
		this.field3721[var1] = var2;
		this.field3712[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "-1847913563"
	)
	int method6946(MusicPatchNode var1) {
		int var2 = (var1.field3799 * var1.field3793 >> 12) + var1.field3786;
		var2 += (this.field3736[var1.field3784] - 8192) * this.field3726[var1.field3784] >> 12;
		MusicPatchNode2 var3 = var1.field3787;
		int var4;
		if (var3.field3685 > 0 && (var3.field3689 > 0 || this.field3727[var1.field3784] > 0)) {
			var4 = var3.field3689 << 2;
			int var5 = var3.field3691 << 1;
			if (var1.field3790 < var5) {
				var4 = var4 * var1.field3790 / var5;
			}

			var4 += this.field3727[var1.field3784] >> 7;
			double var6 = Math.sin((double)(var1.field3794 & 511) * 0.01227184630308513D);
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, (double)var2 * 3.255208333333333E-4D) / (double)UserComparator3.field1521 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "88678770"
	)
	int method6947(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3787;
		int var3 = this.field3718[var1.field3784] * this.field3716[var1.field3784] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3791 + 16384 >> 15;
		var3 = var3 * this.field3724 + 128 >> 8;
		if (var2.field3688 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3688 * (double)var1.field3795 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3686 != null) {
			var4 = var1.field3796;
			var5 = var2.field3686[var1.field3797 * 2 + 1];
			if (var1.field3797 * 2 < var2.field3686.length - 2) {
				var6 = (var2.field3686[var1.field3797 * 2] & 255) << 8;
				var7 = (var2.field3686[var1.field3797 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3686[var1.field3797 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3798 > 0 && var2.field3684 != null) {
			var4 = var1.field3798;
			var5 = var2.field3684[var1.field3783 * 4 + 1];
			if (var1.field3783 * 4 < var2.field3684.length - 2) {
				var6 = (var2.field3684[var1.field3783 * 4] & 255) << 8;
				var7 = (var2.field3684[var1.field3783 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3684[var1.field3783 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)I",
		garbageValue = "-79391058"
	)
	int method7010(MusicPatchNode var1) {
		int var2 = this.field3717[var1.field3784];
		return var2 < 8192 ? var2 * var1.field3801 + 32 >> 6 : 16384 - ((128 - var1.field3801) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
	)
	void method6960() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3731; var2 == this.trackLength; var3 = this.midiFile.method7059(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3714 || var2 == 0) {
							this.method6941();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6944(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3731 = var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lne;B)Z",
		garbageValue = "6"
	)
	boolean method7042(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3798 >= 0) {
				var1.remove();
				if (var1.field3788 > 0 && var1 == this.field3729[var1.field3784][var1.field3788]) {
					this.field3729[var1.field3784][var1.field3788] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lne;[IIII)Z",
		garbageValue = "1318605471"
	)
	boolean method6954(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3803 = UserComparator3.field1521 / 100;
		if (var1.field3798 < 0 || var1.stream != null && !var1.stream.method3176()) {
			int var5 = var1.field3799;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3735[var1.field3784] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3799 = var5;
			}

			var1.stream.method3053(this.method6946(var1));
			MusicPatchNode2 var6 = var1.field3787;
			boolean var7 = false;
			++var1.field3790;
			var1.field3794 += var6.field3685;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3789 - 60 << 8) + (var1.field3793 * var1.field3799 >> 12));
			if (var6.field3688 > 0) {
				if (var6.field3687 > 0) {
					var1.field3795 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3687) + 0.5D);
				} else {
					var1.field3795 += 128;
				}
			}

			if (var6.field3686 != null) {
				if (var6.field3683 > 0) {
					var1.field3796 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3683 * var8) + 0.5D);
				} else {
					var1.field3796 += 128;
				}

				while (var1.field3797 * 2 < var6.field3686.length - 2 && var1.field3796 > (var6.field3686[var1.field3797 * 2 + 2] & 255) << 8) {
					var1.field3797 = var1.field3797 * 4 + 4;
				}

				if (var1.field3797 * 2 == var6.field3686.length - 2 && var6.field3686[var1.field3797 * 2 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3798 >= 0 && var6.field3684 != null && (this.field3710[var1.field3784] & 1) == 0 && (var1.field3788 < 0 || var1 != this.field3729[var1.field3784][var1.field3788])) {
				if (var6.field3690 > 0) {
					var1.field3798 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3690) + 0.5D);
				} else {
					var1.field3798 += 128;
				}

				while (var1.field3783 * 4 < var6.field3684.length - 2 && var1.field3798 > (var6.field3684[var1.field3783 * 4 + 2] & 255) << 8) {
					var1.field3783 = var1.field3783 * 4 + 2;
				}

				if (var1.field3783 * 4 == var6.field3684.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method3123(var1.field3803);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method3052()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method7146();
				if (var1.field3798 >= 0) {
					var1.remove();
					if (var1.field3788 > 0 && var1 == this.field3729[var1.field3784][var1.field3788]) {
						this.field3729[var1.field3784][var1.field3788] = null;
					}
				}

				return true;
			} else {
				var1.stream.method3047(var1.field3803, this.method6947(var1), this.method7010(var1));
				return false;
			}
		} else {
			var1.method7146();
			var1.remove();
			if (var1.field3788 > 0 && var1 == this.field3729[var1.field3784][var1.field3788]) {
				this.field3729[var1.field3784][var1.field3788] = null;
			}

			return true;
		}
	}
}
