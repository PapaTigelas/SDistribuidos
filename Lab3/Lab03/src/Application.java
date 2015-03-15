import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/*
 * TODO: 1 - Guardar os metodos que têm setup anotado
 * 		 2 - Percorrer cada metodo anotado com Test e chamar os setups guardados conforme os parametros da anotacao Test
 * 
 */


public class Application {

	private Map<String, Method> setups = new HashMap<String, Method>();

	public static void main(String[] args) {
		int passed = 0;
		int failed = 0;
		if (args.length < 1) {
			System.err.println("Error: java Application <ClassName>");
			return;
		}
		try {
			for (Method m : Class.forName(args[0]).getDeclaredMethods()) {
				m.setAccessible(true);
				if (m.isAnnotationPresent(Test.class)) {	
					try {
						m.invoke(null);
						passed++;
						System.out.println(m + " OK!");
					} catch (IllegalAccessException e) {
						failed++;
						System.out.println(m + " failed");
						System.out.printf("Test %s failed: %s %n", m,
								e.getCause());
					} catch (IllegalArgumentException e) {
						failed++;
						System.out.println(m + " failed");
						System.out.printf("Test %s failed: %s %n", m,
								e.getCause());
					} catch (InvocationTargetException e) {
						failed++;
						System.out.println(m + " failed");
						System.out.printf("Test %s failed: %s %n", m,
								e.getCause());
					}
				}

			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.printf("Passed: %d, Failed %d%n", passed, failed);

	}
}
