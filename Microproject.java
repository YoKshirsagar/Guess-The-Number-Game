import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Microproject {
    int randomNumber;

    public void loadingPage() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 50, 560, 570);
        frame.setTitle("Guess The Number Game");
        ImageIcon img = new ImageIcon("IconImage.png");
        frame.setIconImage(img.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);
        JProgressBar pb = new JProgressBar(0, 100);
        pb.setForeground(Color.orange);
        pb.setBounds(160, 400, 200, 20);
        frame.add(pb);
        pb.setStringPainted(true);

        JLabel lb = new JLabel("Loading........");
        lb.setBounds(210, 450, 200, 20);
        lb.setFont(new Font("arial", Font.BOLD, 20));
        c.add(lb);

        ImageIcon img2 = new ImageIcon("guess.png");
        JLabel l = new JLabel(img2);
        l.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        c.add(l);

        frame.setResizable(false);
        frame.setVisible(true);

        int i = 0;
        while (i <= 100) {
            pb.setValue(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            if (i < 30)
                i = i + 5;
            else if (i < 50)
                i = i + 10;
            else if (i < 70)
                i = i + 25;
            else
                i = i + 25;

        }
        frame.dispose();
    }

    public void MenuPage() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 50, 560, 570);
        frame.setTitle("Guess The Number Game");

        Container c = frame.getContentPane();
        c.setLayout(null);
        // c.setBackground(Color.GREEN);

        JButton b = new JButton("MCQ Game");
        b.setBounds(50, 280, 100, 50);
        b.setBackground(Color.LIGHT_GRAY);
        c.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MCQ();
            }
        });

        JLabel lb = new JLabel(new ImageIcon("icon2.png"));
        lb.setBounds(183, 130, 150, 150);
        lb.setForeground(Color.orange);
        lb.setFont(new Font("arial", Font.BOLD, 20));
        c.add(lb);

        JButton b1 = new JButton("Guess Game");
        b1.setBounds(200, 280, 110, 50);
        b1.setOpaque(true);
        b1.setBackground(Color.LIGHT_GRAY);
        c.add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guess();
            }
        });

        JButton b2 = new JButton("About");
        b2.setBounds(380, 280, 110, 50);
        b2.setOpaque(true);
        b2.setBackground(Color.LIGHT_GRAY);
        c.add(b2);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                about();
            }
        });

        ImageIcon img2 = new ImageIcon("back.png");
        JLabel l = new JLabel(img2);
        l.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        c.add(l);

        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void MCQ() {
        JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 50, 560, 570);
        frame.setTitle("Guess The Number Game");
        ImageIcon img = new ImageIcon("IconImage.png");
        frame.setIconImage(img.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton b = new JButton("Regenerate Number");
        b.setBounds(200, 330, 150, 50);
        b.setBackground(Color.LIGHT_GRAY);
        c.add(b);
        b.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MCQ();
            }
        });
        JLabel lb = new JLabel("Guess the number");
        lb.setBounds(200, 150, 500, 20);
        lb.setForeground(Color.GREEN);
        lb.setFont(new Font("arial", Font.BOLD, 20));
        c.add(lb);

        JLabel lb2 = new JLabel("Generated by Computer");
        lb2.setBounds(170, 180, 500, 20);
        lb2.setForeground(Color.GREEN);
        lb2.setFont(new Font("arial", Font.BOLD, 20));
        c.add(lb2);
        randomNumberGenerate();
        int a = new Random().nextInt(4);

        JRadioButton radioButton1 = new JRadioButton();
        JRadioButton radioButton2 = new JRadioButton();
        JRadioButton radioButton3 = new JRadioButton();
        JRadioButton radioButton4 = new JRadioButton();

        if (a == 0) {
            radioButton1.setText(Integer.toString(randomNumber));
            radioButton2.setText(Integer.toString(new Random().nextInt(100)));
            radioButton3.setText(Integer.toString(new Random().nextInt(100)));
            radioButton4.setText(Integer.toString(new Random().nextInt(100)));
        }
        if (a == 1) {
            radioButton1.setText(Integer.toString(new Random().nextInt(100)));
            radioButton2.setText(Integer.toString(randomNumber));
            radioButton3.setText(Integer.toString(new Random().nextInt(100)));
            radioButton4.setText(Integer.toString(new Random().nextInt(100)));
        }
        if (a == 2) {
            radioButton1.setText(Integer.toString(new Random().nextInt(100)));
            radioButton2.setText(Integer.toString(new Random().nextInt(100)));
            radioButton3.setText(Integer.toString(randomNumber));
            radioButton4.setText(Integer.toString(new Random().nextInt(100)));
        }
        if (a == 3) {
            radioButton1.setText(Integer.toString(new Random().nextInt(100)));
            radioButton2.setText(Integer.toString(new Random().nextInt(100)));
            radioButton3.setText(Integer.toString(new Random().nextInt(100)));
            radioButton4.setText(Integer.toString(randomNumber));
        }

        radioButton1.setBounds(210, 230, 50, 20);
        radioButton1.setBackground(Color.white);
        c.add(radioButton1);

        radioButton2.setBounds(210, 260, 50, 20);
        radioButton2.setBackground(Color.white);
        c.add(radioButton2);

        radioButton3.setBounds(300, 230, 50, 20);
        radioButton3.setBackground(Color.white);
        c.add(radioButton3);

        radioButton4.setBounds(300, 260, 50, 20);
        radioButton4.setBackground(Color.white);
        c.add(radioButton4);

        radioButton1.setFont(new Font("arial", Font.BOLD, 20));
        radioButton2.setFont(new Font("arial", Font.BOLD, 20));
        radioButton3.setFont(new Font("arial", Font.BOLD, 20));
        radioButton4.setFont(new Font("arial", Font.BOLD, 20));

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        JLabel result = new JLabel("You Win");
        result.setForeground(Color.orange);
        result.setFont(new Font("arial", Font.BOLD, 20));
        result.setBounds(240, 300, 250, 20);
        c.add(result);
        result.setVisible(false);

        JLabel resultfalse = new JLabel("You Lose");
        resultfalse.setForeground(Color.orange);
        resultfalse.setFont(new Font("arial", Font.BOLD, 20));
        resultfalse.setBounds(240, 300, 250, 20);
        c.add(resultfalse);
        resultfalse.setVisible(false);

        radioButton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton1.getText().equals(Integer.toString(randomNumber))) {
                    result.setVisible(true);
                    resultfalse.setVisible(false);
                    radioButton1.setForeground(Color.GREEN);
                } else {
                    result.setVisible(false);
                    resultfalse.setVisible(true);
                    radioButton1.setForeground(Color.RED);
                    if (radioButton2.getText().equals(Integer.toString(randomNumber))) {
                        radioButton2.setForeground(Color.GREEN);
                    }
                    if (radioButton3.getText().equals(Integer.toString(randomNumber))) {
                        radioButton3.setForeground(Color.GREEN);
                    }
                    if (radioButton4.getText().equals(Integer.toString(randomNumber))) {
                        radioButton4.setForeground(Color.GREEN);
                    }
                }

                // radioButton1.setEnabled(false);
                // radioButton2.setEnabled(false);
                // radioButton3.setEnabled(false);
                // radioButton4.setEnabled(false);
            }
        });
        radioButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton2.getText().equals(Integer.toString(randomNumber))) {
                    result.setVisible(true);
                    resultfalse.setVisible(false);
                    radioButton2.setForeground(Color.GREEN);
                } else {
                    result.setVisible(false);
                    resultfalse.setVisible(true);
                    radioButton2.setForeground(Color.RED);
                    if (radioButton1.getText().equals(Integer.toString(randomNumber))) {
                        radioButton1.setForeground(Color.GREEN);
                    }
                    if (radioButton3.getText().equals(Integer.toString(randomNumber))) {
                        radioButton3.setForeground(Color.GREEN);
                    }
                    if (radioButton4.getText().equals(Integer.toString(randomNumber))) {
                        radioButton4.setForeground(Color.GREEN);
                    }
                }
                // radioButton1.setEnabled(false);
                // radioButton2.setEnabled(false);
                // radioButton3.setEnabled(false);
                // radioButton4.setEnabled(false);
            }
        });
        radioButton3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton3.getText().equals(Integer.toString(randomNumber))) {
                    result.setVisible(true);
                    resultfalse.setVisible(false);
                    radioButton3.setForeground(Color.GREEN);
                } else {
                    result.setVisible(false);
                    resultfalse.setVisible(true);
                    radioButton3.setForeground(Color.RED);
                    if (radioButton1.getText().equals(Integer.toString(randomNumber))) {
                        radioButton1.setForeground(Color.GREEN);
                    }
                    if (radioButton2.getText().equals(Integer.toString(randomNumber))) {
                        radioButton2.setForeground(Color.GREEN);
                    }
                    if (radioButton4.getText().equals(Integer.toString(randomNumber))) {
                        radioButton4.setForeground(Color.GREEN);
                    }
                }

                // radioButton1.setEnabled(false);
                // radioButton2.setEnabled(false);
                // radioButton3.setEnabled(false);
                // radioButton4.setEnabled(false);
            }
        });
        radioButton4.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton4.getText().equals(Integer.toString(randomNumber))) {
                    result.setVisible(true);
                    resultfalse.setVisible(false);
                    radioButton4.setForeground(Color.GREEN);
                } else {
                    result.setVisible(false);
                    resultfalse.setVisible(true);
                    radioButton4.setForeground(Color.RED);
                    if (radioButton1.getText().equals(Integer.toString(randomNumber))) {
                        radioButton1.setForeground(Color.GREEN);
                    }
                    if (radioButton2.getText().equals(Integer.toString(randomNumber))) {
                        radioButton2.setForeground(Color.GREEN);
                    }
                    if (radioButton3.getText().equals(Integer.toString(randomNumber))) {
                        radioButton3.setForeground(Color.GREEN);
                    }
                }

                // radioButton1.setEnabled(false);
                // radioButton2.setEnabled(false);
                // radioButton3.setEnabled(false);
                // radioButton4.setEnabled(false);
            }
        });

        ImageIcon img2 = new ImageIcon("back.png");
        JLabel l = new JLabel(img2);
        l.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        c.add(l);

        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void randomNumberGenerate() {
        Random r = new Random();
        randomNumber = r.nextInt(100);
    }

    public void guess() {
        
        JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 50, 560, 570);
        frame.setTitle("Guess The Number Game");
        ImageIcon img = new ImageIcon("IconImage.png");
        frame.setIconImage(img.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel lb1 = new JLabel("Guess the number in");
        lb1.setForeground(Color.orange);
        lb1.setFont(new Font("arial", Font.BOLD, 20));
        lb1.setBounds(175, 150, 250, 20);
        c.add(lb1);
        lb1.setVisible(true);

        JLabel lb2 = new JLabel("max 10 chances");
        lb2.setForeground(Color.orange);
        lb2.setFont(new Font("arial", Font.BOLD, 20));
        lb2.setBounds(200, 180, 250, 20);
        c.add(lb2);
        lb2.setVisible(true);

        JTextField jt1 = new JTextField();
        jt1.setForeground(Color.orange);
        jt1.setFont(new Font("arial", Font.BOLD, 20));
        jt1.setBounds(190, 220, 50, 20);
        c.add(jt1);

        JTextField jt2 = new JTextField();
        jt2.setForeground(Color.orange);
        jt2.setFont(new Font("arial", Font.BOLD, 20));
        jt2.setBounds(250, 220, 50, 20);
        c.add(jt2);

        JTextField jt3 = new JTextField();
        jt3.setForeground(Color.orange);
        jt3.setFont(new Font("arial", Font.BOLD, 20));
        jt3.setBounds(310, 220, 50, 20);
        c.add(jt3);

        JTextField jt4 = new JTextField();
        jt4.setForeground(Color.orange);
        jt4.setFont(new Font("arial", Font.BOLD, 20));
        jt4.setBounds(190, 250, 50, 20);
        c.add(jt4);

        JTextField jt5 = new JTextField();
        jt5.setForeground(Color.orange);
        jt5.setFont(new Font("arial", Font.BOLD, 20));
        jt5.setBounds(250, 250, 50, 20);
        c.add(jt5);

        JTextField jt6 = new JTextField();
        jt6.setForeground(Color.orange);
        jt6.setFont(new Font("arial", Font.BOLD, 20));
        jt6.setBounds(310, 250, 50, 20);
        c.add(jt6);

        JTextField jt7 = new JTextField();
        jt7.setForeground(Color.orange);
        jt7.setFont(new Font("arial", Font.BOLD, 20));
        jt7.setBounds(190, 280, 50, 20);
        c.add(jt7);

        JTextField jt8 = new JTextField();
        jt8.setForeground(Color.orange);
        jt8.setFont(new Font("arial", Font.BOLD, 20));
        jt8.setBounds(250, 280, 50, 20);
        c.add(jt8);

        JTextField jt9 = new JTextField();
        jt9.setForeground(Color.orange);
        jt9.setFont(new Font("arial", Font.BOLD, 20));
        jt9.setBounds(310, 280, 50, 20);
        c.add(jt9);

        JTextField jt10 = new JTextField();
        jt10.setForeground(Color.orange);
        jt10.setFont(new Font("arial", Font.BOLD, 20));
        jt10.setBounds(250, 310, 50, 20);
        c.add(jt10);

        JLabel lb3 = new JLabel("Generated number is smaller");
        lb3.setForeground(Color.orange);
        lb3.setFont(new Font("arial", Font.BOLD, 20));
        lb3.setBounds(150, 350, 300, 20);
        c.add(lb3);
        lb3.setVisible(false);

        JLabel lb4 = new JLabel("Generated number is Greater");
        lb4.setForeground(Color.orange);
        lb4.setFont(new Font("arial", Font.BOLD, 20));
        lb4.setBounds(150, 350, 300, 20);
        c.add(lb4);
        lb4.setVisible(false);

        JLabel lb5 = new JLabel("           **You Win**");
        lb5.setForeground(Color.orange);
        lb5.setFont(new Font("arial", Font.BOLD, 20));
        lb5.setBounds(150, 350, 300, 20);
        c.add(lb5);
        lb5.setVisible(false);

        JLabel lb6 = new JLabel("           **You Lose**");
        lb6.setForeground(Color.orange);
        lb6.setFont(new Font("arial", Font.BOLD, 20));
        lb6.setBounds(150, 350, 300, 20);
        c.add(lb6);
        lb6.setVisible(false);

        randomNumberGenerate();
        System.out.println(randomNumber);

        jt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // System.out.println(checkint);
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt1.getText());
                }
                catch(Exception e1){
                    b = false;
                }
                if(b){
                    if((Integer.toString(randomNumber).compareTo(jt1.getText())) > 0){
                        lb4.setVisible(true);
                        lb3.setVisible(false);
                        jt2.grabFocus();
                    }
                    else if((Integer.toString(randomNumber).compareTo(jt1.getText())) < 0){
                        lb3.setVisible(true);
                        lb4.setVisible(false);
                        jt2.grabFocus();
                    }
                    else{
                        lb4.setVisible(false);
                        lb3.setVisible(false);
                        lb5.setVisible(true);
                        jt1.setEnabled(false);
                        jt2.setEnabled(false);
                        jt3.setEnabled(false);
                        jt4.setEnabled(false);
                        jt5.setEnabled(false);
                        jt6.setEnabled(false);
                        jt7.setEnabled(false);
                        jt8.setEnabled(false);
                        jt9.setEnabled(false);
                        jt10.setEnabled(false);
                    }
                }
                else{
                    jt1.setText("");
                    jt1.grabFocus();
                }
            }
        });
        jt2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt2.getText());
                }
                catch(Exception e1){
                    b = false;
                }
                if(b){
                if((Integer.toString(randomNumber).compareTo(jt2.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt3.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt2.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt3.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt2.setText("");
                jt2.grabFocus();
            }
            }
        });
        jt3.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt3.getText());
                }
                catch(Exception e1){
                    b = false;
                }
                if(b){
                if((Integer.toString(randomNumber).compareTo(jt3.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt4.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt3.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt4.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt3.setText("");
                jt3.grabFocus();
            }
            }
        });
        jt4.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
            boolean b = true;
            try{
                checkint = Integer.parseInt(jt4.getText());
            }
            catch(Exception e1){
                b = false;
            }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt4.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt5.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt4.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt5.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt4.setText("");
                jt4.grabFocus();
            }
            }
        });
        jt5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt5.getText());
                }
                catch(Exception e1){
                    b = false;
                }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt5.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt6.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt5.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt6.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt5.setText("");
                jt5.grabFocus();
            }
            }
        });
        jt6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt6.getText());
                }
                catch(Exception e1){
                    b = false;
                }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt6.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt7.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt6.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt7.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt6.setText("");
                jt6.grabFocus();
            }
            }
        });
        jt7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt7.getText());
                }
                catch(Exception e1){
                    b = false;
                }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt7.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt8.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt7.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt8.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt7.setText("");
                jt7.grabFocus();
            }
            }
        });
        jt8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt8.getText());
                }
                catch(Exception e1){
                    b = false;
                }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt8.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt9.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt8.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt9.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt8.setText("");
                jt8.grabFocus();
            }
            }
        });
        jt9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt9.getText());
                }
                catch(Exception e1){
                    b = false;
                }
            if(b){
                if((Integer.toString(randomNumber).compareTo(jt9.getText())) > 0){
                    lb4.setVisible(true);
                    lb3.setVisible(false);
                    jt10.grabFocus();
                }
                else if((Integer.toString(randomNumber).compareTo(jt9.getText())) < 0){
                    lb3.setVisible(true);
                    lb4.setVisible(false);
                    jt10.grabFocus();
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
                }
            }
            else{
                jt9.setText("");
                jt9.grabFocus();
            }
            }
        });
        jt10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int checkint =0;
                boolean b = true;
                try{
                    checkint = Integer.parseInt(jt10.getText());
                }
                catch(Exception e1){
                    b = false;
                }
        if(b){
                if((Integer.toString(randomNumber).compareTo(jt10.getText())) > 0){
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb6.setVisible(true);
                }
                else if((Integer.toString(randomNumber).compareTo(jt10.getText())) < 0){
                    lb6.setVisible(true);
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                }
                else{
                    lb4.setVisible(false);
                    lb3.setVisible(false);
                    lb5.setVisible(true);
                }
                    jt1.setEnabled(false);
                    jt2.setEnabled(false);
                    jt3.setEnabled(false);
                    jt4.setEnabled(false);
                    jt5.setEnabled(false);
                    jt6.setEnabled(false);
                    jt7.setEnabled(false);
                    jt8.setEnabled(false);
                    jt9.setEnabled(false);
                    jt10.setEnabled(false);
            
        }
        else{
            jt10.setText("");
            jt10.grabFocus();
        }
        }
        });
       
        ImageIcon img2 = new ImageIcon("back.png");
        JLabel l = new JLabel(img2);
        l.setBounds(0, 0, img2.getIconWidth(), img2.getIconHeight());
        c.add(l);

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void about(){
        JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 50, 560, 570);
        frame.setTitle("About");
        ImageIcon img = new ImageIcon("IconImage.png");
        frame.setIconImage(img.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextArea jta = new JTextArea();
        jta.setBounds(0,0,542,540);
        String about = "\n*****************************************************************************************\n\t\tGuess The Number\n\n\tIn this game a number is generated randomly between 0 to 99 . Player shouldneed to guess that number correctly in 10 chances .If the player guess the   generated number correctly in less than 10 chances then he wins else he will lose the game.\n\n\tThe another look of this game is MCQ .Four options are shown to the player and the player should choose the correct option then player get win else he loss the game\n\n\tI would like to thank Mr Pravin Ambekar sir for their guidence that make the project sucessful\n\nThe name of this project is GUESS THE NUMBER GAME implemented by\n\t\t\t\t1) Kshirsagar Yogesh\n\n\n\n\n*****************************************************************************************\n";
        jta.setText(about);
        jta.setBackground(Color.GREEN);
        jta.setFont(new Font("arial", Font.BOLD, 15));
        jta.setEditable(false);
        jta.setLineWrap(true);
        c.add(jta);
        jta.setVisible(true);

        frame.setResizable(false);
        frame.setVisible(true);  
    }

    public static void main(String args[]) {
        Microproject m = new Microproject();
        m.loadingPage();
        m.MenuPage();
    }
}