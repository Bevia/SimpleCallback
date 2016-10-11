package com.corebaseit;

public class View implements CallBack.CallbackMethod {

    //Consider this main static function like your onCreate() or onActivityCreate()....
    public static void main(String[] args) {

        Presenter p = new Presenter();
        CallBack.CallbackMethod view = new View();
        //the calling method....
        p.register(view);

        //Let this other class call the presenter too....
        //This will be like an onCreate() or onActivityCreate(), etc...
        new AnotherView().callThePresenter();
    }

    //the called method....
    @Override
    public void methodToCallBack(String name, String lastName, int age) {
        System.out.println("From the main view...my name is " + name + " my last name is " + lastName + " and I'm " + age);
    }
}