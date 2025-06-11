import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ak")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("jy")
	static String field65;
	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "Ltg;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("pq")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "Lwd;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ap")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("aj")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("an")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 578883771
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1955404263"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lau;I)Lae;",
		garbageValue = "1762050630"
	)
	@Export("submitRequest")
	public AsyncHttpResponse submitRequest(HttpRequest var1) {
		if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.threadPoolExecutor.getCorePoolSize() + " Queue capacity " + this.workQueueCapacity);
			return new AsyncHttpResponse("Queue full");
		} else {
			AsyncHttpResponse var2 = new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1536306581"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "1914105162"
	)
	static int method183(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (HorizontalAlignment.guestClanSettings != null) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
				class445.field4970 = HorizontalAlignment.guestClanSettings;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (Client.currentClanSettings[var3] != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					class445.field4970 = Client.currentClanSettings[var3];
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = class445.field4970.name;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.allowGuests ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1800;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1806;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1789;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1792;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.memberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = class445.field4970.memberNames[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.memberRanks[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.bannedMemberCount;
				return 1;
			} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = class445.field4970.bannedMemberNames[var3];
				return 1;
			} else {
				int var5;
				int var6;
				if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					Interpreter.Interpreter_intStackSize -= 3;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.method3749(var3, var6, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.currentOwner;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1801;
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.method3743((String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class445.field4970.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
					return 1;
				} else if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Canvas.method334(var6, var3);
					return 1;
				} else if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.memberJoinDates[var3];
					return 1;
				} else {
					if (var0 == ScriptOpcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						Interpreter.Interpreter_intStackSize -= 3;
						var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
						var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
						VarpDefinition.method3992(var5, var3, var4);
					}

					if (var0 == ScriptOpcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class445.field4970.field1798[var3] ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (PendingSpawn.guestClanChannel != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							class27.field127 = PendingSpawn.guestClanChannel;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						if (Client.currentClanChannels[var3] != null) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							class27.field127 = Client.currentClanChannels[var3];
							class180.field1905 = var3;
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = class27.field127.name;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field127.field1852;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field127.field1851;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field127.method3878();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class175.Interpreter_stringStackSize - 1] = ((ClanChannelMember)class27.field127.members.get(var3)).username.getName();
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class27.field127.members.get(var3)).rank;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((ClanChannelMember)class27.field127.members.get(var3)).world;
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						class209.method4399(class180.field1905, var3);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class27.field127.method3877((String)Interpreter.Interpreter_stringStack[--class175.Interpreter_stringStackSize]);
						return 1;
					} else if (var0 == ScriptOpcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class27.field127.getSortedMembers()[Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]];
						return 1;
					} else if (var0 == ScriptOpcodes.CLANPROFILE_FIND) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class389.field4604 != null ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "2076440209"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-2029744147"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + AbstractWorldMapIcon.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + AbstractWorldMapIcon.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + AbstractWorldMapIcon.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
