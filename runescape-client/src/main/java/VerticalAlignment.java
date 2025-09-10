import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	field2172(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	field2167(0, 2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1187839087
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 649050899
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1935172756"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1787603990"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lha;",
		garbageValue = "-26"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < class255.WorldMapElement_cached.length && class255.WorldMapElement_cached[var0] != null ? class255.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcg;ZB)I",
		garbageValue = "0"
	)
	static int method4393(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class268.method6044(var0, var1, var2);
		} else if (var0 < 1100) {
			return VarpDefinition.method4175(var0, var1, var2);
		} else if (var0 < 1200) {
			return Archive.method8327(var0, var1, var2);
		} else if (var0 < 1300) {
			return Varps.method7403(var0, var1, var2);
		} else if (var0 < 1400) {
			return WorldMapLabel.method6828(var0, var1, var2);
		} else if (var0 < 1500) {
			return class314.method6972(var0, var1, var2);
		} else if (var0 < 1600) {
			return HttpRequest.method98(var0, var1, var2);
		} else if (var0 < 1700) {
			return class27.method414(var0, var1, var2);
		} else if (var0 < 1800) {
			return class30.method473(var0, var1, var2);
		} else if (var0 < 1900) {
			return LoginScreenAnimation.method2532(var0, var1, var2);
		} else if (var0 < 2000) {
			return class83.method2795(var0, var1, var2);
		} else if (var0 < 2100) {
			return VarpDefinition.method4175(var0, var1, var2);
		} else if (var0 < 2200) {
			return Archive.method8327(var0, var1, var2);
		} else if (var0 < 2300) {
			return Varps.method7403(var0, var1, var2);
		} else if (var0 < 2400) {
			return WorldMapLabel.method6828(var0, var1, var2);
		} else if (var0 < 2500) {
			return class314.method6972(var0, var1, var2);
		} else if (var0 < 2600) {
			return class33.method504(var0, var1, var2);
		} else if (var0 < 2700) {
			return MenuAction.method1891(var0, var1, var2);
		} else if (var0 < 2800) {
			return SwapSongTask.method9643(var0, var1, var2);
		} else if (var0 < 2900) {
			return SecureRandomFuture.method1982(var0, var1, var2);
		} else if (var0 < 3000) {
			return class83.method2795(var0, var1, var2);
		} else if (var0 < 3200) {
			return FontName.method10849(var0, var1, var2);
		} else if (var0 < 3300) {
			return class197.method4389(var0, var1, var2);
		} else if (var0 < 3400) {
			return class144.method3739(var0, var1, var2);
		} else if (var0 < 3500) {
			return class479.method9675(var0, var1, var2);
		} else if (var0 < 3600) {
			return GrandExchangeOfferOwnWorldComparator.method789(var0, var1, var2);
		} else if (var0 < 3700) {
			return class207.method4514(var0, var1, var2);
		} else if (var0 < 3800) {
			return ArchiveDiskActionHandler.method8285(var0, var1, var2);
		} else if (var0 < 3900) {
			return class486.method9789(var0, var1, var2);
		} else if (var0 < 4000) {
			return PlayerUpdateManager.method2871(var0, var1, var2);
		} else if (var0 < 4100) {
			return Message.method766(var0, var1, var2);
		} else if (var0 < 4200) {
			return InterfaceParent.method2131(var0, var1, var2);
		} else if (var0 < 4300) {
			return IndexCheck.method6160(var0, var1, var2);
		} else if (var0 < 5100) {
			return class146.method3752(var0, var1, var2);
		} else if (var0 < 5400) {
			return FadeOutTask.method9652(var0, var1, var2);
		} else if (var0 < 5600) {
			return class268.method6043(var0, var1, var2);
		} else if (var0 < 5700) {
			return class115.method3460(var0, var1, var2);
		} else if (var0 < 6300) {
			return class256.method5829(var0, var1, var2);
		} else if (var0 < 6600) {
			return GameEngine.method528(var0, var1, var2);
		} else if (var0 < 6700) {
			return class390.method8217(var0, var1, var2);
		} else if (var0 < 6800) {
			return class160.method3896(var0, var1, var2);
		} else if (var0 < 6900) {
			return Widget.method8101(var0, var1, var2);
		} else if (var0 < 7000) {
			return GameEngine.method686(var0, var1, var2);
		} else if (var0 < 7100) {
			return SpriteMask.method7397(var0, var1, var2);
		} else if (var0 < 7200) {
			return class525.method10444(var0, var1, var2);
		} else if (var0 < 7500) {
			return class240.method5444(var0, var1, var2);
		} else if (var0 < 7600) {
			return MouseRecorder.method2152(var0, var1, var2);
		} else if (var0 < 7700) {
			return class376.method8155(var0, var1, var2);
		} else if (var0 < 8000) {
			return class108.method3378(var0, var1, var2);
		} else if (var0 < 8100) {
			return class183.method4176(var0, var1, var2);
		} else {
			return var0 >= 13000 && var0 < 14000 ? class410.method8330(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbp;B)V",
		garbageValue = "-4"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != class303.ItemDefinition_inMembersWorld) {
				class167.method4031();
				class303.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			UserComparator5.method3559(Friend.archive8, var0.properties);
		}

		MouseHandler.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		WorldMapElement.field1997 = var0.field638;
		class431.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		DesktopPlatformInfoProvider.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class151.currentPort = class431.worldPort;
	}
}
