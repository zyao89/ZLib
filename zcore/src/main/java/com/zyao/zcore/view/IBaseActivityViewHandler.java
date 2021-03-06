package com.zyao.zcore.view;

import android.support.annotation.LayoutRes;

/**
 * Interface: IBaseActivityLifeViewHandler
 * Description: Activity公共View基础接口类
 * Author: Zyao89
 * Time: 2016/7/30 13:44
 */
public interface IBaseActivityViewHandler extends IBaseRootViewHandler
{
    /**
     * 获取主Activity的Layout布局id
     *
     * @return ResourceId
     */
    @LayoutRes
    int getResourceId ();
}
