/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2019, ThatGamerBlue <thatgamerblue@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 *  Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
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

import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Import;

public interface RSWidget extends Widget
{
	@Import("children")
	@Override
	RSWidget[] getChildren();

	@Import("children")
	@Override
	void setChildren(Widget[] children);

	@Import("id")
	@Override
	int getId();

	void setRenderParentId(int parentId);

	void setRenderX(int x);

	void setRenderY(int y);

	@Import("id")
	void setId(int id);

	@Import("parentId")
	int getRSParentId();

	@Import("parentId")
	void setParentId(int id);

	@Import("flags")
	int getClickMask();

	@Import("flags")
	@Override
	RSWidget setClickMask(int mask);

	//@Import("boundsIndex") -- unused for now
	//int getBoundsIndex();

	@Import("modelId")
	@Override
	int getModelId();

	@Import("modelId")
	@Override
	RSWidget setModelId(int modelId);

	@Import("itemIds")
	int[] getItemIds();

	@Import("itemIds")
	void setItemIds(int[] itemIds);

	@Import("modelType")
	int getModelType();

	@Import("modelType")
	@Override
	RSWidget setModelType(int modelType);

	@Import("sequenceId")
	int getAnimationId();

	@Import("sequenceId")
	@Override
	RSWidget setAnimationId(int animationId);

	@Import("actions")
	@Override
	String[] getActions();

	@Import("actions")
	void setActions(String[] actions);

	@Import("buttonText")
	String getRSButtonText();

	@Import("text")
	String getRSText();

	@Import("dataText")
	String getRSName();

	@Import("dataText")
	void setRSName(String name);

	@Import("text")
	@Override
	RSWidget setText(String text);

	@Import("color")
	@Override
	int getTextColor();

	@Import("color")
	@Override
	RSWidget setTextColor(int textColor);

	@Import("transparencyTop")
	@Override
	int getOpacity();

	@Import("transparencyTop")
	@Override
	RSWidget setOpacity(int opacity);

	@Import("x")
	@Override
	int getRelativeX();

	@Import("x")
	@Override
	void setRelativeX(int x);

	@Import("y")
	@Override
	int getRelativeY();

	@Import("y")
	@Override
	void setRelativeY(int y);

	@Import("width")
	@Override
	int getWidth();

	@Import("width")
	@Override
	void setWidth(int width);

	@Import("height")
	@Override
	int getHeight();

	@Import("height")
	@Override
	void setHeight(int height);

	@Import("isHidden")
	@Override
	boolean isSelfHidden();

	@Import("isHidden")
	@Override
	RSWidget setHidden(boolean hidden);

	@Import("childIndex")
	int getIndex();

	@Import("childIndex")
	void setIndex(int index);

	@Import("modelAngleX")
	@Override
	int getRotationX();

	@Import("modelAngleX")
	@Override
	RSWidget setRotationX(int rotationX);

	@Import("modelAngleZ") // Do not change
	@Override
	int getRotationY();

	@Import("modelAngleZ") // Do not change
	@Override
	RSWidget setRotationY(int rotationY);

	@Import("modelAngleY") // Do not change
	int getRotationZ();

	@Import("modelAngleY") // Do not change
	@Override
	RSWidget setRotationZ(int rotationZ);

	@Import("modelZoom")
	@Override
	int getModelZoom();

	@Import("modelZoom")
	@Override
	RSWidget setModelZoom(int modelZoom);

	@Import("contentType")
	@Override
	int getContentType();

	@Import("contentType")
	@Override
	RSWidget setContentType(int contentType);

	@Import("type")
	@Override
	int getType();

	@Import("type")
	@Override
	void setType(int type);

	@Import("buttonType")
	@Override
	int getButtonType();

	@Import("scrollX")
	@Override
	int getScrollX();

	@Import("scrollX")
	@Override
	RSWidget setScrollX(int scrollX);

	@Import("scrollY")
	@Override
	int getScrollY();

	@Import("scrollY")
	@Override
	RSWidget setScrollY(int scrollY);

	@Import("scrollWidth")
	@Override
	int getScrollWidth();

	@Import("scrollWidth")
	@Override
	RSWidget setScrollWidth(int width);

	@Import("scrollHeight")
	@Override
	int getScrollHeight();

	@Import("scrollHeight")
	@Override
	RSWidget setScrollHeight(int height);

	@Import("spriteId2")
	@Override
	int getSpriteId();

	@Import("spriteId2")
	@Override
	RSWidget setSpriteId(int spriteId);

	@Import("spriteTiling")
	@Override
	boolean getSpriteTiling();

	@Import("spriteTiling")
	@Override
	RSWidget setSpriteTiling(boolean tiling);

	@Import("outline")
	@Override
	int getBorderType();

	@Import("outline")
	@Override
	void setBorderType(int type);

	@Import("itemId")
	@Override
	int getItemId();

	@Import("itemId")
	@Override
	RSWidget setItemId(int itemId);

	@Import("itemQuantity")
	@Override
	int getItemQuantity();

	@Import("itemQuantity")
	@Override
	RSWidget setItemQuantity(int quantity);

	@Import("rawX")
	@Override
	int getOriginalX();

	@Import("rawX")
	@Override
	RSWidget setOriginalX(int originalX);

	@Import("rawY")
	@Override
	int getOriginalY();

	@Import("rawY")
	@Override
	RSWidget setOriginalY(int originalY);

	@Import("rawHeight")
	@Override
	int getOriginalHeight();

	@Import("rawHeight")
	@Override
	RSWidget setOriginalHeight(int originalHeight);

	@Import("rawWidth")
	@Override
	int getOriginalWidth();

	@Import("rawWidth")
	@Override
	RSWidget setOriginalWidth(int originalWidth);


	@Import("onOp")
	@Override
	void setOnOpListener(Object... args);

	@Import("setAction")
	@Override
	void setAction(int idx, String action);

	@Import("isIf3")
	@Override
	boolean isIf3();

	@Import("isIf3")
	void setIsIf3(boolean isIf3);

	@Import("hasListener")
	@Override
	boolean hasListener();

	@Import("hasListener")
	@Override
	RSWidget setHasListener(boolean hasListener);

	@Import("onKey")
	@Override
	Object[] getOnKeyListener();

	@Import("onLoad")
	@Override
	Object[] getOnLoadListener();

	@Import("onOp")
	@Override
	Object[] getOnOpListener();

	@Import("onDialogAbort")
	@Override
	void setOnDialogAbortListener(Object... args);

	@Import("onKey")
	@Override
	void setOnKeyListener(Object... args);

	@Import("onMouseOver")
	@Override
	void setOnMouseOverListener(Object... args);

	@Import("onMouseRepeat")
	@Override
	void setOnMouseRepeatListener(Object... args);

	@Import("onMouseLeave")
	@Override
	void setOnMouseLeaveListener(Object... args);

	@Import("onTimer")
	@Override
	void setOnTimerListener(Object... args);

	@Import("onTargetEnter")
	@Override
	void setOnTargetEnterListener(Object... args);

	@Import("onTargetLeave")
	@Override
	void setOnTargetLeaveListener(Object... args);

	@Import("fontId")
	@Override
	int getFontId();

	@Import("fontId")
	@Override
	RSWidget setFontId(int id);

	@Import("textShadowed")
	@Override
	boolean getTextShadowed();

	@Import("textShadowed")
	@Override
	RSWidget setTextShadowed(boolean shadowed);

	@Import("dragZoneSize")
	@Override
	int getDragDeadZone();

	@Import("dragZoneSize")
	@Override
	void setDragDeadZone(int deadZone);

	@Import("dragThreshold")
	@Override
	int getDragDeadTime();

	@Import("dragThreshold")
	@Override
	void setDragDeadTime(int deadTime);

	@Import("itemQuantityMode")
	@Override
	int getItemQuantityMode();

	@Import("itemQuantityMode")
	@Override
	RSWidget setItemQuantityMode(int itemQuantityMode);

	@Import("xAlignment")
	@Override
	int getXPositionMode();

	@Import("xAlignment")
	@Override
	RSWidget setXPositionMode(int xpm);

	@Import("yAlignment")
	@Override
	int getYPositionMode();

	@Import("yAlignment")
	@Override
	RSWidget setYPositionMode(int ypm);

	@Import("textXAlignment")
	@Override
	int getXTextAlignment();

	@Import("textXAlignment")
	@Override
	RSWidget setXTextAlignment(int xta);

	@Import("textYAlignment")
	@Override
	int getYTextAlignment();

	@Import("textYAlignment")
	@Override
	RSWidget setYTextAlignment(int yta);

	@Import("widthAlignment")
	@Override
	int getWidthMode();

	@Import("widthAlignment")
	@Override
	RSWidget setWidthMode(int widthMode);

	@Import("heightAlignment")
	@Override
	int getHeightMode();

	@Import("heightAlignment")
	@Override
	RSWidget setHeightMode(int heightMode);

	@Import("getFont")
	RSFont getRSFont(RSWidgetDefinition var1);

	@Import("fill")
	@Override
	boolean isFilled();

	@Import("fill")
	@Override
	RSWidget setFilled(boolean filled);

	@Import("spellActionName")
	@Override
	String getTargetVerb();

	@Import("spellActionName")
	@Override
	void setTargetVerb(String targetVerb);

	@Import("noClickThrough")
	@Override
	boolean getNoClickThrough();

	@Import("noClickThrough")
	@Override
	void setNoClickThrough(boolean noClickThrough);

	@Import("noScrollThrough")
	@Override
	boolean getNoScrollThrough();

	@Import("noScrollThrough")
	@Override
	void setNoScrollThrough(boolean noScrollThrough);

	@Import("modelFrame")
	int getModelFrame();

	@Import("modelFrameCycle")
	int getModelFrameCycle();

	@Import("onInvTransmit")
	@Override
	Object[] getOnInvTransmitListener();

	@Import("getSprite")
	RSSpritePixels getSprite(RSWidgetDefinition widgetDefinition, boolean b, RSUrlRequester urlRequester);

	@Import("onRelease")
	@Override
	void setOnReleaseListener(Object[] o);

	@Import("varTransmitTriggers")
	@Override
	int[] getVarTransmitTrigger();

	@Import("varTransmitTriggers")
	@Override
	void setVarTransmitTrigger(int[] i);

	@Import("onHold")
	@Override
	void setOnHoldListener(Object[] o);

	@Import("onClick")
	@Override
	void setOnClickListener(Object[] o);

	@Import("onDragComplete")
	@Override
	void setOnDragCompleteListener(Object[] o);

	@Import("onDrag")
	@Override
	void setOnDragListener(Object[] o);

	@Import("onScroll")
	@Override
	void setOnScrollWheelListener(Object[] o);

	@Import("parent")
	@Override
	RSWidget getDragParent();

	@Import("parent")
	@Override
	RSWidget setDragParent(Widget dragParent);

	@Import("onVarTransmit")
	@Override
	Object[] getOnVarTransmitListener();

	@Import("onVarTransmit")
	@Override
	void setOnVarTransmitListener(Object[] o);

	@Import("fillMode")
	RSFillMode getFillMode();

	@Import("textLineHeight")
	int getLineHeight();

	@Import("textLineHeight")
	@Override
	RSWidget setLineHeight(int height);

	void broadcastHidden(boolean hidden);
}