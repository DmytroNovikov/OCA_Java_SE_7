 

public class HelloWorld {

    public static void main(String args[]){
	System.out.print("\nHello");
	if(args.length > 0)
	    for(int i = 0; i < args.length; i++)
		System.out.print(", " + args[i]);
	else
	    System.out.print(", World");
	System.out.print("!");
    }

}