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

package android.view;

public abstract class Window {
	public static interface Callback {
		public abstract boolean dispatchGenericMotionEvent(android.view.MotionEvent event);

		public abstract boolean dispatchKeyEvent(android.view.KeyEvent event);

		public abstract boolean dispatchKeyShortcutEvent(android.view.KeyEvent event);

		public abstract boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event);

		public abstract boolean dispatchTouchEvent(android.view.MotionEvent event);

		public abstract boolean dispatchTrackballEvent(android.view.MotionEvent event);

		public abstract void onActionModeFinished(android.view.ActionMode mode);

		public abstract void onActionModeStarted(android.view.ActionMode mode);

		public abstract void onAttachedToWindow();

		public abstract void onContentChanged();

		public abstract boolean onCreatePanelMenu(int featureId, android.view.Menu menu);

		public abstract android.view.View onCreatePanelView(int featureId);

		public abstract void onDetachedFromWindow();

		public abstract boolean onMenuItemSelected(int featureId, android.view.MenuItem item);

		public abstract boolean onMenuOpened(int featureId, android.view.Menu menu);

		public abstract void onPanelClosed(int featureId, android.view.Menu menu);

		public abstract boolean onPreparePanel(int featureId, android.view.View view, android.view.Menu menu);

		public void onProvideKeyboardShortcuts(final java.util.List<android.view.KeyboardShortcutGroup> data,
				final android.view.Menu menu, final int deviceId);

		public abstract boolean onSearchRequested();

		public abstract boolean onSearchRequested(android.view.SearchEvent searchEvent);

		public abstract void onWindowAttributesChanged(android.view.WindowManager.LayoutParams attrs);

		public abstract void onWindowFocusChanged(boolean hasFocus);

		public abstract android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback);

		public abstract android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback,
				int type);
	}

	public static interface OnFrameMetricsAvailableListener {
		public abstract void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics,
				int dropCountSinceLastInvocation);
	}

	public static interface OnRestrictedCaptionAreaChangedListener {
		public abstract void onRestrictedCaptionAreaChanged(android.graphics.Rect rect);
	}

	public static final int DECOR_CAPTION_SHADE_AUTO = 0;
	public static final int DECOR_CAPTION_SHADE_DARK = 2;
	public static final int DECOR_CAPTION_SHADE_LIGHT = 1;
	@java.lang.Deprecated()
	@java.lang.SuppressWarnings(value = { "PointlessBitwiseExpression" })
	protected static final int _FEATURES = 65;
	public static final int FEATURE_ACTION_BAR = 8;
	public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
	public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
	public static final int FEATURE_ACTIVITY_TRANSITIONS = 13;
	public static final int FEATURE_CONTENT_TRANSITIONS = 12;
	public static final int FEATURE_CONTEXT_MENU = 6;
	public static final int FEATURE_CUSTOM_TITLE = 7;
	@java.lang.Deprecated()
	public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
	public static final int FEATURE_LEFT_ICON = 3;
	public static final int FEATURE_NO_TITLE = 1;
	public static final int FEATURE_OPTIONS_PANEL = 0;
	@java.lang.Deprecated()
	public static final int FEATURE_PROGRESS = 2;
	public static final int FEATURE_RIGHT_ICON = 4;
	public static final int FEATURE_SWIPE_TO_DISMISS = 11;
	public static final int ID_ANDROID_CONTENT = 16908290;
	public static final java.lang.String NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME = "android:navigation:background";
	@java.lang.Deprecated()
	public static final int PROGRESS_END = 10000;
	@java.lang.Deprecated()
	public static final int PROGRESS_INDETERMINATE_OFF = -4;
	@java.lang.Deprecated()
	public static final int PROGRESS_INDETERMINATE_ON = -3;
	@java.lang.Deprecated()
	public static final int PROGRESS_SECONDARY_END = 30000;
	@java.lang.Deprecated()
	public static final int PROGRESS_SECONDARY_START = 20000;
	@java.lang.Deprecated()
	public static final int PROGRESS_START = 0;
	@java.lang.Deprecated()
	public static final int PROGRESS_VISIBILITY_OFF = -2;
	@java.lang.Deprecated()
	public static final int PROGRESS_VISIBILITY_ON = -1;
	public static final java.lang.String STATUS_BAR_BACKGROUND_TRANSITION_NAME = "android:status:background";

	public static int getFeatures(final android.content.Context context) {
		throw new RuntimeException("Stub!");
	}

	public Window(final android.content.Context context) {
		throw new RuntimeException("Stub!");
	}

	public abstract void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams params);

	public void addFlags(final int flags) {
		throw new RuntimeException("Stub!");
	}

	public final void addOnFrameMetricsAvailableListener(
			final android.view.Window.OnFrameMetricsAvailableListener listener, final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	public void clearFlags(final int flags) {
		throw new RuntimeException("Stub!");
	}

	public abstract void closeAllPanels();

	public abstract void closePanel(int featureId);

	public android.view.View findViewById(final int id) {
		throw new RuntimeException("Stub!");
	}

	public boolean getAllowEnterTransitionOverlap() {
		throw new RuntimeException("Stub!");
	}

	public boolean getAllowReturnTransitionOverlap() {
		throw new RuntimeException("Stub!");
	}

	public final android.view.WindowManager.LayoutParams getAttributes() {
		throw new RuntimeException("Stub!");
	}

	public final android.view.Window.Callback getCallback() {
		throw new RuntimeException("Stub!");
	}

	public final android.view.Window getContainer() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Scene getContentScene() {
		throw new RuntimeException("Stub!");
	}

	public final android.content.Context getContext() {
		throw new RuntimeException("Stub!");
	}

	public abstract android.view.View getCurrentFocus();

	public abstract android.view.View getDecorView();

	public android.transition.Transition getEnterTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getExitTransition() {
		throw new RuntimeException("Stub!");
	}

	protected final int getFeatures() {
		throw new RuntimeException("Stub!");
	}

	protected final int getForcedWindowFlags() {
		throw new RuntimeException("Stub!");
	}

	public abstract android.view.LayoutInflater getLayoutInflater();

	protected final int getLocalFeatures() {
		throw new RuntimeException("Stub!");
	}

	public android.media.session.MediaController getMediaController() {
		throw new RuntimeException("Stub!");
	}

	public abstract int getNavigationBarColor();

	public android.transition.Transition getReenterTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getReturnTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getSharedElementEnterTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getSharedElementExitTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getSharedElementReenterTransition() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.Transition getSharedElementReturnTransition() {
		throw new RuntimeException("Stub!");
	}

	public boolean getSharedElementsUseOverlay() {
		throw new RuntimeException("Stub!");
	}

	public abstract int getStatusBarColor();

	public long getTransitionBackgroundFadeDuration() {
		throw new RuntimeException("Stub!");
	}

	public android.transition.TransitionManager getTransitionManager() {
		throw new RuntimeException("Stub!");
	}

	public abstract int getVolumeControlStream();

	public android.view.WindowManager getWindowManager() {
		throw new RuntimeException("Stub!");
	}

	public final android.content.res.TypedArray getWindowStyle() {
		throw new RuntimeException("Stub!");
	}

	public final boolean hasChildren() {
		throw new RuntimeException("Stub!");
	}

	public boolean hasFeature(final int feature) {
		throw new RuntimeException("Stub!");
	}

	protected final boolean hasSoftInputMode() {
		throw new RuntimeException("Stub!");
	}

	public void injectInputEvent(final android.view.InputEvent event) {
		throw new RuntimeException("Stub!");
	}

	public abstract void invalidatePanelMenu(int featureId);

	public final boolean isActive() {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean isFloating();

	public abstract boolean isShortcutKey(int keyCode, android.view.KeyEvent event);

	public final void makeActive() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void onActive();

	public abstract void onConfigurationChanged(android.content.res.Configuration newConfig);

	public abstract void openPanel(int featureId, android.view.KeyEvent event);

	public abstract android.view.View peekDecorView();

	public abstract boolean performContextMenuIdentifierAction(int id, int flags);

	public abstract boolean performPanelIdentifierAction(int featureId, int id, int flags);

	public abstract boolean performPanelShortcut(int featureId, int keyCode, android.view.KeyEvent event, int flags);

	public final void removeOnFrameMetricsAvailableListener(
			final android.view.Window.OnFrameMetricsAvailableListener listener) {
		throw new RuntimeException("Stub!");
	}

	public boolean requestFeature(final int featureId) {
		throw new RuntimeException("Stub!");
	}

	public abstract void restoreHierarchyState(android.os.Bundle savedInstanceState);

	public abstract android.os.Bundle saveHierarchyState();

	public void setAllowEnterTransitionOverlap(final boolean allow) {
		throw new RuntimeException("Stub!");
	}

	public void setAllowReturnTransitionOverlap(final boolean allow) {
		throw new RuntimeException("Stub!");
	}

	public void setAttributes(final android.view.WindowManager.LayoutParams a) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable drawable);

	public void setBackgroundDrawableResource(final int resId) {
		throw new RuntimeException("Stub!");
	}

	public void setCallback(final android.view.Window.Callback callback) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setChildDrawable(int featureId, android.graphics.drawable.Drawable drawable);

	public abstract void setChildInt(int featureId, int value);

	public void setClipToOutline(final boolean clipToOutline) {
		throw new RuntimeException("Stub!");
	}

	public void setContainer(final android.view.Window container) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setContentView(android.view.View view);

	public abstract void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams params);

	public abstract void setContentView(int layoutResID);

	public abstract void setDecorCaptionShade(int decorCaptionShade);

	public void setDimAmount(final float amount) {
		throw new RuntimeException("Stub!");
	}

	public void setElevation(final float elevation) {
		throw new RuntimeException("Stub!");
	}

	public void setEnterTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setExitTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setFeatureDrawable(int featureId, android.graphics.drawable.Drawable drawable);

	public abstract void setFeatureDrawableAlpha(int featureId, int alpha);

	public abstract void setFeatureDrawableResource(int featureId, int resId);

	public abstract void setFeatureDrawableUri(int featureId, android.net.Uri uri);

	public abstract void setFeatureInt(int featureId, int value);

	public void setFlags(final int flags, final int mask) {
		throw new RuntimeException("Stub!");
	}

	public void setFormat(final int format) {
		throw new RuntimeException("Stub!");
	}

	public void setGravity(final int gravity) {
		throw new RuntimeException("Stub!");
	}

	public void setIcon(final int resId) {
		throw new RuntimeException("Stub!");
	}

	public void setLayout(final int width, final int height) {
		throw new RuntimeException("Stub!");
	}

	public void setLocalFocus(final boolean hasFocus, final boolean inTouchMode) {
		throw new RuntimeException("Stub!");
	}

	public void setLogo(final int resId) {
		throw new RuntimeException("Stub!");
	}

	public void setMediaController(final android.media.session.MediaController controller) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setNavigationBarColor(int color);

	public void setReenterTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setResizingCaptionDrawable(android.graphics.drawable.Drawable drawable);

	public final void setRestrictedCaptionAreaListener(
			final android.view.Window.OnRestrictedCaptionAreaChangedListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void setReturnTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setSharedElementEnterTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setSharedElementExitTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setSharedElementReenterTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setSharedElementReturnTransition(final android.transition.Transition transition) {
		throw new RuntimeException("Stub!");
	}

	public void setSharedElementsUseOverlay(final boolean sharedElementsUseOverlay) {
		throw new RuntimeException("Stub!");
	}

	public void setSoftInputMode(final int mode) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setStatusBarColor(int color);

	public void setSustainedPerformanceMode(final boolean enable) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setTitle(java.lang.CharSequence title);

	@java.lang.Deprecated()
	public abstract void setTitleColor(int textColor);

	public void setTransitionBackgroundFadeDuration(final long fadeDurationMillis) {
		throw new RuntimeException("Stub!");
	}

	public void setTransitionManager(final android.transition.TransitionManager tm) {
		throw new RuntimeException("Stub!");
	}

	public void setType(final int type) {
		throw new RuntimeException("Stub!");
	}

	public void setUiOptions(final int uiOptions) {
		throw new RuntimeException("Stub!");
	}

	public void setUiOptions(final int uiOptions, final int mask) {
		throw new RuntimeException("Stub!");
	}

	public abstract void setVolumeControlStream(int streamType);

	public void setWindowAnimations(final int resId) {
		throw new RuntimeException("Stub!");
	}

	protected void setWindowFormat(final int format) {
		throw new RuntimeException("Stub!");
	}

	public void setWindowManager(final android.view.WindowManager wm, final android.os.IBinder appToken,
			final java.lang.String appName) {
		throw new RuntimeException("Stub!");
	}

	public void setWindowManager(final android.view.WindowManager wm, final android.os.IBinder appToken,
			final java.lang.String appName, final boolean hardwareAccelerated) {
		throw new RuntimeException("Stub!");
	}

	public abstract boolean superDispatchGenericMotionEvent(android.view.MotionEvent event);

	public abstract boolean superDispatchKeyEvent(android.view.KeyEvent event);

	public abstract boolean superDispatchKeyShortcutEvent(android.view.KeyEvent event);

	public abstract boolean superDispatchTouchEvent(android.view.MotionEvent event);

	public abstract boolean superDispatchTrackballEvent(android.view.MotionEvent event);

	public abstract void takeInputQueue(android.view.InputQueue.Callback callback);

	public abstract void takeKeyEvents(boolean get);

	public abstract void takeSurface(android.view.SurfaceHolder.Callback2 callback);

	public abstract void togglePanel(int featureId, android.view.KeyEvent event);
}
