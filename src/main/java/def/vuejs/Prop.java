package def.vuejs;

import jsweet.lang.Interface;

@Interface
public class Prop {
	public boolean required;
	/**
	 * One of String, Number, Boolean, Array, Object, Date, Function, Symbol
	 */
	public String type;
}
