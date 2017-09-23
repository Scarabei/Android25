/*
* Copyright (C) 2014 The Android Open Source Project
* Copyright (c) 1996, 2010, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/


package java.sql;
public interface DatabaseMetaData
  extends java.sql.Wrapper
{
public abstract  boolean allProceduresAreCallable() throws java.sql.SQLException;
public abstract  boolean allTablesAreSelectable() throws java.sql.SQLException;
public abstract  java.lang.String getURL() throws java.sql.SQLException;
public abstract  java.lang.String getUserName() throws java.sql.SQLException;
public abstract  boolean isReadOnly() throws java.sql.SQLException;
public abstract  boolean nullsAreSortedHigh() throws java.sql.SQLException;
public abstract  boolean nullsAreSortedLow() throws java.sql.SQLException;
public abstract  boolean nullsAreSortedAtStart() throws java.sql.SQLException;
public abstract  boolean nullsAreSortedAtEnd() throws java.sql.SQLException;
public abstract  java.lang.String getDatabaseProductName() throws java.sql.SQLException;
public abstract  java.lang.String getDatabaseProductVersion() throws java.sql.SQLException;
public abstract  java.lang.String getDriverName() throws java.sql.SQLException;
public abstract  java.lang.String getDriverVersion() throws java.sql.SQLException;
public abstract  int getDriverMajorVersion();
public abstract  int getDriverMinorVersion();
public abstract  boolean usesLocalFiles() throws java.sql.SQLException;
public abstract  boolean usesLocalFilePerTable() throws java.sql.SQLException;
public abstract  boolean supportsMixedCaseIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesUpperCaseIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesLowerCaseIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesMixedCaseIdentifiers() throws java.sql.SQLException;
public abstract  boolean supportsMixedCaseQuotedIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesUpperCaseQuotedIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesLowerCaseQuotedIdentifiers() throws java.sql.SQLException;
public abstract  boolean storesMixedCaseQuotedIdentifiers() throws java.sql.SQLException;
public abstract  java.lang.String getIdentifierQuoteString() throws java.sql.SQLException;
public abstract  java.lang.String getSQLKeywords() throws java.sql.SQLException;
public abstract  java.lang.String getNumericFunctions() throws java.sql.SQLException;
public abstract  java.lang.String getStringFunctions() throws java.sql.SQLException;
public abstract  java.lang.String getSystemFunctions() throws java.sql.SQLException;
public abstract  java.lang.String getTimeDateFunctions() throws java.sql.SQLException;
public abstract  java.lang.String getSearchStringEscape() throws java.sql.SQLException;
public abstract  java.lang.String getExtraNameCharacters() throws java.sql.SQLException;
public abstract  boolean supportsAlterTableWithAddColumn() throws java.sql.SQLException;
public abstract  boolean supportsAlterTableWithDropColumn() throws java.sql.SQLException;
public abstract  boolean supportsColumnAliasing() throws java.sql.SQLException;
public abstract  boolean nullPlusNonNullIsNull() throws java.sql.SQLException;
public abstract  boolean supportsConvert() throws java.sql.SQLException;
public abstract  boolean supportsConvert(int fromType, int toType) throws java.sql.SQLException;
public abstract  boolean supportsTableCorrelationNames() throws java.sql.SQLException;
public abstract  boolean supportsDifferentTableCorrelationNames() throws java.sql.SQLException;
public abstract  boolean supportsExpressionsInOrderBy() throws java.sql.SQLException;
public abstract  boolean supportsOrderByUnrelated() throws java.sql.SQLException;
public abstract  boolean supportsGroupBy() throws java.sql.SQLException;
public abstract  boolean supportsGroupByUnrelated() throws java.sql.SQLException;
public abstract  boolean supportsGroupByBeyondSelect() throws java.sql.SQLException;
public abstract  boolean supportsLikeEscapeClause() throws java.sql.SQLException;
public abstract  boolean supportsMultipleResultSets() throws java.sql.SQLException;
public abstract  boolean supportsMultipleTransactions() throws java.sql.SQLException;
public abstract  boolean supportsNonNullableColumns() throws java.sql.SQLException;
public abstract  boolean supportsMinimumSQLGrammar() throws java.sql.SQLException;
public abstract  boolean supportsCoreSQLGrammar() throws java.sql.SQLException;
public abstract  boolean supportsExtendedSQLGrammar() throws java.sql.SQLException;
public abstract  boolean supportsANSI92EntryLevelSQL() throws java.sql.SQLException;
public abstract  boolean supportsANSI92IntermediateSQL() throws java.sql.SQLException;
public abstract  boolean supportsANSI92FullSQL() throws java.sql.SQLException;
public abstract  boolean supportsIntegrityEnhancementFacility() throws java.sql.SQLException;
public abstract  boolean supportsOuterJoins() throws java.sql.SQLException;
public abstract  boolean supportsFullOuterJoins() throws java.sql.SQLException;
public abstract  boolean supportsLimitedOuterJoins() throws java.sql.SQLException;
public abstract  java.lang.String getSchemaTerm() throws java.sql.SQLException;
public abstract  java.lang.String getProcedureTerm() throws java.sql.SQLException;
public abstract  java.lang.String getCatalogTerm() throws java.sql.SQLException;
public abstract  boolean isCatalogAtStart() throws java.sql.SQLException;
public abstract  java.lang.String getCatalogSeparator() throws java.sql.SQLException;
public abstract  boolean supportsSchemasInDataManipulation() throws java.sql.SQLException;
public abstract  boolean supportsSchemasInProcedureCalls() throws java.sql.SQLException;
public abstract  boolean supportsSchemasInTableDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsSchemasInIndexDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsSchemasInPrivilegeDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsCatalogsInDataManipulation() throws java.sql.SQLException;
public abstract  boolean supportsCatalogsInProcedureCalls() throws java.sql.SQLException;
public abstract  boolean supportsCatalogsInTableDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsCatalogsInIndexDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsCatalogsInPrivilegeDefinitions() throws java.sql.SQLException;
public abstract  boolean supportsPositionedDelete() throws java.sql.SQLException;
public abstract  boolean supportsPositionedUpdate() throws java.sql.SQLException;
public abstract  boolean supportsSelectForUpdate() throws java.sql.SQLException;
public abstract  boolean supportsStoredProcedures() throws java.sql.SQLException;
public abstract  boolean supportsSubqueriesInComparisons() throws java.sql.SQLException;
public abstract  boolean supportsSubqueriesInExists() throws java.sql.SQLException;
public abstract  boolean supportsSubqueriesInIns() throws java.sql.SQLException;
public abstract  boolean supportsSubqueriesInQuantifieds() throws java.sql.SQLException;
public abstract  boolean supportsCorrelatedSubqueries() throws java.sql.SQLException;
public abstract  boolean supportsUnion() throws java.sql.SQLException;
public abstract  boolean supportsUnionAll() throws java.sql.SQLException;
public abstract  boolean supportsOpenCursorsAcrossCommit() throws java.sql.SQLException;
public abstract  boolean supportsOpenCursorsAcrossRollback() throws java.sql.SQLException;
public abstract  boolean supportsOpenStatementsAcrossCommit() throws java.sql.SQLException;
public abstract  boolean supportsOpenStatementsAcrossRollback() throws java.sql.SQLException;
public abstract  int getMaxBinaryLiteralLength() throws java.sql.SQLException;
public abstract  int getMaxCharLiteralLength() throws java.sql.SQLException;
public abstract  int getMaxColumnNameLength() throws java.sql.SQLException;
public abstract  int getMaxColumnsInGroupBy() throws java.sql.SQLException;
public abstract  int getMaxColumnsInIndex() throws java.sql.SQLException;
public abstract  int getMaxColumnsInOrderBy() throws java.sql.SQLException;
public abstract  int getMaxColumnsInSelect() throws java.sql.SQLException;
public abstract  int getMaxColumnsInTable() throws java.sql.SQLException;
public abstract  int getMaxConnections() throws java.sql.SQLException;
public abstract  int getMaxCursorNameLength() throws java.sql.SQLException;
public abstract  int getMaxIndexLength() throws java.sql.SQLException;
public abstract  int getMaxSchemaNameLength() throws java.sql.SQLException;
public abstract  int getMaxProcedureNameLength() throws java.sql.SQLException;
public abstract  int getMaxCatalogNameLength() throws java.sql.SQLException;
public abstract  int getMaxRowSize() throws java.sql.SQLException;
public abstract  boolean doesMaxRowSizeIncludeBlobs() throws java.sql.SQLException;
public abstract  int getMaxStatementLength() throws java.sql.SQLException;
public abstract  int getMaxStatements() throws java.sql.SQLException;
public abstract  int getMaxTableNameLength() throws java.sql.SQLException;
public abstract  int getMaxTablesInSelect() throws java.sql.SQLException;
public abstract  int getMaxUserNameLength() throws java.sql.SQLException;
public abstract  int getDefaultTransactionIsolation() throws java.sql.SQLException;
public abstract  boolean supportsTransactions() throws java.sql.SQLException;
public abstract  boolean supportsTransactionIsolationLevel(int level) throws java.sql.SQLException;
public abstract  boolean supportsDataDefinitionAndDataManipulationTransactions() throws java.sql.SQLException;
public abstract  boolean supportsDataManipulationTransactionsOnly() throws java.sql.SQLException;
public abstract  boolean dataDefinitionCausesTransactionCommit() throws java.sql.SQLException;
public abstract  boolean dataDefinitionIgnoredInTransactions() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getProcedures(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String procedureNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getProcedureColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String procedureNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getTables(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern, java.lang.String[] types) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getSchemas() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getCatalogs() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getTableTypes() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getColumnPrivileges(java.lang.String catalog, java.lang.String schema, java.lang.String table, java.lang.String columnNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getTablePrivileges(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getBestRowIdentifier(java.lang.String catalog, java.lang.String schema, java.lang.String table, int scope, boolean nullable) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getVersionColumns(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getPrimaryKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getImportedKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getExportedKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getCrossReference(java.lang.String parentCatalog, java.lang.String parentSchema, java.lang.String parentTable, java.lang.String foreignCatalog, java.lang.String foreignSchema, java.lang.String foreignTable) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getTypeInfo() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getIndexInfo(java.lang.String catalog, java.lang.String schema, java.lang.String table, boolean unique, boolean approximate) throws java.sql.SQLException;
public abstract  boolean supportsResultSetType(int type) throws java.sql.SQLException;
public abstract  boolean supportsResultSetConcurrency(int type, int concurrency) throws java.sql.SQLException;
public abstract  boolean ownUpdatesAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean ownDeletesAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean ownInsertsAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean othersUpdatesAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean othersDeletesAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean othersInsertsAreVisible(int type) throws java.sql.SQLException;
public abstract  boolean updatesAreDetected(int type) throws java.sql.SQLException;
public abstract  boolean deletesAreDetected(int type) throws java.sql.SQLException;
public abstract  boolean insertsAreDetected(int type) throws java.sql.SQLException;
public abstract  boolean supportsBatchUpdates() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getUDTs(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern, int[] types) throws java.sql.SQLException;
public abstract  java.sql.Connection getConnection() throws java.sql.SQLException;
public abstract  boolean supportsSavepoints() throws java.sql.SQLException;
public abstract  boolean supportsNamedParameters() throws java.sql.SQLException;
public abstract  boolean supportsMultipleOpenResults() throws java.sql.SQLException;
public abstract  boolean supportsGetGeneratedKeys() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getSuperTypes(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getSuperTables(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getAttributes(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern, java.lang.String attributeNamePattern) throws java.sql.SQLException;
public abstract  boolean supportsResultSetHoldability(int holdability) throws java.sql.SQLException;
public abstract  int getResultSetHoldability() throws java.sql.SQLException;
public abstract  int getDatabaseMajorVersion() throws java.sql.SQLException;
public abstract  int getDatabaseMinorVersion() throws java.sql.SQLException;
public abstract  int getJDBCMajorVersion() throws java.sql.SQLException;
public abstract  int getJDBCMinorVersion() throws java.sql.SQLException;
public abstract  int getSQLStateType() throws java.sql.SQLException;
public abstract  boolean locatorsUpdateCopy() throws java.sql.SQLException;
public abstract  boolean supportsStatementPooling() throws java.sql.SQLException;
public abstract  java.sql.RowIdLifetime getRowIdLifetime() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getSchemas(java.lang.String catalog, java.lang.String schemaPattern) throws java.sql.SQLException;
public abstract  boolean supportsStoredFunctionsUsingCallSyntax() throws java.sql.SQLException;
public abstract  boolean autoCommitFailureClosesAllResultSets() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getClientInfoProperties() throws java.sql.SQLException;
public abstract  java.sql.ResultSet getFunctions(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String functionNamePattern) throws java.sql.SQLException;
public abstract  java.sql.ResultSet getFunctionColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String functionNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;
public static final short attributeNoNulls = 0;
public static final short attributeNullable = 1;
public static final short attributeNullableUnknown = 2;
public static final int bestRowNotPseudo = 1;
public static final int bestRowPseudo = 2;
public static final int bestRowSession = 2;
public static final int bestRowTemporary = 0;
public static final int bestRowTransaction = 1;
public static final int bestRowUnknown = 0;
public static final int columnNoNulls = 0;
public static final int columnNullable = 1;
public static final int columnNullableUnknown = 2;
public static final int functionColumnIn = 1;
public static final int functionColumnInOut = 2;
public static final int functionColumnOut = 3;
public static final int functionColumnResult = 5;
public static final int functionColumnUnknown = 0;
public static final int functionNoNulls = 0;
public static final int functionNoTable = 1;
public static final int functionNullable = 1;
public static final int functionNullableUnknown = 2;
public static final int functionResultUnknown = 0;
public static final int functionReturn = 4;
public static final int functionReturnsTable = 2;
public static final int importedKeyCascade = 0;
public static final int importedKeyInitiallyDeferred = 5;
public static final int importedKeyInitiallyImmediate = 6;
public static final int importedKeyNoAction = 3;
public static final int importedKeyNotDeferrable = 7;
public static final int importedKeyRestrict = 1;
public static final int importedKeySetDefault = 4;
public static final int importedKeySetNull = 2;
public static final int procedureColumnIn = 1;
public static final int procedureColumnInOut = 2;
public static final int procedureColumnOut = 4;
public static final int procedureColumnResult = 3;
public static final int procedureColumnReturn = 5;
public static final int procedureColumnUnknown = 0;
public static final int procedureNoNulls = 0;
public static final int procedureNoResult = 1;
public static final int procedureNullable = 1;
public static final int procedureNullableUnknown = 2;
public static final int procedureResultUnknown = 0;
public static final int procedureReturnsResult = 2;
public static final int sqlStateSQL = 2;
public static final int sqlStateSQL99 = 2;
public static final int sqlStateXOpen = 1;
public static final short tableIndexClustered = 1;
public static final short tableIndexHashed = 2;
public static final short tableIndexOther = 3;
public static final short tableIndexStatistic = 0;
public static final int typeNoNulls = 0;
public static final int typeNullable = 1;
public static final int typeNullableUnknown = 2;
public static final int typePredBasic = 2;
public static final int typePredChar = 1;
public static final int typePredNone = 0;
public static final int typeSearchable = 3;
public static final int versionColumnNotPseudo = 1;
public static final int versionColumnPseudo = 2;
public static final int versionColumnUnknown = 0;
}
