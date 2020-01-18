package com.toumal.mygrocerylist.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.toumal.mygrocerylist.Model.Grocery;
import com.toumal.mygrocerylist.Util.Constants;

import java.util.List;

public class DataBaseHandler extends SQLiteOpenHelper {

    private Context ctx;

    public DataBaseHandler(Context context) {
        super(context, Constants.DB_NAME,null,Constants.DB_VERSION);
        this.ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_GROCERY_TABLE = "CREATE TABLE " + Constants.TABLE_NAME + "("
                + Constants.KEY_ID +" INTEGER PRIMARY KEY, "
                +Constants.KEY_GROCERY_ITEM + " TEXT, "
                +Constants.KEY_QTY_NUMBER + " TEXT, "
                +Constants.KEY_DATE_NAME + " LONG);";

        db.execSQL(CREATE_GROCERY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Constants.TABLE_NAME);
        onCreate(db);

    }
    public void AddGrocery(Grocery grocery){

    }
    private Grocery getGrocery(int id){
        return null;
    }
    public List<Grocery> getAllGroceries(){
        return  null;
    }

    public int updateGrocery(Grocery grocery){
        return 0;
    }
    public  void deleteGrocery(int id){

    }
    public int getGroceriesCount(){
        return 0;
    }
}
