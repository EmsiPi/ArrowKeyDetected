import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {

    public ArrowKeys(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();

        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel right = new JLabel();
        JLabel left = new JLabel();

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        up.setText("UP: 0 ");
        down.setText("DOWN: 0 ");
        right.setText("RIGHT: 0 ");
        left.setText("LEFT: 0 ");


        frame.addKeyListener(new KeyListener() {
            int upCount = 0;
            int downCount = 0;
            int rightCount = 0;
            int leftCount = 0;
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch(keyCode){
                    case KeyEvent.VK_UP:
                        up.setText("UP : " + Integer.toString(upCount ++));
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("DOWN : " + Integer.toString(downCount ++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("RIGHT : " + Integer.toString(rightCount ++));
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("LEFT : " + Integer.toString(leftCount ++));
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);
    }

    public static void main(String[] args){
        new ArrowKeys();
    }
}
