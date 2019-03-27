package com.example.base.visibility.firstpackage;

/**
 * @author wubinyu
 * @date 2019/3/27 11:53.
 */
public class PublicClass2 {


    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.packageMethod();
        publicClass.protectedMethod();
        publicClass.publicMethod();

    }
}
