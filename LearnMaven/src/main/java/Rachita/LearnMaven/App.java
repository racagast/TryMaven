package Rachita.LearnMaven;

/**
 * Hello world!
 *
 */
public class App 
{
	public String appStr;
	
	public void setAppStr(String inputStr) 
	{
		this.appStr = inputStr;
	}
	
	public String getAppStr()
	{
		return this.appStr;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a = new App();
        a.setAppStr("Good Evening");
        System.out.println("The string was set to "+a.getAppStr());
    }
}
