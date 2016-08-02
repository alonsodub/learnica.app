package com.mobica.dev.learnica.domain;


public class Test{

public String description;
public String	type;
public String	quantity;
public String	unit;
public String cost;
public String	amount;


	public Test(){
    
  }
  public Test(String description, String type, String quantity, String unit, String cost, String amount) {
		this.description = description;
		this.type = type;
		this.quantity = quantity;
		this.unit = unit;
		this.cost = cost;
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}



}
