package com.nrj.android_list_view;

import java.util.List;

public class SellerListItems {
    private String sellerName;
    private String sellerCompanyName;
    private List<ImageItem> productList;
    private String businessName;
    private String location;
    private String industry;

    public SellerListItems(String sellerName, String sellerCompanyName, String businessName, String location, String industry) {
        this.sellerName = sellerName;
        this.sellerCompanyName = sellerCompanyName;
        this.businessName = businessName;
        this.location = location;
        this.industry = industry;
    }

    private String sellerImage;

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerCompanyName() {
        return sellerCompanyName;
    }

    public void setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
    }

    public List<ImageItem> getProductList() {
        return productList;
    }

    public void setProductList(List<ImageItem> productList) {
        this.productList = productList;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSellerImage() {
        return sellerImage;
    }

    public void setSellerImage(String sellerImage) {
        this.sellerImage = sellerImage;
    }
}
