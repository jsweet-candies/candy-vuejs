/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
declare class Vue {
    public constructor(options : VueOptions);

    /**
     * 
     * @param {string} name
     * @param {*} component
     */
    public static component<T>(name : string, component : Component<any>);
}

interface Component<T> {
    data? : () => T;

    template? : string;
}

interface VueOptions {
    /**
     * css selector
     */
    el : string;

    data : any;

    methods? : any;

    updated? : () => void;

    watch? : any;
}


