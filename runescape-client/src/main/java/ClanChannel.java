import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("ab")
	boolean field1864;
	@ObfuscatedName("ay")
	boolean field1861;
	@ObfuscatedName("au")
	@Export("members")
	public List members;
	@ObfuscatedName("ad")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 3536578833763292603L
	)
	public long field1858;
	@ObfuscatedName("ac")
	@Export("name")
	public String name;
	@ObfuscatedName("ao")
	public byte field1863;
	@ObfuscatedName("af")
	public byte field1857;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvy;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1861 = true;
		this.name = null;
		this.method3675(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-34"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.members.size()];
			this.sortedMembers = new int[this.members.size()];

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method10912();
			}

			PlayerCompositionColorTextureOverride.method3724(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfi;S)V",
		garbageValue = "23523"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-683029574"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1);
		this.sortedMembers = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "27175"
	)
	public int method3665() {
		return this.members.size();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "1"
	)
	public int method3661(String var1) {
		if (!this.field1861) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) {
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvy;B)V",
		garbageValue = "-60"
	)
	void method3675(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field1864 = true;
		}

		if ((var2 & 2) != 0) {
			this.field1861 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field1858 = var1.readLong();
		this.name = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field1857 = var1.readByte();
		this.field1863 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.members = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanChannelMember var6 = new ClanChannelMember();
				if (this.field1864) {
					var1.readLong();
				}

				if (this.field1861) {
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte();
				var6.world = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.members.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Ljava/lang/String;Ljava/lang/String;I)Lws;",
		garbageValue = "-860354333"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			byte[] var7 = var0.takeFile(var3, var4);
			boolean var6;
			if (var7 == null) {
				var6 = false;
			} else {
				class478.SpriteBuffer_decode(var7);
				var6 = true;
			}

			IndexedSprite var5;
			if (!var6) {
				var5 = null;
			} else {
				IndexedSprite var8 = new IndexedSprite();
				var8.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var8.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var8.xOffset = Canvas.SpriteBuffer_xOffsets[0];
				var8.yOffset = class194.SpriteBuffer_yOffsets[0];
				var8.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
				var8.subHeight = class456.SpriteBuffer_spriteHeights[0];
				var8.palette = DbTable.SpriteBuffer_spritePalette;
				var8.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
				CollisionMap.method5672();
				var5 = var8;
			}

			return var5;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([[[IIIII)V",
		garbageValue = "996651896"
	)
	static final void method3672(int[][][] var0, int var1, int var2, int var3) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				var0[var1][var4 + var2][var3 + var5] = 0;
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var2][var3 + var4] = var0[var1][var2 - 1][var3 + var4];
			}
		}

		if (var3 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				var0[var1][var4 + var2][var3] = var0[var1][var4 + var2][var3 - 1];
			}
		}

		if (var2 > 0 && var0[var1][var2 - 1][var3] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3];
		} else if (var3 > 0 && var0[var1][var2][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2][var3 - 1];
		} else if (var2 > 0 && var3 > 0 && var0[var1][var2 - 1][var3 - 1] != 0) {
			var0[var1][var2][var3] = var0[var1][var2 - 1][var3 - 1];
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "960493532"
	)
	public static final void method3682(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}
}
