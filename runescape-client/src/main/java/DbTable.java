import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vr")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	class544[] field5413;
	@ObfuscatedName("ad")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lpq;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method10163(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lpq;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method10163(new Buffer(var4));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvy;I)V",
		garbageValue = "-1568054940"
	)
	void method10163(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5413 = new class544[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5413[var3] = (class544)StructComposition.findEnumerated(class544.method10125(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5413[var3].method10123(var1);
				int var7 = var1.packBytesToInt();
				ArrayList var8 = new ArrayList();

				while (var7-- > 0) {
					int var9 = var1.packBytesToInt();
					var8.add(var9);
				}

				var5.put(var6, var8);
			}

			this.columns.add(var3, var5);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "-2077876745"
	)
	public List method10168(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
