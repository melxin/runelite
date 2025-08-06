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

@ObfuscatedName("nm")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("av")
	static AtomicBoolean field3803;
	@ObfuscatedName("au")
	static ThreadPoolExecutor field3808;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("as")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -739832509
	)
	public int field3806;
	@ObfuscatedName("ap")
	int[] field3807;
	@ObfuscatedName("am")
	int[] field3801;
	@ObfuscatedName("aj")
	int[] field3809;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2146350089
	)
	int field3826;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1692037613
	)
	int field3819;
	@ObfuscatedName("ai")
	int[] field3813;
	@ObfuscatedName("ak")
	int[] field3821;
	@ObfuscatedName("ar")
	int[] field3815;
	@ObfuscatedName("at")
	int[] field3816;
	@ObfuscatedName("ax")
	int[] field3817;
	@ObfuscatedName("aq")
	int[] field3822;
	@ObfuscatedName("ao")
	int[] field3811;
	@ObfuscatedName("an")
	int[] field3820;
	@ObfuscatedName("ae")
	int[] field3832;
	@ObfuscatedName("bj")
	int[] field3833;
	@ObfuscatedName("bn")
	int[] field3834;
	@ObfuscatedName("bi")
	int[] field3812;
	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "[[Lnk;"
	)
	MusicPatchNode[][] field3825;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[[Lnk;"
	)
	MusicPatchNode[][] field3823;
	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bm")
	boolean field3824;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1018608089
	)
	@Export("track")
	int track;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1008994385
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		longValue = 325285951179383423L
	)
	long field3831;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = -8173247371373438233L
	)
	long field3802;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	PcmPlayer field3814;

	static {
		field3803 = null;
		field3808 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ldh;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class348());
		this.field3806 = 0;
		this.field3807 = new int[16];
		this.field3801 = new int[16];
		this.field3809 = new int[16];
		this.field3826 = 256;
		this.field3819 = 1000000;
		this.field3813 = new int[16];
		this.field3821 = new int[16];
		this.field3815 = new int[16];
		this.field3816 = new int[16];
		this.field3817 = new int[16];
		this.field3822 = new int[16];
		this.field3811 = new int[16];
		this.field3820 = new int[16];
		this.field3832 = new int[16];
		this.field3833 = new int[16];
		this.field3834 = new int[16];
		this.field3812 = new int[16];
		this.field3825 = new MusicPatchNode[16][128];
		this.field3823 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3814 = null;
		this.field3814 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method7152();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3814) {
			this.field3826 = var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "32"
	)
	public int method7132() {
		return this.field3826;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnp;Lpx;Ldm;I)Z",
		garbageValue = "-1058668883"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3814) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class350 var6 = (class350)var1.field3880.first(); var6 != null; var6 = (class350)var1.field3880.next()) {
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

				if (!var8.method7308(var3, var6.field3924)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3864.iterator();

						while (var18.hasNext()) {
							class107 var11 = (class107)var18.next();
							this.priorityQueue.add(new class341(var6.field3923, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	public void method7253() {
		if (this.priorityQueue != null) {
			if (field3803 != null) {
				field3803.set(true);
			}

			field3803 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3803;
			if (field3808 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3808 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class340(this));
			}

			field3808.submit(new class344(this, var1));
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-942204419"
	)
	public void method7134() {
		synchronized(this.field3814) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Ldy;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ap")
	protected int vmethod7328() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3819 * -727379968 / PcmPlayer.field1313;

			do {
				long var5 = (long)var3 * (long)var4 + this.field3831;
				if (this.field3802 - var5 >= 0L) {
					this.field3831 = var5;
					break;
				}

				int var7 = (int)((this.field3802 - this.field3831 + (long)var4 - 1L) / (long)var4);
				this.field3831 += (long)var7 * (long)var4;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method7249();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-401900641"
	)
	public void method7210() {
		synchronized(this.field3814) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.vmethod10593();
			}

		}
	}

	@ObfuscatedName("ag")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3819 * -727379968 / PcmPlayer.field1313;

			do {
				long var3 = this.field3831 + (long)var1 * (long)var2;
				if (this.field3802 - var3 >= 0L) {
					this.field3831 = var3;
					break;
				}

				int var5 = (int)(((long)var2 + (this.field3802 - this.field3831) - 1L) / (long)var2);
				this.field3831 += (long)var5 * (long)var2;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method7249();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnp;ZB)V",
		garbageValue = "1"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3814) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3824 = var2;
			this.field3831 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3802 = this.midiFile.method7269(this.trackLength);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1045924876"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3814) {
			this.midiFile.clear();
			this.method7152();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-846685095"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3814) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	public boolean method7198() {
		synchronized(this.field3814) {
			return this.musicPatches.method8661() > 0;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2001508676"
	)
	public void method7140(int var1, int var2) {
		synchronized(this.field3814) {
			this.method7141(var1, var2);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "66"
	)
	void method7141(int var1, int var2) {
		this.field3816[var1] = var2;
		this.field3822[var1] = var2 & -128;
		this.method7142(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "341535978"
	)
	void method7142(int var1, int var2) {
		if (var2 != this.field3817[var1]) {
			this.field3817[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3823[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "31936"
	)
	void method7219(int var1, int var2, int var3) {
		this.method7200(var1, var2, 64);
		if ((this.field3807[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3882 == var1 && var4.field3902 < 0) {
					this.field3825[var1][var4.field3887] = null;
					this.field3825[var1][var2] = var4;
					int var8 = (var4.field3888 * var4.field3881 >> 12) + var4.field3883;
					var4.field3883 += var2 - var4.field3887 << 8;
					var4.field3881 = var8 - var4.field3883;
					var4.field3888 = 4096;
					var4.field3887 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3817[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method3305();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3882 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3885 = var9.field3861[var2];
					var6.field3886 = var9.field3863[var2];
					var6.field3887 = var2;
					var6.field3890 = var3 * var3 * var9.field3860[var2] * var9.field3862 + 1024 >> 11;
					var6.field3891 = var9.field3866[var2] & 255;
					var6.field3883 = (var2 << 8) - (var9.field3859[var2] & 32767);
					var6.field3892 = 0;
					var6.field3894 = 0;
					var6.field3895 = 0;
					var6.field3902 = -1;
					var6.field3893 = 0;
					if (this.field3801[var1] == 0) {
						var6.stream = RawPcmStream.method3108(var5, this.method7211(var6), this.method7158(var6), this.method7159(var6));
					} else {
						var6.stream = RawPcmStream.method3108(var5, this.method7211(var6), 0, this.method7159(var6));
						this.method7165(var6, var9.field3859[var2] < 0);
					}

					if (var9.field3859[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3886 >= 0) {
						MusicPatchNode var7 = this.field3823[var1][var6.field3886];
						if (var7 != null && var7.field3902 < 0) {
							this.field3825[var1][var7.field3887] = null;
							var7.field3902 = 0;
						}

						this.field3823[var1][var6.field3886] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3825[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnk;ZB)V",
		garbageValue = "5"
	)
	void method7165(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1300) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3801[var1.field3882] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method3136();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3801[var1.field3882] >> 6);
		}

		var1.stream.method3135(var4);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1032096363"
	)
	void method7200(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3825[var1][var2];
		if (var4 != null) {
			this.field3825[var1][var2] = null;
			if ((this.field3807[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var5.field3882 == var4.field3882 && var5.field3902 < 0 && var4 != var5) {
						var4.field3902 = 0;
						break;
					}
				}
			} else {
				var4.field3902 = 0;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
	)
	void method7146(int var1, int var2, int var3) {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1527879494"
	)
	void method7147(int var1, int var2) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "708098708"
	)
	void method7217(int var1, int var2) {
		this.field3811[var1] = var2;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1355376476"
	)
	void method7149(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3882 == var1) {
				if (var2.stream != null) {
					var2.stream.method3173(PcmPlayer.field1313 / 100);
					if (var2.stream.method3144()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method7349();
				}

				if (var2.field3902 < 0) {
					this.field3825[var2.field3882][var2.field3887] = null;
				}

				var2.vmethod10593();
			}
		}

	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-911014404"
	)
	void method7191(int var1) {
		if (var1 >= 0) {
			this.field3813[var1] = 12800;
			this.field3821[var1] = 8192;
			this.field3815[var1] = 16383;
			this.field3811[var1] = 8192;
			this.field3820[var1] = 0;
			this.field3832[var1] = 8192;
			this.method7153(var1);
			this.method7184(var1);
			this.field3807[var1] = 0;
			this.field3833[var1] = 32767;
			this.field3834[var1] = 256;
			this.field3801[var1] = 0;
			this.method7156(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method7191(var1);
			}

		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1735642010"
	)
	void method7144(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3882 == var1) && var2.field3902 < 0) {
				this.field3825[var2.field3882][var2.field3887] = null;
				var2.field3902 = 0;
			}
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	void method7152() {
		this.method7149(-1);
		this.method7191(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3817[var1] = this.field3816[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3822[var1] = this.field3816[var1] & -128;
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1489190283"
	)
	void method7153(int var1) {
		if ((this.field3807[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3882 == var1 && this.field3825[var1][var2.field3887] == null && var2.field3902 < 0) {
					var2.field3902 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-2"
	)
	void method7184(int var1) {
		if ((this.field3807[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3882 == var1) {
					var2.field3884 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "30139"
	)
	void method7250(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7200(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method7219(var3, var4, var5);
			} else {
				this.method7200(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7146(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3822[var3] = (var5 << 14) + (this.field3822[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3822[var3] = (var5 << 7) + (this.field3822[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3820[var3] = (var5 << 7) + (this.field3820[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3820[var3] = var5 + (this.field3820[var3] & -128);
			}

			if (var4 == 5) {
				this.field3832[var3] = (var5 << 7) + (this.field3832[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3832[var3] = var5 + (this.field3832[var3] & -128);
			}

			if (var4 == 7) {
				this.field3813[var3] = (var5 << 7) + (this.field3813[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3813[var3] = var5 + (this.field3813[var3] & -128);
			}

			if (var4 == 10) {
				this.field3821[var3] = (var5 << 7) + (this.field3821[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3821[var3] = var5 + (this.field3821[var3] & -128);
			}

			if (var4 == 11) {
				this.field3815[var3] = (var5 << 7) + (this.field3815[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3815[var3] = var5 + (this.field3815[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3807;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3807;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3807;
					var10000[var3] |= 2;
				} else {
					this.method7153(var3);
					var10000 = this.field3807;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3833[var3] = (var5 << 7) + (this.field3833[var3] & 127);
			}

			if (var4 == 98) {
				this.field3833[var3] = (this.field3833[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3833[var3] = (var5 << 7) + (this.field3833[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3833[var3] = (this.field3833[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method7149(var3);
			}

			if (var4 == 121) {
				this.method7191(var3);
			}

			if (var4 == 123) {
				this.method7144(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3833[var3];
				if (var6 == 16384) {
					this.field3834[var3] = (var5 << 7) + (this.field3834[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3833[var3];
				if (var6 == 16384) {
					this.field3834[var3] = var5 + (this.field3834[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3801[var3] = (var5 << 7) + (this.field3801[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3801[var3] = var5 + (this.field3801[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3807;
					var10000[var3] |= 4;
				} else {
					this.method7184(var3);
					var10000 = this.field3807;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method7156(var3, (var5 << 7) + (this.field3812[var3] & -16257));
			}

			if (var4 == 49) {
				this.method7156(var3, var5 + (this.field3812[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7142(var3, var4 + this.field3822[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7147(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method7217(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method7152();
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1208347038"
	)
	void method7156(int var1, int var2) {
		this.field3812[var1] = var2;
		this.field3809[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)I",
		garbageValue = "756597994"
	)
	int method7211(MusicPatchNode var1) {
		int var2 = (var1.field3881 * var1.field3888 >> 12) + var1.field3883;
		var2 += (this.field3811[var1.field3882] - 8192) * this.field3834[var1.field3882] >> 12;
		MusicPatchNode2 var3 = var1.field3885;
		int var4;
		if (var3.field3785 > 0 && (var3.field3778 > 0 || this.field3820[var1.field3882] > 0)) {
			var4 = var3.field3778 << 2;
			int var5 = var3.field3784 << 1;
			if (var1.field3898 < var5) {
				var4 = var4 * var1.field3898 / var5;
			}

			var4 += this.field3820[var1.field3882] >> 7;
			double var6 = Math.sin((double)(var1.field3899 & 511) * 0.01227184630308513D);
			var2 += (int)((double)var4 * var6);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field1313 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)I",
		garbageValue = "-2144475196"
	)
	int method7158(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3885;
		int var3 = this.field3815[var1.field3882] * this.field3813[var1.field3882] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3890 + 16384 >> 15;
		var3 = var3 * this.field3826 + 128 >> 8;
		if (var2.field3781 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)var1.field3892 * (double)var2.field3781) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3786 != null) {
			var4 = var1.field3894;
			var5 = var2.field3786[var1.field3895 * 4 + 1];
			if (var1.field3895 * 4 < var2.field3786.length - 2) {
				var6 = (var2.field3786[var1.field3895 * 4] & 255) << 8;
				var7 = (var2.field3786[var1.field3895 * 4 + 2] & 255) << 8;
				var5 += (var2.field3786[var1.field3895 * 4 + 3] - var5) * (var4 - var6) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3902 > 0 && var2.field3779 != null) {
			var4 = var1.field3902;
			var5 = var2.field3779[var1.field3893 * 2 + 1];
			if (var1.field3893 * 2 < var2.field3779.length - 2) {
				var6 = (var2.field3779[var1.field3893 * 2] & 255) << 8;
				var7 = (var2.field3779[var1.field3893 * 2 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3779[var1.field3893 * 2 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)I",
		garbageValue = "1466427027"
	)
	int method7159(MusicPatchNode var1) {
		int var2 = this.field3821[var1.field3882];
		return var2 < 8192 ? var2 * var1.field3891 + 32 >> 6 : 16384 - ((128 - var1.field3891) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	void method7249() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3802; var2 == this.trackLength; var3 = this.midiFile.method7269(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3824 || var2 == 0) {
							this.method7152();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method7250(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3802 = var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)Z",
		garbageValue = "1"
	)
	boolean method7166(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3902 >= 0) {
				var1.vmethod10593();
				if (var1.field3886 > 0 && var1 == this.field3823[var1.field3882][var1.field3886]) {
					this.field3823[var1.field3882][var1.field3886] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnk;[IIII)Z",
		garbageValue = "-1553705520"
	)
	boolean method7167(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3901 = PcmPlayer.field1313 / 100;
		if (var1.field3902 < 0 || var1.stream != null && !var1.stream.method3143()) {
			int var5 = var1.field3888;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3832[var1.field3882] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3888 = var5;
			}

			var1.stream.method3145(this.method7211(var1));
			MusicPatchNode2 var6 = var1.field3885;
			boolean var7 = false;
			++var1.field3898;
			var1.field3899 += var6.field3785;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3887 - 60 << 8) + (var1.field3888 * var1.field3881 >> 12));
			if (var6.field3781 > 0) {
				if (var6.field3783 > 0) {
					var1.field3892 = var1.field3892 * 240926720 + (int)(128.0D * Math.pow(2.0D, (double)var6.field3783 * var8) + 0.5D) * 240926720;
				} else {
					var1.field3892 = var1.field3892 * 240926720 + 773849088;
				}
			}

			if (var6.field3786 != null) {
				if (var6.field3782 > 0) {
					var1.field3894 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3782 * var8) + 0.5D);
				} else {
					var1.field3894 += 128;
				}

				while (var1.field3895 * 4 < var6.field3786.length - 2 && var1.field3894 > (var6.field3786[var1.field3895 * 4 + 2] & 255) << 8) {
					var1.field3895 = var1.field3895 * 4 + 2;
				}

				if (var1.field3895 * 4 == var6.field3786.length - 2 && var6.field3786[var1.field3895 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3902 >= 0 && var6.field3779 != null && (this.field3807[var1.field3882] & 1) == 0 && (var1.field3886 < 0 || var1 != this.field3823[var1.field3882][var1.field3886])) {
				if (var6.field3780 > 0) {
					var1.field3902 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3780 * var8) + 0.5D);
				} else {
					var1.field3902 += 128;
				}

				while (var1.field3893 * 2 < var6.field3779.length - 2 && var1.field3902 > (var6.field3779[var1.field3893 * 2 + 2] & 255) << 8) {
					var1.field3893 = var1.field3893 * 4 + 4;
				}

				if (var1.field3893 * 2 == var6.field3779.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method3173(var1.field3901);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method3144()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method7349();
				if (var1.field3902 >= 0) {
					var1.vmethod10593();
					if (var1.field3886 > 0 && var1 == this.field3823[var1.field3882][var1.field3886]) {
						this.field3823[var1.field3882][var1.field3886] = null;
					}
				}

				return true;
			} else {
				var1.stream.method3139(var1.field3901, this.method7158(var1), this.method7159(var1));
				return false;
			}
		} else {
			var1.method7349();
			var1.vmethod10593();
			if (var1.field3886 > 0 && var1 == this.field3823[var1.field3882][var1.field3886]) {
				this.field3823[var1.field3882][var1.field3886] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-72"
	)
	static void method7145(int var0) {
		PacketBufferNode var1 = class291.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByteAdd(var0);
		Client.packetWriter.addNode(var1);
	}
}
