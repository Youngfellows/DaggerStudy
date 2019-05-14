package com.speex.dagger2study.module;

import com.speex.dagger2study.bean.Banana;
import com.speex.dagger2study.bean.Pear;
import com.speex.dagger2study.bean.SaladSauce;

import dagger.Module;
import dagger.Provides;

/**
 * Module管理所有的依赖
 * 就好比：你要做一个沙拉，需要（依赖）Pear/Banana/SaladSauce
 * 这里就把Pear/Banana/SaladSauce这三个被依赖的类管理起来
 * 方便你在之后获取Pear/Banana/SaladSauce的对象
 */
@Module
public class SaladModule {

    // 按照格式写就好了，
    // 返回值（被依赖的类类型）
    // 方法名（provideXxx必须以provide开头，后面随意）
    @Provides
    public Pear providePear() {
        return new Pear();//返回这个类的对象
    }

    @Provides
    public Banana provideBanana() {
        return new Banana();
    }

    @Provides
    public SaladSauce provideSaladSauce() {
        return new SaladSauce();
    }
}
