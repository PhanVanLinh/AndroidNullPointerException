package toong.vn.androidnullpointerexception;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person();

        switch (person.getName()){
            case "A":
                break;
            case "B":
                break;
        }
    }
}
