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
public class AutoCompleteTextView
  extends android.widget.EditText
  implements android.widget.Filter.FilterListener
{
public static interface Validator
{
public abstract  boolean isValid(java.lang.CharSequence text);
public abstract  java.lang.CharSequence fixText(java.lang.CharSequence invalidText);
}
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public  AutoCompleteTextView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AutoCompleteTextView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes, android.content.res.Resources.Theme popupTheme) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setOnClickListener(android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
public  void setCompletionHint(java.lang.CharSequence hint) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCompletionHint() { throw new RuntimeException("Stub!"); }
public  int getDropDownWidth() { throw new RuntimeException("Stub!"); }
public  void setDropDownWidth(int width) { throw new RuntimeException("Stub!"); }
public  int getDropDownHeight() { throw new RuntimeException("Stub!"); }
public  void setDropDownHeight(int height) { throw new RuntimeException("Stub!"); }
public  int getDropDownAnchor() { throw new RuntimeException("Stub!"); }
public  void setDropDownAnchor(int id) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getDropDownBackground() { throw new RuntimeException("Stub!"); }
public  void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable d) { throw new RuntimeException("Stub!"); }
public  void setDropDownBackgroundResource(int id) { throw new RuntimeException("Stub!"); }
public  void setDropDownVerticalOffset(int offset) { throw new RuntimeException("Stub!"); }
public  int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); }
public  void setDropDownHorizontalOffset(int offset) { throw new RuntimeException("Stub!"); }
public  int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); }
public  int getThreshold() { throw new RuntimeException("Stub!"); }
public  void setThreshold(int threshold) { throw new RuntimeException("Stub!"); }
public  void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
public  void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener l) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.widget.AdapterView.OnItemClickListener getItemClickListener() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  android.widget.AdapterView.OnItemSelectedListener getItemSelectedListener() { throw new RuntimeException("Stub!"); }
public  android.widget.AdapterView.OnItemClickListener getOnItemClickListener() { throw new RuntimeException("Stub!"); }
public  android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.widget.AutoCompleteTextView.OnDismissListener dismissListener) { throw new RuntimeException("Stub!"); }
public  android.widget.ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T adapter) { throw new RuntimeException("Stub!"); }
public  boolean onKeyPreIme(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean enoughToFilter() { throw new RuntimeException("Stub!"); }
public  boolean isPopupShowing() { throw new RuntimeException("Stub!"); }
protected  java.lang.CharSequence convertSelectionToString(java.lang.Object selectedItem) { throw new RuntimeException("Stub!"); }
public  void clearListSelection() { throw new RuntimeException("Stub!"); }
public  void setListSelection(int position) { throw new RuntimeException("Stub!"); }
public  int getListSelection() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"UnusedDeclaration"})
protected  void performFiltering(java.lang.CharSequence text, int keyCode) { throw new RuntimeException("Stub!"); }
public  void performCompletion() { throw new RuntimeException("Stub!"); }
public  void onCommitCompletion(android.view.inputmethod.CompletionInfo completion) { throw new RuntimeException("Stub!"); }
public  boolean isPerformingCompletion() { throw new RuntimeException("Stub!"); }
public  void setText(java.lang.CharSequence text, boolean filter) { throw new RuntimeException("Stub!"); }
protected  void replaceText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public  void onFilterComplete(int count) { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
protected  void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void dismissDropDown() { throw new RuntimeException("Stub!"); }
protected  boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
public  void showDropDown() { throw new RuntimeException("Stub!"); }
public  void setValidator(android.widget.AutoCompleteTextView.Validator validator) { throw new RuntimeException("Stub!"); }
public  android.widget.AutoCompleteTextView.Validator getValidator() { throw new RuntimeException("Stub!"); }
public  void performValidation() { throw new RuntimeException("Stub!"); }
protected  android.widget.Filter getFilter() { throw new RuntimeException("Stub!"); }
}
