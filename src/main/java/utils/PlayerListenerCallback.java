package utils;

import controller.LyricController;
import javafx.scene.media.MediaPlayer;

/**
 * Author QAQCoder , Email:QAQCoder@qq.com
 * Create time 2019/5/30 12:04
 * Class description：
 */
public interface PlayerListenerCallback {

    void doWhat(MediaPlayer mediaPlayer, LyricController.SyncLyricCallback syncLyricCallback);
}
