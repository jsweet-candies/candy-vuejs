package def.vuejs;

import java.util.function.Consumer;

public class Vue<DataClass> extends def.js.Object {

	public DataClass $data;

	public Vue(VueOptions options) {
	}

	// Vue methods, see https://vuejs.org/v2/api/#Global-API

	public static native <T> Vue<T> extend(VueOptions options);

	public static native <T, TS> Vue<T> extend(Vue<TS> vue);

	public static native <T> Vue<T> component(String name, VueOptions options);

	public static native <T, TS> Vue<T> component(String name, Vue<TS> vue);

	public static native void use(Object object);

	public static native void use(Runnable installFunction);

	public native void $on(String event, Consumer<Object> callback);

	public native void $emit(String event, Object eventParam);

	public native void $emit(String event);
}
