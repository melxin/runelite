import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -4641101876541563541L
	)
	long field4909;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 6644330373994654651L
	)
	long field4903;
	@ObfuscatedName("az")
	public boolean field4907;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -8356337548988540209L
	)
	long field4902;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 2576810478100689245L
	)
	long field4904;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -6467865585511420701L
	)
	long field4905;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -900855465
	)
	int field4906;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1473568515
	)
	int field4900;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -767770327
	)
	int field4908;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2066281717
	)
	int field4901;

	public Timer() {
		this.field4909 = -1L;
		this.field4903 = -1L;
		this.field4907 = false;
		this.field4902 = 0L;
		this.field4904 = 0L;
		this.field4905 = 0L;
		this.field4906 = 0;
		this.field4900 = 0;
		this.field4908 = 0;
		this.field4901 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1947241197"
	)
	public void method8937() {
		this.field4909 = ReflectionCheck.method724();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1510722758"
	)
	public void method8954() {
		if (-1L != this.field4909) {
			this.field4904 = ReflectionCheck.method724() - this.field4909;
			this.field4909 = -1L;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1806918946"
	)
	public void method8944(int var1) {
		this.field4903 = ReflectionCheck.method724();
		this.field4906 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "511371086"
	)
	public void method8940() {
		if (this.field4903 != -1L) {
			this.field4902 = ReflectionCheck.method724() - this.field4903;
			this.field4903 = -1L;
		}

		++this.field4908;
		this.field4907 = true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1638122827"
	)
	public void method8964() {
		this.field4907 = false;
		this.field4900 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "440496412"
	)
	public void method8942() {
		this.method8940();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-57710978"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4904;
		var2 /= 10L;
		if (var2 < 0L) {
			var2 = 0L;
		} else if (var2 > 65535L) {
			var2 = 65535L;
		}

		var1.writeShort((int)var2);
		long var4 = this.field4902;
		var4 /= 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}

		var1.writeShort((int)var4);
		long var6 = this.field4905;
		var6 /= 10L;
		if (var6 < 0L) {
			var6 = 0L;
		} else if (var6 > 65535L) {
			var6 = 65535L;
		}

		var1.writeShort((int)var6);
		var1.writeShort(this.field4906);
		var1.writeShort(this.field4900);
		var1.writeShort(this.field4908);
		var1.writeShort(this.field4901);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpq;Lpq;Lpq;Ljava/util/ArrayList;I)Z",
		garbageValue = "311867327"
	)
	public static boolean method8939(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class333.field3628 = var0;
		class553.field5461 = var1;
		class333.field3624 = var2;
		class333.field3625 = var3;
		return true;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lud;I)Ljava/lang/Object;",
		garbageValue = "1496692321"
	)
	static Object method8952(class544 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5394) {
			case 0:
				return Interpreter.Interpreter_stringStack[--HealthBarConfig.Interpreter_stringStackSize];
			case 2:
				return Interpreter.Interpreter_intStack[--ScriptFrame.Interpreter_intStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Ldz;ZI)V",
		garbageValue = "-1611699744"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.npcCount; ++var2) {
			NPC var3 = var0.npcs[var0.npcIndices[var2]];
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var0.plane;
				int var5 = var3.x >> 7;
				int var6 = var3.y >> 7;
				if (var5 >= 0 && var5 < var0.sizeX && var6 >= 0 && var6 < var0.sizeY) {
					if (var3.field1268 * -2132848751 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var5][var6] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var5][var6] = Client.viewportDrawCount;
					}

					long var7 = Projectile.calculateTag(0, 0, 1, !var3.definition.isInteractable, var0.npcIndices[var2], var0.id);
					var3.playerCycle = Client.cycle;
					int var9 = Canvas.getTileHeight(var0, var3.field1268 * 936633408 - 64 + var3.x, var3.field1268 * 936633408 - 64 + var3.y, var4);
					var0.scene.drawEntity(var4, var3.x, var3.y, var9, var3.field1268 * 936633408 - 64 + 60, var3, var3.rotation, var7, var3.isWalking);
				}
			}
		}

	}
}
