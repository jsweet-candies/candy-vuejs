/* Generated from Java with JSweet 2.0.0-SNAPSHOT - http://www.jsweet.org */
interface VueOptions {
    data? : any;

    props? : any;

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
}

declare class Vue {
    public constructor(options : VueOptions);
}


