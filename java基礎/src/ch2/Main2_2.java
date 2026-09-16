package ch2;

public class Main2_2 {
	public static void main(String[] arges) {
		System.out.println("私の好きな符号は二重引用符です(\")");
		//好きな記号をアピールするコード
		System.out.println("私の好きな符号は\n二重引用符です(\")");
		//好きな記号を改行してアピールするコード

		String prof1 = "名前：朝香あゆみ\n	(アサカアミ)";
		String prof2 = """
					名前：湊雄輔
					(ミナトユウスケ)　
				""";
		System.out.println(prof1);
		System.out.println(prof2);
		//名前を表示するコード
	}
}