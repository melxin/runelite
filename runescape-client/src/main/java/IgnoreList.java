import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ru")
@Implements("IgnoreList")
public class IgnoreList extends UserList {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	final LoginType field4975;

	@ObfuscatedSignature(
		descriptor = "(Luo;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400);
		this.field4975 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lso;",
		garbageValue = "35"
	)
	@Export("newInstance")
	User newInstance() {
		return new Ignored();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lso;",
		garbageValue = "-1808909632"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new Ignored[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "815722454"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 4) {
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4975);
				if (!var10.hasCleanName()) {
					throw new IllegalStateException();
				}

				boolean var11 = false;
				HttpRequest.friendSystem.removeIgnore(var10.getName(), var11);
			} else {
				boolean var4 = (var3 & 1) != 0;
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4975);
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4975);
				var1.readStringCp1252NullTerminated();
				if (!var5.hasCleanName()) {
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5);
				if (var4) {
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6);
					if (var8 != null && var7 != var8) {
						if (var7 != null) {
							this.remove(var8);
						} else {
							var7 = var8;
						}
					}
				}

				if (var7 != null) {
					this.changeName(var7, var5, var6);
				} else if (this.getSize() < 400) {
					int var9 = this.getSize();
					var7 = (Ignored)this.addLast(var5, var6);
					var7.id = var9;
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvy;II)V",
		garbageValue = "1528495712"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = HttpJsonRequestBody.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = HttpJsonRequestBody.loadClassFromDescriptor(var20);
						if (HttpJsonRequestBody.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = HttpJsonRequestBody.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var21.length == var17.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (HttpJsonRequestBody.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(HttpJsonRequestBody.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class36.reflectionChecks.addFirst(var2);
	}
}
