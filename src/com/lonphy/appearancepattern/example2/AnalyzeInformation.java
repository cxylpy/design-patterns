package com.lonphy.appearancepattern.example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzeInformation {
	public String getSavedContent(String content, String deleteContent) {
		Pattern p;
		Matcher m;
		p = Pattern.compile(deleteContent);
		m=p.matcher(content);
		String saveContent = m.replaceAll("");
		return saveContent;
	}
}
