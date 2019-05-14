package com.speex.dagger2study.salad;

import android.util.Log;

import com.speex.dagger2study.bean.Banana;
import com.speex.dagger2study.bean.Pear;
import com.speex.dagger2study.bean.SaladSauce;
import com.speex.dagger2study.component.DaggerSaladComponent;
import com.speex.dagger2study.component.SaladComponent;

import javax.inject.Inject;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2019/5/14 23:58
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class Salad2 {
    private String TAG = this.getClass().getSimpleName();

    //表示注入这个依赖
    @Inject
    Banana mBanana;

    @Inject
    Pear mPear;

    @Inject
    SaladSauce mSaladSauce;

    public Salad2() {

        //注入生成的三个对象
        // DaggerSaladComponent编译时才会产生这个类，
        // 所以编译前这里报错不要着急（或者现在你先build一下）
        SaladComponent saladComponent = DaggerSaladComponent.create();
        saladComponent.inject(this);

        //调用方法
        makeSalad(mPear, mBanana, mSaladSauce);
    }

    private void makeSalad(Pear pear, Banana banana, SaladSauce saladSauce) {
        Log.i(TAG, "我在搅拌制作水果沙拉");
    }
}
