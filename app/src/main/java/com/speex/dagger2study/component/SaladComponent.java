package com.speex.dagger2study.component;

import com.speex.dagger2study.bean.Banana;
import com.speex.dagger2study.bean.Pear;
import com.speex.dagger2study.bean.SaladSauce;
import com.speex.dagger2study.module.SaladModule;
import com.speex.dagger2study.salad.Salad;
import com.speex.dagger2study.salad.Salad2;

import dagger.Component;


//指明要在那些Module里寻找依赖
@Component(modules = {SaladModule.class})
public interface SaladComponent {

    //注意：下面这三个方法，返回值必须是从上面指定的依赖库SaladModule.class中取得的对象
    //注意：而方法名不一致也行，但是方便阅读，建议一致，因为它主要是根据返回值类型来找依赖的
    //★注意：下面这三个方法也可以不写，但是如果要写，就按照这个格式来
    //但是当Component要被别的Component依赖时，
    //这里就必须写这个方法，不写代表不向别的Component暴露此依赖

    Pear providePear();

    Banana provideBanana();

    SaladSauce provideSaladSauce();

    //注意：下面的这个方法，表示要将以上的三个依赖注入到某个类中
    //这里我们把上面的三个依赖注入到Salad中
    //因为我们要做沙拉
    void inject(Salad2 salad);

}
