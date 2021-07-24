import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatorForm {

    private double total1 = 0.0;
    private double total2 = 0.0;

    private JPanel calculatorForm;
    private JTextField textDisplay;
    private String previousAction = "";

    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;

    public calculatorForm() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePreviousAction();
                previousAction="+";
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePreviousAction();
                textDisplay.setText(Double.toString(total1));
                previousAction="";
                //total1= 0.0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0.0;
                previousAction="";
                textDisplay.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if(textDisplay.getText().contains(".")){
                    //do nothing
                }
                else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePreviousAction();
                previousAction="-";
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePreviousAction();
                previousAction="/";
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatePreviousAction();
                previousAction="*";
            }
        });
    }

    public void calculatePreviousAction(){
        if(previousAction.equals("+")){
            total1 = total1 + Double.parseDouble(textDisplay.getText());
        }
        else if(previousAction.equals("-")){
            total1 = total1 - Double.parseDouble(textDisplay.getText());
        }
        else if(previousAction.equals("/")){
            total1 = total1 / Double.parseDouble(textDisplay.getText());
        }
        else if(previousAction.equals("*")){
            total1 = total1 * Double.parseDouble(textDisplay.getText());
        }
        else total1=Double.parseDouble(textDisplay.getText());
        System.out.println(total1);
        textDisplay.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatorForm");
        frame.setContentPane(new calculatorForm().calculatorForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
