import javax.swing.JFrame;

public class Gameframe extends JFrame {

    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snakes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
