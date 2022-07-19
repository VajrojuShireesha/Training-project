
public class Members {
	public String MemberName;
    public String status;
    public Members(String MemberName, String status) {
    	this.MemberName=MemberName;
    	this.status=status;
    }
    
	public void getMemberName() {
    	System.out.println("MemberName: "+MemberName);
    }
    public void getstatus() {
    	System.out.println("status of the book: "+status);
    }
    public void setMemberName(String MemberName)
    {
    	
    	this.MemberName=MemberName;
    }
    public void setstatus(String status)

    {

       this.status=status;

    }
    public void show()

    {

        getMemberName();

        getstatus();

   }    

}
	