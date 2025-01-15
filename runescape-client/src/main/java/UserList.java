import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("tx")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1177259493
	)
	@Export("capacity")
	final int capacity;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1595213487
	)
	@Export("size")
	int size;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lso;"
	)
	@Export("array")
	User[] array;
	@ObfuscatedName("as")
	@Export("usernamesMap")
	HashMap usernamesMap;
	@ObfuscatedName("aq")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;
	@ObfuscatedName("af")
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lso;",
		garbageValue = "35"
	)
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[Lso;",
		garbageValue = "-1808909632"
	)
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1394017379"
	)
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, (Object)null);
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657712133"
	)
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "653055413"
	)
	@Export("isFull")
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)Z",
		garbageValue = "-71"
	)
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)Lso;",
		garbageValue = "1"
	)
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Lso;",
		garbageValue = "712815494"
	)
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Lso;",
		garbageValue = "-996360738"
	)
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lwb;I)Z",
		garbageValue = "-605591244"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lso;I)V",
		garbageValue = "-1907086989"
	)
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lwb;B)Lso;",
		garbageValue = "1"
	)
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, (Username)null);
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lwb;Lwb;I)Lso;",
		garbageValue = "1721213229"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)Lso;",
		garbageValue = "-194587924"
	)
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lwb;Lwb;I)V",
		garbageValue = "-1662599861"
	)
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lso;I)I",
		garbageValue = "715861802"
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(Lso;S)V",
		garbageValue = "12018"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Lso;I)V",
		garbageValue = "1325537687"
	)
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lso;B)V",
		garbageValue = "-18"
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-62"
	)
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1045943049"
	)
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "-589206410"
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
