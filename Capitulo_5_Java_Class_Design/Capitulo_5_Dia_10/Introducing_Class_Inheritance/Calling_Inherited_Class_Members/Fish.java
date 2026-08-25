package Introducing_Class_Inheritance.Calling_Inherited_Class_Members;

public class Fish {

}

class Fish1{
    protected int size;
    private int age;

    public Fish1(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}