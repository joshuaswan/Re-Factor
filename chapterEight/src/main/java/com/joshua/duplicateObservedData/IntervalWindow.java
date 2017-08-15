package com.joshua.duplicateObservedData;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by joshua on 2017/8/15.
 */
public class IntervalWindow extends Frame implements Observer {

    private Interval subject;

    public IntervalWindow(String title, TextField startField, TextField endField, TextField lengthField) throws HeadlessException {
        super(title);
        this.startField = startField;
        this.endField = endField;
        this.lengthField = lengthField;

        startField.setLocation(0,0);
        startField.setSize(20,20);
        endField.setLocation(20,20);
        endField.setSize(20,20);
        lengthField.setLocation(40,40);
        lengthField.setSize(20,20);

        this.add(startField);
        this.add(endField);
        this.add(lengthField);

        subject = new Interval();
        subject.addObserver(this);
        update(subject,null);
    }

    TextField startField;
    TextField endField;
    TextField lengthField;

    @Override
    public void update(Observable o, Object arg) {

    }

    class SymFocuse extends java.awt.event.FocusAdapter{
        public void focusLost(java.awt.event.FocusEvent event){
            Object object = event.getSource();
            if (object == startField)
                StartField_FocusLost(event);
            else if (object == endField)
                EndField_FocusLost(event);
            else if (object == lengthField)
                LengthField_FocusLost(event);
        }

        private void LengthField_FocusLost(FocusEvent event) {
            if (isNotInteger(lengthField.getText()))
                lengthField.setText("0");
            calculateLength();
        }

        private void EndField_FocusLost(FocusEvent event) {
            if (isNotInteger(getEnd()))
                setEnd("0");
            calculateEnd();
        }



        private void StartField_FocusLost(FocusEvent event) {
            if (isNotInteger(startField.getText()))
                startField.setText("0");
            calculateLength();
        }

        private boolean isNotInteger(String text) {
            for (int i = 0; i < text.length(); i++){
                System.out.println(text.charAt(i));
                if (!Character.isDigit(text.charAt(i))){
                    return false;
                }
            }
            return true;
        }
    }
    private void calculateEnd() {
        try {
            int start = Integer.parseInt(startField.getText());
            int length = Integer.parseInt(lengthField.getText());
            int end = start + length;
            setEnd(String.valueOf(end));
        }catch (NumberFormatException e){
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    private void calculateLength() {
        try{
            int start = Integer.parseInt(startField.getText());
            int end = Integer.parseInt(getEnd());
            int length = end -start;
            lengthField.setText(String.valueOf(length));
        }catch (NumberFormatException e){
            throw new RuntimeException("Unexpected Number Format Error");
        }
    }

    public String getEnd(){
        return subject.getEnd();
    }

    public void setEnd(String arg){
        subject.setEnd(arg);
    }
}
