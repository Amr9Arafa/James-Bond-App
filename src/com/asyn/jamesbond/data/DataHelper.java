package com.asyn.jamesbond.data;

public final class DataHelper {
	
	public static void setActorToMovies(ActorProfile actor, MovieInfo... movies) {
		for (MovieInfo movieInfo : movies) {
			movieInfo.setBondActor(actor);
		}
	} // end method setActorToMovies

}
