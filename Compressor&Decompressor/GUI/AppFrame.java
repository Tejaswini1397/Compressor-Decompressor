package GUI;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import comp.comp.comp.comp.compressor;
import comp.comp.comp.comp.decmpressor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {
    JButton compressButton;
    JButton decompressButton;
    /**
     * 
     */
    AppFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        compressButton=new JButton("Select file to compress");
        compressButton.setBounds(200,100,200,30);
        compressButton.addActionListener(this);
      //  this.setVisible(true);

        decompressButton=new JButton("Select file to decompress");
        decompressButton.setBounds(500,100,200,30);
        decompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompressButton);
        this.setSize(1000,500);
        this.getContentPane().setBackground(Color.BLACK);
        this.setVisible(true);
    }
   

    @Override

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==compressButton){
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    compressor.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
        }
    }
   

if(e.getSource()==decompressButton){
    JFileChooser fileChooser=new JFileChooser();
    int response=fileChooser.showSaveDialog(null);
    if(response==JFileChooser.APPROVE_OPTION){
        File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
        System.out.print(file);
        try{
            decmpressor.method(file);
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null, ee.toString());
        } 
}
}
}
}

