package roshetta.roshetta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CommentPage extends AppCompatActivity {
    Context context = this;
    Button timeline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_page);
        timeline = (Button) findViewById(R.id.button2);
        timeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,Timeline.class);
                startActivity(i);
            }
        });



        TextView largetext1 = (TextView)findViewById(R.id.largetext1);
        TextView largetext2 = (TextView)findViewById(R.id.largetext2);
        Button button1 = (Button)findViewById(R.id.button1);
        Bundle NameofUser = getIntent().getExtras();
        if(NameofUser == null) {
            return;
        }
        String Nameofuser = NameofUser.getString("Nameofuser");
        largetext1.setText(Nameofuser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_comment_page, menu);
        return true;
    }

    public void gotoprofile(View v){
        Intent comments = new Intent(this,Timeline.class);
        startActivity(comments);
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