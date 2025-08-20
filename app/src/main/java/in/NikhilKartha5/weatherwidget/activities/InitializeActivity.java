package in.NikhilKartha5.weatherwidget.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import in.NikhilKartha5.weatherwidget.R;
import in.NikhilKartha5.weatherwidget.fragments.InitializeFragment;

/*
 * Created by NikhilKartha5 <sunil.kde@gmail.com> on April 23, 2023
 */
public class InitializeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new InitializeFragment()).commit();
    }

}