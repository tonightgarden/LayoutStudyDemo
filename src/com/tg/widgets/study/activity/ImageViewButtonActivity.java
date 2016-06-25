package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;
import com.tg.utils.ToastUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class ImageViewButtonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_image_view_button);
		
		findViewById(R.id.imgbt_music).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				ToastUtils.show(ImageViewButtonActivity.this, "music", 500);
			}
		});
	}
}
