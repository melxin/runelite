import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vu")
@Implements("DbTable")
public class DbTable extends DualNode {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lve;"
	)
	class563[] field5617;
	@ObfuscatedName("al")
	@Export("columns")
	List columns;

	@ObfuscatedSignature(
		descriptor = "(Lps;I)V"
	)
	public DbTable(AbstractArchive var1, int var2) {
		byte[] var3 = var1.takeFile(var2, 0);
		this.method10683(new Buffer(var3));
	}

	@ObfuscatedSignature(
		descriptor = "(Lps;II)V"
	)
	public DbTable(AbstractArchive var1, int var2, int var3) {
		byte[] var4 = var1.takeFile(var2, var3 + 1);
		this.method10683(new Buffer(var4));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lwt;B)V",
		garbageValue = "23"
	)
	void method10683(Buffer var1) {
		int var2 = var1.packBytesToInt();
		this.field5617 = new class563[var2];
		this.columns = new ArrayList(var2);

		for (int var3 = 0; var3 < var2; ++var3) {
			this.field5617[var3] = (class563)class175.findEnumerated(class563.method10641(), var1.readUnsignedByte());
			int var4 = var1.packBytesToInt();
			HashMap var5 = new HashMap(var4);

			while (var4-- > 0) {
				Object var6 = this.field5617[var3].method10636(var1);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;IB)Ljava/util/List;",
		garbageValue = "94"
	)
	public List method10684(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var3 = (Map)this.columns.get(var2);
		return (List)var3.get(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1724326131"
	)
	public static final void method10688(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
