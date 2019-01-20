// While overriding we can't reduce scope of modifiers; but we can increase the scope
class P 
{
    public void m1()
    {
        System.out.println("Kuntan");
    }
}
class C extends P
{
    void m1()
    {
        System.out.println("Prasad");
    }
}
