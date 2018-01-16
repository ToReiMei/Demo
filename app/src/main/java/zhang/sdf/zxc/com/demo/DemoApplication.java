package zhang.sdf.zxc.com.demo;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by ZLJ on 2018/1/16.
 */

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //dev修改1
        //dev1开发
        //devremote修改1
        //dev1开发2
        //dev修改2
        //devremote修改2
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
