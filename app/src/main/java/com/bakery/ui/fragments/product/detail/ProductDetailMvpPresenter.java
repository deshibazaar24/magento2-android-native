package com.bakery.ui.fragments.product.detail;

import com.bakery.data.network.models.ProductResponse;
import com.bakery.presenter.MvpPresenter;
import com.bakery.presenter.MvpView;

import java.util.List;

public interface ProductDetailMvpPresenter <V extends MvpView> extends MvpPresenter<V> {

    void setViewValue(ProductResponse mProductDetail);

    void getProductRelatedLinks(List<ProductResponse.ProductLink> productLinks);

    void increaseQuantity(String quantity);

    void decreaseQuantity(String quantity);

    void addCart(String quantity, String sku);
}
