import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rn")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("aj")
	@Export("soundSystemExecutor")
	public static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	MidiRequest field5030;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 774832513
	)
	int field5029;

	@ObfuscatedSignature(
		descriptor = "(Lro;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field5030 = null;
		this.field5029 = 0;
		super.field5039 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class335.field3694.size()) {
				this.field5030 = (MidiRequest)class335.field3694.get(var2);
			} else if (!var3 && var2 < class335.midiRequests.size()) {
				this.field5030 = (MidiRequest)class335.midiRequests.get(var2);
			}

			this.field5029 = var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1093204820"
	)
	public boolean vmethod8938() {
		if (this.field5030 != null && this.field5030.midiPcmStream != null) {
			this.field5030.field3819 = true;

			try {
				if (this.field5030.field3815 > 0.0F && this.field5030.midiPcmStream.isReady()) {
					float var1 = this.field5029 == 0 ? (float)this.field5029 : (float)this.field5030.musicTrackVolume / (float)this.field5029;
					MidiRequest var10000 = this.field5030;
					var10000.field3815 -= 0.0F == var1 ? (float)this.field5030.musicTrackVolume : var1;
					if (this.field5030.field3815 < 0.0F) {
						this.field5030.field3815 = 0.0F;
					}

					this.field5030.midiPcmStream.setPcmStreamVolume((int)this.field5030.field3815);
					return false;
				}
			} catch (Exception var3) {
				this.method8920(var3.getMessage());
				return true;
			}

			this.field5030.field3819 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FZI)F",
		garbageValue = "-798688116"
	)
	static float method8909(class135 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3320() != 0) {
			float var4 = (float)var0.field1598[0].field1537;
			float var5 = (float)var0.field1598[var0.method3320() - 1].field1537;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1598[0].field1534;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1586 == class133.field1568) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1586 != class133.field1566 && var0.field1586 != class133.field1567) {
						if (var0.field1586 == class133.field1574) {
							var10 = var4 - var1;
							var13 = var0.field1598[0].field1535;
							var14 = var0.field1598[0].field1541;
							var3 = var0.field1598[0].field1534;
							if (var13 != 0.0F) {
								var3 -= var10 * var14 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1587 == class133.field1568) {
					if (var9 != 0.0F) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1587 != class133.field1566 && var0.field1587 != class133.field1567) {
					if (var0.field1587 == class133.field1574) {
						var10 = var1 - var5;
						var13 = var0.field1598[var0.method3320() - 1].field1538;
						var14 = var0.field1598[var0.method3320() - 1].field1536;
						var3 = var0.field1598[var0.method3320() - 1].field1534;
						if (0.0F != var13) {
							var3 += var10 * var14 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = class445.method8520(var0, var10);
				float var15;
				if (var2 && var0.field1586 == class133.field1567) {
					var15 = var0.field1598[var0.method3320() - 1].field1534 - var0.field1598[0].field1534;
					var3 -= var15 * var8;
				} else if (!var2 && var0.field1587 == class133.field1567) {
					var15 = var0.field1598[var0.method3320() - 1].field1534 - var0.field1598[0].field1534;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}
