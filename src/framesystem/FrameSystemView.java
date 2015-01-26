package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;

public class FrameSystemView extends Frame implements ActionListener,WindowListener{
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private TextField text3 = new TextField("",10);
	private Button button1 = new Button("足し算");
	
	//M/M/1用
	private TextField m1 = new TextField("",5);
	private TextField m2 = new TextField("",5);
	private TextField m3 = new TextField("",5);
	private Button bm = new Button("M/M/1");
	
	//M/M/S用
	private TextField s1 = new TextField("",5);
	private TextField s2 = new TextField("",5);
	private TextField s3 = new TextField("",5);
	private TextField s4 = new TextField("",5);
	private Button bs = new Button("M/M/S");
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("答え"));
		add(text3);
		add(new Label("λ"));
		add(m1);
		add(new Label("μ"));
		add(m2);
		add(new Label("平均系内人数"));
		add(m3);
		add(bm);
		add(new Label("λ"));
		add(s1);
		add(new Label("μ"));
		add(s2);
		add(new Label("s"));
		add(s3);
		add(new Label("平均系内人数"));
		add(s4);
		add(bs);
		button1.addActionListener(this);
		bm.addActionListener(this);
		bs.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){
			int val1=Integer.parseInt(text1.getText());
			int val2=Integer.parseInt(text2.getText());
			Calculation_lib clib=new Calculation_lib(val1,val2);
			text3.setText(String.valueOf(clib.getPlus()));
		}
		if(e.getSource()==bm){
			Double lambda=Double.parseDouble(m1.getText());
			Double mu=Double.parseDouble(m2.getText());
			MM1_lib mlib=new MM1_lib(lambda,mu);
			m3.setText(String.valueOf(mlib.getLength()));	
		}
		if(e.getSource()==bs){
			Double lambda=Double.parseDouble(s1.getText());
			Double mu=Double.parseDouble(s2.getText());
			int s=Integer.parseInt(s3.getText());
			MMS_lib mms=new MMS_lib(lambda,mu,s);
			s4.setText(String.valueOf(mms.getL()));	
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
