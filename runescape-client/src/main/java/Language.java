import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lqa;"
	)
	@Export("Language_valuesOrdered")
	public static final Language[] Language_valuesOrdered;
	@ObfuscatedName("am")
	final String field4842;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1310262515
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ax")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field4858, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field4858, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field4858, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4858, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4849, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4849, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4858, 6, "MX");
		Language[] var0 = new Language[]{Language_ES, Language_ES_MX, Language_FR, Language_DE, Language_PT, Language_EN, Language_NL};
		Language_valuesOrdered = new Language[var0.length];
		Language[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Language var4 = var2[var3];
			if (Language_valuesOrdered[var4.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var4.id] = var4;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqp;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field4842 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1746725635"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-539879048"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)J",
		garbageValue = "1668335288"
	)
	static long method8011(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();

		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += (long)(var5 + 1 - 65);
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += (long)(var5 + 1 - 97);
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += (long)(var5 + 27 - 48);
			}

			if (var1 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var1 % 37L && var1 != 0L) {
			var1 /= 37L;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	static void method8020() {
		class137.method3379(24);
		TileItem.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-4436"
	)
	static void method8021(int var0) {
		PacketBufferNode var1 = FloorDecoration.getPacketBufferNode(ClientPacket.SET_HEADING, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-813604357"
	)
	static final void method8019(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3704()) {
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				PacketBufferNode var4 = FloorDecoration.getPacketBufferNode(ClientPacket.CLAN_SETTINGS_SET_MUTED_FROM_CHANNEL, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + class466.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}
