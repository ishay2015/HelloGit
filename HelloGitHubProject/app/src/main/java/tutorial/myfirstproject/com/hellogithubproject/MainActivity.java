package tutorial.myfirstproject.com.hellogithubproject;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe_onClick(View view) {
        Toast.makeText(getBaseContext(),"Toast",Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"Toast From laptop",Toast.LENGTH_SHORT).show();
        Toast.makeText(getBaseContext(),"Toast From Arixa",Toast.LENGTH_SHORT).show();
<<<<<<< HEAD
        Toast.makeText(getBaseContext(),"Toast From laptop2",Toast.LENGTH_SHORT).show();
=======
        Toast.makeText(getBaseContext(),"Toast From Arixa2",Toast.LENGTH_SHORT).show();
>>>>>>> d87b8bf6bbe8937c4a79a9a8313f40a9ae988461
    }
}
