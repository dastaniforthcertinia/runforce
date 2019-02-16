package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ActionOverrideType {


  
	/**
	 * Enumeration  : Default
	 */
	Default("Default"),

  
	/**
	 * Enumeration  : Standard
	 */
	Standard("Standard"),

  
	/**
	 * Enumeration  : Scontrol
	 */
	Scontrol("Scontrol"),

  
	/**
	 * Enumeration  : Visualforce
	 */
	Visualforce("Visualforce"),

  
	/**
	 * Enumeration  : Flexipage
	 */
	Flexipage("Flexipage"),

  
	/**
	 * Enumeration  : LightningComponent
	 */
	LightningComponent("LightningComponent"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ActionOverrideType e : EnumSet.allOf(ActionOverrideType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ActionOverrideType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}