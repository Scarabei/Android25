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

package android.media;

public class AudioRecord implements android.media.AudioRouting {
	public static class Builder {
		public Builder() {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioRecord build() throws java.lang.UnsupportedOperationException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioRecord.Builder setAudioFormat(final android.media.AudioFormat format)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioRecord.Builder setAudioSource(final int source)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioRecord.Builder setBufferSizeInBytes(final int bufferSizeInBytes)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnRecordPositionUpdateListener {
		public abstract void onMarkerReached(android.media.AudioRecord recorder);

		public abstract void onPeriodicNotification(android.media.AudioRecord recorder);
	}

	@java.lang.Deprecated()
	public static interface OnRoutingChangedListener extends android.media.AudioRouting.OnRoutingChangedListener {
		public abstract void onRoutingChanged(android.media.AudioRecord audioRecord);

		@Override
		public void onRoutingChanged(final android.media.AudioRouting router);
	}

	public static final int ERROR = -1;

	public static final int ERROR_BAD_VALUE = -2;

	public static final int ERROR_DEAD_OBJECT = -6;

	public static final int ERROR_INVALID_OPERATION = -3;

	public static final int READ_BLOCKING = 0;

	public static final int READ_NON_BLOCKING = 1;

	public static final int RECORDSTATE_RECORDING = 3;

	public static final int RECORDSTATE_STOPPED = 1;

	public static final int STATE_INITIALIZED = 1;

	public static final int STATE_UNINITIALIZED = 0;

	public static final int SUCCESS = 0;

	public static int getMinBufferSize(final int sampleRateInHz, final int channelConfig, final int audioFormat) {
		throw new RuntimeException("Stub!");
	}

	public AudioRecord(final int audioSource, final int sampleRateInHz, final int channelConfig, final int audioFormat,
			final int bufferSizeInBytes) throws java.lang.IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	public void addOnRoutingChangedListener(final android.media.AudioRecord.OnRoutingChangedListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addOnRoutingChangedListener(final android.media.AudioRouting.OnRoutingChangedListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void finalize() {
		throw new RuntimeException("Stub!");
	}

	public int getAudioFormat() {
		throw new RuntimeException("Stub!");
	}

	public int getAudioSessionId() {
		throw new RuntimeException("Stub!");
	}

	public int getAudioSource() {
		throw new RuntimeException("Stub!");
	}

	public int getBufferSizeInFrames() {
		throw new RuntimeException("Stub!");
	}

	public int getChannelConfiguration() {
		throw new RuntimeException("Stub!");
	}

	public int getChannelCount() {
		throw new RuntimeException("Stub!");
	}

	public android.media.AudioFormat getFormat() {
		throw new RuntimeException("Stub!");
	}

	public int getNotificationMarkerPosition() {
		throw new RuntimeException("Stub!");
	}

	public int getPositionNotificationPeriod() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.media.AudioDeviceInfo getPreferredDevice() {
		throw new RuntimeException("Stub!");
	}

	public int getRecordingState() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.media.AudioDeviceInfo getRoutedDevice() {
		throw new RuntimeException("Stub!");
	}

	public int getSampleRate() {
		throw new RuntimeException("Stub!");
	}

	public int getState() {
		throw new RuntimeException("Stub!");
	}

	public int getTimestamp(final android.media.AudioTimestamp outTimestamp, final int timebase) {
		throw new RuntimeException("Stub!");
	}

	public int read(final byte[] audioData, final int offsetInBytes, final int sizeInBytes) {
		throw new RuntimeException("Stub!");
	}

	public int read(final byte[] audioData, final int offsetInBytes, final int sizeInBytes, final int readMode) {
		throw new RuntimeException("Stub!");
	}

	public int read(final float[] audioData, final int offsetInFloats, final int sizeInFloats, final int readMode) {
		throw new RuntimeException("Stub!");
	}

	public int read(final java.nio.ByteBuffer audioBuffer, final int sizeInBytes) {
		throw new RuntimeException("Stub!");
	}

	public int read(final java.nio.ByteBuffer audioBuffer, final int sizeInBytes, final int readMode) {
		throw new RuntimeException("Stub!");
	}

	public int read(final short[] audioData, final int offsetInShorts, final int sizeInShorts) {
		throw new RuntimeException("Stub!");
	}

	public int read(final short[] audioData, final int offsetInShorts, final int sizeInShorts, final int readMode) {
		throw new RuntimeException("Stub!");
	}

	public void release() {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	public void removeOnRoutingChangedListener(final android.media.AudioRecord.OnRoutingChangedListener listener) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void removeOnRoutingChangedListener(final android.media.AudioRouting.OnRoutingChangedListener listener) {
		throw new RuntimeException("Stub!");
	}

	public int setNotificationMarkerPosition(final int markerInFrames) {
		throw new RuntimeException("Stub!");
	}

	public int setPositionNotificationPeriod(final int periodInFrames) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean setPreferredDevice(final android.media.AudioDeviceInfo deviceInfo) {
		throw new RuntimeException("Stub!");
	}

	public void setRecordPositionUpdateListener(
			final android.media.AudioRecord.OnRecordPositionUpdateListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void setRecordPositionUpdateListener(final android.media.AudioRecord.OnRecordPositionUpdateListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	public void startRecording() throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}

	public void startRecording(final android.media.MediaSyncEvent syncEvent) throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}

	public void stop() throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}
}
