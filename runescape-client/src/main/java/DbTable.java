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
	@ObfuscatedName("af")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	class555[] field5510;
	@ObfuscatedName("ah")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method10108(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lpl;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method10108(new Buffer(var4));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-109"
	)
	void method10108(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5510 = new class555[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5510[var3] = (class555)class454.findEnumerated(class555.method10068(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5510[var3].method10075(var1);
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;II)Ljava/util/List;",
		garbageValue = "1088006774"
	)
	public List method10116(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-994752802"
	)
	public static int method10109(int var0) {
		return var0 >>> 4 & class561.field5518;
	}
}
