package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ButtonStudyActivity extends Activity implements OnClickListener {

	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button_study);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
                Toast.makeText(ButtonStudyActivity.this, "button1", Toast.LENGTH_SHORT).show();	
			}
		});
		
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		
		MyonclickListener mMyonclickListener = new MyonclickListener();
		button4.setOnClickListener(mMyonclickListener);
		
	}
	    
	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.button2:
			  button2.setEnabled(false);
			  button3.setEnabled(true);
			  Toast.makeText(ButtonStudyActivity.this, "button2", Toast.LENGTH_SHORT).show();	
			break;
		case R.id.button3:
			button3.setEnabled(false);
			button2.setEnabled(true);
			  Toast.makeText(ButtonStudyActivity.this, "button3", Toast.LENGTH_SHORT).show();	
			break;
		default:
			break;
		}
	}
	
	public void button5Clicked(View view)
	{
		 Toast.makeText(ButtonStudyActivity.this, "button5", Toast.LENGTH_SHORT).show();	  
	}
	
	class MyonclickListener implements OnClickListener{
		    
		@Override
		public void onClick(View v) {
			 Toast.makeText(ButtonStudyActivity.this, "button4", Toast.LENGTH_SHORT).show();	  
		}
	}
	
}
