package digitalgarden.kardhalakeskincsek;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity
    {
    @SuppressWarnings("unused")
    private EditText ed1;
    @SuppressWarnings("unused")
    private TextView tx1;
    @SuppressWarnings("unused")
    private EditText ed2;
    @SuppressWarnings("unused")
    private TextView tx2;
    @SuppressWarnings("unused")
    private EditText ed3;
    @SuppressWarnings("unused")
    private TextView tx3;
    @SuppressWarnings("unused")
    private EditText ed4;
    @SuppressWarnings("unused")
    private TextView tx4;
    @SuppressWarnings("unused")
    private EditText ed5;
    @SuppressWarnings("unused")
    private TextView tx5;

    @Override
    public void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View view)
                {
                DoIt();
                // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();
                }
            });

        ed1 = (EditText) findViewById(R.id.ed1);
        tx1 =(TextView) findViewById(R.id.tx1);
        ed2 = (EditText) findViewById(R.id.ed2);
        tx2 =(TextView) findViewById(R.id.tx2);
        ed3 = (EditText) findViewById(R.id.ed3);
        tx3 =(TextView) findViewById(R.id.tx3);
        ed4 = (EditText) findViewById(R.id.ed4);
        tx4 =(TextView) findViewById(R.id.tx4);
        ed5 = (EditText) findViewById(R.id.ed5);
        tx5 =(TextView) findViewById(R.id.tx5);

        DoFirst();
        }

    private Player player;
    private Command command;

    public void DoFirst()
        {
        player = new Player( new World() );
        command = new Command();

        DoIt();
        }

    public void DoIt()
        {
        try
            {
            /*
             * Ide jön a kipróbálandó programrész.
             * Az ed1-ed5 mezőket (és a tx1-tx5 címkéket is) szabadon használhatjuk
             *

            String str = ed1.getText().toString();


            String wrd[] = str.split(" ");

            ed2.setText( wrd[0]);

            ed3.setText( wrd[ wrd.length - 1 ] );
            */

            // String str1 = ed1.getText().toString();
            // String str2 = ed2.getText().toString();


            int direction = command.getMeaning( ed2.getText().toString() );
            ed2.setText ("");
            if ( !player.move( direction ) )
                {
                ed1.setText( "Arra nem mehetsz!" );
                return;
                }

            ed1.setText( player.getDescriptionOfPosition() );
            }
        catch (Exception e)
            {
            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
            }
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
        {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
        {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
            {
            return true;
            }

        return super.onOptionsItemSelected(item);
        }
    }
