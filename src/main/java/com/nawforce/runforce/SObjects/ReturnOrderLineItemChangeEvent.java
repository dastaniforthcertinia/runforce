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
package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ReturnOrderLineItemChangeEvent extends SObject {
	public static SObjectType$<ReturnOrderLineItemChangeEvent> SObjectType;
	public static SObjectFields$<ReturnOrderLineItemChangeEvent> Fields;
	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Id DestinationLocationId;
	public Location DestinationLocation;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id OrderItemId;
	public OrderItem OrderItem;
	public String ProcessingPlan;
	public Id Product2Id;
	public Product2 Product2;
	public Id ProductItemId;
	public ProductItem ProductItem;
	public Id ProductRequestLineItemId;
	public ProductRequestLineItem ProductRequestLineItem;
	public Decimal QuantityReturned;
	public String QuantityUnitOfMeasure;
	public String ReasonForReturn;
	public String RepaymentMethod;
	public String ReplayId;
	public Id ReturnOrderId;
	public ReturnOrder ReturnOrder;
	public String ReturnOrderLineItemNumber;
	public Id SourceLocationId;
	public Location SourceLocation;

	public ReturnOrderLineItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReturnOrderLineItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
