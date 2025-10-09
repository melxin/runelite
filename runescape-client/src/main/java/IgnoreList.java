import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	final LoginType field5425;

	@ObfuscatedSignature(
		descriptor = "(Lvt;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field5425 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltk;",
		garbageValue = "1771695542"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltk;",
		garbageValue = "-78"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lwj;IB)V",
		garbageValue = "17"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field5425);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				KitDefinition.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field5425);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field5425);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lxv;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}
}
