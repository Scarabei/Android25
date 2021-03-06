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
public interface Attr
  extends org.w3c.dom.Node
{
public abstract  java.lang.String getName();
public abstract  boolean getSpecified();
public abstract  java.lang.String getValue();
public abstract  void setValue(java.lang.String value) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Element getOwnerElement();
public abstract  org.w3c.dom.TypeInfo getSchemaTypeInfo();
public abstract  boolean isId();
}
