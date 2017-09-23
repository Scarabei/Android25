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
public interface UserDataHandler
{
public abstract  void handle(short operation, java.lang.String key, java.lang.Object data, org.w3c.dom.Node src, org.w3c.dom.Node dst);
public static final short NODE_ADOPTED = 5;
public static final short NODE_CLONED = 1;
public static final short NODE_DELETED = 3;
public static final short NODE_IMPORTED = 2;
public static final short NODE_RENAMED = 4;
}
