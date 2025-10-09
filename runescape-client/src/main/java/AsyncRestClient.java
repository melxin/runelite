import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("oh")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ab")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("at")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ag")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 47530711
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-2146704765"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lap;I)Lao;",
		garbageValue = "-1549650344"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1894077897"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-25"
	)
	public static void method164() {
		class177.field1842.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-25"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-841052123"
	)
	static int method178(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1094983054"
	)
	static void method174() {
		Client.mouseLastLastPressedTimeMillis = -1L;
		if (MidiRequest.mouseRecorder != null) {
			MidiRequest.mouseRecorder.index = 0;
		}

		GameEngine.hasFocus = true;
		Client.hadFocus = true;
		Client.field425 = -1L;
		class35.reflectionChecks = new IterableNodeDeque();
		Client.packetWriter.clearBuffer();
		Client.packetWriter.field1301 = 0;
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1303 = null;
		Client.packetWriter.field1304 = null;
		Client.packetWriter.field1305 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1294 = 0;
		Client.rebootTimer = 0;
		Client.logoutTimer = 0;
		Client.field576.method8228();
		AbstractUserComparator.method10062();
		class40.method771(0);
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
		Client.isItemSelected = 0;
		Client.isSpellSelected = false;
		class48.method1912();
		Client.camAngleY = 0;
		Client.oculusOrbState = 0;
		Occluder.field2830 = null;
		Client.minimapState = 0;
		Client.field549 = -1;
		Client.destinationX = 0;
		Client.destinationY = 0;
		Client.playerAttackOption = AttackOption.AttackOption_hidden;
		Client.npcAttackOption = AttackOption.AttackOption_hidden;
		Client.worldViewManager.clear();
		Client.currentWorldViewId = -1;
		Client.projectiles.clear();
		Client.playerUpdateManager.clear();
		KitDefinition.friendSystem.method1559();
		class271.method6111();
		if (ModeWhere.varcs != null) {
			ModeWhere.varcs.clearTransient();
		}

		Client.followerIndex = -1;
		if (Client.rootInterface != -1) {
			class35.widgetDefinition.method7485(Client.rootInterface);
		}

		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			class136.closeInterface(var0, true);
		}

		Client.rootInterface = -1;
		Client.interfaceParents = new NodeHashTable(8);
		Client.meslayerContinueWidget = null;
		AbstractUserComparator.method10062();
		Client.playerAppearance.method7538((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

		int var1;
		for (var1 = 0; var1 < 8; ++var1) {
			Client.playerMenuActions[var1] = null;
			Client.playerOptionsPriorities[var1] = false;
		}

		class107.method3438();
		Client.isLoading = true;

		for (var1 = 0; var1 < 100; ++var1) {
			Client.validRootWidgets[var1] = true;
		}

		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var2 = HorizontalAlignment.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var2.packetBuffer.writeByte(WorldMapRenderer.getWindowedMode());
			var2.packetBuffer.writeShort(class4.canvasWidth);
			var2.packetBuffer.writeShort(class558.canvasHeight);
			Client.packetWriter.addNode(var2);
		}

		class445.friendsChat = null;
		class377.guestClanSettings = null;
		Arrays.fill(Client.currentClanSettings, (Object)null);
		class341.guestClanChannel = null;
		Arrays.fill(Client.currentClanChannels, (Object)null);

		for (var1 = 0; var1 < 8; ++var1) {
			Client.grandExchangeOffers[var1] = new GrandExchangeOffer();
		}

		HttpQueryParams.grandExchangeEvents = null;
		Client.viewportOffsetX = 0;
		Client.viewportOffsetY = 0;
		Client.viewportWidth = 0;
		Client.viewportHeight = 0;
		class32.client.method516(false);
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1745414505"
	)
	static final void method175(int var0, int var1, int var2, boolean var3) {
		if (class35.widgetDefinition.loadInterface(var0)) {
			class391.resizeInterface(class35.widgetDefinition.Widget_interfaceComponents[var0], 0, class35.widgetDefinition.Widget_interfaceComponents[var0].length - 1, -1, -1, var1, var2, var3);
		}
	}
}
