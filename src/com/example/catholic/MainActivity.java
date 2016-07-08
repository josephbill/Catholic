package com.example.catholic;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

import com.example.catholic.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void catholicprayers (View v){
    	Intent intent = new Intent(this,Catholicprayers.class);
    	startActivity(intent);
    	
    	
    }

    
    public void newsbutton (View view){
    	goToUrl ("http://www.kccb.or.ke/");
    	
    	
    }
    
    public void Bible (View v){
    	goToUrl("http://www.sacredbible.org/catholic/index.htm");
    	
    	
    }
    
    public void mass (View v){
    	Intent intent = new Intent(this,Mass.class);
    	startActivity(intent);
    	
    	
    }
    
  
    
    public void Videos (View v){
    	
    	goToUrl("http://vlogmp3.com/video?v=jbfOfZRYLl8");
    }
    
    public void about (View v){
     	Intent intent = new Intent(this,About.class);
    	startActivity(intent);
    	
    }
    

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
