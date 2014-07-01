package com.asyn.jamesbond;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.asyn.jamesbond.statics.Keys;

public class SelectMovieActivity extends ListActivity {

	public static final int MENU_ICON_LIST = R.drawable.ic_action_view_as_list;
	public static final int MENU_ICON_GRID = R.drawable.ic_action_view_as_grid;
	public static final String MENU_TITLE_LIST = "List";
	public static final String MENU_TITLE_GRID = "Grid";
	public static final boolean GRID = true;
	public static final boolean LIST = false;

	private int type;
	private boolean switcher;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_movie_activity);
		
		switcher = GRID;

		MovieListAdapter adapter = new MovieListAdapter(this, getResources()
				.getStringArray(R.array.list_movies_name), getResources()
				.getStringArray(R.array.list_movies_years));
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
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.select_movie_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemId = item.getItemId();
		switch (itemId) {
		case R.id.menuItemListGrid:
			if(switcher) { // equals to GRID
				item.setIcon(getResources().getDrawable(MENU_ICON_LIST));
				item.setTitle(MENU_TITLE_LIST);
				switcher = LIST;
			} else { // equals to LIST
				item.setIcon(getResources().getDrawable(MENU_ICON_GRID));
				item.setTitle(MENU_TITLE_GRID);
				switcher = GRID;
			}
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onResume() {
		super.onResume();
		type = getIntent().getIntExtra(Keys.TYPE, -1);
	}

}
