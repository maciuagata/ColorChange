package lt.vtvpmc.ems.zp182.colorchangezp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGreen;
    Button btnRed;
    Button btnBlue;
    Button btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGreen = (Button) findViewById(R.id.buttonColorGreen);
        btnRed = (Button) findViewById(R.id.buttonColorRed);
        btnBlue = (Button) findViewById(R.id.buttonColorBlue);
        btnYellow = (Button) findViewById(R.id.buttonColorYellow);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColors();
                findViewById(R.id.colorGreenLayout).setBackgroundColor(getResources().getColor(R.color.colorGreen));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColors();
                findViewById(R.id.colorRedLayout).setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColors();
                findViewById(R.id.colorBlueLayout).setBackgroundColor(getResources().getColor(R.color.colorBlue));
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetColors();
                findViewById(R.id.colorYellowLayout).setBackgroundColor(getResources().getColor(R.color.colorYellow));
            }
        });

    }

    private void resetColors() {
        findViewById(R.id.colorRedLayout).setBackgroundColor(Color.TRANSPARENT);
        findViewById(R.id.colorGreenLayout).setBackgroundColor(Color.TRANSPARENT);
        findViewById(R.id.colorBlueLayout).setBackgroundColor(Color.TRANSPARENT);
        findViewById(R.id.colorYellowLayout).setBackgroundColor(Color.TRANSPARENT);
    }

}

