(function ($) {
    "use strict";
    
    // :: Form repeater Active Code
    $('.repeater-default').repeater({
        show: function () {
            $(this).slideDown('slow');
        }
    });
    $('.default-repeater').repeater({
        defaultValues: {
            features: ['abs'],
            make: 'ford',
            model: 'Mustang'
        }
    });
    $('.repeater-slide').repeater({
        defaultValues: {
            'textarea-input': 'foo',
            'text-input': 'bar',
            'select-input': 'B',
            'checkbox-input': ['A', 'B'],
            'radio-input': 'B'
        },
        hide: function (deleteElement) {
            if (confirm('Are you sure you want to delete this element?')) {
                $(this).slideUp(deleteElement);
            }
        }
    });
    
})(jQuery);