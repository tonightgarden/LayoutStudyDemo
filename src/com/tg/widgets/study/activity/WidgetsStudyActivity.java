package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;
import com.tg.layoutstudydemo.layout.activity.MainActivity;
import com.tg.utils.L;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class WidgetsStudyActivity extends Activity {

	
	private ListView home_listview;
	String [] data;
	
	public static final int REQUEST_CODE = 1;
	
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
					Intent mIntent = new Intent();
					mIntent.setClass(WidgetsStudyActivity.this, TextViewActivity.class);
					mIntent.putExtra("TEXT", "我是传递过来的数据");
					startActivityForResult(mIntent, REQUEST_CODE);
				    //startActivity(mIntent);
					//toActivity(TextViewActivity.class);
					break;
				case 1:
					toActivity(ButtonStudyActivity.class);
					break;

				case 2:
					toActivity(EditTextActivity.class);
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
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onActivityResult(int, int, android.content.Intent)
	 */
	    
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		L.d("requestCode  "+requestCode+"  resultCode  "+resultCode);
		if(requestCode==REQUEST_CODE)
		{   
			if(resultCode==2)
			{
				Toast.makeText(this, data.getExtras().getString("RESULT"), Toast.LENGTH_SHORT).show();
			}
		}
		    
	}
	
}
