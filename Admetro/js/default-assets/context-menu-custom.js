(function ($) {
    "use strict";
    var menu = [{
        name: 'create',
        img: 'img/core-img/1.png',
        title: 'create button',
        fun: function () {
            alert('i am add button')
        }
        }, {
        name: 'update',
        img: 'img/core-img/2.png',
        title: 'update button',
        fun: function () {
            alert('i am update button')
        }
        }, {
        name: 'delete',
        img: 'img/core-img/3.png',
        title: 'delete button',
        fun: function () {
            alert('i am delete button')
        }
        }];

    //Calling context menu
    $('.testButton').contextMenu(menu);

    var menu = [{
        name: 'create',
        img: 'img/core-img/1.png',
        title: 'create button',
        fun: function () {
            alert('i am add button')
        }
    }, {
        name: 'update',
        img: 'img/core-img/2.png',
        title: 'update button',
        subMenu: [{
            name: 'merge',
            title: 'It will merge row',
            img: 'img/core-img/1.png',
            fun: function () {
                alert('It will merge row')
            }
        }, {
            name: 'replace',
            title: 'It will replace row',
            img: 'img/core-img/3.png',
            subMenu: [{
                name: 'replace top 100',
                img: 'img/core-img/2.png',
                fun: function () {
                    alert('It will replace top 100 rows');
                }

            }, {
                name: 'replace all',
                img: 'img/core-img/2.png',
                fun: function () {
                    alert('It will replace all rows');
                }
            }]
        }]
    }, {
        name: 'delete',
        img: 'img/core-img/1.png',
        title: 'delete button',
        subMenu: [{
            'name': 'soft delete',
            img: 'img/core-img/2.png',
            fun: function () {
                alert('You can recover back');
            }
        }, {
            'name': 'hard delete',
            img: 'img/core-img/3.png',
            fun: function () {
                alert('It will delete permanently');
            }
        }]

    }];

    //Calling context menu
    $('.testButton2').contextMenu(menu);


    $('.validate').each(function () {
        elm = $(this);
        elm.contextMenu(elm.siblings('.valTip'), {
            'triggerOn': 'focusin',
            'displayAround': 'trigger'
        });

    });
    $('.validate').focusout(function (e) {
        $(this).siblings('.valTip').css('display', 'none');
    });

})(jQuery);