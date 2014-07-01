package com.asyn.jamesbond;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.asyn.jamesbond.statics.Keys;

public class SelectMovieActivity extends Activity {

	public static final int MENU_ICON_LIST = R.drawable.ic_action_view_as_list;
	public static final int MENU_ICON_GRID = R.drawable.ic_action_view_as_grid;
	public static final int LAYOUT_LIST = R.layout.movie_list_layout;
	public static final int LAYOUT_GRID = R.layout.movie_grid_layout;
	public static final String MENU_TITLE_LIST = "List";
	public static final String MENU_TITLE_GRID = "Grid";
	public static final boolean GRID = true;
	public static final boolean LIST = false;
	
	protected ListView listView;
	protected GridView gridView;

	private int type;
	private boolean currentView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_movie_activity);

		currentView = LIST; // current view is a list
		listView = (ListView) findViewById(R.id.listView);
		gridView = (GridView) findViewById(R.id.gridView);
		
		gridView.setVisibility(GridView.INVISIBLE);

		MovieListAdapter listAdapter = new MovieListAdapter(this,
				LAYOUT_LIST, getResources().getStringArray(
						R.array.list_movies_name), getResources()
						.getStringArray(R.array.list_movies_years));
		MovieListAdapter gridAdapter = new MovieListAdapter(this,
				LAYOUT_GRID, getResources().getStringArray(
						R.array.list_movies_name), getResources()
						.getStringArray(R.array.list_movies_years));
		listView.setAdapter(listAdapter);
		gridView.setAdapter(gridAdapter);
		listView.setOnItemClickListener(itemClickListener);
		gridView.setOnItemClickListener(itemClickListener);
	}
	
	protected OnItemClickListener itemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> a, View v, int position,
				long id) {
			Intent intent;
			switch (type) {
			case Keys.QUOTES:
				intent = new Intent(SelectMovieActivity.this, QuotesActivity.class);
				startActivity(intent);
				break;
			case Keys.GUNBARELLS:
				intent = new Intent(SelectMovieActivity.this, GunbarrellActivity.class);
				startActivity(intent);
				break;
			default:
				Toast.makeText(SelectMovieActivity.this, "ERROR", Toast.LENGTH_LONG).show();
				break;
			}
		}
	};

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
			if (currentView == GRID) { // equals to GRID :: convert to a list
				item.setIcon(getResources().getDrawable(MENU_ICON_GRID));
				item.setTitle(MENU_TITLE_GRID);
				listView.setVisibility(View.VISIBLE);
				gridView.setVisibility(View.INVISIBLE);
				currentView = LIST;
			} else { // equals to LIST :: convert to a grid
				item.setIcon(getResources().getDrawable(MENU_ICON_LIST));
				item.setTitle(MENU_TITLE_LIST);
				gridView.setVisibility(View.VISIBLE);
				listView.setVisibility(View.INVISIBLE);
				currentView = GRID;
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
