ods tagsets.excelxp

    options(
    frozen_headers='Yes' autofilter='All'
    embedded_titles='No'
    )

    file="example1.xls" style=journal;


 ods noproctitle;
 proc print data=sashelp.class
    contents="sashelp.class";

    id Name;
    var Sex;
    var Age Height Weight / style={tagattr='format:##0.0'};
    sum Age Height Weight;
 run;

ods tagsets.excelxp close; 
