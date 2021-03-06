package android.com.sharedPreference;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class Preference {


    // https://github.com/Flutterwave/rave-android


    private static final String PREFS_NAME = "AOP_PREFS";
    private static final String PREFS_KEY = "AOP_PREFS_String";


    public Preference() {
        super();
    }


    public void save(Context context, String text) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
        editor = settings.edit(); //2
        editor.putString(PREFS_KEY, text); //3
        editor.apply(); //4

    }


    public String getValue(Context context) {

        SharedPreferences settings;
        String text;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        text = settings.getString(PREFS_KEY, null);
        return text;
    }

    public void clearSharedPreference(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();
        editor.clear();
        editor.apply();

    }

    public void removeValue(Context context) {
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();
        editor.remove(PREFS_KEY);
        editor.apply();
    }


}
