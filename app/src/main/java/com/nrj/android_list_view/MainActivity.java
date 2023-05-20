package com.nrj.android_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SellerCustomListAdapter mSellerAdapter;
    ArrayList<String> mProductList;
    LinearLayout ll_product_item;
    ListView lvSellerInfo;
    private List<ImageItem> imageItems;
    private List<SellerListItems> mItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init(){
        ll_product_item = findViewById(R.id.ll_product_item);
//        setupProductList();
        lvSellerInfo = findViewById(R.id.lv_SellerInfo);
        ArrayList<SellerListItems> itemList = new ArrayList<>();
        //public SellerListItems(String sellerName, String sellerCompanyName, String businessName, String location, String industry) {

        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));
        itemList.add(new SellerListItems("name","company","bussiness", "Location", "Industry"));

        mSellerAdapter = new SellerCustomListAdapter(this, itemList);
        lvSellerInfo.setAdapter(mSellerAdapter);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}