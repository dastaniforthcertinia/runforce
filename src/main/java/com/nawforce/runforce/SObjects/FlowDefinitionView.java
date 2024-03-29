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

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class FlowDefinitionView extends SObject {
	public static SObjectType$<FlowDefinitionView> SObjectType;
	public static SObjectFields$<FlowDefinitionView> Fields;

	public String ActiveVersionId;
	public String ApiName;
	public String Builder;
	public String Description;
	public String DurableId;
	public Id Id;
	public String InstalledPackageName;
	public Boolean IsActive;
	public Boolean IsOutOfDate;
	public Boolean IsSwingFlow;
	public Boolean IsTemplate;
	public String Label;
	public String LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LatestVersionId;
	public String ManageableState;
	public String NamespacePrefix;
	public String ProcessType;
	public String TriggerType;

	public FlowVersionView[] Versions;

	public FlowDefinitionView clone$() {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FlowDefinitionView clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
