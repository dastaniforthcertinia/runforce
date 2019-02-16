package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Publisher extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public Publisher() {}

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
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : InstalledEntityDefinitions of type {urn:tooling.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.tooling.QueryResult
     */
    private boolean InstalledEntityDefinitions__is_set = false;

    private com.sforce.soap.tooling.QueryResult InstalledEntityDefinitions;

    public com.sforce.soap.tooling.QueryResult getInstalledEntityDefinitions() {
      return InstalledEntityDefinitions;
    }

    public void setInstalledEntityDefinitions(com.sforce.soap.tooling.QueryResult InstalledEntityDefinitions) {
      this.InstalledEntityDefinitions = InstalledEntityDefinitions;
      InstalledEntityDefinitions__is_set = true;
    }

    protected void setInstalledEntityDefinitions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("InstalledEntityDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledEntityDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true))) {
        setInstalledEntityDefinitions((com.sforce.soap.tooling.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("InstalledEntityDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledEntityDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.tooling.QueryResult.class));
      }
    }

    private void writeFieldInstalledEntityDefinitions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("InstalledEntityDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledEntityDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true), InstalledEntityDefinitions, InstalledEntityDefinitions__is_set);
    }

    /**
     * element : InstalledFieldDefinitions of type {urn:tooling.soap.sforce.com}QueryResult
     * java type: com.sforce.soap.tooling.QueryResult
     */
    private boolean InstalledFieldDefinitions__is_set = false;

    private com.sforce.soap.tooling.QueryResult InstalledFieldDefinitions;

    public com.sforce.soap.tooling.QueryResult getInstalledFieldDefinitions() {
      return InstalledFieldDefinitions;
    }

    public void setInstalledFieldDefinitions(com.sforce.soap.tooling.QueryResult InstalledFieldDefinitions) {
      this.InstalledFieldDefinitions = InstalledFieldDefinitions;
      InstalledFieldDefinitions__is_set = true;
    }

    protected void setInstalledFieldDefinitions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("InstalledFieldDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledFieldDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true))) {
        setInstalledFieldDefinitions((com.sforce.soap.tooling.QueryResult)__typeMapper.readObject(__in, _lookupTypeInfo("InstalledFieldDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledFieldDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true), com.sforce.soap.tooling.QueryResult.class));
      }
    }

    private void writeFieldInstalledFieldDefinitions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("InstalledFieldDefinitions", "urn:sobject.tooling.soap.sforce.com","InstalledFieldDefinitions","urn:tooling.soap.sforce.com","QueryResult",0,1,true), InstalledFieldDefinitions, InstalledFieldDefinitions__is_set);
    }

    /**
     * element : IsSalesforce of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsSalesforce__is_set = false;

    private java.lang.Boolean IsSalesforce;

    public java.lang.Boolean getIsSalesforce() {
      return IsSalesforce;
    }

    public void setIsSalesforce(java.lang.Boolean IsSalesforce) {
      this.IsSalesforce = IsSalesforce;
      IsSalesforce__is_set = true;
    }

    protected void setIsSalesforce(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsSalesforce", "urn:sobject.tooling.soap.sforce.com","IsSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsSalesforce((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsSalesforce", "urn:sobject.tooling.soap.sforce.com","IsSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsSalesforce(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsSalesforce", "urn:sobject.tooling.soap.sforce.com","IsSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsSalesforce, IsSalesforce__is_set);
    }

    /**
     * element : MajorVersion of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean MajorVersion__is_set = false;

    private java.lang.Integer MajorVersion;

    public java.lang.Integer getMajorVersion() {
      return MajorVersion;
    }

    public void setMajorVersion(java.lang.Integer MajorVersion) {
      this.MajorVersion = MajorVersion;
      MajorVersion__is_set = true;
    }

    protected void setMajorVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MajorVersion", "urn:sobject.tooling.soap.sforce.com","MajorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setMajorVersion((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("MajorVersion", "urn:sobject.tooling.soap.sforce.com","MajorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldMajorVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MajorVersion", "urn:sobject.tooling.soap.sforce.com","MajorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true), MajorVersion, MajorVersion__is_set);
    }

    /**
     * element : MinorVersion of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean MinorVersion__is_set = false;

    private java.lang.Integer MinorVersion;

    public java.lang.Integer getMinorVersion() {
      return MinorVersion;
    }

    public void setMinorVersion(java.lang.Integer MinorVersion) {
      this.MinorVersion = MinorVersion;
      MinorVersion__is_set = true;
    }

    protected void setMinorVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MinorVersion", "urn:sobject.tooling.soap.sforce.com","MinorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setMinorVersion((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("MinorVersion", "urn:sobject.tooling.soap.sforce.com","MinorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldMinorVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MinorVersion", "urn:sobject.tooling.soap.sforce.com","MinorVersion","http://www.w3.org/2001/XMLSchema","int",0,1,true), MinorVersion, MinorVersion__is_set);
    }

    /**
     * element : Name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Name__is_set = false;

    private java.lang.String Name;

    public java.lang.String getName() {
      return Name;
    }

    public void setName(java.lang.String Name) {
      this.Name = Name;
      Name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Name", "urn:sobject.tooling.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true), Name, Name__is_set);
    }

    /**
     * element : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean NamespacePrefix__is_set = false;

    private java.lang.String NamespacePrefix;

    public java.lang.String getNamespacePrefix() {
      return NamespacePrefix;
    }

    public void setNamespacePrefix(java.lang.String NamespacePrefix) {
      this.NamespacePrefix = NamespacePrefix;
      NamespacePrefix__is_set = true;
    }

    protected void setNamespacePrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setNamespacePrefix(__typeMapper.readString(__in, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNamespacePrefix(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("NamespacePrefix", "urn:sobject.tooling.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), NamespacePrefix, NamespacePrefix__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "Publisher");
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
      sb.append("[Publisher ");
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
      writeFieldDurableId(__out, __typeMapper);
      writeFieldInstalledEntityDefinitions(__out, __typeMapper);
      writeFieldInstalledFieldDefinitions(__out, __typeMapper);
      writeFieldIsSalesforce(__out, __typeMapper);
      writeFieldMajorVersion(__out, __typeMapper);
      writeFieldMinorVersion(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldNamespacePrefix(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDurableId(__in, __typeMapper);
      setInstalledEntityDefinitions(__in, __typeMapper);
      setInstalledFieldDefinitions(__in, __typeMapper);
      setIsSalesforce(__in, __typeMapper);
      setMajorVersion(__in, __typeMapper);
      setMinorVersion(__in, __typeMapper);
      setName(__in, __typeMapper);
      setNamespacePrefix(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "InstalledEntityDefinitions", InstalledEntityDefinitions);
      toStringHelper(sb, "InstalledFieldDefinitions", InstalledFieldDefinitions);
      toStringHelper(sb, "IsSalesforce", IsSalesforce);
      toStringHelper(sb, "MajorVersion", MajorVersion);
      toStringHelper(sb, "MinorVersion", MinorVersion);
      toStringHelper(sb, "Name", Name);
      toStringHelper(sb, "NamespacePrefix", NamespacePrefix);
    }


}