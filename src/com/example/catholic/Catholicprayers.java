package com.example.catholic;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.widget.TextView;


import com.example.catholic.R;

public class Catholicprayers extends Activity {
	TextView prayer1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_catholicprayers);
		
		prayer1 = (TextView) findViewById(R.id.prayer1);
		//reading the method below 
		String data = readTxt();
		prayer1.setText(data);
	}
	
	
	//this methods reads textfiles
	   public String readTxt(){
			   
		    
		    InputStream inputStream = null;
			try {
				inputStream = getResources().getAssets().open("files/file_1.txt");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			     
			     int i;
			  try {
			   i = inputStream.read();
			   while (i != -1)
			      {
			       byteArrayOutputStream.write(i);
			       i = inputStream.read();
			      }
			      inputStream.close();
			  } catch (IOException e) {
			   // TODO Auto-generated catch block
				  
			   e.printStackTrace();
			  }
			     return byteArrayOutputStream.toString();
			    }
	   



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.catholicprayers, menu);
		return true;
	}

}
