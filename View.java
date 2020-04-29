import javax.swing.*;
import java.awt.*;
class View {
    void view(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());
        panel.setSize(700, 500);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,3));

        JPanel hPanel = new JPanel();
        hPanel.setLayout(new GridLayout(7,2));

        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setSize(700, 70);
        panel.add(textField, BorderLayout.NORTH);

        JButton buttonOne = new JButton("1");
        buttonOne.addActionListener(e -> textField.setText(textField.getText() + "1"));
        JButton buttonTwo = new JButton("2");
        buttonTwo.addActionListener(e -> textField.setText(textField.getText() + "2"));
        JButton buttonThree = new JButton("3");
        buttonThree.addActionListener(e -> textField.setText(textField.getText() + "3"));
        JButton buttonFour = new JButton("4");
        buttonFour.addActionListener(e -> textField.setText(textField.getText() + "4"));
        JButton buttonFive = new JButton("5");
        buttonFive.addActionListener(e -> textField.setText(textField.getText() + "5"));
        JButton buttonSix = new JButton("6");
        buttonSix.addActionListener(e -> textField.setText(textField.getText() + "6"));
        JButton buttonSeven = new JButton("7");
        buttonSeven.addActionListener(e -> textField.setText(textField.getText() + "7"));
        JButton buttonEight = new JButton("8");
        buttonEight.addActionListener(e -> textField.setText(textField.getText() + "8"));
        JButton buttonNine = new JButton("9");
        buttonNine.addActionListener(e -> textField.setText(textField.getText() + "9"));
        JButton buttonZero = new JButton("0");
        buttonZero.addActionListener(e -> textField.setText(textField.getText() + "0"));

        panel.add(buttonZero, BorderLayout.SOUTH);

        gridPanel.add(buttonOne);
        gridPanel.add(buttonTwo);
        gridPanel.add(buttonThree);
        gridPanel.add(buttonFour);
        gridPanel.add(buttonFive);
        gridPanel.add(buttonSix);
        gridPanel.add(buttonSeven);
        gridPanel.add(buttonEight);
        gridPanel.add(buttonNine);

        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(e -> textField.setText(textField.getText() + " + "));
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(e -> textField.setText(textField.getText() + " - "));
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(e -> textField.setText(textField.getText() + " * "));
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(e -> textField.setText(textField.getText() + " / "));
        JButton buttonDot = new JButton(".");
        buttonDot.addActionListener(e -> textField.setText(textField.getText() + " . "));
        JButton buttonSquare = new JButton("^");
        buttonSquare.addActionListener(e -> textField.setText(textField.getText() + " ^ "));
        JButton buttonEquals = new JButton("=");
        buttonEquals.addActionListener(e -> {
            String a = textField.getText();
            textField.setText(" ");
            String result = Model.count(Model.prepare(a));
            textField.setText(result);
        });
        JButton buttonPi = new JButton("π");
        buttonPi.addActionListener(e -> textField.setText(textField.getText() + Math.PI));
        JButton buttonE = new JButton("e");
        buttonPi.addActionListener(e -> textField.setText(textField.getText() + Math.E));
        JButton buttonLog = new JButton("log");
        buttonLog.addActionListener(e -> textField.setText(textField.getText() + " log "));
        JButton buttonLn = new JButton("ln");
        buttonLn.addActionListener(e -> textField.setText(textField.getText() + " ln "));
        JButton buttonOpeningBracket = new JButton("(");
        buttonOpeningBracket.addActionListener(e -> textField.setText(textField.getText() + " ( "));
        JButton buttonClosingBracket = new JButton(")");
        buttonClosingBracket.addActionListener(e -> textField.setText(textField.getText() + " ) "));

        hPanel.add(buttonPlus);
        hPanel.add(buttonMinus);
        hPanel.add(buttonMultiply);
        hPanel.add(buttonDivide);
        hPanel.add(buttonDot);
        hPanel.add(buttonSquare);

        hPanel.add(buttonPi);
        hPanel.add(buttonE);
        hPanel.add(buttonLog);
        hPanel.add(buttonLn);
        hPanel.add(buttonOpeningBracket);
        hPanel.add(buttonClosingBracket);
        hPanel.add(buttonEquals);

        JButton buttonAC = new JButton("AC");
        buttonAC.addActionListener(e -> textField.setText(""));

        panel.add(buttonAC, BorderLayout.WEST);

        panel.add(gridPanel, BorderLayout.CENTER);
        panel.add(hPanel, BorderLayout.EAST);
        //frame.setDefaultCloseOperation();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}

