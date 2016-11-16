package Tic_Tac_Toe;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

class Main extends JFrame{
	Main(){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e){
			System.out.println("Error With Improve Button");
		}
		config c = new config();
		setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1,2));
		JLabel label = new JLabel("123");
		JButton Btn = new JButton("Reset");
		jp.add(label);
		jp.add(Btn);
		add(jp,BorderLayout.SOUTH);
		
		board board = new board(label);
		
		JLabel west = new JLabel();
		west.setPreferredSize(new Dimension(c.BorderWidth-(c.BorderWidth/5),0));
		add(west, BorderLayout.WEST);
		
		JLabel top = new JLabel();
		top.setPreferredSize(new Dimension(0,c.BorderWidth));
		add(top, BorderLayout.NORTH);
		
		add(board,BorderLayout.CENTER);
		Btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				board.resetGame();
			}
		});
		
		setSize(c.SWidth,c.SHeight);
		setResizable(false);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Main main = new Main();
		main.setVisible(true);
	}
}
