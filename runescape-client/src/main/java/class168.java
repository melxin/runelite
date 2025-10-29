import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class168 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 2600356274940065355L
	)
	long field1886;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = 6110926633958993713L
	)
	public long field1888;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	IterableNodeDeque field1889;

	@ObfuscatedSignature(
		descriptor = "(Lxa;)V"
	)
	public class168(Buffer var1) {
		this.field1888 = -1L;
		this.field1889 = new IterableNodeDeque();
		this.method4177(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "1808273726"
	)
	void method4177(Buffer var1) {
		this.field1886 = var1.readLong();
		this.field1888 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class163(this);
			} else if (var2 == 4) {
				var3 = new class174(this);
			} else if (var2 == 3) {
				var3 = new class159(this);
			} else if (var2 == 2) {
				var3 = new class157(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class167)var3).vmethod4228(var1);
			this.field1889.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "23"
	)
	public void method4170(ClanChannel var1) {
		if (this.field1886 == var1.key && var1.field1899 == this.field1888) {
			for (class167 var2 = (class167)this.field1889.last(); var2 != null; var2 = (class167)this.field1889.previous()) {
				var2.vmethod4229(var1);
			}

			++var1.field1899;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldd;",
		garbageValue = "-1765638269"
	)
	static WorldView method4178(int var0, int var1, int var2) {
		return Client.worldViewManager.createWorldView2(var0, var1, var2, class468.clientPreferences.getDrawDistance(), TileRenderMode.field2670);
	}
}
