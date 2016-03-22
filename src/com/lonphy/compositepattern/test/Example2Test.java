package com.lonphy.compositepattern.test;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import com.lonphy.compositepattern.example2.Apple;
import com.lonphy.compositepattern.example2.Compute;
import com.lonphy.compositepattern.example2.TreeBody;
import com.lonphy.compositepattern.example2.TreeComponent;

public class Example2Test extends JFrame implements TreeSelectionListener{
	private TreeComponent mainBody, branchOne, branchTwo, apple[];
	private DefaultMutableTreeNode trunk,branch1,branch2,leaf[];
	private JTree tree;
	private final static int MAX = 18;
	private JTextArea text;
	public Example2Test() {
		mainBody = new TreeBody(786,"树干");
		trunk = new DefaultMutableTreeNode(mainBody);
		branchOne = new TreeBody(45,"树枝");
		branch1 = new DefaultMutableTreeNode(branchOne);
		branchTwo = new TreeBody(25,"树枝");
		branch2 = new DefaultMutableTreeNode(branchTwo);
		apple = new Apple[MAX];
		leaf = new DefaultMutableTreeNode[MAX];
		for(int i = 0; i < MAX; i++) {
			apple[i] = new Apple(0.25,"苹果");
			leaf[i] = new DefaultMutableTreeNode(apple[i]);
		}
		mainBody.add(branchOne);
		mainBody.add(branchTwo);
		trunk.add(branch1);
		trunk.add(branch2);
		for(int i = 0; i <= 7; i++) {
			branchOne.add(apple[i]);
			branch1.add(leaf[i]);
		}
		for(int i = 8; i < MAX; i++) {
			branchTwo.add(apple[i]);
			branch2.add(leaf[i]);
		}
		tree = new JTree(trunk);
		tree.addTreeSelectionListener(this);
		text = new JTextArea(20, 20);
		text.setFont(new Font("宋体",Font.BOLD,12));
		text.setLineWrap(true);
		setLayout(new GridLayout(1,2));
		add(new JScrollPane(tree));
		add(new JScrollPane(text));
		setBounds(70,80,460,320);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		text.setText(null);
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
		TreeComponent treeComponent = (TreeComponent) node.getUserObject();
		String allName = Compute.getAllChildrenName(treeComponent);
		double weight = Compute.computeWeight(treeComponent);
		String msg = null;
		if(treeComponent.isLeaf())msg = allName+"的重量：\n"+weight+"公斤";
		else msg = allName+"加在一起的重量：\n"+weight+"公斤";
		text.append(msg+"\n");
		double unit = 4;
		double value=Compute.computeValue(treeComponent, unit);
		String name = treeComponent.toString();
		if(treeComponent.isLeaf())
			msg = name+"的价值（"+unit+"元/kg）"+value+"元";
		else msg = name+"所结苹果的价值（"+unit+"元/kg）"+value+"元";
		text.append("\n"+msg);
	}
	public static void main(String[] args) {
		new Example2Test();
	}
	
}
