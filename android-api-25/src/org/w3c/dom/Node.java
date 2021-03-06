/*
* Copyright (c) 2004 World Wide Web Consortium,
*
* (Massachusetts Institute of Technology, European Research Consortium for
* Informatics and Mathematics, Keio University). All Rights Reserved. This
* work is distributed under the W3C(r) Software License [1] in the hope that
* it will be useful, but WITHOUT ANY WARRANTY; without even the implied
* warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*
* [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
*/

package org.w3c.dom;
public interface Node
{
public abstract  java.lang.String getNodeName();
public abstract  java.lang.String getNodeValue() throws org.w3c.dom.DOMException;
public abstract  void setNodeValue(java.lang.String nodeValue) throws org.w3c.dom.DOMException;
public abstract  short getNodeType();
public abstract  org.w3c.dom.Node getParentNode();
public abstract  org.w3c.dom.NodeList getChildNodes();
public abstract  org.w3c.dom.Node getFirstChild();
public abstract  org.w3c.dom.Node getLastChild();
public abstract  org.w3c.dom.Node getPreviousSibling();
public abstract  org.w3c.dom.Node getNextSibling();
public abstract  org.w3c.dom.NamedNodeMap getAttributes();
public abstract  org.w3c.dom.Document getOwnerDocument();
public abstract  org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node replaceChild(org.w3c.dom.Node newChild, org.w3c.dom.Node oldChild) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node removeChild(org.w3c.dom.Node oldChild) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws org.w3c.dom.DOMException;
public abstract  boolean hasChildNodes();
public abstract  org.w3c.dom.Node cloneNode(boolean deep);
public abstract  void normalize();
public abstract  boolean isSupported(java.lang.String feature, java.lang.String version);
public abstract  java.lang.String getNamespaceURI();
public abstract  java.lang.String getPrefix();
public abstract  void setPrefix(java.lang.String prefix) throws org.w3c.dom.DOMException;
public abstract  java.lang.String getLocalName();
public abstract  boolean hasAttributes();
public abstract  java.lang.String getBaseURI();
public abstract  short compareDocumentPosition(org.w3c.dom.Node other) throws org.w3c.dom.DOMException;
public abstract  java.lang.String getTextContent() throws org.w3c.dom.DOMException;
public abstract  void setTextContent(java.lang.String textContent) throws org.w3c.dom.DOMException;
public abstract  boolean isSameNode(org.w3c.dom.Node other);
public abstract  java.lang.String lookupPrefix(java.lang.String namespaceURI);
public abstract  boolean isDefaultNamespace(java.lang.String namespaceURI);
public abstract  java.lang.String lookupNamespaceURI(java.lang.String prefix);
public abstract  boolean isEqualNode(org.w3c.dom.Node arg);
public abstract  java.lang.Object getFeature(java.lang.String feature, java.lang.String version);
public abstract  java.lang.Object setUserData(java.lang.String key, java.lang.Object data, org.w3c.dom.UserDataHandler handler);
public abstract  java.lang.Object getUserData(java.lang.String key);
public static final short ATTRIBUTE_NODE = 2;
public static final short CDATA_SECTION_NODE = 4;
public static final short COMMENT_NODE = 8;
public static final short DOCUMENT_FRAGMENT_NODE = 11;
public static final short DOCUMENT_NODE = 9;
public static final short DOCUMENT_POSITION_CONTAINED_BY = 16;
public static final short DOCUMENT_POSITION_CONTAINS = 8;
public static final short DOCUMENT_POSITION_DISCONNECTED = 1;
public static final short DOCUMENT_POSITION_FOLLOWING = 4;
public static final short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;
public static final short DOCUMENT_POSITION_PRECEDING = 2;
public static final short DOCUMENT_TYPE_NODE = 10;
public static final short ELEMENT_NODE = 1;
public static final short ENTITY_NODE = 6;
public static final short ENTITY_REFERENCE_NODE = 5;
public static final short NOTATION_NODE = 12;
public static final short PROCESSING_INSTRUCTION_NODE = 7;
public static final short TEXT_NODE = 3;
}
