package com.gamebox_idtkown.engin;

import android.content.Context;

import com.gamebox_idtkown.net.entry.Response;
import com.gamebox_idtkown.net.impls.OKHttpRequest;
import com.gamebox_idtkown.utils.LogUtil;

import java.io.IOException;

/**
 * Created by zhangkai on 2017/7/8.
 */

public class DownloadEngin {

    public void down(String url) {
        try {
            Response response = OKHttpRequest.getImpl().get(url);
            LogUtil.msg("down->" + response);

            if (response != null) {
                LogUtil.msg("down->" + response.code + "" + response.body);
            }
        } catch (IOException e) {
            e.printStackTrace();
            LogUtil.msg("down->" + e);
        }
    }


}
