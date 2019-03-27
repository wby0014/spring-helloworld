package com.example.base.visibility.secondpackage;


/**
 * @author wubinyu
 * @date 2019/3/27 11:56.
 */
public class SubClass2 extends PackageClass {

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    public void publicMethod1() {
        super.publicMethod1();
    }

    @Override
    protected void protectedMethod1() {
        super.protectedMethod1();
    }

    @Override
    void packageMethod1() {
        super.packageMethod1();
    }
}
