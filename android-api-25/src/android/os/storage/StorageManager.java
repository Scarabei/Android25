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

package android.os.storage;
public class StorageManager
{
StorageManager() { throw new RuntimeException("Stub!"); }
public  boolean mountObb(java.lang.String rawPath, java.lang.String key, android.os.storage.OnObbStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  boolean unmountObb(java.lang.String rawPath, boolean force, android.os.storage.OnObbStateChangeListener listener) { throw new RuntimeException("Stub!"); }
public  boolean isObbMounted(java.lang.String rawPath) { throw new RuntimeException("Stub!"); }
public  java.lang.String getMountedObbPath(java.lang.String rawPath) { throw new RuntimeException("Stub!"); }
public  android.os.storage.StorageVolume getStorageVolume(java.io.File file) { throw new RuntimeException("Stub!"); }
public  java.util.List<android.os.storage.StorageVolume> getStorageVolumes() { throw new RuntimeException("Stub!"); }
public  android.os.storage.StorageVolume getPrimaryStorageVolume() { throw new RuntimeException("Stub!"); }
public  boolean isEncrypted(java.io.File file) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_MANAGE_STORAGE = "android.os.storage.action.MANAGE_STORAGE";
}
