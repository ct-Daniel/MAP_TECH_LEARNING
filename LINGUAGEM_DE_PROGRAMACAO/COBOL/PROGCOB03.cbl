       IDENTIFICATION DIVISION.
       PROGRAM-ID. PROGCOV1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 WRK-DATA.
           02 WRK-ANO PIC X(04) VALUE ZEROS.
           02 WRK-MES PIC X(02) VALUE ZEROS.
           02 WRK-DIA PIC X(02) VALUE ZEROS.
       PROCEDURE DIVISION.
           ACCEPT WRK-DATA FROM DATE YYYYMMDD;
           DISPLAY "DIA: " WRK-DIA " MES: " WRK-MES " ANO: " WRK-ANO.
