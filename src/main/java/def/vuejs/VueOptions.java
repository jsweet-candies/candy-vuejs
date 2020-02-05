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
	public Object watch;

	// Lifecycle Hooks, see https://vuejs.org/v2/api/#Options-Lifecycle-Hooks

	@Optional
	public Runnable beforeCreate;

	@Optional
	public Runnable created;

	@Optional
	public Runnable beforeMount;

	@Optional
	public Runnable mounted;

	@Optional
	public Runnable beforeUpdate;

	@Optional
	public Runnable updated;

	@Optional
	public Runnable activated;

	@Optional
	public Runnable deactivated;

	@Optional
	public Runnable beforeDestroy;

	@Optional
	public Runnable destroyed;

	// New in Vue 2.5.0+
	@Optional
	public Runnable errorCaptured;
}
