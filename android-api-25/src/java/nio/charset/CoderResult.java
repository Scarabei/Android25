/*
* Copyright (c) 2001, 2008, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

package java.nio.charset;
public class CoderResult
{
CoderResult() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean isUnderflow() { throw new RuntimeException("Stub!"); }
public  boolean isOverflow() { throw new RuntimeException("Stub!"); }
public  boolean isError() { throw new RuntimeException("Stub!"); }
public  boolean isMalformed() { throw new RuntimeException("Stub!"); }
public  boolean isUnmappable() { throw new RuntimeException("Stub!"); }
public  int length() { throw new RuntimeException("Stub!"); }
public static  java.nio.charset.CoderResult malformedForLength(int length) { throw new RuntimeException("Stub!"); }
public static  java.nio.charset.CoderResult unmappableForLength(int length) { throw new RuntimeException("Stub!"); }
public  void throwException() throws java.nio.charset.CharacterCodingException { throw new RuntimeException("Stub!"); }
public static final java.nio.charset.CoderResult OVERFLOW;
public static final java.nio.charset.CoderResult UNDERFLOW;
static { OVERFLOW = null; UNDERFLOW = null; }
}
