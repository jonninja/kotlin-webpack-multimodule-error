Opening index.html in a browser results in:
    
    Uncaught Error: Error loading module 'sample-common-js'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'sample-common-js'.
        at eval (sample-common-js.js:2)
        at Object.../../../sample-common-js/build/classes/kotlin/main/sample-common-js.js (samplejs.bundle.js:81)
        at __webpack_require__ (samplejs.bundle.js:20)
        at eval (samplejs.js:14)
        at Object../samplejs.js (samplejs.bundle.js:114)
        at __webpack_require__ (samplejs.bundle.js:20)
        at samplejs.bundle.js:69
        at samplejs.bundle.js:72