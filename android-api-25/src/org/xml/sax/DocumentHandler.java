// SAX document handler.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: DocumentHandler.java,v 1.6 2002/01/30 21:13:43 dbrownell Exp $

package org.xml.sax;
@java.lang.Deprecated()
public interface DocumentHandler
{
public abstract  void setDocumentLocator(org.xml.sax.Locator locator);
public abstract  void startDocument() throws org.xml.sax.SAXException;
public abstract  void endDocument() throws org.xml.sax.SAXException;
public abstract  void startElement(java.lang.String name, org.xml.sax.AttributeList atts) throws org.xml.sax.SAXException;
public abstract  void endElement(java.lang.String name) throws org.xml.sax.SAXException;
public abstract  void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException;
public abstract  void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException;
public abstract  void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException;
}
