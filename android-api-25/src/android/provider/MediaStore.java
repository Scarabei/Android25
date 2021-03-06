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

package android.provider;
public final class MediaStore
{
public static interface MediaColumns
  extends android.provider.BaseColumns
{
public static final java.lang.String DATA = "_data";
public static final java.lang.String DATE_ADDED = "date_added";
public static final java.lang.String DATE_MODIFIED = "date_modified";
public static final java.lang.String DISPLAY_NAME = "_display_name";
public static final java.lang.String HEIGHT = "height";
public static final java.lang.String MIME_TYPE = "mime_type";
public static final java.lang.String SIZE = "_size";
public static final java.lang.String TITLE = "title";
public static final java.lang.String WIDTH = "width";
}
public static final class Files
{
public static interface FileColumns
  extends android.provider.MediaStore.MediaColumns
{
public static final java.lang.String MEDIA_TYPE = "media_type";
public static final int MEDIA_TYPE_AUDIO = 2;
public static final int MEDIA_TYPE_IMAGE = 1;
public static final int MEDIA_TYPE_NONE = 0;
public static final int MEDIA_TYPE_PLAYLIST = 4;
public static final int MEDIA_TYPE_VIDEO = 3;
public static final java.lang.String MIME_TYPE = "mime_type";
public static final java.lang.String PARENT = "parent";
public static final java.lang.String TITLE = "title";
}
public  Files() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final  android.net.Uri getContentUri(java.lang.String volumeName, long rowId) { throw new RuntimeException("Stub!"); }
}
public static final class Images
{
public static interface ImageColumns
  extends android.provider.MediaStore.MediaColumns
{
public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
public static final java.lang.String BUCKET_ID = "bucket_id";
public static final java.lang.String DATE_TAKEN = "datetaken";
public static final java.lang.String DESCRIPTION = "description";
public static final java.lang.String IS_PRIVATE = "isprivate";
public static final java.lang.String LATITUDE = "latitude";
public static final java.lang.String LONGITUDE = "longitude";
public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
public static final java.lang.String ORIENTATION = "orientation";
public static final java.lang.String PICASA_ID = "picasa_id";
}
public static final class Media
  implements android.provider.MediaStore.Images.ImageColumns
{
public  Media() { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor query(android.content.ContentResolver cr, android.net.Uri uri, java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor query(android.content.ContentResolver cr, android.net.Uri uri, java.lang.String[] projection, java.lang.String where, java.lang.String orderBy) { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor query(android.content.ContentResolver cr, android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String orderBy) { throw new RuntimeException("Stub!"); }
public static final  android.graphics.Bitmap getBitmap(android.content.ContentResolver cr, android.net.Uri url) throws java.io.FileNotFoundException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String insertImage(android.content.ContentResolver cr, java.lang.String imagePath, java.lang.String name, java.lang.String description) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static final  java.lang.String insertImage(android.content.ContentResolver cr, android.graphics.Bitmap source, java.lang.String title, java.lang.String description) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/image";
public static final java.lang.String DEFAULT_SORT_ORDER = "bucket_display_name";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static class Thumbnails
  implements android.provider.BaseColumns
{
public  Thumbnails() { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor query(android.content.ContentResolver cr, android.net.Uri uri, java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor queryMiniThumbnails(android.content.ContentResolver cr, android.net.Uri uri, int kind, java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor queryMiniThumbnail(android.content.ContentResolver cr, long origId, int kind, java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public static  void cancelThumbnailRequest(android.content.ContentResolver cr, long origId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap getThumbnail(android.content.ContentResolver cr, long origId, int kind, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public static  void cancelThumbnailRequest(android.content.ContentResolver cr, long origId, long groupId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap getThumbnail(android.content.ContentResolver cr, long origId, long groupId, int kind, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DATA = "_data";
public static final java.lang.String DEFAULT_SORT_ORDER = "image_id ASC";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final int FULL_SCREEN_KIND = 2;
public static final java.lang.String HEIGHT = "height";
public static final java.lang.String IMAGE_ID = "image_id";
public static final android.net.Uri INTERNAL_CONTENT_URI;
public static final java.lang.String KIND = "kind";
public static final int MICRO_KIND = 3;
public static final int MINI_KIND = 1;
public static final java.lang.String THUMB_DATA = "thumb_data";
public static final java.lang.String WIDTH = "width";
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public  Images() { throw new RuntimeException("Stub!"); }
}
public static final class Audio
{
public static interface AudioColumns
  extends android.provider.MediaStore.MediaColumns
{
public static final java.lang.String ALBUM = "album";
public static final java.lang.String ALBUM_ID = "album_id";
public static final java.lang.String ALBUM_KEY = "album_key";
public static final java.lang.String ARTIST = "artist";
public static final java.lang.String ARTIST_ID = "artist_id";
public static final java.lang.String ARTIST_KEY = "artist_key";
public static final java.lang.String BOOKMARK = "bookmark";
public static final java.lang.String COMPOSER = "composer";
public static final java.lang.String DURATION = "duration";
public static final java.lang.String IS_ALARM = "is_alarm";
public static final java.lang.String IS_MUSIC = "is_music";
public static final java.lang.String IS_NOTIFICATION = "is_notification";
public static final java.lang.String IS_PODCAST = "is_podcast";
public static final java.lang.String IS_RINGTONE = "is_ringtone";
public static final java.lang.String TITLE_KEY = "title_key";
public static final java.lang.String TRACK = "track";
public static final java.lang.String YEAR = "year";
}
public static final class Media
  implements android.provider.MediaStore.Audio.AudioColumns
{
public  Media() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUriForPath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/audio";
public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/audio";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final java.lang.String EXTRA_MAX_BYTES = "android.provider.MediaStore.extra.MAX_BYTES";
public static final android.net.Uri INTERNAL_CONTENT_URI;
public static final java.lang.String RECORD_SOUND_ACTION = "android.provider.MediaStore.RECORD_SOUND";
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static interface GenresColumns
{
public static final java.lang.String NAME = "name";
}
public static final class Genres
  implements android.provider.BaseColumns, android.provider.MediaStore.Audio.GenresColumns
{
public static final class Members
  implements android.provider.MediaStore.Audio.AudioColumns
{
public  Members() { throw new RuntimeException("Stub!"); }
public static final  android.net.Uri getContentUri(java.lang.String volumeName, long genreId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUDIO_ID = "audio_id";
public static final java.lang.String CONTENT_DIRECTORY = "members";
public static final java.lang.String DEFAULT_SORT_ORDER = "title_key";
public static final java.lang.String GENRE_ID = "genre_id";
}
public  Genres() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUriForAudioId(java.lang.String volumeName, int audioId) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/genre";
public static final java.lang.String DEFAULT_SORT_ORDER = "name";
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/genre";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static interface PlaylistsColumns
{
public static final java.lang.String DATA = "_data";
public static final java.lang.String DATE_ADDED = "date_added";
public static final java.lang.String DATE_MODIFIED = "date_modified";
public static final java.lang.String NAME = "name";
}
public static final class Playlists
  implements android.provider.BaseColumns, android.provider.MediaStore.Audio.PlaylistsColumns
{
public static final class Members
  implements android.provider.MediaStore.Audio.AudioColumns
{
public  Members() { throw new RuntimeException("Stub!"); }
public static final  android.net.Uri getContentUri(java.lang.String volumeName, long playlistId) { throw new RuntimeException("Stub!"); }
public static final  boolean moveItem(android.content.ContentResolver res, long playlistId, int from, int to) { throw new RuntimeException("Stub!"); }
public static final java.lang.String AUDIO_ID = "audio_id";
public static final java.lang.String CONTENT_DIRECTORY = "members";
public static final java.lang.String DEFAULT_SORT_ORDER = "play_order";
public static final java.lang.String PLAYLIST_ID = "playlist_id";
public static final java.lang.String PLAY_ORDER = "play_order";
public static final java.lang.String _ID = "_id";
}
public  Playlists() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/playlist";
public static final java.lang.String DEFAULT_SORT_ORDER = "name";
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/playlist";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static interface ArtistColumns
{
public static final java.lang.String ARTIST = "artist";
public static final java.lang.String ARTIST_KEY = "artist_key";
public static final java.lang.String NUMBER_OF_ALBUMS = "number_of_albums";
public static final java.lang.String NUMBER_OF_TRACKS = "number_of_tracks";
}
public static final class Artists
  implements android.provider.BaseColumns, android.provider.MediaStore.Audio.ArtistColumns
{
public static final class Albums
  implements android.provider.MediaStore.Audio.AlbumColumns
{
public  Albums() { throw new RuntimeException("Stub!"); }
public static final  android.net.Uri getContentUri(java.lang.String volumeName, long artistId) { throw new RuntimeException("Stub!"); }
}
public  Artists() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/artists";
public static final java.lang.String DEFAULT_SORT_ORDER = "artist_key";
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/artist";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static interface AlbumColumns
{
public static final java.lang.String ALBUM = "album";
public static final java.lang.String ALBUM_ART = "album_art";
public static final java.lang.String ALBUM_ID = "album_id";
public static final java.lang.String ALBUM_KEY = "album_key";
public static final java.lang.String ARTIST = "artist";
public static final java.lang.String FIRST_YEAR = "minyear";
public static final java.lang.String LAST_YEAR = "maxyear";
public static final java.lang.String NUMBER_OF_SONGS = "numsongs";
public static final java.lang.String NUMBER_OF_SONGS_FOR_ARTIST = "numsongs_by_artist";
}
public static final class Albums
  implements android.provider.BaseColumns, android.provider.MediaStore.Audio.AlbumColumns
{
public  Albums() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/albums";
public static final java.lang.String DEFAULT_SORT_ORDER = "album_key";
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/album";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static final class Radio
{
Radio() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/radio";
}
public  Audio() { throw new RuntimeException("Stub!"); }
public static  java.lang.String keyFor(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public static final class Video
{
public static interface VideoColumns
  extends android.provider.MediaStore.MediaColumns
{
public static final java.lang.String ALBUM = "album";
public static final java.lang.String ARTIST = "artist";
public static final java.lang.String BOOKMARK = "bookmark";
public static final java.lang.String BUCKET_DISPLAY_NAME = "bucket_display_name";
public static final java.lang.String BUCKET_ID = "bucket_id";
public static final java.lang.String CATEGORY = "category";
public static final java.lang.String DATE_TAKEN = "datetaken";
public static final java.lang.String DESCRIPTION = "description";
public static final java.lang.String DURATION = "duration";
public static final java.lang.String IS_PRIVATE = "isprivate";
public static final java.lang.String LANGUAGE = "language";
public static final java.lang.String LATITUDE = "latitude";
public static final java.lang.String LONGITUDE = "longitude";
public static final java.lang.String MINI_THUMB_MAGIC = "mini_thumb_magic";
public static final java.lang.String RESOLUTION = "resolution";
public static final java.lang.String TAGS = "tags";
}
public static final class Media
  implements android.provider.MediaStore.Video.VideoColumns
{
public  Media() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/video";
public static final java.lang.String DEFAULT_SORT_ORDER = "title";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final android.net.Uri INTERNAL_CONTENT_URI;
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public static class Thumbnails
  implements android.provider.BaseColumns
{
public  Thumbnails() { throw new RuntimeException("Stub!"); }
public static  void cancelThumbnailRequest(android.content.ContentResolver cr, long origId) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap getThumbnail(android.content.ContentResolver cr, long origId, int kind, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public static  android.graphics.Bitmap getThumbnail(android.content.ContentResolver cr, long origId, long groupId, int kind, android.graphics.BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
public static  void cancelThumbnailRequest(android.content.ContentResolver cr, long origId, long groupId) { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getContentUri(java.lang.String volumeName) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DATA = "_data";
public static final java.lang.String DEFAULT_SORT_ORDER = "video_id ASC";
public static final android.net.Uri EXTERNAL_CONTENT_URI;
public static final int FULL_SCREEN_KIND = 2;
public static final java.lang.String HEIGHT = "height";
public static final android.net.Uri INTERNAL_CONTENT_URI;
public static final java.lang.String KIND = "kind";
public static final int MICRO_KIND = 3;
public static final int MINI_KIND = 1;
public static final java.lang.String VIDEO_ID = "video_id";
public static final java.lang.String WIDTH = "width";
static { EXTERNAL_CONTENT_URI = null; INTERNAL_CONTENT_URI = null; }
}
public  Video() { throw new RuntimeException("Stub!"); }
public static final  android.database.Cursor query(android.content.ContentResolver cr, android.net.Uri uri, java.lang.String[] projection) { throw new RuntimeException("Stub!"); }
public static final java.lang.String DEFAULT_SORT_ORDER = "_display_name";
}
public  MediaStore() { throw new RuntimeException("Stub!"); }
public static  android.net.Uri getMediaScannerUri() { throw new RuntimeException("Stub!"); }
public static  java.lang.String getVersion(android.content.Context context) { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_IMAGE_CAPTURE = "android.media.action.IMAGE_CAPTURE";
public static final java.lang.String ACTION_IMAGE_CAPTURE_SECURE = "android.media.action.IMAGE_CAPTURE_SECURE";
public static final java.lang.String ACTION_VIDEO_CAPTURE = "android.media.action.VIDEO_CAPTURE";
public static final java.lang.String AUTHORITY = "media";
public static final java.lang.String EXTRA_DURATION_LIMIT = "android.intent.extra.durationLimit";
public static final java.lang.String EXTRA_FINISH_ON_COMPLETION = "android.intent.extra.finishOnCompletion";
public static final java.lang.String EXTRA_FULL_SCREEN = "android.intent.extra.fullScreen";
public static final java.lang.String EXTRA_MEDIA_ALBUM = "android.intent.extra.album";
public static final java.lang.String EXTRA_MEDIA_ARTIST = "android.intent.extra.artist";
public static final java.lang.String EXTRA_MEDIA_FOCUS = "android.intent.extra.focus";
public static final java.lang.String EXTRA_MEDIA_GENRE = "android.intent.extra.genre";
public static final java.lang.String EXTRA_MEDIA_PLAYLIST = "android.intent.extra.playlist";
public static final java.lang.String EXTRA_MEDIA_RADIO_CHANNEL = "android.intent.extra.radio_channel";
public static final java.lang.String EXTRA_MEDIA_TITLE = "android.intent.extra.title";
public static final java.lang.String EXTRA_OUTPUT = "output";
public static final java.lang.String EXTRA_SCREEN_ORIENTATION = "android.intent.extra.screenOrientation";
public static final java.lang.String EXTRA_SHOW_ACTION_ICONS = "android.intent.extra.showActionIcons";
public static final java.lang.String EXTRA_SIZE_LIMIT = "android.intent.extra.sizeLimit";
public static final java.lang.String EXTRA_VIDEO_QUALITY = "android.intent.extra.videoQuality";
public static final java.lang.String INTENT_ACTION_MEDIA_PLAY_FROM_SEARCH = "android.media.action.MEDIA_PLAY_FROM_SEARCH";
public static final java.lang.String INTENT_ACTION_MEDIA_SEARCH = "android.intent.action.MEDIA_SEARCH";
@java.lang.Deprecated()
public static final java.lang.String INTENT_ACTION_MUSIC_PLAYER = "android.intent.action.MUSIC_PLAYER";
public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA = "android.media.action.STILL_IMAGE_CAMERA";
public static final java.lang.String INTENT_ACTION_STILL_IMAGE_CAMERA_SECURE = "android.media.action.STILL_IMAGE_CAMERA_SECURE";
public static final java.lang.String INTENT_ACTION_TEXT_OPEN_FROM_SEARCH = "android.media.action.TEXT_OPEN_FROM_SEARCH";
public static final java.lang.String INTENT_ACTION_VIDEO_CAMERA = "android.media.action.VIDEO_CAMERA";
public static final java.lang.String INTENT_ACTION_VIDEO_PLAY_FROM_SEARCH = "android.media.action.VIDEO_PLAY_FROM_SEARCH";
public static final java.lang.String MEDIA_IGNORE_FILENAME = ".nomedia";
public static final java.lang.String MEDIA_SCANNER_VOLUME = "volume";
public static final java.lang.String META_DATA_STILL_IMAGE_CAMERA_PREWARM_SERVICE = "android.media.still_image_camera_preview_service";
public static final java.lang.String UNKNOWN_STRING = "<unknown>";
}
