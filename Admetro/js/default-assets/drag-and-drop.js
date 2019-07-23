(function ($) {
    "use strict";

    // Dragula
    $(function () {
        dragula([$('#dragula-left')[0], $('#dragula-right')[0]], {
            revertOnSpill: true
        });

        // Copying
        dragula([$('#dragula-left-copy')[0], $('#dragula-right-copy')[0]], {
            copy: true
        });

        // Drag handle
        dragula([$('#dragula-left-drag-handles')[0], $('#dragula-right-drag-handles')[0]], {
            moves: function (el, container, handle) {
                return handle.classList.contains('handle');
            }
        });
    });

})(jQuery);