import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ip")
	static List field5105;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	final LoginType field5107;

	@ObfuscatedSignature(
		descriptor = "(Luw;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field5107 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lsh;",
		garbageValue = "-1223410224"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lsh;",
		garbageValue = "11"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lve;II)V",
		garbageValue = "-1564274723"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset * -2066221813 < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field5107);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				class223.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field5107);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field5107);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var8 != var7) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6);
				} else if (this.getSize() < 400) {
					int var9 = this.getSize();
					var7 = (Ignored)this.addLast(var5, var6);
					var7.id = var9;
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lph;B)V",
		garbageValue = "85"
	)
	public static void method9127(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}
}
