package com.example.sudoku;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;

public class Graphics extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(new GraphicsView(this));
	}
	
	static public class GraphicsView extends View{
		public GraphicsView(Context context){
			super(context);
		}
		@Override
		protected void onDraw(Canvas canvas){
			//Drawing commands
		}
	}
	
}
