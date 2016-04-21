package ice_pbru.suksaovavimon.nijwaree.nijwaree_fon_59;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Explicit
    private Button button;

    private ListView comlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bindwidget

        bindwidget();

        buttoncontroller();

        createListViwe();





    } // Main method

    private void createListViwe() {
        final int[] intIcon = {R.drawable.computer,R.drawable.keyboard,R.drawable.mouse,R.drawable.joystitck,R.drawable.speaker,R.drawable.head,R.drawable.webcam,R.drawable.floppy,R.drawable.handy,R.drawable.modem,R.drawable.hub,R.drawable.print,R.drawable.scanner,R.drawable.cd,R.drawable.mainboard,R.drawable.ram,R.drawable.cpu,R.drawable.card,R.drawable.power,R.drawable.hard};
        final String[] titleString  = new String[20];
        titleString[0] = "Computer";
        titleString[1] = "Keyboard";
        titleString[2] = "Mouse";
        titleString[3] = "Joystick";
        titleString[4] = "Speaker";
        titleString[5] = "Headphone";
        titleString[6] = "Webcam";
        titleString[7] = "Floppy drive";
        titleString[8] = "Handy drive";
        titleString[9] = "Modem";
        titleString[10] = "Hub";
        titleString[11] = "Printer";
        titleString[12] = "Scanner";
        titleString[13] = "CD-Rom";
        titleString[14] = "Mainboard";
        titleString[15] = "RAM";
        titleString[16] = "CPU";
        titleString[17] = "Display card";
        titleString[18] = "Powersupply";
        titleString[19] = "Harddisk";

        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleString, detailStrings);
        comlistView.setAdapter(myAdapter);

        comlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Detail_Activity.class);
                intent.putExtra("Title", titleString);
                intent.putExtra("Image", intIcon);
                intent.putExtra("Index", i);

                startActivity(intent);
            }
        });





    }

    private void buttoncontroller() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://fonaugust.wordpress.com/2014/05/21/"));

                startActivity(intent);
            }
        });


    }

    private void bindwidget() {
        button = (Button) findViewById(R.id.button);
        comlistView = (ListView) findViewById(R.id.listView);



    }
} // Main class
