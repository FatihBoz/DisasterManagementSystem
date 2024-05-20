package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

public class CustomRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean hasFocus) {
        FacilityInterface f = (FacilityInterface) value;
        
        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout(10, 10)); // 10px gap
        
        // Create label for the icon
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(f.getIcon());
        
        // Create a panel for the text
        JPanel textPanel = new JPanel(new GridLayout(2, 1)); // 2 rows, 1 column
        
        // Create labels for the name and address
        JLabel nameLabel = new JLabel(f.getName());
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        JLabel addressLabel = new JLabel("Address: " + f.getAdress());
        addressLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        // Add the name and address labels to the text panel
        textPanel.add(nameLabel);
        textPanel.add(addressLabel);
        
        // Add the icon label and text panel to the main panel
        panel.add(iconLabel, BorderLayout.WEST);
        panel.add(textPanel, BorderLayout.CENTER);
        
        // Set background and foreground colors based on selection
        if (isSelected) {
            panel.setBackground(list.getSelectionBackground());
            panel.setForeground(list.getSelectionForeground());
            nameLabel.setForeground(list.getSelectionForeground());
            addressLabel.setForeground(list.getSelectionForeground());
        } else {
            panel.setBackground(list.getBackground());
            panel.setForeground(list.getForeground());
            nameLabel.setForeground(list.getForeground());
            addressLabel.setForeground(list.getForeground());
        }

        return panel;
    }
}
