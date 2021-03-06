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

package android.graphics.drawable;
public class NinePatchDrawable
  extends android.graphics.drawable.Drawable
{
@java.lang.Deprecated()
public  NinePatchDrawable(android.graphics.Bitmap bitmap, byte[] chunk, android.graphics.Rect padding, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
public  NinePatchDrawable(android.content.res.Resources res, android.graphics.Bitmap bitmap, byte[] chunk, android.graphics.Rect padding, java.lang.String srcName) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  NinePatchDrawable(android.graphics.NinePatch patch) { throw new RuntimeException("Stub!"); }
public  NinePatchDrawable(android.content.res.Resources res, android.graphics.NinePatch patch) { throw new RuntimeException("Stub!"); }
public  void setTargetDensity(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void setTargetDensity(android.util.DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
public  void setTargetDensity(int density) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
public  boolean getPadding(android.graphics.Rect padding) { throw new RuntimeException("Stub!"); }
public  void getOutline(android.graphics.Outline outline) { throw new RuntimeException("Stub!"); }
public  void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
public  int getAlpha() { throw new RuntimeException("Stub!"); }
public  void setColorFilter(android.graphics.ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
public  void setTintList(android.content.res.ColorStateList tint) { throw new RuntimeException("Stub!"); }
public  void setTintMode(android.graphics.PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
public  void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
public  void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
public  boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
public  void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
public  boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
public  void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void applyTheme(android.content.res.Resources.Theme t) { throw new RuntimeException("Stub!"); }
public  boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
public  android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
public  int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
public  int getOpacity() { throw new RuntimeException("Stub!"); }
public  android.graphics.Region getTransparentRegion() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable mutate() { throw new RuntimeException("Stub!"); }
protected  boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
public  boolean isStateful() { throw new RuntimeException("Stub!"); }
}
