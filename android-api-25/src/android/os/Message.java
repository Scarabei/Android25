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

package android.os;
public final class Message
  implements android.os.Parcelable
{
public  Message() { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain() { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Message orig) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, java.lang.Runnable callback) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, int arg1, int arg2) { throw new RuntimeException("Stub!"); }
public static  android.os.Message obtain(android.os.Handler h, int what, int arg1, int arg2, java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  void recycle() { throw new RuntimeException("Stub!"); }
public  void copyFrom(android.os.Message o) { throw new RuntimeException("Stub!"); }
public  long getWhen() { throw new RuntimeException("Stub!"); }
public  void setTarget(android.os.Handler target) { throw new RuntimeException("Stub!"); }
public  android.os.Handler getTarget() { throw new RuntimeException("Stub!"); }
public  java.lang.Runnable getCallback() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getData() { throw new RuntimeException("Stub!"); }
public  android.os.Bundle peekData() { throw new RuntimeException("Stub!"); }
public  void setData(android.os.Bundle data) { throw new RuntimeException("Stub!"); }
public  void sendToTarget() { throw new RuntimeException("Stub!"); }
public  boolean isAsynchronous() { throw new RuntimeException("Stub!"); }
public  void setAsynchronous(boolean async) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.os.Message> CREATOR;
public int arg1;
public int arg2;
public java.lang.Object obj;
public android.os.Messenger replyTo;
public int sendingUid;
public int what;
static { CREATOR = null; }
}
