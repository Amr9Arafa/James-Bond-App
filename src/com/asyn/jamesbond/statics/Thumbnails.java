package com.asyn.jamesbond.statics;

import com.asyn.jamesbond.R;

public final class Thumbnails {

	public static final int DR_NO = R.drawable.dr_no;
	public static final int FROM_RUSSIA_WITH_LOVE = R.drawable.from_russia_with_love;
	public static final int GOLDFINGER = R.drawable.goldfinger;
	public static final int THUNDERBALL = R.drawable.thunderball;
	public static final int YOU_ONLY_LIVE_TWICE = R.drawable.you_only_live_twice;
	public static final int ON_HER_MAJESTYS_SECRET_SERVICE = R.drawable.on_her_majestys_secret_service;
	public static final int DIAMONDS_ARE_FOREVER = R.drawable.diamonds_are_forever;
	public static final int LIVE_AND_LET_DIE = R.drawable.live_and_let_die;
	public static final int THE_MAN_WITH_THE_GOLDEN_GUN = R.drawable.the_man_with_the_golden_gun_;
	public static final int THE_SPY_WHO_LOVED_ME = R.drawable.the_spy_who_loved;
	public static final int MOONRAKER = R.drawable.moonraker;
	public static final int FOR_YOUR_EYES_ONLY = R.drawable.for_your_eyes_only;
	public static final int OCTOPUSSY = R.drawable.octopussy;
	public static final int A_VIEW_TO_A_KILL = R.drawable.a_view_to_a_kill;
	public static final int THE_LIVING_DAYLIGHTS = R.drawable.the_living_daylights;
	public static final int LICENCE_TO_KILL = R.drawable.licence_to_kill;
	public static final int GOLDENEYE = R.drawable.goldeneye;
	public static final int TOMORROW_NEVER_DIES = R.drawable.tomorrow_never_twice;
	public static final int THE_WORLD_IS_NOT_ENOUGH = R.drawable.the_world_is_not_enough;
	public static final int DIE_ANOTHER_DAY = R.drawable.die_another_day;
	public static final int CASINO_ROYAL = R.drawable.casino_royale;
	public static final int QUANTUM_OF_SOLACE = R.drawable.quantum_of_solace;
	public static final int SKYFALL = R.drawable.skyfall;

	public static int getMovieThumbnail(int position) {
		int[] thumbnails = new int[] { DR_NO, FROM_RUSSIA_WITH_LOVE,
				GOLDFINGER, THUNDERBALL, YOU_ONLY_LIVE_TWICE,
				ON_HER_MAJESTYS_SECRET_SERVICE, DIAMONDS_ARE_FOREVER,
				LIVE_AND_LET_DIE, THE_MAN_WITH_THE_GOLDEN_GUN,
				THE_SPY_WHO_LOVED_ME, MOONRAKER, FOR_YOUR_EYES_ONLY, OCTOPUSSY,
				A_VIEW_TO_A_KILL, THE_LIVING_DAYLIGHTS, LICENCE_TO_KILL,
				GOLDENEYE, TOMORROW_NEVER_DIES, THE_WORLD_IS_NOT_ENOUGH,
				DIE_ANOTHER_DAY, CASINO_ROYAL, QUANTUM_OF_SOLACE, SKYFALL };
		return thumbnails[position];
	}

}
