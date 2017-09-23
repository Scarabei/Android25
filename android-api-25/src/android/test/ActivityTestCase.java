/*
* Copyright (C) 2008 The Android Open Source Project
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

package android.test;
@java.lang.Deprecated()
public abstract class ActivityTestCase
  extends android.test.InstrumentationTestCase
{
public  ActivityTestCase() { throw new RuntimeException("Stub!"); }
protected  android.app.Activity getActivity() { throw new RuntimeException("Stub!"); }
protected  void setActivity(android.app.Activity testActivity) { throw new RuntimeException("Stub!"); }
protected  void scrubClass(java.lang.Class<?> testCaseClass) throws java.lang.IllegalAccessException { throw new RuntimeException("Stub!"); }
}
