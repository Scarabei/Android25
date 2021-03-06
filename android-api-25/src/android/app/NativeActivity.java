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

package android.app;
public class NativeActivity
  extends android.app.Activity
  implements android.view.SurfaceHolder.Callback2, android.view.InputQueue.Callback, android.view.ViewTreeObserver.OnGlobalLayoutListener
{
public  NativeActivity() { throw new RuntimeException("Stub!"); }
protected  void onCreate(android.os.Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
protected  void onDestroy() { throw new RuntimeException("Stub!"); }
protected  void onPause() { throw new RuntimeException("Stub!"); }
protected  void onResume() { throw new RuntimeException("Stub!"); }
protected  void onSaveInstanceState(android.os.Bundle outState) { throw new RuntimeException("Stub!"); }
protected  void onStart() { throw new RuntimeException("Stub!"); }
protected  void onStop() { throw new RuntimeException("Stub!"); }
public  void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
public  void onLowMemory() { throw new RuntimeException("Stub!"); }
public  void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
public  void surfaceCreated(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); }
public  void surfaceRedrawNeeded(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void surfaceDestroyed(android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
public  void onInputQueueCreated(android.view.InputQueue queue) { throw new RuntimeException("Stub!"); }
public  void onInputQueueDestroyed(android.view.InputQueue queue) { throw new RuntimeException("Stub!"); }
public  void onGlobalLayout() { throw new RuntimeException("Stub!"); }
public static final java.lang.String META_DATA_FUNC_NAME = "android.app.func_name";
public static final java.lang.String META_DATA_LIB_NAME = "android.app.lib_name";
}
