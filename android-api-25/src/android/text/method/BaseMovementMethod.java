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

package android.text.method;
public class BaseMovementMethod
  implements android.text.method.MovementMethod
{
public  BaseMovementMethod() { throw new RuntimeException("Stub!"); }
public  boolean canSelectArbitrarily() { throw new RuntimeException("Stub!"); }
public  void initialize(android.widget.TextView widget, android.text.Spannable text) { throw new RuntimeException("Stub!"); }
public  boolean onKeyDown(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyOther(android.widget.TextView widget, android.text.Spannable text, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onKeyUp(android.widget.TextView widget, android.text.Spannable text, int keyCode, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
public  void onTakeFocus(android.widget.TextView widget, android.text.Spannable text, int direction) { throw new RuntimeException("Stub!"); }
public  boolean onTouchEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onTrackballEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
public  boolean onGenericMotionEvent(android.widget.TextView widget, android.text.Spannable text, android.view.MotionEvent event) { throw new RuntimeException("Stub!"); }
protected  int getMovementMetaState(android.text.Spannable buffer, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  boolean handleMovementKey(android.widget.TextView widget, android.text.Spannable buffer, int keyCode, int movementMetaState, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
protected  boolean left(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean right(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean up(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean down(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean pageUp(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean pageDown(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean top(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean bottom(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean lineStart(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean lineEnd(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean home(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
protected  boolean end(android.widget.TextView widget, android.text.Spannable buffer) { throw new RuntimeException("Stub!"); }
}
