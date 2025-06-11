import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MidiRequest")
public class MidiRequest {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1904445923
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1196301321
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1553516633
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("al")
	public float field3814;
	@ObfuscatedName("ac")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("aa")
	public boolean field3820;
	@ObfuscatedName("am")
	public boolean field3817;
	@ObfuscatedName("ah")
	public boolean field3818;
	@ObfuscatedName("ag")
	boolean field3812;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	public SoundCache field3821;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	public MusicTrack field3822;

	@ObfuscatedSignature(
		descriptor = "(Lps;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MidiRequest(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3814 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3818 = false;
		this.field3812 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.playMusicTrack(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lps;IIIZ)V"
	)
	public MidiRequest(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3814 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3818 = false;
		this.field3812 = false;
		this.playMusicTrack(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;IIIZI)V",
		garbageValue = "-153191873"
	)
	@Export("playMusicTrack")
	void playMusicTrack(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lps;Lps;Lps;Lps;I)V",
		garbageValue = "-1272889423"
	)
	public static void method7163(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
		SequenceDefinition.SequenceDefinition_archive = var0;
		SequenceDefinition.SequenceDefinition_animationsArchive = var1;
		class230.SequenceDefinition_skeletonsArchive = var2;
		WorldMapSection1.SpotAnimationDefinition_archive = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1651487933"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class36.client.containsAccessAndRefreshToken() && !class36.client.otlTokenRequesterInitialized() && !class36.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class85.method2689(2);
			if (var0) {
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.isEmpty()) {
				if (ClientPacket.clientPreferences.getRememberedUsername() != null) {
					Login.Login_username = ClientPacket.clientPreferences.getRememberedUsername();
					Client.Login_isUsernameRemembered = true;
				} else {
					Client.Login_isUsernameRemembered = false;
				}
			}

			MouseRecorder.focusPasswordWhenUsernameFilled();
		} else {
			class85.method2689(10);
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIII)V",
		garbageValue = "47282756"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		MusicPatchNode2.method6884();
		SpriteMask var4 = var0.method7762(ClientPreferences.widgetDefinition, false);
		if (var4 != null) {
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height);
			if (Client.minimapState != 2 && Client.minimapState != 5) {
				int var5 = Client.camAngleY & 2047;
				int var6 = Client.field527 / 32 + 48;
				int var7 = 464 - Client.field387 / 32;
				class328.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths);

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) {
					var16 = Client.mapIconXs[var8] * 4 + 2 - Client.field527 / 32;
					var10 = Client.mapIconYs[var8] * 4 + 2 - Client.field387 / 32;
					class381.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4);
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) {
					for (var16 = 0; var16 < 104; ++var16) {
						NodeDeque var14 = Sound.topLevelWorldView.groundItems[Sound.topLevelWorldView.plane][var8][var16];
						if (var14 != null) {
							var11 = var8 * 4 + 2 - Client.field527 / 32;
							var12 = var16 * 4 + 2 - Client.field387 / 32;
							class381.drawSpriteOnMinimap(var1, var2, var11, var12, Messages.field1257[0], var4);
						}
					}
				}

				for (var8 = 0; var8 < Sound.topLevelWorldView.field1147.method9429(); ++var8) {
					NPC var9 = (NPC)Sound.topLevelWorldView.npcs.get((long)Sound.topLevelWorldView.field1147.method9430(var8));
					if (var9 != null && var9.isVisible()) {
						NPCComposition var18 = var9.definition;
						if (var18 != null && var18.transforms != null) {
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) {
							var11 = var9.x / 32 - Client.field527 / 32;
							var12 = var9.y / 32 - Client.field387 / 32;
							class381.drawSpriteOnMinimap(var1, var2, var11, var12, Messages.field1257[1], var4);
						}
					}
				}

				var8 = Client.playerUpdateManager.playerCount;
				int[] var17 = Client.playerUpdateManager.playerIndices;

				for (var10 = 0; var10 < var8; ++var10) {
					Player var15 = (Player)Sound.topLevelWorldView.players.get((long)var17[var10]);
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class152.localPlayer) {
						var12 = var15.x / 32 - Client.field527 / 32;
						int var13 = var15.y / 32 - Client.field387 / 32;
						if (var15.isFriend()) {
							class381.drawSpriteOnMinimap(var1, var2, var12, var13, Messages.field1257[3], var4);
						} else if (class152.localPlayer.team != 0 && var15.team != 0 && var15.team == class152.localPlayer.team) {
							class381.drawSpriteOnMinimap(var1, var2, var12, var13, Messages.field1257[4], var4);
						} else if (var15.isFriendsChatMember()) {
							class381.drawSpriteOnMinimap(var1, var2, var12, var13, Messages.field1257[5], var4);
						} else if (var15.isClanMember()) {
							class381.drawSpriteOnMinimap(var1, var2, var12, var13, Messages.field1257[6], var4);
						} else {
							class381.drawSpriteOnMinimap(var1, var2, var12, var13, Messages.field1257[2], var4);
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) {
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0) {
						NPC var19 = (NPC)Sound.topLevelWorldView.npcs.get((long)Client.hintArrowNpcIndex);
						if (var19 != null) {
							var11 = var19.x / 32 - Client.field527 / 32;
							var12 = var19.y / 32 - Client.field387 / 32;
							WorldMapElement.worldToMinimap(var1, var2, var11, var12, class152.mapDotSprites[1], var4);
						}
					}

					if (Client.hintArrowType == 2) {
						var10 = Client.hintArrowX * 4 - Sound.topLevelWorldView.baseX * 4 + 2 - Client.field527 / 32;
						var11 = Client.hintArrowY * 4 - Sound.topLevelWorldView.baseY * 4 + 2 - Client.field387 / 32;
						WorldMapElement.worldToMinimap(var1, var2, var10, var11, class152.mapDotSprites[1], var4);
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0) {
						Player var20 = (Player)Sound.topLevelWorldView.players.get((long)Client.hintArrowPlayerIndex);
						if (var20 != null) {
							var11 = var20.x / 32 - Client.field527 / 32;
							var12 = var20.y / 32 - Client.field387 / 32;
							WorldMapElement.worldToMinimap(var1, var2, var11, var12, class152.mapDotSprites[1], var4);
						}
					}
				}

				if (Client.destinationX != 0) {
					var10 = Client.destinationX * 4 + 2 - Client.field527 / 32;
					var11 = Client.destinationY * 4 + 2 - Client.field387 / 32;
					class381.drawSpriteOnMinimap(var1, var2, var10, var11, class152.mapDotSprites[0], var4);
				}

				if (Client.worldViewManager.method2231(-1) == class508.field5284 && class152.mapDotSprites.length >= 4) {
					var10 = var4.width / 2 + var1;
					var11 = var4.height / 2 + var2;
					if (var4.contains(MouseHandler.MouseHandler_x - var1, MouseHandler.MouseHandler_y - var2)) {
						var12 = class163.method3836(var1, var2, var4);
						VertexNormal.method5707(var10, var11, var12, class152.mapDotSprites[2]);
					}

					if (Client.field312 > 0) {
						VertexNormal.method5707(var10, var11, Client.field485, class152.mapDotSprites[3]);
					}
				}

				if (!class152.localPlayer.isHidden) {
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}

			Client.field558[var3] = true;
		}
	}
}
