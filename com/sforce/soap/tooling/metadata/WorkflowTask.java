package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WorkflowTask extends com.sforce.soap.tooling.metadata.WorkflowAction {

    /**
     * Constructor
     */
    public WorkflowTask() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : assignedTo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean assignedTo__is_set = false;

    private java.lang.String assignedTo;

    public java.lang.String getAssignedTo() {
      return assignedTo;
    }

    public void setAssignedTo(java.lang.String assignedTo) {
      this.assignedTo = assignedTo;
      assignedTo__is_set = true;
    }

    protected void setAssignedTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("assignedTo", "urn:metadata.tooling.soap.sforce.com","assignedTo","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAssignedTo(__typeMapper.readString(__in, _lookupTypeInfo("assignedTo", "urn:metadata.tooling.soap.sforce.com","assignedTo","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssignedTo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("assignedTo", "urn:metadata.tooling.soap.sforce.com","assignedTo","http://www.w3.org/2001/XMLSchema","string",0,1,true), assignedTo, assignedTo__is_set);
    }

    /**
     * element : assignedToType of type {urn:tooling.soap.sforce.com}ActionTaskAssignedToTypes
     * java type: com.sforce.soap.tooling.ActionTaskAssignedToTypes
     */
    private boolean assignedToType__is_set = false;

    private com.sforce.soap.tooling.ActionTaskAssignedToTypes assignedToType;

    public com.sforce.soap.tooling.ActionTaskAssignedToTypes getAssignedToType() {
      return assignedToType;
    }

    public void setAssignedToType(com.sforce.soap.tooling.ActionTaskAssignedToTypes assignedToType) {
      this.assignedToType = assignedToType;
      assignedToType__is_set = true;
    }

    protected void setAssignedToType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("assignedToType", "urn:metadata.tooling.soap.sforce.com","assignedToType","urn:tooling.soap.sforce.com","ActionTaskAssignedToTypes",1,1,true))) {
        setAssignedToType((com.sforce.soap.tooling.ActionTaskAssignedToTypes)__typeMapper.readObject(__in, _lookupTypeInfo("assignedToType", "urn:metadata.tooling.soap.sforce.com","assignedToType","urn:tooling.soap.sforce.com","ActionTaskAssignedToTypes",1,1,true), com.sforce.soap.tooling.ActionTaskAssignedToTypes.class));
      }
    }

    private void writeFieldAssignedToType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("assignedToType", "urn:metadata.tooling.soap.sforce.com","assignedToType","urn:tooling.soap.sforce.com","ActionTaskAssignedToTypes",1,1,true), assignedToType, assignedToType__is_set);
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDescription(__typeMapper.readString(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), description, description__is_set);
    }

    /**
     * element : dueDateOffset of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean dueDateOffset__is_set = false;

    private int dueDateOffset;

    public int getDueDateOffset() {
      return dueDateOffset;
    }

    public void setDueDateOffset(int dueDateOffset) {
      this.dueDateOffset = dueDateOffset;
      dueDateOffset__is_set = true;
    }

    protected void setDueDateOffset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("dueDateOffset", "urn:metadata.tooling.soap.sforce.com","dueDateOffset","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setDueDateOffset((int)__typeMapper.readInt(__in, _lookupTypeInfo("dueDateOffset", "urn:metadata.tooling.soap.sforce.com","dueDateOffset","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldDueDateOffset(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("dueDateOffset", "urn:metadata.tooling.soap.sforce.com","dueDateOffset","http://www.w3.org/2001/XMLSchema","int",1,1,true), dueDateOffset, dueDateOffset__is_set);
    }

    /**
     * element : notifyAssignee of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean notifyAssignee__is_set = false;

    private boolean notifyAssignee;

    public boolean getNotifyAssignee() {
      return notifyAssignee;
    }

    public boolean isNotifyAssignee() {
      return notifyAssignee;
    }

    public void setNotifyAssignee(boolean notifyAssignee) {
      this.notifyAssignee = notifyAssignee;
      notifyAssignee__is_set = true;
    }

    protected void setNotifyAssignee(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("notifyAssignee", "urn:metadata.tooling.soap.sforce.com","notifyAssignee","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setNotifyAssignee(__typeMapper.readBoolean(__in, _lookupTypeInfo("notifyAssignee", "urn:metadata.tooling.soap.sforce.com","notifyAssignee","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldNotifyAssignee(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("notifyAssignee", "urn:metadata.tooling.soap.sforce.com","notifyAssignee","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), notifyAssignee, notifyAssignee__is_set);
    }

    /**
     * element : offsetFromField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean offsetFromField__is_set = false;

    private java.lang.String offsetFromField;

    public java.lang.String getOffsetFromField() {
      return offsetFromField;
    }

    public void setOffsetFromField(java.lang.String offsetFromField) {
      this.offsetFromField = offsetFromField;
      offsetFromField__is_set = true;
    }

    protected void setOffsetFromField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOffsetFromField(__typeMapper.readString(__in, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOffsetFromField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true), offsetFromField, offsetFromField__is_set);
    }

    /**
     * element : priority of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean priority__is_set = false;

    private java.lang.String priority;

    public java.lang.String getPriority() {
      return priority;
    }

    public void setPriority(java.lang.String priority) {
      this.priority = priority;
      priority__is_set = true;
    }

    protected void setPriority(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("priority", "urn:metadata.tooling.soap.sforce.com","priority","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setPriority(__typeMapper.readString(__in, _lookupTypeInfo("priority", "urn:metadata.tooling.soap.sforce.com","priority","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPriority(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("priority", "urn:metadata.tooling.soap.sforce.com","priority","http://www.w3.org/2001/XMLSchema","string",1,1,true), priority, priority__is_set);
    }

    /**
     * element : protected of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean _protected__is_set = false;

    private boolean _protected;

    public boolean getProtected() {
      return _protected;
    }

    public boolean isProtected() {
      return _protected;
    }

    public void setProtected(boolean _protected) {
      this._protected = _protected;
      _protected__is_set = true;
    }

    protected void setProtected(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setProtected(__typeMapper.readBoolean(__in, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldProtected(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), _protected, _protected__is_set);
    }

    /**
     * element : status of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean status__is_set = false;

    private java.lang.String status;

    public java.lang.String getStatus() {
      return status;
    }

    public void setStatus(java.lang.String status) {
      this.status = status;
      status__is_set = true;
    }

    protected void setStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("status", "urn:metadata.tooling.soap.sforce.com","status","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setStatus(__typeMapper.readString(__in, _lookupTypeInfo("status", "urn:metadata.tooling.soap.sforce.com","status","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("status", "urn:metadata.tooling.soap.sforce.com","status","http://www.w3.org/2001/XMLSchema","string",1,1,true), status, status__is_set);
    }

    /**
     * element : subject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean subject__is_set = false;

    private java.lang.String subject;

    public java.lang.String getSubject() {
      return subject;
    }

    public void setSubject(java.lang.String subject) {
      this.subject = subject;
      subject__is_set = true;
    }

    protected void setSubject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("subject", "urn:metadata.tooling.soap.sforce.com","subject","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setSubject(__typeMapper.readString(__in, _lookupTypeInfo("subject", "urn:metadata.tooling.soap.sforce.com","subject","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("subject", "urn:metadata.tooling.soap.sforce.com","subject","http://www.w3.org/2001/XMLSchema","string",1,1,true), subject, subject__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "WorkflowTask");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[WorkflowTask ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAssignedTo(__out, __typeMapper);
      writeFieldAssignedToType(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldDueDateOffset(__out, __typeMapper);
      writeFieldNotifyAssignee(__out, __typeMapper);
      writeFieldOffsetFromField(__out, __typeMapper);
      writeFieldPriority(__out, __typeMapper);
      writeFieldProtected(__out, __typeMapper);
      writeFieldStatus(__out, __typeMapper);
      writeFieldSubject(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAssignedTo(__in, __typeMapper);
      setAssignedToType(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setDueDateOffset(__in, __typeMapper);
      setNotifyAssignee(__in, __typeMapper);
      setOffsetFromField(__in, __typeMapper);
      setPriority(__in, __typeMapper);
      setProtected(__in, __typeMapper);
      setStatus(__in, __typeMapper);
      setSubject(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "assignedTo", assignedTo);
      toStringHelper(sb, "assignedToType", assignedToType);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "dueDateOffset", dueDateOffset);
      toStringHelper(sb, "notifyAssignee", notifyAssignee);
      toStringHelper(sb, "offsetFromField", offsetFromField);
      toStringHelper(sb, "priority", priority);
      toStringHelper(sb, "_protected", _protected);
      toStringHelper(sb, "status", status);
      toStringHelper(sb, "subject", subject);
    }


}