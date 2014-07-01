package com.asyn.jamesbond.statics;

import com.asyn.jamesbond.R;

public final class Actors {

	public static final int SEAN_CONNERY = 0;
	public static final int GEORGE_LAZENBY = 1;
	public static final int ROGER_MOORE = 2;
	public static final int TIMOTHY_DALTON = 3;
	public static final int PIERCE_BROSNAN = 4;
	public static final int DANIEL_CRAIG = 5;

	public static class Photo {
		public static final int SEAN_CONNERY_PHOTO = R.drawable.sean_connery;
		public static final int GEORGE_LAZENBY_PHOTO = R.drawable.george_lazenby;
		public static final int ROGER_MOORE_PHOTO = R.drawable.roger_moore;
		public static final int TIMOTHY_DALTON_PHOTO = R.drawable.timothy_dalton;
		public static final int PIERCE_BROSNAN_PHOTO = R.drawable.pierce_brosnan;
		public static final int DANIEL_CRAIG_PHOTO = R.drawable.daniel_craig;

		public static int getActorPhoto(int position) {
			int[] thumbnails = new int[] { SEAN_CONNERY_PHOTO, GEORGE_LAZENBY_PHOTO,
					ROGER_MOORE_PHOTO, TIMOTHY_DALTON_PHOTO, PIERCE_BROSNAN_PHOTO, DANIEL_CRAIG_PHOTO };
			return thumbnails[position];
		}
	}

}
