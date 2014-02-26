package com.sovejo.lexdroidejercicio01;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class MainActivity extends Activity implements OnClickListener //No funciona
{
	ImageView apple,android,linux,mozilla,imagenPrincipal;
	Button boton;
	int fondoID;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imagenPrincipal = (ImageView) findViewById(R.id.iv0);
		apple = (ImageView) findViewById(R.id.iv1);
		linux = (ImageView) findViewById(R.id.iv2);
		mozilla = (ImageView) findViewById(R.id.iv3);
		android = (ImageView) findViewById(R.id.iv4);
		
		apple.setOnClickListener(this);
		linux.setOnClickListener(this);
		mozilla.setOnClickListener(this);
		android.setOnClickListener(this);
		boton.setOnClickListener(this);
		fondoID = R.drawable.android;
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
			case R.id.iv1:
				imagenPrincipal.setImageResource(R.drawable.apple);
				fondoID = R.drawable.apple;
				break;
				
			case R.id.iv2:
				imagenPrincipal.setImageResource(R.drawable.linux);
				fondoID = R.drawable.linux;
				break;
				
			case R.id.iv3:
				imagenPrincipal.setImageResource(R.drawable.mozilla);
				fondoID = R.drawable.mozilla;
				break;
				
			case R.id.iv4:
				imagenPrincipal.setImageResource(R.drawable.android);
				fondoID = R.drawable.android;
				break;
				
			case R.id.boton:
				Bitmap fondo = BitmapFactory.decodeStream(getResources().openRawResource(fondoID));
				
				try 
				{
					getApplicationContext().setWallpaper(fondo);
				} 
				catch (Exception e) 
				{
					// TODO: handle exception
					e.printStackTrace();
				}
				
				break;
		
			default:
				break;
		}
	}
}
