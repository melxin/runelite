import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
@Implements("AbstractSocket")
public abstract class AbstractSocket {
	AbstractSocket() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2130905796"
	)
	@Export("isAvailable")
	public abstract boolean isAvailable(int var1) throws IOException;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1013495030"
	)
	@Export("available")
	public abstract int available() throws IOException;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-760552642"
	)
	@Export("readUnsignedByte")
	public abstract int readUnsignedByte() throws IOException;

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "-37"
	)
	@Export("read")
	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([BIIS)V",
		garbageValue = "-11244"
	)
	@Export("write")
	public abstract void write(byte[] var1, int var2, int var3) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "115773402"
	)
	@Export("close")
	public abstract void close();

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2048096921"
	)
	static void method10221() {
		Login.Login_username = Login.Login_username.trim();
		if (Login.Login_username.isEmpty()) {
			class460.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
		} else {
			long var1 = RouteStrategy.method6210();
			int var0;
			if (0L == var1) {
				var0 = 5;
			} else {
				var0 = class31.method496(var1, Login.Login_username);
			}

			switch(var0) {
			case 2:
				class460.setLoginResponseString(Strings.field4648, Strings.field4649, Strings.field4518);
				DynamicObject.method1987(6);
				break;
			case 3:
				class460.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 4:
				class460.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
				break;
			case 5:
				class460.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
				break;
			case 6:
				class460.setLoginResponseString("", "Error connecting to server.", "");
				break;
			case 7:
				class460.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
			}

		}
	}
}
