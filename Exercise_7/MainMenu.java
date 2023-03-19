import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    MainMenu(){

        // Jlabel
        JLabel imageLabel = new JLabel();

        // Image downloaded from the internet
        ImageIcon BGImage = new ImageIcon ("snake gesture.gif");

        // Set image to label 
        imageLabel.setIcon(BGImage);


        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Arial", Font.BOLD, 25));

        // Add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);


         // Add label to frame
         this.add(imageLabel);
         this.add(startButton);

        //Frame title
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
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame 
            new ColorMenu();

            // Closes frame
            dispose();
        
        }
    }

}
