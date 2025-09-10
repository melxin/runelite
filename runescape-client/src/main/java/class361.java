import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class361 {
	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class386.logOut();
		switch(var0) {
		case 1:
			ClientPreferences.method2677(24);
			MouseRecorder.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			ClientPreferences.method2677(24);
			MouseRecorder.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1153709617"
	)
	static final void method7512() {
		if (Client.logoutTimer > 0) {
			class386.logOut();
		} else {
			Client.timer.method8248();
			UrlRequest.updateGameState(40);
			HttpRequest.field50 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
