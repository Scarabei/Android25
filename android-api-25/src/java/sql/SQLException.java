/*
* Copyright (c) 1996, 2006, Oracle and/or its affiliates. All rights reserved.
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

package java.sql;

import java.util.Spliterator;
import java.util.function.Consumer;

public class SQLException extends java.lang.Exception implements java.lang.Iterable<java.lang.Throwable> {
	public SQLException() {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason, final java.lang.String SQLState) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason, final java.lang.String SQLState, final int vendorCode) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason, final java.lang.String sqlState, final int vendorCode,
			final java.lang.Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason, final java.lang.String sqlState,
			final java.lang.Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.String reason, final java.lang.Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	public SQLException(final java.lang.Throwable cause) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final Consumer<? super Throwable> action) {
		// TODO Auto-generated method stub

	}

	public int getErrorCode() {
		throw new RuntimeException("Stub!");
	}

	public java.sql.SQLException getNextException() {
		throw new RuntimeException("Stub!");
	}

	public java.lang.String getSQLState() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public java.util.Iterator<java.lang.Throwable> iterator() {
		throw new RuntimeException("Stub!");
	}

	public void setNextException(final java.sql.SQLException ex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<Throwable> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
