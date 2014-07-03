package com.asyn.jamesbond.data;

import java.util.List;

public class ActorProfile {
	
	private static final String SPACE = " ";

	private String mActorName;
	private int mActorPhoto;
	private String birthdate;
	private List<MovieInfo> mMovies;
	private String mBrief;

	public ActorProfile(String name, int photo) {
		mActorName = name;
		mActorPhoto = photo;
	}
	
	public String getName() {
		return mActorName;
	}
	
	public int getPhoto() {
		return mActorPhoto;
	}

	public void addMovie(MovieInfo... movies) {
		for (MovieInfo movie : movies) {
			mMovies.add(movie);
		}
	}
	
	public List<MovieInfo> getListOfMovies() {
		return mMovies;
	}
	
	public int getTotalMovieRecords() {
		return mMovies.size();
	}

	public void setBirthdate(int day, String month, int year) {
		birthdate = day + SPACE + month + SPACE + year;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void addBrief(String brief) {
		mBrief = brief;
	}
	
	public String getBrief() {
		return mBrief;
	}
}
