(function () {

    // Initialize after dom ready
    var echartsWindow = $(window);
    var chartBasic = echarts.init(document.getElementById('basic_chart'));
    option = {
        tooltip: {
            trigger: 'axis'
        },
        color: ["#007bff", "#17a2b8"],
        legend: {
            data: ['Evaporation', 'Precipitation']
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                data: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
                }
            ],
        yAxis: [
            {
                type: 'value'
                }
            ],
        series: [
            {
                name: 'Evaporation',
                type: 'bar',
                data: [2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
                markPoint: {
                    data: [
                        {
                            type: 'max',
                            name: 'The maximum value'
                    },
                        {
                            type: 'min',
                            name: 'Minimum value'
                    }
                        ]
                },
                markLine: {
                    data: [
                        {
                            type: 'average',
                            name: 'average value'
                    }
                        ]
                }
                },
            {
                name: 'Precipitation',
                type: 'bar',
                data: [2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
                markPoint: {
                    data: [
                        {
                            name: 'The highest year',
                            value: 182.2,
                            xAxis: 7,
                            yAxis: 183,
                            symbolSize: 18
                    },
                        {
                            name: 'Year minimum',
                            value: 2.3,
                            xAxis: 11,
                            yAxis: 3
                    }
                        ]
                },
                markLine: {
                    data: [
                        {
                            type: 'average',
                            name: 'average value'
                    }
                        ]
                }
                }
            ]
    };

    // Load data into the ECharts instance 
    chartBasic.setOption(option);

    echartsWindow.on('resize', function () {
        if (chartBasic != null && chartBasic != undefined) {
            chartBasic.resize();
        }
    });

    /* Sample eCharts */
    // configure for module loader

    require.config({
        paths: {
            echarts: 'https://echarts.baidu.com/build/dist'
        }
    });

    // use
    require(
    [
        'echarts',
        'echarts/chart/bar'
    ],
        function (ec) {
            // Initialize after dom ready
            var myChart = ec.init(document.getElementById('main'));

            var option = {
                tooltip: {
                    show: true
                },
                color: ["#17a2b8"],
                legend: {
                    data: ['Sales']
                },
                xAxis: [
                    {
                        type: 'category',
                        data: ["Shirts", "Sweaters", "Chiffon Shirts", "Pants", "High Heels", "Socks"]
                }
            ],
                yAxis: [
                    {
                        type: 'value'
                }
            ],
                series: [
                    {
                        "name": "Sales",
                        "type": "bar",
                        "data": [5, 20, 40, 10, 10, 20]
                }
            ]
            };

            // Load data into the ECharts instance 
            myChart.setOption(option);
        }
    );


    /* Ladder waterfall map echarts */
    // Initialize after dom ready

    var chartLadder = echarts.init(document.getElementById('ladder_chart'));

    option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            },
            formatter: function (params) {
                var tar;
                if (params[1].value != '-') {
                    tar = params[1];
                } else {
                    tar = params[0];
                }
                return tar.name + '<br/>' + tar.seriesName + ' : ' + tar.value;
            }
        },
        color: ["#24ccda", "#e9b02b"],
        legend: {
            data: ['expenditure', 'income'],
            itemGap: 30
        },
        xAxis: [
            {
                type: 'category',
                splitLine: {
                    show: false
                },
                data: function () {
                    var list = [];
                    for (var i = 1; i <= 11; i++) {
                        list.push('November ' + i + ' day');
                    }
                    return list;
                }()
        }
    ],
        yAxis: [
            {
                type: 'value'
        }
    ],
        series: [
            {
                name: 'Auxiliary',
                type: 'bar',
                stack: 'Total amount',
                itemStyle: {
                    normal: {
                        barBorderColor: 'rgba(0,0,0,0)',
                        color: 'rgba(0,0,0,0)'
                    },
                    emphasis: {
                        barBorderColor: 'rgba(0,0,0,0)',
                        color: 'rgba(0,0,0,0)'
                    }
                },
                data: [0, 900, 1245, 1530, 1478, 1376, 1511, 1689, 1856, 1495, 1292]
        },
            {
                name: 'income',
                type: 'bar',
                stack: 'Total amount',
                itemStyle: {
                    normal: {
                        label: {
                            show: true,
                            position: 'top'
                        }
                    }
                },
                data: [900, 345, 393, '-', '-', 135, 178, 286, '-', '-', '-']
        },
            {
                name: 'expenditure',
                type: 'bar',
                stack: 'Total amount',
                itemStyle: {
                    normal: {
                        label: {
                            show: true,
                            position: 'bottom'
                        }
                    }
                },
                data: ['-', '-', '-', 108, 154, '-', '-', '-', 119, 361, 203]
        }
    ]
    };

    // Load data into the ECharts instance 
    chartLadder.setOption(option);

    echartsWindow.on('resize', function () {
        if (chartLadder != null && chartLadder != undefined) {
            chartLadder.resize();
        }
    });

    /* Stacked column echarts */
    // Initialize after dom ready

    var chartStack = echarts.init(document.getElementById('stack_chart'));

    option = {
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        color: ["#00d1c1", "#f8538d", "#3862f5", "#ffbb44", "#816cfd", "#25d5e4", "#ff6f00", "#3b3f5c", "#ff3743"],
        legend: {
            data: ['direct interview', 'Mail marketing', 'Affiliate advertising', 'Video ad', 'search engine', 'Baidu', 'Google', 'must', 'other'],
            itemGap: 20,
        },
        calculable: true,
        xAxis: [
            {
                type: 'category',
                data: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
        }
    ],
        yAxis: [
            {
                type: 'value'
        }
    ],
        series: [
            {
                name: 'direct interview',
                type: 'bar',
                data: [320, 332, 301, 334, 390, 330, 320]
        },
            {
                name: 'Mail marketing',
                type: 'bar',
                stack: 'advertising',
                data: [120, 132, 101, 134, 90, 230, 210]
        },
            {
                name: 'Affiliate advertising',
                type: 'bar',
                stack: 'advertising',
                data: [220, 182, 191, 234, 290, 330, 310]
        },
            {
                name: 'Video ad',
                type: 'bar',
                stack: 'advertising',
                data: [150, 232, 201, 154, 190, 330, 410]
        },
            {
                name: 'search engine',
                type: 'bar',
                data: [862, 1018, 964, 1026, 1679, 1600, 1570],
                markLine: {
                    itemStyle: {
                        normal: {
                            lineStyle: {
                                type: 'dashed'
                            }
                        }
                    },
                    data: [
                    [{
                            type: 'min'
                    }, {
                            type: 'max'
                    }]
                ]
                }
        },
            {
                name: 'Baidu',
                type: 'bar',
                barWidth: 5,
                stack: 'search engine',
                data: [620, 732, 701, 734, 1090, 1130, 1120]
        },
            {
                name: 'Google',
                type: 'bar',
                stack: 'search engine',
                data: [120, 132, 101, 134, 290, 230, 220]
        },
            {
                name: 'must',
                type: 'bar',
                stack: 'search engine',
                data: [60, 72, 71, 74, 190, 130, 110]
        },
            {
                name: 'other',
                type: 'bar',
                stack: 'search engine',
                data: [62, 82, 91, 84, 109, 110, 120]
        }
    ]
    };

    // Load data into the ECharts instance 
    chartStack.setOption(option);

    echartsWindow.on('resize', function () {
        if (chartStack != null && chartStack != undefined) {
            chartStack.resize();
        }
    });

})();