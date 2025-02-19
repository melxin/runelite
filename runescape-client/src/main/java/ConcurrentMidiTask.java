import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("ab")
	ArrayList field5034;

	@ObfuscatedSignature(
		descriptor = "(Lrt;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field5034 = var2;
		super.field5028 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2115930134"
	)
	public boolean vmethod8896() {
		for (int var1 = 0; var1 < this.field5034.size(); ++var1) {
			SongTask var2 = (SongTask)this.field5034.get(var1);
			if (var2 == null) {
				this.field5034.remove(var1);
				--var1;
			} else if (var2.vmethod8896()) {
				if (var2.method8880()) {
					this.method8875(var2.method8870());
					this.field5034.clear();
					return true;
				}

				if (var2.method8874() != null) {
					this.field5034.add(var2.method8874());
				}

				super.field5032 = var2.field5032;
				this.field5034.remove(var1);
				--var1;
			}
		}

		if (this.field5034.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvh;",
		garbageValue = "108"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field5505.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method10093(new Buffer(var2));
			}

			var1.method10091();
			DbTableType.DBTableType_cache.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-5483"
	)
	static final void method8890() {
		Client.field714 = Client.cycleCntr;
	}
}
