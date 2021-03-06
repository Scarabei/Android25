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

package javax.microedition.khronos.egl;
public interface EGL10
  extends javax.microedition.khronos.egl.EGL
{
public abstract  boolean eglChooseConfig(javax.microedition.khronos.egl.EGLDisplay display, int[] attrib_list, javax.microedition.khronos.egl.EGLConfig[] configs, int config_size, int[] num_config);
public abstract  boolean eglCopyBuffers(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface surface, java.lang.Object native_pixmap);
public abstract  javax.microedition.khronos.egl.EGLContext eglCreateContext(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, javax.microedition.khronos.egl.EGLContext share_context, int[] attrib_list);
public abstract  javax.microedition.khronos.egl.EGLSurface eglCreatePbufferSurface(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, int[] attrib_list);
public abstract  javax.microedition.khronos.egl.EGLSurface eglCreatePixmapSurface(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, java.lang.Object native_pixmap, int[] attrib_list);
public abstract  javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, java.lang.Object native_window, int[] attrib_list);
public abstract  boolean eglDestroyContext(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLContext context);
public abstract  boolean eglDestroySurface(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface surface);
public abstract  boolean eglGetConfigAttrib(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig config, int attribute, int[] value);
public abstract  boolean eglGetConfigs(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLConfig[] configs, int config_size, int[] num_config);
public abstract  javax.microedition.khronos.egl.EGLContext eglGetCurrentContext();
public abstract  javax.microedition.khronos.egl.EGLDisplay eglGetCurrentDisplay();
public abstract  javax.microedition.khronos.egl.EGLSurface eglGetCurrentSurface(int readdraw);
public abstract  javax.microedition.khronos.egl.EGLDisplay eglGetDisplay(java.lang.Object native_display);
public abstract  int eglGetError();
public abstract  boolean eglInitialize(javax.microedition.khronos.egl.EGLDisplay display, int[] major_minor);
public abstract  boolean eglMakeCurrent(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface draw, javax.microedition.khronos.egl.EGLSurface read, javax.microedition.khronos.egl.EGLContext context);
public abstract  boolean eglQueryContext(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLContext context, int attribute, int[] value);
public abstract  java.lang.String eglQueryString(javax.microedition.khronos.egl.EGLDisplay display, int name);
public abstract  boolean eglQuerySurface(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface surface, int attribute, int[] value);
public abstract  boolean eglSwapBuffers(javax.microedition.khronos.egl.EGLDisplay display, javax.microedition.khronos.egl.EGLSurface surface);
public abstract  boolean eglTerminate(javax.microedition.khronos.egl.EGLDisplay display);
public abstract  boolean eglWaitGL();
public abstract  boolean eglWaitNative(int engine, java.lang.Object bindTarget);
public static final int EGL_ALPHA_FORMAT = 12424;
public static final int EGL_ALPHA_MASK_SIZE = 12350;
public static final int EGL_ALPHA_SIZE = 12321;
public static final int EGL_BAD_ACCESS = 12290;
public static final int EGL_BAD_ALLOC = 12291;
public static final int EGL_BAD_ATTRIBUTE = 12292;
public static final int EGL_BAD_CONFIG = 12293;
public static final int EGL_BAD_CONTEXT = 12294;
public static final int EGL_BAD_CURRENT_SURFACE = 12295;
public static final int EGL_BAD_DISPLAY = 12296;
public static final int EGL_BAD_MATCH = 12297;
public static final int EGL_BAD_NATIVE_PIXMAP = 12298;
public static final int EGL_BAD_NATIVE_WINDOW = 12299;
public static final int EGL_BAD_PARAMETER = 12300;
public static final int EGL_BAD_SURFACE = 12301;
public static final int EGL_BLUE_SIZE = 12322;
public static final int EGL_BUFFER_SIZE = 12320;
public static final int EGL_COLORSPACE = 12423;
public static final int EGL_COLOR_BUFFER_TYPE = 12351;
public static final int EGL_CONFIG_CAVEAT = 12327;
public static final int EGL_CONFIG_ID = 12328;
public static final int EGL_CORE_NATIVE_ENGINE = 12379;
public static final java.lang.Object EGL_DEFAULT_DISPLAY = null;
public static final int EGL_DEPTH_SIZE = 12325;
public static final int EGL_DONT_CARE = -1;
public static final int EGL_DRAW = 12377;
public static final int EGL_EXTENSIONS = 12373;
public static final int EGL_GREEN_SIZE = 12323;
public static final int EGL_HEIGHT = 12374;
public static final int EGL_HORIZONTAL_RESOLUTION = 12432;
public static final int EGL_LARGEST_PBUFFER = 12376;
public static final int EGL_LEVEL = 12329;
public static final int EGL_LUMINANCE_BUFFER = 12431;
public static final int EGL_LUMINANCE_SIZE = 12349;
public static final int EGL_MAX_PBUFFER_HEIGHT = 12330;
public static final int EGL_MAX_PBUFFER_PIXELS = 12331;
public static final int EGL_MAX_PBUFFER_WIDTH = 12332;
public static final int EGL_NATIVE_RENDERABLE = 12333;
public static final int EGL_NATIVE_VISUAL_ID = 12334;
public static final int EGL_NATIVE_VISUAL_TYPE = 12335;
public static final int EGL_NONE = 12344;
public static final int EGL_NON_CONFORMANT_CONFIG = 12369;
public static final int EGL_NOT_INITIALIZED = 12289;
public static final javax.microedition.khronos.egl.EGLContext EGL_NO_CONTEXT = null;
public static final javax.microedition.khronos.egl.EGLDisplay EGL_NO_DISPLAY = null;
public static final javax.microedition.khronos.egl.EGLSurface EGL_NO_SURFACE = null;
public static final int EGL_PBUFFER_BIT = 1;
public static final int EGL_PIXEL_ASPECT_RATIO = 12434;
public static final int EGL_PIXMAP_BIT = 2;
public static final int EGL_READ = 12378;
public static final int EGL_RED_SIZE = 12324;
public static final int EGL_RENDERABLE_TYPE = 12352;
public static final int EGL_RENDER_BUFFER = 12422;
public static final int EGL_RGB_BUFFER = 12430;
public static final int EGL_SAMPLES = 12337;
public static final int EGL_SAMPLE_BUFFERS = 12338;
public static final int EGL_SINGLE_BUFFER = 12421;
public static final int EGL_SLOW_CONFIG = 12368;
public static final int EGL_STENCIL_SIZE = 12326;
public static final int EGL_SUCCESS = 12288;
public static final int EGL_SURFACE_TYPE = 12339;
public static final int EGL_TRANSPARENT_BLUE_VALUE = 12341;
public static final int EGL_TRANSPARENT_GREEN_VALUE = 12342;
public static final int EGL_TRANSPARENT_RED_VALUE = 12343;
public static final int EGL_TRANSPARENT_RGB = 12370;
public static final int EGL_TRANSPARENT_TYPE = 12340;
public static final int EGL_VENDOR = 12371;
public static final int EGL_VERSION = 12372;
public static final int EGL_VERTICAL_RESOLUTION = 12433;
public static final int EGL_WIDTH = 12375;
public static final int EGL_WINDOW_BIT = 4;
}
