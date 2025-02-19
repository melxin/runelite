import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lst;Lst;I)I",
		garbageValue = "-347884592"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpl;I)V",
		garbageValue = "-1319646134"
	)
	public static void method3234(AbstractArchive var0) {
		GrandExchangeOfferUnitPriceComparator.InvDefinition_archive = var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIIIIIIB)Z",
		garbageValue = "66"
	)
	static final boolean method3223(Model var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		boolean var9 = ViewportMouse.ViewportMouse_isInViewport;
		if (!var9) {
			return false;
		} else {
			class443.method8380(var5, var6, var7, var8);
			class246 var10 = var0.getAABB(var1);
			int var11 = var2 + var10.field2793;
			int var12 = var3 + var10.field2794;
			int var13 = var4 + var10.field2798;
			int var14 = var10.field2796;
			int var15 = var10.field2797;
			int var16 = var10.field2801;
			int var17 = ViewportMouse.field2952 - var11;
			int var18 = ViewportMouse.field2953 - var12;
			int var19 = class202.field2160 - var13;
			if (Math.abs(var17) > var14 + ViewportMouse.field2955) {
				return false;
			} else if (Math.abs(var18) > var15 + class95.field1188) {
				return false;
			} else if (Math.abs(var19) > var16 + class159.field1784) {
				return false;
			} else if (Math.abs(var19 * class376.field4168 - var18 * ViewportMouse.field2960) > var16 * class95.field1188 + var15 * class159.field1784) {
				return false;
			} else if (Math.abs(var17 * ViewportMouse.field2960 - var19 * ClanChannelMember.field1737) > var16 * ViewportMouse.field2955 + var14 * class159.field1784) {
				return false;
			} else {
				return Math.abs(var18 * ClanChannelMember.field1737 - var17 * class376.field4168) <= var15 * ViewportMouse.field2955 + var14 * class95.field1188;
			}
		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(ILdy;ZB)I",
		garbageValue = "88"
	)
	static int method3233(int var0, Script var1, boolean var2) {
		if (var0 == 7900) {
			int var3 = Interpreter.Interpreter_intStack[--HealthBarConfig.Interpreter_intStackSize];
			Client.field778 = Math.max(var3, 0);
			return 1;
		} else if (var0 == 7901) {
			Interpreter.Interpreter_intStack[++HealthBarConfig.Interpreter_intStackSize - 1] = Client.field778;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1245308508"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class60.logOut();
		switch(var0) {
		case 1:
			ObjectComposition.method4206(24);
			class401.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			ObjectComposition.method4206(24);
			class401.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
