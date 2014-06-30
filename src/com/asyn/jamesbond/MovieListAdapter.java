package com.asyn.jamesbond;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieListAdapter extends ArrayAdapter<String> {
	
	private static final String YEAR = "Year: ";

	protected Context mContext;
	protected String[] mMovieNames;
	protected String[] mMovieYears;
	protected int image;

	public MovieListAdapter(Context context, String[] movies, String[] years,int img) {
		super(context, R.layout.movie_list_layout, movies);
		mContext = context;
		mMovieNames = movies;
		mMovieYears = years;
		image = img;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;

		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.movie_list_layout, null);
			holder = new ViewHolder();
			holder.thumbnailImageView = (ImageView) convertView
					.findViewById(R.id.thumbnailImageView);
			holder.movieNameTextView = (TextView) convertView
					.findViewById(R.id.thumbnailMovieName);
			holder.movieYearTextView = (TextView) convertView
					.findViewById(R.id.thumbnailMovieYear);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.thumbnailImageView.setImageResource(image);
		holder.movieNameTextView.setText(mMovieNames[position]);
		holder.movieYearTextView.setText(mMovieYears[position]);
		
		
		return convertView;
	}

	public static class ViewHolder {
		ImageView thumbnailImageView;
		TextView movieNameTextView;
		TextView movieYearTextView;
	}

}
