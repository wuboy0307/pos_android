package com.example.thithi;

import android.R.bool;

public class Product {
	//private variables
		int _id;
		String _category;
		String _name;
		String _img;
		int _qty;
		int _cdate;
		int _mdate;
		Float _whosale_price;
		Float _retail_price;
		bool _status;
		
		// Empty constructor
		public Product(){
			
		}
		
		// constructor
		public Product(int id, String category , String name, String img , int qty){
			this._id = id;
			this._category = category;
			this._name = name;
			this._img = img;
			this._qty = qty;
		}
				
		// constructor
		public Product(int id, String category , String name, String img){
			this._id = id;
			this._category = category;
			this._name = name;
			this._img = img;
		}
		
		// constructor
		public Product(String category , String name, String img){
			this._category = category;
			this._name = name;
			this._img = img;
		}
				
		// constructor
		public Product(String name, String img){
			this._name = name;
			this._img = img;
		}
		
		// getting ID
		public int getID(){
			return this._id;
		}
		
		// setting id
		public void setID(int id){
			this._id = id;
		}
		
		// getting category
		public String getCategory(){
			return this._category;
		}
		
		// setting name
		public void setCategory(String category){
			this._category = category;
		}
		
		// getting name
		public String getName(){
			return this._name;
		}
		
		// setting name
		public void setName(String name){
			this._name = name;
		}
		
		// getting image
		public String getImage(){
			return this._img;
		}
		
		// setting image
		public void setImage(String image){
			this._img = image;
		}
		
		// getting quantity
		public int getQuantity(){
			return this._qty;
		}
		
		// setting quantity
		public void setQuantity(int qty){
			this._qty = qty;
		}
		
		// getting create date
		public int getCreateDate(){
			return this._cdate;
		}
		
		// setting create date
		public void setCreateDate(int cdate){
			this._cdate = cdate;
		}
		
		// getting modify date
		public int getModifyDate(){
			return this._mdate;
		}
		
		// setting modify date
		public void setModifyDate(int mdate){
			this._mdate = mdate;
		}
		
		// getting whosale price
		public Float getWhosallePrice(){
			return this._whosale_price;
		}
		
		// setting whosale price
		public void setWhosallePrice(Float Wholesale_price){
			this._whosale_price = Wholesale_price;
		}
		
		// getting retail price
		public Float getRetailPrice(){
			return this._whosale_price;
		}
		
		// setting retail price
		public void setRetailPrice(Float Wholesale_price){
			this._whosale_price = Wholesale_price;
		}
		
		// getting status
		public bool getStatus(){
			return this._status;
		}
		
		// setting status
		public void setStatus(bool status){
			this._status = status;
		}

}
