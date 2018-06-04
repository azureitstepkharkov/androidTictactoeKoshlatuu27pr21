package com.example.bohdanovskyi.ticactoe3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "tictactoe", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(String.format("create table tictactoe (id integer primary key autoincrement,winner text not null);"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
