import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Quiz implements ActionListener {

    String[] questions = {
                            "Who got the most Ballon d'Or?",
                            "Who won the first football world cup?",
                            "Which player scored more goals in the FIFA world cup?",
                            "In the 2010 world cup who was the captain of Spain?"
                        };
    String[][] options = {
                                {"Messi","Ronaldo","Benzema","Neymar"},
                                {"Argentina","Uruguay","Brazil","Germany"},
                                {"Mart","Nunez","Miroslav Klose","Haaland"},
                                {"Xavi","Sergio Ramos","Ferran Torres","Iker Casillas"}
                        };
    char[] answers =    {
                            'A',
                            'B',
                            'C',
                            'D'
                        };
    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int second=10;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea Textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();


    public Quiz(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0,0,650,50);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        Textarea.setBounds(0,50,650,50);
        Textarea.setLineWrap(true);
        Textarea.setWrapStyleWord(true);
        Textarea.setBackground(new Color(25,25,25));
        Textarea.setForeground(new Color(25,255,0));
        Textarea.setFont(new Font("MV Boli",Font.BOLD,25));
        Textarea.setBorder(BorderFactory.createBevelBorder(1));
        Textarea.setEditable(false);

        buttonA.setBounds(0,100,100,100);
        buttonA.setFont(new Font("MV Boil",Font.BOLD,35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
        buttonC.setText("C");
		
        buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelA.setBounds(125,100,500,100);
        answer_labelA.setBackground(new Color(50,50,50));
        answer_labelA.setForeground(new Color(25,255,0));
        answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));
   
        answer_labelB.setBounds(125,200,500,100);
        answer_labelB.setBackground(new Color(50,50,50));
        answer_labelB.setForeground(new Color(25,255,0));
        answer_labelB.setFont(new Font("MV Boli",Font.PLAIN,35));

        answer_labelC.setBounds(125,300,500,100);
        answer_labelC.setBackground(new Color(50,50,50));
        answer_labelC.setForeground(new Color(25,255,0));
        answer_labelC.setFont(new Font("MV Boli",Font.PLAIN,35));

        answer_labelD.setBounds(125,400,500,100);
        answer_labelD.setBackground(new Color(50,50,50));
        answer_labelD.setForeground(new Color(25,255,0));
        answer_labelD.setFont(new Font("MV Boli",Font.PLAIN,35));


        frame.add(Textarea);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textfield);
        frame.setVisible(true);

        nextQuestion();

    }
    public void nextQuestion(){

        if(index>=total_questions){
        }
        else{
            textfield.setText("Question "+ (index+1));
            Textarea.setText(questions[index]);
         
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
        }

    }
    public void actionPerformed(ActionEvent e){

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(e.getSource()==buttonA){
            answer= 'A';
            if(answer == answers [index]){
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonB){
            answer= 'B';
            if(answer == answers [index]){
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonC){
            answer= 'C';
            if(answer == answers [index]){
                correct_guesses++;
            }
        }
        if(e.getSource()==buttonD){
            answer= 'D';
            if(answer == answers [index]){
                correct_guesses++;
            }
        }
        displayAnswer();
        

    }
    public void displayAnswer(){

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(answers[index] !='A')
        answer_labelA.setForeground(new Color(255,0,0));
        if(answers[index] !='B')
        answer_labelB.setForeground(new Color(255,0,0));
        if(answers[index] !='C')
        answer_labelC.setForeground(new Color(255,0,0));
        if(answers[index] !='D')
        answer_labelD.setForeground(new Color(255,0,0));

        Timer pause = new Timer(2000, new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                
                answer_labelA.setForeground(new Color(25,255,0));
                answer_labelB.setForeground(new Color(25,255,0));
                answer_labelC.setForeground(new Color(25,255,0));
                answer_labelD.setForeground(new Color(25,255,0));

                answer = ' ';
                second=10;
                //second_left.setText(String.valueOf(second));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        });
        pause.setRepeats(false);
        pause.start();
        
        
    }
    public void results(){
        
    }
}
