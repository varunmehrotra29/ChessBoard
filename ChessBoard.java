import javax.swing.*;
import java.awt.*;
class ChessBoard extends JFrame
{
	JButton bt[][]=new JButton[8][8];
	public ChessBoard()
	{
         super("Chess Board");
	 setSize(800,600);
	 setLocationRelativeTo(null);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setResizable(false);
	 addButtons();
	 setVisible(true);
	}
	private void addButtons()
	{
	 int c=0;
	 setLayout(new GridLayout(8,8));
	 for(int i=0;i<8;i++)
	 {
	  for(int j=0;j<8;j++)
	  {
	   bt[i][j]=new JButton();
	   if(j%2==c)
	   bt[i][j].setBackground(Color.white);
	   else
	   bt[i][j].setBackground(Color.black);
	   add(bt[i][j]);
	  }
         c=1-c;
	 }
 	  setImage();
	}
	public void setImage()
	 {
 	  ImageIcon icon3=new ImageIcon("images/bp.gif");
	  ImageIcon icon4=new ImageIcon("images/wp.gif");
          for(int i=0;i<8;i++)
	  {
	  ImageIcon icon1=new ImageIcon("images/b"+i+".gif");
	  bt[0][i].setIcon(icon1);
	
	  ImageIcon icon2=new ImageIcon("images/w"+i+".gif");
	  bt[7][i].setIcon(icon2);
	  bt[1][i].setIcon(icon3);
	  bt[6][i].setIcon(icon4);
	  }
	 }
	public static void main(String args[])
	{
	 setDefaultLookAndFeelDecorated(true);
	 new ChessBoard();
	}
}