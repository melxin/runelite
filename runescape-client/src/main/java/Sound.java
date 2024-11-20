import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("Sound")
public class Sound extends class150 {
	@ObfuscatedName("ab")
	boolean field1718;
	@ObfuscatedName("aw")
	byte field1720;
	@ObfuscatedName("at")
	byte field1719;
	@ObfuscatedName("ae")
	byte field1721;
	@ObfuscatedName("ao")
	byte field1722;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfd;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfd;)V"
	)
	Sound(class153 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;B)V",
		garbageValue = "-83"
	)
	void vmethod3694(Buffer var1) {
		this.field1718 = var1.readUnsignedByte() == 1;
		this.field1720 = var1.readByte();
		this.field1719 = var1.readByte();
		this.field1721 = var1.readByte();
		this.field1722 = var1.readByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "2002935935"
	)
	void vmethod3695(ClanSettings var1) {
		var1.allowGuests = this.field1718;
		var1.field1744 = this.field1720;
		var1.field1764 = this.field1719;
		var1.field1747 = this.field1721;
		var1.field1737 = this.field1722;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[Loo;",
		garbageValue = "-32"
	)
	public static GameBuild[] method3511() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.LIVE, GameBuild.BUILDLIVE};
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "-93"
	)
	static long method3510() {
		try {
			URL var0 = new URL(ArchiveDiskActionHandler.method7510("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}
}
