/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Server controlled "content-developer" integers.
 *
 * VarPlayers are stored per RuneScape player save, and synchronized
 * from the server to the client. The client can change them preemptively
 * if it thinks they will change the next tick as a lag-hiding measure.
 * The client CANNOT directly make the server change a varbit.
 */
@AllArgsConstructor
@Getter
@Deprecated
public enum VarPlayer
{
	POUCH_STATUS(261),
	DUEL_PENDING(286),
	CANNON_STATE(2),
	CANNON_AMMO(3),
	CANNON_COORD(4),
	ATTACK_STYLE(43),
	QUEST_POINTS(101),
	IS_POISONED(102),
	/**
	 * Seems to start at 50(10 splash) and goes down by 1 every 30 seconds
	 */
	DISEASE_VALUE(456),

	BANK_TAB(115),

	MEMBERSHIP_DAYS(1780),

	SPECIAL_ATTACK_PERCENT(300),
	SPECIAL_ATTACK_ENABLED(301),

	/**
	 * This has a value of 0 if you have auto retaliate enabled and a value of 1 if you do not
	 */
	AUTO_RETALIATE(172),

	/**
	 * The ID of the party. This Var is only set in the raid bank area and the raid lobby
	 *
	 * This gets set to -1 when the raid starts. This is first set when the first player of the friends chat forms a party
	 * on the recruiting board and it changes again when the first person actually enters the raid.
	 *
	 * -1 : Not in a party or in the middle of an ongoing raid
	 * Anything else : This means that your friends chat has a raid party being formed and has not started yet
	 */
	IN_RAID_PARTY(1427),

	NMZ_REWARD_POINTS(1060),

	/**
	 * The 11 least significant bits of this var correspond to the player
	 * you're currently fighting. Value is -1 when not fighting any player.
	 *
	 * Client.getVar(ATTACKING_PLAYER) & 2047 == Client.getLocalInteractingIndex();
	 */
	ATTACKING_PLAYER(1075),

	/**
	 * The poisoned status of the player, with negative values indicating the duration of poison or venom protection and
	 * positive values representing the amount of poison or venom damage the player will be taking.
	 *
	 * <ul>
	 *     <li>
	 *         (-inf, -38): Venom immune for a duration of {@code (abs(val) - 38) * 30} game ticks (18 seconds per
	 *         poison tick), after which point the value will have increased to {@code -38} and be representing poison
	 *         immunity rather than venom immunity
	 *     </li>
	 *     <li>
	 *         [-38, 0): Poison immune for a duration of {@code abs(val) * 30} game ticks (18 seconds per poison tick)
	 *     </li>
	 *     <li>0: Not poisoned or immune to poison</li>
	 *     <li>[1, 100]: Poisoned for an amount of {@code ceil(val / 5.0f)}</li>
	 *     <li>
	 *         [1000000, inf): Venomed for an amount of {@code min(20, (val - 999997) * 2)}, that is, an amount starting
	 *         at 6 damage, increasing by 2 each time the value increases by one, and capped at 20
	 *     </li>
	 * </ul>
	 */
	POISON(102),

	/**
	 * 0 : not started
	 * greater than 0 : in progress
	 * greater than 99 : completed
	 */
	THRONE_OF_MISCELLANIA(359),

	/**
	 * Item currently active in the creation of a buy or sell offer
	 */
	CURRENT_GE_ITEM(1151),

	/**
	 * Experience tracker goal start.
	 */
	ATTACK_GOAL_START(1229),
	STRENGTH_GOAL_START(1230),
	RANGED_GOAL_START(1231),
	MAGIC_GOAL_START(1232),
	DEFENCE_GOAL_START(1233),
	HITPOINTS_GOAL_START(1234),
	PRAYER_GOAL_START(1235),
	AGILITY_GOAL_START(1236),
	HERBLORE_GOAL_START(1237),
	THIEVING_GOAL_START(1238),
	CRAFTING_GOAL_START(1239),
	RUNECRAFT_GOAL_START(1240),
	MINING_GOAL_START(1241),
	SMITHING_GOAL_START(1242),
	FISHING_GOAL_START(1243),
	COOKING_GOAL_START(1244),
	FIREMAKING_GOAL_START(1245),
	WOODCUTTING_GOAL_START(1246),
	FLETCHING_GOAL_START(1247),
	SLAYER_GOAL_START(1248),
	FARMING_GOAL_START(1249),
	CONSTRUCTION_GOAL_START(1250),
	HUNTER_GOAL_START(1251),

	/**
	 * Experience tracker goal end.
	 */
	ATTACK_GOAL_END(1253),
	STRENGTH_GOAL_END(1254),
	RANGED_GOAL_END(1255),
	MAGIC_GOAL_END(1256),
	DEFENCE_GOAL_END(1257),
	HITPOINTS_GOAL_END(1258),
	PRAYER_GOAL_END(1259),
	AGILITY_GOAL_END(1260),
	HERBLORE_GOAL_END(1261),
	THIEVING_GOAL_END(1262),
	CRAFTING_GOAL_END(1263),
	RUNECRAFT_GOAL_END(1264),
	MINING_GOAL_END(1265),
	SMITHING_GOAL_END(1266),
	FISHING_GOAL_END(1267),
	COOKING_GOAL_END(1268),
	FIREMAKING_GOAL_END(1269),
	WOODCUTTING_GOAL_END(1270),
	FLETCHING_GOAL_END(1271),
	SLAYER_GOAL_END(1272),
	FARMING_GOAL_END(1273),
	CONSTRUCTION_GOAL_END(1274),
	HUNTER_GOAL_END(1275),

	/**
	 * Bird house states
	 */
	BIRD_HOUSE_MEADOW_NORTH(1626),
	BIRD_HOUSE_MEADOW_SOUTH(1627),
	BIRD_HOUSE_VALLEY_NORTH(1628),
	BIRD_HOUSE_VALLEY_SOUTH(1629),

	/**
	 * Slayer unlock bitfields
	 */
	SLAYER_UNLOCK_1(1076),
	SLAYER_UNLOCK_2(1344),

	MUSIC_VOLUME(168),
	SOUND_EFFECT_VOLUME(169),
	AREA_EFFECT_VOLUME(872),

	/**
	 * 0 = 2 buttons, 1 = 1 button
	 */
	MOUSE_BUTTONS(170),

	/**
	 * {@link net.runelite.api.gameval.NpcID} for the HP HUD
	 */
	HP_HUD_NPC_ID(1683),

	CLOG_LOGGED(2943),
	CLOG_TOTAL(2944),

	/**
	 * Colors for chat messages
	 */
	SETTINGS_OPAQUE_CHAT_PUBLIC(2992),
	SETTINGS_OPAQUE_CHAT_PRIVATE(2993),
	SETTINGS_OPAQUE_CHAT_AUTO(2994),
	SETTINGS_OPAQUE_CHAT_BROADCAST(2995),
	SETTINGS_OPAQUE_CHAT_FRIEND(2996),
	SETTINGS_OPAQUE_CHAT_CLAN(2997),
	SETTINGS_OPAQUE_CHAT_GUEST_CLAN(3060),
	SETTINGS_OPAQUE_CHAT_CLAN_BROADCAST(3192),
	SETTINGS_OPAQUE_CHAT_IRON_GROUP_CHAT(3191),
	SETTINGS_OPAQUE_CHAT_IRON_GROUP_BROADCAST(3193),
	SETTINGS_OPAQUE_CHAT_TRADE_REQUEST(2998),
	SETTINGS_OPAQUE_CHAT_CHALLENGE_REQUEST(2999),

	SETTINGS_TRANSPARENT_CHAT_PUBLIC(3000),
	SETTINGS_TRANSPARENT_CHAT_PRIVATE(3001),
	SETTINGS_TRANSPARENT_CHAT_AUTO(3002),
	SETTINGS_TRANSPARENT_CHAT_BROADCAST(3003),
	SETTINGS_TRANSPARENT_CHAT_FRIEND(3004),
	SETTINGS_TRANSPARENT_CHAT_CLAN(3005),
	SETTINGS_TRANSPARENT_CHAT_GUEST_CLAN(3061),
	SETTINGS_TRANSPARENT_CHAT_CLAN_BROADCAST(3195),
	SETTINGS_TRANSPARENT_CHAT_IRON_GROUP_CHAT(3194),
	SETTINGS_TRANSPARENT_CHAT_IRON_GROUP_BROADCAST(3196),
	SETTINGS_TRANSPARENT_CHAT_TRADE_REQUEST(3006),
	SETTINGS_TRANSPARENT_CHAT_CHALLENGE_REQUEST(3007),

	/**
	 * The difference, measured in minutes, between the time home teleport spell was last used and midnight, January 1, 1970 UTC.
	 */
	LAST_HOME_TELEPORT(892),

	/**
	 * Charge spell duration
	 * Value * 2 = Remaining game ticks on buff
	 * E.g. value of 50 means buff will expire in 100 ticks.
	 */
	CHARGE_GOD_SPELL(272),

	/**
	 * The difference, measured in minutes, between the time minigame teleport was last used and midnight, January 1, 1970 UTC.
	 */
	LAST_MINIGAME_TELEPORT(888),

	/**
	 * Number of slayer creatures remaining on the assigned task
	 */
	SLAYER_TASK_SIZE(394),

	/**
	 * Currently assigned slayer task if SLAYER_TASK_SIZE is greater than 0.
	 * Mapping of value to name can be found in {@link EnumID#SLAYER_TASK_CREATURE}.
	 */
	SLAYER_TASK_CREATURE(395),

	/**
	 * Assigned slayer task location. The mapping of value to name can be found in {@link EnumID#SLAYER_TASK_LOCATION}
	 */
	SLAYER_TASK_LOCATION(2096),

	/**
	 * Determines whether the woodcutting group bonus should be displayed on the buff bar or not.
	 * 96 = displayed (including the woodcutting guild).
	 * 0 = not displayed (after login until cutting a tree except normal trees or trees grown through farming).
	 * -1 = not displayed (including normal trees or trees grown through farming).
	 */
	BUFF_BAR_WC_GROUP_BONUS(4007),

	/**
	 * The amount of ammo in Dizana's quiver's inventory slot.
	 * 0 means the quiver is empty.
	 * @see #DIZANAS_QUIVER_ITEM_ID
	 */
	DIZANAS_QUIVER_ITEM_COUNT(4141),

	/**
	 * The item ID of the ammo in Dizana's quiver inventory slot.
	 * -1 means the quiver is empty.
	 * @see #DIZANAS_QUIVER_ITEM_COUNT
	 */
	DIZANAS_QUIVER_ITEM_ID(4142),

	/**
	 * Runecraft Essence Pouch degrade states
	 */
	ESSENCE_POUCH_MEDIUM_DEGRADE(488),
	ESSENCE_POUCH_LARGE_DEGRADE(489),
	ESSENCE_POUCH_GIANT_DEGRADE(490),

	RAIDS_PERSONAL_POINTS(4609),

	;

	private final int id;
}