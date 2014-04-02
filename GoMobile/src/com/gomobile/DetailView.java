package com.gomobile;

import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.gomobile.navigation.ViewWithNavigation;
import com.gomobile.scanner.model.Component;

public class DetailView extends ViewWithNavigation  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_detail_view);
		this.display(ScannerController.getInstance().getComponentInUse());
	}

	public void display(Component comp){
		TextView textView = (TextView) findViewById(R.id.textViewName);
		textView.setText(comp.getName());
		textView = (TextView) findViewById(R.id.textViewPrice);
		textView.setText(String.valueOf(comp.getPrice()));
	}

	@Override
	public void navigateRight() {
		Context context = getApplicationContext();
		ShoppingCart.getInstance().add(ScannerController.getInstance().getComponentInUse());
		CharSequence text = "The component has been saved in your Shopping Cart!";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
	}

	@Override
	public void navigateLeft() {
		startActivity(new Intent(this, LowDetailView.class));		
	}

	@Override
	public void navigateUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateDown() {
		// TODO Auto-generated method stub
		
	}

}
