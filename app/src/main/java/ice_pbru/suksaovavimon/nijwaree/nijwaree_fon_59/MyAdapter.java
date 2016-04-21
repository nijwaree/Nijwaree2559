package ice_pbru.suksaovavimon.nijwaree.nijwaree_fon_59;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ICE on 21/4/2559.
 */
public class MyAdapter extends BaseAdapter{

    private Context context;
    private int[] IconInts;
    private String[] titleStrings, deailStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] deailStrings) {
        this.context = context;
        IconInts = iconInts;
        this.titleStrings = titleStrings;
        this.deailStrings = deailStrings;
    }

    @Override
    public int getCount() {
        return IconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.com_listview, viewGroup, false);

        // for icon
        ImageView IconImageview = (ImageView) view1.findViewById(R.id.imageView);
        IconImageview.setImageResource(IconInts[i]);

        // for title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        // for detail
        TextView detailTextview = (TextView) view1.findViewById(R.id.textView3);
        detailTextview.setText(deailStrings[i]);

        return view1;
    }
}
