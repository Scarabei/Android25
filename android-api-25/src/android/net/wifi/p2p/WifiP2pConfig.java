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

package android.net.wifi.p2p;
public class WifiP2pConfig
  implements android.os.Parcelable
{
public  WifiP2pConfig() { throw new RuntimeException("Stub!"); }
public  WifiP2pConfig(android.net.wifi.p2p.WifiP2pConfig source) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.net.wifi.p2p.WifiP2pConfig> CREATOR;
public java.lang.String deviceAddress;
public int groupOwnerIntent;
public android.net.wifi.WpsInfo wps;
static { CREATOR = null; }
}
