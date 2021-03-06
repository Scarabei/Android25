/*
* Copyright (C) 2010 The Android Open Source Project
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
public class SearchView
  extends android.widget.LinearLayout
  implements android.view.CollapsibleActionView
{
public static interface OnQueryTextListener
{
public abstract  boolean onQueryTextSubmit(java.lang.String query);
public abstract  boolean onQueryTextChange(java.lang.String newText);
}
public static interface OnCloseListener
{
public abstract  boolean onClose();
}
public static interface OnSuggestionListener
{
public abstract  boolean onSuggestionSelect(int position);
public abstract  boolean onSuggestionClick(int position);
}
public  SearchView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  SearchView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  SearchView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  SearchView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setSearchableInfo(android.app.SearchableInfo searchable) { throw new RuntimeException("Stub!"); }
public  void setImeOptions(int imeOptions) { throw new RuntimeException("Stub!"); }
public  int getImeOptions() { throw new RuntimeException("Stub!"); }
public  void setInputType(int inputType) { throw new RuntimeException("Stub!"); }
public  int getInputType() { throw new RuntimeException("Stub!"); }
public  void setOnQueryTextListener(android.widget.SearchView.OnQueryTextListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCloseListener(android.widget.SearchView.OnCloseListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnSuggestionListener(android.widget.SearchView.OnSuggestionListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnSearchClickListener(android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getQuery() { throw new RuntimeException("Stub!"); }
public  void setQuery(java.lang.CharSequence query, boolean submit) { throw new RuntimeException("Stub!"); }
public  void setQueryHint(java.lang.CharSequence hint) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getQueryHint() { throw new RuntimeException("Stub!"); }
public  void setIconifiedByDefault(boolean iconified) { throw new RuntimeException("Stub!"); }
public  boolean isIconfiedByDefault() { throw new RuntimeException("Stub!"); }
public  void setIconified(boolean iconify) { throw new RuntimeException("Stub!"); }
public  boolean isIconified() { throw new RuntimeException("Stub!"); }
public  void setSubmitButtonEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isSubmitButtonEnabled() { throw new RuntimeException("Stub!"); }
public  void setQueryRefinementEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
public  boolean isQueryRefinementEnabled() { throw new RuntimeException("Stub!"); }
public  void setSuggestionsAdapter(android.widget.CursorAdapter adapter) { throw new RuntimeException("Stub!"); }
public  android.widget.CursorAdapter getSuggestionsAdapter() { throw new RuntimeException("Stub!"); }
public  void setMaxWidth(int maxpixels) { throw new RuntimeException("Stub!"); }
public  int getMaxWidth() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
public  void onActionViewCollapsed() { throw new RuntimeException("Stub!"); }
public  void onActionViewExpanded() { throw new RuntimeException("Stub!"); }
protected  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
protected  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
}
