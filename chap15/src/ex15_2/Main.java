package ex15_2;

public class Main {

	public static void main(String[] args) {
		String folder1 = "c:\\javadev";
		String folder2 = "c:\\user\\";
		String file = "readme.txt";
		System.out.println(concatPath(folder1, file));
		System.out.println(concatPath(folder2, file));
	}
	public static String concatPath(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;
	}

}
