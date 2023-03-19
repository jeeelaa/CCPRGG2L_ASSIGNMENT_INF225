import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;

public class Colormenu extends JFrame{

    // Color name array
    private String[] colorNameArray = {"BLUE", "GRAY", "GREEN", "BLACK"};
    // Color list array
    private Color[] colorListArray = {Color.BLUE, Color.GRAY, Color.GREEN, Color.BLACK};

    // JLIst
    JList colorList;
    
    ColorMenu(){
        // JLabel
        JLabel label = new JLabel();
        label.setText("Choose your color: ");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));

        // Allows only once selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Add Event Handler
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        // Add list to frame 
        this.add(colorList);

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

    private class EventHandler implements ListSelectionListener{
        
        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            // open game frame
            new GameFrame();
            // close game frame
            dispose();
        }
    }
    
}
