import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
class tictactoe_comp
{
    static int turn=0,no_of_turns=0,won=-1;
    static char box[][]={{'.','.','.'},{'.','.','.'},{'.','.','.'}};
    tictactoe_comp()
    {
        JFrame jf=new JFrame("TIC-TAC-TOE GAME");
        JPanel pan=new JPanel();pan.setLayout(null);
        JLabel tic=new JLabel("TIC-TAC-TOE");
        tic.setFont(new Font("Verdana",Font.BOLD,32));
        tic.setBounds(240,10,450,100);
        pan.add(tic);
        
        int k=0;
        JButton arr[]=new JButton[9];
        for(int i=230;i<470;i+=80)
        for(int j=120;j<360;j+=80)
        {
            makeButton(arr,k,i,j);
            pan.add(arr[k]);k++;
        }
        k=0;
        JLabel p1=new JLabel("Player : X");
        p1.setFont(new Font("Verdana",Font.PLAIN,20));
        p1.setBounds(150,380,190,60);

        JLabel p2=new JLabel("Computer : O");
        p2.setFont(new Font("Verdana",Font.PLAIN,20));
        p2.setBounds(430,380,190,60);
        pan.add(p1);pan.add(p2);

        JLabel who_turn=new JLabel("TURN: Player");
        who_turn.setFont(new Font("Verdana",Font.PLAIN,20));
        who_turn.setBounds(265,450,250,60);
        pan.add(who_turn);

        JLabel res=new JLabel(" ");
        res.setBounds(260,520,240,60);
        res.setFont(new Font("Verdana",Font.PLAIN,20));
        pan.add(res);

        JButton newgame=new JButton("New Game");
        newgame.setFont(new Font("Verdana",Font.PLAIN,20));
        newgame.setBounds(260,590,190,60);
        pan.add(newgame);

        arr[0].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,0,0,0);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[1].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,1,0,1);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[2].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,2,0,2);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[3].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,0,1,3);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[4].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,1,1,4);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[5].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,2,1,5);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[6].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,0,2,6);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[7].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,1,2,7);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );
        arr[8].addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    actionWork(arr,who_turn,2,2,8);
                    if(won!=-1)
                    {
                        if(won==0)
                        res.setText("PLAYER WINS !!");
                        else if(won==1)
                        res.setText("COMPUTER WINS !!");
                    }
                    else if(no_of_turns>=9)
                    res.setText("       DRAW !");
                }
            }
        );

        newgame.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    no_of_turns=0;
                    turn=0;won=-1;
                    for(int i=0;i<3;i++)
                    for(int j=0;j<3;j++)
                    box[i][j]='.';

                    res.setText(" ");
                    for(int i=0;i<9;i++)
                    arr[i].setText(" ");
                }
            }
        );
        k=0;
        jf.getContentPane().add(pan);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(700,800);jf.setResizable(false);
        jf.setVisible(true);
    }
    void makeButton(JButton arr[],int i,int x,int y)
    {
        arr[i]=new JButton(" ");
        arr[i].setBounds(x,y,80,80);
        arr[i].setFont(new Font("Verdana",Font.BOLD,20));
    }
    void compTurn()
    {
        if(box[0][1]=='O' && box[1][1]=='O' && box[2][1]=='.')
        box[2][1]='O';
        else if(box[0][1]=='O' && box[1][1]=='.' && box[2][1]=='O')
        box[1][1]='O';
        else if(box[0][1]=='.' && box[1][1]=='O' && box[2][1]=='O')
        box[0][1]='O';
        else if(box[1][0]=='O' && box[1][1]=='O' && box[1][2]=='.')
        box[1][2]='O';
        else if(box[1][0]=='O' && box[1][1]=='.' && box[1][2]=='O')
        box[1][1]='O';
        else if(box[1][0]=='.' && box[1][1]=='O' && box[1][2]=='O')
        box[1][0]='O';
        else if(box[0][0]=='O' && box[0][1]=='O' && box[0][2]=='.')
        box[0][2]='O';
        else if(box[0][0]=='O' && box[0][1]=='.' && box[0][2]=='O')
        box[0][1]='O';
        else if(box[0][0]=='.' && box[0][1]=='O' && box[0][2]=='O')
        box[0][0]='O';
        else if(box[2][0]=='O' && box[2][1]=='O' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[2][0]=='O' && box[2][1]=='.' && box[2][2]=='O')
        box[2][1]='O';
        else if(box[2][0]=='.' && box[2][1]=='O' && box[2][2]=='O')
        box[2][0]='O';
        else if(box[0][0]=='O' && box[1][0]=='O' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[0][0]=='O' && box[1][0]=='.' && box[2][0]=='O')
        box[1][0]='O';
        else if(box[0][0]=='.' && box[1][0]=='O' && box[2][0]=='O')
        box[0][0]='O';
        else if(box[0][2]=='O' && box[1][2]=='O' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[0][2]=='O' && box[1][2]=='.' && box[2][2]=='O')
        box[1][2]='O';
        else if(box[0][2]=='.' && box[1][2]=='O' && box[2][2]=='O')
        box[0][2]='O';
        else if(box[0][0]=='O' && box[1][1]=='O' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[0][0]=='O' && box[1][1]=='.' && box[2][2]=='O')
        box[1][1]='O';
        else if(box[0][0]=='.' && box[1][1]=='O' && box[2][2]=='O')
        box[0][0]='O';
        else if(box[0][2]=='O' && box[1][1]=='O' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[0][2]=='O' && box[1][1]=='.' && box[2][0]=='O')
        box[1][1]='O';
        else if(box[0][2]=='.' && box[1][1]=='O' && box[2][0]=='O')
        box[0][2]='O';
        else if(box[0][1]=='X' && box[1][1]=='X' && box[2][1]=='.')
        box[2][1]='O';
        else if(box[0][1]=='X' && box[1][1]=='.' && box[2][1]=='X')
        box[1][1]='O';
        else if(box[0][1]=='.' && box[1][1]=='X' && box[2][1]=='X')
        box[0][1]='O';
        else if(box[1][0]=='X' && box[1][1]=='X' && box[1][2]=='.')
        box[1][2]='O';
        else if(box[1][0]=='X' && box[1][1]=='.' && box[1][2]=='X')
        box[1][1]='O';
        else if(box[1][0]=='.' && box[1][1]=='X' && box[1][2]=='X')
        box[1][0]='O';
        else if(box[0][0]=='X' && box[0][1]=='X' && box[0][2]=='.')
        box[0][2]='O';
        else if(box[0][0]=='X' && box[0][1]=='.' && box[0][2]=='X')
        box[0][1]='O';
        else if(box[0][0]=='.' && box[0][1]=='X' && box[0][2]=='X')
        box[0][0]='O';
        else if(box[2][0]=='X' && box[2][1]=='X' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[2][0]=='X' && box[2][1]=='.' && box[2][2]=='X')
        box[2][1]='O';
        else if(box[2][0]=='.' && box[2][1]=='X' && box[2][2]=='X')
        box[2][0]='O';
        else if(box[0][0]=='X' && box[1][0]=='X' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[0][0]=='X' && box[1][0]=='.' && box[2][0]=='X')
        box[1][0]='O';
        else if(box[0][0]=='.' && box[1][0]=='X' && box[2][0]=='X')
        box[0][0]='O';
        else if(box[0][2]=='X' && box[1][2]=='X' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[0][2]=='X' && box[1][2]=='.' && box[2][2]=='X')
        box[1][2]='O';
        else if(box[0][2]=='.' && box[1][2]=='X' && box[2][2]=='X')
        box[0][2]='O';
        else if(box[0][0]=='X' && box[1][1]=='X' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[0][0]=='X' && box[1][1]=='.' && box[2][2]=='X')
        box[1][1]='O';
        else if(box[0][0]=='.' && box[1][1]=='X' && box[2][2]=='X')
        box[0][0]='O';
        else if(box[0][2]=='X' && box[1][1]=='X' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[0][2]=='X' && box[1][1]=='.' && box[2][0]=='X')
        box[1][1]='O';
        else if(box[0][2]=='.' && box[1][1]=='X' && box[2][0]=='X')
        box[0][2]='O';
        else if((box[0][0]=='X'||box[2][2]=='X'||box[2][0]=='X'||box[0][2]=='X')&&box[1][1]=='.')
        box[1][1]='O';
        else if((box[0][0]=='X' && box[2][2]=='X')||(box[2][0]=='X' && box[0][2]=='X'))
        {
            if(box[0][1]=='.')
            box[0][1]='O';
            else if(box[2][1]=='.')
            box[2][1]='O';
            else if(box[1][0]=='.')
            box[1][0]='O';
            else if(box[1][2]=='.')
            box[1][2]='O';
        }
        else if(box[0][1]=='X' && box[1][0]=='X')
        {
            if(box[0][0]=='.')
            box[0][0]='O';
            else if(box[2][0]=='.')
            box[2][0]='O';
        }
        else if(box[0][0]=='X' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[0][0]=='.' && box[2][2]=='X')
        box[0][0]='O';
        else if(box[2][0]=='X' && box[0][2]=='.')
        box[0][2]='O';
        else if(box[2][0]=='.' && box[0][2]=='X')
        box[2][0]='O';
        else if((box[0][1]=='X'||box[1][0]=='X'||box[2][1]=='X'||box[1][2]=='X')&&box[1][1]=='.')
        box[1][1]='O';
        else if(box[0][0]=='O' && box[0][1]=='.' && box[0][2]=='.')
        box[0][2]='O';
        else if(box[0][0]=='O' && box[1][0]=='.' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[0][0]=='.' && box[0][1]=='.' && box[0][2]=='O')
        box[0][0]='O';
        else if(box[0][0]=='.' && box[1][0]=='.' && box[2][0]=='O')
        box[0][0]='O';
        else if(box[1][1]=='O' && box[0][0]=='.' && box[2][2]=='.')
        box[2][2]='O';
        else if(box[1][1]=='O' && box[2][0]=='.' && box[0][2]=='.')
        box[2][0]='O';
        else if(box[2][2]=='O' && box[2][1]=='.' && box[2][0]=='.')
        box[2][0]='O';
        else if(box[2][2]=='O' && box[1][2]=='.' && box[0][2]=='.')
        box[0][2]='O';
        else if(box[2][2]=='.' && box[2][1]=='.' && box[2][0]=='O')
        box[2][2]='O';
        else if(box[2][2]=='.' && box[1][2]=='.' && box[0][2]=='O')
        box[2][2]='O';
        else if(box[0][0]=='.'||box[2][2]=='.'||box[2][0]=='.'||box[0][2]=='.')
        {
            int ar[][]=new int[4][2];
            for(int i=0;i<4;i++)
            for(int j=0;j<2;j++)
            ar[i][j]=-1;

            int cnt=0;
            if(box[0][0]=='.')
            {
                ar[cnt][0]=0;ar[cnt][1]=0;
                cnt++;
            }
            if(box[2][2]=='.')
            {
                ar[cnt][0]=2;ar[cnt][1]=2;
                cnt++;
            }
            if(box[2][0]=='.')
            {
                ar[cnt][0]=2;ar[cnt][1]=0;
                cnt++;
            }
            if(box[0][2]=='.')
            {
                ar[cnt][0]=0;ar[cnt][1]=2;
                cnt++;
            }
            int ind=(int)(cnt*Math.random());
            box[ar[ind][0]][ar[ind][1]]='O';
        }
        else
        {
            int ch=0;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                if(box[i][j]=='.')
                {
                    box[i][j]='O';
                    ch=1;break;
                }
                if(ch==1)
                break;
            }
        }
        turn=0;
        no_of_turns++;
    }
    void actionWork(JButton arr[],JLabel who_turn,int i,int j,int k)
    {
        if(turn==0 && box[i][j]=='.' && won==-1)
        {
            box[i][j]='X';
            who_turn.setText("TURN: Computer");
            arr[k].setText("X");
            turn=1;
            no_of_turns++;

            if(box[0][0]=='X' && box[0][1]=='X' && box[0][2]=='X')
            won=0;
            if(box[2][0]=='X' && box[2][1]=='X' && box[2][2]=='X')
            won=0;
            if(box[0][0]=='X' && box[1][0]=='X' && box[2][0]=='X')
            won=0;
            if(box[0][2]=='X' && box[1][2]=='X' && box[2][2]=='X')
            won=0;
            if(box[0][0]=='X' && box[1][1]=='X' && box[2][2]=='X')
            won=0;
            if(box[0][2]=='X' && box[1][1]=='X' && box[2][0]=='X')
            won=0;
            if(box[0][1]=='X' && box[1][1]=='X' && box[2][1]=='X')
            won=0;
            if(box[1][0]=='X' && box[1][1]=='X' && box[1][2]=='X')
            won=0;
            
            if(won==-1)
            compTurn();
            else
            return;
            who_turn.setText("TURN: Player");
            int p=0;
            for(int a=0;a<3;a++)
            {
                for(int b=0;b<3;b++)
                {
                    if(box[b][a]=='O')
                    arr[p].setText("O");
                    p++;
                }
            }
        }
        if(box[0][0]=='O' && box[0][1]=='O' && box[0][2]=='O')
        won=1;
        if(box[2][0]=='O' && box[2][1]=='O' && box[2][2]=='O')
        won=1;
        if(box[0][0]=='O' && box[1][0]=='O' && box[2][0]=='O')
        won=1;
        if(box[0][2]=='O' && box[1][2]=='O' && box[2][2]=='O')
        won=1;
        if(box[0][0]=='O' && box[1][1]=='O' && box[2][2]=='O')
        won=1;
        if(box[0][2]=='O' && box[1][1]=='O' && box[2][0]=='O')
        won=1;
        if(box[0][1]=='O' && box[1][1]=='O' && box[2][1]=='O')
        won=1;
        if(box[1][0]=='O' && box[1][1]=='O' && box[1][2]=='O')
        won=1;
    }
    public static void main(String a[])
    {
        new tictactoe_comp();
    }
}