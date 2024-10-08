


run;


data test;
format pct1 pct2 pct3 percent.;
INPUT @1 question $50. @52 dept $10. @63 diff 2. @66 valid 2. @69 (pct1 pct2 pct3) (percent.) @86 year; 


cards;
The computer I have is adequate for my needs       Design     10 30 13%   50%   37%    2002
The computer I have is adequate for my needs       Marketing  20 30 10%   40%   50%    2002
The computer I have is adequate for my needs       Devel      10 50 19%   60%   21%    2002
The computer I have is adequate for my needs       Pubs       40 20 10%   67%   23%    2002
The Software on my computer is always up to date   Design     10 30 5%    48%   47%    2002
The Software on my computer is always up to date   Marketing  40 40 10%   50%   40%    2002
The Software on my computer is always up to date   Devel      10 30 23%   74%   3%     2002
The Software on my computer is always up to date   Pubs       50 60 17%   35%   47%    2002
I feel adequately protected from computer viruses  Design     10 30 50%   10%   40%    2002
I feel adequately protected from computer viruses  Marketing  20 20 10%   40%   50%    2002
I feel adequately protected from computer viruses  Devel      10 30 50%   10%   40%    2002
I feel adequately protected from computer viruses  Pubs       10 10 61%   12%   27%    2002
The OS and tools are the best available for my job Design     70 30 27%   36%   37%    2002
The OS and tools are the best available for my job Marketing  10 80 10%   40%   50%    2002
The OS and tools are the best available for my job Devel      40 30 58%   20%   22%    2002
The OS and tools are the best available for my job Pubs       10 40 80%   15%   05%    2002
;

run;


proc template;
  define style styles.survey;
  parent = styles.minimal;
  
      Style fonts "Fonts used " /
      "headingFont" = ("Courier new, monospace", 11pt, bold)
      "groupFont" = ("Courier new, monospace", 10pt, bold)
      "dataFont" = ("Courier new, monospace", 9pt)
      "chartFont" = ("Courier new, monospace", 9pt, bold)
      ;

     Style Document /
        ProtectSpecialChars = auto
        HtmlContentType = "text/html"
        HtmlDocType = "<!DOCTYPE HTML PUBLIC ""-//W3C//DTD HTML 3.2 Final//EN"">"
        font = fonts("dataFont")
        background = cxFFFFFF
        foreground = cx000000
     ;

       /* ----- */
       replace Output /
          BorderWidth = 1
          CellSpacing = 0
          CellPadding = 0
          Frame = Box
          Rules = all
          outputwidth = 100%
       ;
      
      style header /
          background = silver
          foreground = cx000000
          font = fonts("headingFont")
      ;
          
      style question /
          background = cx000000
          foreground = cxFFFFFF
          font = fonts("headingFont")
          cellpadding = 5
      ;

      style group /
          background = silver
          foreground = cx000000
          font = fonts("groupFont")
      ;

      style data /
          background = white
          foreground = cx000000
          font = fonts("dataFont")
      ;
      style dataemphasis from data /
          foreground = green
      ;

      style datastrong from data /
          foreground = red
      ;
      
      style Unfav /
          background = red
          foreground = cxFFFFFF
          font = fonts("chartFont")
          borderColor = black
      ;
      style Neutral from Unfav/
          background = yellow
          foreground = cx000000
      ;
      style Fav from Neutral/
          background = cx7FFF00
      ;
        
      end;
run;



proc template;
   define tagset tagsets.latex_slidebar;
       parent = tagsets.colorlatex;

       mvar slidebar_column_count;

        define event doc;
           start:
               set $sascaption 'false';
               put CR '\documentclass[10pt, landscape]{article}' CR CR;
               put '%    Generated by SAS' CR;
               put '%    http://www.sas.com' CR;
           finish:
               put '\end{document}' CR;
        end;

        define event doc_head;
            finish:
                put '% Set page layout' CR;
                put '\geometry{top=.5in, left=.25in, right=.25in, bottom=.5in}' CR;
                put '\geometry{nohead, nofoot}' CR CR;
                put '\documentforeground{' FOREGROUND '}' CR / if exists(foreground);
                put '\documentbackground{' BACKGROUND '}' CR / if exists(background);
                put '\begin{document}' CR CR;
        end;

        define event stylesheet_link;
            start:
            break /if !exists(URL);
            break /if cmp(URL,'');
            put CR '\usepackage[color]{';
            put URL;
            put '}' CR CR;

            finish:
            put '\makeatletter' nl nl;

            put '\newbox\sas@slidebox' nl;
            put '\newlength\sas@sliderwd' nl;
            put '\newlength\slidebarwd' nl nl;

            put '\setlength{\slidebarwd}{3in}' nl;
            put '\setlength{\fboxsep}{2pt}' nl;
            put '\setlength{\fboxrule}{1pt}' nl nl;

            put '\newcommand\slidebar[2]{\multicolumn{#1}{|c|}{\hbox{#2}}}' nl;
            put '\def\sas@cache@color#1,#2,#3{%' nl;
            put '    \global\def\sas@r{#1}%' nl;
            put '    \global\def\sas@g{#2}%' nl;
            put '    \global\def\sas@b{#3}' nl;
            put '}' nl;
            put '\sas@cache@color1,1,1\relax' nl;
            put '\newcommand\slider[3]{%' nl;
            put '   \def\columncolor[##1]##2{\sas@cache@color##2\relax}%' nl;
            put '   \setlength\sas@sliderwd{0.01\slidebarwd}%' nl;
            put '   \setlength\sas@sliderwd{#2\sas@sliderwd}%' nl;
            put '   \addtolength\sas@sliderwd{-2\fboxsep}' nl;
            put '   \addtolength\sas@sliderwd{-2\fboxrule}' nl;
            put '   \ifx.#3\relax' nl;
            put '      \kern-6pt%' nl;
            put '   \else%' nl;
            put '      \bgroup%' nl;
            put '        \csname sas#1\endcsname%' nl;
            put '        \kern-11pt%' nl;
            put '        \fcolorbox[rgb]{0,0,0}{\sas@r,\sas@g,\sas@b}{\parbox{\the\sas@sliderwd}{\centering\csname sas#1\endcsname#3}}%' nl;
            put '      \egroup%' nl;
            put '   \fi%' nl;
            put '}' nl nl;

            put '\makeatother' nl nl;
        end;

       
        define event header;
            start:
                set $header "true";
            
                put VALUE /if cmp($sascaption, 'true');
                break /if cmp($sascaption, 'true');
                put ' & ' CR / if !cmp(COLSTART, '1') ;

                /* Print cell formatting including class name and alignment. */
                put '   ';
                put '\multicolumn{';
                put colspan;
                put '1' / if !exists(colspan);
                put '}';
                put '{|S{';
                put HTMLCLASS;
                put '}{';
                put just;
                put '}|}';
                put '{';
                put VALUE;
   
            finish:
                break /if cmp($sascaption, 'true');
                put '}';
                unset $header;
        end;

        define event output;
            eval $slidebar_columns "3";
            do /if slidebar_column_count;
                eval $slidebar_columns slidebar_column_count;
            done;
            
        end;
        
        define event data;
            start:
                /*--------------------------------------------------------------eric-*/
                /*-- Put the entire cell in a stream so we can throw it away if    --*/
                /*-- it's value is missing and it's in a slidebar                  --*/
                /*-----------------------------------------------------------16Oct03-*/
                unset $$data_cell;
                open data_cell;
            
                unset $in_slider;
                set $in_slider "true" /if cmp(tagattr, "start");
                set $in_slider "true" /if cmp(tagattr, "end");
                set $in_slider "true" /if cmp(tagattr, "in");

                do /if $in_slider;
                    
                    put ' & ' NL '   '  '\slidebar{' $slidebar_columns '}{' /if cmp(tagattr, "start");

                    trigger do_slider start;

                    set $width value; 
                    /*--------------------------------------------------eric-*/
                    /*-- for report.  no reason to finish the cell.  we    --*/
                    /*-- need to put width in when we finally get the      --*/
                    /*-- value.  - if it's a slidebar column.              --*/
                    /*-----------------------------------------------10Oct03-*/
                    do /if !value;
                        set $need_tag_end "TRUE" /breakif cmp(data_viewer, "report");
                    done;

                    trigger do_slider finish;
                    flush;
                    break;
                done;
                    

                put VALUE /if cmp($sascaption, 'true');
                break /if cmp($sascaption, 'true');
                put ' & ' CR / if !cmp(COLSTART, '1') ;

                /* Print cell formatting including class name and alignment. */
                put '   ';
                put '\multicolumn{';
                put colspan;
                put '1' / if !exists(colspan);
                put '}';
                put '{|S{';
                put HTMLCLASS;
                put '}{';
                put just;
                put '}|}';
                put '{';
                put VALUE;
   
            finish:
            
                do /if $need_tag_end;
                    trigger do_slider finish /if $in_slider;
                    unset $need_tag_end;
                done;

                
                do /if $in_slider;
                    flush;
                    close;

                    unset $$data_cell /if $miss;

                    put $$data_cell ;
                    put '}' /if cmp(tagattr, "end");
                    break;
                done;
                
                break /if cmp($sascaption, 'true');
                put '}';
                flush;
                close;
                put $$data_cell;
        end;

        define event do_slider;
            start:
                put '\slider{';
                put HTMLCLASS;
                put '}';
            finish:
                unset $miss;
                set $miss missing /if missing;
                do /if !$miss;
                    set $tmp strip(value);
                    set $miss "true" /if cmp($tmp, ".");
                done;
                
                trigger do_width;
                put '{';
                put VALUE;
                put '}';
        end;

        define event put_value;
            do /if $need_tag_end;
                set $width value;
                trigger do_slider finish /if $in_slider;
                unset $need_tag_end;
            else;
                trigger missing_val start /breakif cmp(value, "  .");
                put value /if !cmp(value, "  .");
            done;
        end;
    
        define event rowspanfillsep;
            put ' & ' CR;
        end;


        define event do_width;
            break /if !$in_slider;
            trigger header_hwidth /breakif $header;
            set $width compress($width, '\%'); 
            put '{' strip($width) '}' ; 
        end;


        define event do_hwidth;
            break /if !$in_slider;
            put '{';
            do /if slidebar_column_count;
                eval $header_width 100 / $slidebar_columns;
                put $header_width;
            else;
                put '33';
            done;
            put '}' ; 
        end;

        define event missing_val;
            break /if !$in_slider;
        
            put VALUE;
        end;

   end;    
run;


proc template;
   define tagset tagsets.html_slidebar;
       parent = tagsets.html4;

       mvar slidebar_column_count;
       
        /*---------------------------------------------------------------eric-*/
        /*-- This is the begin and end of our slidebar table.  It's         --*/
        /*-- just a table inside a cell.  It get's created at the           --*/
        /*-- beginning of the 'column1' cell and it gets closed at          --*/
        /*-- the beginning of the 'end_column' cell.                        --*/
        /*------------------------------------------------------------10Oct03-*/
       define event chart_table;
           start:
               do /if $header;
                   put '<th width="30%" class="header"';
               else;
                   put '<td width="30%" class="data"' ;
               done;

               do /if !slidebar_column_count;
                   putq 'colspan="3"'; 
               else;
                   putq "colspan=" slidebar_column_count;
               done;
               put ">" nl;

               put '<table border="1" cellpadding="0" cellspacing="0" width="100%"><tr>' nl;

           finish:
               put '</tr></table >' nl;
               do /if $header;
                   put '</th>' nl ;
               else;
                   put '</td>' nl ;
               done;
        end;
   
        /*-------------------------------------------------------eric-*/
        /*-- The only new part of this event is the trigger         --*/
        /*-- chart_table lines.  They start and stop the slidechart --*/
        /*-- table for headings.                                    --*/
        /*----------------------------------------------------10Oct03-*/
         define event header;
            start:
                set $header "True";
                trigger chart_table start /if cmp(tagattr, "start");
                unset $header;
                set $slide_bar_column "TRUE" /if tagattr in ('start', 'in', 'end');
                set $end_column "TRUE" /if cmp(tagattr, 'end');

                put "<th";
                putq " title=" flyover;
                trigger classalign;
                trigger style_inline;
                trigger rowcol;
       
                trigger do_hwidth /if $slide_bar_column;

                put ">";
                trigger cell_value;
            finish:
                trigger cell_value;
                put "</th>" CR;
                set $header "True";
                trigger chart_table finish /if $end_column;
                unset $header;
                unset $end_column;
         end;

      /* Web Accessibility Feature 1194.22 (G&H) */
      /*-----------------------------------------*/
       define event data;
          start:

             /* this would work but sometimes htmlclass is empty... */
             trigger header /breakif cmp(htmlclass, "RowHeader");
             trigger header /breakif cmp(htmlclass, "Header");

            /*---------------------------------------------------------------eric-*/
            /*-- this is the slidebar part.  start the table if need be.        --*/
            /*-- set slide_bar_column to true - if it is.  Makes it easier      --*/
            /*-- later.  set end_column if it is. - for report, which gives     --*/
            /*-- a cell one excrutiating piece at a time.  Set the width for    --*/
            /*-- the same reason.                                               --*/
            /*------------------------------------------------------------10Oct03-*/
             trigger chart_table start /if cmp(tagattr, "start");
             set $slide_bar_column "TRUE" /if tagattr in ('start', 'in', 'end');
             set $end_column "TRUE" /if cmp(tagattr, 'end');
             set $width value /if $slide_bar_column;


             /*--------------------------------------------------------------eric-*/
             /*-- Put the entire cell in a stream so we can throw it away if    --*/
             /*-- it's value is missing and it's in a slidebar                  --*/
             /*-----------------------------------------------------------16Oct03-*/
              open data_cell;


             Put "<td";
             putq " title=" flyover;
             do /if !cmp(htmlclass,'batch');
               trigger classalign;
               trigger style_inline;
             done;
             trigger rowcol;
             put " nowrap" /if no_wrap;

             /*--------------------------------------------------eric-*/
             /*-- for report.  no reason to finish the cell.  we    --*/
             /*-- need to put width in when we finally get the      --*/
             /*-- value.  - if it's a slidebar column.              --*/
             /*-----------------------------------------------10Oct03-*/
             do /if !value;
                 set $need_tag_end "TRUE" /breakif cmp(data_viewer, "report");
             done;
                 
             trigger do_width /if $slide_bar_column;
             put ">";
             trigger cell_value;

          finish:
             trigger header /breakif cmp(htmlclass, "RowHeader");
             trigger header /breakif cmp(htmlclass, "Header");


             /*--------------------------------------------------eric-*/
             /*-- If for some awful reason we never got a value and --*/
             /*-- the td tag was never closed - we need to close it now.--*/
             /*-----------------------------------------------10Oct03-*/
             put ">" /if $need_tag_end;
             unset $need_tage_end; 

             trigger cell_value;
             put "</td>" CR;

             close;
             put $$data_cell /if !$miss;
             unset $$data_cell;
             unset $miss;

             /*--------------------------------------------------eric-*/
             /*-- Close up the slidebar if we need to.  unset the   --*/
             /*-- variables, ready for the next go around.          --*/
             /*-----------------------------------------------10Oct03-*/
             trigger chart_table finish /if $end_column;
             unset $end_column;
             unset $width;
        end;


        /*-------------------------------------------------------eric-*/
        /*-- This event is for proc report and is the main reason   --*/
        /*-- why this tagset won't work with proc report at 8.2.    --*/
        /*--                                                        --*/
        /*-- This is where the value comes out for each cell, after --*/
        /*-- the actual data event has already come and gone.  We   --*/
        /*-- provide context with all those variables we set        --*/
        /*-- earlier.  So we know if the td tag needs finishing     --*/
        /*-- up.                                                    --*/
        /*----------------------------------------------------11Oct03-*/
        define event put_value;
            do /if $need_tag_end;
                trigger do_width /if $slide_bar_column;
                put ">";
                unset $need_tag_end;
            done;
            
            trigger cell_value;
        end;
    
        /*-------------------------------------------------------eric-*/
        /*-- Slidebar headers are different so go put their widths on.--*/
        /*-- otherwise use the data value as the width value.       --*/
        /*-- After this we don't care if it's a slidebar column...  --*/
        /*----------------------------------------------------11Oct03-*/
        define event do_width;
            set $miss missing;
            set $width value;
            do /if !$miss;
                set $tmp strip(value);
                set $miss "true" /if cmp($tmp, ".");
            done;
            trigger do_hwidth /breakif $header;
            putq ' width=' $width ; 
            unset $slide_bar_column;
        end;

        /*-------------------------------------------------------eric-*/
        /*-- this assumes there are three cells in the slidebar.    --*/
        /*-- So unless told otherwise, they will be 33% wide. This  --*/
        /*-- can be over-ridden by setting a macro variable -       --*/
        /*-- slidebar_header_width to the value of your choice.     --*/
        /*-- They should probably add up to 100% or close to there. --*/
        /*----------------------------------------------------10Oct03-*/
        define event do_hwidth;
            put ' width="';
            do /if slidebar_column_count;
                eval $header_width 100 / slidebar_column_count;
                put $header_width;
            else;
                put '33%';
            done;
            
            put '"' ; 
            unset $slide_bar_column;
        end;

   end;    
run;


/*---------------------------------------------------------------eric-*/
/*-- This variable tells the tagset how many columns will be in     --*/
/*-- the slidebar.  For HTML that tells it to colspan this many     --*/
/*-- columns.  It is also used to calculate the header widths.      --*/
/*-- The default is 3 so there is no need to set it in that case.   --*/
/*------------------------------------------------------------13Oct03-*/
*%let slidebar_column_count=3;

title1 height=3 justify=l 'Survey Responses for Computers';
title2 height=6 justify=l 'Items within them:  Computers';

ods tagsets.html_slidebar style=survey file="survey.html";
ods tagsets.latex_slidebar style=survey 
                           file="survey.tex" 
                           stylesheet="survey.sty" (url="survey");

proc print data=test label noobs;
    /*-----------------------------------------------------------eric-*/
    /*-- set up the variables and assign the styles and             --*/
    /*-- justification.  We could have put the justification in     --*/
    /*-- the style definition but that takes away versatility.      --*/
    /*--------------------------------------------------------10Oct03-*/
    var dept / style(head) = header
                  style(data) = header;
    var diff valid / style=[just=center];
    var pct1 / style(head) = Unfav[just=center tagattr="start"]
                 style(data) = Unfav[just=center tagattr="start"];
    var pct2 / style(head) = Neutral[just=center tagattr="in"]
                 style(data) = Neutral[just=center tagattr="in"];
    var pct3 / style(head) = Fav[just=center tagattr="end"]
                 style(data) = Fav[just=center tagattr="end"];
    var year;

    /* set up the headings */
    label   question = 'Question';
    label   dept = 'Department';
    label   diff = 'Diff % Fav';
    label   valid = 'Valid N';
    label   pct1 = 'Unfavorable';
    label   pct2 = 'Neutral';
    label   pct3 = 'Favorable';
    label   year = 'Year';

run;

/*
ods tagsets.html_slidebar close;
ods tagsets.latex_slidebar close;

ods tagsets.html_slidebar style=survey file="survey_rpt.html";
ods tagsets.latex_slidebar style=survey file="survey_rpt.tex" stylesheet="survey.sty";
*/

options nobyline;

PROC REPORT DATA=test LS=138 PS=55  SPLIT="/" HEADLINE HEADSKIP CENTER nowd;
by year; 

COLUMN question ( dept ( diff valid pct1 pct2 pct3 ) );
define question / order noprint;
DEFINE  dept / ORDER FORMAT= $16.     WIDTH=16 SPACING=2 LEFT   "ITEMS" style=header;
DEFINE  diff / DISPLAY FORMAT= BEST9.     WIDTH=9 SPACING=2 center "Diff % Fav";
DEFINE  valid / SUM   FORMAT= BEST9.   WIDTH=7  SPACING=2 center "Valid N" ;
DEFINE  pct1 / SUM   FORMAT= PERCENT6. WIDTH=6  SPACING=2 center "Unfavorable" style=UnFav[tagattr="start"];
DEFINE  pct2 / SUM   FORMAT= PERCENT6. WIDTH=6  SPACING=2 center "Neutral" style=Neutral[tagattr="in"];
DEFINE  pct3 / SUM   FORMAT= PERCENT6. WIDTH=6  SPACING=2 center "Favorable" style=Fav[tagattr="end"];

break before question /;
compute before question / style=Question[just=left]  ;
 line question $80.;
endcomp;

RUN;

ods tagsets.html_slidebar close;
ods tagsets.latex_slidebar close;


 
