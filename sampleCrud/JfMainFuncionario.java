//AUTHOR: HENRIQUE LUZ RODRIGUES
//DATE: 2012-04-12

package JavaCRUD;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

@SuppressWarnings("serial")
public class JfMainFuncionario extends JFrame implements ActionListener {
	
	JButton btInserir;
    JButton btSelect;
    JButton btAlterar;
    JButton btDeletar;
    JButton btVoltar;
    
    public JfMainFuncionario(){
        super("Main Funcionario");
        
        Container jfmain = getContentPane();
        
        btInserir = new JButton("Inserir");
        btInserir.addActionListener(this);
        btSelect = new JButton("Select");
        btSelect.addActionListener(this);
        btAlterar = new JButton("Alterar");
        btAlterar.addActionListener(this);
        btDeletar = new JButton("Deletar");
        btDeletar.addActionListener(this);
        btVoltar = new JButton("Voltar");
        btVoltar.addActionListener(this);
        
        jfmain.setLayout(new GridLayout(5,1,3,3));
        jfmain.add(btInserir);
        jfmain.add(btSelect);
        jfmain.add(btDeletar);
        jfmain.add(btAlterar);
        jfmain.add(btVoltar);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
        setLocation(500,200);
    }
    
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btInserir){
			setVisible(false);
			JfInsertFuncionario jfinsert = new JfInsertFuncionario();
			jfinsert.setUndecorated(true);
			jfinsert.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfinsert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfinsert.setVisible(true);
			setLocation(500,200);
		}
		if(e.getSource()==btSelect){
			Cruds a = new Cruds();
			try {
				JOptionPane.showMessageDialog(null,a.ListarFuncionario());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==btDeletar){
			setVisible(false);
			JfDeleteFuncionario jfdelete = new JfDeleteFuncionario();
			jfdelete.setUndecorated(true);
			jfdelete.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfdelete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfdelete.setVisible(true);
		}
		if(e.getSource()==btAlterar){
			setVisible(false);
			JfUpdateFuncionario jfupdate = new JfUpdateFuncionario();
			jfupdate.setUndecorated(true);
			jfupdate.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfupdate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfupdate.setVisible(true);
		}
		if(e.getSource()==btVoltar){
			setVisible(false);
			Jf_Main_Home jfback = new Jf_Main_Home();
			jfback.setUndecorated(true);
			jfback.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
			jfback.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jfback.setVisible(true);
		}
	}
    
    public static void main (String [] args) throws SQLException{
        new JfMainFuncionario();
    }
}