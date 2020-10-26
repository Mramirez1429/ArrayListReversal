package snippet;

	import java.io.BufferedReader;

	import java.io.FileReader;

	import java.util.ArrayList;

	import java.util.Scanner;

	public class ArrayListReversal 
	{

	public static void main(String[] args) throws Exception
	{

	   ArrayList<String>list= new ArrayList<String>();

	   Scanner scan = new Scanner(System.in);

	   System.out.println("Enter name of the file");

	   String fileName=scan.nextLine();

	   BufferedReader br = new BufferedReader(new FileReader(fileName));

	   String line=br.readLine();

	   while(line!=null){

	       list.add(line);

	       line=br.readLine();

	   }

	   reverseList(list);

	   for(String s:list){

	       System.out.println(s);

	   }

	   int index=0;

	   do{

	       System.out.printf("Please enter the number of the index you want to find the value for.\r\n" + 
	       		"Index must be between 0 and 24 inclusive, Enter a number outside of range to exit\r\n" );

	       index=scan.nextInt();

	       if(index<0 || index>=list.size())

	           break;

	       System.out.println(list.get(index));

	   }while(index>=0 && index<list.size());

	}

	private static void reverseList(ArrayList<String> aList) 
	{

	   ArrayList<String>temp=new ArrayList<String>();

	   for(String s:aList){

	       temp.add(0, s);

	   }

	   aList.clear();

	   aList.addAll(temp);

	  

	}
	}

