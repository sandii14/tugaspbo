/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Asus
 */
public class Latihan2 extends JFrame implements ActionListener {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final String EMPTY_STRING="";
    private static final String NEWLINE = System.getProperty("line.separator");
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;
    
    public static void main(String[] args){
        Latihan2 frame = new Latihan2();
        frame.setVisible(true);
    }
    
    public Latihan2(){
        Container contentPane;
 //setting properties frame
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Latihan Dua");
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
        textArea.setEditable(false);
        contentPane.add(textArea);
        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        inputLine.addActionListener(this);
 //membuat dua button ke dalam frame       
        addButton = new JButton("ADD");
        contentPane.add(addButton);
        
        clearButton = new JButton("CLEAR");
        contentPane.add(clearButton);
 //membuat action listener untuk kedua button       
        clearButton.addActionListener(this);
        addButton.addActionListener(this);
 //tutup form saat [x] di klik       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent event){
        if(event.getSource()instanceof JButton){
            JButton clickedButton = (JButton)event.getSource();
            if(clickedButton == addButton){
                addText(inputLine.getText());
            } else{
                clearText();
            }
        } else{ //event untuk input
            addText(inputLine.getText());
        }
    }

    private void addText(String newline) {
        textArea.append(newline + NEWLINE);
        inputLine.setText("");
    }

    private void clearText() {
        textArea.setText(EMPTY_STRING);
        inputLine.setText(EMPTY_STRING);
    }  
}