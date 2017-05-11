package com.yb.test.jgit;

import org.eclipse.jgit.diff.*;

import java.io.*;

/**
 * Created by Administrator on 2017/04/13 0013.
 */
public class Test {
	public static void main(String[] args) {
		File o = new File("C:\\Users\\Administrator\\Desktop\\out.txt");
		OutputStream out;
		//		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			out = new FileOutputStream(o);
			RawText rt1 = new RawText(new File("C:\\Users\\Administrator\\Desktop\\text1.txt"));
			RawText rt2 = new RawText(new File("C:\\Users\\Administrator\\Desktop\\text2.txt"));
			EditList diffList = new EditList();
			diffList.addAll(new HistogramDiff().diff(RawTextComparator.DEFAULT, rt1, rt2));
			new DiffFormatter(out).format(diffList, rt1, rt2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
