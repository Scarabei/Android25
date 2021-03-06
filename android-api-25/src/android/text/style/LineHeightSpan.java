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

package android.text.style;
public interface LineHeightSpan
  extends android.text.style.ParagraphStyle, android.text.style.WrapTogetherSpan
{
public static interface WithDensity
  extends android.text.style.LineHeightSpan
{
public abstract  void chooseHeight(java.lang.CharSequence text, int start, int end, int spanstartv, int v, android.graphics.Paint.FontMetricsInt fm, android.text.TextPaint paint);
}
public abstract  void chooseHeight(java.lang.CharSequence text, int start, int end, int spanstartv, int v, android.graphics.Paint.FontMetricsInt fm);
}
