class Display{
    void displaychart(int curp,String player)
{
    int i,j,t,c,sft=0,diceres,pos1,pos2;
	
		
		if(curp==100)
		{
			System.out.print("*****Congratulations*****\n\n\nPlayer "+player+" wins\n");
			//scanf("%*s");
			//exit(0);
		}
	
	for(i=10;i>0;i--)
	{
		t=i-1;
		if((sft%2)==0)
		{
			c=0;
			for(j=10;j>=1;j--)
			{
				diceres=(i*j)+(t*c++);
				
				if(curp==diceres)
					System.out.print(player+"\t");
				else
				System.out.print(diceres+"\t");
		
			}
			sft++;
		}
		else
		{
			c=9;
			for(j=1;j<=10;j++)
			{
				diceres=(i*j)+(t*c--);
				
				if(curp==diceres)
					System.out.print(player+"\t");
				else
					System.out.print(diceres+"\t");
			}
		
			
			sft++;
		}
		System.out.print("\n\n");
	}	

	System.out.print("--------------------------------------------------------------------------\n");
}
}
