
import javax.swing.JFrame;


public class Main extends JFrame {

    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Breakout ball by Maxim and Lior =)");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);


    }




}