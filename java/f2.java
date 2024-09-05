import java.util.*;
public class f2
{
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
    int pno[]=new int[10];
    String name[]=new String[150];
    String phno[]=new String[100];
	String tl[]=new String[100];
    int age[]=new int[100];
    int cl[]=new int[100];
    int pcount=0;
    int pnum=1;
    int max1=100;
    int max2=100;
    int max3=100;
	int max4=100;
	int max5=100;
	int t;
	int b;
    public static void main(String args[])
    {
		f2 ob=new f2();
		ob.Menu();
	}
	private void Heading()
    {
		System.out.println("\t\t\t\t\t\t\t      RAILWAY RESERVATION");
    }
		public void Menu()
		{
			int z=0;
			for(;;)
			{
				Heading();
				
				System.out.println("\t\t\t\t\t\t\t------------------------------");
				System.out.println("\t\t\t\t\t\t\t|  1.Book Ticket             |");
				System.out.println("\t\t\t\t\t\t\t|  2.Cancel Ticket           |");
				System.out.println("\t\t\t\t\t\t\t|  3.Search Passenger        |");
				System.out.println("\t\t\t\t\t\t\t|  4.Reservation Chart       |");
				System.out.println("\t\t\t\t\t\t\t|  5.Display Unbooked Tickets|");
				System.out.println("\t\t\t\t\t\t\t|  6.Exit                    |");
				System.out.println("\t\t\t\t\t\t\t------------------------------");
				System.out.print("Enter your choice : ");
				z=sc.nextInt();
				switch(z)
				{
					case 1:Book();
					break;
					case 2:Cancel();
					break;
					case 3:Search();
					break;
					case 4:DispList();
					break;
					case 5:DispUnbooked();
					break;
					case 6:System.exit(0);
					break;
					default :System.out.println("Invalid choice");
				}		
			}
		}
   
    private void Book()
    {
		System.out.println("\n\t\t\t\t\t\t   1.Ahmedabad - Mumbai");
		System.out.println("\t\t\t\t\t\t\t   2.Ahmedabad - Delhi");
		System.out.println("\t\t\t\t\t\t\t   3.Ahmedabad - Kolkata");
		System.out.println("\t\t\t\t\t\t\t   4.Ahmedabad - Goa");
		System.out.println("\t\t\t\t\t\t\t   5.Ahmedabad - chennai");
		System.out.print("Enter your choice : ");
		int a=sc.nextInt();
		if(a==1 || a==2 || a==3 || a==4 || a==5)
		{
			System.out.println("\t\t\t\t\t\t\t   1.Gatiman Express -------- 9:00 am ----- Rs 2500");
			System.out.println("\t\t\t\t\t\t\t   2.Shatabdi Express ------- 11:30am ----- Rs 2000");
			System.out.println("\t\t\t\t\t\t\t   3.Rajdhani Express ------- 2:00 pm ----- Rs 1500");
			System.out.println("\t\t\t\t\t\t\t   4.Vande Bharat Express --- 4:00 pm ----- Rs 1200");
			System.out.println("\t\t\t\t\t\t\t   5.Duronto Express -------- 9:00 pm ----- Rs 1000\n");
			System.out.print("Enter your choice : ");
			b=sc.nextInt();
		}
		System.out.print("Enter no. of tickets : ");
		t=sc.nextInt();
		int ticketAvailable=0;
		if(b==1 && max1>=t)
		{
			ticketAvailable=1;
		}
		if(b==2 && max2>=t)
		{
			ticketAvailable=1;
		}
		if(b==3 && max3>=t)
		{
			ticketAvailable=1;
		}
		if(b==4 && max4>=t)
		{
			ticketAvailable=1;
		}
		if(b==5 && max5>=t)
		{
			ticketAvailable=1;
		}
		if(ticketAvailable==1)
		{
			cloud:
			for(int i=0;i<t;i++)
			{
				pno[pcount]=pnum;
				System.out.print("Enter your name : ");
				name[pcount]=sc1.nextLine();
					if(name[pcount].matches("[a-zA-Z]+")) 
				 	{
       			 		this.name = name;
   				 	}
   				 	else 
				 	{
        				System.out.println("unknown");
    			 	}
					break cloud;					 
				
				System.out.print("Enter your age : ");
				age[pcount]=sc.nextInt();
				cl[pcount]=b;
					
					if(cl[pcount].matches("[0-9]+")) 
				 	{
       			 		this.age = age;
   				 	}
   				 	else 
				 	{
        				System.out.println("unknown");
    			 	}
					
				System.out.print("Enter your phone number : ");
				phno[pcount]=sc1.nextLine();
				pnum++;
				System.out.println("\nTicket successfully booked\n");
				if(cl[pcount]==1)
				{
					tl[pcount]="Gatiman Express";
				}
				if(cl[pcount]==2)
				{
					tl[pcount]="Shatabdi Express";
				}
				if(cl[pcount]==3)
				{	
					tl[pcount]="Rajdhani Express";
				}
				if(cl[pcount]==4)
				{
					tl[pcount]="Vande Bharat Express";
				}
				if(cl[pcount]==5)
				{
					tl[pcount]="Duronto Express";
				}
				System.out.println("tl =" + tl[pcount]);
				pcount++;
			}
			if(b==1)
			{
				max1-=t;
				System.out.println("Total amount to pay : Rs."+t*2500);
			}
			if(b==2)
			{
				max2-=t;
				System.out.println("Total amount to pay : Rs."+t*2000);
			}
			if(b==3)
			{
				max3-=t;
				System.out.println("Total amount to pay : Rs."+t*1500);
			}
			if(b==4)
			{
				max4-=t;
				System.out.println("Total amount to pay : Rs."+t*1200);
			}
			if(b==5)
			{
				max5-=t;
				System.out.println("Total amount to pay : Rs."+t*1000);
			}
		}
    }
    private void Cancel()
    {
		int t_pno[]=new int[100];
		String t_name[]=new String[100];
		String t_phno[]=new String[100];
		int t_age[]=new int[100];
		int t_cl[]=new int[100];
		int t_pcount=0;
		int	passengerFound=0;
		System.out.print("Please enter your passenger no. : ");
		int p=sc.nextInt();
		for(int i=0;i<pcount;i++)
		{
			if(pno[i]==p)
			{
				passengerFound=1;
				if(cl[i]==1)
				{
					max1++;
					System.out.println("Please collect refund : Rs."+1800);
				}
				if(cl[i]==2)
				{
					max2++;
					System.out.println("Please collect refund : Rs."+1500);
				}
				if(cl[i]==3)
				{
					max3++;
					System.out.println("Please collect refund : Rs."+3000);
				}
				if(cl[i]==4)
				{
					max3++;
					System.out.println("Please collect refund : Rs."+5000);
				}
				if(cl[i]==5)
				{
					max3++;
					System.out.println("Please collect refund : Rs."+6000);
				}	
			}
			else
			{
				t_pno[t_pcount]=pno[i];
				t_name[t_pcount]=name[i];
				t_phno[t_pcount]=phno[i];
				t_age[t_pcount]=age[i];
				t_cl[t_pcount]=cl[i];
				t_pcount++;
			}
			if(t_pcount==pcount)
			{
				System.out.println("No match found!");
			}
		}	
		if(passengerFound==1)
		{
			pno=t_pno;
			name=t_name;
			age=t_age;
			cl=t_cl;
			phno=t_phno;
			pcount=t_pcount;
			System.out.println("Ticket successfully cancelled");
		}
	}
    private void Search()
    {
		int passengerFound=0;
		System.out.print("Enter passenger no. to search : ");
		int p=sc.nextInt();
		for(int i=0;i<pcount;i++)
		{
			if(pno[i]==p)
			{
				System.out.println("\nDetail found");
				passengerFound=1;
				System.out.println("Passenger no. : "+pno[i]);
				System.out.println("Name : "+name[i]);
				System.out.println("Train Name : " + tl[i]);
				System.out.println("Phone Number : "+phno[i]);
				System.out.println("Age : "+age[i]);
			}
		}
		if(passengerFound==0)
		System.out.println("\nNo such passenger");
    }
	private void DispList()
    {
		System.out.println("\nPassenger list in Gatiman Express ");
		System.out.println("Pno \t Name \t\t Age \t Phno \n");
		for(int i=0;i<pcount;i++)
		{
			if(cl[i]==1)
			{
				System.out.println(pno[i] + " \t " + name[i] + " \t " + age[i] + " \t " + phno[i]);
			}
		}
		System.out.println("\nPassenger list in Shatabdi Express");
		System.out.println("Pno \t Name \t\t Age \t Phno\n");
		for(int i=0;i<pcount;i++)
		{
			if(cl[i]==2)
			{
				System.out.println(pno[i] + " \t " + name[i] + " \t " + age[i] + " \t" + phno[i]);
			}
		}
		System.out.println("\nPassenger list in Rajdhani Express");
		System.out.println("pno \t name \t\t age \t phno ");
		for(int i=0;i<pcount;i++)
		{
			if(cl[i]==3)
			{
				System.out.println(pno[i] + " \t " + name[i] + " \t\t " + age[i] + " \t "+phno[i]);
			}
		}
		System.out.println("\nPassenger list in Vande Bharat Express");
		System.out.println("pno \t name \t\t age \t phno");
		for(int i=0;i<pcount;i++)
		{
			if(cl[i]==4)
			{
				System.out.println(pno[i] + " \t " + name[i] + " \t " + age[i] + " \t "+phno[i]);
			}
		}
		System.out.
		
		
		println("\nPassenger list in Duronto Express");
		System.out.println("pno \t name \t\t age \t phno ");
		for(int i=0;i<pcount;i++)
		{
			if(cl[i]==5)
			{
				System.out.println(pno[i] + " \t " + name[i] + " \t " + age[i] + " \t "+phno[i]);
			}
		}
    }
    private void DispUnbooked()
    {
		System.out.println("No. of booked tickets status");
		System.out.println("Gatiman Express : "+max1);
		System.out.println("Shatabdi Express : "+max2);
		System.out.println("Rajdhani Express : "+max3);
		System.out.println("Vande Bharat Express : "+max4);
		System.out.println("Duronto Express : "+max5);
    }
}

