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

package android.media.audiofx;
public class Visualizer
{
public static final class MeasurementPeakRms
{
public  MeasurementPeakRms() { throw new RuntimeException("Stub!"); }
public int mPeak;
public int mRms;
}
public static interface OnDataCaptureListener
{
public abstract  void onWaveFormDataCapture(android.media.audiofx.Visualizer visualizer, byte[] waveform, int samplingRate);
public abstract  void onFftDataCapture(android.media.audiofx.Visualizer visualizer, byte[] fft, int samplingRate);
}
public  Visualizer(int audioSession) throws java.lang.UnsupportedOperationException, java.lang.RuntimeException { throw new RuntimeException("Stub!"); }
public  void release() { throw new RuntimeException("Stub!"); }
protected  void finalize() { throw new RuntimeException("Stub!"); }
public  int setEnabled(boolean enabled) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  boolean getEnabled() { throw new RuntimeException("Stub!"); }
public static native  int[] getCaptureSizeRange();
public static native  int getMaxCaptureRate();
public  int setCaptureSize(int size) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getCaptureSize() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int setScalingMode(int mode) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getScalingMode() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int setMeasurementMode(int mode) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getMeasurementMode() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getSamplingRate() throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getWaveForm(byte[] waveform) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getFft(byte[] fft) throws java.lang.IllegalStateException { throw new RuntimeException("Stub!"); }
public  int getMeasurementPeakRms(android.media.audiofx.Visualizer.MeasurementPeakRms measurement) { throw new RuntimeException("Stub!"); }
public  int setDataCaptureListener(android.media.audiofx.Visualizer.OnDataCaptureListener listener, int rate, boolean waveform, boolean fft) { throw new RuntimeException("Stub!"); }
public static final int ALREADY_EXISTS = -2;
public static final int ERROR = -1;
public static final int ERROR_BAD_VALUE = -4;
public static final int ERROR_DEAD_OBJECT = -7;
public static final int ERROR_INVALID_OPERATION = -5;
public static final int ERROR_NO_INIT = -3;
public static final int ERROR_NO_MEMORY = -6;
public static final int MEASUREMENT_MODE_NONE = 0;
public static final int MEASUREMENT_MODE_PEAK_RMS = 1;
public static final int SCALING_MODE_AS_PLAYED = 1;
public static final int SCALING_MODE_NORMALIZED = 0;
public static final int STATE_ENABLED = 2;
public static final int STATE_INITIALIZED = 1;
public static final int STATE_UNINITIALIZED = 0;
public static final int SUCCESS = 0;
}
