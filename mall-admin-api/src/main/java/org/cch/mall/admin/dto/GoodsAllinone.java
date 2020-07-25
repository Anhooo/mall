package org.cch.mall.admin.dto;

import org.cch.mall.db.domain.MallGoods;
import org.cch.mall.db.domain.MallGoodsAttribute;
import org.cch.mall.db.domain.MallGoodsProduct;
import org.cch.mall.db.domain.MallGoodsSpecification;

public class GoodsAllinone {
    MallGoods goods;
    MallGoodsSpecification[] specifications;
    MallGoodsAttribute[] attributes;
    MallGoodsProduct[] products;

    public MallGoods getGoods() {
        return goods;
    }

    public void setGoods(MallGoods goods) {
        this.goods = goods;
    }

    public MallGoodsProduct[] getProducts() {
        return products;
    }

    public void setProducts(MallGoodsProduct[] products) {
        this.products = products;
    }

    public MallGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(MallGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public MallGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(MallGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
