package f2.spw;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 800);
		frame.getContentPane().setLayout(new BorderLayout());
		
		//09
		Font fn= new Font("Courier New", Font.BOLD,20);
                JMenuBar menubar = new JMenuBar();
                JMenu menuMain = new JMenu("Main");
                JMenu menuAbout = new JMenu("About");
                JMenuItem menuRestart =new JMenuItem("Restart");
                JMenuItem menuExit = new JMenuItem("Exit");
                JMenuItem menuStop = new JMenuItem("Stop");
                JMenuItem menuCredit = new JMenuItem("Credit");      
                menuMain.setFont(fn);
                menuAbout.setFont(fn);
                menuRestart.setFont(fn);
                menuExit.setFont(fn);
                menuStop.setFont(fn);
                menuCredit.setFont(fn);
                menuMain.add(menuRestart);
                menuMain.add(menuStop);
                menuMain.add(menuExit);
                menuAbout.add(menuCredit);
                menubar.add(menuMain);
                menubar.add(menuAbout);
                frame.setJMenuBar(menubar);
		//end 09
		
		SpaceShip v = new SpaceShip(180, 550, 20, 20);
		GamePanel gp = new GamePanel();
		GameEngine engine = new GameEngine(gp, v);
		frame.addKeyListener(engine);
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
		
		engine.start();
	}
}
