package example.sdm.millonario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {
    private ArrayList<String> listAmigos=new ArrayList();;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }

    public void addFriend(View v){

        EditText et=findViewById(R.id.etFriends);
        String s=et.getText().toString();
        listAmigos.add(s);

    }
}
