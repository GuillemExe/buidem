package com.example.buidemproject.SQLite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BuidemHelper extends SQLiteOpenHelper {

    // database version
    private static final int database_VERSION = 2;

    // database name
    private static final String database_NAME = "BuidemDataBase";

    public BuidemHelper(Context context) {
        super(context, database_NAME, null, database_VERSION);
    }

    String CREATE_MAQUINES =
            "CREATE TABLE maquines ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nomclient TEXT," +
                    "adreça TEXT," +
                    "codipostal TEXT," +
                    "poblacio TEXT," +
                    "telefon TEXT," +
                    "email TEXT," +
                    "numeroseriemaquina TEXT," +
                    "datarevisio TEXT," +
                    "tipusdemaquina TEXT," +
                    "zona TEXT)";

    String CREATE_ZONES =
            "CREATE TABLE zones ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nomzona TEXT," +
                    "latitud DOUBLE," +
                    "longitud DOUBLE," +
                    "FOREIGN KEY(zona) REFERENCES maquines(zona))";

    String CREATE_TIPUS =
            "CREATE TABLE tipus ( _id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nomtipus TEXT," +
                    "FOREIGN KEY(tipusdemaquina) REFERENCES maquines(tipusdemaquina))";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_MAQUINES);
        db.execSQL(CREATE_ZONES);
        db.execSQL(CREATE_TIPUS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
