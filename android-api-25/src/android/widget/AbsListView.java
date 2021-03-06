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

package android.widget;
public abstract class AbsListView
  extends android.widget.AdapterView<android.widget.ListAdapter>
  implements android.text.TextWatcher, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.Filter.FilterListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{
public static interface OnScrollListener
{
public abstract  void onScrollStateChanged(android.widget.AbsListView view, int scrollState);
public abstract  void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount);
public static final int SCROLL_STATE_FLING = 2;
public static final int SCROLL_STATE_IDLE = 0;
public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
}
public static interface SelectionBoundsAdjuster
{
public abstract  void adjustListItemSelectionBounds(android.graphics.Rect bounds);
}
public static interface MultiChoiceModeListener
  extends android.view.ActionMode.Callback
{
public abstract  void onItemCheckedStateChanged(android.view.ActionMode mode, int position, long id, boolean checked);
}
public static class LayoutParams
  extends android.view.ViewGroup.LayoutParams
{
public  LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(int w, int h, int viewType) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
public  LayoutParams(android.view.ViewGroup.LayoutParams source) { super((android.view.ViewGroup.LayoutParams)null); throw new RuntimeException("Stub!"); }
}
public static interface RecyclerListener
{
public abstract  void onMovedToScrapHeap(android.view.View view);
}
public  AbsListView(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsListView(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsListView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  AbsListView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
public  void setAdapter(android.widget.ListAdapter adapter) { throw new RuntimeException("Stub!"); }
public  int getCheckedItemCount() { throw new RuntimeException("Stub!"); }
public  boolean isItemChecked(int position) { throw new RuntimeException("Stub!"); }
public  int getCheckedItemPosition() { throw new RuntimeException("Stub!"); }
public  android.util.SparseBooleanArray getCheckedItemPositions() { throw new RuntimeException("Stub!"); }
public  long[] getCheckedItemIds() { throw new RuntimeException("Stub!"); }
public  void clearChoices() { throw new RuntimeException("Stub!"); }
public  void setItemChecked(int position, boolean value) { throw new RuntimeException("Stub!"); }
public  boolean performItemClick(android.view.View view, int position, long id) { throw new RuntimeException("Stub!"); }
public  int getChoiceMode() { throw new RuntimeException("Stub!"); }
public  void setChoiceMode(int choiceMode) { throw new RuntimeException("Stub!"); }
public  void setMultiChoiceModeListener(android.widget.AbsListView.MultiChoiceModeListener listener) { throw new RuntimeException("Stub!"); }
public  void setFastScrollEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setFastScrollStyle(int styleResId) { throw new RuntimeException("Stub!"); }
public  void setFastScrollAlwaysVisible(boolean alwaysShow) { throw new RuntimeException("Stub!"); }
public  boolean isFastScrollAlwaysVisible() { throw new RuntimeException("Stub!"); }
public  int getVerticalScrollbarWidth() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isFastScrollEnabled() { throw new RuntimeException("Stub!"); }
public  void setVerticalScrollbarPosition(int position) { throw new RuntimeException("Stub!"); }
public  void setScrollBarStyle(int style) { throw new RuntimeException("Stub!"); }
public  void setSmoothScrollbarEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isSmoothScrollbarEnabled() { throw new RuntimeException("Stub!"); }
public  void setOnScrollListener(android.widget.AbsListView.OnScrollListener l) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isScrollingCacheEnabled() { throw new RuntimeException("Stub!"); }
public  void setScrollingCacheEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  void setTextFilterEnabled(boolean textFilterEnabled) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isTextFilterEnabled() { throw new RuntimeException("Stub!"); }
public  void getFocusedRect(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  boolean isStackFromBottom() { throw new RuntimeException("Stub!"); }
public  void setStackFromBottom(boolean stackFromBottom) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
public  void onRestoreInstanceState(android.os.Parcelable state) { throw new RuntimeException("Stub!"); }
public  void setFilterText(java.lang.String filterText) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getTextFilter() { throw new RuntimeException("Stub!"); }
protected  void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
public  void requestLayout() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
protected  int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
protected  float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
protected  void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
protected  void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
protected  void layoutChildren() { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty()
public  android.view.View getSelectedView() { throw new RuntimeException("Stub!"); }
public  int getListPaddingTop() { throw new RuntimeException("Stub!"); }
public  int getListPaddingBottom() { throw new RuntimeException("Stub!"); }
public  int getListPaddingLeft() { throw new RuntimeException("Stub!"); }
public  int getListPaddingRight() { throw new RuntimeException("Stub!"); }
public  void onInitializeAccessibilityNodeInfoForItem(android.view.View view, int position, android.view.accessibility.AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
protected  void dispatchDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
protected  boolean isPaddingOffsetRequired() { throw new RuntimeException("Stub!"); }
protected  int getLeftPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getTopPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getRightPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  int getBottomPaddingOffset() { throw new RuntimeException("Stub!"); }
protected  void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
public  void setDrawSelectorOnTop(boolean onTop) { throw new RuntimeException("Stub!"); }
public  void setSelector(int resID) { throw new RuntimeException("Stub!"); }
public  void setSelector(android.graphics.drawable.Drawable sel) { throw new RuntimeException("Stub!"); }
public  android.graphics.drawable.Drawable getSelector() { throw new RuntimeException("Stub!"); }
public  void setScrollIndicators(android.view.View up, android.view.View down) { throw new RuntimeException("Stub!"); }
protected  void drawableStateChanged() { throw new RuntimeException("Stub!"); }
public  boolean verifyDrawable(android.graphics.drawable.Drawable dr) { throw new RuntimeException("Stub!"); }
public  void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
protected  void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
protected  void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasWindowFocus) { throw new RuntimeException("Stub!"); }
public  void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
public  void onCancelPendingInputEvents() { throw new RuntimeException("Stub!"); }
protected  android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu() { throw new RuntimeException("Stub!"); }
public  boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView) { throw new RuntimeException("Stub!"); }
public  boolean showContextMenuForChild(android.view.View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
public  void dispatchDrawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
public  int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); }
public  long pointToRowId(int x, int y) { throw new RuntimeException("Stub!"); }
public  void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
protected  void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  void fling(int velocityY) { throw new RuntimeException("Stub!"); }
public  boolean onStartNestedScroll(android.view.View child, android.view.View target, int nestedScrollAxes) { throw new RuntimeException("Stub!"); }
public  void onNestedScrollAccepted(android.view.View child, android.view.View target, int axes) { throw new RuntimeException("Stub!"); }
public  void onNestedScroll(android.view.View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) { throw new RuntimeException("Stub!"); }
public  boolean onNestedFling(android.view.View target, float velocityX, float velocityY, boolean consumed) { throw new RuntimeException("Stub!"); }
public  void draw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
public  void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptHoverEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onInterceptTouchEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  void addTouchables(java.util.ArrayList<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void setFriction(float friction) { throw new RuntimeException("Stub!"); }
public  void setVelocityScale(float scale) { throw new RuntimeException("Stub!"); }
public  void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); }
public  void smoothScrollToPositionFromTop(int position, int offset, int duration) { throw new RuntimeException("Stub!"); }
public  void smoothScrollToPositionFromTop(int position, int offset) { throw new RuntimeException("Stub!"); }
public  void smoothScrollToPosition(int position, int boundPosition) { throw new RuntimeException("Stub!"); }
public  void smoothScrollBy(int distance, int duration) { throw new RuntimeException("Stub!"); }
public  void scrollListBy(int y) { throw new RuntimeException("Stub!"); }
public  boolean canScrollList(int direction) { throw new RuntimeException("Stub!"); }
public  void invalidateViews() { throw new RuntimeException("Stub!"); }
protected  void handleDataChanged() { throw new RuntimeException("Stub!"); }
protected  void onDisplayHint(int hint) { throw new RuntimeException("Stub!"); }
protected  boolean isInFilterMode() { throw new RuntimeException("Stub!"); }
public  android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) { throw new RuntimeException("Stub!"); }
public  boolean checkInputConnectionProxy(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void clearTextFilter() { throw new RuntimeException("Stub!"); }
public  boolean hasTextFilter() { throw new RuntimeException("Stub!"); }
public  void onGlobalLayout() { throw new RuntimeException("Stub!"); }
public  void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) { throw new RuntimeException("Stub!"); }
public  void onTextChanged(java.lang.CharSequence s, int start, int before, int count) { throw new RuntimeException("Stub!"); }
public  void afterTextChanged(android.text.Editable s) { throw new RuntimeException("Stub!"); }
public  void onFilterComplete(int count) { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
protected  android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  android.widget.AbsListView.LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
protected  boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
public  void setTranscriptMode(int mode) { throw new RuntimeException("Stub!"); }
public  int getTranscriptMode() { throw new RuntimeException("Stub!"); }
public  int getSolidColor() { throw new RuntimeException("Stub!"); }
public  void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
@android.view.ViewDebug.ExportedProperty(category="drawing")
public  int getCacheColorHint() { throw new RuntimeException("Stub!"); }
public  void reclaimViews(java.util.List<android.view.View> views) { throw new RuntimeException("Stub!"); }
public  void setRemoteViewsAdapter(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  void deferNotifyDataSetChanged() { throw new RuntimeException("Stub!"); }
public  boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); }
public  void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); }
public  void setRecyclerListener(android.widget.AbsListView.RecyclerListener listener) { throw new RuntimeException("Stub!"); }
public  void setSelectionFromTop(int position, int y) { throw new RuntimeException("Stub!"); }
public static final int CHOICE_MODE_MULTIPLE = 2;
public static final int CHOICE_MODE_MULTIPLE_MODAL = 3;
public static final int CHOICE_MODE_NONE = 0;
public static final int CHOICE_MODE_SINGLE = 1;
public static final int TRANSCRIPT_MODE_ALWAYS_SCROLL = 2;
public static final int TRANSCRIPT_MODE_DISABLED = 0;
public static final int TRANSCRIPT_MODE_NORMAL = 1;
}
