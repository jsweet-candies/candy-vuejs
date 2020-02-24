/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare class Vue {
    public constructor(options : VueOptions);

    public static extend(options : VueOptions) : Vue;

    public static extend(vue : Vue) : Vue;

    public static component(name : string, options : VueOptions) : Vue;

    public static component(name : string, vue : Vue) : Vue;

    public static use(object : any);

    public static use(installFunction : () => void);

    public $on(event : string, callback : (p1: any) => void);

    public $emit(event : string, eventParam : any);

    public $emit(event : string);
}

interface Prop {
    required : boolean;
}

interface VueOptions {
    data? : ((any)|(() => any));

    props? : ((string[])|(any));

    propsData? : any;

    computed? : any;

    methods? : any;

    watch? : any;

    el? : string;

    template? : string;

    render? : any;

    renderError? : any;

    beforeCreate? : () => void;

    created? : () => void;

    beforeMount? : () => void;

    mounted? : () => void;

    beforeUpdate? : () => void;

    updated? : () => void;

    activated? : () => void;

    deactivated? : () => void;

    beforeDestroy? : () => void;

    destroyed? : () => void;

    errorCaptured? : () => void;

    directives? : any;

    filters? : any;

    components? : any;

    parent? : Vue;

    mixins? : Array<any>;
}


