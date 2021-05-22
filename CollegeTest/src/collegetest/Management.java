
package collegetest;

public class Management extends College{
    private String type;
    private int hours;
    private int pay;
    public Management(String name,String type,int hours)
    {
        super(name);
        this.type=type;
        if("Accounts".equals(type))
        {
            this.hours=hours;
//            if(hours>=1)
//            {
//                if(hours<=6)
//                {
//                    this.pay=13000;
//                }
//                else if(hours>6 && hours<=10)
//                {
//                    this.pay=18000;
//                }
//            }
//            else
//            {
//                throw new IllegalArgumentException("Wrong No of Hours");
//            }
        }
        if("Seminar Organizer".equals(type))//not used
        {
            this.pay=23500;
        }
    }
    @Override
    public int money()
    {
        if("Accounts".equals(type))
        {
            if(hours>=1)
            {
                if(hours<=6)
                {
                    this.pay=13000;
                }
                else if(hours>6 && hours<=10)
                {
                    this.pay=18000;
                }
            }
            else
            {
                throw new IllegalArgumentException("Wrong No of Hours");
            }
        }
        if("Seminar".equals(type))
        {
            this.pay=23500;
        }
        return pay;
    }
    public void settype(String type)
    {
        this.type=type;
    }
    public String gettype()
    {
        return type;
    }
    public void sethous(int hours)
    {
        this.hours=hours;
    }
    public int gethours()
    {
        return hours;
    }
    public void setpay(int pay)
    {
        this.pay=pay;
    }
    public int getpay()
    {
        return pay;
    }
    @Override
    public String toString()
    {
        return String.format("%s , Management Type : %s , No of Hours : %d , Pay : %d",super.toString(),gettype(),gethours(),money());        
    }
}
