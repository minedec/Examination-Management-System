 (function ($) {
     "use strict";

     $('.dataTables-example').DataTable({
         pageLength: 25,
         responsive: true,
         dom: '<"html5buttons-tables"B>lTfgitp',
         buttons: [
             {
                 extend: 'copy'
             },
             {
                 extend: 'csv'
             },
             {
                 extend: 'excel',
                 title: 'ExampleFile'
             },
             {
                 extend: 'pdf',
                 title: 'ExampleFile'
             },
             {
                 extend: 'print',
                 customize: function (win) {
                     $(win.document.body).addClass('white-bg');
                     $(win.document.body).css('font-size', '10px');

                     $(win.document.body).find('table')
                         .addClass('compact')
                         .css('font-size', 'inherit');
                 }
            }
        ]
     });
 })(jQuery);