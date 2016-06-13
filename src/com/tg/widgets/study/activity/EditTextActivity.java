package com.tg.widgets.study.activity;

import com.tg.layoutstudydemo.R;
import com.tg.layoutstudydemo.R.layout;
import com.tg.utils.L;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends Activity {

	
	private EditText phone_edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_text);
		phone_edit = (EditText) findViewById(R.id.phone_edit);
		
		if(savedInstanceState!=null)
	    {   
	    	L.d("onCreate  "+ (String)savedInstanceState.get("PHONE"));
	    	phone_edit.setText((String)savedInstanceState.get("PHONE"));
	    }
	}
	
	
	    
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		
		// TODO Auto-generated method stub
		
		outState.putString("PHONE", phone_edit.getText().toString());
		L.d("onSaveInstanceState  "+ phone_edit.getText().toString());
		Toast.makeText(this, phone_edit.getText().toString(), 1000).show();
		super.onSaveInstanceState(outState);
	}
	
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onRestoreInstanceState(android.os.Bundle)
	 */
	    
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		
		// TODO Auto-generated method stub
		super.onRestoreInstanceState(savedInstanceState);
		    if(savedInstanceState!=null)
		    {   
		    	L.d("onRestore  "+ (String)savedInstanceState.get("PHONE"));
		    	//phone_edit.setText((String)savedInstanceState.get("PHONE"));
		    }
	}
	
}
