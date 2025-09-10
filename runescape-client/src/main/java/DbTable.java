import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wd")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lwv;"
	)
	class574[] field5832;
	@ObfuscatedName("ap")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lpx;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method11061(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method11061(new Buffer(var4));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)V",
		garbageValue = "10"
	)
	void method11061(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5832 = new class574[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5832[var3] = (class574)class173.findEnumerated(class574.method11023(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5832[var3].method11020(var1);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "33"
	)
	public List method11060(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}
}
