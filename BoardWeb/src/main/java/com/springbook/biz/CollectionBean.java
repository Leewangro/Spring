package com.springbook.biz;

import java.util.Map;

public class CollectionBean {
	private Map<String, String> addressList;
	
	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}
	
	public Map<String,String> getAddressList() {
		return addressList;
	}
}
