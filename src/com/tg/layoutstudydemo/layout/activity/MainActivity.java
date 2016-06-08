package com.tg.layoutstudydemo.layout.activity;

import com.tg.layoutstudydemo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button bt_linearLayout ;
	private Button bt_linearLayout2 ;
	private Button bt_relativeLayout ;
	private Button bt_frameLayout ;
	private Button bt_tableLayout ;
	private Button bt_absoluteLayout ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		init();
	}

	private void init() {
		
		bt_linearLayout = (Button) findViewById(R.id.bt_linearLayout);
		bt_linearLayout2 = (Button) findViewById(R.id.bt_linearLayout2);
		bt_relativeLayout = (Button) findViewById(R.id.bt_relativeLayout);
		bt_frameLayout = (Button) findViewById(R.id.bt_frameLayout);
		bt_tableLayout = (Button) findViewById(R.id.bt_tableLayout);
		bt_absoluteLayout = (Button) findViewById(R.id.bt_absoluteLayout);
		
		bt_linearLayout.setOnClickListener(this);
		bt_linearLayout2.setOnClickListener(this);
		bt_relativeLayout.setOnClickListener(this);
		bt_frameLayout.setOnClickListener(this);
		bt_tableLayout.setOnClickListener(this);
		bt_absoluteLayout.setOnClickListener(this);
		    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	    
	@Override
	public void onClick(View v) {
		Class<?> cls ;
		switch (v.getId()) {
		case R.id.bt_linearLayout:
			cls = LinearLayoutActivity.class;
			toActivity(cls);
			break;
		case R.id.bt_linearLayout2:
			cls = Linearlayout2Activity.class;
			toActivity(cls);
			break;
		case R.id.bt_relativeLayout:
			cls = RelativeLayoutActivity.class;
			toActivity(cls);
			break;
		case R.id.bt_frameLayout:
			cls = FrameLayoutActivity.class;
			toActivity(cls);
			break;
		case R.id.bt_tableLayout:
			cls = TablelayoutActivity.class;
			toActivity(cls);
			break;
		case R.id.bt_absoluteLayout:
			cls = AbsoluteLayoutActivity.class;
			toActivity(cls);
			break;
		default:
			break;
		}
		
	}
	
	private void toActivity(Class<?> cls)
	{
		Intent mIntent = new Intent();
		mIntent.setClass(this, cls);
		startActivity(mIntent);
	}
}
