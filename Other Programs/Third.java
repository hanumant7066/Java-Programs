class Parentclass
{
    public void parentmethod()
    {
        System.out.println("parent class medthod");
    }
}
class Third extends Parentclass
{
    public void parentmethod()
    {
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        Parentclass obj=new Third();
        obj.parentmethod();
    }
}