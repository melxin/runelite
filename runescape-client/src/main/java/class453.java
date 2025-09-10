import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public final class class453 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lrl;"
	)
	static class453[] field5178;
	@ObfuscatedName("ac")
	float field5182;
	@ObfuscatedName("ap")
	float field5179;
	@ObfuscatedName("aq")
	float field5180;
	@ObfuscatedName("ao")
	float field5181;

	static {
		new class453();
		field5178 = new class453[0];
		class33.method502(16);
	}

	class453() {
		this.method9058();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-778990682"
	)
	public void method9054() {
		synchronized(field5178) {
			if (DevicePcmPlayerProvider.field91 < class442.field5140) {
				field5178[++DevicePcmPlayerProvider.field91 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1613436739"
	)
	void method9077(float var1, float var2, float var3, float var4) {
		this.field5182 = var1;
		this.field5179 = var2;
		this.field5180 = var3;
		this.field5181 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1523016913"
	)
	public void method9056(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field5182 = var5 * var1;
		this.field5179 = var5 * var2;
		this.field5180 = var3 * var5;
		this.field5181 = var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1445629254"
	)
	public void method9072(float var1, float var2, float var3) {
		this.method9056(0.0F, 1.0F, 0.0F, var1);
		class453 var4 = PendingSpawn.method2414();
		var4.method9056(1.0F, 0.0F, 0.0F, var2);
		this.method9059(var4);
		var4.method9056(0.0F, 0.0F, 1.0F, var3);
		this.method9059(var4);
		var4.method9054();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "487169977"
	)
	final void method9058() {
		this.field5180 = 0.0F;
		this.field5179 = 0.0F;
		this.field5182 = 0.0F;
		this.field5181 = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrl;I)V",
		garbageValue = "65536"
	)
	public final void method9059(class453 var1) {
		this.method9077(var1.field5182 * this.field5181 + var1.field5181 * this.field5182 + this.field5180 * var1.field5179 - var1.field5180 * this.field5179, var1.field5180 * this.field5182 + var1.field5181 * this.field5179 - this.field5180 * var1.field5182 + this.field5181 * var1.field5179, this.field5180 * var1.field5181 + var1.field5182 * this.field5179 - var1.field5179 * this.field5182 + var1.field5180 * this.field5181, var1.field5181 * this.field5181 - var1.field5182 * this.field5182 - var1.field5179 * this.field5179 - this.field5180 * var1.field5180);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field5182;
		var2 = 31.0F * var2 + this.field5179;
		var2 = 31.0F * var2 + this.field5180;
		var2 = var2 * 31.0F + this.field5181;
		return (int)var2;
	}

	public String toString() {
		return this.field5182 + "," + this.field5179 + "," + this.field5180 + "," + this.field5181;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class453)) {
			return false;
		} else {
			class453 var2 = (class453)var1;
			return var2.field5182 == this.field5182 && this.field5179 == var2.field5179 && var2.field5180 == this.field5180 && this.field5181 == var2.field5181;
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1702186973"
	)
	static final void method9084() {
		int var0 = Client.playerUpdateManager.playerCount;
		int[] var1 = Client.playerUpdateManager.playerIndices;
		Iterator var2 = Client.worldViewManager.iterator();

		while (var2.hasNext()) {
			WorldView var3 = (WorldView)var2.next();

			for (int var4 = 0; var4 < var0; ++var4) {
				Player var5 = (Player)var3.players.get((long)var1[var4]);
				if (var5 != null) {
					WorldMapID.updateActorSequence(var3, var5, 1);
				}
			}
		}

	}
}
