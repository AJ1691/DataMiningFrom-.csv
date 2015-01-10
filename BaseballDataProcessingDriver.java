import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Scanner;

public class prog4 {
	
	static HashMap<Integer,HashMap<String,Integer>> Table1 =new HashMap<Integer,HashMap<String,Integer>>();
	static HashMap<String,Integer> Table[];
	
	public static void main(String[] args) throws IOException{
		readFile();
		int input=displayHome();
       
       System.out.println(Table1.get(input).toString());
       
	}

	
	public static void readFile() throws IOException{
		int i=0;
		
		
		
		Scanner br = new Scanner(new FileReader("2013ALL.csv"));
		
		while(!br.hasNext("@attribute"))
			br.nextLine();				
		
		while(br.nextLine().contains("@attribute")){
		Table[i]=new HashMap<String,Integer>();
		Table1.put(i ,Table[i] );
		i++;
		}
		br.close();
		BufferedReader buffer=new BufferedReader(new FileReader("2013ALL.csv"));
		String buf;
		for(;;){
		if(buffer.readLine().contains("@data")){
			break;
			}
		}
		//System.out.println(buffer.toString());
		i=0;
		
		StringBuilder str=new StringBuilder();
		
		//buf=buffer.readLine();
		
		while((buf=buffer.readLine())!=null   ){
			str=str.append(buf);
			//buf=buffer.readLine();
			//System.out.println(str.toString());
		}
		
		
		String temp[]=str.toString().split(",");
		//System.out.println(temp[i]);
		i=0;
		System.out.println("good");
		int j=0;
		Integer val=0;
		System.out.println(Table1.size());
		
		while(j<temp.length){
			System.out.println("sharma");
		for(i=0;i<Table1.size();i++)
			{
	    	val=(Table[i].get(temp[i]))+1;
	    	System.out.println("ajay");
		    Table[i].put(temp[i],val);
		    j++;
		    System.out.println(Table[i].toString());
		    }
	    
	    }
		buffer.close();
	}

	public static int displayHome(){
		System.out.println();
		System.out.println("Attribute 0 inning");
		System.out.println("Attribute 1 battingTeam");
		System.out.println("Attribute 2 outs");
		System.out.println("Attribute 2 outs");
		System.out.println("Attribute 2 outs");
		System.out.println("Attribute 3 balls");
		System.out.println("Attribute 4 strikes");
		System.out.println("Attribute 5 pitchSequence");
		System.out.println("Attribute 6 visScore");
		System.out.println("Attribute 7 homeScore");
		System.out.println("Attribute 8 batter");
		System.out.println("Attribute 9 batterHand");
		System.out.println("Attribute 10 resBatter");
		System.out.println("Attribute 11 resBatterHand");
		System.out.println("Attribute 12 pitcher");
		System.out.println("Attribute 13 pitcherHand");
		System.out.println("Attribute 14 resPitcher");
		System.out.println("Attribute 15 resPitcherHand");
		System.out.println("Attribute 16 firstRunner");
		System.out.println("Attribute 17 secondRunner");
		System.out.println("Attribute 18 thirdRunner");
		System.out.println("Attribute 19 leadoffFlag");
		System.out.println("Attribute 20 pinchHitFlag");
		System.out.println("Attribute 21 defensivePosition");
		System.out.println("Attribute 22 lineupPosition");
		System.out.println("Attribute 23 hitValue");		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("What attribute would you like to summarize (0..23)?");
		int input=24;
		try{
			input = sc.nextInt();
		}
		catch(IllegalArgumentException e){
			System.out.println();
			System.out.println("Input not recognized. No integer value found.");
			System.out.println("Program terminated");
		}
		sc.close();
		return input;
	}
	
	
}

