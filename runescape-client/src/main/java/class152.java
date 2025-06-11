import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class152 {
	@ObfuscatedName("gx")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "[Lwd;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -1794407483040936337L
	)
	long field1738;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 761561711
	)
	public int field1741;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	IterableNodeDeque field1730;

	@ObfuscatedSignature(
		descriptor = "(Lwt;)V"
	)
	public class152(Buffer var1) {
		this.field1741 = -1;
		this.field1730 = new IterableNodeDeque();
		this.method3687(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;I)V",
		garbageValue = "-1984923073"
	)
	void method3687(Buffer var1) {
		this.field1738 = var1.readLong();
		this.field1741 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class171(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class164(this);
			} else if (var2 == 4) {
				var3 = new Sound(this);
			} else if (var2 == 6) {
				var3 = new class163(this);
			} else if (var2 == 5) {
				var3 = new class148(this);
			} else if (var2 == 2) {
				var3 = new class153(this);
			} else if (var2 == 7) {
				var3 = new class146(this);
			} else if (var2 == 14) {
				var3 = new class150(this);
			} else if (var2 == 8) {
				var3 = new class167(this);
			} else if (var2 == 9) {
				var3 = new class173(this);
			} else if (var2 == 10) {
				var3 = new class159(this);
			} else if (var2 == 11) {
				var3 = new class154(this);
			} else if (var2 == 12) {
				var3 = new class158(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class168(this);
			}

			((class149)var3).vmethod3913(var1);
			this.field1730.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgu;I)V",
		garbageValue = "-1712455993"
	)
	public void method3681(ClanSettings var1) {
		if (var1.field1784 == this.field1738 && this.field1741 == var1.field1785) {
			for (class149 var2 = (class149)this.field1730.last(); var2 != null; var2 = (class149)this.field1730.previous()) {
				var2.vmethod3914(var1);
			}

			++var1.field1785;
		} else {
			throw new RuntimeException("");
		}
	}
}
