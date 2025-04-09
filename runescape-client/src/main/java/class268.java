import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
public class class268 implements class29 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	Widget field3050;
	@ObfuscatedName("an")
	boolean field3049;
	@ObfuscatedName("ae")
	boolean field3051;

	public class268() {
		this.field3050 = null;
		this.field3049 = false;
		this.field3051 = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "930049356"
	)
	public boolean vmethod5667(int var1) {
		if (this.field3050 == null) {
			return false;
		} else {
			class27 var2 = this.field3050.method7482();
			if (var2 == null) {
				return false;
			} else {
				if (var2.method427(var1)) {
					switch(var1) {
					case 81:
						this.field3051 = true;
						break;
					case 82:
						this.field3049 = true;
						break;
					default:
						if (this.method5659(var1)) {
							class139.invalidateWidget(this.field3050);
						}
					}
				}

				return var2.method399(var1);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1495097864"
	)
	public boolean vmethod5668(int var1) {
		switch(var1) {
		case 81:
			this.field3051 = false;
			return false;
		case 82:
			this.field3049 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-3"
	)
	public boolean vmethod5681(char var1) {
		if (this.field3050 == null) {
			return false;
		} else if (!class379.method7556(var1)) {
			return false;
		} else {
			class361 var2 = this.field3050.method7377();
			if (var2 != null && var2.method7118()) {
				class27 var3 = this.field3050.method7482();
				if (var3 == null) {
					return false;
				} else {
					if (var3.method402(var1) && var2.method7265(var1)) {
						class139.invalidateWidget(this.field3050);
					}

					return var3.method400(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "51"
	)
	public boolean vmethod5671(boolean var1) {
		return false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lnh;",
		garbageValue = "1491229138"
	)
	public Widget method5634() {
		return this.field3050;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnh;B)V",
		garbageValue = "110"
	)
	public void method5635(Widget var1) {
		if (var1 != null) {
			if (var1 != this.field3050) {
				this.method5641();
				this.field3050 = var1;
			}

			class359 var2 = var1.method7380();
			if (var2 != null) {
				if (!var2.field3868.method7113() && var2.field3871 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2471(var1);
					var3.setArgs(var2.field3871);
					class143.method3438().addFirst(var3);
				}

				var2.field3868.method7111(true);
			}
		} else {
			this.method5641();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1489348039"
	)
	public void method5641() {
		if (this.field3050 != null) {
			class359 var1 = this.field3050.method7380();
			Widget var2 = this.field3050;
			this.field3050 = null;
			if (var1 != null) {
				if (var1.field3868.method7113() && var1.field3871 != null) {
					ScriptEvent var3 = new ScriptEvent();
					var3.method2471(var2);
					var3.setArgs(var1.field3871);
					class143.method3438().addFirst(var3);
				}

				var1.field3868.method7111(false);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1460399093"
	)
	boolean method5659(int var1) {
		if (this.field3050 == null) {
			return false;
		} else {
			class361 var2 = this.field3050.method7377();
			if (var2 != null && var2.method7118()) {
				Clipboard var5;
				switch(var1) {
				case 13:
					this.method5641();
					return true;
				case 48:
					if (this.field3049) {
						var2.method7315();
					}

					return true;
				case 65:
					if (this.field3049) {
						var5 = SecureRandomCallable.client.method574();
						var2.method7066(var5);
					}

					return true;
				case 66:
					if (this.field3049) {
						var5 = SecureRandomCallable.client.method574();
						var2.method7103(var5);
					}

					return true;
				case 67:
					if (this.field3049) {
						var5 = SecureRandomCallable.client.method574();
						var2.method7105(var5);
					}

					return true;
				case 84:
					if (var2.method7291() == 0) {
						var2.method7265(10);
					} else if (this.field3051 && var2.method7131()) {
						var2.method7265(10);
					} else {
						class359 var3 = this.field3050.method7380();
						ScriptEvent var4 = new ScriptEvent();
						var4.method2471(this.field3050);
						var4.setArgs(var3.field3873);
						class143.method3438().addFirst(var4);
						this.method5641();
					}

					return true;
				case 85:
					if (this.field3049) {
						var2.method7082();
					} else {
						var2.method7080();
					}

					return true;
				case 96:
					if (this.field3049) {
						var2.method7310(this.field3051);
					} else {
						var2.method7091(this.field3051);
					}

					return true;
				case 97:
					if (this.field3049) {
						var2.method7289(this.field3051);
					} else {
						var2.method7092(this.field3051);
					}

					return true;
				case 98:
					if (this.field3049) {
						var2.method7106();
					} else {
						var2.method7095(this.field3051);
					}

					return true;
				case 99:
					if (this.field3049) {
						var2.method7107();
					} else {
						var2.method7096(this.field3051);
					}

					return true;
				case 101:
					if (this.field3049) {
						var2.method7083();
					} else {
						var2.method7171();
					}

					return true;
				case 102:
					if (this.field3049) {
						var2.method7089(this.field3051);
					} else {
						var2.method7087(this.field3051);
					}

					return true;
				case 103:
					if (this.field3049) {
						var2.method7079(this.field3051);
					} else {
						var2.method7070(this.field3051);
					}

					return true;
				case 104:
					if (this.field3049) {
						var2.method7067(this.field3051);
					} else {
						var2.method7097(this.field3051);
					}

					return true;
				case 105:
					if (this.field3049) {
						var2.method7168(this.field3051);
					} else {
						var2.method7296(this.field3051);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	public static void method5661() {
		KitDefinition.KitDefinition_cached.clear();
	}

	@ObfuscatedName("nj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "553388863"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = FloorDecoration.getPacketBufferNode(ClientPacket.field3421, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
