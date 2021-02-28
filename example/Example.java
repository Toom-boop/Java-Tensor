public class Debug {
	public static void main(String[] args) {
		
		Tensor a = new Tensor();
		a.set(new Point(0, 0), 3);
		a.set(new Point(0, 1), 3);
		a.set(new Point(0, 2), 3);
		a.set(new Point(1, 0), 3);
		a.set(new Point(1, 1), 3);
		a.set(new Point(1, 2), 3);
		
		Tensor b = new Tensor();
		b.set(new Point(0, 0), 2);
		b.set(new Point(0, 1), 2);
		b.set(new Point(1, 0), 2);
		b.set(new Point(1, 1), 2);
		b.set(new Point(2, 0), 2);
		b.set(new Point(2, 1), 2);
		
		/* a
		 * 
		 * 3 3 3
		 * 3 3 3
		 */
		
		System.out.println("a: " + a);
		
		/* b
		 * 
		 * 2 2
		 * 2 2
		 * 2 2
		 */
		
		System.out.println("b: " + b);
		
		/* a + b
		 * 
		 * 5 5 3
		 * 5 5 3
		 * 2 2 0
		 */
		
		System.out.println("a + b: " + a.add(b));
		
		/* a - b
		 * 
		 * 1 1 3
		 * 1 1 3
		 * -2 -2 +0
		 */
		
		System.out.println("a - b: " + a.subtract(b));
		
		/* a * b
		 * 
		 * 6 6 0
		 * 6 6 0
		 * 0 0 0
		 */
		
		System.out.println("a * b: " + a.multiply(b));
		
		/* a / b
		 * 
		 * 1.5 1.5 Infinity
		 * 1.5 1.5 Infinity
		 * 0 0 NaN
		 */
		
		System.out.println("a / b: " + a.divide(b));
	}
}
