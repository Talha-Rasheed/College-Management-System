
package collegetest;

import College2.ABS;

public class College extends ABS{
    private String name;
    public College(String name)
    {
        this.name=name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    
    @Override
    public String toString()
    {
        return String.format("Name is : %s",name);
    }

    @Override
    public int money()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
