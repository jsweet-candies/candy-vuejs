package def.vuejs;

import java.util.Map;
import java.util.function.Supplier;

import def.dom.Element;
import def.js.Array;
import jsweet.lang.Interface;
import jsweet.lang.Optional;
import jsweet.util.union.Union;

@Interface
public class VueOptions {

	// Data, see https://vuejs.org/v2/api/#Options-Data

	@Optional
	public Union<Object, Supplier<Object>> data;

	@Optional
	public Union<String[], Map<String, Prop>> props;

	@Optional
	public Object propsData;

	@Optional
	public Object computed;

	@Optional
	public Object methods;

	@Optional
	public Object watch;

	// DOM, see https://vuejs.org/v2/api/#Options-DOM

	@Optional
	public Union<String, Element> el;

	@Optional
	public String template;

	@Optional
	public Object render;

	// New in Vue 2.2.0+
	@Optional
	public Object renderError;

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

	// Assets, see https://vuejs.org/v2/api/#Options-Assets

	@Optional
	public Object directives;

	@Optional
	public Object filters;

	@Optional
	public Object components;

	// Composition, see https://vuejs.org/v2/api/#Options-Composition

	@Optional
	public Vue parent;

	@Optional
	public Array<Object> mixins;
}
