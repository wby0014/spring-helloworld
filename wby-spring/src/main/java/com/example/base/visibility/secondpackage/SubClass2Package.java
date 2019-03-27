package com.example.base.visibility.secondpackage;

import com.example.base.visibility.firstpackage.PublicClass;

/**
 * @author wubinyu
 * @date 2019/3/27 12:00.
 */
public class SubClass2Package extends PublicClass {

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }
}
