package def.vuejs;

import java.util.function.Supplier;

import jsweet.lang.Interface;
import jsweet.lang.Optional;

@Interface
public class Component<T> {

	@Optional
	public Supplier<T> data;

	@Optional
	public Object methods;

	@Optional
	public String template;
}
