package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Caojiehang on 2018-03-18.
 */

public class City extends DataSupport {
    private int id;
    private String cityCode;
    private int provinceId;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}
