package molinews.com.finishactivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /**
     * 广播action
     */
    private static final String TAG = "MainActivity";
    public static final String SYSTEM_EXIT = "com.example.exitsystem.system_exit";
    private MyReceiver receiver;
    private IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ");
//        receiver = new MyReceiver();
//        filter = new IntentFilter();
//        filter.addAction(SYSTEM_EXIT);
//        registerReceiver(receiver, filter);

    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy: ");
        super.onDestroy();
        //记得取消广播注册
//        if (receiver != null) {
////            unregisterReceiver(receiver);
//        }
    }

    public void jump(View view) {
//        startActivity(new Intent(this, MainActivity.class));
        Intent in = new Intent();
        in.setAction(SYSTEM_EXIT);
        sendBroadcast(in);
    }

    public void finish(View view) {
        Log.e(TAG, "finish: " + "发送广播");
        sendBroadcast(new Intent(SYSTEM_EXIT));
    }


}
