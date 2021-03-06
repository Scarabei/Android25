/*
* Copyright (C) 2011 The Android Open Source Project
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

package android.net.wifi;
public class WpsInfo
  implements android.os.Parcelable
{
public  WpsInfo() { throw new RuntimeException("Stub!"); }
public  WpsInfo(android.net.wifi.WpsInfo source) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public java.lang.String BSSID;
public static final android.os.Parcelable.Creator<android.net.wifi.WpsInfo> CREATOR;
public static final int DISPLAY = 1;
public static final int INVALID = 4;
public static final int KEYPAD = 2;
public static final int LABEL = 3;
public static final int PBC = 0;
public java.lang.String pin;
public int setup;
static { CREATOR = null; }
}
