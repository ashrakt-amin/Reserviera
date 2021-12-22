package com.example.reserviera;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

 class CustomAdapter extends BaseExpandableListAdapter {
    Context context;
    HashMap<String, List<String>> childtitles;
    List<String> headertitles;

    public CustomAdapter  (Context context, List<String> headertitles, HashMap<String, List<String>> childtitles) {

        this.context = context;
        this.headertitles = headertitles;
        this.childtitles = childtitles;

    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.headertitles.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.headertitles.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override

    public View getGroupView (int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate( R.layout.group_header, null);        }
        TextView listTitleTextView = (TextView) convertView.findViewById(R.id.title);
        listTitleTextView.setText(listTitle);
        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.childtitles.get(this.headertitles.get(groupPosition)).get(childPosition);
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.childtitles.get(this.headertitles.get(groupPosition)).size();
    }



    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }


    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final String expandedListText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_item, null);        }
        TextView expandedListTextView = (TextView) convertView.findViewById(R.id.childitem);
        expandedListTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }

    @Override
    public boolean hasStableIds() {
        return false;
}}
