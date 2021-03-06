/*
* Copyright (C) 2013 The Android Open Source Project
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

package android.renderscript;
public class Element
  extends android.renderscript.BaseObj
{
public static enum DataType
{
BOOLEAN(),
FLOAT_16(),
FLOAT_32(),
FLOAT_64(),
MATRIX_2X2(),
MATRIX_3X3(),
MATRIX_4X4(),
NONE(),
RS_ALLOCATION(),
RS_ELEMENT(),
RS_FONT(),
RS_MESH(),
RS_PROGRAM_FRAGMENT(),
RS_PROGRAM_RASTER(),
RS_PROGRAM_STORE(),
RS_PROGRAM_VERTEX(),
RS_SAMPLER(),
RS_SCRIPT(),
RS_TYPE(),
SIGNED_16(),
SIGNED_32(),
SIGNED_64(),
SIGNED_8(),
UNSIGNED_16(),
UNSIGNED_32(),
UNSIGNED_4_4_4_4(),
UNSIGNED_5_5_5_1(),
UNSIGNED_5_6_5(),
UNSIGNED_64(),
UNSIGNED_8();
}
public static enum DataKind
{
PIXEL_A(),
PIXEL_DEPTH(),
PIXEL_L(),
PIXEL_LA(),
PIXEL_RGB(),
PIXEL_RGBA(),
PIXEL_YUV(),
USER();
}
public static class Builder
{
public  Builder(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element.Builder add(android.renderscript.Element element, java.lang.String name, int arraySize) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element.Builder add(android.renderscript.Element element, java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element create() { throw new RuntimeException("Stub!"); }
}
Element() { throw new RuntimeException("Stub!"); }
public  int getBytesSize() { throw new RuntimeException("Stub!"); }
public  int getVectorSize() { throw new RuntimeException("Stub!"); }
public  boolean isComplex() { throw new RuntimeException("Stub!"); }
public  int getSubElementCount() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element getSubElement(int index) { throw new RuntimeException("Stub!"); }
public  java.lang.String getSubElementName(int index) { throw new RuntimeException("Stub!"); }
public  int getSubElementArraySize(int index) { throw new RuntimeException("Stub!"); }
public  int getSubElementOffsetBytes(int index) { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element.DataType getDataType() { throw new RuntimeException("Stub!"); }
public  android.renderscript.Element.DataKind getDataKind() { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element BOOLEAN(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U8(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I8(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U16(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I16(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U32(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I32(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U64(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I64(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F16(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F32(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F64(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element ELEMENT(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element TYPE(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element ALLOCATION(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element SAMPLER(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element SCRIPT(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element MESH(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element PROGRAM_FRAGMENT(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element PROGRAM_VERTEX(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element PROGRAM_RASTER(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element PROGRAM_STORE(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element FONT(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element A_8(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element RGB_565(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element RGB_888(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element RGBA_5551(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element RGBA_4444(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element RGBA_8888(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F16_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F16_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F16_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F32_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F32_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F32_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F64_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F64_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element F64_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U8_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U8_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U8_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I8_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I8_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I8_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U16_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U16_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U16_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I16_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I16_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I16_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U32_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U32_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U32_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I32_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I32_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I32_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U64_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U64_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element U64_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I64_2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I64_3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element I64_4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element YUV(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element MATRIX_4X4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
@Deprecated
public static  android.renderscript.Element MATRIX4X4(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element MATRIX_3X3(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element MATRIX_2X2(android.renderscript.RenderScript rs) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element createVector(android.renderscript.RenderScript rs, android.renderscript.Element.DataType dt, int size) { throw new RuntimeException("Stub!"); }
public static  android.renderscript.Element createPixel(android.renderscript.RenderScript rs, android.renderscript.Element.DataType dt, android.renderscript.Element.DataKind dk) { throw new RuntimeException("Stub!"); }
public  boolean isCompatible(android.renderscript.Element e) { throw new RuntimeException("Stub!"); }
}
