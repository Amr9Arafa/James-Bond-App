package com.asyn.jamesbond;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.asyn.jamesbond.adapters.QuotesListAdapter;
import com.asyn.jamesbond.statics.Keys;
import com.asyn.jamesbond.statics.Movie;

public class QuotesActivity extends Activity {

	protected ListView quoteList;
	protected int movie;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quotes_activity);

		quoteList = (ListView) findViewById(R.id.quotesList);

	}

	@Override
	protected void onResume() {
		super.onResume();
		movie = getIntent().getIntExtra(Keys.MOVIE, -1);

		switch (movie) {
		case Movie.DR_NO:
			setListForMovie(getResources().getStringArray(R.array.dr_no_quotes));
			break;
		case Movie.FROM_RUSSIA_WITH_LOVE:
			setListForMovie(getResources().getStringArray(
					R.array.list_movies_years));
			break;

		default:
			break;
		}
	}

	private void setListForMovie(String[] quotes) {
		QuotesListAdapter adapter = new QuotesListAdapter(this, quotes);
		quoteList.setAdapter(adapter);
	}
}
