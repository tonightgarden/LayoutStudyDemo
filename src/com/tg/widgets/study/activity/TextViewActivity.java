package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextViewActivity extends Activity  {

	LinearLayout text_linear ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_view);
		
		text_linear = (LinearLayout) findViewById(R.id.text_linear);
		
		TextView mTextView = new TextView(this);
		mTextView.setText("我是代码添加的");
		mTextView.setTextSize(40);
		mTextView.setTextColor(Color.GREEN);
		//text_linear.addView(mTextView);
		text_linear.addView(mTextView, 1);
		
	}
}
