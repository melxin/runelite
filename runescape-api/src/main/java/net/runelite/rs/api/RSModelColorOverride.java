package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSModelColorOverride
{
	@Import("overrideAmount")
	byte getOverrideAmount();

	@Import("overrideHue")
	byte getOverrideHue();

	@Import("overrideSaturation")
	byte getOverrideSaturation();

	@Import("overrideLuminance")
	byte getOverrideLuminance();
}
