package com.asyn.jamesbond.data;

public class MovieInfo {
	
	private String mMovieName;
	private int mMoviePoster;
	private ActorProfile mBondActor;
	private int mYear;
	
	public MovieInfo(String name, int poster, int year) {
		mMovieName = name;
		mMoviePoster = poster;
		mYear = year;
	}
	
	public String getMovieName() {
		return mMovieName;
	}
	
	public int getMoviePoster() {
		return mMoviePoster;
	}
	
	public int getProductionYear() {
		return mYear;
	}
	
	public void setBondActor(ActorProfile actor) {
		mBondActor = actor;
	}
	
	public ActorProfile getBondActor() {
		return mBondActor;
	}
	

}
