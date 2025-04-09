import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public final class class477 {
	@ObfuscatedName("ao")
	final Comparator field5091;
	@ObfuscatedName("an")
	final Map field5092;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	final class450 field5093;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	final class450 field5095;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = -505763869221843221L
	)
	final long field5094;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	final class475 field5096;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1066115029
	)
	final int field5097;

	@ObfuscatedSignature(
		descriptor = "(JILsv;)V"
	)
	class477(long var1, int var3, class475 var4) {
		this.field5091 = new class476(this);
		this.field5094 = var1;
		this.field5097 = var3;
		this.field5096 = var4;
		if (this.field5097 == -1) {
			this.field5092 = new HashMap(64);
			this.field5093 = new class450(64, this.field5091);
			this.field5095 = null;
		} else {
			if (this.field5096 == null) {
				throw new IllegalArgumentException("");
			}

			this.field5092 = new HashMap(this.field5097);
			this.field5093 = new class450(this.field5097, this.field5091);
			this.field5095 = new class450(this.field5097);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILsv;)V"
	)
	public class477(int var1, class475 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	boolean method9081() {
		return this.field5097 != -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "697555854"
	)
	public Object method9082(Object var1) {
		synchronized(this) {
			if (-1L != this.field5094) {
				this.method9080();
			}

			class478 var3 = (class478)this.field5092.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method9101(var3, false);
				return var3.field5102;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "117"
	)
	public Object method9083(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field5094) {
				this.method9080();
			}

			class478 var4 = (class478)this.field5092.get(var1);
			if (var4 != null) {
				Object var8 = var4.field5102;
				var4.field5102 = var2;
				this.method9101(var4, false);
				return var8;
			} else {
				class478 var5;
				if (this.method9081() && this.field5092.size() == this.field5097) {
					var5 = (class478)this.field5095.remove();
					this.field5092.remove(var5.field5098);
					this.field5093.remove(var5);
				}

				var5 = new class478(var2, var1);
				this.field5092.put(var1, var5);
				this.method9101(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsj;ZI)V",
		garbageValue = "849017155"
	)
	void method9101(class478 var1, boolean var2) {
		if (!var2) {
			this.field5093.remove(var1);
			if (this.method9081() && !this.field5095.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field5104 = System.currentTimeMillis();
		if (this.method9081()) {
			switch(this.field5096.field5089) {
			case 0:
				++var1.field5101;
				break;
			case 1:
				var1.field5101 = var1.field5104;
			}

			this.field5095.add(var1);
		}

		this.field5093.add(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "830483656"
	)
	void method9080() {
		if (this.field5094 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field5094;

			while (!this.field5093.isEmpty()) {
				class478 var3 = (class478)this.field5093.peek();
				if (var3.field5104 >= var1) {
					return;
				}

				this.field5092.remove(var3.field5098);
				this.field5093.remove(var3);
				if (this.method9081()) {
					this.field5095.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "448648181"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field5092.clear();
			this.field5093.clear();
			if (this.method9081()) {
				this.field5095.clear();
			}

		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ldj;ZI)V",
		garbageValue = "1146600533"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.field1351.method9060(); ++var2) {
			NPC var3 = (NPC)var0.npcs.get((long)var0.field1351.method9056(var2));
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.size * -145616896 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = LoginPacket.calculateTag(0, 0, 0, 1, !var3.definition.isInteractable, var3.index, var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = GraphicsObject.getTileHeight(var0, var3.size * -729546752 - 64 + var3.x, var3.size * -729546752 - 64 + var3.y, var4);
					int var10 = var3.size * -729546752 - 64 + 60;
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var10, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
