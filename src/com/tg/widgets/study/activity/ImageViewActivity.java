package com.tg.widgets.study.activity;

import java.io.IOException;
import java.io.InputStream;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class ImageViewActivity extends Activity {

	private ImageView imageView2 ;
	private ImageView imageView3 ;
	private ImageView imageView4 ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_image_view);
		
		imageView2 = (ImageView)findViewById(R.id.imageView2);
		imageView3 = (ImageView)findViewById(R.id.imageView3);
		imageView4 = (ImageView)findViewById(R.id.imageView4);
	
		imageView2.setImageResource(R.drawable.weixin);
		imageView2.setImageAlpha(100);
		
		try {
			InputStream in = getAssets().open("weixin2.png");
			 Bitmap bmp=BitmapFactory.decodeStream(in); 
			 imageView3.setImageBitmap(bmp);
			 in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
