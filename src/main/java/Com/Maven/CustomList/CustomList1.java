package Com.Maven.CustomList;
import java.util.Scanner;
public class CustomList1 {
	   Scanner sc=new Scanner(System.in);
	   Node head;
	   private static final int Default_Capacity=5;
	   int size=5;
       CustomList1()
       {
    	   head=null;
    	   System.out.println("Enter 5 values Default");
    	   int xx=sc.nextInt();
    	   Node yy=new Node(xx);
    	   head=yy;
    	   Node z=head;
    	   for(int i=0;i<Default_Capacity-1;i++)
    	   {
    		   int x=sc.nextInt();
    		   Node y=new Node(x);
    		   z.next=y;
    		   z=z.next;
    	   }
    	   
       }
       public void add()
       {
    	   System.out.println("Enter element to insert");
    	   int x=sc.nextInt();
    	   Node y=new Node(x);
    	   if(head==null)
    	   {
    		   head=y;
    		   size++;
    	   }
    	   else
    	   {
    		   System.out.println("Enter where we want to insert\n1.At start\n2.At end\n3.At specified position\n4.Before specified element\n5.After specified element");
    		   int choice=sc.nextInt();
    		   switch(choice)
    		   {
    		   case 1:y.next=head;
    		          head=y;
    		          size++;
    		          break;
    		   case 2:Node z=head;
    		          while(z.next!=null)
    		          {
    		        	  z=z.next;
    		          }
    		          z.next=y;
    		          size++;
    		          break;
    		   case 3:System.out.println("Enter specified position");
    		          int zz=sc.nextInt();
    		          if(size<zz)
    		          {
    		        	  System.out.println("Enter position in this limit only"+1+"to"+size);
    		          }
    		          else
    		          {
    		        	  int xx=1;
    		        	  z=head;
    		        	  while(xx!=zz-1)
    		        	  {
    		        		  z=z.next;
    		        		  xx++;
    		        	  }
    		        	  y.next=z.next;
    		        	  z.next=y;
    		        	  size++;
    		          }
    		          break;
    		   case 4:System.out.println("Enter after which element we insert");
    		          zz=sc.nextInt();
    		          z=head;
    		          while(z.data!=zz && z.next!=null)
    		          {
    		        	  z=z.next;
    		          }
    		          if(z.data==zz && z.next==null)
    		          {
        		          z.next=y;
        		          size++;
    		          }
    		          else if(z.data==zz && z.next!=null)
    		          {
    		        	  y.next=z.next;
    		        	  z.next=y;
    		        	  size++;
    		          }
    		          else
    		          {
                           System.out.println("Entered number is not present");
    		          }
    		          break;
    		   case 5:System.out.println("Enter before which element we insert");
		              zz=sc.nextInt();
    			      if(head.data==zz)
    			      {
    			    	  y.next=head;
    			    	  head=y;
    			    	  size++;
    			      }
    			      else
    			      {
    			    	  z=head;
    			    	  while(z.next.data!=zz && z.next.next!=null)
    			    	  {
    			    		  z=z.next;
    			    	  }
    			    	  if(z.next.data==zz)
    			    	  {
    			    		  y.next=z.next;
    			    		  z.next=y;
    			    		  size++;
    			    	  }
    			      }
    			      break;
    			default:return;
    		          
    		   }
    	   }
       }
       public void print()
       {
    	   Node z=head;
    	   while(z.next!=null)
    	   {
    		   System.out.println(z.data);
    		   z=z.next;
    	   }
    	   System.out.println(z.data);
       }
       public void fetch()
       {
    	   System.out.println("Which index element you want to fetch");
    	   int x=sc.nextInt();
    	   if(size<x)
	       {
	           System.out.println("Enter position in this limit only"+1+"to"+size);
	       }
    	   else
    	   {
    		   int xx=1;
	           Node z=head;
	           while(xx!=x)
	           {
	        	 z=z.next;
	        	 xx++;
	           }
	           System.out.println(z.data);
    	   }
       }
       public void remove()
       {
    	   System.out.println("Enter in which position you want to remove");
    	   System.out.println("1.At start\n2.At end\n3.At specified index");
    	   int choice=sc.nextInt();
    	   switch(choice)
    	   {
    	   case 1:head=head.next;
    	          size--;
    	          break;
    	   case 2:Node z=head;
    	          while(z.next.next!=null)
    	          {
    	        	  z=z.next;
    	          }
    	          z.next=null;
    	          size--;
    	          break;
    	   case 3:System.out.println("Enter which index you want to remove");
    	          int x=sc.nextInt();
    	          if(x==1 || size<x)
    	          {
    	        	  System.out.println("Enter index in range 2 to"+(size-1));
    	          }
    	          else
    	          {
    	        	  int xx=1;
		        	  z=head;
		        	  while(xx!=x-1)
		        	  {
		        		  z=z.next;
		        		  xx++;
		        	  }
		        	  z.next=z.next.next;
		        	  size--;
    	          }
    	          break;
    	    default:return;
    		   
    	   }
    	   
       }
       
       
}
