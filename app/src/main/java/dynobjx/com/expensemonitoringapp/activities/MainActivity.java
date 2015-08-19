package dynobjx.com.expensemonitoringapp.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.analytics.Tracker;
import dynobjx.com.expensemonitoringapp.R;

public class MainActivity extends AppCompatActivity {

    private Tracker mTracker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BaseApplication application = (BaseApplication) getApplication();

    }

}
