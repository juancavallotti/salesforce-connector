package com.sforce.soap.partner;

/**
 * Generated class, please do not edit.
 */
public class PicklistForRecordType implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PicklistForRecordType() {
  }
    
  
  /**
   * element  : picklistName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo picklistName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","picklistName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean picklistName__is_set = false;

  private String picklistName;

  public String getPicklistName() {
    return picklistName;
  }

  

  public void setPicklistName(String picklistName) {
    this.picklistName = picklistName;
    picklistName__is_set = true;
  }
  
  /**
   * element  : picklistValues of type {urn:partner.soap.sforce.com}PicklistEntry
   * java type: com.sforce.soap.partner.PicklistEntry[]
   */
  private static final com.sforce.ws.bind.TypeInfo picklistValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:partner.soap.sforce.com","picklistValues","urn:partner.soap.sforce.com","PicklistEntry",0,-1,true);

  private boolean picklistValues__is_set = false;

  private PicklistEntry[] picklistValues = new PicklistEntry[0];

  public PicklistEntry[] getPicklistValues() {
    return picklistValues;
  }

  

  public void setPicklistValues(PicklistEntry[] picklistValues) {
    this.picklistValues = picklistValues;
    picklistValues__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeString(__out, picklistName__typeInfo, picklistName, picklistName__is_set);
    __typeMapper.writeObject(__out, picklistValues__typeInfo, picklistValues, picklistValues__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, picklistName__typeInfo)) {
      setPicklistName((String)__typeMapper.readString(__in, picklistName__typeInfo, String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, picklistValues__typeInfo)) {
      setPicklistValues((PicklistEntry[])__typeMapper.readObject(__in, picklistValues__typeInfo, PicklistEntry[].class));
    }
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[PicklistForRecordType ");
    
    sb.append(" picklistName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistName)+"'\n");
    sb.append(" picklistValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistValues)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}