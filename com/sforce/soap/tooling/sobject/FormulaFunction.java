package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FormulaFunction extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public FormulaFunction() {}

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
     * element : Category of type {urn:sobject.tooling.soap.sforce.com}FormulaFunctionCategory
     * java type: com.sforce.soap.tooling.sobject.FormulaFunctionCategory
     */
    private boolean Category__is_set = false;

    private com.sforce.soap.tooling.sobject.FormulaFunctionCategory Category;

    public com.sforce.soap.tooling.sobject.FormulaFunctionCategory getCategory() {
      return Category;
    }

    public void setCategory(com.sforce.soap.tooling.sobject.FormulaFunctionCategory Category) {
      this.Category = Category;
      Category__is_set = true;
    }

    protected void setCategory(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Category", "urn:sobject.tooling.soap.sforce.com","Category","urn:sobject.tooling.soap.sforce.com","FormulaFunctionCategory",0,1,true))) {
        setCategory((com.sforce.soap.tooling.sobject.FormulaFunctionCategory)__typeMapper.readObject(__in, _lookupTypeInfo("Category", "urn:sobject.tooling.soap.sforce.com","Category","urn:sobject.tooling.soap.sforce.com","FormulaFunctionCategory",0,1,true), com.sforce.soap.tooling.sobject.FormulaFunctionCategory.class));
      }
    }

    private void writeFieldCategory(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Category", "urn:sobject.tooling.soap.sforce.com","Category","urn:sobject.tooling.soap.sforce.com","FormulaFunctionCategory",0,1,true), Category, Category__is_set);
    }

    /**
     * element : CategoryId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CategoryId__is_set = false;

    private java.lang.String CategoryId;

    public java.lang.String getCategoryId() {
      return CategoryId;
    }

    public void setCategoryId(java.lang.String CategoryId) {
      this.CategoryId = CategoryId;
      CategoryId__is_set = true;
    }

    protected void setCategoryId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CategoryId", "urn:sobject.tooling.soap.sforce.com","CategoryId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCategoryId(__typeMapper.readString(__in, _lookupTypeInfo("CategoryId", "urn:sobject.tooling.soap.sforce.com","CategoryId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCategoryId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CategoryId", "urn:sobject.tooling.soap.sforce.com","CategoryId","http://www.w3.org/2001/XMLSchema","string",0,1,true), CategoryId, CategoryId__is_set);
    }

    /**
     * element : Description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Description__is_set = false;

    private java.lang.String Description;

    public java.lang.String getDescription() {
      return Description;
    }

    public void setDescription(java.lang.String Description) {
      this.Description = Description;
      Description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Description", "urn:sobject.tooling.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDescription(__typeMapper.readString(__in, _lookupTypeInfo("Description", "urn:sobject.tooling.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Description", "urn:sobject.tooling.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true), Description, Description__is_set);
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
     * element : ExampleString of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ExampleString__is_set = false;

    private java.lang.String ExampleString;

    public java.lang.String getExampleString() {
      return ExampleString;
    }

    public void setExampleString(java.lang.String ExampleString) {
      this.ExampleString = ExampleString;
      ExampleString__is_set = true;
    }

    protected void setExampleString(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ExampleString", "urn:sobject.tooling.soap.sforce.com","ExampleString","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExampleString(__typeMapper.readString(__in, _lookupTypeInfo("ExampleString", "urn:sobject.tooling.soap.sforce.com","ExampleString","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExampleString(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ExampleString", "urn:sobject.tooling.soap.sforce.com","ExampleString","http://www.w3.org/2001/XMLSchema","string",0,1,true), ExampleString, ExampleString__is_set);
    }

    /**
     * element : IsAllowedInEntityContext of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsAllowedInEntityContext__is_set = false;

    private java.lang.Boolean IsAllowedInEntityContext;

    public java.lang.Boolean getIsAllowedInEntityContext() {
      return IsAllowedInEntityContext;
    }

    public void setIsAllowedInEntityContext(java.lang.Boolean IsAllowedInEntityContext) {
      this.IsAllowedInEntityContext = IsAllowedInEntityContext;
      IsAllowedInEntityContext__is_set = true;
    }

    protected void setIsAllowedInEntityContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsAllowedInEntityContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInEntityContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsAllowedInEntityContext((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsAllowedInEntityContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInEntityContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsAllowedInEntityContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsAllowedInEntityContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInEntityContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsAllowedInEntityContext, IsAllowedInEntityContext__is_set);
    }

    /**
     * element : IsAllowedInFlowContext of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsAllowedInFlowContext__is_set = false;

    private java.lang.Boolean IsAllowedInFlowContext;

    public java.lang.Boolean getIsAllowedInFlowContext() {
      return IsAllowedInFlowContext;
    }

    public void setIsAllowedInFlowContext(java.lang.Boolean IsAllowedInFlowContext) {
      this.IsAllowedInFlowContext = IsAllowedInFlowContext;
      IsAllowedInFlowContext__is_set = true;
    }

    protected void setIsAllowedInFlowContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsAllowedInFlowContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInFlowContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsAllowedInFlowContext((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsAllowedInFlowContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInFlowContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsAllowedInFlowContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsAllowedInFlowContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInFlowContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsAllowedInFlowContext, IsAllowedInFlowContext__is_set);
    }

    /**
     * element : IsAllowedInVisualforceContext of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsAllowedInVisualforceContext__is_set = false;

    private java.lang.Boolean IsAllowedInVisualforceContext;

    public java.lang.Boolean getIsAllowedInVisualforceContext() {
      return IsAllowedInVisualforceContext;
    }

    public void setIsAllowedInVisualforceContext(java.lang.Boolean IsAllowedInVisualforceContext) {
      this.IsAllowedInVisualforceContext = IsAllowedInVisualforceContext;
      IsAllowedInVisualforceContext__is_set = true;
    }

    protected void setIsAllowedInVisualforceContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsAllowedInVisualforceContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInVisualforceContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsAllowedInVisualforceContext((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsAllowedInVisualforceContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInVisualforceContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsAllowedInVisualforceContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsAllowedInVisualforceContext", "urn:sobject.tooling.soap.sforce.com","IsAllowedInVisualforceContext","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsAllowedInVisualforceContext, IsAllowedInVisualforceContext__is_set);
    }

    /**
     * element : Label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean Label__is_set = false;

    private java.lang.String Label;

    public java.lang.String getLabel() {
      return Label;
    }

    public void setLabel(java.lang.String Label) {
      this.Label = Label;
      Label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Label", "urn:sobject.tooling.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("Label", "urn:sobject.tooling.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Label", "urn:sobject.tooling.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true), Label, Label__is_set);
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
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "FormulaFunction");
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
      sb.append("[FormulaFunction ");
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
      writeFieldCategory(__out, __typeMapper);
      writeFieldCategoryId(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldExampleString(__out, __typeMapper);
      writeFieldIsAllowedInEntityContext(__out, __typeMapper);
      writeFieldIsAllowedInFlowContext(__out, __typeMapper);
      writeFieldIsAllowedInVisualforceContext(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCategory(__in, __typeMapper);
      setCategoryId(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setExampleString(__in, __typeMapper);
      setIsAllowedInEntityContext(__in, __typeMapper);
      setIsAllowedInFlowContext(__in, __typeMapper);
      setIsAllowedInVisualforceContext(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setName(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "Category", Category);
      toStringHelper(sb, "CategoryId", CategoryId);
      toStringHelper(sb, "Description", Description);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "ExampleString", ExampleString);
      toStringHelper(sb, "IsAllowedInEntityContext", IsAllowedInEntityContext);
      toStringHelper(sb, "IsAllowedInFlowContext", IsAllowedInFlowContext);
      toStringHelper(sb, "IsAllowedInVisualforceContext", IsAllowedInVisualforceContext);
      toStringHelper(sb, "Label", Label);
      toStringHelper(sb, "Name", Name);
    }


}