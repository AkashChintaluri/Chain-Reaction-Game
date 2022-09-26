import java.util.Scanner;
public class Single_Player extends ChainReaction
{
    public void main2()throws InterruptedException
    {
        Single_Player ob = new Single_Player();
        Scanner sc = new Scanner(System.in);
        char main[][] = {{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'}};
        int o = 0 ; 
        //o=player determiner
        int t= -1;
        char ply1 = 'a';
        char ply2 = 'a';
        ply1 = (char)10112;    
        //10112=wcircle 1, 10113=wcircle 2, 10114=wcircle 3 
        ply2 = (char)10102;    
        //10102=circle 1, 10103=cirlce 2, 10104=circle 3
        if(o%2==1)
        {
            for(int i = 0;i<((Math.random()*(6-4))+4);i++)
            {
                System.out.print("Thinking");
                for(int j = 0;j<((Math.random()*(6-4))+4);j++)
                {
                    System.out.print(".");
                    Thread.sleep(200);
                }
                Thread.sleep(500);
                System.out.print("\f");
                Thread.sleep(500);  
            }
        }
        for(int i = 0; i<1;)
        {
            if(o%2==0)
            {
                System.out.print("                                                               ");
                ob.type("Player plays");
                System.out.print("                                                          ");
                System.out.println("Enter in such form :");
                System.out.print("                                                                     ");
                System.out.println("A2, B8 etc");
                System.out.print("                                                             ");
                System.out.println("Enter \"E\" to exit");
                System.out.print("                                            ");
                System.out.println("Enter \"S\" to skip the match and see stats");
            }
            int kl = 0;
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("\n");
            System.out.print("                                                       ");
            System.out.println("       1  2 3  4  5  6 7  8");
            for(int j = 0; j <8; j++)
            {
                System.out.print("                                                           ");
                System.out.print((char)(kl+65)+"  ");
                for(int h = 0; h<8; h++)
                {
                    if(main[j][h]=='e')
                    {
                        System.out.print((char)9750+" ");
                    }
                    else
                    {
                        System.out.print(main[j][h]+ " ");
                    }
                }
                kl = kl +1;
                System.out.println();
            }
            int n = 0;
            int m = 0;
            if(o%2==0)
            {
                String ch = sc.next();
                System.out.print("\f");
                if(ch.equalsIgnoreCase("E"))
                {
                    i++;
                }
                else if(ch.equalsIgnoreCase("s"))
                {
                    int first = 0;
                    int second = 0;
                    for(int p = 0;p<8;p++)
                    {
                        for(int j = 0;j<8;j++)
                        {
                            if((int)main[p][j]==10112||(int)main[p][j]==10113||(int)main[p][j]==10114)
                                first=first + 1;
                            if((int)main[p][j]==10102||(int)main[p][j]==10104||(int)main[p][j]==10103)
                                second=second + 1;
                        }
                    }
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("\n");
                    System.out.print("                                                           ");
                    double play1per = (first/64.0)*100;
                    double compper = (second/64.0)*100;
                    double rem = ((64-(first+second))/64)*100;
                    ob.type("Player has occupied "+play1per+"% of the board");
                    System.out.print("                                                          ");
                    ob.type("Computer has occupied "+compper+"% of the board");
                    System.out.print("                                                                  ");
                    ob.type(rem+"% of the board was not covered");
                    System.out.print("                                                                     ");
                    if(first>second)
                        ob.type("Player wins");
                    else if(second>first)
                        ob.type("Computer wins");
                        else
                        ob.type("No Winner");
                    i++;
                }
                else if(((int)ch.charAt(0))<=104 && ((int)ch.charAt(0))>=97)
                {
                    char y = ch.charAt(1);
                    //numerical stored
                    char g = ch.charAt(0);
                    //character stored
                    n = (int)g;        
                    //char explicitly converted to integer
                    m = (int)y;          
                    n = n-97;
                    m= m-49;
                    if(n>=0 && n<=7 && m>=0 && m<=7)  
                    {
                        if(main[n][m] == 'e')
                        {
                            main[n][m] = ply1;
                        }
                        else if(((int)main[n][m])>=10112)
                        {
                            main[n][m] = (char)(((int)main[n][m])+1);
                        }
                        else 
                        {
                            System.out.println("                                           Computer owns this area");
                            o--;
                        }
                        for(int c = 0;c<1;)
                        {
                            int flag = 0;
                            for(int j = 0; j <8; j++)
                            {
                                for(int h = 0; h<8; h++)

                                {
                                    if(((int)main[j][h])==10115||((int)main[j][h])==10105)
                                    {
                                        flag = flag +1;
                                        if(((int)main[n][m])==10115)
                                        {
                                            if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n+1 >7 && m-1<0 && n-1<7 && m+1 >0)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m+1>7 && n+1>0 && m-1 <7)
                                            {
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else
                                            {
                                                int qwer = 2;
                                            }
                                        }
                                        else
                                        {
                                            if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n+1 >7 && m-1<0 && n-1<7 && m+1 >0)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m+1>7 && n+1>0 && m-1 <7)
                                            {
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else
                                            {
                                                int yuiop = 2;
                                            }
                                        }
                                    }
                                }
                            }
                            if(flag==0)
                                c = c+1;
                        }
                        int flag1 = 0;
                        int flag2 = 0;
                        for(int k = 0;k<8;k++)
                        {
                            for(int b= 0;b<8;b++)
                            {
                                if(main[k][b] == ((char)10112)||main[k][b] == ((char)10113)||main[k][b] == ((char)10114)||main[k][b] == ((char)10115))
                                    flag1 = flag1 +1;
                                if(main[k][b] == ((char)10102)||main[k][b] == ((char)10103)||main[k][b] == ((char)10104)||main[k][b] == ((char)10105))
                                    flag2 = flag2 +1;
                            }
                        }
                        if(flag1>0 && flag2 == 0 && o >2)
                        {
                            System.out.println("\fPlayer wins");
                            i = 1;
                        }
                        if(flag1==0 && flag2 >0 && o>2)
                        {
                            System.out.println("\fComputer wins");
                            i = 1;  
                        }
                    }
                }
                else if(ch.length()!=2 || (((int)ch.charAt(0))-65)<0 || (((int)ch.charAt(0))-65)>7 || (((int)ch.charAt(1))-49)<0 || (((int)ch.charAt(1))-49)>7)
                {
                    System.out.println("                                 Wrong choice \n                                  Please Enter Proper and Possible Choice \n\n\n\n");
                    o--;
                }
                else
                {
                    char y = ch.charAt(1); 
                    //numerical stored
                    char g = ch.charAt(0); 
                    //character stored
                    n = (int)g;        
                    //char explicitly converted to integer
                    m = (int)y;
                    n = n-65;
                    m= m-49;
                    if(n>=0 && n<=7 && m>=0 && m<=7 )  
                    {
                        if(o%2==0)
                        {
                            if(main[n][m] == 'e')
                                main[n][m] = ply1;
                            else if(((int)main[n][m])>=10112)
                                main[n][m] = (char)(((int)main[n][m])+1);
                            else 
                            {
                                System.out.println("                                            Computer  owns this area");
                                o--;
                            }
                        }
                        for(int c = 0;c<1;)
                        {
                            int flag = 0;
                            for(int j = 0; j <8; j++)
                            {
                                for(int h = 0; h<8; h++)

                                {
                                    if(((int)main[j][h])==10115||((int)main[j][h])==10105)
                                    {
                                        flag = flag +1;
                                        if(((int)main[n][m])==10115)
                                        {
                                            if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n+1 >7 && m-1<0 && n-1<7 && m+1 >0)
                                            {
                                                if((int)main[n-1][m]>=10112)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply1;
                                                if((int)main[n][m+1]>=10112)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m+1>7 && n+1>0 && m-1 <7)
                                            {
                                                if(((int)main[n+1][m])>=10112)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply1;
                                                if((int)main[n][m-1]>=10112)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply1;
                                                main[n][m] = 'e';
                                            }
                                            else
                                            {
                                                int qwer = 2;
                                            }
                                        }
                                        else
                                        {
                                            if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 >=0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 <8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1<8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m-1 <0 && n+1<8 && m+1 <8)
                                            {
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 >=0 && m-1 >=0 && n+1>=8 && m+1 >=8)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n+1 >7 && m-1<0 && n-1<7 && m+1 >0)
                                            {
                                                if((int)main[n-1][m]>=10102&&(int)main[n-1][m]<10106)
                                                    main[n-1][m] = (char)(((int)main[n-1][m])+1);
                                                else
                                                    main[n-1][m] = ply2;
                                                if((int)main[n][m+1]>=10102&&(int)main[n][m+1]<10106)
                                                    main[n][m+1] = (char)(((int)main[n][m+1])+1);
                                                else
                                                    main[n][m+1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else if(n-1 <0 && m+1>7 && n+1>0 && m-1 <7)
                                            {
                                                if((int)main[n+1][m]>=10102&&(int)main[n+1][m]<10106)
                                                    main[n+1][m] = (char)(((int)main[n+1][m])+1);
                                                else
                                                    main[n+1][m] = ply2;
                                                if((int)main[n][m-1]>=10102&&(int)main[n][m-1]<10106)
                                                    main[n][m-1] = (char)(((int)main[n][m-1])+1);
                                                else
                                                    main[n][m-1] = ply2;
                                                main[n][m] = 'e';
                                            }
                                            else
                                            {
                                                int yuiop = 2;
                                            }
                                        }
                                    }
                                }
                            }
                            if(flag==0)
                                c = c+1;
                        }
                        int flag1 = 0;
                        int flag2 = 0;
                        for(int k = 0;k<8;k++)
                        {
                            for(int b= 0;b<8;b++)
                            {
                                if(main[k][b] == ((char)10112)||main[k][b] == ((char)10113)||main[k][b] == ((char)10114)||main[k][b] == ((char)10115))
                                    flag1 = flag1 +1;
                                if(main[k][b] == ((char)10102)||main[k][b] == ((char)10103)||main[k][b] == ((char)10104)||main[k][b] == ((char)10105))
                                    flag2 = flag2 +1;
                            }
                        }
                        if(flag1>0 && flag2 == 0 && o >2)
                        {
                            System.out.println("\fPlayer 1 wins");
                            i = 1;
                        }
                        if(flag1==0 && flag2 >0 && o>2)
                        {
                            System.out.println("\fComputer Wins");
                            i = 1;  
                        }
                    }
                }
            }
            else
            {
                for(int po = 0;po<1;po++)
                {
                    int df[] = new int[64];
                    int gh[] = new int[64];
                    int jk[] = new int[64];
                    int df2[] = new int[64];
                    int gh2[] = new int[64];
                    int jk2[] = new int[64];
                    int cv = 0;
                    int bn = 0;
                    int ml = 0;
                    for(int yu = 0;yu<8;yu++)
                    {
                        for(int io = 0; io<8;io++)
                        {
                            if((int)(main[yu][io]) == 10102)
                            {
                                df[cv] = yu;
                                df2[cv] = io;
                                cv++;
                            }
                            if((int)(main[yu][io]) == 10103)
                            {
                                gh[bn] = yu;
                                gh2[bn] = io;
                                bn++;
                            }
                            if((int)(main[yu][io]) == 10103)
                            {
                                jk[ml] = yu;
                                jk2[ml] = io;
                                ml++;
                            }
                        }
                    }
                    int ran = (int)(Math.random()*4);
                    if(ran == 1)
                    {
                        if(cv>1)
                        {
                            int ran1 = (int)(Math.random()*(--cv));
                            n = df[ran1];
                            m = df2[ran1];
                        }
                        else
                        {
                            n = (int)(Math.random()*7);
                            m = (int)(Math.random()*7);
                        }
                    }
                    else if(ran == 2)
                    {
                        if(bn>1)
                        {
                            int ran1 = (int)(Math.random()*(--bn));
                            n = gh[ran1];
                            m = gh2[ran1];
                        }
                        else
                        {
                            n = (int)(Math.random()*7);
                            m = (int)(Math.random()*7);
                        }
                    }
                    else if(ran == 3)
                    {
                        if(ml>1)
                        {
                            int ran1 = (int)(Math.random()*(--ml));
                            n = jk[ran1];
                            m = jk2[ran1];
                        }
                        else
                        {
                            n = (int)(Math.random()*7);
                            m = (int)(Math.random()*7);
                        }
                    }
                    else
                    {
                        n = (int)(Math.random()*7);
                        m = (int)(Math.random()*7);
                    }
                    if(n-1>0 && (int)main[n-1][m] > 10112)
                        po--;
                    else if(m-1>0 && (int)main[n][m-1] > 10112)
                        po--;
                    else if(n+1<8 && (int)main[n+1][m] > 10112)
                        po--;
                    else if(m+1<8 && (int)main[n][m+1] > 10112)
                        po--;

                }
                System.out.print("\f");
                if(main[n][m] == 'e')
                    main[n][m] = ply2;
                else if(((int)main[n][m])>=10102&&((int)main[n][m])<=10105)
                    main[n][m] = (char)(((int)main[n][m])+1);
                else{}
            }
            o++;
            t--;
        }
    }
}