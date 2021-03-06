/**
* Copyright (c) 2010, The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.content;
public class ClipboardManager
  extends android.text.ClipboardManager
{
public static interface OnPrimaryClipChangedListener
{
public abstract  void onPrimaryClipChanged();
}
ClipboardManager() { throw new RuntimeException("Stub!"); }
public  void setPrimaryClip(android.content.ClipData clip) { throw new RuntimeException("Stub!"); }
public  android.content.ClipData getPrimaryClip() { throw new RuntimeException("Stub!"); }
public  android.content.ClipDescription getPrimaryClipDescription() { throw new RuntimeException("Stub!"); }
public  boolean hasPrimaryClip() { throw new RuntimeException("Stub!"); }
public  void addPrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); }
public  void removePrimaryClipChangedListener(android.content.ClipboardManager.OnPrimaryClipChangedListener what) { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.lang.CharSequence getText() { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setText(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean hasText() { throw new RuntimeException("Stub!"); }
}
