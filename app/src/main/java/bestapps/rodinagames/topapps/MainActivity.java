package bestapps.rodinagames.topapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void button1(View view) {
        Intent intent = new Intent(this, VodkaActivity.class);
        startActivity(intent);
    }

//        public void button2(View view) {
//        Intent intent = new Intent(this, RumActivity.class);
//        startActivity(intent);
//    }
//
//        public void button3(View view) {
//        Intent intent = new Intent(this, TequilaActivity.class);
//        startActivity(intent);
//    }
//
//        public void button4(View view) {
//        Intent intent = new Intent(this, Quote1Activity.class);
//        startActivity(intent);
//    }
//
//        public void button5(View view) {
//        Intent intent = new Intent(this, Quote1Activity.class);
//        startActivity(intent);
//    }

}
