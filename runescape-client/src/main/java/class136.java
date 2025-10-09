import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fq")
public class class136 implements Callable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class137 field1646;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class138 field1645;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class139 field1648;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1439190309
	)
	final int field1647;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Lfu;Lfk;Lfr;I)V"
	)
	class136(class145 var1, class137 var2, class138 var3, class139 var4, int var5) {
		this.this$0 = var1;
		this.field1646 = var2;
		this.field1645 = var3;
		this.field1648 = var4;
		this.field1647 = var5;
	}

	public Object call() {
		this.field1646.method3767();
		class137[][] var1;
		if (this.field1645 == class138.field1681) {
			var1 = this.this$0.field1730;
		} else {
			var1 = this.this$0.field1729;
		}

		var1[this.field1647][this.field1648.method3807()] = this.field1646;
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IB)Lnu;",
		garbageValue = "-115"
	)
	static MusicPatch method3756(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-359914663"
	)
	public static void method3754() {
		class179.field1915.clear();
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(ILcj;ZI)I",
		garbageValue = "-1386975789"
	)
	static int method3752(int var0, Script var1, boolean var2) {
		int var3;
		Object var4;
		int var5;
		DbTable var6;
		int var7;
		if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
			var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			var4 = WorldMap.method10995(var3);
			var5 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
			var6 = class275.getDbTable(var5);
			if (var6 == null) {
				throw new RuntimeException();
			} else {
				var7 = PlatformInfo.method10712(var5);
				PacketBufferNode.field3673 = var6.method11234(var4, var7);
				if (PacketBufferNode.field3673 != null) {
					Client.field362 = Actor.method2548(var5);
					Canvas.field95 = PacketBufferNode.field3673.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = PacketBufferNode.field3673.size();
					}
				} else {
					Client.field362 = -1;
					Canvas.field95 = null;
					if (var0 == ScriptOpcodes.DB_FIND_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = 0;
					}
				}

				return 1;
			}
		} else if (var0 != ScriptOpcodes.DB_FINDNEXT) {
			int var19;
			int var20;
			if (var0 == ScriptOpcodes.DB_GETFIELD) {
				UrlRequest.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 2];
				var20 = Actor.method2548(var19);
				var7 = GrandExchangeOfferOwnWorldComparator.method791(var19);
				int var21 = PlatformInfo.method10712(var19);
				DbRowType var26 = AddRequestTask.getDbRowType(var3);
				DbTableType var27 = class550.getDbTableType(var20);
				int[] var28 = var27.types[var7];
				int var12 = 0;
				int var13 = var28.length;
				if (var21 >= 0) {
					if (var21 >= var13) {
						throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
					}

					var12 = var21;
					var13 = var21 + 1;
				}

				Object[] var14 = var26.getColumnType(var7);
				if (var14 == null && var27.defaultValues != null) {
					var14 = var27.defaultValues[var7];
				}

				int var15;
				int var16;
				if (var14 == null) {
					for (var15 = var12; var15 < var13; ++var15) {
						var16 = var28[var15];
						class572 var22 = Tile.method4986(var16);
						if (var22 == class572.field5877) {
							Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = "";
						} else {
							Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = Archive.method8388(var16);
						}
					}

					return 1;
				} else {
					var15 = var14.length / var28.length;
					if (var5 >= 0 && var5 < var15) {
						for (var16 = var12; var16 < var13; ++var16) {
							int var17 = var16 + var28.length * var5;
							class572 var18 = Tile.method4986(var28[var16]);
							if (var18 == class572.field5877) {
								Interpreter.Interpreter_objectStack[++Message.Interpreter_objectStackSize - 1] = var14[var17];
							} else {
								Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (Integer)var14[var17];
							}
						}

						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			} else if (var0 == ScriptOpcodes.DB_GETFIELDCOUNT) {
				UrlRequest.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				var19 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize + 1];
				var5 = 0;
				var20 = Actor.method2548(var19);
				var7 = GrandExchangeOfferOwnWorldComparator.method791(var19);
				DbRowType var25 = AddRequestTask.getDbRowType(var3);
				DbTableType var9 = class550.getDbTableType(var20);
				int[] var10 = var9.types[var7];
				Object[] var11 = var25.getColumnType(var7);
				if (var11 == null && var9.defaultValues != null) {
					var11 = var9.defaultValues[var7];
				}

				if (var11 != null) {
					var5 = var11.length / var10.length;
				}

				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
				--UrlRequest.Interpreter_intStackSize;
				var3 = Interpreter.Interpreter_intStack[UrlRequest.Interpreter_intStackSize];
				DbTable var24 = KitDefinition.getDbTable2(var3);
				if (var24 == null) {
					throw new RuntimeException();
				} else {
					PacketBufferNode.field3673 = var24.method11234(0, 0);
					var5 = 0;
					if (PacketBufferNode.field3673 != null) {
						Client.field362 = var3;
						Canvas.field95 = PacketBufferNode.field3673.iterator();
						var5 = PacketBufferNode.field3673.size();
					}

					if (var0 == ScriptOpcodes.DB_FINDALL_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var5;
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.DB_GETROWTABLE) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				DbRowType var23 = AddRequestTask.getDbRowType(var3);
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var23.tableId;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_GETROW) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				var19 = -1;
				if (PacketBufferNode.field3673 != null && var3 >= 0 && var3 < PacketBufferNode.field3673.size()) {
					var19 = (Integer)PacketBufferNode.field3673.get(var3);
				}

				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = var19;
				return 1;
			} else if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
				var3 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				var4 = WorldMap.method10995(var3);
				var5 = Interpreter.Interpreter_intStack[--UrlRequest.Interpreter_intStackSize];
				var6 = class275.getDbTable(var5);
				if (var6 == null) {
					throw new RuntimeException();
				} else if (Actor.method2548(var5) != Client.field362) {
					throw new RuntimeException();
				} else if (PacketBufferNode.field3673 == null && PacketBufferNode.field3673.isEmpty()) {
					throw new RuntimeException();
				} else {
					var7 = PlatformInfo.method10712(var5);
					List var8 = var6.method11234(var4, var7);
					PacketBufferNode.field3673 = new LinkedList(PacketBufferNode.field3673);
					if (var8 != null) {
						PacketBufferNode.field3673.retainAll(var8);
					} else {
						PacketBufferNode.field3673.clear();
					}

					Canvas.field95 = PacketBufferNode.field3673.iterator();
					if (var0 == ScriptOpcodes.DB_FIND_FILTER_WITH_COUNT) {
						Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = PacketBufferNode.field3673.size();
					}

					return 1;
				}
			} else {
				return 2;
			}
		} else {
			if (Canvas.field95 != null && Canvas.field95.hasNext()) {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = (Integer)Canvas.field95.next();
			} else {
				Interpreter.Interpreter_intStack[++UrlRequest.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lcx;ZB)V",
		garbageValue = "21"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			class35.widgetDefinition.method7485(var2);
		}

		Projectile.method2014(var2);
		Widget var4 = class35.widgetDefinition.method7496(var3);
		if (var4 != null) {
			class154.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			HttpResponse.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
