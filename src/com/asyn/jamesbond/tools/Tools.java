package com.asyn.jamesbond.tools;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Tools {
	
	private AdView adView;
	private AdRequest adRequest;
	
	public void AdsLoader(AdView view) {
		adView = view;
		adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);
	} // end constructor

}
