import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("aq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("av")
	public boolean field4917;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -1919247549771439375L
	)
	long field4918;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = 6950906862030424291L
	)
	long field4919;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 8255456635969114289L
	)
	long field4920;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -1812830717920301363L
	)
	long field4921;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -6038534748471789L
	)
	long field4922;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -721637661
	)
	int field4923;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2028974083
	)
	int field4924;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2023939493
	)
	int field4925;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 284638697
	)
	int field4926;

	public Timer() {
		this.field4917 = false;
		this.field4918 = -1L;
		this.field4919 = -1L;
		this.field4920 = 0L;
		this.field4921 = 0L;
		this.field4922 = 0L;
		this.field4923 = 0;
		this.field4924 = 0;
		this.field4925 = 0;
		this.field4926 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1782072860"
	)
	public void method8500() {
		this.field4918 = ParamComposition.method4708();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-378949484"
	)
	public void method8499() {
		if (-1L != this.field4918) {
			this.field4921 = ParamComposition.method4708() - this.field4918;
			this.field4918 = -1L;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1573036037"
	)
	public void method8507(int var1) {
		this.field4919 = ParamComposition.method4708();
		this.field4923 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	public void method8495() {
		if (-1L != this.field4919) {
			this.field4920 = ParamComposition.method4708() - this.field4919;
			this.field4919 = -1L;
		}

		++this.field4925;
		this.field4917 = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	public void method8503() {
		this.field4917 = false;
		this.field4924 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1860099921"
	)
	public void method8496() {
		this.method8495();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lxa;B)V",
		garbageValue = "21"
	)
	@Export("write")
	public void write(Buffer var1) {
		WorldMapDecoration.method7008(var1, this.field4921);
		WorldMapDecoration.method7008(var1, this.field4920);
		WorldMapDecoration.method7008(var1, this.field4922);
		var1.writeShort(this.field4923);
		var1.writeShort(this.field4924);
		var1.writeShort(this.field4925);
		var1.writeShort(this.field4926);
	}
}
