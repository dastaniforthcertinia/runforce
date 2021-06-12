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
public class ServiceAppointment extends SObject {
	public static SObjectType$<ServiceAppointment> SObjectType;
	public static SObjectFields$<ServiceAppointment> Fields;
	public Id AccountId;
	public Account Account;
	public Decimal ActualDuration;
	public Datetime ActualEndTime;
	public Datetime ActualStartTime;
	public Address Address;
	public String AppointmentNumber;
	public Datetime ArrivalWindowEndTime;
	public Datetime ArrivalWindowStartTime;
	public String City;
	public Id ContactId;
	public Contact Contact;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public Datetime DueDate;
	public Decimal Duration;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Datetime EarliestStartTime;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public Id OwnerId;
	public Group Owner;
	public Id ParentRecordId;
	public Account ParentRecord;
	public String ParentRecordStatusCategory;
	public String ParentRecordType;
	public String PostalCode;
	public Datetime SchedEndTime;
	public Datetime SchedStartTime;
	public String ServiceNote;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String State;
	public String Status;
	public String StatusCategory;
	public String Street;
	public String Subject;
	public Datetime SystemModstamp;
	public Id WorkTypeId;
	public WorkType WorkType;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DigitalSignature[] DigitalSignatures;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public ServiceAppointmentFeed[] Feeds;
	public ServiceAppointmentHistory[] Histories;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public ServiceReport[] ServiceReports;
	public AssignedResource[] ServiceResources;
	public ServiceAppointmentShare[] Shares;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;

	public ServiceAppointment clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceAppointment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
