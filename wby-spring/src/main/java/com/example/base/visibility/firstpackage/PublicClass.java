package com.example.base.visibility.firstpackage;


/**
 * @author wubinyu
 * @date 2019/3/27 11:48.
 */
public class PublicClass {


    public void publicMethod() {

    }

    private void privateMethod() {

    }

    protected void protectedMethod() {

    }

    void packageMethod() {

    }


    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.privateMethod();
    }
}
