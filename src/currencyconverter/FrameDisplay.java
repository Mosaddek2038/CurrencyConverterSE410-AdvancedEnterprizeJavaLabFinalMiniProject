package currencyconverter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;

public class FrameDisplay {
    public FrameDisplay() {
        CurrencyData cd = new CurrencyData();
        Font flg = new Font("Eras Bold ITC", Font.BOLD, 20);
        Font fsm = new Font("Eras Bold ITC", Font.PLAIN, 15);
        //frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setBounds(400, 300, 540, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon frIcon = new ImageIcon(getClass().getResource("/image/ConL.png"));
        frame.setIconImage(frIcon.getImage());
        
        //panel
        JPanel pan = new JPanel();
        pan.setVisible(true);
        pan.setLayout(null);
        frame.add(pan);
        
        JLabel lIns = new JLabel("Select the currencies and enter amount");
        lIns.setBounds(0, 10, 500, 20);
        lIns.setHorizontalAlignment(SwingConstants.CENTER);
        lIns.setFont(flg);
        pan.add(lIns);
        
        //input group
        JLabel l1 = new JLabel("Convert from");
        l1.setBounds(20, 40, 200, 20);
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setFont(fsm);
        pan.add(l1);
        
        JComboBox CurrInBox = new JComboBox(CurrencyData.currName);
        CurrInBox.setBounds(20, 70, 200, 20);
        CurrInBox.setFont(fsm);
        pan.add(CurrInBox);
        
        JTextField tfCurrIn = new JTextField();
        tfCurrIn.setBounds(20, 100, 200, 30);
        tfCurrIn.setBorder(new LineBorder(Color.RED, 2, true));
        tfCurrIn.setDocument(new JTextFieldLimit(14));
        tfCurrIn.setFont(fsm);
        pan.add(tfCurrIn);
        
        //output group
        JLabel l2 = new JLabel("Convert to");
        l2.setBounds(310, 40, 200, 20);
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setFont(fsm);
        pan.add(l2);
        
        JComboBox CurrOutBox = new JComboBox(CurrencyData.currName);
        CurrOutBox.setBounds(310, 70, 200, 20);
        CurrOutBox.setFont(fsm);
        pan.add(CurrOutBox);
        
        JTextField tfCurrOut = new JTextField();
        tfCurrOut.setBounds(310, 100, 200, 30);
        tfCurrOut.setBorder(new LineBorder(Color.RED, 2, true));
        tfCurrOut.setFont(fsm);
        pan.add(tfCurrOut);
        
        //submit button
        JButton submit = new JButton();
        submit.setBounds(230, 70, 70, 70);
        submit.setBorder(new LineBorder(Color.black, 5, true));
        submit.setBackground(Color.BLUE);
        ImageIcon submitIcon = new ImageIcon(getClass().getResource("/image/rightarrowbutton64px.png"));
        submit.setIcon(submitIcon);
        pan.add(submit);
        
        //event handling
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CurrIn = CurrInBox.getSelectedItem().toString();
                String CurrOut = CurrOutBox.getSelectedItem().toString();
                DecimalFormat format = new DecimalFormat("#0,000.00");
                DecimalFormat formatsm = new DecimalFormat("#0.00");
                double CurrInAmount, CurrOutAmount;
                String output;
                try {
                    CurrInAmount = Double.parseDouble(tfCurrIn.getText());
                } catch (Exception ex) {
                    CurrInAmount = 0.0;
                }
                CurrOutAmount = cd.Conversion(CurrIn, CurrOut, CurrInAmount);
                //System.out.println(CurrIn+" "+CurrInAmount+" "+CurrOut+" "+CurrOutAmount);
                output = format.format(CurrOutAmount);
                if(CurrOutAmount < 1000.0)
                    output = formatsm.format(CurrOutAmount);
                tfCurrOut.setText(output);
            }
        });
    }
}
