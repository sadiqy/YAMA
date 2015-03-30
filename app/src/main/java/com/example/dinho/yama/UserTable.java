package com.example.dinho.yama;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class UserTable {

    public static final String DB_NAME = "YAMA";
    public static final int DB_VERSION = 1;
    //Database table
    public static final String TABLE_NAME = "user";
    public static final String ID = " _id";
    public static final String NAME = "name";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";

    private static final String DATABASE_CREATE = "create table" +
            TABLE_NAME + "(" + ID + " integer autoincrement" +
            NAME + " text not null" + USERNAME + " text primary key not null " +
            PASSWORD + "text not null" + ")";

    public static void onCreate(SQLiteDatabase db)
    {
        db.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        Log.w(UserTable.class.getName(), "Upgrading database from version" +
                + oldVersion + " to " + newVersion + ", which will destroy old data");
        onCreate(db);
    }
}
