package lele.parini.mylibrary;

import android.os.Environment;

public class MYLibrary {
    public String getDownloadFolder() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString();
    }
}
