package com.corebaseit;

/**
 * Created by vincentbevia on 11/10/16.
 */
public class AnotherView implements CallBack.CallbackMethod {

    public void callThePresenter() {
        Presenter p = new Presenter();
        CallBack.CallbackMethod view = new AnotherView();
       /*  CallBack.CallbackMethod anotherView = new AnotherView();*/

        //the calling method....
        p.register(view);
        /*p.register(anotherView);*/

    }

    @Override
    public void methodToCallBack(String name, String lastName, int age) {

        System.out.println("From Another view... my name is " + name + " my last name is " + lastName + " and I'm " + age);

    }

}
