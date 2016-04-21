package com.example.caishu2;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	int rand;

	public void fun(View view) {
		EditText b1ET = (EditText) findViewById(R.id.b1_id);
		EditText b2ET = (EditText) findViewById(R.id.b2_id);

		int b1 = Integer.parseInt(b1ET.getText().toString());
		int b2 = Integer.parseInt(b2ET.getText().toString());
		if (b1 > b2) {
			Toast.makeText(this, "第一个数必须大于第二个数", 1).show();
		} else {
			rand = new Random().nextInt(b2 - b1) + b1;

			System.out.println(rand);
		}
	}

	public void bun(View view) {
		EditText resET = (EditText) findViewById(R.id.res_iv);
		int res = Integer.parseInt(resET.getText().toString());
		if (res == rand) {
			Toast.makeText(this, "恭喜你猜对了", 1).show();
		} else if (res > rand) {
			Toast.makeText(this, "恭喜你猜的大了", 1).show();
		} else {
			Toast.makeText(this, "恭喜你猜的小了", 1).show();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
