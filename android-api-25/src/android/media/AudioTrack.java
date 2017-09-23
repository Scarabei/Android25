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

public class AudioTrack implements android.media.AudioRouting {
	public static class Builder {
		public Builder() {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack build() throws java.lang.UnsupportedOperationException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack.Builder setAudioAttributes(final android.media.AudioAttributes attributes)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack.Builder setAudioFormat(final android.media.AudioFormat format)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack.Builder setBufferSizeInBytes(final int bufferSizeInBytes)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack.Builder setSessionId(final int sessionId)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}

		public android.media.AudioTrack.Builder setTransferMode(final int mode)
				throws java.lang.IllegalArgumentException {
			throw new RuntimeException("Stub!");
		}
	}

	public static interface OnPlaybackPositionUpdateListener {
		public abstract void onMarkerReached(android.media.AudioTrack track);

		public abstract void onPeriodicNotification(android.media.AudioTrack track);
	}

	@java.lang.Deprecated()
	public static interface OnRoutingChangedListener extends android.media.AudioRouting.OnRoutingChangedListener {
		@Override
		public void onRoutingChanged(android.media.AudioRouting router);

		public abstract void onRoutingChanged(android.media.AudioTrack audioTrack);
	}

	public static final int ERROR = -1;

	public static final int ERROR_BAD_VALUE = -2;

	public static final int ERROR_DEAD_OBJECT = -6;

	public static final int ERROR_INVALID_OPERATION = -3;

	public static final int MODE_STATIC = 0;

	public static final int MODE_STREAM = 1;

	public static final int PLAYSTATE_PAUSED = 2;

	public static final int PLAYSTATE_PLAYING = 3;

	public static final int PLAYSTATE_STOPPED = 1;

	public static final int STATE_INITIALIZED = 1;

	public static final int STATE_NO_STATIC_DATA = 2;

	public static final int STATE_UNINITIALIZED = 0;

	public static final int SUCCESS = 0;

	public static final int WRITE_BLOCKING = 0;

	public static final int WRITE_NON_BLOCKING = 1;

	public static float getMaxVolume() {
		throw new RuntimeException("Stub!");
	}

	public static int getMinBufferSize(final int sampleRateInHz, final int channelConfig, final int audioFormat) {
		throw new RuntimeException("Stub!");
	}

	public static float getMinVolume() {
		throw new RuntimeException("Stub!");
	}

	public static int getNativeOutputSampleRate(final int streamType) {
		throw new RuntimeException("Stub!");
	}

	public AudioTrack(final android.media.AudioAttributes attributes, final android.media.AudioFormat format,
			final int bufferSizeInBytes, final int mode, final int sessionId)
			throws java.lang.IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public AudioTrack(final int streamType, final int sampleRateInHz, final int channelConfig, final int audioFormat,
			final int bufferSizeInBytes, final int mode) throws java.lang.IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public AudioTrack(final int streamType, final int sampleRateInHz, final int channelConfig, final int audioFormat,
			final int bufferSizeInBytes, final int mode, final int sessionId)
			throws java.lang.IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addOnRoutingChangedListener(final android.media.AudioRouting.OnRoutingChangedListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	public void addOnRoutingChangedListener(final android.media.AudioTrack.OnRoutingChangedListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	public int attachAuxEffect(final int effectId) {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void finalize() {
		throw new RuntimeException("Stub!");
	}

	public void flush() {
		throw new RuntimeException("Stub!");
	}

	public int getAudioFormat() {
		throw new RuntimeException("Stub!");
	}

	public int getAudioSessionId() {
		throw new RuntimeException("Stub!");
	}

	public int getBufferCapacityInFrames() {
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

	@java.lang.Deprecated()
	protected int getNativeFrameCount() {
		throw new RuntimeException("Stub!");
	}

	public int getNotificationMarkerPosition() {
		throw new RuntimeException("Stub!");
	}

	public int getPlaybackHeadPosition() {
		throw new RuntimeException("Stub!");
	}

	public android.media.PlaybackParams getPlaybackParams() {
		throw new RuntimeException("Stub!");
	}

	public int getPlaybackRate() {
		throw new RuntimeException("Stub!");
	}

	public int getPlayState() {
		throw new RuntimeException("Stub!");
	}

	public int getPositionNotificationPeriod() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public android.media.AudioDeviceInfo getPreferredDevice() {
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

	public int getStreamType() {
		throw new RuntimeException("Stub!");
	}

	public boolean getTimestamp(final android.media.AudioTimestamp timestamp) {
		throw new RuntimeException("Stub!");
	}

	public int getUnderrunCount() {
		throw new RuntimeException("Stub!");
	}

	public void pause() throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}

	public void play() throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}

	public void release() {
		throw new RuntimeException("Stub!");
	}

	public int reloadStaticData() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void removeOnRoutingChangedListener(final android.media.AudioRouting.OnRoutingChangedListener listener) {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	public void removeOnRoutingChangedListener(final android.media.AudioTrack.OnRoutingChangedListener listener) {
		throw new RuntimeException("Stub!");
	}

	public int setAuxEffectSendLevel(final float level) {
		throw new RuntimeException("Stub!");
	}

	public int setBufferSizeInFrames(final int bufferSizeInFrames) {
		throw new RuntimeException("Stub!");
	}

	public int setLoopPoints(final int startInFrames, final int endInFrames, final int loopCount) {
		throw new RuntimeException("Stub!");
	}

	public int setNotificationMarkerPosition(final int markerInFrames) {
		throw new RuntimeException("Stub!");
	}

	public int setPlaybackHeadPosition(final int positionInFrames) {
		throw new RuntimeException("Stub!");
	}

	public void setPlaybackParams(final android.media.PlaybackParams params) {
		throw new RuntimeException("Stub!");
	}

	public void setPlaybackPositionUpdateListener(
			final android.media.AudioTrack.OnPlaybackPositionUpdateListener listener) {
		throw new RuntimeException("Stub!");
	}

	public void setPlaybackPositionUpdateListener(
			final android.media.AudioTrack.OnPlaybackPositionUpdateListener listener,
			final android.os.Handler handler) {
		throw new RuntimeException("Stub!");
	}

	public int setPlaybackRate(final int sampleRateInHz) {
		throw new RuntimeException("Stub!");
	}

	public int setPositionNotificationPeriod(final int periodInFrames) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean setPreferredDevice(final android.media.AudioDeviceInfo deviceInfo) {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	protected void setState(final int state) {
		throw new RuntimeException("Stub!");
	}

	@java.lang.Deprecated()
	public int setStereoVolume(final float leftGain, final float rightGain) {
		throw new RuntimeException("Stub!");
	}

	public int setVolume(final float gain) {
		throw new RuntimeException("Stub!");
	}

	public void stop() throws java.lang.IllegalStateException {
		throw new RuntimeException("Stub!");
	}

	public int write(final byte[] audioData, final int offsetInBytes, final int sizeInBytes) {
		throw new RuntimeException("Stub!");
	}

	public int write(final byte[] audioData, final int offsetInBytes, final int sizeInBytes, final int writeMode) {
		throw new RuntimeException("Stub!");
	}

	public int write(final float[] audioData, final int offsetInFloats, final int sizeInFloats, final int writeMode) {
		throw new RuntimeException("Stub!");
	}

	public int write(final java.nio.ByteBuffer audioData, final int sizeInBytes, final int writeMode) {
		throw new RuntimeException("Stub!");
	}

	public int write(final java.nio.ByteBuffer audioData, final int sizeInBytes, final int writeMode,
			final long timestamp) {
		throw new RuntimeException("Stub!");
	}

	public int write(final short[] audioData, final int offsetInShorts, final int sizeInShorts) {
		throw new RuntimeException("Stub!");
	}

	public int write(final short[] audioData, final int offsetInShorts, final int sizeInShorts, final int writeMode) {
		throw new RuntimeException("Stub!");
	}
}
