
package collegetest;

public class Faculty extends College{
    private int noofclasses;
    private int salary;
    private String facultytype;
    public Faculty(String name,int noofclasses,String facultytype)
    {
        super(name);
        if(noofclasses>=1&&noofclasses<=6)
        {
            this.noofclasses=noofclasses;
        }
        else
        {
            throw new IllegalArgumentException("Wrong No of Classes");
        }
        this.facultytype=facultytype;
        if("Teacher".equals(facultytype))
        {
            if(noofclasses>=4&&noofclasses<=6)
            {
                this.salary=50000;
            }
            if(noofclasses>=1&&noofclasses<4)
            {
                this.salary=35000;
            }
        }
        if("HOD".equals(facultytype))
        {
            this.noofclasses=0;
            this.salary=65000;
        }
    }
    @Override
    public int money()
    {
        this.facultytype=facultytype;
        if("Teacher".equals(facultytype))
        {
            if(noofclasses>=4&&noofclasses<=6)
            {
                this.salary=50000;
            }
            if(noofclasses>=1&&noofclasses<4)
            {
                this.salary=35000;
            }
        }
        if("HOD".equals(facultytype))
        {
            this.salary=65000;
        }
        return salary;
    }
    public void setnoofclasses(int noofclasses)
    {
        this.noofclasses=noofclasses;
    }
    public int getnoofclasses()
    {
        return noofclasses;
    }
    public void setsalary(int salary)
    {
        this.salary=salary;
    }
    public int getsalary()
    {
        return salary;
    }
    public void setfacultytype(String facultytype)
    {
        this.facultytype=facultytype;
    }
    public String getfacultytype()
    {
        return facultytype;
    }
    @Override
    public String toString()
    {
        return String.format("%s , Faculty Type : %s , No Of Classes : %d , Salary : %d",super.toString(),getfacultytype(),getnoofclasses(),money());
    }
}
