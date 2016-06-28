package com.tg.study.listview;

import java.util.ArrayList;
import java.util.List;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;
import com.tg.study.listview.beans.Student;
import com.tg.study.listview.zhy.adpter.CommonAdapter;
import com.tg.study.listview.zhy.adpter.ViewHolder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class HongYangAdapterActivity extends Activity {

	
	private ListView myListView;
	private List<Student> mList = new ArrayList<Student>();
	private CommonAdapter<Student> commonAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hong_yang_adapter);
		
		myListView = (ListView) findViewById(R.id.myListView);
		
		initdata();
		
		commonAdapter = new CommonAdapter<Student>(this, mList, R.layout.list_item) {
			@Override
			public void convert(ViewHolder helper, Student item, int position) {
				// TODO Auto-generated method stub
				helper.setText(R.id.title, item.getName());
				helper.setText(R.id.info, String.valueOf(item.getAge()));
				helper.setImageResource(R.id.img, item.getType()==0?R.drawable.i1:R.drawable.i2);
			}
		};
		
		myListView.setAdapter(commonAdapter);
		
	}
	    
	private void initdata() {
		// TODO Auto-generated method stub
		for(int i = 0; i<40;i++)
		{
			Student stu = new Student("name"+i+1, i, i%2);
			mList.add(stu);
		}
	}
}
