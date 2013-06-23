package us.feras.eg.sample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import us.feras.ecogallery.EcoGallery;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        EcoGallery ecoGallery = (EcoGallery) findViewById(R.id.gallery);
        ecoGallery.setAdapter(new ImageAdapter(this));
    }

    private class ImageAdapter extends BaseAdapter {
        private Context context;

        ImageAdapter(Context context) {
            this.context = context;
        }

        public int getCount() {
            return 3;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            // Not using convertView for sample app simplicity. You should probably use it in real application to get better performance.
            ImageView imageView = new ImageView(context);
            int resId;
            switch (position) {
                case 0: resId = R.drawable.one;
                    break;
                case 1: resId = R.drawable.two;
                    break;
                case 2: resId = R.drawable.three;
                    break;
                default: resId = R.drawable.one;
            }
            imageView.setImageResource(resId);
            return imageView;
        }
    }
}
