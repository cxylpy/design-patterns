package com.lonphy.mediatorpattern.test;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.lonphy.mediatorpattern.example2.ConcreteMediator;

public class Example2Test extends JFrame{
	private ConcreteMediator mediator;
	private JMenuBar bar;
	private JMenu menu;
	private JMenuItem copyItem,cutItem,pasteItem;
	private JTextArea text;
	public Example2Test() throws HeadlessException {
		super();
		mediator = new ConcreteMediator();
		bar = new JMenuBar();
		menu = new JMenu("编辑");
		menu.addMenuListener(new MenuListener() {
			
			@Override
			public void menuSelected(MenuEvent e) {
				mediator.openMenu();
			}
			
			@Override
			public void menuDeselected(MenuEvent e) {
				
			}
			
			@Override
			public void menuCanceled(MenuEvent e) {
				
			}
		});
		copyItem = new JMenuItem("复制");
		copyItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.copy();
			}
		});
		cutItem = new JMenuItem("剪切");
		cutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.cut();
			}
		});
		pasteItem = new JMenuItem("粘贴");
		pasteItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mediator.paste();
			}
		});
		text = new JTextArea();
		bar.add(menu);
		menu.add(cutItem);
		menu.add(copyItem);
		menu.add(pasteItem);
		setJMenuBar(bar);
		add(text,BorderLayout.CENTER);
		register();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void register() {
		mediator.registerCopyItem(copyItem);
		mediator.registerCutItem(cutItem);
		mediator.registerMenu(menu);
		mediator.registerPasteItem(pasteItem);
		mediator.registerText(text);
	}
	public static void main(String[] args) {
		Example2Test test = new Example2Test();
		test.setBounds(100,200,300,300);
		test.setVisible(true);
	}
}
