package com.asyn.jamesbond;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BondListAdapter extends BaseExpandableListAdapter {
	
	private static final int NUMBER_OF_CHILDS = 1;

	protected Context mContext;
	protected String[] mBondsNames;

	public BondListAdapter(Context context, String[] names) {
		mContext = context;
		mBondsNames = names;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		String headTitle = (String) getGroup(groupPosition);
		HeadHolder holder;
		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.bonds_list_head, null);
			holder = new HeadHolder();
			holder.bondPhoto = (ImageView) convertView
					.findViewById(R.id.bondPhoto);
			holder.bondName = (TextView) convertView
					.findViewById(R.id.bondName);
			convertView.setTag(holder);
		} else {
			holder = (HeadHolder) convertView.getTag();
		}

		holder.bondPhoto.setImageResource(R.drawable.a_view_to_a_kill);
		holder.bondName.setText(headTitle);
		return convertView;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		
		String childString = (String) getChild(groupPosition, childPosition);
		ItemHolder holder;
		if (convertView == null) {
			convertView = LayoutInflater.from(mContext).inflate(
					R.layout.bonds_list_item, null);
			holder = new ItemHolder();
			holder.actorName = (TextView) convertView
					.findViewById(R.id.bondDetails);
			convertView.setTag(holder);
		} else {
			holder = (ItemHolder) convertView.getTag();
		}

		holder.actorName.setText(childString);

		return convertView;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return NUMBER_OF_CHILDS; // Control how many child should be
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return mBondsNames[groupPosition];
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public Object getGroup(int groupPosition) {
		return mBondsNames[groupPosition];
	}

	@Override
	public int getGroupCount() {
		return mBondsNames.length;
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	private static class ItemHolder {
		TextView actorName;
	}

	private static class HeadHolder {
		ImageView bondPhoto;
		TextView bondName;
	}

}