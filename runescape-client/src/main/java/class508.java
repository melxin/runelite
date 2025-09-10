import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public class class508 extends class507 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1524088059
	)
	static final int field5439;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	final WorldEntityCoord field5437;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	final WorldEntityCoord field5438;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -321872719
	)
	int field5440;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1078397815
	)
	int field5436;

	static {
		field5439 = Client.revision + 3;
	}

	class508() {
		this.field5437 = new WorldEntityCoord();
		this.field5438 = new WorldEntityCoord();
		this.field5440 = 0;
		this.field5436 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lky;Ltn;II)V",
		garbageValue = "-2073083460"
	)
	void vmethod10152(WorldEntityCoord var1, class506 var2, int var3) {
		this.field5437.method6282(var1);
		this.field5438.method6282(var2.field5434);
		this.field5440 = var3 - 1;
		this.field5436 = var2.field5433 + field5439;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lky;III)Z",
		garbageValue = "-1327234875"
	)
	boolean vmethod10149(WorldEntityCoord var1, int var2, int var3) {
		if (this.field5440 >= this.field5436) {
			var1.method6282(this.field5438);
			return true;
		} else {
			float var4 = class33.method506(var2, this.field5440, this.field5436);
			WorldEntityCoord var5 = this.field5437;
			WorldEntityCoord var6 = this.field5438;
			float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
			int var9 = var6.getX() - var5.getX();
			int var10 = var6.getY() - var5.getY();
			var9 = (int)(var8 * (float)var9);
			var10 = (int)((float)var10 * var8);
			var1.method6275(var5.getX() + var9, var5.getY() + var10);
			int var11 = class166.method4030(var5.getCurrentRotationAngle(), var6.getCurrentRotationAngle());
			var11 = (int)(var8 * (float)var11);
			var1.setCurrentRotationAngle(var5.getCurrentRotationAngle() + var11);
			return var4 >= 1.0F;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-166288193"
	)
	void vmethod10151(int var1, int var2) {
		this.field5437.setDirection(var1, var2);
		this.field5438.setDirection(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1659314821"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label64:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label64;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field6088 + "&u=" + RunException.field6086 + "&v1=" + TaskHandler.javaVendor + "&v2=" + BuddyRankComparator.javaVersion + "&ct=" + RunException.field6089 + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}
}
