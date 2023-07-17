package com.business.expenseTracker.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionDatabase_Impl extends TransactionDatabase {
  private volatile TransactionDao _transactionDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transaction_table` (`timestamp` INTEGER NOT NULL, `entry_date` TEXT NOT NULL, `amount` REAL NOT NULL, `account` TEXT NOT NULL, `category` TEXT NOT NULL, `transaction_type` TEXT NOT NULL, `transaction_title` TEXT NOT NULL, PRIMARY KEY(`timestamp`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `account_table` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `account` TEXT NOT NULL, `balance` REAL NOT NULL, `income` REAL NOT NULL, `expense` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b2e543081da5d1a6c309540c4466f6e4')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `transaction_table`");
        _db.execSQL("DROP TABLE IF EXISTS `account_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsTransactionTable = new HashMap<String, TableInfo.Column>(7);
        _columnsTransactionTable.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("entry_date", new TableInfo.Column("entry_date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("amount", new TableInfo.Column("amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("account", new TableInfo.Column("account", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("transaction_type", new TableInfo.Column("transaction_type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactionTable.put("transaction_title", new TableInfo.Column("transaction_title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactionTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactionTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactionTable = new TableInfo("transaction_table", _columnsTransactionTable, _foreignKeysTransactionTable, _indicesTransactionTable);
        final TableInfo _existingTransactionTable = TableInfo.read(_db, "transaction_table");
        if (! _infoTransactionTable.equals(_existingTransactionTable)) {
          return new RoomOpenHelper.ValidationResult(false, "transaction_table(com.business.expenseTracker.data.local.entity.TransactionDto).\n"
                  + " Expected:\n" + _infoTransactionTable + "\n"
                  + " Found:\n" + _existingTransactionTable);
        }
        final HashMap<String, TableInfo.Column> _columnsAccountTable = new HashMap<String, TableInfo.Column>(5);
        _columnsAccountTable.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountTable.put("account", new TableInfo.Column("account", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountTable.put("balance", new TableInfo.Column("balance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountTable.put("income", new TableInfo.Column("income", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAccountTable.put("expense", new TableInfo.Column("expense", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAccountTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAccountTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAccountTable = new TableInfo("account_table", _columnsAccountTable, _foreignKeysAccountTable, _indicesAccountTable);
        final TableInfo _existingAccountTable = TableInfo.read(_db, "account_table");
        if (! _infoAccountTable.equals(_existingAccountTable)) {
          return new RoomOpenHelper.ValidationResult(false, "account_table(com.business.expenseTracker.data.local.entity.AccountDto).\n"
                  + " Expected:\n" + _infoAccountTable + "\n"
                  + " Found:\n" + _existingAccountTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "b2e543081da5d1a6c309540c4466f6e4", "21015d2676575b602ba210bac2708ded");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "transaction_table","account_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `transaction_table`");
      _db.execSQL("DELETE FROM `account_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TransactionDao.class, TransactionDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public TransactionDao getTransactionDao() {
    if (_transactionDao != null) {
      return _transactionDao;
    } else {
      synchronized(this) {
        if(_transactionDao == null) {
          _transactionDao = new TransactionDao_Impl(this);
        }
        return _transactionDao;
      }
    }
  }
}
