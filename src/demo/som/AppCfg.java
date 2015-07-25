package demo.som;

import myutils.debug.Debug;

/**
 * Created by beenotung on 7/26/15.
 */
public class AppCfg {
    public static boolean isDebug = false;

    public static void setIsDebug(boolean val){
        isDebug=val;
        myutils.debug.Debug.DISPLAY_LEVEL = isDebug ? Debug.DEBUG : Debug.RELEASE;
    }
}
