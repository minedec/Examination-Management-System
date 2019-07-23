(function ($) {
// Initialize after dom ready
 var chartThermo = echarts.init(document.getElementById('thermo_chart'));

 option = {

     tooltip: {
         trigger: 'axis',
         axisPointer: {
             type: 'shadow'
         },
         formatter: function (params) {
             return params[0].name + '<br/>' +
                 params[0].seriesName + ' : ' + params[0].value + '<br/>' +
                 params[1].seriesName + ' : ' + (params[1].value + params[0].value);
         }
     },
     legend: {
         selectedMode: false,
         data: ['Acutal', 'Forecast']
     },
     calculable: true,
     xAxis: [
         {
             type: 'category',
             data: ['Cosco', 'CMA', 'APL', 'OOCL', 'Wanhai', 'Zim']
                }
            ],
     yAxis: [
         {
             type: 'value',
             boundaryGap: [0, 0.1]
                }
            ],
     series: [
         {
             name: 'Acutal',
             type: 'bar',
             stack: 'sum',
             barCategoryGap: '50%',
             itemStyle: {
                 normal: {
                     color: '#28a745',
                     barBorderColor: '#28a745',
                     barBorderWidth: 6,
                     barBorderRadius: 0,
                     label: {
                         show: true,
                         position: 'insideTop'
                     }
                 }
             },
             data: [260, 200, 220, 120, 100, 80]
                },
         {
             name: 'Forecast',
             type: 'bar',
             stack: 'sum',
             itemStyle: {
                 normal: {
                     color: '#fff',
                     barBorderColor: '#28a745',
                     barBorderWidth: 6,
                     barBorderRadius: 0,
                     label: {
                         show: true,
                         position: 'top',
                         formatter: function (params) {
                             for (var i = 0, l = option.xAxis[0].data.length; i < l; i++) {
                                 if (option.xAxis[0].data[i] == params.name) {
                                     return option.series[0].data[i] + params.value;
                                 }
                             }
                         },
                         textStyle: {
                             color: '#28a745'
                         }
                     }
                 }
             },
             data: [40, 80, 50, 80, 80, 70]
                }
            ]
 };

 // Load data into the ECharts instance 
 chartThermo.setOption(option);

 $(window).on('resize', function () {
     if (chartThermo != null && chartThermo != undefined) {
         chartThermo.resize();
     }
 });
    
})(jQuery);