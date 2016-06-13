package com.tg.layoutstudydemo.home;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.layout.activity.MainActivity;
import com.tg.widgets.study.activity.WidgetsStudyActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudyHomeActivity extends Activity {

	private ListView home_listview;
	String [] data;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_study_home);
		
		home_listview = (ListView) findViewById(R.id.home_listview);
		data = getResources().getStringArray(R.array.home_data);
		home_listview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, data));
		
		home_listview.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				switch (position) {
				case 0:
					toActivity(MainActivity.class);
					break;
				case 1:
					toActivity(WidgetsStudyActivity.class);
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
		
		mIntent.setClass(StudyHomeActivity.this, cls);
		startActivity(mIntent);
		overridePendingTransition(R.drawable.activity_in, R.drawable.activity_out);
	}
	
	
}
