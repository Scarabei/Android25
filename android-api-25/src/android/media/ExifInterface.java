/*
* Copyright (C) 2007 The Android Open Source Project
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
public class ExifInterface
{
public  ExifInterface(java.lang.String filename) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ExifInterface(java.io.FileDescriptor fileDescriptor) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  ExifInterface(java.io.InputStream inputStream) throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAttribute(java.lang.String tag) { throw new RuntimeException("Stub!"); }
public  int getAttributeInt(java.lang.String tag, int defaultValue) { throw new RuntimeException("Stub!"); }
public  double getAttributeDouble(java.lang.String tag, double defaultValue) { throw new RuntimeException("Stub!"); }
public  void setAttribute(java.lang.String tag, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void saveAttributes() throws java.io.IOException { throw new RuntimeException("Stub!"); }
public  boolean hasThumbnail() { throw new RuntimeException("Stub!"); }
public  byte[] getThumbnail() { throw new RuntimeException("Stub!"); }
public  long[] getThumbnailRange() { throw new RuntimeException("Stub!"); }
public  boolean getLatLong(float[] output) { throw new RuntimeException("Stub!"); }
public  double getAltitude(double defaultValue) { throw new RuntimeException("Stub!"); }
public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
public static final int ORIENTATION_FLIP_VERTICAL = 4;
public static final int ORIENTATION_NORMAL = 1;
public static final int ORIENTATION_ROTATE_180 = 3;
public static final int ORIENTATION_ROTATE_270 = 8;
public static final int ORIENTATION_ROTATE_90 = 6;
public static final int ORIENTATION_TRANSPOSE = 5;
public static final int ORIENTATION_TRANSVERSE = 7;
public static final int ORIENTATION_UNDEFINED = 0;
@java.lang.Deprecated()
public static final java.lang.String TAG_APERTURE = "FNumber";
public static final java.lang.String TAG_APERTURE_VALUE = "ApertureValue";
public static final java.lang.String TAG_ARTIST = "Artist";
public static final java.lang.String TAG_BITS_PER_SAMPLE = "BitsPerSample";
public static final java.lang.String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
public static final java.lang.String TAG_CFA_PATTERN = "CFAPattern";
public static final java.lang.String TAG_COLOR_SPACE = "ColorSpace";
public static final java.lang.String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
public static final java.lang.String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
public static final java.lang.String TAG_COMPRESSION = "Compression";
public static final java.lang.String TAG_CONTRAST = "Contrast";
public static final java.lang.String TAG_COPYRIGHT = "Copyright";
public static final java.lang.String TAG_CUSTOM_RENDERED = "CustomRendered";
public static final java.lang.String TAG_DATETIME = "DateTime";
public static final java.lang.String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
public static final java.lang.String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
public static final java.lang.String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
public static final java.lang.String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
public static final java.lang.String TAG_EXIF_VERSION = "ExifVersion";
public static final java.lang.String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
public static final java.lang.String TAG_EXPOSURE_INDEX = "ExposureIndex";
public static final java.lang.String TAG_EXPOSURE_MODE = "ExposureMode";
public static final java.lang.String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
public static final java.lang.String TAG_EXPOSURE_TIME = "ExposureTime";
public static final java.lang.String TAG_FILE_SOURCE = "FileSource";
public static final java.lang.String TAG_FLASH = "Flash";
public static final java.lang.String TAG_FLASHPIX_VERSION = "FlashpixVersion";
public static final java.lang.String TAG_FLASH_ENERGY = "FlashEnergy";
public static final java.lang.String TAG_FOCAL_LENGTH = "FocalLength";
public static final java.lang.String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
public static final java.lang.String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
public static final java.lang.String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
public static final java.lang.String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
public static final java.lang.String TAG_F_NUMBER = "FNumber";
public static final java.lang.String TAG_GAIN_CONTROL = "GainControl";
public static final java.lang.String TAG_GPS_ALTITUDE = "GPSAltitude";
public static final java.lang.String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
public static final java.lang.String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
public static final java.lang.String TAG_GPS_DATESTAMP = "GPSDateStamp";
public static final java.lang.String TAG_GPS_DEST_BEARING = "GPSDestBearing";
public static final java.lang.String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
public static final java.lang.String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
public static final java.lang.String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
public static final java.lang.String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
public static final java.lang.String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
public static final java.lang.String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
public static final java.lang.String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
public static final java.lang.String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
public static final java.lang.String TAG_GPS_DOP = "GPSDOP";
public static final java.lang.String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
public static final java.lang.String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
public static final java.lang.String TAG_GPS_LATITUDE = "GPSLatitude";
public static final java.lang.String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
public static final java.lang.String TAG_GPS_LONGITUDE = "GPSLongitude";
public static final java.lang.String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
public static final java.lang.String TAG_GPS_MAP_DATUM = "GPSMapDatum";
public static final java.lang.String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
public static final java.lang.String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
public static final java.lang.String TAG_GPS_SATELLITES = "GPSSatellites";
public static final java.lang.String TAG_GPS_SPEED = "GPSSpeed";
public static final java.lang.String TAG_GPS_SPEED_REF = "GPSSpeedRef";
public static final java.lang.String TAG_GPS_STATUS = "GPSStatus";
public static final java.lang.String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
public static final java.lang.String TAG_GPS_TRACK = "GPSTrack";
public static final java.lang.String TAG_GPS_TRACK_REF = "GPSTrackRef";
public static final java.lang.String TAG_GPS_VERSION_ID = "GPSVersionID";
public static final java.lang.String TAG_IMAGE_DESCRIPTION = "ImageDescription";
public static final java.lang.String TAG_IMAGE_LENGTH = "ImageLength";
public static final java.lang.String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
public static final java.lang.String TAG_IMAGE_WIDTH = "ImageWidth";
public static final java.lang.String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
@java.lang.Deprecated()
public static final java.lang.String TAG_ISO = "ISOSpeedRatings";
public static final java.lang.String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
public static final java.lang.String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
public static final java.lang.String TAG_LIGHT_SOURCE = "LightSource";
public static final java.lang.String TAG_MAKE = "Make";
public static final java.lang.String TAG_MAKER_NOTE = "MakerNote";
public static final java.lang.String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
public static final java.lang.String TAG_METERING_MODE = "MeteringMode";
public static final java.lang.String TAG_MODEL = "Model";
public static final java.lang.String TAG_OECF = "OECF";
public static final java.lang.String TAG_ORIENTATION = "Orientation";
public static final java.lang.String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
public static final java.lang.String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
public static final java.lang.String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
public static final java.lang.String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
public static final java.lang.String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
public static final java.lang.String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
public static final java.lang.String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
public static final java.lang.String TAG_RESOLUTION_UNIT = "ResolutionUnit";
public static final java.lang.String TAG_ROWS_PER_STRIP = "RowsPerStrip";
public static final java.lang.String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
public static final java.lang.String TAG_SATURATION = "Saturation";
public static final java.lang.String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
public static final java.lang.String TAG_SCENE_TYPE = "SceneType";
public static final java.lang.String TAG_SENSING_METHOD = "SensingMethod";
public static final java.lang.String TAG_SHARPNESS = "Sharpness";
public static final java.lang.String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
public static final java.lang.String TAG_SOFTWARE = "Software";
public static final java.lang.String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
public static final java.lang.String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
public static final java.lang.String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
public static final java.lang.String TAG_STRIP_OFFSETS = "StripOffsets";
public static final java.lang.String TAG_SUBJECT_AREA = "SubjectArea";
public static final java.lang.String TAG_SUBJECT_DISTANCE = "SubjectDistance";
public static final java.lang.String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
public static final java.lang.String TAG_SUBJECT_LOCATION = "SubjectLocation";
public static final java.lang.String TAG_SUBSEC_TIME = "SubSecTime";
@Deprecated
public static final java.lang.String TAG_SUBSEC_TIME_DIG = "SubSecTimeDigitized";
public static final java.lang.String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
@Deprecated
public static final java.lang.String TAG_SUBSEC_TIME_ORIG = "SubSecTimeOriginal";
public static final java.lang.String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
public static final java.lang.String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
public static final java.lang.String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
public static final java.lang.String TAG_TRANSFER_FUNCTION = "TransferFunction";
public static final java.lang.String TAG_USER_COMMENT = "UserComment";
public static final java.lang.String TAG_WHITE_BALANCE = "WhiteBalance";
public static final java.lang.String TAG_WHITE_POINT = "WhitePoint";
public static final java.lang.String TAG_X_RESOLUTION = "XResolution";
public static final java.lang.String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
public static final java.lang.String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
public static final java.lang.String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
public static final java.lang.String TAG_Y_RESOLUTION = "YResolution";
public static final int WHITEBALANCE_AUTO = 0;
public static final int WHITEBALANCE_MANUAL = 1;
}
