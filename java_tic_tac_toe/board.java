package Tic_Tac_Toe;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
enum Status{
	Null,
	O,
	X,
	XWin,	// X win
	OWin,	// O win
	NoWin,	// continue game
	EndGame	// all column are fill , end game
}
class board extends JPanel implements ActionListener,MouseListener{
	config c = new config();
	private Status[] platform = new Status[9];
	private Point[] point = new Point[9];
	private Status XorO;
	private int[][] WinCon=new int[][]{
		{0,1,2},{3,4,5},{6,7,8},
		{0,3,6},{1,4,7},{8,5,2},
		{0,4,8},{2,4,6}
	};
	private JLabel label;
	private boolean is_end = false;
	private int winLine = -1;
	board(JLabel label){
		this.label = label;
		addMouseListener(this);
		setPreferredSize(new Dimension(c.WPanel,c.WPanel));
		int tmp=0;
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				point[tmp] = new Point(i*c.Weight,j*c.Weight);
				platform[tmp] = Status.Null;
				tmp++;
			}
		}
		if((int)(Math.random()*2) +1 == 1){
			XorO = Status.O;
			label.setText("Next => O");
		}else{
			XorO = Status.X;
			label.setText("Next => X");
		}
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Color colors[]={new Color(0,0,0),new Color(255,69,7),new Color(18,2,255)};
		Color color = colors[0];
		
		Graphics2D g2 = (Graphics2D) g.create();
		
		g2.setStroke(new BasicStroke(c.fontWeight));
		g2.setColor(color);
		//int wx = getPreferredSize().width;
		
		g2.drawLine(c.Weight,0,c.Weight,c.WPanel);
		g2.drawLine(c.Weight*2,0,c.Weight*2,c.WPanel);
		g2.drawLine(0,c.Weight,c.WPanel,c.Weight);
		g2.drawLine(0,c.Weight*2,c.WPanel,c.Weight*2);
		int r = c.Weight/2;
		for(int i=0; i<platform.length; i++){
			if(platform[i]!=Status.Null){
				g2.setColor(colors[platform[i].ordinal()]);
				if(platform[i]==Status.O){
					g2.drawOval(point[i].x+(r/2), point[i].y+(r/2),r,r);
				}else{
					g2.drawLine(point[i].x+(r*2/3), point[i].y+(r*2/3), point[i].x+(int)(r*1.5), point[i].y+(int)(r*1.5));
					g2.drawLine(point[i].x+(int)(r*1.5), point[i].y+(r*2/3), point[i].x+(r*2/3), point[i].y+(int)(r*1.5));
				}
			}
		}
		
		if(winLine != -1){
			g2.setColor(new Color(72,237,47));
			switch(winLine){
				case 0: case 1: case 2:
					g2.drawLine(point[0].x+(r)+(winLine*2*r), 0, point[0].x+(r)+(winLine*2*r), c.WPanel);
				break;
				case 3: case 4: case 5:
					g2.drawLine(0, point[0].y+(r)+((winLine-3)*2*r), c.WPanel, point[0].y+(r)+((winLine-3)*2*r));
				break;
				case 6:
					g2.drawLine(0,0,c.WPanel,c.WPanel);
				break;
				case 7:
					g2.drawLine(0,c.WPanel,c.WPanel,0);
				break;
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		//System.out.println("8795656");
	}
	/*
	*  MouseListener need to override all func
	*/
	@Override
	public void mousePressed(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		if(!is_end){
			for(int i=0; i<point.length; i++){
				if(x > point[i].x+c.fontWeight && x < point[i].x+c.Weight-c.fontWeight && y > point[i].y+c.fontWeight && y < point[i].y+c.Weight-c.fontWeight){
					//System.out.println(x+" ----- "+y+" In "+point[i].x+" -- "+point[i].y);
					if(platform[i] == Status.Null){
						platform[i] = XorO;
						//XorO = (XorO==Status.O)?Status.X:Status.O;
						if(XorO == Status.O){
							XorO = Status.X;
							label.setText("Next => X");
						}else{
							XorO = Status.O;
							label.setText("Next => O");
						}
						Process();
					}
					break;
				}
			}
		}
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	private void Process(){
		Status tmp = is_win();
		if(tmp != Status.NoWin){
			is_end = true;
			switch(tmp){
				case OWin:
					System.out.println("O is Win");
					label.setText("O is Win");
				break;
				case XWin:
					System.out.println("X is Win");
					label.setText("X is Win");
				break;
				case EndGame:
					System.out.println("No One Win");
					label.setText("No One Win");
				break;
			}
		}
	}
	private Status is_win(){
		Status tmp = Status.Null;
		int count;
		for(int i=0; i<WinCon.length; i++){
			count = 0;
			for(int j=0; j<WinCon[i].length; j++){
				if(j == 0){
					tmp = platform[WinCon[i][j]];
					if(tmp == Status.Null){
						break;
					}
				}
				if(platform[WinCon[i][j]] == tmp){
					count ++;
				}else{
					break;
				}
			}
			if(count == 3){
				//System.out.println("tmp = "+tmp);
				winLine = i;
				if(tmp == Status.O){
					return Status.OWin;
				}else{
					return Status.XWin;
				}
			}
		}
		if(! Arrays.asList(platform).contains(Status.Null)){
			return Status.EndGame;
		}
		return Status.NoWin;
	}
	void resetGame(){
		for(int i=0; i<platform.length; i++){
			platform[i] = Status.Null;
		}
		is_end = false;
		winLine = -1;
		if(XorO == Status.O){
			label.setText("Next => O");
		}else{
			label.setText("Next => X");
		}
		repaint();
	}
	
}