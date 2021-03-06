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
public final class UsageStatsManager
{
UsageStatsManager() { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.usage.UsageStats> queryUsageStats(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.app.usage.ConfigurationStats> queryConfigurations(int intervalType, long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  android.app.usage.UsageEvents queryEvents(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, android.app.usage.UsageStats> queryAndAggregateUsageStats(long beginTime, long endTime) { throw new RuntimeException("Stub!"); }
public  boolean isAppInactive(java.lang.String packageName) { throw new RuntimeException("Stub!"); }
public static final int INTERVAL_BEST = 4;
public static final int INTERVAL_DAILY = 0;
public static final int INTERVAL_MONTHLY = 2;
public static final int INTERVAL_WEEKLY = 1;
public static final int INTERVAL_YEARLY = 3;
}
