package com.biz;

import com.bean.Product;

import java.util.HashMap;

public interface ProductBiz  {
    public boolean save(Product pd);
    public boolean update(Product pd);
    public boolean delById(Integer pid);
    public Product findById(Integer pid);
    public HashMap<Integer,Product> findAll();

}
