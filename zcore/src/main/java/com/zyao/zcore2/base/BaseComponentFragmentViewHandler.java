/**
 * Title: BaseComponentActivityViewHandler.java
 * Package: com.zyao.zcore2.base
 * Description: 本内容来源于Zyao89。
 * Author: Zyao89
 * Date: 2016/9/17
 */
package com.zyao.zcore2.base;

import android.app.Activity;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

/**
 * Class: BaseComponentFragmentViewHandler
 * Description: Fragment的ViewHandler基类
 * Author: Zyao89
 * Time: 2016/9/17 14:00
 */
public abstract class BaseComponentFragmentViewHandler<RootViewType extends View> extends BaseViewHandler<RootViewType> implements IBaseFragmentLifeViewHandler
{
    @Override
    protected void initViews ()
    {
        //do @BindView()
    }

    @Override
    public void onAttach (Activity activity)
    {
        mBaseViewHandlerFactory.onAttach(activity);
    }

    @Override
    public void onActivityCreated ()
    {
        mBaseViewHandlerFactory.onActivityCreated();
    }

    @Override
    public void onDestroyView ()
    {
        mBaseViewHandlerFactory.onDestroyView();
    }

    /**
     * 白天夜间切换
     *
     * @param isNight true-夜，false-白
     */
    protected void setDayNightMode (boolean isNight)
    {
        if (getContext() instanceof BaseComponentActivity)
        {
            ((BaseComponentActivity) getContext()).setDayNightMode(isNight);
        }
    }

    /**
     * 是否为夜晚模式
     *
     * @return true-Y, false-N
     */
    protected boolean isNightMode ()
    {
        int defaultNightMode = AppCompatDelegate.getDefaultNightMode();
        return defaultNightMode == AppCompatDelegate.MODE_NIGHT_YES;
    }
}
