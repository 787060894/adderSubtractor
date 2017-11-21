package adpickerview.zbxxjl.com.addersubtractor;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/7/8.
 * 静态吐司
 */
public class ToastUtils {

    private static Toast toast;

    public static void show(Context context, String text) {
        if (toast == null)
            toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.setText(text);
        toast.show();
    }
}
