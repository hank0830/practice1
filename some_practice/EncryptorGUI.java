import java.awt.*;
import javax.swing.*;
import java.util.*;
 
public class EncryptorGUI {
    private JFrame frame;
    private String[] name;
    private int att[][];
    private ArrayList<JComponent> GUIComponent;
     
    public EncryptorGUI() {
        int fill[]  =  { GridBagConstraints.BOTH,
                         GridBagConstraints.VERTICAL,
                         GridBagConstraints.HORIZONTAL,
                         GridBagConstraints.NONE};
        int anchor[] = { GridBagConstraints.CENTER,
                         GridBagConstraints.EAST,
                         GridBagConstraints.SOUTHEAST,
                         GridBagConstraints.SOUTH,
                         GridBagConstraints.SOUTHWEST,
                         GridBagConstraints.WEST,
                         GridBagConstraints.NORTHWEST,
                         GridBagConstraints.NORTH,
                         GridBagConstraints.NORTHEAST};
        String n[] = {"Input", 
                      "Output", 
                      "hint...", 
                      "New", 
                      "Load", 
                      "Save", 
                      "Encode", 
                      "Decode", 
                      "Clear", 
                      "Copy"};
        name = n;
        int a[][] = {{0, 0, 1, 1, 0, 0, fill[3], anchor[5]}, 
                     {0, 1, 1, 1, 0, 0, fill[3], anchor[5]}, 
                     {0, 3, 7, 1, 0, 0, fill[3], anchor[5]}, 
                     {1, 0, 6, 1, 0, 0, fill[0], anchor[5]},
                     {1, 1, 6, 1, 0, 0, fill[0], anchor[5]}, 
                     {0, 2, 1, 1, 0, 0, fill[0], anchor[0]}, 
                     {1, 2, 1, 1, 0, 0, fill[0], anchor[0]}, 
                     {2, 2, 1, 1, 0, 0, fill[0], anchor[0]},
                     {3, 2, 1, 1, 0, 0, fill[0], anchor[0]}, 
                     {4, 2, 1, 1, 0, 0, fill[0], anchor[0]}, 
                     {5, 2, 1, 1, 0, 0, fill[0], anchor[0]}, 
                     {6, 2, 1, 1, 0, 0, fill[0], anchor[0]}};
        att = a;
        frame = new JFrame();
        GUIComponent = new ArrayList<JComponent>(12);
    }
     
    public void run() {
        frame.setSize(600, 160);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        int i;
        for (i = 0; i < 3; i++) {
            JLabel nLabel = new JLabel(name[i]);
            GUIComponent.add(nLabel);
        }
        for (i = 0; i < 2; i++) {
            JTextField nText = new JTextField("", 32);
            GUIComponent.add(nText);
        }
        for (i = 3; i < 10; i++) {
            JButton nButton = new JButton(name[i]);
            GUIComponent.add(nButton);
        }
        for (i = 0; i < GUIComponent.size(); i++) {
            addComponent(i);
        } 
         
        frame.setVisible(true);
    }
 
    private void addComponent(int i) {
        GridBagConstraints c = new GridBagConstraints();
        int a[] = att[i]; 
         
        c.gridx = a[0];
        c.gridy = a[1];
        c.gridwidth = a[2];
        c.gridheight = a[3];
        c.weightx = a[4];
        c.weighty = a[5];
        c.fill = a[6];
        c.anchor = a[7];
        frame.add(GUIComponent.get(i), c);
    }
 
}
     