package solutions.s4y.testp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(), "4fa91204-c96a-4c62-bbd0-5cff6c34e86b",
                Analytics.class, Crashes.class);
    }
}
