package com.asyn.jamesbond;

import com.asyn.jamesbond.statics.Thumbnails;

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
	protected int mLayout;

	public MovieListAdapter(Context context, int layout, String[] movies, String[] years) {
		super(context, layout, movies);
		mContext = context;
		mMovieNames = movies;
		mMovieYears = years;
		mLayout = layout;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;

		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					mLayout, null);
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
		
		holder.thumbnailImageView.setImageResource(Thumbnails.getMovieThumbnail(position));
		holder.movieNameTextView.setText(mMovieNames[position]);
		holder.movieYearTextView.setText(YEAR + mMovieYears[position]);
		
		
		return convertView;
	}

	public static class ViewHolder {
		ImageView thumbnailImageView;
		TextView movieNameTextView;
		TextView movieYearTextView;
	}

}
