import java.util.Scanner;
public class Player_vs_Player extends ChainReaction
{
    public void main1()throws InterruptedException
    {
        Player_vs_Player ob = new Player_vs_Player();
        Scanner sc = new Scanner(System.in);
        char main[][] = {{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'},{'e','e','e','e','e','e','e','e'}};
        int o = 0 ; 
        //o=player determiner
        char ply1 = 'a';
        char ply2 = 'a';
        ply1 = (char)10112;   
        //10112=wcircle 1, 10113=wcircle 2, 10114=wcircle 3 
        ply2 = (char)10102;   
        //10102=circle 1, 10103=cirlce 2, 10104=circle 3
        for(int i = 0; i<1;)
        {
            if(o%2==0)
            {
                System.out.print("                                                               ");
                ob.type("Player 1 plays");
            }
            else
            {
                System.out.print("                                                               ");
                ob.type("Player 2 plays");
            }
            System.out.print("                                                          ");
            System.out.println("Enter in such form :");
            System.out.print("                                                                     ");
            System.out.println("A2, B8 etc");
            System.out.print("                                                             ");
            System.out.println("Enter \"E\" to exit");
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
                        System.out.print((char)9750+" ");
                    else
                        System.out.print(main[j][h]+ " ");
                }
                kl = kl +1;
                System.out.println();
            }
            String ch = sc.next();
            System.out.print("\f");
            int n = 0;
            int m = 0;
            if(ch.equalsIgnoreCase("E"))
            {
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
                    if(o%2==0)
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
                            System.out.println("                                        Other player owns this area");
                            o--;
                        }
                    }
                    else
                    {
                        if(main[n][m] == 'e')
                            main[n][m] = ply2;
                        else if(((int)main[n][m])>=10102&&((int)main[n][m])<=10105)
                            main[n][m] = (char)(((int)main[n][m])+1);
                        else 
                        {
                            System.out.println("                                        Other player owns this area");
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
                        System.out.println("\fPlayer 2 wins");
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
                if(n>=0 && n<=7 && m>=0 && m<=7)  
                {
                    if(o%2==0)
                    {
                        if(main[n][m] == 'e')
                            main[n][m] = ply1;
                        else if(((int)main[n][m])>=10112)
                            main[n][m] = (char)(((int)main[n][m])+1);
                        else 
                        {
                            System.out.println("                                        Other player owns this area");
                            o--;
                        }
                    }
                    else
                    {
                        if(main[n][m] == 'e')
                        {
                            main[n][m] = ply2;
                        }
                        else if(((int)main[n][m])>=10102&&((int)main[n][m])<=10105)
                        {
                            main[n][m] = (char)(((int)main[n][m])+1);
                        }
                        else 
                        {
                            System.out.println("                                        Other player owns this area");
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
                        System.out.println("\fPlayer 2 wins");
                        i = 1;  
                    }
                }
            }
            o++;
        }
    }
}