package com.lonphy.mediatorpattern.example2;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ConcreteMediator {
	private JMenu menu;
	private JMenuItem copyItem,cutItem,pasteItem;
	private JTextArea text;
	public void openMenu() {
		Clipboard clipboard = text.getToolkit().getSystemClipboard();
		String selectedText = text.getSelectedText();
		if(selectedText==null) {
			copyItem.setEnabled(false);
			cutItem.setEnabled(false);
		} else {
			copyItem.setEnabled(true);
			cutItem.setEnabled(true);
		}
		boolean b = clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor);
		if(b) pasteItem.setEnabled(true);
	}
	public void paste() {
		text.paste();
	}
	public void copy() {
		text.copy();
	}
	public void cut() {
		text.cut();
	}
	public void registerMenu(JMenu menu) {
		this.menu = menu;
	}
	public void registerPasteItem(JMenuItem item) {
		pasteItem = item;
	}
	public void registerCopyItem(JMenuItem item) {
		copyItem = item;
		copyItem.setEnabled(false);
	}
	public void registerCutItem(JMenuItem item) {
		cutItem = item;
		cutItem.setEnabled(false);
	}
	public void registerText(JTextArea text) {
		this.text = text;
	}
}
