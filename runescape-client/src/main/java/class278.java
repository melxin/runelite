import java.util.ArrayList;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class278 implements Comparator {
	class278() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Lkl;I)I",
		garbageValue = "-1234332486"
	)
	int method5765(class271 var1, class271 var2) {
		return var1.method5638() - var2.method5638();
	}

	public int compare(Object var1, Object var2) {
		return this.method5765((class271)var1, (class271)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpi;III)[Lvy;",
		garbageValue = "1996202941"
	)
	public static IndexedSprite[] method5770(AbstractArchive var0, int var1, int var2) {
		if (!class326.method6471(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SecureRandomFuture.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = HttpResponse.SpriteBuffer_yOffsets[var5];
				var6.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = WorldMapCacheName.SpriteBuffer_spriteHeights[var5];
				var6.palette = class140.SpriteBuffer_spritePalette;
				var6.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var5];
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			HttpResponse.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			WorldMapCacheName.SpriteBuffer_spriteHeights = null;
			class140.SpriteBuffer_spritePalette = null;
			SpriteBufferProperties.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "980276910"
	)
	static void method5768() {
		synchronized(ArchiveDiskActionHandler.field4526) {
			if (ArchiveDiskActionHandler.field4525 == 0) {
				class374.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				class374.ArchiveDiskActionHandler_thread.setDaemon(true);
				class374.ArchiveDiskActionHandler_thread.start();
				class374.ArchiveDiskActionHandler_thread.setPriority(5);
			}

			ArchiveDiskActionHandler.field4525 = 600;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-21"
	)
	static void method5769(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				WorldMapSprite.method6235(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class333.field3626.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class333.field3626.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && SecureUrlRequester.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(FontName.archive6, (Integer)var0.get(var8), 0, SecureUrlRequester.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class333.field3626.clear();
						class333.field3626.addAll(var9);
						StructComposition.method4069(var1, var2, var3, var4);
					} else {
						UrlRequester.method3175(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-50"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = Message.getPacketBufferNode(ClientPacket.FRIEND_CHAT_JOIN_LEAVE, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class164.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
