/*
* Copyright (C) 2006 The Android Open Source Project
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

package android.graphics;
public class Path
{
public static enum Op
{
DIFFERENCE(),
INTERSECT(),
REVERSE_DIFFERENCE(),
UNION(),
XOR();
}
public static enum FillType
{
EVEN_ODD(),
INVERSE_EVEN_ODD(),
INVERSE_WINDING(),
WINDING();
}
public static enum Direction
{
CCW(),
CW();
}
public  Path() { throw new RuntimeException("Stub!"); }
public  Path(android.graphics.Path src) { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void rewind() { throw new RuntimeException("Stub!"); }
public  void set(android.graphics.Path src) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Path path, android.graphics.Path.Op op) { throw new RuntimeException("Stub!"); }
public  boolean op(android.graphics.Path path1, android.graphics.Path path2, android.graphics.Path.Op op) { throw new RuntimeException("Stub!"); }
public  boolean isConvex() { throw new RuntimeException("Stub!"); }
public  android.graphics.Path.FillType getFillType() { throw new RuntimeException("Stub!"); }
public  void setFillType(android.graphics.Path.FillType ft) { throw new RuntimeException("Stub!"); }
public  boolean isInverseFillType() { throw new RuntimeException("Stub!"); }
public  void toggleInverseFillType() { throw new RuntimeException("Stub!"); }
public  boolean isEmpty() { throw new RuntimeException("Stub!"); }
public  boolean isRect(android.graphics.RectF rect) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
public  void computeBounds(android.graphics.RectF bounds, boolean exact) { throw new RuntimeException("Stub!"); }
public  void incReserve(int extraPtCount) { throw new RuntimeException("Stub!"); }
public  void moveTo(float x, float y) { throw new RuntimeException("Stub!"); }
public  void rMoveTo(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void lineTo(float x, float y) { throw new RuntimeException("Stub!"); }
public  void rLineTo(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void quadTo(float x1, float y1, float x2, float y2) { throw new RuntimeException("Stub!"); }
public  void rQuadTo(float dx1, float dy1, float dx2, float dy2) { throw new RuntimeException("Stub!"); }
public  void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) { throw new RuntimeException("Stub!"); }
public  void rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3) { throw new RuntimeException("Stub!"); }
public  void arcTo(android.graphics.RectF oval, float startAngle, float sweepAngle, boolean forceMoveTo) { throw new RuntimeException("Stub!"); }
public  void arcTo(android.graphics.RectF oval, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
public  void arcTo(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean forceMoveTo) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
public  void addRect(android.graphics.RectF rect, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addRect(float left, float top, float right, float bottom, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addOval(android.graphics.RectF oval, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addOval(float left, float top, float right, float bottom, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addCircle(float x, float y, float radius, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addArc(android.graphics.RectF oval, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
public  void addArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
public  void addRoundRect(android.graphics.RectF rect, float rx, float ry, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addRoundRect(float left, float top, float right, float bottom, float rx, float ry, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addRoundRect(android.graphics.RectF rect, float[] radii, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addRoundRect(float left, float top, float right, float bottom, float[] radii, android.graphics.Path.Direction dir) { throw new RuntimeException("Stub!"); }
public  void addPath(android.graphics.Path src, float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void addPath(android.graphics.Path src) { throw new RuntimeException("Stub!"); }
public  void addPath(android.graphics.Path src, android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
public  void offset(float dx, float dy, android.graphics.Path dst) { throw new RuntimeException("Stub!"); }
public  void offset(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void setLastPoint(float dx, float dy) { throw new RuntimeException("Stub!"); }
public  void transform(android.graphics.Matrix matrix, android.graphics.Path dst) { throw new RuntimeException("Stub!"); }
public  void transform(android.graphics.Matrix matrix) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
}
