import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4909("", 0, new class422[]{class422.field4874, class422.field4878}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4894("", 1, new class422[]{class422.field4873, class422.field4874, class422.field4878}),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4895("", 2, new class422[]{class422.field4873, class422.field4872, class422.field4874}),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4896("", 3, new class422[]{class422.field4873}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4908("", 4),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4893("", 5, new class422[]{class422.field4873, class422.field4874}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4899("", 6, new class422[]{class422.field4874}),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4900("", 8, new class422[]{class422.field4873, class422.field4874}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4901("", 9, new class422[]{class422.field4873, class422.field4872}),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4898("", 10, new class422[]{class422.field4873}),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4902("", 11, new class422[]{class422.field4873}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4904("", 12, new class422[]{class422.field4873, class422.field4874}),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	field4910("", 13, new class422[]{class422.field4873});

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	static Archive field4905;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -74981187
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ak")
	final Set field4907;

	static {
		method8385();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lqe;)V"
	)
	ModeWhere(String var3, int var4, class422[] var5) {
		this.field4907 = new HashSet();
		this.id = var4;
		class422[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class422 var8 = var6[var7];
			this.field4907.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4907 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lcs;I)V",
		garbageValue = "518781276"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		GrandExchangeOfferAgeComparator.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqm;",
		garbageValue = "-1770303370"
	)
	static ModeWhere[] method8385() {
		return new ModeWhere[]{field4893, field4899, field4909, field4904, field4898, field4901, field4894, field4908, field4896, field4902, field4910, field4895, field4900};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILcr;ZI)I",
		garbageValue = "-175823994"
	)
	static int method8388(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return AsyncHttpResponse.method288(var0, var1, var2);
		} else if (var0 < 1100) {
			return WidgetDefinition.method7300(var0, var1, var2);
		} else if (var0 < 1200) {
			return class362.method7307(var0, var1, var2);
		} else if (var0 < 1300) {
			return MusicPatchPcmStream.method7126(var0, var1, var2);
		} else if (var0 < 1400) {
			return DynamicObject.method1993(var0, var1, var2);
		} else if (var0 < 1500) {
			return HttpResponse.method298(var0, var1, var2);
		} else if (var0 < 1600) {
			return HitSplatDefinition.method4396(var0, var1, var2);
		} else if (var0 < 1700) {
			return FloatProjection.method5424(var0, var1, var2);
		} else if (var0 < 1800) {
			return class163.method3833(var0, var1, var2);
		} else if (var0 < 1900) {
			return class338.method7098(var0, var1, var2);
		} else if (var0 < 2000) {
			return UserComparator7.method3402(var0, var1, var2);
		} else if (var0 < 2100) {
			return WidgetDefinition.method7300(var0, var1, var2);
		} else if (var0 < 2200) {
			return class362.method7307(var0, var1, var2);
		} else if (var0 < 2300) {
			return MusicPatchPcmStream.method7126(var0, var1, var2);
		} else if (var0 < 2400) {
			return DynamicObject.method1993(var0, var1, var2);
		} else if (var0 < 2500) {
			return HttpResponse.method298(var0, var1, var2);
		} else if (var0 < 2600) {
			return class365.method7314(var0, var1, var2);
		} else if (var0 < 2700) {
			return class33.method479(var0, var1, var2);
		} else if (var0 < 2800) {
			return class563.method10633(var0, var1, var2);
		} else if (var0 < 2900) {
			return class527.method10165(var0, var1, var2);
		} else if (var0 < 3000) {
			return UserComparator7.method3402(var0, var1, var2);
		} else if (var0 < 3200) {
			return class320.method6826(var0, var1, var2);
		} else if (var0 < 3300) {
			return class363.method7308(var0, var1, var2);
		} else if (var0 < 3400) {
			return class330.method6846(var0, var1, var2);
		} else if (var0 < 3500) {
			return class51.method1867(var0, var1, var2);
		} else if (var0 < 3600) {
			return class476.method9446(var0, var1, var2);
		} else if (var0 < 3700) {
			return class424.method8363(var0, var1, var2);
		} else if (var0 < 3800) {
			return class218.method4699(var0, var1, var2);
		} else if (var0 < 3900) {
			return AsyncRestClient.method183(var0, var1, var2);
		} else if (var0 < 4000) {
			return DevicePcmPlayerProvider.method325(var0, var1, var2);
		} else if (var0 < 4100) {
			return class4.method12(var0, var1, var2);
		} else if (var0 < 4200) {
			return WorldMapLabelSize.method6172(var0, var1, var2);
		} else if (var0 < 4300) {
			return class506.method9925(var0, var1, var2);
		} else if (var0 < 5100) {
			return UrlRequester.method3349(var0, var1, var2);
		} else if (var0 < 5400) {
			return class201.method4293(var0, var1, var2);
		} else if (var0 < 5600) {
			return ModelData0.method5839(var0, var1, var2);
		} else if (var0 < 5700) {
			return MoveSpeed.method6101(var0, var1, var2);
		} else if (var0 < 6300) {
			return ServerPacket.method6842(var0, var1, var2);
		} else if (var0 < 6600) {
			return class30.method450(var0, var1, var2);
		} else if (var0 < 6700) {
			return HorizontalAlignment.method4145(var0, var1, var2);
		} else if (var0 < 6800) {
			return ClanSettings.method3808(var0, var1, var2);
		} else if (var0 < 6900) {
			return ClientPreferences.method2470(var0, var1, var2);
		} else if (var0 < 7000) {
			return class282.method6157(var0, var1, var2);
		} else if (var0 < 7100) {
			return CollisionMap.method5951(var0, var1, var2);
		} else if (var0 < 7200) {
			return DbRowType.method10713(var0, var1, var2);
		} else if (var0 < 7500) {
			return class280.method6141(var0, var1, var2);
		} else if (var0 < 7600) {
			return HealthBarConfig.method2566(var0, var1, var2);
		} else if (var0 < 7700) {
			return Language.method8369(var0, var1, var2);
		} else if (var0 < 8000) {
			return class220.method4720(var0, var1, var2);
		} else {
			return var0 < 8100 ? class576.method10779(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "895132688"
	)
	static void method8389() {
		if (class7.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}
}
