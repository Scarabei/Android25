/*
* Copyright (C) 2009 The Android Open Source Project
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

package android.widget;
public class HorizontalScrollView
  extends android.widget.FrameLayout
{
public  HorizontalScrollView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  HorizontalScrollView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  HorizontalScrollView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  HorizontalScrollView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
protected  float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
public  int getMaxScrollAmount() { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  void addView(android.view.View child, int index, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
public  boolean isFillViewport() { throw new RuntimeException("Stub!"); }
public  void setFillViewport(boolean fillViewport) { throw new RuntimeException("Stub!"); }
public  boolean isSmoothScrollingEnabled() { throw new RuntimeException("Stub!"); }
public  void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean executeKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
protected  void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  boolean pageScroll(int direction) { throw new RuntimeException("Stub!"); }
public  boolean fullScroll(int direction) { throw new RuntimeException("Stub!"); }
public  boolean arrowScroll(int direction) { throw new RuntimeException("Stub!"); }
public final  void smoothScrollBy(int dx, int dy) { throw new RuntimeException("Stub!"); }
public final  void smoothScrollTo(int x, int y) { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
protected  int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  void measureChild(android.view.View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void measureChildWithMargins(android.view.View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); }
public  void computeScroll() { throw new RuntimeException("Stub!"); }
protected  int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect rect) { throw new RuntimeException("Stub!"); }
public  void requestChildFocus(android.view.View child, android.view.View focused) { throw new RuntimeException("Stub!"); }
protected  boolean onRequestFocusInDescendants(int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  boolean requestChildRectangleOnScreen(android.view.View child, android.graphics.Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
public  void fling(int velocityX) { throw new RuntimeException("Stub!"); }
public  void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); }
public  void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"SuspiciousNameCombination"})
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
}
