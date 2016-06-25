package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.id;
import com.tg.layoutstudydemo.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends Activity {

	private SeekBar seekbar = null;
	private TextView text = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seek_bar);
		this.seekbar = (SeekBar) super.findViewById(R.id.seekbar);
		this.text = (TextView) super.findViewById(R.id.text);
		// 设置文本可以滚动
		seekbar.setMax(50);
		seekbar.setProgress(20);
		text.setTextSize(30);
		
		this.text.setMovementMethod(ScrollingMovementMethod.getInstance());
		this.seekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListenerImp());
	}

	private class OnSeekBarChangeListenerImp implements
			SeekBar.OnSeekBarChangeListener {

		// 触发操作，拖动
		public void onProgressChanged(SeekBar seekBar, int progress,
				boolean fromUser) {
			SeekBarActivity.this.text.append("正在拖动,当前值:"
					+ seekBar.getProgress() + "\n");
		}

		// 表示进度条刚开始拖动，开始拖动时候触发的操作
		public void onStartTrackingTouch(SeekBar seekBar) {
			SeekBarActivity.this.text.append("开始拖动,当前值:"
					+ seekBar.getProgress() + "\n");
		}

		// 停止拖动时候
		public void onStopTrackingTouch(SeekBar seekBar) {
			// TODO Auto-generated method stub
			SeekBarActivity.this.text.append("停止拖动,当前值:"
					+ seekBar.getProgress() + "\n");
		}
	}
}
