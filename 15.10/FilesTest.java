
import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;
import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FilesTest
{
	public static void main(String[] args) 
		throws Exception
	{
		// �����ļ�
		Files.copy(Paths.get("15.10/FilesTest.java") 
			, new FileOutputStream("a.txt"));
		// �ж�FilesTest.java�ļ��Ƿ�Ϊ�����ļ�
		System.out.println("FilesTest.java�Ƿ�Ϊ�����ļ���"
			+ Files.isHidden(Paths.get("15.10/FilesTest.java")));
		// һ���Զ�ȡFilesTest.java�ļ���������
		List<String> lines = Files.readAllLines(Paths
			.get("15.10/FilesTest.java"), Charset.forName("gbk"));
		System.out.println(lines);
		// �ж�ָ���ļ��Ĵ�С
		System.out.println("FilesTest.java�Ĵ�СΪ��"
			+ Files.size(Paths.get("15.10/FilesTest.java")));
		List<String> poem = new ArrayList<>();
		poem.add("ˮ��̶������Ծ");
		poem.add("������б̸ͺ�");
		// ֱ�ӽ�����ַ�������д��ָ���ļ���
		Files.write(Paths.get("pome.txt") , poem 
			, Charset.forName("gbk"));
		FileStore cStore = Files.getFileStore(Paths.get("C:"));
		// �ж�C�̵��ܿռ䣬���ÿռ�
		System.out.println("C:���пռ䣺" + cStore.getTotalSpace());
		System.out.println("C:���ÿռ䣺" + cStore.getUsableSpace());
	}
}