package ice_pbru.suksaovavimon.nijwaree.nijwaree_fon_59;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ICE on 21/4/2559.
 */
public class Detail_Activity extends AppCompatActivity{
    private TextView titleTextView, detailTextView;
    private ImageView comImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiy_detail);

        // bindwidget
        bindwidget();

        // Show view
        showView();
    }

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.computer);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titleTextView.setText(strTitle);
        comImageView.setImageResource(intIcon);

        String[] srtDetail = getResources().getStringArray(R.array.com_detail);
        detailTextView.setText(srtDetail(intIndex));
    }

    private void bindwidget() {
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        comImageView = (ImageView) findViewById(R.id.imageView2);

    }
}
