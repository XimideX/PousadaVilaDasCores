package com.example.pousadaviladascores.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

public class SqlAccess {

    DbHelper dbHelper;
    SQLiteDatabase db;
    ContentValues values;

    public SqlAccess(Context context) {
        values = new ContentValues();
        dbHelper = new DbHelper(context);
    }

    public DbHelper getDbHelper() {
        return dbHelper;
    }

    public void insertIntoDb(String nome) {
        // Gets the data repository in write mode
        db = dbHelper.getWritableDatabase();
        // Create a new map of values, where column names are the keys
        values = new ContentValues();
        values.put(DatabaseCreator.ApartmentEntriesTable.RENTED_COLUMN_NAME, nome);
        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(DatabaseCreator.ApartmentEntriesTable.TABLE_NAME, null, values);
    }

    public void readFromDb() {
        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                BaseColumns._ID,
                DatabaseCreator.ApartmentEntriesTable.RENTED_COLUMN_NAME
        };

        // Filter results WHERE "title" = 'My Title'
        //        String selection = DatabaseCreator.ApartmentEntriesTable.RENTED_COLUMN_NAME + " = Apartment";
        //        String[] selectionArgs = { "Apartamento 1" };

        // How you want the results sorted in the resulting Cursor
        //        String sortOrder =
        //                DatabaseCreator.ApartmentEntriesTable.RENTED_COLUMN_NAME + " DESC";

        Cursor cursor = db.query(
                DatabaseCreator.ApartmentEntriesTable.TABLE_NAME,   // The table to query
                null,             // The array of columns to return (pass null to get all)
                null,              // The columns for the WHERE clause
                null,          // The values for the WHERE clause
                null,                   // don't group the rows
                null,                   // don't filter by row groups
                null               // The sort order
        );

        List itemIds = new ArrayList<>();
        List itens = new ArrayList<>();
        while(cursor.moveToNext()) {
//            int itemId = cursor.getInt(
//                    cursor.getColumnIndexOrThrow(DatabaseCreator.ApartmentEntriesTable._ID));
            String nome = cursor.getString(cursor.getColumnIndexOrThrow(DatabaseCreator.ApartmentEntriesTable.RENTED_COLUMN_NAME));
            itens.add(nome);
        }

        cursor.close();
    }

//    public void

}
