package example.sdm.millonario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //cambiooo

    }

    public void btnSettings(View v){
        Intent i=new Intent(this,SettingsActivity.class);
        startActivity(i);
    }

    public void btnScores(View view){
        Intent i = new Intent(this,ScoresActivity.class);
        startActivity(i);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       if(item.getItemId() == R.id.home) {
           return super.onOptionsItemSelected(item);
       }else{
           Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
           return true;
       }
    }
}
