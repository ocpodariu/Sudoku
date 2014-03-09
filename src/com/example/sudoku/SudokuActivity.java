package com.example.sudoku;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent; 

public class SudokuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sudoku);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sudoku, menu);
		return true;
	}

	public void aboutOn(View v) { 
		    Intent i = new Intent(this, About.class);
			startActivity(i);  
		}
		

}
