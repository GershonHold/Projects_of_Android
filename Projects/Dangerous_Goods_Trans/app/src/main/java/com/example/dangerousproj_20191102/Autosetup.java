package com.example.dangerousproj_20191102;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Autosetup extends BroadcastReceiver {
    /**
     * demo2: 可以实现开机自动打开软件并运行。
     */
    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("XRGPS", "BootReceiver.onReceive: " + intent.getAction());
        System.out.println("自启动程序即将执行");
        //MainActivity就是开机显示的界面
        Intent mBootIntent = new Intent(context, MainActivity.class);
        //下面这句话必须加上才能开机自动运行app的界面
        mBootIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mBootIntent);

    }
}
