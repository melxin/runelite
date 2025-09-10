import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	final LoginType field5370;

	@ObfuscatedSignature(
		descriptor = "(Lva;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field5370 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ltl;",
		garbageValue = "690274569"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltl;",
		garbageValue = "-102"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwb;II)V",
		garbageValue = "1440234999"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset * 1216585693 < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field5370);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				ApproximateRouteStrategy.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field5370);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field5370);
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Loi;IB)V",
		garbageValue = "-1"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field4223 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4295 == null) {
				var0.field4295 = new int[var0.field4223.length];
			}

			var0.field4295[var1] = Integer.MAX_VALUE;
		}
	}
}
