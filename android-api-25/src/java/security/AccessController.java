/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1997, 2012, Oracle and/or its affiliates. All rights reserved.
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

package java.security;
public final class AccessController
{
AccessController() { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivilegedWithCombiner(java.security.PrivilegedAction<T> action) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedAction<T> action, java.security.AccessControlContext context) { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doPrivilegedWithCombiner(java.security.PrivilegedExceptionAction<T> action) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static <T> T doPrivileged(java.security.PrivilegedExceptionAction<T> action, java.security.AccessControlContext context) throws java.security.PrivilegedActionException { throw new RuntimeException("Stub!"); }
public static  java.security.AccessControlContext getContext() { throw new RuntimeException("Stub!"); }
public static  void checkPermission(java.security.Permission perm) throws java.security.AccessControlException { throw new RuntimeException("Stub!"); }
}