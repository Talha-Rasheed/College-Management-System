
package collegetest;


public class Student extends College{
    private String department;
    private int classs;
    private int rollnum;
    private int fee;
    public Student(String name,String department,int classs,int rollnum)
    {
        super(name);
        this.department=department;
        if(classs==11 || classs==12)
        {
            this.classs=classs;
        }
        else
        {
            throw new IllegalArgumentException("Wrong Input of Class");
        }
        this.rollnum=rollnum;
    }
    @Override
    public int money()
    {
        if(classs==11 || classs==12)
        {
            this.classs=classs;
            if(classs==11)
            {
                this.fee=5700;
            }
            else if(classs==12)
            {
                this.fee=6500;
            }
        }
        return fee;
    }
    public void setdepartment(String department)
    {
        this.department=department;
    }
    public String getdepartment()
    {
        return department;
    }
    public void setclasss(int classs)
    {
        this.classs=classs;
    }
    public int getclasss()
    {
        return classs;
    }
    public void setrollnum(int rollnum)
    {
        this.rollnum=rollnum;
    }
    public int getrollnum()
    {
        return rollnum;
    }
    public void setfee(int fee)
    {
        this.fee=fee;
    }
    public int getfee()
    {
        return fee;
    }
    @Override
    public String toString()
    {
        return String.format("%s , Depatment : %s , Class : %s , Roll Number : %d , Fee : %d",super.toString(),getdepartment(),getclasss(),getrollnum(),money());
    }
}
