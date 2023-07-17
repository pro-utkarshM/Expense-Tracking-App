package com.business.expenseTracker.data.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.business.expenseTracker.data.local.converter.DateConverter;
import com.business.expenseTracker.data.local.entity.AccountDto;
import com.business.expenseTracker.data.local.entity.TransactionDto;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionDao_Impl implements TransactionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TransactionDto> __insertionAdapterOfTransactionDto;

  private final DateConverter __dateConverter = new DateConverter();

  private final EntityInsertionAdapter<AccountDto> __insertionAdapterOfAccountDto;

  private final SharedSQLiteStatement __preparedStmtOfEraseTransaction;

  public TransactionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransactionDto = new EntityInsertionAdapter<TransactionDto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `transaction_table` (`timestamp`,`entry_date`,`amount`,`account`,`category`,`transaction_type`,`transaction_title`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionDto value) {
        final Long _tmp = __dateConverter.fromDate(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, _tmp);
        }
        if (value.getDateOfEntry() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDateOfEntry());
        }
        stmt.bindDouble(3, value.getAmount());
        if (value.getAccount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAccount());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCategory());
        }
        if (value.getTransactionType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTransactionType());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTitle());
        }
      }
    };
    this.__insertionAdapterOfAccountDto = new EntityInsertionAdapter<AccountDto>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `account_table` (`_id`,`account`,`balance`,`income`,`expense`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AccountDto value) {
        stmt.bindLong(1, value.getId());
        if (value.getAccountType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAccountType());
        }
        stmt.bindDouble(3, value.getBalance());
        stmt.bindDouble(4, value.getIncome());
        stmt.bindDouble(5, value.getExpense());
      }
    };
    this.__preparedStmtOfEraseTransaction = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM transaction_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertTransaction(final TransactionDto transaction,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTransactionDto.insert(transaction);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAccounts(final List<AccountDto> accounts,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfAccountDto.insert(accounts);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void eraseTransaction() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfEraseTransaction.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfEraseTransaction.release(_stmt);
    }
  }

  @Override
  public Flow<List<TransactionDto>> getDailyTransaction(final String entryDate) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (entryDate == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, entryDate);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getTransactionByAccount(final String accountType) {
    final String _sql = "SELECT * FROM transaction_table WHERE account = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (accountType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, accountType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<AccountDto> getAccount(final String account) {
    final String _sql = "SELECT * FROM account_table WHERE account = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (account == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, account);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"account_table"}, new Callable<AccountDto>() {
      @Override
      public AccountDto call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "_id");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "balance");
          final int _cursorIndexOfIncome = CursorUtil.getColumnIndexOrThrow(_cursor, "income");
          final int _cursorIndexOfExpense = CursorUtil.getColumnIndexOrThrow(_cursor, "expense");
          final AccountDto _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAccountType;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmpAccountType = null;
            } else {
              _tmpAccountType = _cursor.getString(_cursorIndexOfAccountType);
            }
            final double _tmpBalance;
            _tmpBalance = _cursor.getDouble(_cursorIndexOfBalance);
            final double _tmpIncome;
            _tmpIncome = _cursor.getDouble(_cursorIndexOfIncome);
            final double _tmpExpense;
            _tmpExpense = _cursor.getDouble(_cursorIndexOfExpense);
            _result = new AccountDto(_tmpId,_tmpAccountType,_tmpBalance,_tmpIncome,_tmpExpense);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<AccountDto>> getAccounts() {
    final String _sql = "SELECT `account_table`.`_id` AS `_id`, `account_table`.`account` AS `account`, `account_table`.`balance` AS `balance`, `account_table`.`income` AS `income`, `account_table`.`expense` AS `expense` FROM account_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"account_table"}, new Callable<List<AccountDto>>() {
      @Override
      public List<AccountDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfAccountType = 1;
          final int _cursorIndexOfBalance = 2;
          final int _cursorIndexOfIncome = 3;
          final int _cursorIndexOfExpense = 4;
          final List<AccountDto> _result = new ArrayList<AccountDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AccountDto _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAccountType;
            if (_cursor.isNull(_cursorIndexOfAccountType)) {
              _tmpAccountType = null;
            } else {
              _tmpAccountType = _cursor.getString(_cursorIndexOfAccountType);
            }
            final double _tmpBalance;
            _tmpBalance = _cursor.getDouble(_cursorIndexOfBalance);
            final double _tmpIncome;
            _tmpIncome = _cursor.getDouble(_cursorIndexOfIncome);
            final double _tmpExpense;
            _tmpExpense = _cursor.getDouble(_cursorIndexOfExpense);
            _item = new AccountDto(_tmpId,_tmpAccountType,_tmpBalance,_tmpIncome,_tmpExpense);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getAllTransaction() {
    final String _sql = "SELECT `transaction_table`.`timestamp` AS `timestamp`, `transaction_table`.`entry_date` AS `entry_date`, `transaction_table`.`amount` AS `amount`, `transaction_table`.`account` AS `account`, `transaction_table`.`category` AS `category`, `transaction_table`.`transaction_type` AS `transaction_type`, `transaction_table`.`transaction_title` AS `transaction_title` FROM transaction_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = 0;
          final int _cursorIndexOfDateOfEntry = 1;
          final int _cursorIndexOfAmount = 2;
          final int _cursorIndexOfAccount = 3;
          final int _cursorIndexOfCategory = 4;
          final int _cursorIndexOfTransactionType = 5;
          final int _cursorIndexOfTitle = 6;
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getCurrentDayExpTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date = date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getWeeklyExpTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date BETWEEN date('now', '-7 day') AND date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getMonthlyExpTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date BETWEEN date('now', '-1 month') AND date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> get3DayTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date >= date('now', '-3 day') AND entry_date < date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> get7DayTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date >= date('now', '-7 day') AND entry_date < date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> get14DayTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date >= date('now', '-14 day') AND entry_date < date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getStartOfMonthTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date >= date('now', 'start of month') AND entry_date < date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getLastMonthTransaction(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE entry_date >= date('now', '-1 month') AND entry_date < date('now', 'localtime') AND transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TransactionDto>> getTransactionByType(final String transactionType) {
    final String _sql = "SELECT * FROM transaction_table WHERE transaction_type = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionType == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionType);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"transaction_table"}, new Callable<List<TransactionDto>>() {
      @Override
      public List<TransactionDto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfDateOfEntry = CursorUtil.getColumnIndexOrThrow(_cursor, "entry_date");
          final int _cursorIndexOfAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "amount");
          final int _cursorIndexOfAccount = CursorUtil.getColumnIndexOrThrow(_cursor, "account");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfTransactionType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_title");
          final List<TransactionDto> _result = new ArrayList<TransactionDto>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionDto _item;
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __dateConverter.toDate(_tmp);
            final String _tmpDateOfEntry;
            if (_cursor.isNull(_cursorIndexOfDateOfEntry)) {
              _tmpDateOfEntry = null;
            } else {
              _tmpDateOfEntry = _cursor.getString(_cursorIndexOfDateOfEntry);
            }
            final double _tmpAmount;
            _tmpAmount = _cursor.getDouble(_cursorIndexOfAmount);
            final String _tmpAccount;
            if (_cursor.isNull(_cursorIndexOfAccount)) {
              _tmpAccount = null;
            } else {
              _tmpAccount = _cursor.getString(_cursorIndexOfAccount);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpTransactionType;
            if (_cursor.isNull(_cursorIndexOfTransactionType)) {
              _tmpTransactionType = null;
            } else {
              _tmpTransactionType = _cursor.getString(_cursorIndexOfTransactionType);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new TransactionDto(_tmpDate,_tmpDateOfEntry,_tmpAmount,_tmpAccount,_tmpCategory,_tmpTransactionType,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
