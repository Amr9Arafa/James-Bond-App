package com.asyn.jamesbond.data;

import com.asyn.jamesbond.R;

public class Data {

	/**
	 * FOR ACTORS YOU NEED TO SET: ACTOR NAME, PHOTO, BIRTHDATE, LIST OF MOVIES,
	 * BRIEF
	 */

	public 	ActorProfile seanConnery;
	public  ActorProfile georgeLazenby;
	public  ActorProfile rogerMoore;
	public  ActorProfile timothyDalton;
	public  ActorProfile pierceBrosnan;
	public  ActorProfile danielCraig;

	/**
	 * FOR MOVIES YOU NEED TO SET MOVIE NAME, POSTER, BOND ACTOR, PRODUCTION
	 * YEAR
	 */

	public  MovieInfo drNo;
	public  MovieInfo fromRussiaWithLove;
	public  MovieInfo goldfinger;
	public  MovieInfo thunderball;
	public  MovieInfo youOnlyLiveTwice;

	public  MovieInfo onHerMajestysSecretService;

	public  MovieInfo diamondsAreForever;

	public  MovieInfo liveAndLetDie;
	public  MovieInfo theManWithTheGoldenGun;
	public  MovieInfo theSpyWhoLovedMe;
	public  MovieInfo moonraker;
	public  MovieInfo forYourEyesOnly;
	public  MovieInfo octopussy;
	public  MovieInfo aViewToAKill;

	public  MovieInfo theLivingDaylights;
	public  MovieInfo licenceToKill;

	public  MovieInfo goldenEye;
	public  MovieInfo tomorrowNeverDies;
	public  MovieInfo theWorldIsNotEnough;
	public  MovieInfo dieAnotherDay;

	public  MovieInfo casinoRoyale;
	public  MovieInfo quantumOfSolace;
	public  MovieInfo skyfall;

	public Data() {
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
		pierceBrosnan.addMovie(tomorrowNeverDies, theWorldIsNotEnough,
				dieAnotherDay);

		danielCraig = new ActorProfile("Daniel Craig", R.drawable.daniel_craig);
		danielCraig.setBirthdate(2, "March", 1968);
		danielCraig.addMovie(casinoRoyale, quantumOfSolace, skyfall);

		/**
		 * FOR MOVIES YOU NEED TO SET MOVIE NAME, POSTER, BOND ACTOR, PRODUCTION
		 * YEAR
		 */

		drNo = new MovieInfo("Dr. No", R.drawable.dr_no, 1962);
		fromRussiaWithLove = new MovieInfo("From Russia with Love",
				R.drawable.from_russia_with_love, 1963);
		goldfinger = new MovieInfo("Goldfinger", R.drawable.goldfinger, 1964);
		thunderball = new MovieInfo("thunderball", R.drawable.thunderball, 1965);
		youOnlyLiveTwice = new MovieInfo("You Only Live Twice",
				R.drawable.you_only_live_twice, 1967);
		diamondsAreForever = new MovieInfo("Diamonds Are Forever",
				R.drawable.diamonds_are_forever, 1971);
		DataHelper.setActorToMovies(seanConnery, drNo, fromRussiaWithLove,
				goldfinger, thunderball, youOnlyLiveTwice, diamondsAreForever);

		onHerMajestysSecretService = new MovieInfo(
				"On Her Majesty/'s Secret Service",
				R.drawable.on_her_majestys_secret_service, 1969);
		DataHelper.setActorToMovies(georgeLazenby, onHerMajestysSecretService);

		liveAndLetDie = new MovieInfo("Live and Let Die",
				R.drawable.live_and_let_die, 1973);
		theManWithTheGoldenGun = new MovieInfo("The Man With The Golden Gun",
				R.drawable.the_man_with_the_golden_gun_, 1974);
		theSpyWhoLovedMe = new MovieInfo("The Spy Who Loved Me",
				R.drawable.the_spy_who_loved, 1977);
		moonraker = new MovieInfo("Moonraker", R.drawable.moonraker, 1979);
		forYourEyesOnly = new MovieInfo("For Your Eyes Only",
				R.drawable.for_your_eyes_only, 1981);
		octopussy = new MovieInfo("Octopussy", R.drawable.octopussy, 1983);
		aViewToAKill = new MovieInfo("A View To A Kill",
				R.drawable.a_view_to_a_kill, 1985);
		DataHelper.setActorToMovies(rogerMoore, liveAndLetDie,
				theManWithTheGoldenGun, theSpyWhoLovedMe, moonraker,
				forYourEyesOnly, octopussy, aViewToAKill);

		theLivingDaylights = new MovieInfo("The Living Daylights",
				R.drawable.the_living_daylights, 1987);
		licenceToKill = new MovieInfo("Licence to Kill",
				R.drawable.licence_to_kill, 1989);
		DataHelper.setActorToMovies(timothyDalton, theLivingDaylights,
				licenceToKill);

		goldenEye = new MovieInfo("GoldeEye", R.drawable.goldeneye, 1995);
		tomorrowNeverDies = new MovieInfo("Tomorrow Never Dies",
				R.drawable.tomorrow_never_twice, 1997);
		theWorldIsNotEnough = new MovieInfo("The World Is Not Enough",
				R.drawable.the_world_is_not_enough, 1999);
		dieAnotherDay = new MovieInfo("Die Another Day",
				R.drawable.die_another_day, 2002);
		DataHelper.setActorToMovies(pierceBrosnan, goldenEye,
				tomorrowNeverDies, theWorldIsNotEnough, dieAnotherDay);

		casinoRoyale = new MovieInfo("Casino Royale", R.drawable.casino_royale,
				2006);
		quantumOfSolace = new MovieInfo("Quantum of Solace",
				R.drawable.quantum_of_solace, 2008);
		skyfall = new MovieInfo("Skyfall", R.drawable.skyfall, 2012);
		DataHelper.setActorToMovies(danielCraig, casinoRoyale, quantumOfSolace,
				skyfall);
	}

	public ActorProfile[] getActorData() {

		return new ActorProfile[] { seanConnery, georgeLazenby, rogerMoore,
				timothyDalton, pierceBrosnan, danielCraig };
	}

	public MovieInfo[] getMovieData() {

		return new MovieInfo[] { drNo, fromRussiaWithLove, goldfinger,
				thunderball, youOnlyLiveTwice, onHerMajestysSecretService,
				diamondsAreForever, liveAndLetDie, theManWithTheGoldenGun,
				theSpyWhoLovedMe, moonraker, forYourEyesOnly, octopussy,
				aViewToAKill, theLivingDaylights, licenceToKill, goldenEye,
				tomorrowNeverDies, theWorldIsNotEnough, dieAnotherDay,
				casinoRoyale, quantumOfSolace, skyfall };
	}
}
