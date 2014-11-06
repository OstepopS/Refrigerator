package com.example.caspergron.myapplication;

import java.security.PrivateKey;
import java.util.Date;

/**
 * Created by CasperGron on 11/6/2014.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {
    // Database Version
    private  static  final int DATABASE_VERSION = 1;
    // Database Name
    private  static  final String DATABASE_NAME = "ItemListDB";

    public MySQLiteHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

        @Override
        public void onCreate(SQLiteDatabase db){
            // SQL statement to create refrigerator table
            String CREATE_REFRIGERATOR_TABLE = "CREATE TABLE refrigerator ( " +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "amount TEXT, "+
                "expiration DATE )";

            // create refrigerator table
            db.execSQL(CREATE_REFRIGERATOR_TABLE);

}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS refrigerator");

        // create fresh refrigerator table
        this.onCreate(db);
    }


    //  table name
    private static final String TABLE_ITEMLISTREFRIGERATOR = "list of items in refrigerator";

    //  Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_AMOUNT = "amount";
    private static final String KEY_DATE = "date";

    private static final String[] COLUMNS = {KEY_ID,KEY_NAME,KEY_AMOUNT,KEY_DATE};







    public void addRefrigeratorItem (ItemListRefrigerator itemListRefrigerator){

            Log.d("addItem", itemListRefrigerator.toString());
            // 1. get reference to writable DB
            SQLiteDatabase db = this.getWritableDatabase();
/*
            // 2. create ContentValues to add key "column"/value
            ContentValues values = new ContentValues();
            values.put(KEY_NAME, itemListRefrigerator.getName()); // get name
            values.put(KEY_AMOUNT, itemListRefrigerator.get Amount()); // get amount
            values.put(KEY_DATE, itemListRefrigerator.getDate()); // get date

            // 3. insert
            db.insert(TABLE_ITEMLISTREFRIGERATOR, // table
                    null, //nullColumnHack
                    values); // key/value -> keys = column names/ values = column values

            // 4. close
            db.close();
        }
    public ItemListRefrigerator getItem(int id){

        // 1. get reference to readable DB
        SQLiteDatabase db = this.getReadableDatabase();

        // 2. build query
        Cursor cursor =
                db.query(TABLE_ITEMLISTREFRIGERATOR, // a. table
                        COLUMNS, // b. column names
                        " id = ?", // c. selections
                        new String[] { String.valueOf(id) }, // d. selections args
                        null, // e. group by
                        null, // f. having
                        null, // g. order by
                        null); // h. limit

        // 3. if we got results get the first one
        if (cursor != null)
            cursor.moveToFirst();

        // 4. build book object
        ItemListRefrigerator itemListRefrigerator = new ItemListRefrigerator();
        itemListRefrigerator.setId(Integer.parseInt(cursor.getString(0)));
        itemListRefrigerator.setTitle(cursor.getString(1));
        itemListRefrigerator.setAuthor(cursor.getString(2));

        Log.d("getBook("+id+")", book.toString());

        // 5. return book
        return book;
    }*/
    }
}
