package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProcessBarActivity extends Activity {

	private Button start ;
	private ProgressBar firstBar;
	private ProgressBar firstBar2;
	private TextView text_process;
	
    private int current_process = 0;
    private static final int MAX = 100;
	 
	
	Handler  mHandler = new Handler(){  
          @Override  
          public void handleMessage(Message msg) {  
              super.handleMessage(msg);  
              switch (msg.what) {  
                  case 1:  
                	  firstBar.setProgress(current_process);
                	  text_process.setText(""+current_process);
                      break;  
                  default:  
                      break;  
              }  
          }  
      };  
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_process_bar);
		
		
		start = (Button) findViewById(R.id.start); 
		firstBar = (ProgressBar) findViewById(R.id.firstBar);
		text_process = (TextView) findViewById(R.id.text_process);
		
		firstBar.setMax(MAX);
		
		
		start.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				new Thread(new Runnable() {  
			            @Override  
			            public void run() {  
			                int max = firstBar.getMax();  
			                try {  
			                    //子线程循环间隔消息  
			                    while (current_process < MAX) {  
			                    	current_process += 10;  
			                        Message msg = new Message();  
			                        msg.what = 1;  
			                        mHandler.sendMessage(msg);  
			                        Thread.sleep(1000);  
			                    }  
			                } catch (InterruptedException e) {  
			                    e.printStackTrace();  
			                }  
			            }  
			        }).start();  
				
			}
		});
	}
}
