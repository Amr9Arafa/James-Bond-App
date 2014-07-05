package com.asyn.jamesbond.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.asyn.jamesbond.R;

public class QuotesListAdapter extends ArrayAdapter<String> {
	
	private Context mContext;
	private String[] mQuotes;

	public QuotesListAdapter(Context context, String[] quotes) {
		super(context, R.layout.quotes_list_layout, quotes);
		mContext = context;
		mQuotes = quotes;
	}
	
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;

		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.quotes_list_layout, null);
			holder = new ViewHolder();
			holder.quoteHolder = (TextView) convertView.findViewById(R.id.quotesTextView);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.quoteHolder.setText(mQuotes[position]);
		
		
		return convertView;
	}

	public static class ViewHolder {
		TextView quoteHolder;
	}
	

}
