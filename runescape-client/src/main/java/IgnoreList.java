import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	final LoginType field5163;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field5163 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "1"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsi;",
		garbageValue = "-308089342"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lwt;II)V",
		garbageValue = "-197016394"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field5163);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				Actor.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field5163);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field5163);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) {
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

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ldl;IIB)Lre;",
		garbageValue = "63"
	)
	static class445 method9505(WorldView var0, int var1, int var2) {
		if (var0 != null && Sound.topLevelWorldView != var0) {
			WorldEntity var3 = (WorldEntity)Sound.topLevelWorldView.worldEntities.get((long)var0.id);
			return var3 == null ? class47.method1781((float)var1, 0.0F, (float)var2) : var3.method9718(var1, var2);
		} else {
			return class47.method1781((float)var1, 0.0F, (float)var2);
		}
	}
}
