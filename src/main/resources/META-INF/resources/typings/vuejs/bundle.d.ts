/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
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

    parent? : Vue<any>;

    mixins? : Array<any>;
}

declare class Vue<DataClass> {
    public $data : DataClass;

    public $el : HTMLElement;

    public $props : any;

    public constructor(options : VueOptions);

    public static extend<T>(options : VueOptions) : Vue<T>;

    public static extend<T, TS>(vue : Vue<TS>) : Vue<T>;

    public static component<T>(name : string, options : VueOptions) : Vue<T>;

    public static component<T, TS>(name : string, vue : Vue<TS>) : Vue<T>;

    public static use(object : any);

    public static use(installFunction : () => void);

    public $on(event : string, callback : (p1: any) => void);

    public $emit(event : string, eventParam : any);

    public $emit(event : string);

    public static set(o : any, property : string, value : any);

    public static filter(id : string, __function : Function) : string;
}

interface Prop {
    required : boolean;
}


