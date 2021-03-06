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

// $Id: XMLGregorianCalendar.java 759822 2009-03-30 01:15:11Z mrglavas $

package javax.xml.datatype;
public abstract class XMLGregorianCalendar
  implements java.lang.Cloneable
{
public  XMLGregorianCalendar() { throw new RuntimeException("Stub!"); }
public abstract  void clear();
public abstract  void reset();
public abstract  void setYear(java.math.BigInteger year);
public abstract  void setYear(int year);
public abstract  void setMonth(int month);
public abstract  void setDay(int day);
public abstract  void setTimezone(int offset);
public  void setTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
public abstract  void setHour(int hour);
public abstract  void setMinute(int minute);
public abstract  void setSecond(int second);
public abstract  void setMillisecond(int millisecond);
public abstract  void setFractionalSecond(java.math.BigDecimal fractional);
public  void setTime(int hour, int minute, int second, java.math.BigDecimal fractional) { throw new RuntimeException("Stub!"); }
public  void setTime(int hour, int minute, int second, int millisecond) { throw new RuntimeException("Stub!"); }
public abstract  java.math.BigInteger getEon();
public abstract  int getYear();
public abstract  java.math.BigInteger getEonAndYear();
public abstract  int getMonth();
public abstract  int getDay();
public abstract  int getTimezone();
public abstract  int getHour();
public abstract  int getMinute();
public abstract  int getSecond();
public  int getMillisecond() { throw new RuntimeException("Stub!"); }
public abstract  java.math.BigDecimal getFractionalSecond();
public abstract  int compare(javax.xml.datatype.XMLGregorianCalendar xmlGregorianCalendar);
public abstract  javax.xml.datatype.XMLGregorianCalendar normalize();
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String toXMLFormat();
public abstract  javax.xml.namespace.QName getXMLSchemaType();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public abstract  boolean isValid();
public abstract  void add(javax.xml.datatype.Duration duration);
public abstract  java.util.GregorianCalendar toGregorianCalendar();
public abstract  java.util.GregorianCalendar toGregorianCalendar(java.util.TimeZone timezone, java.util.Locale aLocale, javax.xml.datatype.XMLGregorianCalendar defaults);
public abstract  java.util.TimeZone getTimeZone(int defaultZoneoffset);
public abstract  java.lang.Object clone();
}
