package com.jagex.oldscape.pub;

import net.runelite.mapping.Implements;

@Implements("OAuthApi")
public interface OAuthApi {
	long getAccountHash();

	boolean isOnLoginScreen();

	void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

	void setClient(int var1);

	void setOtlTokenRequester(OtlTokenRequester var1);
}
