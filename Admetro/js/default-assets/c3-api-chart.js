(function ($) {
    'use strict';

    function api_axis_range() {
        var chart = c3.generate({
            bindto: '#api_axis_range_charts',
            data: {
                columns: [
                    ['data1', 30, 200, 100, 400, 150, 250],
                    ['data2', 50, 20, 10, 40, 15, 25]
                ],
                axes: {
                    data1: 'y',
                    data2: 'y2',
                }
            },
            color: {
                pattern: ['#007bff', '#dc3545']
            },
            axis: {
                x: {
                    label: 'X Label'
                },
                y: {
                    label: {
                        text: 'Y Axis Label',
                        position: 'outer-middle'
                    }
                },
                y2: {
                    show: true,
                    label: {
                        text: 'Y2 Axis Label',
                        position: 'outer-middle'
                    }
                }
            },
            tooltip: {
                enabled: false
            },
            zoom: {
                enabled: true
            },
            subchart: {
                show: false
            }
        });

        setTimeout(function () {
            chart.axis.max(500);
        }, 1000);

        setTimeout(function () {
            chart.axis.min(-500);
        }, 3000);

        setTimeout(function () {
            chart.axis.max({
                y: 600,
                y2: 100
            });
        }, 4000);

        setTimeout(function () {
            chart.axis.min({
                y: -600,
                y2: -100
            });
        }, 4000);

        setTimeout(function () {
            chart.axis.range({
                max: 1000,
                min: -1000
            });
        }, 5000);

        setTimeout(function () {
            chart.axis.range({
                min: {
                    y: 1000
                },
                max: {
                    y: 2000
                }
            });
        }, 5000);

        setTimeout(function () {
            chart.axis.range({
                max: {
                    y: 600,
                    y2: 100
                },
                min: {
                    y: -100,
                    y2: 0
                }
            });
        }, 7000);
    }

    api_axis_range();

    // Chart-1 End

    function api_transform() {
        var chart = c3.generate({
            bindto: '#api_transform_charts',
            data: {
                columns: [
              ['data1', 30, 200, 100, 400, 150, 250],
              ['data2', 50, 20, 10, 40, 15, 25]
            ],
            },
            color: {
                pattern: ['#ff3743', '#00b1f4']
            },
        });

        setTimeout(function () {
            chart.transform('bar');
        }, 1000);

        setTimeout(function () {
            chart.transform('pie');
        }, 2000);

        setTimeout(function () {
            chart.transform('donut');
        }, 3000);

        setTimeout(function () {
            chart.transform('area');
        }, 4000);

        setTimeout(function () {
            chart.transform('spline');
        }, 5000);

        setTimeout(function () {
            chart = c3.generate({
                data: {
                    columns: [
                ['data1', 30, 200, 100, 400, 150, 250],
                ['data2', 50, 20, 10, 40, 15, 25],
                ['data1_x', 50, 20, 10, 40, 15, 25],
                ['data2_x', 30, 200, 100, 400, 150, 250],
              ],
                    xs: {
                        data1: 'data1_x',
                        data2: 'data2_x',
                    },
                    type: 'scatter'
                },
            });
        }, 7000);

        setTimeout(function () {
            chart.transform('pie');
        }, 8000);

        setTimeout(function () {
            chart.transform('scatter');
        }, 9000);
    }

    api_transform();

})(jQuery);