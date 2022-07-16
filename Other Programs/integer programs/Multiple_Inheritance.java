class Parents
{
    int height=54;
    int weight;       // it has a zero value by default when it not gets initialized by any value.
    void setheight(int h)
    {
        height=h;
        System.out.println("height of person from parents class is: "+height);
    }
    final void setweight(int w)
    {
        weight=w;
        System.out.println("weight of a person from parents class is: "+weight);
    }
}
class Child extends Parents
{
    void setheight(int h)
    {
        height=h;
        System.out.println("height of person from child class is: "+height+" and weight is: ");
    }
    int dob,age;
    void setdob(int d)
    {
        dob=d;
        System.out.println("dob from child class is: "+dob);
    }
    void setage(int a)
    {
        age=a;
        System.out.println("the age from child class is: "+age);
    }
}

public class Multiple_Inheritance extends Child
{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.setheight(14);
    }

}
