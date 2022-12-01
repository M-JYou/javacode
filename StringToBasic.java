// 演示字符串转基本数据类型
public class StringToBasic {
  public static void main(String[] args) {
    String str1 = "123";
    String str2 = "hello";
    int n1 = Integer.parseInt(str1);
    int n2 = Integer.parseInt(str2);
    System.out.println(n1);//数值型字符串可以转化为整型数据类型。
    System.out.println(n2);//字母型字符串并不能转化为整型数据类型。
  }
}
