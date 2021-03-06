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

package android.view.animation;
public abstract class Animation
  implements java.lang.Cloneable
{
protected static class Description
{
protected  Description() { throw new RuntimeException("Stub!"); }
public int type;
public float value;
}
public static interface AnimationListener
{
public abstract  void onAnimationStart(android.view.animation.Animation animation);
public abstract  void onAnimationEnd(android.view.animation.Animation animation);
public abstract  void onAnimationRepeat(android.view.animation.Animation animation);
}
public  Animation() { throw new RuntimeException("Stub!"); }
public  Animation(android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  android.view.animation.Animation clone() throws java.lang.CloneNotSupportedException { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public  void cancel() { throw new RuntimeException("Stub!"); }
public  boolean isInitialized() { throw new RuntimeException("Stub!"); }
public  void initialize(int width, int height, int parentWidth, int parentHeight) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.content.Context context, int resID) { throw new RuntimeException("Stub!"); }
public  void setInterpolator(android.view.animation.Interpolator i) { throw new RuntimeException("Stub!"); }
public  void setStartOffset(long startOffset) { throw new RuntimeException("Stub!"); }
public  void setDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
public  void restrictDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
public  void scaleCurrentDuration(float scale) { throw new RuntimeException("Stub!"); }
public  void setStartTime(long startTimeMillis) { throw new RuntimeException("Stub!"); }
public  void start() { throw new RuntimeException("Stub!"); }
public  void startNow() { throw new RuntimeException("Stub!"); }
public  void setRepeatMode(int repeatMode) { throw new RuntimeException("Stub!"); }
public  void setRepeatCount(int repeatCount) { throw new RuntimeException("Stub!"); }
public  boolean isFillEnabled() { throw new RuntimeException("Stub!"); }
public  void setFillEnabled(boolean fillEnabled) { throw new RuntimeException("Stub!"); }
public  void setFillBefore(boolean fillBefore) { throw new RuntimeException("Stub!"); }
public  void setFillAfter(boolean fillAfter) { throw new RuntimeException("Stub!"); }
public  void setZAdjustment(int zAdjustment) { throw new RuntimeException("Stub!"); }
public  void setBackgroundColor(int bg) { throw new RuntimeException("Stub!"); }
protected  float getScaleFactor() { throw new RuntimeException("Stub!"); }
public  void setDetachWallpaper(boolean detachWallpaper) { throw new RuntimeException("Stub!"); }
public  android.view.animation.Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
public  long getStartTime() { throw new RuntimeException("Stub!"); }
public  long getDuration() { throw new RuntimeException("Stub!"); }
public  long getStartOffset() { throw new RuntimeException("Stub!"); }
public  int getRepeatMode() { throw new RuntimeException("Stub!"); }
public  int getRepeatCount() { throw new RuntimeException("Stub!"); }
public  boolean getFillBefore() { throw new RuntimeException("Stub!"); }
public  boolean getFillAfter() { throw new RuntimeException("Stub!"); }
public  int getZAdjustment() { throw new RuntimeException("Stub!"); }
public  int getBackgroundColor() { throw new RuntimeException("Stub!"); }
public  boolean getDetachWallpaper() { throw new RuntimeException("Stub!"); }
public  boolean willChangeTransformationMatrix() { throw new RuntimeException("Stub!"); }
public  boolean willChangeBounds() { throw new RuntimeException("Stub!"); }
public  void setAnimationListener(android.view.animation.Animation.AnimationListener listener) { throw new RuntimeException("Stub!"); }
protected  void ensureInterpolator() { throw new RuntimeException("Stub!"); }
public  long computeDurationHint() { throw new RuntimeException("Stub!"); }
public  boolean getTransformation(long currentTime, android.view.animation.Transformation outTransformation) { throw new RuntimeException("Stub!"); }
public  boolean getTransformation(long currentTime, android.view.animation.Transformation outTransformation, float scale) { throw new RuntimeException("Stub!"); }
public  boolean hasStarted() { throw new RuntimeException("Stub!"); }
public  boolean hasEnded() { throw new RuntimeException("Stub!"); }
protected  void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) { throw new RuntimeException("Stub!"); }
protected  float resolveSize(int type, float value, int size, int parentSize) { throw new RuntimeException("Stub!"); }
protected  void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }
public static final int ABSOLUTE = 0;
public static final int INFINITE = -1;
public static final int RELATIVE_TO_PARENT = 2;
public static final int RELATIVE_TO_SELF = 1;
public static final int RESTART = 1;
public static final int REVERSE = 2;
public static final int START_ON_FIRST_FRAME = -1;
public static final int ZORDER_BOTTOM = -1;
public static final int ZORDER_NORMAL = 0;
public static final int ZORDER_TOP = 1;
}
