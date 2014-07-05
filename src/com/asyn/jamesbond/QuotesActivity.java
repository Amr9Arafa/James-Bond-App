package com.asyn.jamesbond;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.asyn.jamesbond.adapters.QuotesListAdapter;

public class QuotesActivity extends Activity {

	protected ListView quoteList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quotes_activity);

		quoteList = (ListView) findViewById(R.id.quotesList);
		QuotesListAdapter adapter = new QuotesListAdapter(this, getResources()
				.getStringArray(R.array.list_movies_name));
		quoteList.setAdapter(adapter);
	}
}
