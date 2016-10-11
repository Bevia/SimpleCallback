package com.corebaseit;

/**
 * Created by vincentbevia on 11/10/16.
 */
public class Presenter {

    Model m = new Model();

    //Call the implementation's method:
    public void register(CallBack.CallbackMethod callBack) {

        //Imagine this data set is coming from a web service!!
        //set it:
        m.setLastName("Bevia");
        m.setName("Vincent");
        m.setAge(34);

        //Get it, formatted and send it to method for display!!!
        callBack.methodToCallBack(m.getName(), m.getLastName(), m.getAge());
    }
}
