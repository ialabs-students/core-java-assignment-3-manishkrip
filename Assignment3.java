package assigment;

public class WrapperClassConvert 
{
	public static void main(String[] args) {

		int a = 10;// primitive data type
		// convertToWrapper(a);)
		System.out.println("After converting into wrapper object: " + convertToWrapper(a));
	}

	public static Object convertToWrapper(Object value) {

		Class valueClass = value.getClass();

		if (value == null || valueClass.isPrimitive()) {
			System.out.println("Give proper primitive as input");
		}

		Integer Obj = Integer.valueOf((int) value);
		if (Obj instanceof Integer) {
			return Obj;
		} else {
			System.out.println("Give proper primitive as input");
		}
	
		return Obj;

	}
}
