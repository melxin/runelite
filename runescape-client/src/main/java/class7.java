import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class7 {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "[Lwy;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ji")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("px")
	static int[][] field26;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwt;"
	)
	final Buffer field23;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final class3 field27;
	@ObfuscatedName("an")
	ExecutorService field24;
	@ObfuscatedName("ai")
	Future field22;

	@ObfuscatedSignature(
		descriptor = "(Lwt;Lai;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field24 = Executors.newSingleThreadExecutor();
		this.field23 = var1;
		this.field27 = var2;
		this.method49();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-16903"
	)
	public boolean method56() {
		return this.field22.isDone();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2129641257"
	)
	public void method45() {
		this.field24.shutdown();
		this.field24 = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Lwt;",
		garbageValue = "166"
	)
	public Buffer method58() {
		try {
			return (Buffer)this.field22.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method49() {
		this.field22 = this.field24.submit(new class1(this, this.field23, this.field27));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-3407872"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class6.World_request == null) {
				class6.World_request = class167.urlRequester.request(new URL(AsyncRestClient.field65));
			} else if (class6.World_request.isDone()) {
				byte[] var0 = class6.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				class547.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = class547.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				class86.sortWorlds(class547.World_worlds, 0, class547.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class6.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class6.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lbd;",
		garbageValue = "66"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)Lqk;",
		garbageValue = "-2060372641"
	)
	public static NodeDeque method59() {
		return Client.scriptEvents;
	}
}
