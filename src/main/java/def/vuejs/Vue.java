package def.vuejs;

public class Vue extends def.js.Object {
	public Vue(VueOptions options) {
	}

	/**
	 * 
	 * @param name
	 * @param component
	 */
	public static native <T> void component(String name, Component<?> component);

	public VueRootJS $root;
}
