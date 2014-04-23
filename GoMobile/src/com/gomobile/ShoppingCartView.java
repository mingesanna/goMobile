package com.gomobile;

import java.util.ArrayList;
import java.util.Arrays;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gomobile.navigation.ViewWithNavigation;

public class ShoppingCartView extends ViewWithNavigation {

	private ListView mainListView ;
	  private ArrayAdapter<String> listAdapter ;
	  
	  /** Called when the activity is first created. */
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_detail_view);
	    
	    // Find the ListView resource. 
	    mainListView = (ListView) findViewById( R.id.listView );

	        
	    // Create ArrayAdapter using the planet list.
	    ShoppingCart shoppingcart = ShoppingCart.getInstance();
	    
//	    Scroll test
//	    //***********************
//	    String[] shopping = new String[] { "Mercury", "Venus", "Earth", "Mars",  
//                "Jupiter", "Saturn", "Uranus", "Neptune"};
//	  //***********************
	    
	    ArrayList<String> shoppingList = new ArrayList<String>();  
	    shoppingList.addAll( Arrays.asList(shoppingcart.view()) );
	    listAdapter = new ArrayAdapter<String>(this, R.layout.simple_row, shoppingList);
	       
	    // Set the ArrayAdapter as the ListView's adapter.
	    mainListView.setAdapter( listAdapter );      
	  }
	
	
	@Override
	public void navigateRight() {
		startActivity(new Intent(this, Main.class));
	}

	@Override
	public void navigateLeft() {
		// TODO Auto-generated method stub

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
