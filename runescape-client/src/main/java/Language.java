import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("qd")
@Implements("Language")
public class Language implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_EN")
	public static final Language Language_EN;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_DE")
	static final Language Language_DE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_FR")
	public static final Language Language_FR;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_PT")
	static final Language Language_PT;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_NL")
	static final Language Language_NL;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_ES")
	public static final Language Language_ES;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqd;"
	)
	@Export("Language_ES_MX")
	static final Language Language_ES_MX;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	@Export("Language_valuesOrdered")
	static final Language[] Language_valuesOrdered;
	@ObfuscatedName("an")
	static int[] field5129;
	@ObfuscatedName("aq")
	final String field5130;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1262118747
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ap")
	@Export("language")
	final String language;

	static {
		Language_EN = new Language("EN", "en", "English", ModeWhere.field5134, 0, "GB");
		Language_DE = new Language("DE", "de", "German", ModeWhere.field5134, 1, "DE");
		Language_FR = new Language("FR", "fr", "French", ModeWhere.field5134, 2, "FR");
		Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field5134, 3, "BR");
		Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field5133, 4, "NL");
		Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field5133, 5, "ES");
		Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field5134, 6, "MX");
		Language[] var0 = method8712();
		Language_valuesOrdered = new Language[var0.length];
		Language[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			Language var3 = var1[var2];
			if (Language_valuesOrdered[var3.id] != null) {
				throw new IllegalStateException();
			}

			Language_valuesOrdered[var3.id] = var3;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqq;ILjava/lang/String;)V"
	)
	Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
		this.field5130 = var1;
		this.language = var2;
		this.id = var5;
		if (var6 != null) {
			new Locale(var2.substring(0, 2), var6);
		} else {
			new Locale(var2.substring(0, 2));
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1012656358"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1635636140"
	)
	@Export("getLanguage")
	String getLanguage() {
		return this.language;
	}

	public String toString() {
		return this.getLanguage().toLowerCase(Locale.ENGLISH);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lwn;B)V",
		garbageValue = "-1"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class35.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqd;",
		garbageValue = "-495424354"
	)
	static Language[] method8712() {
		return new Language[]{Language_ES, Language_FR, Language_NL, Language_EN, Language_ES_MX, Language_DE, Language_PT};
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqd;",
		garbageValue = "1"
	)
	public static Language method8701(int var0) {
		return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
	}
}
