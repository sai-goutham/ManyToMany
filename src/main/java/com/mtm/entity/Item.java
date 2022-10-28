package com.mtm.entity;

import javax.persistence.*;

@Entity
public class Item {

	@Id
	private Integer itemId;
	@Column(length = 20)
	private String itemName;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
