package classes;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;



public class ContactRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {
    
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean hasFocus) {
        Contact c = (Contact) value;
        
        // Create a panel to hold the components
        JPanel panel = new JPanel(new BorderLayout(50, 10)); 
        
        
        JPanel textPanel = new JPanel(new GridLayout(5, 1));
        
        JLabel rLabel = new JLabel(c.getRelationship()+":");
        rLabel.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel emptyLabel = new JLabel("----");
        rLabel.setHorizontalAlignment(SwingConstants.LEFT);
    
        JLabel nameLabel = new JLabel("Name: "+c.getName());
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        JLabel surnameLabel = new JLabel("Surname: " + c.getSurname());
        surnameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        JLabel phoneNumberLabel = new JLabel("Phone Number: " + c.getPhoneNumber());
        phoneNumberLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        
        
        // Add the name and address labels to the text panel
        textPanel.add(rLabel);
        textPanel.add(emptyLabel);
        textPanel.add(nameLabel);
        textPanel.add(surnameLabel);
        textPanel.add(phoneNumberLabel);
        
        
        
        panel.add(textPanel, BorderLayout.WEST);
        
        // Set background and foreground colors based on selection
        if (isSelected) {
            panel.setBackground(list.getSelectionBackground());
            panel.setForeground(list.getSelectionForeground());
            nameLabel.setForeground(list.getSelectionForeground());
            surnameLabel.setForeground(list.getSelectionForeground());
            phoneNumberLabel.setForeground(list.getSelectionForeground());
            rLabel.setForeground(list.getSelectionForeground());
        } else {
            panel.setBackground(list.getBackground());
            panel.setForeground(list.getForeground());
            nameLabel.setForeground(list.getForeground());
            surnameLabel.setForeground(list.getForeground());
            phoneNumberLabel.setForeground(list.getForeground());
            rLabel.setForeground(list.getForeground());
        }

        return panel;
    }
}
