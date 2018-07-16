package devika.example.com.servise.service1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by DEVIKA on 24-Oct-16.
 */

public class Service10 extends IntentService {
    public Service10(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i("service10","hai devika");

    }
}
