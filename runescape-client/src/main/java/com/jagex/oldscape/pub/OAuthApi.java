package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	long getAccountHash();

	void setClient(int var1);

	boolean isOnLoginScreen();

	void setOtlTokenRequester(OtlTokenRequester var1);
}
