package com.adi.learning.android.data;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.adi.learning.android.data.model.DataItem;
import com.adi.learning.android.data.sample.SampleDataProvider;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        DataItem item = getIntent().getExtras().getParcelable(DataItemAdapter.ITEM_KEY);

        if (item != null) {
            Toast.makeText(this, "Received Item " + item.getItemName(), Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Didn't receive any data", Toast.LENGTH_SHORT).show();
        }

    }
}
