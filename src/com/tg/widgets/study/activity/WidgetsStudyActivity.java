package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;
import com.tg.layoutstudydemo.layout.activity.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class WidgetsStudyActivity extends Activity {

	
	private ListView home_listview;
	String [] data;
	private int add;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_study_home);
		
		home_listview = (ListView) findViewById(R.id.home_listview);
		data = getResources().getStringArray(R.array.widget_data);
		home_listview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, data));
		
		home_listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				switch (position) {
				case 0:
					toActivity(TextViewActivity.class);
					break;
				case 1:
					toActivity(ButtonStudyActivity.class);
					break;

				default:
					break;
				}
			}
			
		});
	}
	
	private void toActivity(Class<?> cls)
	{
		Intent mIntent = new Intent();
		mIntent.setClass(this, cls);
		startActivity(mIntent);
	}
	
}
