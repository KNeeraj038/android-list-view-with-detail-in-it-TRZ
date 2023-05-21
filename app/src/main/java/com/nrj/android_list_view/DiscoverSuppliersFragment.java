package com.nrj.android_list_view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DiscoverSuppliersFragment extends Fragment {

    private SellerCustomListAdapter mSellerAdapter;
    ArrayList<String> mProductList;
    LinearLayout ll_product_item;
    ListView lvSellerInfo;
    private List<ImageItem> imageItems;
    private List<SellerListItems> mItemList;
    public DiscoverSuppliersFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_discover_suppliers, container, false);

        init(view);

        return view;
    }

        private void init(View view){
        ll_product_item = view.findViewById(R.id.ll_product_item);
//        setupProductList();
        lvSellerInfo = view.findViewById(R.id.lv_SellerInfo);
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

        mSellerAdapter = new SellerCustomListAdapter(getActivity(), itemList);
        lvSellerInfo.setAdapter(mSellerAdapter);
    }
    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

}