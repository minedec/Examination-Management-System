(function ($) {
    "use strict";
    
    // :: Notify Message Active Code
    function notify(message, type) {
        $.growl({
            message: message
        }, {
            type: type,
            allow_dismiss: false,
            label: 'Cancel',
            className: 'btn-xs btn-inverse',
            placement: {
                from: 'top',
                align: 'right'
            },
            delay: 6000,
            animate: {
                enter: 'animated fadeInRight',
                exit: 'animated fadeOutRight'
            },
            offset: {
                x: 30,
                y: 80
            }
        });
    };
    notify('Hi, Welcomeback! - Admetro Dashboard', 'inverse');
    
})(jQuery);