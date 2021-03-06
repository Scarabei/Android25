/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

// $Id: DocumentBuilderFactory.java 884950 2009-11-27 18:46:18Z mrglavas $

package javax.xml.parsers;
public abstract class DocumentBuilderFactory
{
protected  DocumentBuilderFactory() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.DocumentBuilderFactory newInstance() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.DocumentBuilderFactory newInstance(java.lang.String factoryClassName, java.lang.ClassLoader classLoader) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.parsers.DocumentBuilder newDocumentBuilder() throws javax.xml.parsers.ParserConfigurationException;
public  void setNamespaceAware(boolean awareness) { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean validating) { throw new RuntimeException("Stub!"); }
public  void setIgnoringElementContentWhitespace(boolean whitespace) { throw new RuntimeException("Stub!"); }
public  void setExpandEntityReferences(boolean expandEntityRef) { throw new RuntimeException("Stub!"); }
public  void setIgnoringComments(boolean ignoreComments) { throw new RuntimeException("Stub!"); }
public  void setCoalescing(boolean coalescing) { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public  boolean isIgnoringElementContentWhitespace() { throw new RuntimeException("Stub!"); }
public  boolean isExpandEntityReferences() { throw new RuntimeException("Stub!"); }
public  boolean isIgnoringComments() { throw new RuntimeException("Stub!"); }
public  boolean isCoalescing() { throw new RuntimeException("Stub!"); }
public abstract  void setAttribute(java.lang.String name, java.lang.Object value) throws java.lang.IllegalArgumentException;
public abstract  java.lang.Object getAttribute(java.lang.String name) throws java.lang.IllegalArgumentException;
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.parsers.ParserConfigurationException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.parsers.ParserConfigurationException;
public  javax.xml.validation.Schema getSchema() { throw new RuntimeException("Stub!"); }
public  void setSchema(javax.xml.validation.Schema schema) { throw new RuntimeException("Stub!"); }
public  void setXIncludeAware(boolean state) { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
}
