       IDENTIFICATION DIVISION.
       PROGRAM-ID. PROGCOV1.
      ************************
      * AREA DE COMENTÁRIOS - REMAKERS
      * AUTHOR = DANIEL
      * OBJETIVO: RECEBER E IMPRIMIR UMA STRING
      ************************
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
           77 WRK-NOME PIC XXXX VALUE "OLA-".
       PROCEDURE DIVISION.
           DISPLAY "Insira seu nome: ".
           ACCEPT WRK-NOME.
           DISPLAY "seu nome: " WRK-NOME.
