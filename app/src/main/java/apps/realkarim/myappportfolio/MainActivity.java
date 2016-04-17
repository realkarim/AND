package apps.realkarim.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;                                                   // set to true if I want to show the menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.popular_movies:
                Toast.makeText(context,"This button will launch my popular movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stack_hawk:
                Toast.makeText(context,"This button will launch my stack hawk app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger:
                Toast.makeText(context,"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.make_your_app_material:
                Toast.makeText(context,"This button will launch my make your app material app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.go_ubiquitous:
                Toast.makeText(context,"This button will launch my go ubiquitous app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(context,"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
