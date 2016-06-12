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
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
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
		
		init();
		
	}
	    
	    
	private void init() {
		
		LinearLayout linear_content = (LinearLayout) findViewById(R.id.linear_content);
		
		for(int i=0;i<3;i++)
		{
			LinearLayout linear = new LinearLayout(this);
			linear.setOrientation(LinearLayout.HORIZONTAL);
			for(int j=0;j<3;j++)
			{
				Button button = new Button(this);
				button.setText(""+i+"-"+j);
				LinearLayout.LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT, 1);
				linear.addView(button, params);
				button.setOnClickListener(this);
				button.setTag(""+i+" - "+j);
			}
			linear_content.addView(linear);
		}
		
		    
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
			 Toast.makeText(ButtonStudyActivity.this, ""+v.getTag(), Toast.LENGTH_SHORT).show();	
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
