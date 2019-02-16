/*
 [The "BSD licence"]
 Copyright (c) 2019 Kevin Jones
 All rights reserved.

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

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package io.github.nawforce.platform.System;

@SuppressWarnings("unused")
public class SObject {
	public void addError(Object msg) {throw new java.lang.UnsupportedOperationException();}
	public void addError(Object msg, Boolean escape) {throw new java.lang.UnsupportedOperationException();}
	public void addError(String msg) {throw new java.lang.UnsupportedOperationException();}
	public void addError(String msg, Boolean escape) {throw new java.lang.UnsupportedOperationException();}
	public void clear() {throw new java.lang.UnsupportedOperationException();}
	public Object get(Schema.SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public Object get(String field) {throw new java.lang.UnsupportedOperationException();}
	public Map<String,SObject> getAll() {throw new java.lang.UnsupportedOperationException();}
	public Id getCloneSourceId() {throw new java.lang.UnsupportedOperationException();}
	public SObject getInstance() {throw new java.lang.UnsupportedOperationException();}
	public SObject getInstance(String id) {throw new java.lang.UnsupportedOperationException();}
	public Database.DMLOptions getOptions() {throw new java.lang.UnsupportedOperationException();}
	public SObject getOrgDefaults() {throw new java.lang.UnsupportedOperationException();}
	public Map<String, SObject> getPopulatedFieldsAsMap() {throw new java.lang.UnsupportedOperationException();}
	public String getQuickActionName() {throw new java.lang.UnsupportedOperationException();}
	public SObject getSObject(Schema.SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public SObject getSObject(String field) {throw new java.lang.UnsupportedOperationException();}
	public Schema.SObjectType getSObjectType() {throw new java.lang.UnsupportedOperationException();}
	public List<SObject> getSObjects(Schema.SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public List<SObject> getSObjects(String field) {throw new java.lang.UnsupportedOperationException();}
	public SObject getValues(String id) {throw new java.lang.UnsupportedOperationException();}
	public Boolean isClone() {throw new java.lang.UnsupportedOperationException();}
	public Boolean isSet(Schema.SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public Boolean isSet(String fieldName) {throw new java.lang.UnsupportedOperationException();}
	public Object put(Schema.SObjectField field, Object value) {throw new java.lang.UnsupportedOperationException();}
	public Object put(String field, Object value) {throw new java.lang.UnsupportedOperationException();}
	public SObject putSObject(Schema.SObjectField field, SObject value) {throw new java.lang.UnsupportedOperationException();}
	public SObject putSObject(String field, SObject value) {throw new java.lang.UnsupportedOperationException();}
	public void recalculateFormulas() {throw new java.lang.UnsupportedOperationException();}
	public void setOptions(Object options) {throw new java.lang.UnsupportedOperationException();}
}