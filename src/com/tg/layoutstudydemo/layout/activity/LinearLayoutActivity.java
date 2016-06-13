package com.tg.layoutstudydemo.layout.activity;

import com.tg.layoutstudydemo.R;
import com.tg.utils.L;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

public class LinearLayoutActivity extends Activity {

	
	private TextView tx1;
	private TextView tx2;
	private TextView tx3;
	private TextView tx4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear_layout);
		
		tx1 = (TextView) findViewById(R.id.tx1);
		tx2 = (TextView) findViewById(R.id.tx2);
		tx3 = (TextView) findViewById(R.id.tx3);
		tx4 = (TextView) findViewById(R.id.tx4);
		
		WindowManager wm = this.getWindowManager();
	     int width = wm.getDefaultDisplay().getWidth();
	     int height = wm.getDefaultDisplay().getHeight();
	     
	     L.d("weigh "+width +" height "+height);
	
	}
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onResume()
	 */
	    
	
	    
	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		
		// TODO Auto-generated method stub
		super.onWindowFocusChanged(hasFocus);
		L.d("width "+"tx1  "+tx1.getMeasuredWidth()
		+" tx2  "+tx2.getMeasuredWidth()
		+" tx3  "+tx3.getMeasuredWidth()
		+" tx4  "+tx4.getMeasuredWidth()
				);
	}
		    
	
	@Override
	protected void onResume() {
		
		// TODO Auto-generated method stub
		super.onResume();
	}
	
}
