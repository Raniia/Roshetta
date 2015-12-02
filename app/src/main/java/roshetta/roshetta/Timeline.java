package roshetta.roshetta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
//import com.facebook.FacebookSdk;
import android.view.View;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;


public class Timeline extends AppCompatActivity {
    TextView largetext1;
    TextView largetext2;
    TextView largetext3;
    TextView largetext4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_timeline);
        largetext1 = (TextView)findViewById(R.id.largetext1);
        largetext2 = (TextView)findViewById(R.id.largetext2);
        largetext3 = (TextView)findViewById(R.id.largetext3);
        largetext4 = (TextView)findViewById(R.id.largetext4);
        TextView edittext1 = (TextView)findViewById(R.id.edittext1);
        TextView edittext2 = (TextView)findViewById(R.id.edittext2);
        TextView edittext3 = (TextView)findViewById(R.id.edittext3);
        TextView edittext4 = (TextView)findViewById(R.id.edittext4);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);

    }
    public void onClickfirst(View v){
        Intent comments = new Intent(this,CommentPage.class);
        String user = largetext1.getText().toString();
        comments.putExtra("Nameofuser",user);
        startActivity(comments);
    }
    public void onClicksecond(View v){
        Intent comments = new Intent(this,CommentPage.class);
        String user = largetext2.getText().toString();
        comments.putExtra("Nameofuser",user);
        startActivity(comments);
    }
    public void onClickthird(View v){
        Intent comments = new Intent(this,CommentPage.class);
        String user = largetext3.getText().toString();
        comments.putExtra("Nameofuser",user);
        startActivity(comments);
    }
    public void onClickfourth(View v){
        Intent comments = new Intent(this,CommentPage.class);
        String user = largetext4.getText().toString();
        comments.putExtra("Nameofuser",user);
        startActivity(comments);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_timeline, menu);
        return true;
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
}