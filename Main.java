import java.util.*; 
class Main{
public static void main(String[]args){
    Display d = new Display();
    Scanner sc= new Scanner(System.in);
	Rd r = new Rd();


    int i,dice,cur_pos1=0,cur_pos2=0;
	char ch;
	while(true)
	{	System.out.print("		** SNAKE AND LADDER GAME** \n");
		System.out.print("Snakes:- 25 to 9,\t 65 to 40,\t 99 to  1.\nLadder:- 13 to 42,\t 60 to 83,\t 70 to 93.\n");
		System.out.print("Choose your option\n");
		System.out.print("1. Player 1 plays\n");
		System.out.print("2. Player 2 plays\n");
		System.out.print("3. Exit\n");
		 ch = sc.next().charAt(0);  
		switch(ch)
		{
			
			case '1':dice=r.rd();
					System.out.print("\t\t\t\tDice = "+dice+"\n\n");
					if(dice==6)
					System.out.print("Dice=6: You have earned a chance to play one more time.\n");
					cur_pos1=dice+cur_pos1;
					if(cur_pos1<101){
						if(cur_pos1==99)
						{
						d.displaychart(1,"$P1$");
						}
						if(cur_pos1==65)
						{
						d.displaychart(40,"$P1$");
						}
						if(cur_pos1==25)
						{
						d.displaychart(9,"$P1$");
						}
						if(cur_pos1==70)
						{
						d.displaychart(93,"$P1$");
						}
						if(cur_pos1==60)
						{
						d.displaychart(83,"$P1$");
						}
						if(cur_pos1==13)
						{
						d.displaychart(42,"$P1$");
						}
						else{
							d.displaychart(cur_pos1,"$P1$");
						}
						
					}
					else{
						cur_pos1=cur_pos1-dice;
						System.out.print("Range exceeded of Player 1.\n");
						d.displaychart(cur_pos1,"$P1$");
					}
					System.out.print("Player 2 position is "+cur_pos2+"\n");
			
				break;
			case '2':dice=r.rd();
			//system("cls");
					System.out.print("\t\t\t\tDice = "+dice+"\n\n");
					cur_pos2=dice+cur_pos2;
					if(cur_pos2<101){
						if(cur_pos2==99)	
						{
						d.displaychart(1,"$P2$");
						}
						if(cur_pos2==65)	
						{
						d.displaychart(40,"$P2$");
						}
						if(cur_pos2==25)	
						{
						d.displaychart(9,"$P2$");
						}
						if(cur_pos2==70)	
						{
						d.displaychart(93,"$P2$");
						}
						if(cur_pos2==60)	
						{
						d.displaychart(83,"$P2$");
						}
						if(cur_pos2==13) 	
						{
						d.displaychart(42,"$P2$");
						}
						else{
							d.displaychart(cur_pos2,"$P2$");
						}
					}
						
					else{
						cur_pos2=cur_pos2-dice;
						System.out.print("Range exceeded of Player 2.\n");
						d.displaychart(cur_pos2,"$P2$");
					}
					System.out.print("Player 1 position is "+cur_pos1+"\n");
				break;
			
			default:System.out.print("Incorrect choice.Try Again\n");
				
		}
		
	}
}
}