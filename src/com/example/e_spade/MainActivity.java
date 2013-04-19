package com.example.e_spade;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity 
{
	
	Button button;
	ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applcontrol);
        
        addListenerOnButton();
    }


    public void addListenerOnButton()
    {
    	image = (ImageView) findViewById(R.id.imageView1);
    	 
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() 
		{
 
			@Override
			public void onClick(View arg0) 
			{
				image.setImageResource(R.drawable.lamp_off);
			}
    
		});
    }
}