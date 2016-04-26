
import java.io.*;
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
public class FileTest
{
	public static void main(String[] args)
	{
		/*// �Ե�ǰ·��������һ��File����
		File file = new File("."); 
		// ��ȡ�������ļ��ľ���·��
		System.out.println("��ȡ�������ļ��ľ���·����"+file.getAbsolutePath());
		// ֱ�ӻ�ȡ�ļ��������һ��
		System.out.println("ֱ�ӻ�ȡ�ļ��������һ�㣬"+file.getName());
		// ��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println("��ȡ���·���ĸ�·�����ܳ�������������null��"+file.getParent());
		// ��ȡ����·��
		System.out.println("��ȡ����·����"+file.getAbsoluteFile());
		// ��ȡ��һ��·��
		System.out.println("��ȡ��һ��·����"+file.getAbsoluteFile().getParent());*/
		
		
		try {
			File file1 = new File(".");
			System.out.println("getPath is "+file1.getPath());
			System.out.println("getAbsolutePath is "+file1.getAbsolutePath());
			//file1.mkdir();
			if(file1.isDirectory()){
				System.out.println("file1 is directory");
			}
			if(file1.isFile()){
				System.out.println("file1 is file");
			}
			if(file1.isAbsolute()){
				System.out.println("file1 is absolute");
			}
			System.out.println(file1);
			if (!file1.exists()) {
				file1.createNewFile();
			}else{
				System.out.println("exists");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
/*		// �ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = File.createTempFile("aaa", ".txt", file);
		// ָ����JVM�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		// ��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile�����Ƿ���ڣ�" + newFile.exists());
		// ��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		// ��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ����ڣ�
		// �������淽������false�����޷�������Ŀ¼
		newFile.mkdir();
		// ʹ��list()�������г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		System.out.println("====��ǰ·���������ļ���·������====");
		for (String fileName : fileList)
		{
			System.out.println(fileName);
		}
		// listRoots()��̬�����г����еĴ��̸�·����
		File[] roots = File.listRoots();
		System.out.println("====ϵͳ���и�·������====");
		for (File root : roots)
		{
			System.out.println(root);
		}*/
	}
}

