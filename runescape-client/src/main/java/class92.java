import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public enum class92 implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1123(0, -1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1114(1, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1119(2, 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1116(3, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1117(4, 5),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1113(5, 6),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1115(6, 21);

	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Lgb;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -807320721
	)
	final int field1118;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1542864681
	)
	final int field1121;

	class92(int var3, int var4) {
		this.field1118 = var3;
		this.field1121 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1121;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lkx;",
		garbageValue = "234297115"
	)
	static class272[] method2499() {
		return new class272[]{class272.field3101, class272.field3096, class272.field3095, class272.field3092, class272.field3091, class272.field3103, class272.field3090};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1492538263"
	)
	static void method2492() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			TileItem.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1;
			try {
				URL var3 = new URL(WorldMapArchiveLoader.method9796("services", false) + "m=accountappeal/login.ws");
				URLConnection var4 = var3.openConnection();
				var4.setRequestProperty("connection", "close");
				var4.setDoInput(true);
				var4.setDoOutput(true);
				var4.setConnectTimeout(5000);
				OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
				var5.write("data1=req");
				var5.flush();
				InputStream var6 = var4.getInputStream();
				Buffer var7 = new Buffer(new byte[1000]);

				while (true) {
					int var8 = var6.read(var7.array, var7.offset * -2066221813, 1000 - var7.offset * -2066221813);
					if (var8 == -1) {
						var7.offset = 0;
						long var10 = var7.readLong();
						var1 = var10;
						break;
					}

					var7.offset += var8 * 29699747;
					if (var7.offset * -2066221813 >= 1000) {
						var1 = 0L;
						break;
					}
				}
			} catch (Exception var14) {
				var1 = 0L;
			}

			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = GrandExchangeOfferOwnWorldComparator.method1233(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				TileItem.setLoginResponseString(class385.field4505, class385.field4522, class385.field4564);
				class137.method3379(6);
				break;
			case 3:
				TileItem.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				TileItem.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				TileItem.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				TileItem.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				TileItem.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-199520677"
	)
	static void method2497(int var0, int var1) {
		if (Renderable.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MidiRequest(class143.archive6, var0, 0, Renderable.clientPreferences.getMusicVolume(), false));
			MouseHandler.method665(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldj;I)V",
		garbageValue = "1581554779"
	)
	static void method2494(WorldView var0) {
		int var1 = Client.playerUpdateManager.playerCount;
		int[] var2 = Client.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				WorldMapRectangle.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}
}
