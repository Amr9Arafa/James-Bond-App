package com.asyn.jamesbond;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelectMovieActivity extends ListActivity {

	private int type;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_movie_activity);

		MovieListAdapter adapter = new MovieListAdapter(this, getResources()
				.getStringArray(R.array.list_movies_name), getResources()
				.getStringArray(R.array.list_movies_years),
				R.drawable.dr_no_thumbnail);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent intent;
		switch (type) {
		case Keys.QUOTES:
			intent = new Intent(this, QuotesActivity.class);
			startActivity(intent);
			break;
		case Keys.GUNBARELLS:
			intent = new Intent(this, GunbarrellActivity.class);
			startActivity(intent);
			break;
		default:
			Toast.makeText(this, "ERROR", Toast.LENGTH_LONG).show();
			break;
		}
	}

	@Override
	protected void onResume() {
		super.onResume();
		type = getIntent().getIntExtra(Keys.TYPE, -1);
	}

}
