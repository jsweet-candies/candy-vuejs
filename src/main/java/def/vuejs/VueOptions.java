package def.vuejs;

import jsweet.lang.Interface;
import jsweet.lang.Optional;

@Interface
public class VueOptions {

	public String el;
	public Object data;

	@Optional
	public Object methods;

	@Optional
	public Runnable updated;

	@Optional
	public Object watch;
}
