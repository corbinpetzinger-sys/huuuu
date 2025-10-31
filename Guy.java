package com.HUUUU;

public class Guy extends SignInSheet {
    

private String Job;

private int Age;

public Guy(int Age, String Job, int Time,  String Name){

    super(Name,Time);
    this.Age = Age;
    this.Job = Job;


}
public void Info(){

    System.out.println("Welcome to the attendence " + Name +" we are happpy you have come to our doors at " + Time + "you are very cool for being a " + Job + "at " + Age);
}

}


