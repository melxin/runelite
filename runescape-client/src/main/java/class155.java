import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class155 extends class165 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1619462585
	)
	int field1780;
	@ObfuscatedName("ab")
	byte field1781;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1403756883
	)
	int field1782;
	@ObfuscatedName("av")
	String field1783;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	final class166 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgp;)V"
	)
	class155(class166 var1) {
		this.this$0 = var1;
		this.field1780 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lwj;I)V",
		garbageValue = "-2035870878"
	)
	void vmethod4076(Buffer var1) {
		this.field1780 = var1.readUnsignedShort();
		this.field1781 = var1.readByte();
		this.field1782 = var1.readUnsignedShort();
		var1.readLong();
		this.field1783 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lgw;B)V",
		garbageValue = "19"
	)
	void vmethod4077(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1780);
		var2.rank = this.field1781;
		var2.world = this.field1782;
		var2.username = new Username(this.field1783);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "248211996"
	)
	static char method3843(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)F",
		garbageValue = "-2068541835"
	)
	static final float method3844(float var0, float var1, float var2, float var3) {
		return var1 * var3 + var0 * var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbg;I)V",
		garbageValue = "-1816574528"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			UserComparator10.method3540(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			class449.method9087(class188.archive8, var0.properties);
		}

		Interpreter.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class31.field148 = var0.field617;
		UserComparator6.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		HealthBarDefinition.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class341.currentPort = UserComparator6.worldPort;
	}
}
