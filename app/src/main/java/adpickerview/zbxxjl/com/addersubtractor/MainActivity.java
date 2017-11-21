package adpickerview.zbxxjl.com.addersubtractor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.adderview)
    adderView adderview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //监听
        adderview.setOnValueChangeListene(new adderView.OnValueChangeListener() {
            @Override
            public void onValueChange(int value) {
                ToastUtils.show(MainActivity.this, value + "");
            }
        });
    }
}
