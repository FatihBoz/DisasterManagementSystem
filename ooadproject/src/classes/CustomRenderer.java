/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


/**
 *
 * @author gokay
 */
public class CustomRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value,int index , boolean isSelected, boolean hasFocus){
       FacilityInterface f = (FacilityInterface) value;
       setText(f.getName() + " \n" + "Adress: " + f.getAdress());
       setIcon(f.getIcon());
       System.out.println(f.getIcon());
       setIconTextGap(10);
        
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(true);
        setFont(list.getFont());
        
        return this;
    }
    
}
