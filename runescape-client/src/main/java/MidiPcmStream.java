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

@ObfuscatedName("mo")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("bj")
	static AtomicBoolean field3651;
	@ObfuscatedName("bh")
	static ThreadPoolExecutor field3666;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1416464583
	)
	int field3637;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1039966656
	)
	int field3638;
	@ObfuscatedName("ae")
	int[] field3639;
	@ObfuscatedName("ao")
	int[] field3658;
	@ObfuscatedName("ac")
	int[] field3641;
	@ObfuscatedName("aj")
	int[] field3663;
	@ObfuscatedName("av")
	int[] field3636;
	@ObfuscatedName("au")
	int[] field3644;
	@ObfuscatedName("an")
	int[] field3645;
	@ObfuscatedName("af")
	int[] field3656;
	@ObfuscatedName("ai")
	int[] field3647;
	@ObfuscatedName("ad")
	int[] field3648;
	@ObfuscatedName("ay")
	int[] field3652;
	@ObfuscatedName("ax")
	int[] field3650;
	@ObfuscatedName("aa")
	int[] field3643;
	@ObfuscatedName("aq")
	int[] field3646;
	@ObfuscatedName("am")
	int[] field3665;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[[Lnn;"
	)
	MusicPatchNode[][] field3654;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[[Lnn;"
	)
	MusicPatchNode[][] field3640;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bv")
	boolean field3657;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -960536847
	)
	@Export("track")
	int track;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 94412935
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -5393318327487785009L
	)
	long field3660;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		longValue = 888513063511996657L
	)
	long field3661;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lbx;"
	)
	@Export("player")
	PcmPlayer player;
	@ObfuscatedName("bu")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1954247103
	)
	public int field3667;

	static {
		field3651 = null;
		field3666 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lbx;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.field3637 = 256;
		this.field3638 = -727379968;
		this.field3639 = new int[16];
		this.field3658 = new int[16];
		this.field3641 = new int[16];
		this.field3663 = new int[16];
		this.field3636 = new int[16];
		this.field3644 = new int[16];
		this.field3645 = new int[16];
		this.field3656 = new int[16];
		this.field3647 = new int[16];
		this.field3648 = new int[16];
		this.field3652 = new int[16];
		this.field3650 = new int[16];
		this.field3643 = new int[16];
		this.field3646 = new int[16];
		this.field3665 = new int[16];
		this.field3654 = new MusicPatchNode[16][128];
		this.field3640 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.player = null;
		this.priorityQueue = new PriorityQueue(5, new class344());
		this.field3667 = 0;
		this.player = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method6575();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "425499116"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.player) {
			this.field3637 = var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-71105053"
	)
	public int method6629() {
		return this.field3637;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lpi;Lbn;I)Z",
		garbageValue = "1853677142"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.player) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class346 var6 = (class346)var1.field3710.first(); var6 != null; var6 = (class346)var1.field3710.next()) {
				int var14 = (int)var6.key;
				MusicPatch var8 = (MusicPatch)this.musicPatches.get((long)var14);
				if (var8 == null) {
					var8 = RestClientThreadFactory.method192(var2, var14);
					if (var8 == null) {
						var5 = false;
						continue;
					}

					this.musicPatches.put(var8, (long)var14);
				}

				if (!var8.method6735(var3, var6.field3750)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var10 = var8.field3693.iterator();

						while (var10.hasNext()) {
							class53 var11 = (class53)var10.next();
							this.priorityQueue.add(new class337(var6.field3752, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-102846368"
	)
	public void method6557() {
		if (this.priorityQueue != null) {
			if (field3651 != null) {
				field3651.set(true);
			}

			field3651 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3651;
			if (field3666 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3666 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class336(this));
			}

			field3666.submit(new class340(this, var1));
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "122947343"
	)
	public void method6558() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.method6736();
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("av")
	protected int vmethod6753() {
		return 0;
	}

	@ObfuscatedName("au")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3638 * 1000000 / (DbTableType.field5406 * 1168272912);

			do {
				long var5 = this.field3660 + (long)var3 * (long)var4;
				if (this.field3661 - var5 >= 0L) {
					this.field3660 = var5;
					break;
				}

				int var7 = (int)(((long)var4 + (this.field3661 - this.field3660) - 1L) / (long)var4);
				this.field3660 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method6588();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2053682426"
	)
	public void method6594() {
		synchronized(this.player) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("af")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3638 * 1000000 / (DbTableType.field5406 * 1168272912);

			do {
				long var3 = (long)var1 * (long)var2 + this.field3660;
				if (this.field3661 - var3 >= 0L) {
					this.field3660 = var3;
					break;
				}

				int var5 = (int)((this.field3661 - this.field3660 + (long)var2 - 1L) / (long)var2);
				this.field3660 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method6588();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lne;ZI)V",
		garbageValue = "1288358246"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.player) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3657 = var2;
			this.field3660 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3661 = this.midiFile.method6698(this.trackLength);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1159240308"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.player) {
			this.midiFile.clear();
			this.method6575();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2066479642"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.player) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "686834350"
	)
	public boolean method6677() {
		synchronized(this.player) {
			return this.musicPatches.method9803() > 0;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1780129952"
	)
	public void method6672(int var1, int var2) {
		synchronized(this.player) {
			this.method6586(var1, var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1135792918"
	)
	void method6586(int var1, int var2) {
		this.field3663[var1] = var2;
		this.field3644[var1] = var2 & -128;
		this.method6678(var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-56"
	)
	void method6678(int var1, int var2) {
		if (var2 != this.field3636[var1]) {
			this.field3636[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3640[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "45"
	)
	void method6567(int var1, int var2, int var3) {
		this.method6624(var1, var2, 64);
		if ((this.field3648[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3728 == var1 && var4.field3716 < 0) {
					this.field3654[var1][var4.field3715] = null;
					this.field3654[var1][var2] = var4;
					int var8 = (var4.field3720 * var4.field3721 >> 12) + var4.field3719;
					var4.field3719 += var2 - var4.field3715 << 8;
					var4.field3720 = var8 - var4.field3719;
					var4.field3721 = 4096;
					var4.field3715 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3636[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method1060();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3728 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3714 = var9.field3696[var2];
					var6.field3724 = var9.field3697[var2];
					var6.field3715 = var2;
					var6.field3725 = var3 * var3 * var9.field3691[var2] * var9.field3695 + 1024 >> 11;
					var6.field3718 = var9.field3698[var2] & 255;
					var6.field3719 = (var2 << 8) - (var9.field3694[var2] & 32767);
					var6.field3722 = 0;
					var6.field3723 = 0;
					var6.field3711 = 0;
					var6.field3716 = -1;
					var6.field3712 = 0;
					if (this.field3643[var1] == 0) {
						var6.stream = RawPcmStream.method913(var5, this.method6649(var6), this.method6581(var6), this.method6579(var6));
					} else {
						var6.stream = RawPcmStream.method913(var5, this.method6649(var6), 0, this.method6579(var6));
						this.method6564(var6, var9.field3694[var2] < 0);
					}

					if (var9.field3694[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3724 >= 0) {
						MusicPatchNode var7 = this.field3640[var1][var6.field3724];
						if (var7 != null && var7.field3716 < 0) {
							this.field3654[var1][var7.field3715] = null;
							var7.field3716 = 0;
						}

						this.field3640[var1][var6.field3724] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3654[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lnn;ZI)V",
		garbageValue = "957031193"
	)
	void method6564(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field256) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)var5 * (long)this.field3643[var1.field3728] >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method941();
			}
		} else {
			var4 = (int)((long)this.field3643[var1.field3728] * (long)var3 >> 6);
		}

		var1.stream.method967(var4);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1152003287"
	)
	void method6624(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3654[var1][var2];
		if (var4 != null) {
			this.field3654[var1][var2] = null;
			if ((this.field3648[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3728 == var4.field3728 && var5.field3716 < 0 && var5 != var4) {
						var4.field3716 = 0;
						break;
					}
				}
			} else {
				var4.field3716 = 0;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	void method6569(int var1, int var2, int var3) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "16"
	)
	void method6570(int var1, int var2) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-99"
	)
	void method6598(int var1, int var2) {
		this.field3645[var1] = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "521957863"
	)
	void method6572(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3728 == var1) {
				if (var2.stream != null) {
					var2.stream.method885(DbTableType.field5406 * 1168272912 / 100);
					if (var2.stream.method889()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method6779();
				}

				if (var2.field3716 < 0) {
					this.field3654[var2.field3728][var2.field3715] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	void method6573(int var1) {
		if (var1 >= 0) {
			this.field3639[var1] = 12800;
			this.field3658[var1] = 8192;
			this.field3641[var1] = 16383;
			this.field3645[var1] = 8192;
			this.field3656[var1] = 0;
			this.field3647[var1] = 8192;
			this.method6613(var1);
			this.method6577(var1);
			this.field3648[var1] = 0;
			this.field3652[var1] = 32767;
			this.field3650[var1] = 256;
			this.field3643[var1] = 0;
			this.method6656(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method6573(var1);
			}

		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	void method6574(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3728 == var1) && var2.field3716 < 0) {
				this.field3654[var2.field3728][var2.field3715] = null;
				var2.field3716 = 0;
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	void method6575() {
		this.method6572(-1);
		this.method6573(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3636[var1] = this.field3663[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3644[var1] = this.field3663[var1] & -128;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1582083236"
	)
	void method6613(int var1) {
		if ((this.field3648[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3728 == var1 && this.field3654[var1][var2.field3715] == null && var2.field3716 < 0) {
					var2.field3716 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1523169942"
	)
	void method6577(int var1) {
		if ((this.field3648[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3728 == var1) {
					var2.field3731 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "702412250"
	)
	void method6615(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6624(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method6567(var3, var4, var5);
			} else {
				this.method6624(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method6569(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3644[var3] = (var5 << 14) + (this.field3644[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3644[var3] = (var5 << 7) + (this.field3644[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3656[var3] = (var5 << 7) + (this.field3656[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3656[var3] = var5 + (this.field3656[var3] & -128);
			}

			if (var4 == 5) {
				this.field3647[var3] = (var5 << 7) + (this.field3647[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3647[var3] = var5 + (this.field3647[var3] & -128);
			}

			if (var4 == 7) {
				this.field3639[var3] = (var5 << 7) + (this.field3639[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3639[var3] = var5 + (this.field3639[var3] & -128);
			}

			if (var4 == 10) {
				this.field3658[var3] = (var5 << 7) + (this.field3658[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3658[var3] = var5 + (this.field3658[var3] & -128);
			}

			if (var4 == 11) {
				this.field3641[var3] = (var5 << 7) + (this.field3641[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3641[var3] = var5 + (this.field3641[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3648;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3648;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3648;
					var10000[var3] |= 2;
				} else {
					this.method6613(var3);
					var10000 = this.field3648;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3652[var3] = (var5 << 7) + (this.field3652[var3] & 127);
			}

			if (var4 == 98) {
				this.field3652[var3] = (this.field3652[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3652[var3] = (var5 << 7) + (this.field3652[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3652[var3] = (this.field3652[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method6572(var3);
			}

			if (var4 == 121) {
				this.method6573(var3);
			}

			if (var4 == 123) {
				this.method6574(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3652[var3];
				if (var6 == 16384) {
					this.field3650[var3] = (var5 << 7) + (this.field3650[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3652[var3];
				if (var6 == 16384) {
					this.field3650[var3] = var5 + (this.field3650[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3643[var3] = (var5 << 7) + (this.field3643[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3643[var3] = var5 + (this.field3643[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3648;
					var10000[var3] |= 4;
				} else {
					this.method6577(var3);
					var10000 = this.field3648;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method6656(var3, (var5 << 7) + (this.field3646[var3] & -16257));
			}

			if (var4 == 49) {
				this.method6656(var3, var5 + (this.field3646[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6678(var3, var4 + this.field3644[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method6570(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method6598(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method6575();
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method6656(int var1, int var2) {
		this.field3646[var1] = var2;
		this.field3665[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)I",
		garbageValue = "94"
	)
	int method6649(MusicPatchNode var1) {
		int var2 = (var1.field3721 * var1.field3720 >> 12) + var1.field3719;
		var2 += (this.field3645[var1.field3728] - 8192) * this.field3650[var1.field3728] >> 12;
		MusicPatchNode2 var3 = var1.field3714;
		int var4;
		if (var3.field3616 > 0 && (var3.field3615 > 0 || this.field3656[var1.field3728] > 0)) {
			var4 = var3.field3615 << 2;
			int var5 = var3.field3609 << 1;
			if (var1.field3727 < var5) {
				var4 = var4 * var1.field3727 / var5;
			}

			var4 += this.field3656[var1.field3728] >> 7;
			double var6 = Math.sin((double)(var1.field3730 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(DbTableType.field5406 * 1168272912) + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "-1335720301"
	)
	int method6581(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3714;
		int var3 = this.field3641[var1.field3728] * this.field3639[var1.field3728] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3725 + 16384 >> 15;
		var3 = var3 * this.field3637 + 128 >> 8;
		if (var2.field3612 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3612 * (double)var1.field3722 * 1.953125E-5D) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3617 != null) {
			var4 = var1.field3723;
			var5 = var2.field3617[var1.field3711 * 4 + 1];
			if (var1.field3711 * 4 < var2.field3617.length - 2) {
				var6 = (var2.field3617[var1.field3711 * 4] & 255) << 8;
				var7 = (var2.field3617[var1.field3711 * 4 + 2] & 255) << 8;
				var5 += (var2.field3617[var1.field3711 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		if (var1.field3716 > 0 && var2.field3610 != null) {
			var4 = var1.field3716;
			var5 = var2.field3610[var1.field3712 * 4 + 1];
			if (var1.field3712 * 4 < var2.field3610.length - 2) {
				var6 = (var2.field3610[var1.field3712 * 4] & 255) << 8;
				var7 = (var2.field3610[var1.field3712 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3610[var1.field3712 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "-160455449"
	)
	int method6579(MusicPatchNode var1) {
		int var2 = this.field3658[var1.field3728];
		return var2 < 8192 ? var2 * var1.field3718 + 32 >> 6 : 16384 - ((128 - var1.field3718) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	void method6588() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3661; var2 == this.trackLength; var3 = this.midiFile.method6698(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3657 || var2 == 0) {
							this.method6575();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method6615(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3661 = var3;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-1776153448"
	)
	boolean method6589(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3716 >= 0) {
				var1.remove();
				if (var1.field3724 > 0 && var1 == this.field3640[var1.field3728][var1.field3724]) {
					this.field3640[var1.field3728][var1.field3724] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Lnn;[IIIB)Z",
		garbageValue = "28"
	)
	boolean method6590(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3717 = DbTableType.field5406 * 1168272912 / 100;
		if (var1.field3716 < 0 || var1.stream != null && !var1.stream.method953()) {
			int var5 = var1.field3721;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field3647[var1.field3728]) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3721 = var5;
			}

			var1.stream.method886(this.method6649(var1));
			MusicPatchNode2 var6 = var1.field3714;
			boolean var7 = false;
			++var1.field3727;
			var1.field3730 += var6.field3616;
			double var8 = (double)((var1.field3715 - 60 << 8) + (var1.field3721 * var1.field3720 >> 12)) * 5.086263020833333E-6D;
			if (var6.field3612 > 0) {
				if (var6.field3614 > 0) {
					var1.field3722 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3614) + 0.5D);
				} else {
					var1.field3722 += 128;
				}
			}

			if (var6.field3617 != null) {
				if (var6.field3611 > 0) {
					var1.field3723 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3611) + 0.5D);
				} else {
					var1.field3723 += 128;
				}

				while (var1.field3711 * 4 < var6.field3617.length - 2 && var1.field3723 > (var6.field3617[var1.field3711 * 4 + 2] & 255) << 8) {
					var1.field3711 = var1.field3711 * 4 + 2;
				}

				if (var1.field3711 * 4 == var6.field3617.length - 2 && var6.field3617[var1.field3711 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3716 >= 0 && var6.field3610 != null && (this.field3648[var1.field3728] & 1) == 0 && (var1.field3724 < 0 || var1 != this.field3640[var1.field3728][var1.field3724])) {
				if (var6.field3613 > 0) {
					var1.field3716 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3613 * var8) + 0.5D);
				} else {
					var1.field3716 += 128;
				}

				while (var1.field3712 * 4 < var6.field3610.length - 2 && var1.field3716 > (var6.field3610[var1.field3712 * 4 + 2] & 255) << 8) {
					var1.field3712 = var1.field3712 * 4 + 2;
				}

				if (var1.field3712 * 4 == var6.field3610.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method885(var1.field3717);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method889()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method6779();
				if (var1.field3716 >= 0) {
					var1.remove();
					if (var1.field3724 > 0 && var1 == this.field3640[var1.field3728][var1.field3724]) {
						this.field3640[var1.field3728][var1.field3724] = null;
					}
				}

				return true;
			} else {
				var1.stream.method884(var1.field3717, this.method6581(var1), this.method6579(var1));
				return false;
			}
		} else {
			var1.method6779();
			var1.remove();
			if (var1.field3724 > 0 && var1 == this.field3640[var1.field3728][var1.field3724]) {
				this.field3640[var1.field3728][var1.field3724] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmb;",
		garbageValue = "-890541786"
	)
	public static class323[] method6685() {
		return new class323[]{class323.field3420, class323.field3429, class323.field3427, class323.field3418, class323.field3422, class323.field3423, class323.field3424, class323.field3425, class323.field3426, class323.field3421, class323.field3428, class323.field3419, class323.field3430};
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqb;",
		garbageValue = "1944881626"
	)
	public static TransformationMatrix method6684() {
		synchronized(TransformationMatrix.field4775) {
			if (TransformationMatrix.field4774 == 0) {
				return new TransformationMatrix();
			} else {
				TransformationMatrix.field4775[--TransformationMatrix.field4774].method8210();
				return TransformationMatrix.field4775[TransformationMatrix.field4774];
			}
		}
	}
}
