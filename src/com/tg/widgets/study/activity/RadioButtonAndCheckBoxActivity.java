package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//RadioButton和CheckBox的区别：
//1、单个RadioButton在选中后，通过点击无法变为未选中单个              CheckBox在选中后，通过点击可以变为未选中
//2、一组RadioButton，只能同时选中一个一组                                          CheckBox，能同时选中多个
//3、RadioButton在大部分UI框架中默认都以圆形表示                           CheckBox在大部分UI框架中默认都以矩形表示
//RadioButton和RadioGroup的关系：
//1、RadioButton表示单个圆形单选框，而RadioGroup是可以容纳多个RadioButton的容器
//2、每个RadioGroup中的RadioButton同时只能有一个被选中
//3、不同的RadioGroup中的RadioButton互不相干，即如果组A中有一个选中了，组B中依然可以有一个被选中
//4、一般情况下，一个RadioGroup中至少有2个RadioButton
//5、一般情况下，一个RadioGroup中的RadioButton默认会有一个被选中，并建议您将它放在RadioGroup中的起始位置

public class RadioButtonAndCheckBoxActivity extends Activity {

	// 对控件对象进行声明
	RadioGroup genderGroup;
	RadioButton maleBtn;
	RadioButton femaleBtn;
	CheckBox swimBox;
	CheckBox runBox;
	CheckBox readBox;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_button_and_check_box);
		init();
		// 为RadioGroup设置监听器，点击其中的任何一个按钮都会调用此监听器，这里的监听器和Button控件的监听器有所不同
		// RadioGroup.OnCheckedChangeListener
		genderGroup
				.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
					// group是当前被点击的组，checkedId是当前组中被选中RadioButton的id
					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						// 传入的id等于男性按钮的id时
						if (checkedId == maleBtn.getId()) {
							// 第一个参数 当前Activity
							// 第二个参数 显示文本
							// 第三个参数 显示时间
							Toast.makeText(RadioButtonAndCheckBoxActivity.this,
									"male", Toast.LENGTH_LONG).show();
							// 传入的id等于女性按钮的id时
						} else if (checkedId == femaleBtn.getId()) {
							Toast.makeText(RadioButtonAndCheckBoxActivity.this,
									"female", Toast.LENGTH_SHORT).show();
						}
					}
				});
		// CompoundButton.OnCheckedChangeListener CheckBox是CompoundButton的子类
		// 为多选按钮添加监听器
		swimBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"swim is check", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"swim is uncheck", Toast.LENGTH_SHORT).show();
				}
			}
		});
		runBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"run is check", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"run is uncheck", Toast.LENGTH_SHORT).show();
				}
			}
		});
		readBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"read is check", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(RadioButtonAndCheckBoxActivity.this,
							"read is uncheck", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	private void init() {
		// 通过控件的ID来得到代表控件的对象
		genderGroup = (RadioGroup) findViewById(R.id.genderGroup);
		maleBtn = (RadioButton) findViewById(R.id.maleBtn);
		femaleBtn = (RadioButton) findViewById(R.id.femaleBtn);
		swimBox = (CheckBox) findViewById(R.id.swim);
		runBox = (CheckBox) findViewById(R.id.run);
		readBox = (CheckBox) findViewById(R.id.read);
	}

}
