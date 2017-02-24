package   com.lite.android.launcher3.base;

import android.app.Activity;
import android.content.Context;

/**
 * Created by bojanvu on 22.2.2017.
 */

public class BaseActivity extends Activity {

    public Context getContext() {
        return this;
    }

    public Activity getActivity() {
        return this;
    }
}