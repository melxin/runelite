import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lwo;"
	)
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)I",
		garbageValue = "-1712642331"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)Lwo;",
		garbageValue = "-1004725628"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-60"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "84"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lwo;Lwo;I)V",
		garbageValue = "-674168683"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((User)var1);
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lnp;IIB)V",
		garbageValue = "48"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = BuddyRankComparator.method3253(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					Widget var5 = var0;
					int var7 = Renderable.getWidgetFlags(var0);
					int var6 = var7 >> 17 & 7;
					int var8 = var6;
					if (var6 == 0) {
						var4 = null;
					} else {
						int var9 = 0;

						while (true) {
							if (var9 >= var8) {
								var4 = var5;
								break;
							}

							var5 = class379.widgetDefinition.method6875(var5.parentId);
							if (var5 == null) {
								var4 = null;
								break;
							}

							++var9;
						}
					}

					Widget var10 = var4;
					if (var4 == null) {
						var10 = var0.parent;
					}

					Client.clickedWidgetParent = var10;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					class383.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var11 = class217.method4387();
					if (var11 != -1) {
						Varcs.method3075(var11);
					}

					return;
				}
			}

		}
	}
}
