package com.rns.rnsecomapp.SharedPrefManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.rns.rnsecomapp.datamodel.UserData;
import com.rns.rnsecomapp.ui.LogIn.LoginActivity;

public class SharedPrefManager {

    private static final String SHARED_PREF_NAME = "RNSECOM";
    private static final String KEY_USERNAME = "keyusername";
//    private static final String KEY_PHONE_NO = "keyponeno";
    private static final String KEY_MAIL = "keymail";
    private static final String KEY_USER_TYPE = "keyusertype";
//    private static final String KEY_CREATED_AT = "createdAt";
//    private static final String KEY_UPDATED_AT = "updatedAt";
//    private static final String KEY_POST = "post";
    private static final String KEY_ID = "keyid";
    private static SharedPrefManager mInstance;
    private static Context ctx;

    private SharedPrefManager(Context context) {
        ctx = context;
    }
    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }

    //this method will store the user data in shared preferences
    public void userLogin(UserData user) {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(KEY_USERNAME, user.getName());
//        editor.putString(KEY_PHONE_NO, user.getPhone().toString());
        editor.putString(KEY_MAIL,user.getEmail());
        editor.putString(KEY_USER_TYPE, user.getUserType());
        editor.putInt(KEY_ID, user.getId());
        editor.apply();
    }

    //this method will checker whether user is already logged in or not
    public boolean isLoggedIn() {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_USERNAME, null) != null;
    }

    //this method will give the logged in user
    public UserData getUser() {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new UserData(
                sharedPreferences.getString(KEY_MAIL, null),
                sharedPreferences.getInt(KEY_ID, 0),
                sharedPreferences.getString(KEY_USERNAME, null),
//                sharedPreferences.getString(KEY_PHONE_NO, null),
                sharedPreferences.getString(KEY_USER_TYPE, null));
    }

    //this method will logout the user
    public void logout() {
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        Intent intent=new Intent(ctx, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intent);
    }
}
