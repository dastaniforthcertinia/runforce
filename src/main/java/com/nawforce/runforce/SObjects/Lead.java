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
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Lead extends SObject {
	public static SObjectType$<Lead> SObjectType;
	public static SObjectFields$<Lead> Fields;

	public Id RecordTypeId;
	public RecordType RecordType;
	public Address Address;
	public Decimal AnnualRevenue;
	public String City;
	public String CleanStatus;
	public String Company;
	public String CompanyDunsNumber;
	public Id ConvertedAccountId;
	public Account ConvertedAccount;
	public Id ConvertedContactId;
	public Contact ConvertedContact;
	public Date ConvertedDate;
	public Id ConvertedOpportunityId;
	public Opportunity ConvertedOpportunity;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DandbCompanyId;
	public DandBCompany DandbCompany;
	public String Description;
	public Boolean DoNotCall;
	public String Email;
	public Datetime EmailBouncedDate;
	public String EmailBouncedReason;
	public Boolean HasOptedOutOfEmail;
	public Boolean HasOptedOutOfFax;
	public String Fax;
	public String FirstName;
	public String GeocodeAccuracy;
	public Id Id;
	public Id IndividualId;
	public Individual Individual;
	public String Industry;
	public Boolean IsConverted;
	public Boolean IsDeleted;
	public Boolean IsUnreadByOwner;
	public String Jigsaw;
	public String JigsawContactId;
	public Date LastActivityDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastName;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public String LeadSource;
	public Decimal Longitude;
	public Id MasterRecordId;
	public Lead MasterRecord;
	public String MobilePhone;
	public String Name;
	public Integer NumberOfEmployees;
	public Id OwnerId;
	public Name Owner;
	public String Phone;
	public String PhotoUrl;
	public String PostalCode;
	public String Rating;
	public String Salutation;
	public String State;
	public String StateCode;
	public String Status;
	public String Street;
	public Datetime SystemModstamp;
	public String Title;
	public String Website;

	public AcceptedEventRelation[] AcceptedEventRelations;
	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CampaignMember[] CampaignMembers;
	public CombinedAttachment[] CombinedAttachments;
	public ContactRequest[] ContactRequests;
	public SurveyInvitation[] ContactSurveyInvitations;
	public ContentDocumentLink[] ContentDocumentLinks;
	public DeclinedEventRelation[] DeclinedEventRelations;
	public DuplicateRecordItem[] DuplicateRecordItems;
	public EmailMessageRelation[] EmailMessageRelations;
	public EmailStatus[] EmailStatuses;
	public EventRelation[] EventRelations;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public LeadFeed[] Feeds;
	public LeadHistory[] Histories;
	public LeadCleanInfo[] LeadCleanInfos;
	public ListEmailIndividualRecipient[] ListEmailIndividualRecipients;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public OutgoingEmailRelation[] OutgoingEmailRelations;
	public UserEmailPreferredPerson[] PersonRecord;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public RecordActionHistory[] RecordActionHistories;
	public RecordAction[] RecordActions;
	public CollaborationGroupRecord[] RecordAssociatedGroups;
	public WorkFeedbackRequest[] RelatedObjects;
	public ServiceAppointment[] ServiceAppointments;
	public LeadShare[] Shares;
	public SurveyInvitation[] SurveyInvitations;
	public SurveySubject[] SurveySubjectEntities;
	public Task[] Tasks;
	public TopicAssignment[] TopicAssignments;
	public UndecidedEventRelation[] UndecidedEventRelations;

	public Lead clone$() {throw new java.lang.UnsupportedOperationException();}
	public Lead clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Lead clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Lead clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Lead clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
