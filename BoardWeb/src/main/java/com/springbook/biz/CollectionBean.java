package com.springbook.biz;

import java.util.List;

public class CollectionBean {
	private List<String> addressList;
	
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
	
	public List<String> getAddreasList() {
		return addressList;
	}
}
