import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ao")
	ArrayList field5043;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5043 = var2;
		super.field5039 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		for (int var1 = 0; var1 < this.field5043.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5043.get(var1);
			if (var2 == null) {
				this.field5043.remove(var1);
				--var1;
			} else if (var2.vmethod8938()) {
				if (var2.method8916()) {
					this.method8920(var2.method8918());
					this.field5043.clear();
					return true;
				}

				if (var2.method8930() != null) {
					this.field5043.add(var2.method8930());
				}

				super.field5036 = var2.field5036;
				this.field5043.remove(var1);
				--var1;
			}
		}

		if (this.field5043.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(Lka;I)V",
		garbageValue = "-785821470"
	)
	static void method8936(class269 var0) {
		if (var0 != null && var0.field3058 != null) {
			if (var0.field3058.childIndex * -1626125685 >= 0) {
				Widget var1 = class232.widgetDefinition.method6951(var0.field3058.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field3058.childIndex * -1626125685 >= var1.children.length || var0.field3058 != var1.children[var0.field3058.childIndex * -1626125685]) {
					return;
				}
			}

			if (var0.field3058.type == 11 && var0.field3060 == 0) {
				if (var0.field3058.method7446(var0.field3055, var0.field3056, 0, 0)) {
					var0.field3058.method7373().method4719().method4847(1, var0.field3058.method7373().method4732());
					switch(var0.field3058.method7369()) {
					case 0:
						RestClientThreadFactory.openURL(var0.field3058.method7371(), true, false);
						break;
					case 1:
						int var2 = class31.getWidgetFlags(var0.field3058);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field3058.method7372();
							if (var3 != null) {
								PacketBufferNode var4 = FloorDecoration.getPacketBufferNode(ClientPacket.IF_CRMVIEW, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntLE(var3[0]);
								var4.packetBuffer.writeIntME(var0.field3058.id);
								var4.packetBuffer.writeIntME(var3[2]);
								var4.packetBuffer.writeInt(var0.field3058.method7339());
								var4.packetBuffer.writeShortAddLE(var0.field3058.childIndex * -1626125685);
								var4.packetBuffer.writeIntME(var3[1]);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field3058.type == 12) {
				class361 var6 = var0.field3058.method7377();
				if (var6 != null && var6.method7240()) {
					switch(var0.field3060) {
					case 0:
						Client.field654.method5635(var0.field3058);
						var6.method7111(true);
						var6.method7101(var0.field3055, var0.field3056, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method7102(var0.field3055, var0.field3056);
					}
				}
			}

		}
	}
}
