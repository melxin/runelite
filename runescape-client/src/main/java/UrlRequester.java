import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("es")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("nf")
	static boolean field1487;
	@ObfuscatedName("ap")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("aj")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("an")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1823159129
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Leo;B)V",
		garbageValue = "0"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "-614165280"
	)
	int method3345(URLConnection var1) {
		int var2 = UrlRequest.field1497;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-990619832"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Leo;B)V",
		garbageValue = "64"
	)
	void method3323(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = GameEngine.method666(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				ArchiveLoader.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1491 = this.method3345(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Leo;",
		garbageValue = "2089531643"
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
		garbageValue = "27"
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
				class569.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;Lqp;I)Lqp;",
		garbageValue = "993162578"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = HealthBarUpdate.method2362(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1589928308"
	)
	public static int method3339(int var0) {
		return class525.field5355[var0 & 16383];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([J[IIII)V",
		garbageValue = "1549978929"
	)
	public static void method3350(long[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			long var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var8 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var8;
			int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

			for (int var10 = var2; var10 < var3; ++var10) {
				if (var0[var10] < var6 + (long)(var10 & var9)) {
					long var11 = var0[var10];
					var0[var10] = var0[var5];
					var0[var5] = var11;
					int var13 = var1[var10];
					var1[var10] = var1[var5];
					var1[var5++] = var13;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var8;
			method3350(var0, var1, var2, var5 - 1);
			method3350(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZB)I",
		garbageValue = "21"
	)
	static int method3349(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			Interpreter.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			class397.privateChatMode = class146.method3642(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (class397.privateChatMode == null) {
				class397.privateChatMode = PrivateChatMode.field5857;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class139.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class397.privateChatMode.field5858);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var6 = class139.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(FriendsChat.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = class7.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = WorldMapRegion.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class397.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class397.privateChatMode.field5858;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var12 = class538.method10225(var7, var8, class28.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class175.Interpreter_stringStackSize -= 2;
							var8 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize];
							String var11 = (String)Interpreter.Interpreter_stringStack[class175.Interpreter_stringStackSize + 1];
							var12 = class139.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							UserComparator8.method3396(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var6 = class538.method10225(var7, var8, class28.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapData_1.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class231.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class150.method3676(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
								HttpResponse.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field431 = ((String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]).toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = Client.field431;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = (String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = class7.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var4 = WorldMapRegion.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class152.localPlayer != null && class152.localPlayer.username != null) {
								var8 = class152.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
