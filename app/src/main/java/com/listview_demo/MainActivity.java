package com.listview_demo;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	ListView list;
	ArrayList<String> array;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		list = (ListView) findViewById(R.id.listView1);

		// initialize array list
		array = new ArrayList<String>();

		// adding items into listview
		for (int i = 0; i < 6; i++) {
			array.add("Item" + i);
		}

		// array adapter to hold the list items
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, android.R.layout.simple_list_item_1, array);

		// setting array adapter over list view
		list.setAdapter(adapter);

		// Notifying adapter for data changed
		adapter.notifyDataSetChanged();

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {

				// Showing a toast on item click
				Toast.makeText(MainActivity.this,
						"You had clicked over item :" + position,
						Toast.LENGTH_SHORT).show();

			}
		});

	}

}
