package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class SFDCMobileSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SFDCMobileSettings() {}

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
     * element : enableMobileLite of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableMobileLite__is_set = false;

    private boolean enableMobileLite;

    public boolean getEnableMobileLite() {
      return enableMobileLite;
    }

    public boolean isEnableMobileLite() {
      return enableMobileLite;
    }

    public void setEnableMobileLite(boolean enableMobileLite) {
      this.enableMobileLite = enableMobileLite;
      enableMobileLite__is_set = true;
    }

    protected void setEnableMobileLite(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableMobileLite", "urn:metadata.tooling.soap.sforce.com","enableMobileLite","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableMobileLite(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableMobileLite", "urn:metadata.tooling.soap.sforce.com","enableMobileLite","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableMobileLite(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableMobileLite", "urn:metadata.tooling.soap.sforce.com","enableMobileLite","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableMobileLite, enableMobileLite__is_set);
    }

    /**
     * element : enableUserToDeviceLinking of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableUserToDeviceLinking__is_set = false;

    private boolean enableUserToDeviceLinking;

    public boolean getEnableUserToDeviceLinking() {
      return enableUserToDeviceLinking;
    }

    public boolean isEnableUserToDeviceLinking() {
      return enableUserToDeviceLinking;
    }

    public void setEnableUserToDeviceLinking(boolean enableUserToDeviceLinking) {
      this.enableUserToDeviceLinking = enableUserToDeviceLinking;
      enableUserToDeviceLinking__is_set = true;
    }

    protected void setEnableUserToDeviceLinking(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableUserToDeviceLinking", "urn:metadata.tooling.soap.sforce.com","enableUserToDeviceLinking","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableUserToDeviceLinking(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableUserToDeviceLinking", "urn:metadata.tooling.soap.sforce.com","enableUserToDeviceLinking","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableUserToDeviceLinking(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableUserToDeviceLinking", "urn:metadata.tooling.soap.sforce.com","enableUserToDeviceLinking","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableUserToDeviceLinking, enableUserToDeviceLinking__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
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
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[SFDCMobileSettings ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEnableMobileLite(__out, __typeMapper);
      writeFieldEnableUserToDeviceLinking(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEnableMobileLite(__in, __typeMapper);
      setEnableUserToDeviceLinking(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "enableMobileLite", enableMobileLite);
      toStringHelper(sb, "enableUserToDeviceLinking", enableUserToDeviceLinking);
    }


}