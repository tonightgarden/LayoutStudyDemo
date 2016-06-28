package com.tg.study.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tg.layoutstudydemo.R;

public class SimapleListViewActivity extends Activity {

	private ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_simaple_list_view);

		listView = new ListView(this);
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, getData()));
		setContentView(listView);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent mIntent = new Intent();
				switch (position) {
				case 0:
					mIntent.setClass(SimapleListViewActivity.this, SimpleCursorAdapterActivity.class);
					startActivity(mIntent);
					break;
				case 1:
					mIntent.setClass(SimapleListViewActivity.this, SimpleAdapterActivity.class);
					startActivity(mIntent);
					break;
				case 2:
					mIntent.setClass(SimapleListViewActivity.this, MyListViewActivity.class);
					startActivity(mIntent);
					break;
				case 3:
					mIntent.setClass(SimapleListViewActivity.this, HongYangAdapterActivity.class);
					startActivity(mIntent);
					break;
				default:
					break;
				}
				    
			}
		});
		

	}

	private List<String> getData() {

		List<String> data = new ArrayList<String>();
		data.add("ShowContantsList");
		data.add("SimpleAdapter");
		data.add("MyListView");
		data.add("HongYangAdapterListView");
		return data;
	}
}
