import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tryagain extends JFrame{
    TryAgain(){

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 45));

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 45));

        // Event Handlers 
        tryAgainEventHandler handler = new tryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        

        ExitHandler Exithandler = new ExitHandler();
        exitButton.addActionListener(Exithandler);

  
        this.add(tryAgainButton);
        this.add(exitButton);
        this.setLayout(new FlowLayout());
    
        // Frame title
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snakes");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(350, 450);
        // Puts frame in the middle 
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // set Background color
        this.getContentPane().setBackground(Color.WHITE);
    }

    // Event Handler
    private class tryAgainEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame
            new GameFrame();

            // Closes frame
            dispose();

        }
    }
        private class ExitHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){

            dispose();
        }

    }
}
