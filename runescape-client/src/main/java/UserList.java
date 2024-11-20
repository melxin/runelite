import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1670021313
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -258713925
	)
	@Export("size")
	int size;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lsv;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("ai")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("al")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("ar")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lsv;",
		garbageValue = "-27"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsv;",
		garbageValue = "1120116714"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1784042173"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-4711"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1902670675"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Z",
		garbageValue = "20786779"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Lsv;",
		garbageValue = "1642580880"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Lsv;",
		garbageValue = "503679298"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Lsv;",
		garbageValue = "1621329430"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Z",
		garbageValue = "-1823060923"
	)
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(Lsv;B)V",
		garbageValue = "82"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lwo;I)Lsv;",
		garbageValue = "1041415272"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lwo;Lwo;I)Lsv;",
		garbageValue = "582521774"
	)
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) {
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance();
			var3.set(var1, var2);
			this.arrayAddLast(var3);
			this.mapPut(var3);
			return var3;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsv;",
		garbageValue = "-80"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lwo;Lwo;I)V",
		garbageValue = "-76495419"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)I",
		garbageValue = "-1988814328"
	)
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)V",
		garbageValue = "821836991"
	)
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (this.usernamesMap.remove(var1.username) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.previousUsername != null) {
				this.previousUsernamesMap.remove(var1.previousUsername);
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lsv;B)V",
		garbageValue = "-53"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lsv;S)V",
		garbageValue = "1200"
	)
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}

	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-127859537"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "1986393710"
	)
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.comparator).addComparator(var1);
		}

	}
}
