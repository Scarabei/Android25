/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.webkit;
public abstract class ServiceWorkerWebSettings
{
public  ServiceWorkerWebSettings() { throw new RuntimeException("Stub!"); }
public abstract  void setCacheMode(int mode);
public abstract  int getCacheMode();
public abstract  void setAllowContentAccess(boolean allow);
public abstract  boolean getAllowContentAccess();
public abstract  void setAllowFileAccess(boolean allow);
public abstract  boolean getAllowFileAccess();
public abstract  void setBlockNetworkLoads(boolean flag);
public abstract  boolean getBlockNetworkLoads();
}
