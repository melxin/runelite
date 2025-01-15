import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ab")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("aw")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("at")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 444848075
	)
	@Export("clientRevision")
	int clientRevision;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.requestThread = new Thread(this);
		this.requestThread.setPriority(1);
		this.requestThread.start();
		this.clientRevision = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lem;I)V",
		garbageValue = "-1770364499"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "-1"
	)
	int method3156(URLConnection var1) {
		int var2 = UrlRequest.field1482;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-1586944327"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lem;I)V",
		garbageValue = "-1661714496"
	)
	void method3158(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = class326.method6472(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				class180.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1485 = this.method3156(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lem;",
		garbageValue = "-44"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.requestThread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.openConnection(var1);
			} catch (Exception var7) {
				ArchiveLoader.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1514522332"
	)
	public static void method3175(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class333.field3624.clear();
			class333.field3627.clear();
			MusicSong var7;
			if (var5) {
				class136.method3325();
			} else {
				for (int var6 = 0; var6 < class333.musicSongs.size(); ++var6) {
					var7 = (MusicSong)class333.musicSongs.get(var6);
					if (var7 == null) {
						class333.musicSongs.remove(var6);
						--var6;
					} else if (var7.field3735) {
						if (var7.midiPcmStream.field3667 > 0) {
							--var7.midiPcmStream.field3667;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6594();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class333.musicSongs.remove(var6);
						--var6;
					} else {
						var7.field3735 = true;
					}
				}
			}

			if (!var5) {
				class333.field3626.clear();
			}

			Iterator var12 = var0.iterator();

			while (var12.hasNext()) {
				var7 = (MusicSong)var12.next();
				if (var7.musicTrackGroupId != -1 && var7.musicTrackFileId != -1) {
					if (!var5) {
						class333.field3626.add(var7);
					}

					class333.field3624.add(var7);
				}
			}

			if (!class333.field3624.isEmpty()) {
				StructComposition.method4069(var1, var2, var3, var4);
				class333.field3627.add(new AddRequestTask((SongTask)null));
				class333.field3627.add(new class450((SongTask)null, class333.field3631, class333.field3623, class333.field3625));
				ArrayList var14 = new ArrayList();
				var14.add(new class445(new FadeInTask((SongTask)null, 0, true, class333.field3632)));
				if (!class333.musicSongs.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var14), class333.field3622));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class333.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var13.add(new DelayFadeTask(new FadeOutTask(new class443((SongTask)null, var9), 0, false, class333.field3630), class333.musicPlayerStatus));
					class333.field3627.add(new ConcurrentMidiTask((SongTask)null, var13));
				} else {
					class333.field3627.add(new DelayFadeTask((SongTask)null, class333.field3622));
					class333.field3627.add(new ConcurrentMidiTask((SongTask)null, var14));
				}

			}
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "([Lnp;IB)V",
		garbageValue = "-68"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !UserComparator3.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && UserComparator3.isComponentHidden(var3) && var3 != PcmPlayer.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (class379.widgetDefinition.loadInterface(var5)) {
							drawModelComponents(class379.widgetDefinition.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = Tile.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = HealthBarDefinition.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class178.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.getMayaAnimFrame();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								class178.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3918 != 0 && !var3.isIf3) {
						int var9 = var3.field3918 >> 16;
						var5 = var3.field3918 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class178.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
