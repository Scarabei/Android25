/**
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License"); you may not
* use this file except in compliance with the License. You may obtain a copy
* of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
* WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
* License for the specific language governing permissions and limitations
* under the License.
*/
package android.app.usage;
public final class UsageEvents
  implements android.os.Parcelable
{
public static final class Event
{
public  Event() { throw new RuntimeException("Stub!"); }
public  java.lang.String getPackageName() { throw new RuntimeException("Stub!"); }
public  java.lang.String getClassName() { throw new RuntimeException("Stub!"); }
public  long getTimeStamp() { throw new RuntimeException("Stub!"); }
public  int getEventType() { throw new RuntimeException("Stub!"); }
public  android.content.res.Configuration getConfiguration() { throw new RuntimeException("Stub!"); }
public  java.lang.String getShortcutId() { throw new RuntimeException("Stub!"); }
public static final int CONFIGURATION_CHANGE = 5;
public static final int MOVE_TO_BACKGROUND = 2;
public static final int MOVE_TO_FOREGROUND = 1;
public static final int NONE = 0;
public static final int SHORTCUT_INVOCATION = 8;
public static final int USER_INTERACTION = 7;
}
UsageEvents() { throw new RuntimeException("Stub!"); }
public  boolean hasNextEvent() { throw new RuntimeException("Stub!"); }
public  boolean getNextEvent(android.app.usage.UsageEvents.Event eventOut) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.app.usage.UsageEvents> CREATOR;
static { CREATOR = null; }
}
