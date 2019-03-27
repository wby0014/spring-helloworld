package com.example.base.visibility.secondpackage;

import com.example.base.visibility.firstpackage.PublicClass;

/**
 * @author wubinyu
 * @date 2019/3/27 11:49.
 */
class PackageClass extends PublicClass {


    public void publicMethod1() {

    }

    private void privateMethod1() {

    }

    protected void protectedMethod1() {

    }

    void packageMethod1() {

    }


    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();
    }
}
