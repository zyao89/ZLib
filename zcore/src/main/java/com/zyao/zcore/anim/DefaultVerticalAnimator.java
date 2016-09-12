package com.zyao.zcore.anim;

import android.os.Parcel;
import android.os.Parcelable;

import com.zyao.zcore.R;

/**
 * Created by Zyao89 on 16/2/5.
 */
public class DefaultVerticalAnimator extends FragmentAnimator implements Parcelable
{

    public static final Creator<DefaultVerticalAnimator> CREATOR = new Creator<DefaultVerticalAnimator>()
    {
        @Override
        public DefaultVerticalAnimator createFromParcel (Parcel in)
        {
            return new DefaultVerticalAnimator(in);
        }

        @Override
        public DefaultVerticalAnimator[] newArray (int size)
        {
            return new DefaultVerticalAnimator[size];
        }
    };

    public DefaultVerticalAnimator ()
    {
        enter = R.anim.v_fragment_enter;
        exit = R.anim.v_fragment_exit;
        popEnter = R.anim.v_fragment_pop_enter;
        popExit = R.anim.v_fragment_pop_exit;
    }

    protected DefaultVerticalAnimator (Parcel in)
    {
        super(in);
    }

    @Override
    public int describeContents ()
    {
        return 0;
    }

    @Override
    public void writeToParcel (Parcel dest, int flags)
    {
        super.writeToParcel(dest, flags);
    }
}
