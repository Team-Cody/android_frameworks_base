package android.util;

import java.lang.Exception;
import java.lang.Runtime;

import android.util.Log;

public class getCoreExec {
    
    private static final String TAG = "CoreExec";
        
    public static void execute(String command) {
        
        try{
            Log.d(TAG, "Executing the command");
            Runtime.getRuntime().exec(command);
            Log.d(TAG, "Command executed");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG, "There were gremlins!");
        }
        
    }
}
