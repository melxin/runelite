import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	public static AbstractArchive field2199;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1647284417
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -553794343
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -508160903
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("aw")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ap")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ay")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("au")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1858034947
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1708511037
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1496786229
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1682872219
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 442807121
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lxa;I)V",
		garbageValue = "3367135"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lxa;II)V",
		garbageValue = "-768977623"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "1024988090"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4564();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = ClientPacket.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) {
				if (this.orientation == 90) {
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}

				if (this.orientation == 270) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lky;",
		garbageValue = "99"
	)
	public final Model method4564() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-528275311"
	)
	public static int method4582(int var0) {
		return class342.field3880[var0];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-23468"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!SecureUrlRequester.client.containsAccessAndRefreshToken() && !SecureUrlRequester.client.otlTokenRequesterInitialized() && !SecureUrlRequester.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class30.method484(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.isEmpty()) {
				if (class468.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = class468.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			WorldMapDecoration.focusPasswordWhenUsernameFilled();
		} else {
			class30.method484(10);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lut;III)V",
		garbageValue = "-1027917603"
	)
	public static void method4573(DynamicArray var0, int var1, int var2) {
		class461.method9375(var0, (class586)null, true);
		if (var1 != 0) {
			if (var2 >= 0 && var2 < var0.size * 1583568339 && var1 >= 0 && var2 + var1 <= var0.size * 1583568339) {
				if (var2 < var0.size * 1583568339 - var1) {
					HttpResponse.method296(var0, var2 + var1, var0, var2, var0.size * 1583568339 - (var2 + var1));
				}

				var0.method10649(var0.size * 1583568339 - var1);
			} else {
				throw new RuntimeException();
			}
		}
	}
}
