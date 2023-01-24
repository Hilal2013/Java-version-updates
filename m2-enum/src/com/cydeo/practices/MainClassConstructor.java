package com.cydeo.practices;

enum Levels
{
    TOP, MEDIEUM(10), BOTTOM(20, 30);
     
    int i, j;
     
    private Levels()
    {
         
    }
     
    private Levels(int i)
    {
        this.i = i;
    }
     
    private Levels(int i, int j)
    {
        this.i = i;
         
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
 
public class MainClassConstructor
{
    public static void main(String[] args)
    {
        System.out.println(Levels.TOP.i);//0
         
        System.out.println(Levels.TOP.j);//0
         
        System.out.println(Levels.MEDIEUM.i);//10
         
        System.out.println(Levels.MEDIEUM.j);//0
         
        System.out.println(Levels.BOTTOM.i);//20
        System.out.println(Levels.BOTTOM.getI());//20
         
        System.out.println(Levels.BOTTOM.j);//30
        System.out.println(Levels.BOTTOM.getJ());//30
    }
}