/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.rs.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.ModelData;
import net.runelite.api.SpritePixels;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSClient extends RSGameEngine, Client
{
	@Import("gameBuild")
	@Override
	int getEnvironment();

	@Import("cameraX")
	@Override
	int getCameraX();

	@Import("cameraZ") // <--- This is correct!
	@Override
	int getCameraY();

	@Import("cameraY") // <--- This is correct!
	@Override
	int getCameraZ();

	/*@Import("Scene_cameraX")
	@Override
	int getCameraX2();

	@Import("Scene_cameraY")
	@Override
	int getCameraY2();

	@Import("Scene_cameraZ")
	@Override
	int getCameraZ2();*/

	@Import("cameraPitch")
	@Override
	int getCameraPitch();

	@Import("cameraPitch")
	void setCameraPitch(int cameraPitch);

	@Import("cameraYaw")
	@Override
	int getCameraYaw();

	@Import("mouseCamClickedX")
	int getMouseCamClickedX();

	@Import("mouseCamClickedX")
	void setMouseCamClickedX(int mouseCamClickedX);

	@Import("mouseCamClickedY")
	int getMouseCamClickedY();

	@Import("mouseCamClickedY")
	void setMouseCamClickedY(int mouseCamClickedY);

	@Import("MouseHandler_x")
	int getMouseHandlerX();

	@Import("MouseHandler_x")
	void setMouseHandlerX(int mouseHandlerX);

	@Import("MouseHandler_y")
	int getMouseHandlerY();

	@Import("MouseHandler_y")
	void setMouseHandlerY(int mouseHandlerY);

	@Import("mouseWheelRotation")
	int getMouseWheelRotation();

	@Import("indexCheck")
	RSIndexCheck getIndexCheck();

	@Import("worldHost")
	@Override
	String getWorldHost();

	@Import("worldId")
	@Override
	int getWorld();

	@Import("fps")
	@Override
	int getFPS();

	@Import("Varps_temp")
	@Override
	int[] getServerVarps();

	@Import("Varps_main")
	@Override
	int[] getVarps();

	@Import("Varps_masks")
	int[] getVarpMasks();

	@Import("varcs")
	RSVarcs getVarcs();

	@Import("runEnergy")
	@Override
	int getEnergy();

	@Import("weight")
	@Override
	int getWeight();

	@Import("currentLevels")
	@Override
	int[] getBoostedSkillLevels();

	@Import("levels")
	@Override
	int[] getRealSkillLevels();

	@Import("experience")
	@Override
	int[] getSkillExperiences();

	@Import("changedSkills")
	int[] getChangedSkills();

	@Import("changedSkillsCount")
	int getChangedSkillsCount();

	@Import("changedSkillsCount")
	void setChangedSkillsCount(int i);

	@Import("gameState")
	@Override
	int getRSGameState();

	@Import("updateGameState")
	void setRSGameState(int gameState);

	@Import("MouseHandler_currentButton")
	@Override
	int getMouseCurrentButton();

	@Import("isDraggingWidget")
	@Override
	boolean isDraggingWidget();

	@Import("clickedWidget")
	@Override
	RSWidget getDraggedWidget();

	@Import("draggedOnWidget")
	@Override
	RSWidget getDraggedOnWidget();

	@Import("draggedOnWidget")
	@Override
	void setDraggedOnWidget(Widget widget);

	@Import("widgetDragDuration")
	@Override
	int getDragTime();

	@Import("widgetDefinition")
	RSWidgetDefinition getWidgetDefinition();

	/**
	 * Gets an array of widgets that correspond to the passed group ID.
	 *
	 * @param groupId the group ID
	 * @return the widget group
	 * @see net.runelite.api.widgets.WidgetID
	 */
	RSWidget[] getGroup(int groupId);;

	@Import("localPlayer")
	@Override
	RSPlayer getLocalPlayer();

	@Import("localPlayerIndex")
	@Override
	int getLocalPlayerIndex();

	@Import("combatTargetPlayerIndex")
	int getLocalInteractingIndex();

	@Import("combatTargetPlayerIndex")
	void setLocalInteractingIndex(int idx);

	@Import("worldSelectOpen")
	@Override
	boolean isWorldSelectOpen();

	@Import("worldSelectOpen")
	@Override
	void setWorldSelectOpen(boolean open);

	@Import("Login_username")
	@Override
	String getUsername();

	@Import("Login_username")
	@Override
	void setUsername(String username);

	@Import("Login_password")
	@Override
	void setPassword(String password);

	@Import("otp")
	@Override
	void setOtp(String otp);

	@Import("xPadding")
	int getLoginScreenXPadding();

	@Import("currentLoginField")
	@Override
	int getCurrentLoginField();

	@Import("loginIndex")
	@Override
	int getLoginIndex();

	@Import("playerMenuActions")
	@Override
	String[] getPlayerOptions();

	@Import("playerOptionsPriorities")
	@Override
	boolean[] getPlayerOptionsPriorities();

	@Import("playerMenuOpcodes")
	@Override
	int[] getPlayerMenuTypes();

	@Import("MouseHandler_xVolatile")
	int getMouseX();

	@Import("MouseHandler_yVolatile")
	int getMouseY();

	@Import("containsBounds")
	boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@Import("tempMenuAction")
	RSMenuAction getTempMenuAction();

	@Import("World_worlds")
	@Override
	RSWorld[] getWorldList();

	@Import("World_worlds")
	void setWorldList(RSWorld[] worlds);

	@Import("addChatMessage")
	void addRSChatMessage(int type, String name, String message, String sender);

	@Import("getObjectDefinition")
	RSObjectComposition getRSObjectComposition(int objectId);

	@Import("getNpcDefinition")
	RSNPCComposition getRSNpcComposition(int npcId);

	@Import("viewportZoom")
	@Override
	int getScale();

	@Import("viewportZoom")
	void setScale(int scale);

	@Import("canvasHeight")
	@Override
	int getCanvasHeight();

	@Import("canvasWidth")
	@Override
	int getCanvasWidth();

	@Import("viewportHeight")
	@Override
	int getViewportHeight();

	@Import("viewportWidth")
	@Override
	int getViewportWidth();

	@Import("viewportOffsetX")
	@Override
	int getViewportXOffset();

	@Import("viewportOffsetY")
	@Override
	int getViewportYOffset();

	@Import("isResizable")
	@Override
	boolean isResized();

	@Import("rootWidgetXs")
	@Override
	int[] getWidgetPositionsX();

	@Import("rootWidgetYs")
	@Override
	int[] getWidgetPositionsY();

	@Import("rootWidgetWidths")
	int[] getWidgetWidths();

	@Import("rootWidgetHeights")
	int[] getWidgetHeights();

	@Import("mouseCam")
	boolean isMouseCam();

	@Import("camAngleDX")
	int getCamAngleDX();

	@Import("camAngleDX")
	void setCamAngleDX(int angle);

	@Import("camAngleDY")
	int getCamAngleDY();

	@Import("camAngleDY")
	void setCamAngleDY(int angle);

	@Import("itemContainers")
	RSNodeHashTable getItemContainers();

	@Import("ItemDefinition_get")
	RSItemComposition getRSItemDefinition(int itemId);

	@Import("getItemSprite")
	RSSpritePixels createRSItemSprite(int itemId, int quantity, int thickness, int borderColor, int stackable, boolean noted);

	@Import("menuAction")
	void sendMenuAction(int n2, int n3, int n4, int n5, int itemId, int worldViewId, String string, String string2, int n6, int n7);

	@Import("SpriteBuffer_decode")
	void decodeSprite(byte[] data);

	@Import("SpriteBuffer_spriteCount")
	int getIndexedSpriteCount();

	@Import("SpriteBuffer_spriteWidth")
	int getIndexedSpriteWidth();

	@Import("SpriteBuffer_spriteHeight")
	int getIndexedSpriteHeight();

	@Import("SpriteBuffer_xOffsets")
	int[] getIndexedSpriteOffsetXs();

	@Import("SpriteBuffer_xOffsets")
	void setIndexedSpriteOffsetXs(int[] indexedSpriteOffsetXs);

	@Import("SpriteBuffer_yOffsets")
	int[] getIndexedSpriteOffsetYs();

	@Import("SpriteBuffer_yOffsets")
	void setIndexedSpriteOffsetYs(int[] indexedSpriteOffsetYs);

	@Import("SpriteBuffer_spriteWidths")
	int[] getIndexedSpriteWidths();

	@Import("SpriteBuffer_spriteWidths")
	void setIndexedSpriteWidths(int[] indexedSpriteWidths);

	@Import("SpriteBuffer_spriteHeights")
	int[] getIndexedSpriteHeights();

	@Import("SpriteBuffer_spriteHeights")
	void setIndexedSpriteHeights(int[] indexedSpriteHeights);

	@Import("SpriteBuffer_pixels")
	byte[][] getSpritePixels();

	@Import("SpriteBuffer_pixels")
	void setSpritePixels(byte[][] spritePixels);

	@Import("SpriteBuffer_spritePalette")
	int[] getIndexedSpritePalette();

	@Import("SpriteBuffer_spritePalette")
	void setIndexedSpritePalette(int[] indexedSpritePalette);

	@Import("archive2")
	@Override
	RSArchive getIndexConfig();

	@Import("archive6")
	RSArchive getMusicTracks();

	@Import("archive8")
	@Override
	RSArchive getIndexSprites();

	@Import("archive12")
	@Override
	RSArchive getIndexScripts();

	@Construct
	RSInterfaceParent newInterfaceParent();

	@Import("openInterface")
	WidgetNode openRSInterface(int componentId, int interfaceId, int modalMode);

	@Import("closeInterface")
	void closeRSInterface(WidgetNode interfaceNode, boolean unload);

	@Import("runComponentCloseListeners")
	void runComponentCloseListeners(Widget[] var0, int var1);

	@Import("widgetFlags")
	@Override
	RSNodeHashTable getWidgetFlags();

	@Import("interfaceParents")
	@Override
	RSNodeHashTable getComponentTable();

	@Import("grandExchangeOffers")
	RSGrandExchangeOffer[] getGrandExchangeOffers();

	@Import("foundItemIdCount")
	@Override
	void setGeSearchResultCount(int count);

	@Import("foundItemIds")
	@Override
	void setGeSearchResultIds(short[] ids);

	@Import("foundItemIndex")
	@Override
	void setGeSearchResultIndex(int index);

	@Import("isMenuOpen")
	@Override
	boolean isMenuOpen();

	@Import("isMenuOpen")
	void setMenuOpen(boolean open);

	@Import("cycle")
	@Override
	int getGameCycle();

	@Import("serverCycle")
	int getServerCycle();

	@Import("Messages_channels")
	@Override
	Map getChatLineMap();

	@Import("Messages_hashTable")
	@Override
	RSIterableNodeHashTable getMessages();

	@Import("RunException_revision")
	@Override
	int getRevision();

	@Import("regions")
	@Override
	int[] getMapRegions();

	@Import("instanceChunkTemplates")
	@Override
	int[][][] getInstanceTemplateChunks();

	@Import("xteaKeys")
	@Override
	int[][] getXteaKeys();

	@Import("cycleCntr")
	int getCycleCntr();

	@Import("chatCycle")
	void setChatCycle(int value);

	/**
	 * Get the widget top group. widgets[topGroup] contains widgets with
	 * parentId -1, which are the widget roots.
	 */
	@Import("rootInterface")
	int getTopLevelInterfaceId();

	@Import("WorldMapElement_cached")
	@Override
	RSWorldMapElement[] getMapElementConfigs();

	@Import("WorldMapElement_get")
	@Override
	RSWorldMapElement getMapElementConfig(int id);

	@Import("mapSceneSprites")
	@Override
	RSIndexedSprite[] getMapScene();

	@Import("mapIcons")
	@Override
	RSSpritePixels[] getMapIcons();

	@Import("mapDotSprites")
	RSSpritePixels[] getMapDots();

	@Import("AbstractFont_modIconSprites")
	@Override
	RSIndexedSprite[] getModIcons();

	@Import("AbstractFont_modIconSprites")
	void setRSModIcons(RSIndexedSprite[] modIcons);

	@Construct
	@Override
	RSIndexedSprite createIndexedSprite();

	@Construct
	@Override
	RSSpritePixels createSpritePixels(int[] pixels, int width, int height);

	@Import("destinationX")
	int getDestinationX();

	@Import("destinationY")
	int getDestinationY();

	@Import("soundEffects")
	RSSoundEffect[] getAudioEffects();

	@Import("soundEffectIds")
	int[] getQueuedSoundEffectIDs();

	@Import("soundLocations")
	int[] getSoundLocations();

	@Import("queuedSoundEffectLoops")
	int[] getQueuedSoundEffectLoops();

	@Import("queuedSoundEffectDelays")
	int[] getQueuedSoundEffectDelays();

	@Import("soundEffectCount")
	int getQueuedSoundEffectCount();

	@Import("soundEffectCount")
	void setQueuedSoundEffectCount(int queuedSoundEffectCount);

	@Import("queueSoundEffect")
	void queueSoundEffect(int id, int numLoops, int delay);

	@Import("rasterProvider")
	@Override
	RSAbstractRasterProvider getBufferProvider();

	@Import("MouseHandler_idleCycles")
	@Override
	int getMouseIdleTicks();

	@Import("MouseHandler_idleCycles")
	@Override
	void setMouseIdleTicks(int cycles);

	@Import("MouseHandler_lastPressedX")
	int getMouseLastPressedX();

	@Import("MouseHandler_lastPressedX")
	void setMouseLastPressedX(int x);

	@Import("MouseHandler_lastPressedY")
	int getMouseLastPressedY();

	@Import("MouseHandler_lastPressedY")
	void setMouseLastPressedY(int y);

	@Import("MouseHandler_lastPressedTimeMillis")
	@Override
	long getMouseLastPressedMillis();

	@Import("MouseHandler_lastButton")
	int getMouseLastButton();

	@Import("keyHandler")
	RSKeyHandler getKeyHandler();

	@Import("KeyHandler_idleCycles")
	@Override
	void setKeyboardIdleTicks(int cycles);

	@Import("KeyHandler_idleCycles")
	@Override
	int getKeyboardIdleTicks();

	@Import("KeyHandler_pressedKeys")
	@Override
	boolean[] getPressedKeys();

	@Import("isLowDetail")
	boolean isLowMemory();

	@Import("isLowDetail")
	void setLowMemory(boolean lowMemory);

	@Import("Scene_isLowDetail")
	void setSceneLowMemory(boolean lowMemory);

	@Import("PcmPlayer_stereo")
	void setAudioHighMemory(boolean highMemory);

	@Import("ObjectDefinition_isLowDetail")
	void setObjectDefinitionLowDetail(boolean lowDetail);

	@Import("Interpreter_intStackSize")
	@Override
	int getIntStackSize();

	@Import("Interpreter_intStackSize")
	@Override
	void setIntStackSize(int stackSize);

	@Import("Interpreter_intStack")
	@Override
	int[] getIntStack();

	@Import("Interpreter_objectStackSize")
	@Override
	int getObjectStackSize();

	@Import("Interpreter_objectStackSize")
	@Override
	void setObjectStackSize(int stackSize);

	@Import("Interpreter_objectStack")
	@Override
	Object[] getObjectStack();

	@Import("Interpreter_arrayLengths")
	int[] getArraySizes();

	@Import("Interpreter_arrays")
	int[][] getArrays();

	@Import("friendSystem")
	RSFriendSystem getFriendManager();

	@Import("friendsChat")
	RSFriendsChat getFriendsChatManager();

	@Import("loginType")
	RSLoginType getLoginType();

	@Construct
	RSUsername createName(String name, RSLoginType type);

	@Import("getVarbit")
	int rs$getVarbit(int varbitId);

	@Import("VarbitDefinition_cached")
	RSEvictingDualNodeHashTable getVarbitCache();

	@Import("clientPreferences")
	@Override
	RSClientPreferences getPreferences();

	@Import("camAngleY")
	@Override
	int getMapAngle();

	@Import("camAngleY")
	@Override
	int getCameraYawTarget();

	@Import("camAngleY")
	@Override
	void setCameraYawTarget(int cameraYawTarget);

	/**
	 * This is the pitch the user has set the camera to.
	 * It should be between 128 and (pitchUnlimiter?512:383) JAUs(1).
	 * The difference between this and cameraPitch is that cameraPitch has a lower limit, imposed by the surrounding
	 * terrain.
	 * <p>
	 * (1) JAU - Jagex Angle Unit; 1/1024 of a revolution
	 */
	@Import("camAngleX")
	@Override
	int getCameraPitchTarget();

	@Import("camAngleX")
	@Override
	void setCameraPitchTarget(int pitch);

	@Import("get3dZoom")
	@Override
	int get3dZoom();

	@Import("get3dZoom")
	void set3dZoom(int zoom);

	@Import("Rasterizer3D_clipMidX2")
	@Override
	int getRasterizer3D_clipMidX2();

	@Import("Rasterizer3D_clipNegativeMidX")
	@Override
	int getRasterizer3D_clipNegativeMidX();

	@Import("Rasterizer3D_clipNegativeMidY")
	@Override
	int getRasterizer3D_clipNegativeMidY();

	@Import("Rasterizer3D_clipMidY2")
	@Override
	int getRasterizer3D_clipMidY2();

	@Import("getClipMidX")
	@Override
	int getCenterX();

	@Import("getClipMidY")
	@Override
	int getCenterY();

	@Import("getWorldMap")
	@Override
	RSWorldMap getWorldMap();

	@Import("changeWorld")
	@Override
	void changeWorld(World world);

	@Construct
	@Override
	RSWorld createWorld();

	@Import("Model_transformTempX")
	void setAnimOffsetX(int animOffsetX);

	@Import("Model_transformTempY")
	void setAnimOffsetY(int animOffsetY);

	@Import("Model_transformTempZ")
	void setAnimOffsetZ(int animOffsetZ);

	@Import("getFrames")
	@Override
	RSFrames getFrames(int frameId);

	@Import("sceneMinimapSprite")
	RSSpritePixels getMinimapSprite();

	@Import("sceneMinimapSprite")
	void setMinimapSprite(SpritePixels spritePixels);

	@Import("drawObject")
	void drawObject(int z, int x, int y, int randomColor1, int randomColor2);

	@Construct
	RSScriptEvent createScriptEvent();

	@Import("runScript")
	void runScript(RSScriptEvent ev, int ex, int var2);

	@Import("runScriptLogic")
	void runScriptLogic(RSScriptEvent ev, RSScript s, int ex, int var2);

	@Import("hintArrowType")
	void setHintArrowTargetType(int value);

	@Import("hintArrowType")
	int getHintArrowTargetType();

	@Import("hintArrowX")
	void setHintArrowX(int value);

	@Import("hintArrowX")
	int getHintArrowX();

	@Import("hintArrowY")
	void setHintArrowY(int value);

	@Import("hintArrowY")
	int getHintArrowY();

	@Import("hintArrowSubX")
	void setHintArrowOffsetX(int value);

	@Import("hintArrowSubY")
	void setHintArrowOffsetY(int value);

	@Import("hintArrowNpcIndex")
	void setHintArrowNpcTargetIdx(int value);

	@Import("hintArrowNpcIndex")
	int getHintArrowNpcTargetIdx();

	@Import("hintArrowPlayerIndex")
	void setHintArrowPlayerTargetIdx(int value);

	@Import("hintArrowPlayerIndex")
	int getHintArrowPlayerTargetIdx();

	@Import("isInInstance")
	@Override
	boolean isInInstancedRegion();

	@Import("worldProperties")
	int getFlags();

	@Import("compass")
	void setCompass(SpritePixels spritePixels);

	@Import("oculusOrbState")
	@Override
	int getOculusOrbState();

	@Import("oculusOrbState")
	@Override
	void setOculusOrbState(int state);

	@Import("oculusOrbNormalSpeed")
	@Override
	void setOculusOrbNormalSpeed(int speed);

	@Import("oculusOrbFocalPointX")
	@Override
	int getOculusOrbFocalPointX();

	@Import("oculusOrbFocalPointY")
	@Override
	int getOculusOrbFocalPointY();

	@Import("oculusOrbFocalPointZ")
	@Override
	int getOculusOrbFocalPointZ();

	@Import("oculusOrbFocalPointX")
	@Override
	void setOculusOrbFocalPointX(int x);

	@Import("oculusOrbFocalPointY")
	@Override
	void setOculusOrbFocalPointY(int y);

	@Import("oculusOrbFocalPointZ")
	@Override
	void setOculusOrbFocalPointZ(int z);

	RSTileItem getLastItemDespawn();

	void setLastItemDespawn(RSTileItem lastItemDespawn);

	@Construct
	RSWidget createWidget();

	@Import("alignWidget")
	void revalidateWidget(Widget w);

	@Import("revalidateWidgetScroll")
	void revalidateWidgetScroll(Widget[] group, Widget w, boolean postEvent);

	@Import("ViewportMouse_entityCount")
	int getEntitiesAtMouseCount();

	@Import("ViewportMouse_entityCount")
	void setEntitiesAtMouseCount(int i);

	@Import("ViewportMouse_entityTags")
	long[] getEntitiesAtMouse();

	@Import("ViewportMouse_x")
	int getViewportMouseX();

	@Import("ViewportMouse_y")
	int getViewportMouseY();

	@Import("textureProvider")
	@Override
	RSTextureProvider getTextureProvider();

	@Import("ViewportMouse_isInViewport")
	boolean getViewportContainsMouse();

	@Import("Rasterizer2D_pixels")
	@Override
	int[] getGraphicsPixels();

	@Import("Rasterizer2D_width")
	int getGraphicsPixelsWidth();

	@Import("Rasterizer2D_height")
	int getGraphicsPixelsHeight();

	@Import("Rasterizer2D_fillRectangle")
	void rasterizerFillRectangle(int x, int y, int w, int h, int rgb);

	@Import("Rasterizer2D_xClipStart")
	int getStartX();

	@Import("Rasterizer2D_yClipStart")
	int getStartY();

	@Import("Rasterizer2D_xClipEnd")
	int getEndX();

	@Import("Rasterizer2D_yClipEnd")
	int getEndY();

	@Import("isSpellSelected")
	@Override
	void setSpellSelected(boolean selected);

	@Import("getEnum")
	RSEnumComposition getRsEnum(int id);

	@Import("menu")
	@Override
	RSMenu getMenu();

	/*@Import("menuX")
	int getMenuX();

	@Import("menuY")
	int getMenuY();

	@Import("menuHeight")
	int getMenuHeight();

	@Import("menuWidth")
	int getMenuWidth();

	@Import("menuX")
	void setMenuX(int x);

	@Import("menuY")
	void setMenuY(int y);

	@Import("menuHeight")
	void setMenuHeight(int h);

	@Import("menuWidth")
	void setMenuWidth(int w);*/

	@Import("fontBold12")
	RSFont getFontBold12();

	@Import("Rasterizer2D_drawHorizontalLine")
	void rasterizerDrawHorizontalLine(int x, int y, int w, int rgb);

	@Import("Rasterizer2D_drawHorizontalLineAlpha")
	void rasterizerDrawHorizontalLineAlpha(int x, int y, int w, int rgb, int a);

	@Import("Rasterizer2D_drawVerticalLine")
	void rasterizerDrawVerticalLine(int x, int y, int h, int rgb);

	@Import("Rasterizer2D_drawVerticalLineAlpha")
	void rasterizerDrawVerticalLineAlpha(int x, int y, int h, int rgb, int a);

	@Import("Rasterizer2D_fillRectangleGradient")
	void rasterizerDrawGradient(int x, int y, int w, int h, int rgbTop, int rgbBottom);

	@Import("Rasterizer2D_fillRectangleGradientAlpha")
	void rasterizerDrawGradientAlpha(int x, int y, int w, int h, int rgbTop, int rgbBottom, int alphaTop, int alphaBottom);

	@Import("Rasterizer2D_fillRectangleAlpha")
	void rasterizerFillRectangleAlpha(int x, int y, int w, int h, int rgb, int a);

	@Import("Rasterizer2D_drawRectangle")
	void rasterizerDrawRectangle(int x, int y, int w, int h, int rgb);

	@Import("Rasterizer2D_drawRectangleAlpha")
	void rasterizerDrawRectangleAlpha(int x, int y, int w, int h, int rgb, int a);

	@Import("drawCircle")
	void rasterizerDrawCircle(int x, int y, int r, int rgb);

	@Import("Rasterizer2D_drawCircleAlpha")
	void rasterizerDrawCircleAlpha(int x, int y, int r, int rgb, int a);

	@Import("HealthBarDefinition_cached")
	RSEvictingDualNodeHashTable getHealthBarCache();

	@Import("HealthBarDefinition_cachedSprites")
	RSEvictingDualNodeHashTable getHealthBarSpriteCache();

	@Import("renderSelf")
	@Override
	boolean getRenderSelf();

	@Import("renderSelf")
	@Override
	void setRenderSelf(boolean enabled);

	@Import("mouseRecorder")
	RSMouseRecorder getMouseRecorder();

	@Import("selectedSpellName")
	String getSelectedSpellName();

	@Import("selectedSpellName")
	@Override
	void setSelectedSpellName(String name);

	@Override
	@Import("selectedSpellActionName")
	String getSelectedSpellActionName();

	@Override
	@Import("selectedSpellFlags")
	int getSelectedSpellFlags();

	@Override
	@Import("selectedSpellFlags")
	void setSelectedSpellFlags(int var0);

	@Import("isSpellSelected")
	boolean getSpellSelected();

	@Import("readSoundEffect")
	RSSoundEffect getTrack(RSAbstractArchive indexData, int id, int var0);

	@Import("createRawPcmStream")
	RSRawPcmStream createRawPcmStream(RSRawSound audioNode, int var0, int volume);

	@Import("pcmStreamMixer")
	RSPcmStreamMixer getSoundEffectAudioQueue();

	@Import("archive4")
	RSArchive getIndexCache4();

	@Import("soundEffectsArchive")
	RSArchive getSoundEffectsIndexCache();

	@Import("decimator")
	RSDecimator getSoundEffectResampler();

	void playMusicTrack(int var0, RSAbstractArchive var1, int var2, int var3, int var4, boolean var5);

	@Import("crossSprites")
	@Override
	RSSpritePixels[] getCrossSprites();

	void setModulus(BigInteger modulus);

	BigInteger getModulus();

	@Import("ItemDefinition_fileCount")
	int getItemCount();

	@Import("insertMenuItem")
	int rsInsertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, int itemId, boolean forceLeftClick, int worldViewId);

	@Import("selectedSpellWidget")
	@Override
	int getSelectedSpellWidget();

	@Import("selectedSpellChildIndex")
	@Override
	int getSelectedSpellChildIndex();

	@Import("selectedSpellChildIndex")
	@Override
	void setSelectedSpellChildIndex(int index);

	@Import("selectedSpellItemId")
	@Override
	int getSelectedSpellItemId();

	@Import("selectedSpellItemId")
	@Override
	void setSelectedSpellItemId(int itemId);

	@Import("selectedSpellWidget")
	@Override
	void setSelectedSpellWidget(int widgetID);

	@Import("Sprite_drawScaled")
	@Override
	void scaleSprite(int[] canvas, int[] pixels, int color, int pixelX, int pixelY, int canvasIdx, int canvasOffset, int newWidth, int newHeight, int pixelWidth, int pixelHeight, int oldWidth);

	/**
	 * This sets the login screen to where it asks for username/pass
	 */
	@Import("Login_promptCredentials")
	void promptCredentials(boolean clearPass);

	@Import("VarpDefinition_get")
	RSVarpDefinition getVarpDefinition(int id);

	@Construct
	RSFloorOverlayDefinition newFloorOverlayDefinition();

	@Construct
	RSTileItem newTileItem();

	@Construct
	RSNodeDeque newNodeDeque();

	@Import("updateItemPile")
	void updateItemPile(int plane, int localX, int localY);

	@Import("showMouseCross")
	@Override
	void setShowMouseCross(boolean show);

	@Import("changedSkills")
	int[] getChangedSkillLevels();

	@Import("MouseHandler_lastPressedTimeMillis")
	@Override
	void setMouseLastPressedMillis(long time);

	@Import("mouseLastLastPressedTimeMillis")
	@Override
	long getClientMouseLastPressedMillis();

	@Import("mouseLastLastPressedTimeMillis")
	@Override
	void setClientMouseLastPressedMillis(long time);

	@Import("rootWidgetCount")
	int getRootWidgetCount();

	@Import("widgetClickX")
	int getWidgetClickX();

	@Import("widgetClickY")
	int getWidgetClickY();

	@Import("staffModLevel")
	int getStaffModLevel();

	@Import("tradeChatMode")
	int getTradeChatMode();

	@Import("publicChatMode")
	int getPublicChatMode();

	@Import("clientType")
	int getClientType();

	@Import("onMobile")
	boolean isOnMobile();

	@Import("hadFocus")
	boolean hadFocus();

	@Import("mouseCrossColor")
	int getMouseCrossColor();

	@Import("mouseCrossColor")
	void setMouseCrossColor(int color);

	@Import("leftClickOpensMenu")
	boolean getLeftClickOpensMenu();

	@Import("showMouseOverText")
	boolean getShowMouseOverText();

	@Import("showMouseOverText")
	void setShowMouseOverText(boolean showMouseOverText);

	@Import("showLoadingMessages")
	boolean getShowLoadingMessages();

	@Import("showLoadingMessages")
	void setShowLoadingMessages(boolean showLoadingMessages);

	@Import("stopTimeMs")
	void setStopTimeMs(long time);

	@Import("clearLoginScreen")
	void clearLoginScreen(boolean shouldClear);

	@Import("leftTitleSprite")
	void setLeftTitleSprite(SpritePixels background);

	@Import("rightTitleSprite")
	void setRightTitleSprite(SpritePixels background);

	@Construct
	RSBuffer newBuffer(byte[] bytes);

	@Construct
	RSVarbitComposition newVarbitDefinition();

	@Override
	@Import("followerIndex")
	int getFollowerIndex();

	@Override
	@Import("isItemSelected")
	int isItemSelected();

	@Import("meslayerContinueWidget")
	Widget getMessageContinueWidget();

	@Import("playingJingle")
	boolean isPlayingJingle();

	@Import("midiRequests")
	ArrayList<RSMidiRequest> getMidiRequests();

	@Import("setMusicVolume")
	void setRSMusicVolume(int var0);

	@Import("musicPlayerStatus")
	void setMusicPlayerStatus(int var0);

	@Import("changedVarps")
	int[] getChangedVarps();

	@Import("changedVarpCount")
	int getChangedVarpCount();

	@Import("changedVarpCount")
	void setChangedVarpCount(int changedVarpCount);

	@Import("scriptActiveWidget")
	RSWidget getScriptActiveWidget();

	@Import("scriptDotWidget")
	RSWidget getScriptDotWidget();

	RSScriptEvent createRSScriptEvent(Object... args);

	void runScriptEvent(RSScriptEvent event);

	@Import("Script_cached")
	RSEvictingDualNodeHashTable getScriptCache();

	@Import("getScript")
	RSScript getScript(int scriptID);

	@Import("StructDefinition_cached")
	RSEvictingDualNodeHashTable getRSStructCompositionCache();

	@Import("StructDefinition_getStructDefinition")
	RSStructComposition getRSStructComposition(int id);

	@Import("getParamDefinition")
	RSParamComposition getRSParamComposition(int id);

	@Import("SequenceDefinition_get")
	@Override
	RSSequenceDefinition getSequenceDefinition(int id);

	@Construct
	RSIntegerNode newIntegerNode(int contents);

	@Construct
	RSObjectNode newObjectNode(Object contents);

	@Construct
	RSIterableNodeHashTable newIterableNodeHashTable(int size);

	RSVarbitComposition getVarbitComposition(int id);

	@Override
	@Import("SequenceDefinition_skeletonsArchive")
	RSAbstractArchive getSequenceDefinition_skeletonsArchive();

	@Override
	@Import("SequenceDefinition_archive")
	RSAbstractArchive getSequenceDefinition_archive();

	@Override
	@Import("SequenceDefinition_animationsArchive")
	RSAbstractArchive getSequenceDefinition_animationsArchive();

	@Override
	@Import("NpcDefinition_archive")
	RSAbstractArchive getNpcDefinition_archive();

	@Override
	@Import("ObjectDefinition_modelsArchive")
	RSAbstractArchive getObjectDefinition_modelsArchive();

	@Override
	@Import("ObjectDefinition_archive")
	RSAbstractArchive getObjectDefinition_archive();

	@Override
	@Import("ItemDefinition_archive")
	RSAbstractArchive getItemDefinition_archive();

	@Override
	@Import("KitDefinition_archive")
	RSAbstractArchive getKitDefinition_archive();

	@Override
	@Import("KitDefinition_modelsArchive")
	RSAbstractArchive getKitDefinition_modelsArchive();

	@Override
	@Import("SpotAnimationDefinition_archive")
	RSAbstractArchive getSpotAnimationDefinition_archive();

	@Override
	@Import("SpotAnimationDefinition_modelArchive")
	RSAbstractArchive getSpotAnimationDefinition_modelArchive();

	@Construct
	RSBuffer createBuffer(byte[] bytes);

	@Construct
	RSSceneTilePaint createSceneTilePaint(int swColor, int seColor, int neColor, int nwColor, int texture, int rgb, boolean isFlat);

	@Import("crossWorldMessageIds")
	long[] getCrossWorldMessageIds();

	@Import("crossWorldMessageIdsIndex")
	int getCrossWorldMessageIdsIndex();

	@Import("currentClanChannels")
	RSClanChannel[] getCurrentClanChannels();

	@Import("currentClanSettings")
	RSClanSettings[] getCurrentClanSettingsAry();

	@Import("guestClanChannel")
	@Override
	RSClanChannel getGuestClanChannel();

	@Import("guestClanSettings")
	@Override
	RSClanSettings getGuestClanSettings();

	ClanRank getClanRankFromRs(int rank);

	@Import("readStringIntParameters")
	RSIterableNodeHashTable readStringIntParameters(RSBuffer buffer, RSIterableNodeHashTable table);

	@Import("rndHue")
	int getRndHue();

	@Import("Tiles_underlays")
	short[][][] getTileUnderlays();

	@Import("Tiles_overlays")
	short[][][] getTileOverlays();

	@Import("Tiles_shapes")
	byte[][][] getTileShapes();

	@Import("SpotAnimationDefinition_get")
	RSSpotAnimationDefinition getSpotAnimationDefinition(int id);

	@Import("ModelData_get")
	RSModelData getModelData(RSAbstractArchive var0, int var1, int var2);

	@Import("isCameraLocked")
	boolean isCameraLocked();

	boolean getCameraPitchRelaxerEnabled();

	boolean isUnlockedFps();

	long getUnlockedFpsTarget();

	void posToCameraAngle(int var0, int var1);

	@Override
	default RSNodeDeque getAmbientSoundEffects()
	{
		return getTopLevelWorldView().getObjectSounds();
	}

	@Import("FloorOverlayDefinition_archive")
	RSAbstractArchive getFloorOverlayDefinitionArchive();

	@Import("FloorOverlayDefinition_cached")
	RSEvictingDualNodeHashTable getFloorOverlayDefinitionCache();

	@Import("ItemDefinition_cached")
	@Override
	RSEvictingDualNodeHashTable getItemCompositionCache();

	@Import("ObjectDefinition_cached")
	RSEvictingDualNodeHashTable getObjectCompositionCache();

	@Import("ObjectDefinition_cachedModels")
	RSEvictingDualNodeHashTable getObjectDefinitionModelsCache();

	@Import("SequenceDefinition_cached")
	@Override
	RSEvictingDualNodeHashTable getAnimationCache();

	@Import("SequenceDefinition_cached")
	RSEvictingDualNodeHashTable getSequenceDefinitionCache();

	@Import("ItemDefinition_cachedModels")
	RSEvictingDualNodeHashTable getItemModelCache();

	@Import("ItemDefinition_cachedSprites")
	RSEvictingDualNodeHashTable getItemSpriteCache();

	@Import("archive11")
	RSEvictingDualNodeHashTable getArchive11();

	@Construct
	RSIterableNodeHashTable createIterableNodeHashTable(int size);

	@Construct
	RSRuneLiteClanMember runeliteClanMember(ClanSettings var1, int var2);

	@Import("projectiles")
	@Override
	RSNodeDeque getProjectiles();

	@Construct
	RSProjectile newProjectile(int sourceLevel, int sourceX, int sourceY, int startHeight, int sourceIndex, int targetLevel, int targetX, int targetY, int endHeight, int targetIndex, int id, int cycleStart, int cycleEnd, int slope, int var15);

	@Construct
	RSModelData newModelData(ModelData[] var1, int var2);

	@Construct
	RSEvictingDualNodeHashTable newEvictingDualNodeHashTable(int var1);

	@Import("getDbTable")
	RSDbTable getDbTable(int var0);

	@Import("getDbTableType")
	RSDbTableType getDbTableType(int var0);

	@Import("getDbRowType")
	RSDbRowType getDbRowType(int var0);

	@Import("graphicsCycle")
	int getGraphicsCycle();

	@Import("openMenu")
	void openMenu(int mouseX, int mouseY);

	@Import("clips")
	RSClips getClips();

	@Import("modelDataArray")
	RSModelData[] getModelDataArray();

	@Import("validRootWidgets")
	boolean[] getValidRootWidgets();

	@Import("scriptEvents")
	RSNodeDeque getScriptEvents();

	@Import("scriptEvents2")
	RSNodeDeque getScriptEvents2();

	@Import("scriptEvents3")
	RSNodeDeque getScriptEvents3();

	@Import("topLevelWorldView")
	@Override
	RSWorldView getTopLevelWorldView();

	@Import("worldView")
	RSWorldView getWorldView();

	@Import("worldViewManager")
	RSWorldViewManager getWorldViewManager();

	@Construct
	RSIndexedObjectSet newIndexedObjectSet(int size);

	void addCachedPlayer(RSPlayer player);
	void removeCachedPlayer(RSPlayer player);
	void addCachedNpc(RSNPC npc);
	void removeCachedNpc(RSNPC npc);

	/**
	 * Jagex launcher credentials
	 */

	@Import("accessToken")
	String getAccessToken();

	@Import("accessToken")
	void setAccessToken(String accessToken);

	@Import("refreshToken")
	String getRefreshToken();

	@Import("refreshToken")
	void setRefreshToken(String refreshToken);

	@Import("sessionId")
	String getSessionId();

	@Import("sessionId")
	void setSessionId(String sessionId);

	@Import("characterId")
	String getCharacterId();

	@Import("characterId")
	void setCharacterId(String characterId);

	@Import("displayName")
	String getDisplayName();

	@Import("displayName")
	void setDisplayName(String displayName);

	@Import("containsAccessAndRefreshToken")
	boolean containsAccessAndRefreshToken();

	@Import("containsSessionAndCharacterId")
	boolean containsSessionAndCharacterId();

	String getCredentialsProperty(String var1);
	java.util.Properties getCredentialsProperties();
	boolean storeCredentials();
	void writeCredentials();
}