package com.nrj.android_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class SellerCustomListAdapter extends ArrayAdapter<SellerListItems> {
    private Context context;
    private List<SellerListItems> itemList;

    public SellerCustomListAdapter(Context context, List<SellerListItems> itemList) {
        super(context, 0, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_custom, parent, false);
        }

        ImageView imgSeller = convertView.findViewById(R.id.imgSeller);
        TextView txtSellerName = convertView.findViewById(R.id.txtSupplierName);
        TextView txtSellerCompanyName = convertView.findViewById(R.id.txtCompanyName);
        TextView txtBusinessName = convertView.findViewById(R.id.txtBusiness);
        TextView txtLocation = convertView.findViewById(R.id.txtLocation);
        TextView txtIndustry = convertView.findViewById(R.id.txtIndustry);

        SellerListItems item = itemList.get(position);

        imgSeller.setImageResource(R.drawable.sample_person);
        txtSellerName.setText(item.getSellerName());
        txtSellerCompanyName.setText(item.getSellerCompanyName());
        txtBusinessName.setText(item.getBusinessName());
        txtLocation.setText(item.getLocation());
        txtIndustry.setText(item.getIndustry());
        setupProductList(convertView);

        return convertView;
    }

    private void setupProductList(View convertView) {
        LinearLayout ll_product_item = convertView.findViewById(R.id.ll_product_item);
        ArrayList<ImageItem> mProductList = new ArrayList<>();
        mProductList.add(new ImageItem("https://picsum.photos/id/1/200/300"));
        mProductList.add(new ImageItem("https://picsum.photos/id/2/200/300"));
        mProductList.add(new ImageItem("https://picsum.photos/id/3/200/300"));
        mProductList.add(new ImageItem("https://picsum.photos/id/4/200/300"));
        mProductList.add(new ImageItem("https://picsum.photos/id/5/200/300"));

        for (int i = 0; i < mProductList.size(); i++) {

            LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            View sub_view = LayoutInflater.from(context).inflate(R.layout.product_list_items, null, false);
            lparams.setMargins(20, 0, 20, 0);
            sub_view.setLayoutParams(lparams);

            ImageView iv_home_cat = (ImageView) sub_view.findViewById(R.id.iv_home_cat);
            Glide.with(context).load(mProductList.get(i).getImageUrl()).apply(new RequestOptions().placeholder(R.drawable.banner_placeholder)).into(iv_home_cat);

//            sub_view.setTag(mProductList.get(i).getName());
//            homeCatHashMap.put(mHomeCategoriesList.get(i).getName(), mHomeCategoriesList.get(i));
//            sub_view.setOnClickListener(clickListener);
            ll_product_item.addView(sub_view);

        }
    }
}
