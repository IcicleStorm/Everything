import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {        

    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private int count4 = 0;
    private int count5 = 0;
    private int top = 0;

    //private int i = 1;
    private JButton button;
    private JButton button2;
    private JFrame frame;
    private JLabel label;
    private JLabel total;
    private JLabel highTotal;
    private JPanel panel;


    public GUI() {
        frame = new JFrame();
        button = new JButton("Roll");
        button2 = new JButton("Also roll, but cooler.");
        button.addActionListener(this);
        button2.addActionListener(this);

        label = new JLabel("Press the button");
        total = new JLabel("");
        highTotal = new JLabel("");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button2);
        panel.add(label);
        panel.add(total);
        panel.add(highTotal);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setTitle("Magic GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String args[]) {
        System.out.println("Graphical user interface UI: a redundant title");
        int j = 0;
        while(j < 1) {
            j++;
            new GUI();
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            count1 = (int)Math.ceil(Math.random() * 6);
            count2 = (int)Math.ceil(Math.random() * 6);
            count3 = (int)Math.ceil(Math.random() * 6);
            count4 = (int)Math.ceil(Math.random() * 6);
            count5 = (int)Math.ceil(Math.random() * 6);
            label.setText("Rolls: " + count1  + ", " + count2 + ", " + count3 + ", " + count4 + ", " + count5);
            total.setText("Total: " + (count1 + count2 + count3 + count4 + count5));
            if ((count1 + count2 + count3 + count4 + count5) > top) {
                top = (count1 + count2 + count3 + count4 + count5);
                highTotal.setText("Highest Roll: " + top + " (" + count1  + ", " + count2 + ", " + count3 + ", " + count4 + ", " + count5 + ")");
            }
        }
    }