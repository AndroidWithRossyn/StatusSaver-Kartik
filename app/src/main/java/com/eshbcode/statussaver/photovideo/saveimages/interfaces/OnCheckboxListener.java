package com.eshbcode.statussaver.photovideo.saveimages.interfaces;

import android.view.View;

import com.eshbcode.statussaver.photovideo.saveimages.Models.StatusModel;

import java.util.List;

public interface OnCheckboxListener {
    void onCheckboxListener(View view, List<StatusModel> list);
}
