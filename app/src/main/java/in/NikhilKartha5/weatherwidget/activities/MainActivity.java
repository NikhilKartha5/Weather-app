package in.NikhilKartha5.weatherwidget.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import in.NikhilKartha5.weatherwidget.R;
import in.NikhilKartha5.weatherwidget.fragments.WeatherFragment;
import in.NikhilKartha5.weatherwidget.utils.Weather;

/*
 * Created by NikhilKartha5 <sunil.kde@gmail.com> on April 23, 2023
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Weather.getLatitude(this) == null || Weather.getLongitude(this) == null) {
            Intent initialize = new Intent(this, InitializeActivity.class);
            startActivity(initialize);
            finish();
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new WeatherFragment()).commit();
    }

}