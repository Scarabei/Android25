/*
* Copyright (C) 2013 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E> {
	public ArraySet() {
		throw new RuntimeException("Stub!");
	}

	public ArraySet(final android.util.ArraySet<E> set) {
		throw new RuntimeException("Stub!");
	}

	public ArraySet(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E value) {
		throw new RuntimeException("Stub!");
	}

	public void addAll(final android.util.ArraySet<? extends E> array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final java.util.Collection<? extends E> collection) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(final java.lang.Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsAll(final java.util.Collection<?> collection) {
		throw new RuntimeException("Stub!");
	}

	public void ensureCapacity(final int minimumCapacity) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final java.lang.Object object) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final Consumer<? super E> action) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public int indexOf(final java.lang.Object key) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public java.util.Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Stream<E> parallelStream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(final java.lang.Object object) {
		throw new RuntimeException("Stub!");
	}

	public boolean removeAll(final android.util.ArraySet<? extends E> array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(final java.util.Collection<?> collection) {
		throw new RuntimeException("Stub!");
	}

	public E removeAt(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(final Predicate<? super E> filter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(final java.util.Collection<?> collection) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<E> stream() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.lang.Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T[] toArray(final T[] array) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public java.lang.String toString() {
		throw new RuntimeException("Stub!");
	}

	public E valueAt(final int index) {
		throw new RuntimeException("Stub!");
	}
}
