(function ($) {
    "use strict";

    var editor = new SimpleTableCellEditor("myTableId");
    editor.SetEditableClass("editMe");

    $('#myTableId').on("cell:edited", function (event) {
        console.log(`'${event.oldValue}' changed to '${event.newValue}'`);
    });

})(jQuery);