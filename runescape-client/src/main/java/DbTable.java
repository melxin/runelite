import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Luy;"
	)
	class544[] field5411;
	@ObfuscatedName("ao")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method9996(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method9996(new Buffer(var4));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V",
		garbageValue = "67883199"
	)
	void method9996(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5411 = new class544[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5411[var3] = (class544)ScriptEvent.findEnumerated(class544.method9967(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5411[var3].method9957(var1);
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
		garbageValue = "126"
	)
	public List method9995(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "-769630972"
	)
	public static void method10001(String[] var0, short[] var1) {
		Tile.sortItemsByName(var0, var1, 0, var0.length - 1);
	}
}
