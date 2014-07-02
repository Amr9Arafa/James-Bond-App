package com.asyn.jamesbond.data;

import com.asyn.jamesbond.R;

public final class Data {

	/**
	 * FOR ACTORS YOU NEED TO SET: ACTOR NAME, PHOTO, BIRTHDATE, LIST OF MOVIES,
	 * BRIEF
	 */

	public static ActorProfile seanConnery;
	public static ActorProfile georgeLazenby;
	public static ActorProfile rogerMoore;
	public static ActorProfile timothyDalton;
	public static ActorProfile pierceBrosnan;
	public static ActorProfile danielCraig;

	/**
	 * FOR MOVIES YOU NEED TO SET MOVIE NAME, POSTER, BOND ACTOR, PRODUCTION
	 * YEAR
	 */

	public static MovieInfo drNo;
	public static MovieInfo fromRussiaWithLove;
	public static MovieInfo goldfinger;
	public static MovieInfo thunderball;
	public static MovieInfo youOnlyLiveTwice;

	public static MovieInfo onHerMajestysSecretService;

	public static MovieInfo diamondsAreForever;

	public static MovieInfo liveAndLetDie;
	public static MovieInfo theManWithTheGoldenGun;
	public static MovieInfo theSpyWhoLovedMe;
	public static MovieInfo moonraker;
	public static MovieInfo forYourEyesOnly;
	public static MovieInfo octopussy;
	public static MovieInfo aViewToAKill;

	public static MovieInfo theLivingDaylights;
	public static MovieInfo licenceToKill;

	public static MovieInfo goldenEye;
	public static MovieInfo tomorrowNeverDies;
	public static MovieInfo theWorldIsNotEnough;
	public static MovieInfo dieAnotherDay;

	public static MovieInfo casinoRoyale;
	public static MovieInfo quantumOfSolace;
	public static MovieInfo skyfall;

	/**
	 * INITIALIZING
	 */

	static {

		/**
		 * FOR ACTORS YOU NEED TO SET: ACTOR NAME, PHOTO, BIRTHDATE, LIST OF
		 * MOVIES, BRIEF
		 */
		seanConnery = new ActorProfile("Sean Connery", R.drawable.sean_connery);
		seanConnery.setBirthdate(25, "August", 1930);
		seanConnery.addMovie(drNo, fromRussiaWithLove, goldfinger, thunderball,
				youOnlyLiveTwice, diamondsAreForever);

		georgeLazenby = new ActorProfile("George Lazenby",
				R.drawable.george_lazenby);
		georgeLazenby.setBirthdate(5, "September", 1939);
		georgeLazenby.addMovie(onHerMajestysSecretService);

		rogerMoore = new ActorProfile("Roger Moore", R.drawable.roger_moore);
		rogerMoore.setBirthdate(14, "October", 1927);
		rogerMoore.addMovie(liveAndLetDie, theManWithTheGoldenGun,
				theSpyWhoLovedMe, moonraker, forYourEyesOnly, octopussy,
				aViewToAKill);

		timothyDalton = new ActorProfile("Timothy Dalton",
				R.drawable.timothy_dalton);
		timothyDalton.setBirthdate(21, "March", 1944);
		timothyDalton.addMovie(theLivingDaylights, licenceToKill);
		
		pierceBrosnan = new ActorProfile("Pierce Brosnan",
				R.drawable.pierce_brosnan);
		pierceBrosnan.setBirthdate(16, "May", 1953);
		pierceBrosnan.addMovie(tomorrowNeverDies, theWorldIsNotEnough, dieAnotherDay);
		
		danielCraig = new ActorProfile("Daniel Craig", R.drawable.daniel_craig);
		danielCraig.setBirthdate(2, "March", 1968);
		danielCraig.addMovie(casinoRoyale, quantumOfSolace, skyfall);

		/**
		 * FOR MOVIES YOU NEED TO SET MOVIE NAME, POSTER, BOND ACTOR, PRODUCTION
		 * YEAR
		 */
		
	}
}
