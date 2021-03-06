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

package android.database;
public class DatabaseUtils
{
@java.lang.Deprecated()
public static class InsertHelper
{
public  InsertHelper(android.database.sqlite.SQLiteDatabase db, java.lang.String tableName) { throw new RuntimeException("Stub!"); }
public  int getColumnIndex(java.lang.String key) { throw new RuntimeException("Stub!"); }
public  void bind(int index, double value) { throw new RuntimeException("Stub!"); }
public  void bind(int index, float value) { throw new RuntimeException("Stub!"); }
public  void bind(int index, long value) { throw new RuntimeException("Stub!"); }
public  void bind(int index, int value) { throw new RuntimeException("Stub!"); }
public  void bind(int index, boolean value) { throw new RuntimeException("Stub!"); }
public  void bindNull(int index) { throw new RuntimeException("Stub!"); }
public  void bind(int index, byte[] value) { throw new RuntimeException("Stub!"); }
public  void bind(int index, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  long insert(android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  long execute() { throw new RuntimeException("Stub!"); }
public  void prepareForInsert() { throw new RuntimeException("Stub!"); }
public  void prepareForReplace() { throw new RuntimeException("Stub!"); }
public  long replace(android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public  void close() { throw new RuntimeException("Stub!"); }
}
public  DatabaseUtils() { throw new RuntimeException("Stub!"); }
public static final  void writeExceptionToParcel(android.os.Parcel reply, java.lang.Exception e) { throw new RuntimeException("Stub!"); }
public static final  void readExceptionFromParcel(android.os.Parcel reply) { throw new RuntimeException("Stub!"); }
public static  void readExceptionWithFileNotFoundExceptionFromParcel(android.os.Parcel reply) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
public static  void readExceptionWithOperationApplicationExceptionFromParcel(android.os.Parcel reply) throws android.content.OperationApplicationException { throw new RuntimeException("Stub!"); }
public static  void bindObjectToProgram(android.database.sqlite.SQLiteProgram prog, int index, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public static  void appendEscapedSQLString(java.lang.StringBuilder sb, java.lang.String sqlString) { throw new RuntimeException("Stub!"); }
public static  java.lang.String sqlEscapeString(java.lang.String value) { throw new RuntimeException("Stub!"); }
public static final  void appendValueToSql(java.lang.StringBuilder sql, java.lang.Object value) { throw new RuntimeException("Stub!"); }
public static  java.lang.String concatenateWhere(java.lang.String a, java.lang.String b) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getCollationKey(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getHexCollationKey(java.lang.String name) { throw new RuntimeException("Stub!"); }
public static  void dumpCursor(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static  void dumpCursor(android.database.Cursor cursor, java.io.PrintStream stream) { throw new RuntimeException("Stub!"); }
public static  void dumpCursor(android.database.Cursor cursor, java.lang.StringBuilder sb) { throw new RuntimeException("Stub!"); }
public static  java.lang.String dumpCursorToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static  void dumpCurrentRow(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static  void dumpCurrentRow(android.database.Cursor cursor, java.io.PrintStream stream) { throw new RuntimeException("Stub!"); }
public static  void dumpCurrentRow(android.database.Cursor cursor, java.lang.StringBuilder sb) { throw new RuntimeException("Stub!"); }
public static  java.lang.String dumpCurrentRowToString(android.database.Cursor cursor) { throw new RuntimeException("Stub!"); }
public static  void cursorStringToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  void cursorStringToInsertHelper(android.database.Cursor cursor, java.lang.String field, android.database.DatabaseUtils.InsertHelper inserter, int index) { throw new RuntimeException("Stub!"); }
public static  void cursorStringToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values, java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void cursorIntToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  void cursorIntToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values, java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void cursorLongToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  void cursorLongToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values, java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void cursorDoubleToCursorValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  void cursorDoubleToContentValues(android.database.Cursor cursor, java.lang.String field, android.content.ContentValues values, java.lang.String key) { throw new RuntimeException("Stub!"); }
public static  void cursorRowToContentValues(android.database.Cursor cursor, android.content.ContentValues values) { throw new RuntimeException("Stub!"); }
public static  long queryNumEntries(android.database.sqlite.SQLiteDatabase db, java.lang.String table) { throw new RuntimeException("Stub!"); }
public static  long queryNumEntries(android.database.sqlite.SQLiteDatabase db, java.lang.String table, java.lang.String selection) { throw new RuntimeException("Stub!"); }
public static  long queryNumEntries(android.database.sqlite.SQLiteDatabase db, java.lang.String table, java.lang.String selection, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  long longForQuery(android.database.sqlite.SQLiteDatabase db, java.lang.String query, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  long longForQuery(android.database.sqlite.SQLiteStatement prog, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  java.lang.String stringForQuery(android.database.sqlite.SQLiteDatabase db, java.lang.String query, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  java.lang.String stringForQuery(android.database.sqlite.SQLiteStatement prog, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteDatabase db, java.lang.String query, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  android.os.ParcelFileDescriptor blobFileDescriptorForQuery(android.database.sqlite.SQLiteStatement prog, java.lang.String[] selectionArgs) { throw new RuntimeException("Stub!"); }
public static  void cursorStringToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void cursorLongToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void cursorShortToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void cursorIntToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void cursorFloatToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void cursorDoubleToContentValuesIfPresent(android.database.Cursor cursor, android.content.ContentValues values, java.lang.String column) { throw new RuntimeException("Stub!"); }
public static  void createDbFromSqlStatements(android.content.Context context, java.lang.String dbName, int dbVersion, java.lang.String sqlStatements) { throw new RuntimeException("Stub!"); }
public static  int getSqlStatementType(java.lang.String sql) { throw new RuntimeException("Stub!"); }
public static  java.lang.String[] appendSelectionArgs(java.lang.String[] originalValues, java.lang.String[] newValues) { throw new RuntimeException("Stub!"); }
public static final int STATEMENT_ABORT = 6;
public static final int STATEMENT_ATTACH = 3;
public static final int STATEMENT_BEGIN = 4;
public static final int STATEMENT_COMMIT = 5;
public static final int STATEMENT_DDL = 8;
public static final int STATEMENT_OTHER = 99;
public static final int STATEMENT_PRAGMA = 7;
public static final int STATEMENT_SELECT = 1;
public static final int STATEMENT_UNPREPARED = 9;
public static final int STATEMENT_UPDATE = 2;
}
