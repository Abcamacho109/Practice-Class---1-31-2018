
public class Laptoptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Laptop mat = new Laptop("Apple", "Mac os", 2017);
System.out.println(mat.laptopBrand);
Laptop mat2 = new Laptop("Dell", "Windows", 2018);
System.out.println(mat2.laptopBrand);
mat2.laptopBrand = "Asos";
System.out.println(mat2.laptopBrand);
	}

}
