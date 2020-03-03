package Com.Maven.CustomList;
import java.util.Scanner;
import java.util.Arrays;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	CustomList1 list=new CustomList1();
    	boolean bool=true;
    	while(bool) {
        System.out.println("Choose option which operation is going to perform on list");
        System.out.println("1.add\n2.fetch\n3.print\n4.delete");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:list.add();
               break;
        case 2:list.fetch();
               break;
        case 3:list.print();
               break;
        case 4:list.remove();
               break;
        default:bool=false;
                break;
        }
     
        }
        
    }
}
