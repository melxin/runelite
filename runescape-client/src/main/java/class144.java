import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fe")
public class class144 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 722593713
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lxj;I)V",
		garbageValue = "333726310"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class117.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset * 2108391709;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-325775967"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "1609045112"
	)
	static char method3896(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[Llz;",
		garbageValue = "620885831"
	)
	public static MoveSpeed[] method3894() {
		return new MoveSpeed[]{MoveSpeed.field3304, MoveSpeed.field3299, MoveSpeed.field3300, MoveSpeed.field3301};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([F[II)V",
		garbageValue = "-1459225483"
	)
	public static void method3897(float[] var0, int[] var1) {
		class596.method11561(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	static void method3892() {
		if (class166.varcs != null && class166.varcs.hasUnwrittenChanges()) {
			class166.varcs.write();
		}

		class108.method3522();
		AbstractSocket.method10404();
		if (class535.mouseRecorder != null) {
			class535.mouseRecorder.isRunning = false;
		}

		class535.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var2) {
			}
		}

		GameEngine.taskHandler = null;
		WorldMapElement.clear();
		FloorUnderlayDefinition.method4606();
		Client.worldViewManager.clear();
		Client.projectiles.clear();
		Skills.worldMap = null;
		class167.method4167(0, 0);
		class179.method4284();
		Client.playingJingle = false;
		class356.method7610();
		if (Skills.pcmPlayer1 != null) {
			Skills.pcmPlayer1.shutdown();
		}

		VarbitComposition.field2279.method8715();
		class300.method6918();
		if (class164.urlRequester != null) {
			class164.urlRequester.close();
		}

		UserComparator7.method3702();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		UserComparator9.JagexCache_idxFiles = null;
		ObjectComposition.method4796();
		InterfaceParent.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field555 = 0;
		VarbitComposition.field2279 = new JagNetThread();
		class164.urlRequester = new SecureUrlRequester(SecureUrlRequester.client.https, 235);

		try {
			class62.method2173("oldschool", class365.field4083, class1.field2.name, 0, 25);
		} catch (IOException var1) {
			throw new RuntimeException(var1);
		}

		InterfaceParent.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 750000);
		GameEngine.taskHandler = new TaskHandler();
		SecureUrlRequester.client.method539();
		HitSplatDefinition.method4773(class69.field935);
		WorldMapSectionType.updateGameState(0);
	}
}
