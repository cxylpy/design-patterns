package com.lonphy.strategypattern.example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StrategyTwo implements EncryptStrategy{
	private String password;
	
	public StrategyTwo(String password) {
		this.password = password;
	}

	@Override
	public void encryptFile(File file) {
		try {
			byte[] a= password.getBytes();
			FileInputStream fis = new FileInputStream(file);
			long length = file.length();
			byte[] c= new byte[(int) length];
			int m = fis.read(c);
			for(int i = 0; i < m; i++) {
				int n = c[i]^a[i%a.length];
				c[i] = (byte) n;
			}
			fis.close();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(c,0,m);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String decryptFile(File file) {
		try {
			byte[] a = password.getBytes();
			long length = file.length();
			FileInputStream fis = new FileInputStream(file);
			byte[] c = new byte[(int) length];
			int m = fis.read(c);
			for(int i = 0; i < m;i++) {
				int n = c[i] ^ a[i%a.length];
				c[i] = (byte) n;
			}
			fis.close();
			return new String(c,0,m);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
