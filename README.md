# android-wifi-activity
Provides an activity that you can subclass to force the connection to a specific wifi network when the activity is started.

Is necessary add in your AndroidManifest.
```
 <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
 <uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
 <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

### Use class WifiBaseActivity

```
public class MainActivity extends WifiBaseActivity {

  private static final int TIMEOUT = 5;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected int getSecondsTimeout() {
        return TIMEOUT;
    }

    @Override
    protected String getWifiPass() {
        return "123456";
    }

    @Override
    protected String getWifiSSID() {
        return "MY-WIFI";
    }

}

```

### Use interface WifiBaseListener

```
  public class MainActivity extends FragmentActivity implements WifiBase.WifiBaseListener {
  
    private static final int TIMEOUT = 5;
    private WifiBase mWifiBase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWifiBase = new WifiBase(this);
    }
  
    @Override
    public String getWifiSSID() {
        return "MY-WIFI";
    }

    @Override
    public String getWifiPass() {
        return "123456";
    }

    @Override
    public int getSecondsTimeout() {
        return TIMEOUT;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Activity getActivity() {
        return this;
    }
  
  }
```
