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

package android.graphics;
public class BlurMaskFilter
  extends android.graphics.MaskFilter
{
public static enum Blur
{
INNER(),
NORMAL(),
OUTER(),
SOLID();
}
public  BlurMaskFilter(float radius, android.graphics.BlurMaskFilter.Blur style) { throw new RuntimeException("Stub!"); }
}
