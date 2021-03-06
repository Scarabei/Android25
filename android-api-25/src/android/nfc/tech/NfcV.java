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

package android.nfc.tech;
public final class NfcV
  extends android.nfc.tech.BasicTagTechnology
{
NfcV() { throw new RuntimeException("Stub!"); }
public static  android.nfc.tech.NfcV get(android.nfc.Tag tag) { throw new RuntimeException("Stub!"); }
public  byte getResponseFlags() { throw new RuntimeException("Stub!"); }
public  byte getDsfId() { throw new RuntimeException("Stub!"); }
public  byte[] transceive(byte[] data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
}
