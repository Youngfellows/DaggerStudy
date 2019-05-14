package com.speex.dagger2study.salad;

import android.util.Log;

import com.speex.dagger2study.bean.Banana;
import com.speex.dagger2study.bean.Pear;
import com.speex.dagger2study.bean.SaladSauce;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2019/5/14 23:31
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class Salad {
    private String TAG = this.getClass().getSimpleName();
    private Banana mBanana;
    private Pear mPear;
    private SaladSauce mSaladSauce;

    public Salad() {
        //这里new了三个水果对象（依赖）
        mBanana = new Banana();
        mPear = new Pear();
        mSaladSauce = new SaladSauce();
    }

    private void makeSalad(Pear pear, Banana banana, SaladSauce saladSauce) {
        Log.i(TAG, "我在搅拌制作水果沙拉");
    }
}
