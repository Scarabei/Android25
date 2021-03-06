/* -*-             c-basic-offset: 4; indent-tabs-mode: nil; -*-  //------100-columns-wide------>|*/
// for license please see accompanying LICENSE.txt file (available also at http://www.xmlpull.org/)

package org.xmlpull.v1;
public interface XmlPullParser
{
public abstract  void setFeature(java.lang.String name, boolean state) throws org.xmlpull.v1.XmlPullParserException;
public abstract  boolean getFeature(java.lang.String name);
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.Object getProperty(java.lang.String name);
public abstract  void setInput(java.io.Reader in) throws org.xmlpull.v1.XmlPullParserException;
public abstract  void setInput(java.io.InputStream inputStream, java.lang.String inputEncoding) throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.String getInputEncoding();
public abstract  void defineEntityReplacementText(java.lang.String entityName, java.lang.String replacementText) throws org.xmlpull.v1.XmlPullParserException;
public abstract  int getNamespaceCount(int depth) throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.String getNamespacePrefix(int pos) throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.String getNamespaceUri(int pos) throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.String getNamespace(java.lang.String prefix);
public abstract  int getDepth();
public abstract  java.lang.String getPositionDescription();
public abstract  int getLineNumber();
public abstract  int getColumnNumber();
public abstract  boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException;
public abstract  java.lang.String getText();
public abstract  char[] getTextCharacters(int[] holderForStartAndLength);
public abstract  java.lang.String getNamespace();
public abstract  java.lang.String getName();
public abstract  java.lang.String getPrefix();
public abstract  boolean isEmptyElementTag() throws org.xmlpull.v1.XmlPullParserException;
public abstract  int getAttributeCount();
public abstract  java.lang.String getAttributeNamespace(int index);
public abstract  java.lang.String getAttributeName(int index);
public abstract  java.lang.String getAttributePrefix(int index);
public abstract  java.lang.String getAttributeType(int index);
public abstract  boolean isAttributeDefault(int index);
public abstract  java.lang.String getAttributeValue(int index);
public abstract  java.lang.String getAttributeValue(java.lang.String namespace, java.lang.String name);
public abstract  int getEventType() throws org.xmlpull.v1.XmlPullParserException;
public abstract  int next() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
public abstract  int nextToken() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
public abstract  void require(int type, java.lang.String namespace, java.lang.String name) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
public abstract  java.lang.String nextText() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
public abstract  int nextTag() throws org.xmlpull.v1.XmlPullParserException, java.io.IOException;
public static final int CDSECT = 5;
public static final int COMMENT = 9;
public static final int DOCDECL = 10;
public static final int END_DOCUMENT = 1;
public static final int END_TAG = 3;
public static final int ENTITY_REF = 6;
public static final java.lang.String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";
public static final java.lang.String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";
public static final java.lang.String FEATURE_REPORT_NAMESPACE_ATTRIBUTES = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes";
public static final java.lang.String FEATURE_VALIDATION = "http://xmlpull.org/v1/doc/features.html#validation";
public static final int IGNORABLE_WHITESPACE = 7;
public static final java.lang.String NO_NAMESPACE = "";
public static final int PROCESSING_INSTRUCTION = 8;
public static final int START_DOCUMENT = 0;
public static final int START_TAG = 2;
public static final int TEXT = 4;
public static final java.lang.String[] TYPES = null;
}
