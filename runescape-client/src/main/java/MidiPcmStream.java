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

@ObfuscatedName("nf")
@Implements("MidiPcmStream")
public class MidiPcmStream extends PcmStream {
	@ObfuscatedName("ac")
	static AtomicBoolean field3901;
	@ObfuscatedName("ap")
	static ThreadPoolExecutor field3902;
	@ObfuscatedName("aq")
	@Export("priorityQueue")
	PriorityQueue priorityQueue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1703331115
	)
	public int field3904;
	@ObfuscatedName("as")
	int[] field3905;
	@ObfuscatedName("al")
	int[] field3928;
	@ObfuscatedName("au")
	int[] field3907;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("musicPatches")
	NodeHashTable musicPatches;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 314987467
	)
	int field3909;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1674444992
	)
	int field3910;
	@ObfuscatedName("an")
	int[] field3911;
	@ObfuscatedName("ar")
	int[] field3912;
	@ObfuscatedName("ae")
	int[] field3913;
	@ObfuscatedName("ay")
	int[] field3915;
	@ObfuscatedName("ad")
	int[] field3918;
	@ObfuscatedName("ag")
	int[] field3932;
	@ObfuscatedName("av")
	int[] field3917;
	@ObfuscatedName("aj")
	int[] field3916;
	@ObfuscatedName("az")
	int[] field3919;
	@ObfuscatedName("bt")
	int[] field3903;
	@ObfuscatedName("bs")
	int[] field3921;
	@ObfuscatedName("bu")
	int[] field3899;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "[[Lno;"
	)
	MusicPatchNode[][] field3923;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[[Lno;"
	)
	MusicPatchNode[][] field3924;
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("midiFile")
	MidiFileReader midiFile;
	@ObfuscatedName("bb")
	boolean field3926;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1893224925
	)
	@Export("track")
	int track;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 462174701
	)
	@Export("trackLength")
	int trackLength;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		longValue = -4864531112715276351L
	)
	long field3929;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		longValue = 824042094631362299L
	)
	long field3930;
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("patchStream")
	MusicPatchPcmStream patchStream;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	PcmPlayer field3922;

	static {
		field3901 = null;
		field3902 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Ldn;)V"
	)
	public MidiPcmStream(PcmPlayer var1) {
		this.priorityQueue = new PriorityQueue(5, new class350());
		this.field3904 = 0;
		this.field3905 = new int[16];
		this.field3928 = new int[16];
		this.field3907 = new int[16];
		this.field3909 = 256;
		this.field3910 = -727379968;
		this.field3911 = new int[16];
		this.field3912 = new int[16];
		this.field3913 = new int[16];
		this.field3915 = new int[16];
		this.field3918 = new int[16];
		this.field3932 = new int[16];
		this.field3917 = new int[16];
		this.field3916 = new int[16];
		this.field3919 = new int[16];
		this.field3903 = new int[16];
		this.field3921 = new int[16];
		this.field3899 = new int[16];
		this.field3923 = new MusicPatchNode[16][128];
		this.field3924 = new MusicPatchNode[16][128];
		this.midiFile = new MidiFileReader();
		this.patchStream = new MusicPatchPcmStream(this);
		this.field3922 = null;
		this.field3922 = var1;
		this.musicPatches = new NodeHashTable(128);
		this.method7160();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1120083259"
	)
	@Export("setPcmStreamVolume")
	public void setPcmStreamVolume(int var1) {
		synchronized(this.field3922) {
			this.field3909 = var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-707345293"
	)
	public int method7139() {
		return this.field3909;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lpx;Ldi;I)Z",
		garbageValue = "1391388824"
	)
	@Export("updateExternalPlayer")
	public boolean updateExternalPlayer(MusicTrack var1, AbstractArchive var2, SoundCache var3) {
		synchronized(this.field3922) {
			boolean var5 = true;
			synchronized(this.priorityQueue) {
				this.priorityQueue.clear();
			}

			for (class352 var6 = (class352)var1.field3974.first(); var6 != null; var6 = (class352)var1.field3974.next()) {
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

				if (!var8.method7328(var3, var6.field4015)) {
					var5 = false;
				} else if (this.priorityQueue != null) {
					synchronized(this.priorityQueue) {
						Iterator var18 = var8.field3960.iterator();

						while (var18.hasNext()) {
							class108 var11 = (class108)var18.next();
							this.priorityQueue.add(new class343(var6.field4016, var11));
						}
					}
				}
			}

			return var5;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1062731611"
	)
	public void method7141() {
		if (this.priorityQueue != null) {
			if (field3901 != null) {
				field3901.set(true);
			}

			field3901 = new AtomicBoolean(false);
			AtomicBoolean var1 = field3901;
			if (field3902 == null) {
				int var2 = Runtime.getRuntime().availableProcessors();
				field3902 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class342(this));
			}

			field3902.submit(new class346(this, var1));
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public void method7142() {
		synchronized(this.field3922) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2._remove();
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return this.patchStream;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lef;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("as")
	protected int vmethod7364() {
		return 0;
	}

	@ObfuscatedName("al")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		if (this.midiFile.isReady()) {
			int var4 = this.midiFile.division * this.field3910 * 1000000 / PcmPlayer.field1356;

			do {
				long var5 = this.field3929 + (long)var3 * (long)var4;
				if (this.field3930 - var5 >= 0L) {
					this.field3929 = var5;
					break;
				}

				int var7 = (int)((this.field3930 - this.field3929 + (long)var4 - 1L) / (long)var4);
				this.field3929 += (long)var4 * (long)var7;
				this.patchStream.fill(var1, var2, var7);
				var2 += var7;
				var3 -= var7;
				this.method7173();
			} while(this.midiFile.isReady());
		}

		this.patchStream.fill(var1, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2065382915"
	)
	public void method7143() {
		synchronized(this.field3922) {
			for (MusicPatch var2 = (MusicPatch)this.musicPatches.first(); var2 != null; var2 = (MusicPatch)this.musicPatches.next()) {
				var2.remove();
			}

		}
	}

	@ObfuscatedName("ai")
	@Export("skip")
	protected void skip(int var1) {
		if (this.midiFile.isReady()) {
			int var2 = this.midiFile.division * this.field3910 * 1000000 / PcmPlayer.field1356;

			do {
				long var3 = this.field3929 + (long)var2 * (long)var1;
				if (this.field3930 - var3 >= 0L) {
					this.field3929 = var3;
					break;
				}

				int var5 = (int)((this.field3930 - this.field3929 + (long)var2 - 1L) / (long)var2);
				this.field3929 += (long)var2 * (long)var5;
				this.patchStream.skip(var5);
				var1 -= var5;
				this.method7173();
			} while(this.midiFile.isReady());
		}

		this.patchStream.skip(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnd;ZI)V",
		garbageValue = "-1784035838"
	)
	@Export("setMusicTrack")
	public void setMusicTrack(MusicTrack var1, boolean var2) {
		synchronized(this.field3922) {
			this.clear();
			this.midiFile.parse(var1.midi);
			this.field3926 = var2;
			this.field3929 = 0L;
			int var4 = this.midiFile.trackCount();

			for (int var5 = 0; var5 < var4; ++var5) {
				this.midiFile.gotoTrack(var5);
				this.midiFile.readTrackLength(var5);
				this.midiFile.markTrackPosition(var5);
			}

			this.track = this.midiFile.getPrioritizedTrack();
			this.trackLength = this.midiFile.trackLengths[this.track];
			this.field3930 = this.midiFile.method7280(this.trackLength);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1387583930"
	)
	@Export("clear")
	public void clear() {
		synchronized(this.field3922) {
			this.midiFile.clear();
			this.method7160();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "9"
	)
	@Export("isReady")
	public boolean isReady() {
		synchronized(this.field3922) {
			return this.midiFile.isReady();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-935259538"
	)
	public boolean method7256() {
		synchronized(this.field3922) {
			return this.musicPatches.method8624() > 0;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1191341735"
	)
	public void method7152(int var1, int var2) {
		synchronized(this.field3922) {
			this.method7149(var1, var2);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "31"
	)
	void method7149(int var1, int var2) {
		this.field3915[var1] = var2;
		this.field3932[var1] = var2 & -128;
		this.method7211(var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "103"
	)
	void method7211(int var1, int var2) {
		if (var2 != this.field3918[var1]) {
			this.field3918[var1] = var2;

			for (int var3 = 0; var3 < 128; ++var3) {
				this.field3924[var1][var3] = null;
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1930393555"
	)
	void method7151(int var1, int var2, int var3) {
		this.method7153(var1, var2, 64);
		if ((this.field3905[var1] & 2) != 0) {
			for (MusicPatchNode var4 = (MusicPatchNode)this.patchStream.queue.first(); var4 != null; var4 = (MusicPatchNode)this.patchStream.queue.next()) {
				if (var4.field3976 == var1 && var4.field3988 < 0) {
					this.field3923[var1][var4.field3981] = null;
					this.field3923[var1][var2] = var4;
					int var8 = (var4.field3985 * var4.field3986 >> 12) + var4.field3984;
					var4.field3984 += var2 - var4.field3981 << 8;
					var4.field3985 = var8 - var4.field3984;
					var4.field3986 = 4096;
					var4.field3981 = var2;
					return;
				}
			}
		}

		MusicPatch var9 = (MusicPatch)this.musicPatches.get((long)this.field3918[var1]);
		if (var9 != null) {
			if (var9.rawSounds[var2] != null) {
				RawSound var5 = var9.rawSounds[var2].method3372();
				if (var5 != null) {
					MusicPatchNode var6 = new MusicPatchNode();
					var6.field3976 = var1;
					var6.table = var9;
					var6.rawSound = var5;
					var6.field3990 = var9.field3963[var2];
					var6.field3980 = var9.field3954[var2];
					var6.field3981 = var2;
					var6.field3982 = var3 * var3 * var9.field3956[var2] * var9.field3958 + 1024 >> 11;
					var6.field3983 = var9.field3957[var2] & 255;
					var6.field3984 = (var2 << 8) - (var9.field3959[var2] & 32767);
					var6.field3987 = 0;
					var6.field3993 = 0;
					var6.field3975 = 0;
					var6.field3988 = -1;
					var6.field3997 = 0;
					if (this.field3928[var1] == 0) {
						var6.stream = RawPcmStream.method3154(var5, this.method7165(var6), this.method7181(var6), this.method7166(var6));
					} else {
						var6.stream = RawPcmStream.method3154(var5, this.method7165(var6), 0, this.method7166(var6));
						this.method7164(var6, var9.field3959[var2] < 0);
					}

					if (var9.field3959[var2] < 0) {
						var6.stream.setNumLoops(-1);
					}

					if (var6.field3980 >= 0) {
						MusicPatchNode var7 = this.field3924[var1][var6.field3980];
						if (var7 != null && var7.field3988 < 0) {
							this.field3923[var1][var7.field3981] = null;
							var7.field3988 = 0;
						}

						this.field3924[var1][var6.field3980] = var6;
					}

					this.patchStream.queue.addFirst(var6);
					this.field3923[var1][var2] = var6;
				}
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lno;ZB)V",
		garbageValue = "1"
	)
	void method7164(MusicPatchNode var1, boolean var2) {
		int var3 = var1.rawSound.samples.length;
		int var4;
		if (var2 && var1.rawSound.field1321) {
			int var5 = var3 + var3 - var1.rawSound.start;
			var4 = (int)((long)this.field3928[var1.field3976] * (long)var5 >> 6);
			var3 <<= 8;
			if (var4 >= var3) {
				var4 = var3 + var3 - 1 - var4;
				var1.stream.method3182();
			}
		} else {
			var4 = (int)((long)var3 * (long)this.field3928[var1.field3976] >> 6);
		}

		var1.stream.method3158(var4);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "-29136"
	)
	void method7153(int var1, int var2, int var3) {
		MusicPatchNode var4 = this.field3923[var1][var2];
		if (var4 != null) {
			this.field3923[var1][var2] = null;
			if ((this.field3905[var1] & 2) != 0) {
				for (MusicPatchNode var5 = (MusicPatchNode)this.patchStream.queue.last(); var5 != null; var5 = (MusicPatchNode)this.patchStream.queue.previous()) {
					if (var4.field3976 == var5.field3976 && var5.field3988 < 0 && var4 != var5) {
						var4.field3988 = 0;
						break;
					}
				}
			} else {
				var4.field3988 = 0;
			}

		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1426822610"
	)
	void method7154(int var1, int var2, int var3) {
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "15"
	)
	void method7159(int var1, int var2) {
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-89422705"
	)
	void method7156(int var1, int var2) {
		this.field3917[var1] = var2;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1942908355"
	)
	void method7216(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if (var1 < 0 || var2.field3976 == var1) {
				if (var2.stream != null) {
					var2.stream.method3186(PcmPlayer.field1356 / 100);
					if (var2.stream.method3190()) {
						this.patchStream.mixer.addSubStream(var2.stream);
					}

					var2.method7374();
				}

				if (var2.field3988 < 0) {
					this.field3923[var2.field3976][var2.field3981] = null;
				}

				var2.remove();
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "141903483"
	)
	void method7237(int var1) {
		if (var1 >= 0) {
			this.field3911[var1] = 12800;
			this.field3912[var1] = 8192;
			this.field3913[var1] = 16383;
			this.field3917[var1] = 8192;
			this.field3916[var1] = 0;
			this.field3919[var1] = 8192;
			this.method7161(var1);
			this.method7162(var1);
			this.field3905[var1] = 0;
			this.field3903[var1] = 32767;
			this.field3921[var1] = 256;
			this.field3928[var1] = 0;
			this.method7239(var1, 8192);
		} else {
			for (var1 = 0; var1 < 16; ++var1) {
				this.method7237(var1);
			}

		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "78"
	)
	void method7138(int var1) {
		for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
			if ((var1 < 0 || var2.field3976 == var1) && var2.field3988 < 0) {
				this.field3923[var2.field3976][var2.field3981] = null;
				var2.field3988 = 0;
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	void method7160() {
		this.method7216(-1);
		this.method7237(-1);

		int var1;
		for (var1 = 0; var1 < 16; ++var1) {
			this.field3918[var1] = this.field3915[var1];
		}

		for (var1 = 0; var1 < 16; ++var1) {
			this.field3932[var1] = this.field3915[var1] & -128;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2051684406"
	)
	void method7161(int var1) {
		if ((this.field3905[var1] & 2) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3976 == var1 && this.field3923[var1][var2.field3981] == null && var2.field3988 < 0) {
					var2.field3988 = 0;
				}
			}
		}

	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "542873607"
	)
	void method7162(int var1) {
		if ((this.field3905[var1] & 4) != 0) {
			for (MusicPatchNode var2 = (MusicPatchNode)this.patchStream.queue.last(); var2 != null; var2 = (MusicPatchNode)this.patchStream.queue.previous()) {
				if (var2.field3976 == var1) {
					var2.field3996 = 0;
				}
			}
		}

	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method7266(int var1) {
		int var2 = var1 & 240;
		int var3;
		int var4;
		int var5;
		if (var2 == 128) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7153(var3, var4, var5);
		} else if (var2 == 144) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var5 > 0) {
				this.method7151(var3, var4, var5);
			} else {
				this.method7153(var3, var4, 64);
			}

		} else if (var2 == 160) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			this.method7154(var3, var4, var5);
		} else if (var2 == 176) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			var5 = var1 >> 16 & 127;
			if (var4 == 0) {
				this.field3932[var3] = (var5 << 14) + (this.field3932[var3] & -2080769);
			}

			if (var4 == 32) {
				this.field3932[var3] = (var5 << 7) + (this.field3932[var3] & -16257);
			}

			if (var4 == 1) {
				this.field3916[var3] = (var5 << 7) + (this.field3916[var3] & -16257);
			}

			if (var4 == 33) {
				this.field3916[var3] = var5 + (this.field3916[var3] & -128);
			}

			if (var4 == 5) {
				this.field3919[var3] = (var5 << 7) + (this.field3919[var3] & -16257);
			}

			if (var4 == 37) {
				this.field3919[var3] = var5 + (this.field3919[var3] & -128);
			}

			if (var4 == 7) {
				this.field3911[var3] = (var5 << 7) + (this.field3911[var3] & -16257);
			}

			if (var4 == 39) {
				this.field3911[var3] = var5 + (this.field3911[var3] & -128);
			}

			if (var4 == 10) {
				this.field3912[var3] = (var5 << 7) + (this.field3912[var3] & -16257);
			}

			if (var4 == 42) {
				this.field3912[var3] = var5 + (this.field3912[var3] & -128);
			}

			if (var4 == 11) {
				this.field3913[var3] = (var5 << 7) + (this.field3913[var3] & -16257);
			}

			if (var4 == 43) {
				this.field3913[var3] = var5 + (this.field3913[var3] & -128);
			}

			int[] var10000;
			if (var4 == 64) {
				if (var5 >= 64) {
					var10000 = this.field3905;
					var10000[var3] |= 1;
				} else {
					var10000 = this.field3905;
					var10000[var3] &= -2;
				}
			}

			if (var4 == 65) {
				if (var5 >= 64) {
					var10000 = this.field3905;
					var10000[var3] |= 2;
				} else {
					this.method7161(var3);
					var10000 = this.field3905;
					var10000[var3] &= -3;
				}
			}

			if (var4 == 99) {
				this.field3903[var3] = (var5 << 7) + (this.field3903[var3] & 127);
			}

			if (var4 == 98) {
				this.field3903[var3] = (this.field3903[var3] & 16256) + var5;
			}

			if (var4 == 101) {
				this.field3903[var3] = (var5 << 7) + (this.field3903[var3] & 127) + 16384;
			}

			if (var4 == 100) {
				this.field3903[var3] = (this.field3903[var3] & 16256) + var5 + 16384;
			}

			if (var4 == 120) {
				this.method7216(var3);
			}

			if (var4 == 121) {
				this.method7237(var3);
			}

			if (var4 == 123) {
				this.method7138(var3);
			}

			int var6;
			if (var4 == 6) {
				var6 = this.field3903[var3];
				if (var6 == 16384) {
					this.field3921[var3] = (var5 << 7) + (this.field3921[var3] & -16257);
				}
			}

			if (var4 == 38) {
				var6 = this.field3903[var3];
				if (var6 == 16384) {
					this.field3921[var3] = var5 + (this.field3921[var3] & -128);
				}
			}

			if (var4 == 16) {
				this.field3928[var3] = (var5 << 7) + (this.field3928[var3] & -16257);
			}

			if (var4 == 48) {
				this.field3928[var3] = var5 + (this.field3928[var3] & -128);
			}

			if (var4 == 81) {
				if (var5 >= 64) {
					var10000 = this.field3905;
					var10000[var3] |= 4;
				} else {
					this.method7162(var3);
					var10000 = this.field3905;
					var10000[var3] &= -5;
				}
			}

			if (var4 == 17) {
				this.method7239(var3, (var5 << 7) + (this.field3899[var3] & -16257));
			}

			if (var4 == 49) {
				this.method7239(var3, var5 + (this.field3899[var3] & -128));
			}

		} else if (var2 == 192) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7211(var3, var4 + this.field3932[var3]);
		} else if (var2 == 208) {
			var3 = var1 & 15;
			var4 = var1 >> 8 & 127;
			this.method7159(var3, var4);
		} else if (var2 == 224) {
			var3 = var1 & 15;
			var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
			this.method7156(var3, var4);
		} else {
			var2 = var1 & 255;
			if (var2 == 255) {
				this.method7160();
			}
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-843805596"
	)
	void method7239(int var1, int var2) {
		this.field3899[var1] = var2;
		this.field3907[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lno;B)I",
		garbageValue = "-23"
	)
	int method7165(MusicPatchNode var1) {
		int var2 = (var1.field3985 * var1.field3986 >> 12) + var1.field3984;
		var2 += (this.field3917[var1.field3976] - 8192) * this.field3921[var1.field3976] >> 12;
		MusicPatchNode2 var3 = var1.field3990;
		int var4;
		if (var3.field3886 > 0 && (var3.field3884 > 0 || this.field3916[var1.field3976] > 0)) {
			var4 = var3.field3884 << 2;
			int var5 = var3.field3885 << 1;
			if (var1.field3992 < var5) {
				var4 = var4 * var1.field3992 / var5;
			}

			var4 += this.field3916[var1.field3976] >> 7;
			double var6 = Math.sin(0.01227184630308513D * (double)(var1.field3989 & 511));
			var2 += (int)(var6 * (double)var4);
		}

		var4 = (int)((double)(var1.rawSound.sampleRate * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)PcmPlayer.field1356 + 0.5D);
		return var4 < 1 ? 1 : var4;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)I",
		garbageValue = "-1618965207"
	)
	int method7181(MusicPatchNode var1) {
		MusicPatchNode2 var2 = var1.field3990;
		int var3 = this.field3913[var1.field3976] * this.field3911[var1.field3976] + 4096 >> 13;
		var3 = var3 * var3 + 16384 >> 15;
		var3 = var3 * var1.field3982 + 16384 >> 15;
		var3 = var3 * this.field3909 + 128 >> 8;
		if (var2.field3880 > 0) {
			var3 = (int)((double)var3 * Math.pow(0.5D, (double)var2.field3880 * 1.953125E-5D * (double)var1.field3987) + 0.5D);
		}

		int var4;
		int var5;
		int var6;
		int var7;
		if (var2.field3878 != null) {
			var4 = var1.field3993;
			var5 = var2.field3878[var1.field3975 * 4 + 1];
			if (var1.field3975 * 4 < var2.field3878.length - 2) {
				var6 = (var2.field3878[var1.field3975 * 4] & 255) << 8;
				var7 = (var2.field3878[var1.field3975 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3878[var1.field3975 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var3 * var5 + 32 >> 6;
		}

		if (var1.field3988 > 0 && var2.field3879 != null) {
			var4 = var1.field3988;
			var5 = var2.field3879[var1.field3997 * 4 + 1];
			if (var1.field3997 * 4 < var2.field3879.length - 2) {
				var6 = (var2.field3879[var1.field3997 * 4] & 255) << 8;
				var7 = (var2.field3879[var1.field3997 * 4 + 2] & 255) << 8;
				var5 += (var4 - var6) * (var2.field3879[var1.field3997 * 4 + 3] - var5) / (var7 - var6);
			}

			var3 = var5 * var3 + 32 >> 6;
		}

		return var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lno;B)I",
		garbageValue = "-41"
	)
	int method7166(MusicPatchNode var1) {
		int var2 = this.field3912[var1.field3976];
		return var2 < 8192 ? var2 * var1.field3983 + 32 >> 6 : 16384 - ((128 - var1.field3983) * (16384 - var2) + 32 >> 6);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2000941618"
	)
	void method7173() {
		int var1 = this.track;
		int var2 = this.trackLength;

		long var3;
		for (var3 = this.field3930; var2 == this.trackLength; var3 = this.midiFile.method7280(var2)) {
			while (var2 == this.midiFile.trackLengths[var1]) {
				this.midiFile.gotoTrack(var1);
				int var5 = this.midiFile.readMessage(var1);
				if (var5 == 1) {
					this.midiFile.setTrackDone();
					this.midiFile.markTrackPosition(var1);
					if (this.midiFile.isDone()) {
						if (!this.field3926 || var2 == 0) {
							this.method7160();
							this.midiFile.clear();
							return;
						}

						this.midiFile.reset(var3);
					}
					break;
				}

				if ((var5 & 128) != 0) {
					this.method7266(var5);
				}

				this.midiFile.readTrackLength(var1);
				this.midiFile.markTrackPosition(var1);
			}

			var1 = this.midiFile.getPrioritizedTrack();
			var2 = this.midiFile.trackLengths[var1];
		}

		this.track = var1;
		this.trackLength = var2;
		this.field3930 = var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(Lno;I)Z",
		garbageValue = "-1529717605"
	)
	boolean method7226(MusicPatchNode var1) {
		if (var1.stream == null) {
			if (var1.field3988 >= 0) {
				var1.remove();
				if (var1.field3980 > 0 && var1 == this.field3924[var1.field3976][var1.field3980]) {
					this.field3924[var1.field3976][var1.field3980] = null;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(Lno;[IIIB)Z",
		garbageValue = "75"
	)
	boolean method7180(MusicPatchNode var1, int[] var2, int var3, int var4) {
		var1.field3995 = PcmPlayer.field1356 / 100;
		if (var1.field3988 < 0 || var1.stream != null && !var1.stream.method3189()) {
			int var5 = var1.field3986;
			if (var5 > 0) {
				var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.field3919[var1.field3976] * 4.921259842519685E-4D) + 0.5D);
				if (var5 < 0) {
					var5 = 0;
				}

				var1.field3986 = var5;
			}

			var1.stream.method3188(this.method7165(var1));
			MusicPatchNode2 var6 = var1.field3990;
			boolean var7 = false;
			++var1.field3992;
			var1.field3989 += var6.field3886;
			double var8 = 5.086263020833333E-6D * (double)((var1.field3981 - 60 << 8) + (var1.field3986 * var1.field3985 >> 12));
			if (var6.field3880 > 0) {
				if (var6.field3883 > 0) {
					var1.field3987 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3883 * var8) + 0.5D);
				} else {
					var1.field3987 += 128;
				}
			}

			if (var6.field3878 != null) {
				if (var6.field3881 > 0) {
					var1.field3993 += (int)(128.0D * Math.pow(2.0D, var8 * (double)var6.field3881) + 0.5D);
				} else {
					var1.field3993 += 128;
				}

				while (var1.field3975 * 4 < var6.field3878.length - 2 && var1.field3993 > (var6.field3878[var1.field3975 * 4 + 2] & 255) << 8) {
					var1.field3975 = var1.field3975 * 4 + 2;
				}

				if (var1.field3975 * 4 == var6.field3878.length - 2 && var6.field3878[var1.field3975 * 4 + 1] == 0) {
					var7 = true;
				}
			}

			if (var1.field3988 >= 0 && var6.field3879 != null && (this.field3905[var1.field3976] & 1) == 0 && (var1.field3980 < 0 || var1 != this.field3924[var1.field3976][var1.field3980])) {
				if (var6.field3882 > 0) {
					var1.field3988 += (int)(128.0D * Math.pow(2.0D, (double)var6.field3882 * var8) + 0.5D);
				} else {
					var1.field3988 += 128;
				}

				while (var1.field3997 * 4 < var6.field3879.length - 2 && var1.field3988 > (var6.field3879[var1.field3997 * 4 + 2] & 255) << 8) {
					var1.field3997 = var1.field3997 * 4 + 2;
				}

				if (var1.field3997 * 4 == var6.field3879.length - 2) {
					var7 = true;
				}
			}

			if (var7) {
				var1.stream.method3186(var1.field3995);
				if (var2 != null) {
					var1.stream.fill(var2, var3, var4);
				} else {
					var1.stream.skip(var4);
				}

				if (var1.stream.method3190()) {
					this.patchStream.mixer.addSubStream(var1.stream);
				}

				var1.method7374();
				if (var1.field3988 >= 0) {
					var1.remove();
					if (var1.field3980 > 0 && var1 == this.field3924[var1.field3976][var1.field3980]) {
						this.field3924[var1.field3976][var1.field3980] = null;
					}
				}

				return true;
			} else {
				var1.stream.method3185(var1.field3995, this.method7181(var1), this.method7166(var1));
				return false;
			}
		} else {
			var1.method7374();
			var1.remove();
			if (var1.field3980 > 0 && var1 == this.field3924[var1.field3976][var1.field3980]) {
				this.field3924[var1.field3976][var1.field3980] = null;
			}

			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "2099265524"
	)
	static int method7268(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIFFFI)F",
		garbageValue = "2040989654"
	)
	public static float method7167(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		float var11 = (float)((var6 - var7) * (var2 - var4) + (var5 - var7) * (var4 - var3));
		float var12 = (float)((var6 - var7) * (var0 - var4) + (var1 - var7) * (var4 - var3)) / var11;
		float var13 = (float)((var1 - var7) * (var2 - var4) + (var7 - var5) * (var0 - var4)) / var11;
		float var14 = 1.0F - var12 - var13;
		return var10 * var14 + var12 * var8 + var13 * var9;
	}
}
