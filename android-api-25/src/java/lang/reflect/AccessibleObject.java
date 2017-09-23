/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
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

package java.lang.reflect;

import java.lang.annotation.Annotation;

public class AccessibleObject implements java.lang.reflect.AnnotatedElement {
	public static void setAccessible(final java.lang.reflect.AccessibleObject[] array, final boolean flag)
			throws java.lang.SecurityException {
		throw new RuntimeException("Stub!");
	}

	protected AccessibleObject() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends java.lang.annotation.Annotation> T getAnnotation(final java.lang.Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public java.lang.annotation.Annotation[] getAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getAnnotationsByType(final Class<T> annotationClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Annotation> Annotation getDeclaredAnnotation(final Class<T> annotationClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.lang.annotation.Annotation[] getDeclaredAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getDeclaredAnnotationsByType(final Class<T> annotationClass) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAccessible() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnnotationPresent(final Class<? extends Annotation> annotationClass) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAccessible(final boolean flag) throws java.lang.SecurityException {
		throw new RuntimeException("Stub!");
	}
}
