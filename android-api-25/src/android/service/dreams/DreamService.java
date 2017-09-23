/**
* Copyright (C) 2012 The Android Open Source Project
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
package android.service.dreams;

import java.util.List;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;

public class DreamService extends android.app.Service implements android.view.Window.Callback {
	public static final java.lang.String DREAM_META_DATA = "android.service.dream";

	public static final java.lang.String SERVICE_INTERFACE = "android.service.dreams.DreamService";

	public DreamService() {
		throw new RuntimeException("Stub!");
	}

	public void addContentView(final android.view.View view, final android.view.ViewGroup.LayoutParams params) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchGenericMotionEvent(final android.view.MotionEvent event) {
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
	public boolean dispatchTouchEvent(final android.view.MotionEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean dispatchTrackballEvent(final android.view.MotionEvent event) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void dump(final java.io.FileDescriptor fd, final java.io.PrintWriter pw, final java.lang.String[] args) {
		throw new RuntimeException("Stub!");
	}

	public android.view.View findViewById(final int id) {
		throw new RuntimeException("Stub!");
	}

	public final void finish() {
		throw new RuntimeException("Stub!");
	}

	public android.view.Window getWindow() {
		throw new RuntimeException("Stub!");
	}

	public android.view.WindowManager getWindowManager() {
		throw new RuntimeException("Stub!");
	}

	public boolean isFullscreen() {
		throw new RuntimeException("Stub!");
	}

	public boolean isInteractive() {
		throw new RuntimeException("Stub!");
	}

	public boolean isScreenBright() {
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

	@Override
	public final android.os.IBinder onBind(final android.content.Intent intent) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onContentChanged() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onCreate() {
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
	public void onDestroy() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onDetachedFromWindow() {
		throw new RuntimeException("Stub!");
	}

	public void onDreamingStarted() {
		throw new RuntimeException("Stub!");
	}

	public void onDreamingStopped() {
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

	@Override
	public void onPanelClosed(final int featureId, final android.view.Menu menu) {
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

	@Override
	public boolean onSearchRequested() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean onSearchRequested(final android.view.SearchEvent event) {
		throw new RuntimeException("Stub!");
	}

	public void onWakeUp() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void onWindowAttributesChanged(final android.view.WindowManager.LayoutParams attrs) {
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

	public void setContentView(final android.view.View view) {
		throw new RuntimeException("Stub!");
	}

	public void setContentView(final android.view.View view, final android.view.ViewGroup.LayoutParams params) {
		throw new RuntimeException("Stub!");
	}

	public void setContentView(final int layoutResID) {
		throw new RuntimeException("Stub!");
	}

	public void setFullscreen(final boolean fullscreen) {
		throw new RuntimeException("Stub!");
	}

	public void setInteractive(final boolean interactive) {
		throw new RuntimeException("Stub!");
	}

	public void setScreenBright(final boolean screenBright) {
		throw new RuntimeException("Stub!");
	}

	public final void wakeUp() {
		throw new RuntimeException("Stub!");
	}
}
