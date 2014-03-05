package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent; 
import android.view.View.OnClickListener;

public class SudokuActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sudoku);
		
		//Click listeners for all the buttons
		View contBtn = findViewById (R.id.button1);
		contBtn.setOnClickListener(this);
		
		View newBtn = findViewById (R.id.button2);
		newBtn.setOnClickListener(this);
		
		View aboutBtn = findViewById (R.id.button3);
		aboutBtn.setOnClickListener(this);
		
		View quitBtn = findViewById (R.id.button4);
		quitBtn.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sudoku, menu);
		return true;
	}

	@Override
	public void onClick(View v) { 
			if (v.getId() == R.id.button3)  
			{
		    Intent i = new Intent(this, About.class);
			startActivity(i);  
			}
		}
		

}
