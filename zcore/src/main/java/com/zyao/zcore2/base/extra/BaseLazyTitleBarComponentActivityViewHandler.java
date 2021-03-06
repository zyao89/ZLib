package com.zyao.zcore2.base.extra;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.zyao.zcore.R;

/**
 * Class: BaseDrawerLayoutComponentActivityViewHandler
 * Description: 带标题的懒人模式
 * Author: Zyao89
 * Time: 2016/9/23 18:47
 */
public abstract class BaseLazyTitleBarComponentActivityViewHandler extends BaseTitleBarComponentActivityViewHandler<LinearLayout>
{
    private FrameLayout mContentsFrameLayout;

    @Override
    public final int getResourceId()
    {
        return R.layout.z_lazy_design_title_layout;
    }

    /** 添加View时调用 */
    protected abstract void initContentView ();

    @Override
    protected void initViews ()
    {
        super.initViews();
        initDesignContentsLayout();
    }

    private void initDesignContentsLayout ()
    {
        View view = findViewById(R.id.z_lazy_design_contents_layout);
        if (view == null)
        {
            return;
        }
        if (view instanceof FrameLayout)
        {
            mContentsFrameLayout = (FrameLayout) view;
        }
        if (mContentsFrameLayout == null)
        {
            throw new RuntimeException("mContentsFrameLayout is null...");
        }
        initContentView();
    }

    private boolean isContentsFrameLayoutExist ()
    {
        return mContentsFrameLayout != null;
    }

    protected void setContentView (@LayoutRes int layoutResID)
    {
        if (isContentsFrameLayoutExist())
        {
            mContentsFrameLayout.removeAllViews();
            View.inflate(mContext, layoutResID, mContentsFrameLayout);
        }
    }

    protected void setContentView (View view)
    {
        if (isContentsFrameLayoutExist())
        {
            mContentsFrameLayout.removeAllViews();
            mContentsFrameLayout.addView(view);
        }
    }

    protected void setContentView (View view, ViewGroup.LayoutParams params)
    {
        if (isContentsFrameLayoutExist())
        {
            mContentsFrameLayout.removeAllViews();
            mContentsFrameLayout.addView(view, params);
        }
    }
}
