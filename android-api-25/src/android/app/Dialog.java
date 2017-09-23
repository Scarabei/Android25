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

package android.app;

import java.util.List;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;

public class Dialog implements android.content.DialogInterface, android.view.Window.Callback,
		android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener {
	public Dialog(final android.content.Context context) {
		throw new RuntimeException("Stub!");
	}

	protected Dialog(final android.content.Context context, final boolean cancelable,
			final android.content.DialogInterface.OnCancelListener cancelListener) {
		throw new RuntimeException("Stub!");
	}

	public Dialog(final android.content.Context context, final int themeResId) {
		throw new RuntimeException("Stub!");
	}

	public void addContentView(final android.view.View view, final android.view.ViewGroup.LayoutParams params) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void cancel() {
		throw new RuntimeException("Stub!");
	}

	public void closeOptionsMenu() {
		throw new RuntimeException("Stub!");
	}

	public void create() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void dismiss() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchGenericMotionEvent(final android.view.MotionEvent ev) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchKeyEvent(final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchKeyShortcutEvent(final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchPopulateAccessibilityEvent(final android.view.accessibility.AccessibilityEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchTouchEvent(final android.view.MotionEvent ev) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchTrackballEvent(final android.view.MotionEvent ev) {
		throw new RuntimeException("Stub!");
	}

	public android.view.View findViewById(final int id) {
		throw new RuntimeException("Stub!");
	}

	public android.app.ActionBar getActionBar() {
		throw new RuntimeException("Stub!");
	}

	public final android.content.Context getContext() {
		throw new RuntimeException("Stub!");
	}

	public android.view.View getCurrentFocus() {
		throw new RuntimeException("Stub!");
	}

	public android.view.LayoutInflater getLayoutInflater() {
		throw new RuntimeException("Stub!");
	}

	public final android.app.Activity getOwnerActivity() {
		throw new RuntimeException("Stub!");
	}

	public final android.view.SearchEvent getSearchEvent() {
		throw new RuntimeException("Stub!");
	}

	public final int getVolumeControlStream() {
		throw new RuntimeException("Stub!");
	}

	public android.view.Window getWindow() {
		throw new RuntimeException("Stub!");
	}

	public void hide() {
		throw new RuntimeException("Stub!");
	}

	public void invalidateOptionsMenu() {
		throw new RuntimeException("Stub!");
	}

	public boolean isShowing() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onActionModeFinished(final android.view.ActionMode mode) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onActionModeStarted(final android.view.ActionMode mode) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onAttachedToWindow() {
		throw new RuntimeException("Stub!");
	}

	public void onBackPressed() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onContentChanged() {
		throw new RuntimeException("Stub!");
	}

	public boolean onContextItemSelected(final android.view.MenuItem item) {
		throw new RuntimeException("Stub!");
	}

	public void onContextMenuClosed(final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	protected void onCreate(final android.os.Bundle savedInstanceState) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onCreateContextMenu(final android.view.ContextMenu menu, final android.view.View v,
			final android.view.ContextMenu.ContextMenuInfo menuInfo) {
		throw new RuntimeException("Stub!");
	}

	public boolean onCreateOptionsMenu(final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onCreatePanelMenu(final int featureId, final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.view.View onCreatePanelView(final int featureId) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onDetachedFromWindow() {
		throw new RuntimeException("Stub!");
	}

	public boolean onGenericMotionEvent(final android.view.MotionEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onKeyDown(final int keyCode, final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onKeyLongPress(final int keyCode, final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onKeyMultiple(final int keyCode, final int repeatCount, final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	public boolean onKeyShortcut(final int keyCode, final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onKeyUp(final int keyCode, final android.view.KeyEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onMenuItemSelected(final int featureId, final android.view.MenuItem item) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onMenuOpened(final int featureId, final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	public boolean onOptionsItemSelected(final android.view.MenuItem item) {
		throw new RuntimeException("Stub!");
	}

	public void onOptionsMenuClosed(final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onPanelClosed(final int featureId, final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	public boolean onPrepareOptionsMenu(final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onPreparePanel(final int featureId, final android.view.View view, final android.view.Menu menu) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> data, final Menu menu,
			final int deviceId) {
		// TODO Auto-generated method stub

	}

	public void onRestoreInstanceState(final android.os.Bundle savedInstanceState) {
		throw new RuntimeException("Stub!");
	}

	public android.os.Bundle onSaveInstanceState() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onSearchRequested() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onSearchRequested(final android.view.SearchEvent searchEvent) {
		throw new RuntimeException("Stub!");
	}

	protected void onStart() {
		throw new RuntimeException("Stub!");
	}

	protected void onStop() {
		throw new RuntimeException("Stub!");
	}

	public boolean onTouchEvent(final android.view.MotionEvent event) {
		throw new RuntimeException("Stub!");
	}

	public boolean onTrackballEvent(final android.view.MotionEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onWindowAttributesChanged(final android.view.WindowManager.LayoutParams params) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onWindowFocusChanged(final boolean hasFocus) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.view.ActionMode onWindowStartingActionMode(final android.view.ActionMode.Callback callback) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.view.ActionMode onWindowStartingActionMode(final android.view.ActionMode.Callback callback,
			final int type) {
		throw new RuntimeException("Stub!");
	}

	public void openContextMenu(final android.view.View view) {
		throw new RuntimeException("Stub!");
	}

	public void openOptionsMenu() {
		throw new RuntimeException("Stub!");
	}

	public void registerForContextMenu(final android.view.View view) {
		throw new RuntimeException("Stub!");
	}

	public final boolean requestWindowFeature(final int featureId) {
		throw new RuntimeException("Stub!");
	}

	public void setCancelable(final boolean flag) {
		throw new RuntimeException("Stub!");
	}

	public void setCanceledOnTouchOutside(final boolean cancel) {
		throw new RuntimeException("Stub!");
	}

	public void setCancelMessage(final android.os.Message msg) {
		throw new RuntimeException("Stub!");
	}

	public void setContentView(final android.view.View view) {
		throw new RuntimeException("Stub!");
	}

	public void setContentView(final android.view.View view, final android.view.ViewGroup.LayoutParams params) {
		throw new RuntimeException("Stub!");
	}

	public void setContentView(final int layoutResID) {
		throw new RuntimeException("Stub!");
	}

	public void setDismissMessage(final android.os.Message msg) {
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawable(final int featureId, final android.graphics.drawable.Drawable drawable) {
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableAlpha(final int featureId, final int alpha) {
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableResource(final int featureId, final int resId) {
		throw new RuntimeException("Stub!");
	}

	public final void setFeatureDrawableUri(final int featureId, final android.net.Uri uri) {
		throw new RuntimeException("Stub!");
	}

	public void setOnCancelListener(final android.content.DialogInterface.OnCancelListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void setOnDismissListener(final android.content.DialogInterface.OnDismissListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void setOnKeyListener(final android.content.DialogInterface.OnKeyListener onKeyListener) {
		throw new RuntimeException("Stub!");
	}

	public void setOnShowListener(final android.content.DialogInterface.OnShowListener listener) {
		throw new RuntimeException("Stub!");
	}

	public final void setOwnerActivity(final android.app.Activity activity) {
		throw new RuntimeException("Stub!");
	}

	public void setTitle(final int titleId) {
		throw new RuntimeException("Stub!");
	}

	public void setTitle(final java.lang.CharSequence title) {
		throw new RuntimeException("Stub!");
	}

	public final void setVolumeControlStream(final int streamType) {
		throw new RuntimeException("Stub!");
	}

	public void show() {
		throw new RuntimeException("Stub!");
	}

	public void takeKeyEvents(final boolean get) {
		throw new RuntimeException("Stub!");
	}

	public void unregisterForContextMenu(final android.view.View view) {
		throw new RuntimeException("Stub!");
	}
}
