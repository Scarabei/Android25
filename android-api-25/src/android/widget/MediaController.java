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
public class MediaController
  extends android.widget.FrameLayout
{
public static interface MediaPlayerControl
{
public abstract  void start();
public abstract  void pause();
public abstract  int getDuration();
public abstract  int getCurrentPosition();
public abstract  void seekTo(int pos);
public abstract  boolean isPlaying();
public abstract  int getBufferPercentage();
public abstract  boolean canPause();
public abstract  boolean canSeekBackward();
public abstract  boolean canSeekForward();
public abstract  int getAudioSessionId();
}
public  MediaController(android.content.Context context, android.util.AttributeSet attrs) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  MediaController(android.content.Context context, boolean useFastForward) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  MediaController(android.content.Context context) { super((android.content.Context)null,(android.util.AttributeSet)null,0,0); throw new RuntimeException("Stub!"); }
public  void onFinishInflate() { throw new RuntimeException("Stub!"); }
public  void setMediaPlayer(android.widget.MediaController.MediaPlayerControl player) { throw new RuntimeException("Stub!"); }
public  void setAnchorView(android.view.View view) { throw new RuntimeException("Stub!"); }
public  void show() { throw new RuntimeException("Stub!"); }
public  void show(int timeout) { throw new RuntimeException("Stub!"); }
public  boolean isShowing() { throw new RuntimeException("Stub!"); }
public  void hide() { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.view.MotionEvent ev) { throw new RuntimeException("Stub!"); }
public  boolean dispatchKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
public  void setPrevNextListeners(android.view.View.OnClickListener next, android.view.View.OnClickListener prev) { throw new RuntimeException("Stub!"); }
}
