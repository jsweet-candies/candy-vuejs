package def.vuejs;

import java.util.function.Consumer;

public class Vue extends def.js.Object {

	public Vue(VueOptions options) {
	}

	// Vue methods, see https://vuejs.org/v2/api/#Global-API

	public static native Vue extend(VueOptions options);

	public static native Vue extend(Vue vue);

	public static native Vue component(String name, VueOptions options);

	public static native Vue component(String name, Vue vue);

	public static native void use(Object object);

	public static native void use(Runnable installFunction);

	public native void $on(String event, Consumer<Object> callback);

	public native void $emit(String event, Object eventParam);

	public native void $emit(String event);
}
