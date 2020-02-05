/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface VueOptions {
    el : string;

    data : any;

    methods? : any;

    watch? : any;

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
}

declare class Vue<T> {
    public constructor(options : VueOptions);
}


