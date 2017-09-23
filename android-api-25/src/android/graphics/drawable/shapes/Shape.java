/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.graphics.drawable.shapes;
public abstract class Shape
  implements java.lang.Cloneable
{
public  Shape() { throw new RuntimeException("Stub!"); }
public final  float getWidth() { throw new RuntimeException("Stub!"); }
public final  float getHeight() { throw new RuntimeException("Stub!"); }
public abstract  void draw(android.graphics.Canvas canvas, android.graphics.Paint paint);
public final  void resize(float width, float height) { throw new RuntimeException("Stub!"); }
public  boolean hasAlpha() { throw new RuntimeException("Stub!"); }
protected  void onResize(float width, float height) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.shapes.Shape clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
}
