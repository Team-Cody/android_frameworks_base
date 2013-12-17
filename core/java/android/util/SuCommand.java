package android.util;

import java.lang.Exception;
import java.lang.Runtime;

import android.util.Log;

public class SuCommand {
    
    private static final String TAG = "SU_COMMAND";
        
    public static void execute(String command) {
        
        try{
            Log.d(TAG, "Executing the command");
            Runtime.getRuntime().exec(command);
            Log.d(TAG, "Command executed");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "Shit Happened!");
        }
        
    }
}
