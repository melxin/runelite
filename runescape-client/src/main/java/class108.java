import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class108 extends Node {
	@ObfuscatedName("li")
	@ObfuscatedGetter(
		intValue = 635411313
	)
	static int field1425;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldu;"
	)
	class102 field1427;

	public class108() {
		this.field1427 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class108(VorbisSample var1) {
		if (var1 != null) {
			this.field1427 = new class102(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ldv;)V"
	)
	public class108(RawSound var1) {
		this.field1427 = new class102((VorbisSample)null, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2039137189"
	)
	public boolean method3390() {
		return this.field1427 == null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ldv;",
		garbageValue = "-1147295246"
	)
	public RawSound method3369() {
		if (this.field1427 != null && this.field1427.field1388.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method3389();
			} finally {
				this.field1427.field1388.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ldv;",
		garbageValue = "-1291880381"
	)
	public RawSound method3372() {
		if (this.field1427 != null) {
			this.field1427.field1388.lock();

			RawSound var1;
			try {
				var1 = this.method3389();
			} finally {
				this.field1427.field1388.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ldv;",
		garbageValue = "322931494"
	)
	RawSound method3389() {
		if (this.field1427.field1387 == null) {
			this.field1427.field1387 = this.field1427.field1386.toRawSound((int[])null);
			this.field1427.field1386 = null;
		}

		return this.field1427.field1387;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([JI)Lti;",
		garbageValue = "-271206630"
	)
	static DynamicArray method3371(long[] var0) {
		DynamicArray var1 = new DynamicArray(class574.field5816, false);
		var1.field5508 = var0;
		var1.size = var0.length * -698619497;
		var1.field5503 = var0.length;
		return var1;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "1"
	)
	static int method3378(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--UserComparator7.Interpreter_intStackSize];
			Client.field384 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++UserComparator7.Interpreter_intStackSize - 1] = Client.field384;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(Ldr;Lck;B)V",
		garbageValue = "30"
	)
	static final void method3388(WorldView var0, PendingSpawn var1) {
		Scene var2 = var0.scene;
		long var3 = 0L;
		int var5 = -1;
		int var6 = 0;
		int var7 = 0;
		if (var1.type == 0) {
			var3 = var2.getBoundaryObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 1) {
			var3 = var2.getWallDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 2) {
			var3 = var2.getGameObjectTag(var1.plane, var1.x, var1.y);
		}

		if (var1.type == 3) {
			var3 = var2.getFloorDecorationTag(var1.plane, var1.x, var1.y);
		}

		if (0L != var3) {
			int var8 = var2.getObjectFlags(var1.plane, var1.x, var1.y, var3);
			var5 = class537.Entity_unpackID(var3);
			var6 = var8 & 31;
			var7 = var8 >> 6 & 3;
		}

		var1.objectId = var5;
		var1.field1035 = var6;
		var1.field1025 = var7;
	}
}
