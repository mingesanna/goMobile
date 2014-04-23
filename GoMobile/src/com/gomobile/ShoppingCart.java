package com.gomobile;

import java.util.HashMap;

import android.content.Context;
import android.widget.Toast;

import com.gomobile.scanner.model.Component;
import com.gomobile.scanner.model.Part;

public class ShoppingCart {

	HashMap<String, Component> cart = new HashMap<String, Component>();
	
	// add component to Shopping Cart
	public void add(Component c){
		cart.put(c.getName(), c);
	}
	
	
	public boolean delete(String key){
		if(cart.containsKey(key)){
			cart.remove(key);
			return true;
		}
		return false;		
	}
	
	public String[] view(){
		String[] components = new String[cart.size()];
		int n = 0;
		for(String key: cart.keySet()){
			components[n]=cart.get(key).getName();
			n++;
		}
		return components;
	}
	
	//singleton
		private static ShoppingCart instance = null;
		
		private ShoppingCart(){}
		
		public static ShoppingCart getInstance(){
			if (instance == null){
				instance = new ShoppingCart();
			}
			return instance;
		}
		//singleton end

		
	
}
