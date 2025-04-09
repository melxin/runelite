import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("ao")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("an")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1740301353
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("af")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1674029401
	)
	@Export("position")
	int position;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2042826127
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("av")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.inputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-58"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) {
			return true;
		} else if (var1 > 0 && var1 < this.capacity) {
			synchronized(this) {
				int var3;
				if (this.position <= this.limit) {
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit;
				}

				if (var3 < var1) {
					if (this.exception != null) {
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll();
						return false;
					}
				} else {
					return true;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-284804473"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) {
			int var2;
			if (this.position <= this.limit) {
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit;
			}

			if (var2 <= 0 && this.exception != null) {
				throw new IOException(this.exception.toString());
			} else {
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16383"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) {
			if (this.position == this.limit) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					return -1;
				}
			} else {
				int var2 = this.buffer[this.position] & 255;
				this.position = (this.position + 1) % this.capacity;
				this.notifyAll();
				return var2;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "108"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				int var5;
				if (this.position <= this.limit) {
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit;
				}

				if (var3 > var5) {
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) {
						System.arraycopy(this.buffer, this.position, var1, var2, var3);
					} else {
						int var6 = this.capacity - this.position;
						System.arraycopy(this.buffer, this.position, var1, var2, var6);
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6);
					}

					this.position = (var3 + this.position) % this.capacity;
					this.notifyAll();
					return var3;
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2039107686"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			if (this.exception == null) {
				this.exception = new IOException("");
			}

			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		while (true) {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position == 0) {
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) {
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var10) {
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1);
				if (var7 == -1) {
					throw new EOFException();
				}
			} catch (IOException var11) {
				IOException var3 = var11;
				synchronized(this) {
					this.exception = var3;
					return;
				}
			}

			synchronized(this) {
				this.limit = (var7 + this.limit) % this.capacity;
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1382957471"
	)
	static final void method9490(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class137.field1641 || WidgetDefinition.field3856 != var1) {
			class137.field1641 = var0;
			WidgetDefinition.field3856 = var1;
			class325.updateGameState(25);
			Client.field706 = true;
			NpcOverrides.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class509.topLevelWorldView.baseX;
			int var4 = class509.topLevelWorldView.baseY;
			class509.topLevelWorldView.baseX = (var0 - 6) * 8;
			class509.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = class509.topLevelWorldView.baseX - var3;
			int var6 = class509.topLevelWorldView.baseY - var4;
			int var7 = var5 * 128;
			int var8 = var6 * 128;

			int var11;
			int[] var10000;
			for (int var9 = 0; var9 < 65536; ++var9) {
				NPC var24 = (NPC)class509.topLevelWorldView.npcs.get((long)var9);
				if (var24 != null) {
					for (var11 = 0; var11 < 10; ++var11) {
						var10000 = var24.pathX;
						var10000[var11] -= var5;
						var10000 = var24.pathY;
						var10000[var11] -= var6;
					}

					var24.x -= var7;
					var24.y -= var8;
					var24.field1256 -= var5;
					var24.field1270 -= var6;
					var24.field1269 -= var5;
					var24.field1229 -= var6;
				}
			}

			Iterator var21 = class509.topLevelWorldView.players.iterator();

			while (true) {
				Player var27;
				do {
					if (!var21.hasNext()) {
						for (int var10 = 0; var10 < 4095; ++var10) {
							WorldEntity var23 = (WorldEntity)class509.topLevelWorldView.worldEntities.get((long)var10);
							if (var23 != null) {
								var23.setPosition(-var7, -var8);
							}
						}

						byte var25 = 0;
						byte var26 = 104;
						byte var12 = 1;
						if (var5 < 0) {
							var25 = 103;
							var26 = -1;
							var12 = -1;
						}

						byte var13 = 0;
						byte var14 = 104;
						byte var15 = 1;
						if (var6 < 0) {
							var13 = 103;
							var14 = -1;
							var15 = -1;
						}

						int var17;
						for (int var16 = var25; var16 != var26; var16 += var12) {
							for (var17 = var13; var14 != var17; var17 += var15) {
								int var18 = var5 + var16;
								int var19 = var6 + var17;

								for (int var20 = 0; var20 < 4; ++var20) {
									if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
										class509.topLevelWorldView.groundItems[var20][var16][var17] = class509.topLevelWorldView.groundItems[var20][var18][var19];
									} else {
										class509.topLevelWorldView.groundItems[var20][var16][var17] = null;
									}
								}
							}
						}

						for (PendingSpawn var22 = (PendingSpawn)class509.topLevelWorldView.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)class509.topLevelWorldView.pendingSpawns.previous()) {
							var22.x -= var5;
							var22.y -= var6;
							if (var22.x < 0 || 104 <= var22.x || var22.y < 0 || 104 <= var22.y) {
								var22.remove();
							}
						}

						if (Client.destinationX != 0) {
							Client.destinationX -= var5;
							Client.destinationY -= var6;
						}

						Client.soundEffectCount = 0;
						Client.isCameraLocked = false;
						MusicPatchNode2.cameraX -= var5 << 7;
						SceneTilePaint.cameraZ -= var6 << 7;
						ReflectionCheck.oculusOrbFocalPointX -= var5 << 7;
						KeyHandler.oculusOrbFocalPointY -= var6 << 7;
						Client.field761 = -1;
						class509.topLevelWorldView.graphicsObjects.clear();
						class509.topLevelWorldView.projectiles.clear();

						for (var17 = 0; var17 < 4; ++var17) {
							class509.topLevelWorldView.collisionMaps[var17].clear();
						}

						return;
					}

					var27 = (Player)var21.next();
				} while(var27 == null);

				for (var11 = 0; var11 < 10; ++var11) {
					var10000 = var27.pathX;
					var10000[var11] -= var5;
					var10000 = var27.pathY;
					var10000[var11] -= var6;
				}

				var27.x -= var7;
				var27.y -= var8;
				var27.field1256 -= var5;
				var27.field1270 -= var6;
				var27.field1269 -= var5;
				var27.field1229 -= var6;
			}
		}
	}
}
