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

package android.widget;
public class RemoteViews
  implements android.os.Parcelable, android.view.LayoutInflater.Filter
{
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public static @interface RemoteView
{
}
public static class ActionException
  extends java.lang.RuntimeException
{
public  ActionException(java.lang.Exception ex) { throw new RuntimeException("Stub!"); }
public  ActionException(java.lang.String message) { throw new RuntimeException("Stub!"); }
}
public  RemoteViews(java.lang.String packageName, int layoutId) { throw new RuntimeException("Stub!"); }
public  RemoteViews(android.widget.RemoteViews landscape, android.widget.RemoteViews portrait) { throw new RuntimeException("Stub!"); }
public  RemoteViews(android.os.Parcel parcel) { throw new RuntimeException("Stub!"); }
public  android.widget.RemoteViews clone() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackage() { throw new RuntimeException("Stub!"); }
public  int getLayoutId() { throw new RuntimeException("Stub!"); }
public  void addView(int viewId, android.widget.RemoteViews nestedView) { throw new RuntimeException("Stub!"); }
public  void removeAllViews(int viewId) { throw new RuntimeException("Stub!"); }
public  void showNext(int viewId) { throw new RuntimeException("Stub!"); }
public  void showPrevious(int viewId) { throw new RuntimeException("Stub!"); }
public  void setDisplayedChild(int viewId, int childIndex) { throw new RuntimeException("Stub!"); }
public  void setViewVisibility(int viewId, int visibility) { throw new RuntimeException("Stub!"); }
public  void setTextViewText(int viewId, java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void setTextViewTextSize(int viewId, int units, float size) { throw new RuntimeException("Stub!"); }
public  void setTextViewCompoundDrawables(int viewId, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setTextViewCompoundDrawablesRelative(int viewId, int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
public  void setImageViewResource(int viewId, int srcId) { throw new RuntimeException("Stub!"); }
public  void setImageViewUri(int viewId, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  void setImageViewBitmap(int viewId, android.graphics.Bitmap bitmap) { throw new RuntimeException("Stub!"); }
public  void setImageViewIcon(int viewId, android.graphics.drawable.Icon icon) { throw new RuntimeException("Stub!"); }
public  void setEmptyView(int viewId, int emptyViewId) { throw new RuntimeException("Stub!"); }
public  void setChronometer(int viewId, long base, java.lang.String format, boolean started) { throw new RuntimeException("Stub!"); }
public  void setChronometerCountDown(int viewId, boolean isCountDown) { throw new RuntimeException("Stub!"); }
public  void setProgressBar(int viewId, int max, int progress, boolean indeterminate) { throw new RuntimeException("Stub!"); }
public  void setOnClickPendingIntent(int viewId, android.app.PendingIntent pendingIntent) { throw new RuntimeException("Stub!"); }
public  void setPendingIntentTemplate(int viewId, android.app.PendingIntent pendingIntentTemplate) { throw new RuntimeException("Stub!"); }
public  void setOnClickFillInIntent(int viewId, android.content.Intent fillInIntent) { throw new RuntimeException("Stub!"); }
public  void setTextColor(int viewId, int color) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setRemoteAdapter(int appWidgetId, int viewId, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void setRemoteAdapter(int viewId, android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void setScrollPosition(int viewId, int position) { throw new RuntimeException("Stub!"); }
public  void setRelativeScrollPosition(int viewId, int offset) { throw new RuntimeException("Stub!"); }
public  void setViewPadding(int viewId, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
public  void setBoolean(int viewId, java.lang.String methodName, boolean value) { throw new RuntimeException("Stub!"); }
public  void setByte(int viewId, java.lang.String methodName, byte value) { throw new RuntimeException("Stub!"); }
public  void setShort(int viewId, java.lang.String methodName, short value) { throw new RuntimeException("Stub!"); }
public  void setInt(int viewId, java.lang.String methodName, int value) { throw new RuntimeException("Stub!"); }
public  void setLong(int viewId, java.lang.String methodName, long value) { throw new RuntimeException("Stub!"); }
public  void setFloat(int viewId, java.lang.String methodName, float value) { throw new RuntimeException("Stub!"); }
public  void setDouble(int viewId, java.lang.String methodName, double value) { throw new RuntimeException("Stub!"); }
public  void setChar(int viewId, java.lang.String methodName, char value) { throw new RuntimeException("Stub!"); }
public  void setString(int viewId, java.lang.String methodName, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void setCharSequence(int viewId, java.lang.String methodName, java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  void setUri(int viewId, java.lang.String methodName, android.net.Uri value) { throw new RuntimeException("Stub!"); }
public  void setBitmap(int viewId, java.lang.String methodName, android.graphics.Bitmap value) { throw new RuntimeException("Stub!"); }
public  void setBundle(int viewId, java.lang.String methodName, android.os.Bundle value) { throw new RuntimeException("Stub!"); }
public  void setIntent(int viewId, java.lang.String methodName, android.content.Intent value) { throw new RuntimeException("Stub!"); }
public  void setIcon(int viewId, java.lang.String methodName, android.graphics.drawable.Icon value) { throw new RuntimeException("Stub!"); }
public  void setContentDescription(int viewId, java.lang.CharSequence contentDescription) { throw new RuntimeException("Stub!"); }
public  void setAccessibilityTraversalBefore(int viewId, int nextId) { throw new RuntimeException("Stub!"); }
public  void setAccessibilityTraversalAfter(int viewId, int nextId) { throw new RuntimeException("Stub!"); }
public  void setLabelFor(int viewId, int labeledId) { throw new RuntimeException("Stub!"); }
public  android.view.View apply(android.content.Context context, android.view.ViewGroup parent) { throw new RuntimeException("Stub!"); }
public  void reapply(android.content.Context context, android.view.View v) { throw new RuntimeException("Stub!"); }
public  boolean onLoadClass(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.widget.RemoteViews> CREATOR;
static { CREATOR = null; }
}
