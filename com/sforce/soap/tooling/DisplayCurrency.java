package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum DisplayCurrency {


  
	/**
	 * Enumeration  : CORPORATE
	 */
	CORPORATE("CORPORATE"),

  
	/**
	 * Enumeration  : PERSONAL
	 */
	PERSONAL("PERSONAL"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DisplayCurrency e : EnumSet.allOf(DisplayCurrency.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DisplayCurrency(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}