package com.example.base.visibility.firstpackage;

/**
 * @author wubinyu
 * @date 2019/3/27 11:55.
 */
public class subClass extends PublicClass {

    @Override
    public void publicMethod() {
        super.publicMethod();
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    @Override
    void packageMethod() {
        super.packageMethod();
    }
}
