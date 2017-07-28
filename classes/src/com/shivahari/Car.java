package com.shivahari;

/**
 * Created by harikannareddy on 6/24/17.
 */
public class Car {//Public: means unrestricted access to the class

    //states of a car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model)
    {
        String validate = model.toLowerCase();
        if(validate.equals("carrera")||validate.equals("honda")){
            this.model = model;

        }
        else{
            this.model="unknown model";
        }


    }
    public String getModel(){

        return this.model;
    }



}
