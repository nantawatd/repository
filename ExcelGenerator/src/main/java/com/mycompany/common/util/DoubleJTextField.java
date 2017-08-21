/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.common.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Nantawat
 */
public class DoubleJTextField extends JTextField {

    public DoubleJTextField() {
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();

                if (!isNumber(ch) && !isValidSignal(ch) && !validatePoint(ch) && ch != '\b') {
                    e.consume();
                }
            }
        });

    }

    private boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private boolean isValidSignal(char ch) {
        if ((getText() == null || "".equals(getText().trim())) && ch == '-') {
            return true;
        }

        return false;
    }

    private boolean validatePoint(char ch) {
        if (ch != '.') {
            return false;
        }

        if (getText() == null || "".equals(getText().trim())) {
            setText("0.");
            return false;
        } else if ("-".equals(getText())) {
            setText("-0.");
        }

        return true;
    }
}
