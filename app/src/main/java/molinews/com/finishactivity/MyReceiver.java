package molinews.com.finishactivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/10/24.
 */
public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "MyReceiver";
    private Context context;

    public MyReceiver() {
    }

    MyReceiver(Context context) {
        this.context = context;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "onReceive: " + "广播。。。onReceive");
        Toast.makeText(context,"接收广播..."+intent.getAction(),Toast.LENGTH_SHORT).show();
//            finish();
    }
}
