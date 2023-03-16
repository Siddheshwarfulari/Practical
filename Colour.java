public class Colour {
public static void main(String[] args) {

ArrayList<String> color_list = new ArrayList<String>();
color_list.add("Red");
color_list.add("Blue");
color_list.add("Green");
color_list.add("Yellow");
color_list.add("Orange");

System.out.println("Size of list: " + color_list.size());
for (String value : color_list) {
System.out.println("Color = " + value);

}
Object[] obj = color_list.toArray();
System.out.println("Print elements from first to last:");
for (Object value : obj) {
System.out.println("Color = " + value);

}
}
}