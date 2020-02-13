package def.vuejs;

public class Vue extends def.js.Object {

	public Vue(VueOptions options) {
	}

	// Vue methods, see https://vuejs.org/v2/api/#Global-API

	public static native Vue extend(VueOptions options);

	public static native Vue extend(Vue vue);

	public static native Vue component(String name, VueOptions options);
	
	public static native Vue component(String name, Vue vue);
}
