package chapt02;

public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Full memory value: " + rt.totalMemory());
		System.out.println("Free memory: " + rt.freeMemory());
		double d[] = new double[10000];
		System.out.println("Free memory after array init: " + rt.freeMemory());
		ProcessBuilder pb = new ProcessBuilder("mspaint", "c:\\temp\\cow.gif");
		
		try {
			pb.start();
		} catch (java.io.IOException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Free memory after run mspaint: " + rt.freeMemory());
		System.out.println("Comand list: " + pb.command());
	}

}
