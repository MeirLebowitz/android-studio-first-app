package com.dummies.silentmodetoggle.util;
import android.media.AudioManager;

/**
 * Created by 613le on 10/10/2017.
 */

public class RingerHelper {
    private RingerHelper() {}

    public static void performToggle(AudioManager audioManager){
        audioManager.setRingerMode(
                isPhoneSilent(audioManager)
                    ?AudioManager.RINGER_MODE_NORMAL
                    :AudioManager.RINGER_MODE_SILENT;
        }
    public static boolean isPhoneSilent(AudioManager audioManager){
            return audioManager.getRingerMode()
                    ==AudioManager.RINGER_MODE_SILENT;
        }
    }

