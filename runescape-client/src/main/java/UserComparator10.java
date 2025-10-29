import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("av")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Ltm;I)I",
		garbageValue = "-1161103436"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1572178650"
	)
	static final void method3733(int var0, int var1, int var2) {
		if (SpriteBufferProperties.cameraX < var0) {
			SpriteBufferProperties.cameraX = (var0 - SpriteBufferProperties.cameraX) * class487.field5389 / 1000 + SpriteBufferProperties.cameraX + FloatProjection.field2946;
			if (SpriteBufferProperties.cameraX > var0) {
				SpriteBufferProperties.cameraX = var0;
			}
		}

		if (SpriteBufferProperties.cameraX > var0) {
			SpriteBufferProperties.cameraX -= (SpriteBufferProperties.cameraX - var0) * class487.field5389 / 1000 + FloatProjection.field2946;
			if (SpriteBufferProperties.cameraX < var0) {
				SpriteBufferProperties.cameraX = var0;
			}
		}

		if (ScriptFrame.cameraY < var1) {
			ScriptFrame.cameraY = (var1 - ScriptFrame.cameraY) * class487.field5389 / 1000 + ScriptFrame.cameraY + FloatProjection.field2946;
			if (ScriptFrame.cameraY > var1) {
				ScriptFrame.cameraY = var1;
			}
		}

		if (ScriptFrame.cameraY > var1) {
			ScriptFrame.cameraY -= (ScriptFrame.cameraY - var1) * class487.field5389 / 1000 + FloatProjection.field2946;
			if (ScriptFrame.cameraY < var1) {
				ScriptFrame.cameraY = var1;
			}
		}

		if (class528.cameraZ < var2) {
			class528.cameraZ = (var2 - class528.cameraZ) * class487.field5389 / 1000 + class528.cameraZ + FloatProjection.field2946;
			if (class528.cameraZ > var2) {
				class528.cameraZ = var2;
			}
		}

		if (class528.cameraZ > var2) {
			class528.cameraZ -= (class528.cameraZ - var2) * class487.field5389 / 1000 + FloatProjection.field2946;
			if (class528.cameraZ < var2) {
				class528.cameraZ = var2;
			}
		}

	}
}
