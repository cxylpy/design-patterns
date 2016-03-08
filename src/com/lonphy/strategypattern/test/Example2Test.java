package com.lonphy.strategypattern.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.lonphy.strategypattern.example2.EncodeContext;
import com.lonphy.strategypattern.example2.StrategyOne;
import com.lonphy.strategypattern.example2.StrategyTwo;

public class Example2Test {
	@Test
	public void testMain() {
		File file1 = new File("A.txt");
		File file2 = new File("B.txt");
		String s = "";
		EncodeContext encode = new EncodeContext();
		encode.setStrategy(new StrategyOne("hello"));
		encode.encryptFile(file1);
		try {
			System.out.println(file1.getName()+"加密后的内容：");
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str = encode.decryptFile(file1);
		System.out.println(file1.getName()+"解密后的内容:");
		System.out.println(str);
		try {
			encode.setStrategy(new StrategyTwo("nice to meet you"));
			encode.encryptFile(file2);
			System.out.println(file2.getName()+"加密后的内容：");
			FileReader fr = new FileReader(file2);
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		str = encode.decryptFile(file2);
		System.out.println(file2.getName()+"解密后的内容：");
		System.out.println(str);
	}
}
