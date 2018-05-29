/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.project.zaixianjiaoyu.model;

import com.baidu.ocr.sdk.model.ResponseResult;

import java.util.ArrayList;
import java.util.List;

public class OnlineFaceliveResult extends ResponseResult {

    private List<Double> facelivenessValue = new ArrayList<>();

    public List<Double> getFacelivenessValue() {
        return facelivenessValue;
    }

    public void setFacelivenessValue(List<Double> facelivenessValue) {
        this.facelivenessValue = facelivenessValue;
    }
}
