/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.Schema;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class FieldSet {
	public String Description;
	public List<FieldSetMember> Fields;
	public String Label;
	public String Name;
	public String NameSpace;
	public SObjectType SObjectType;

	public String getDescription() {throw new java.lang.UnsupportedOperationException();}
	public List<FieldSetMember> getFields() {throw new java.lang.UnsupportedOperationException();}
	public String getLabel() {throw new java.lang.UnsupportedOperationException();}
	public String getName() {throw new java.lang.UnsupportedOperationException();}
	public String getNameSpace() {throw new java.lang.UnsupportedOperationException();}
	public SObjectType getSObjectType() {throw new java.lang.UnsupportedOperationException();}
}
