package com.example.sudoku;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;

public class SudokuActivity extends Activity {
	
	private Button mNewGameButton;
	private Button mContinueGameButton;
	private Button mAboutButton;
	private Button mQuitButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sudoku);
		
		mNewGameButton = (Button)findViewById(R.id.button2);
		mNewGameButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				openNewGameDialog();
			}
		});
		
		mContinueGameButton = (Button)findViewById(R.id.button1);
		mContinueGameButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		});
		
		mAboutButton = (Button)findViewById(R.id.button3);
		mAboutButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				aboutOn(v);
			}
		});
		
		mQuitButton = (Button)findViewById(R.id.button4);
		mQuitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.settings:
			startActivity(new Intent(this, Prefs.class));
			return true;
		}
		return false;
	}

	private void openNewGameDialog() {
		new AlertDialog.Builder(this)
		.setTitle(R.string.new_game_title)
		.setItems(R.array.difficulty, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int i) {
				startGame(i);
			}
		})
		.show();
	}
	
	public void aboutOn(View v) { 
		    Intent i = new Intent(this, About.class);
			startActivity(i);  
	}
	
	private void startGame(int i) {
		// TODO: Start a game
		Log.d("Sudoku", "clicked on " + i);
	}
		

}
