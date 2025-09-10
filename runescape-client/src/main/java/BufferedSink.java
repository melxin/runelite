import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
@Implements("BufferedSink")
public class BufferedSink implements Runnable {
	@ObfuscatedName("ax")
	static Image field5468;
	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static Fonts field5467;
	@ObfuscatedName("af")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("aw")
	@Export("outputStream")
	OutputStream outputStream;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -634771801
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("ac")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -211398701
	)
	@Export("position")
	int position;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 327141635
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("ao")
	@Export("exception")
	IOException exception;
	@ObfuscatedName("as")
	@Export("closed")
	boolean closed;

	BufferedSink(OutputStream var1, int var2) {
		this.position = 0;
		this.limit = 0;
		this.outputStream = var1;
		this.capacity = var2 + 1;
		this.buffer = new byte[this.capacity];
		this.thread = new Thread(this);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "71"
	)
	@Export("isClosed")
	boolean isClosed() {
		if (this.closed) {
			try {
				this.outputStream.close();
				if (this.exception == null) {
					this.exception = new IOException("");
				}
			} catch (IOException var2) {
				if (this.exception == null) {
					this.exception = new IOException(var2);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "81"
	)
	@Export("write")
	void write(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
			synchronized(this) {
				if (this.exception != null) {
					throw new IOException(this.exception.toString());
				} else {
					int var5;
					if (this.position <= this.limit) {
						var5 = this.capacity - this.limit + this.position - 1;
					} else {
						var5 = this.position - this.limit - 1;
					}

					if (var5 < var3) {
						throw new IOException("");
					} else {
						if (var3 + this.limit <= this.capacity) {
							System.arraycopy(var1, var2, this.buffer, this.limit, var3);
						} else {
							int var6 = this.capacity - this.limit;
							System.arraycopy(var1, var2, this.buffer, this.limit, var6);
							System.arraycopy(var1, var6 + var2, this.buffer, 0, var3 - var6);
						}

						this.limit = (var3 + this.limit) % this.capacity;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179023291"
	)
	@Export("close")
	void close() {
		synchronized(this) {
			this.closed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	public void run() {
		do {
			int var1;
			synchronized(this) {
				while (true) {
					if (this.exception != null) {
						return;
					}

					if (this.position <= this.limit) {
						var1 = this.limit - this.position;
					} else {
						var1 = this.capacity - this.position + this.limit;
					}

					if (var1 > 0) {
						break;
					}

					try {
						this.outputStream.flush();
					} catch (IOException var11) {
						this.exception = var11;
						return;
					}

					if (this.isClosed()) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException var12) {
					}
				}
			}

			try {
				if (var1 + this.position <= this.capacity) {
					this.outputStream.write(this.buffer, this.position, var1);
				} else {
					int var7 = this.capacity - this.position;
					this.outputStream.write(this.buffer, this.position, var7);
					this.outputStream.write(this.buffer, 0, var1 - var7);
				}
			} catch (IOException var10) {
				IOException var2 = var10;
				synchronized(this) {
					this.exception = var2;
					return;
				}
			}

			synchronized(this) {
				this.position = (var1 + this.position) % this.capacity;
			}
		} while(!this.isClosed());

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-170869480"
	)
	public static int method10262(String var0) {
		return var0.length() + 2;
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "963621894"
	)
	static final void method10263(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method4076()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = UserComparator6.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + WorldMapSection2.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
