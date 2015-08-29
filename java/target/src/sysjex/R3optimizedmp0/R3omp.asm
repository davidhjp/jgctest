start NOOP ;starting the program
  LDR R0 #0;
  SSVOP R0;
  LDR R1 #0 ; Setting all the output signals statuses to zero
  STR R1 $1 ;Storing the statuses of all the output signals in to the dedicated mem space for outputsignals
  LDR R1 #0
  STR R1 $2 ; Setting internal signals to zero
  LDR R1 #0 ; storing zero to pre-insigs
  STR R1 $3
  LDR R1 #0 ; storing zero to pre-osigs
  STR R1 $4
  LDR R1 #0 ;storing zero to pre-dsigs
  STR R1 $5 ;Storing them into the mem
  LDR R0 #0
  STR R0 $6; Terminate Node stored 0
  LDR R0 #0
  STR R0 $7; Terminate Node stored 1
  LDR R0 #0
  STR R0 $8; Terminate Node stored 2
  LDR R0 #case506 ;
  STR R0 $9; Switch Node 
  LDR R0 #case509 ;
  STR R0 $a; Switch Node 
  LDR R0 #case511 ;
  STR R0 $b; Switch Node 
  LDR R0 #case514 ;
  STR R0 $c; Switch Node 
  LDR R0 #case516 ;
  STR R0 $d; Switch Node 
  LDR R0 #case518 ;
  STR R0 $e; Switch Node 
  LDR R0 #case523 ;
  STR R0 $f; Switch Node 
  LDR R0 #case525 ;
  STR R0 $10; Switch Node 
  LDR R0 #case527 ;
  STR R0 $11; Switch Node 
  LDR R0 #case529 ;
  STR R0 $12; Switch Node 
  LDR R0 #case531 ;
  STR R0 $13; Switch Node 
  LDR R0 #case533 ;
  STR R0 $14; Switch Node 
  LDR R0 #case535 ;
  STR R0 $15; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT536 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR536  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR536;
FER536 SEOT; This is basically the SEOT tick
  CER;clear the EREADY bit
  LDR R0 $0001; loading the output signals
  AND R1 R0 #$ffff;clearing output sig fields
  STR R1 $1
  AND R0 R0 #$0;
  SSOP R0;throwing output signals to env
; Updating pre sigs - Delayed semantics 
  STR R0 $4 ;store it to pre-osig of this CD 
  LDR R0 $2; loading signals
  STR R0 $5; storing to delayed
;Setting the declared signals and terminate node to 0
  STR R11 $2 ; DSigs
  LSIP R0;getting input signals from SIP
  AND R0 R0 #$0;
  LDR R1 $0000;
  AND R2 R1 #$0;
  STR R2 $3; storing insigs to delayed
  AND R1 R1 #$ffff;
  OR R0 R0 R1;
  STR R0 $0000;storing SIP signals in mem
  LDR R0 #$8000
  DCALLBL R0 ; casenumber 0
  CEOT;now start processing
RUN0 NOOP; the locks need to be inside the memory since if they are here then I am just eating up logic
  STR R11 $6; storing zero to this CD's Terminate Node
  STR R11 $7; storing zero to this CD's Terminate Node
  STR R11 $8; storing zero to this CD's Terminate Node
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
  LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case505 NOOP; Switch Child branch
  LDR R0 #case505
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS4870
case506 NOOP; Switch Child branch
  LDR R0 #case507
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case507
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case509
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case510
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case514
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #case516
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 #case517
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case531
  STR R0 $13; EnterNode storing statecode : 1
  LDR R0 #case532
  STR R0 $14; EnterNode storing statecode : 0
  LDR R0 #case534
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  PRESENT R0 else541 ; Checking DATACALL result 
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R0 #case535
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE542
else541 NOOP
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  PRESENT R0 else543 ; Checking DATACALL result 
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOn_1 in mem
    LDR R0 #case533
  STR R0 $14; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE544
else543 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE544 NOOP;
OVERELSE542 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N54501
N54501 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY545;
DUMMY545
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N54601
  SUBV R1 R0 #1
  PRESENT R1 N54611
N54601 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY546;
N54611 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY546;
DUMMY546
  JMP ENDS4871
case507 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case508 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1360
case509 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case510 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else552 ;checking if the signal is present AlarmOn_1
  LDR R0 #case511
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  PRESENT R0 else553 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal ResetAlarm_1 in mem
    LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  LDR R0 #case512
  STR R0 $b; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE554
else553 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE554 NOOP;
  JMP OVERELSE555
else552 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE555 NOOP;
  JMP ENDS240
case511 NOOP; Switch Child branch
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  PRESENT R0 else557 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal ResetAlarm_1 in mem
    LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #case512
  STR R0 $b; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE558
else557 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE558 NOOP;
  JMP ENDS241
case512 NOOP; Switch Child branch
  LDR R0 #case512
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 #case510
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS242
ENDS240 NOOP 
ENDS241 NOOP 
ENDS242 NOOP 
  JMP ENDS1361
ENDS1360 NOOP 
ENDS1361 NOOP 
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case513 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS4850
case514 NOOP; Switch Child branch
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case515 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS4330
case516 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case517 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else566 ;checking if the signal is present ResetAlarm_1
  LDR R0 #case518
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #case522
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  PRESENT R0 else567 ; Checking DATACALL result 
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  LDR R0 #case523
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE568
else567 NOOP
  LDR R0 #case524
  STR R0 $10; EnterNode storing statecode : 0
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  PRESENT R0 else569 ; Checking DATACALL result 
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  LDR R0 #case525
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  PRESENT R0 else570 ; Checking DATACALL result 
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  LDR R0 #case519
  STR R0 $e; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE571
else570 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE571 NOOP;
  JMP OVERELSE572
else569 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE572 NOOP;
OVERELSE568 NOOP;
  JMP OVERELSE573
else566 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE573 NOOP;
  JMP ENDS1870
case518 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case522 NOOP; Switch Child branch
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  PRESENT R0 else576 ; Checking DATACALL result 
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R0 #case523
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE577
else576 NOOP
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case524 NOOP; Switch Child branch
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  PRESENT R0 else579 ; Checking DATACALL result 
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  LDR R0 #case525
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  PRESENT R0 else580 ; Checking DATACALL result 
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  LDR R0 #case519
  STR R0 $e; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE581
else580 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE581 NOOP;
  JMP OVERELSE582
else579 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE582 NOOP;
  JMP ENDS1420
case525 NOOP; Switch Child branch
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  PRESENT R0 else584 ; Checking DATACALL result 
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  LDR R0 #case519
  STR R0 $e; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE585
else584 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE585 NOOP;
  JMP ENDS1421
ENDS1420 NOOP 
ENDS1421 NOOP 
OVERELSE577 NOOP;
  JMP ENDS1470
case523 NOOP; Switch Child branch
  LDR R0 #case523
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #case522
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  PRESENT R0 else587 ; Checking DATACALL result 
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  LDR R0 #case523
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE588
else587 NOOP
  LDR R0 #case524
  STR R0 $10; EnterNode storing statecode : 0
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  PRESENT R0 else589 ; Checking DATACALL result 
  LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  LDR R0 #case525
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  PRESENT R0 else590 ; Checking DATACALL result 
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  LDR R0 #case519
  STR R0 $e; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE591
else590 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE591 NOOP;
  JMP OVERELSE592
else589 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE592 NOOP;
OVERELSE588 NOOP;
  JMP ENDS1471
ENDS1470 NOOP 
ENDS1471 NOOP 
  JMP ENDS1871
case519 NOOP; Switch Child branch
  LDR R0 #case519
  STR R0 $e; EnterNode storing statecode : 2
  LDR R0 #case520
  STR R0 $e; EnterNode storing statecode : 3
  LDR R0 #case526
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  PRESENT R0 else594 ; Checking DATACALL result 
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  LDR R0 #case527
  STR R0 $11; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE595
else594 NOOP
  LDR R0 #case528
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  PRESENT R0 else596 ; Checking DATACALL result 
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case529
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  PRESENT R0 else597 ; Checking DATACALL result 
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOff_1 in mem
    LDR R0 #case521
  STR R0 $e; EnterNode storing statecode : 4
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE598
else597 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE598 NOOP;
  JMP OVERELSE599
else596 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE599 NOOP;
OVERELSE595 NOOP;
  JMP ENDS1872
case520 NOOP; Switch Child branch
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case526 NOOP; Switch Child branch
  LDR R0 #32804 ; loading case number
  DCALLBL R0 ; casenumber 36
  PRESENT R0 else602 ; Checking DATACALL result 
  LDR R0 #32810 ; loading case number
  DCALLBL R0 ; casenumber 42
  LDR R0 #case527
  STR R0 $11; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE603
else602 NOOP
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case528 NOOP; Switch Child branch
  LDR R0 #32805 ; loading case number
  DCALLBL R0 ; casenumber 37
  PRESENT R0 else605 ; Checking DATACALL result 
  LDR R0 #32806 ; loading case number
  DCALLBL R0 ; casenumber 38
  LDR R0 #case529
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #32807 ; loading case number
  DCALLBL R0 ; casenumber 39
  PRESENT R0 else606 ; Checking DATACALL result 
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOff_1 in mem
    LDR R0 #case521
  STR R0 $e; EnterNode storing statecode : 4
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE607
else606 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE607 NOOP;
  JMP OVERELSE608
else605 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE608 NOOP;
  JMP ENDS1910
case529 NOOP; Switch Child branch
  LDR R0 #32809 ; loading case number
  DCALLBL R0 ; casenumber 41
  PRESENT R0 else610 ; Checking DATACALL result 
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOff_1 in mem
    LDR R0 #case521
  STR R0 $e; EnterNode storing statecode : 4
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE611
else610 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE611 NOOP;
  JMP ENDS1911
ENDS1910 NOOP 
ENDS1911 NOOP 
OVERELSE603 NOOP;
  JMP ENDS1960
case527 NOOP; Switch Child branch
  LDR R0 #case527
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 #case526
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32811 ; loading case number
  DCALLBL R0 ; casenumber 43
  PRESENT R0 else613 ; Checking DATACALL result 
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case527
  STR R0 $11; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE614
else613 NOOP
  LDR R0 #case528
  STR R0 $12; EnterNode storing statecode : 0
  LDR R0 #32812 ; loading case number
  DCALLBL R0 ; casenumber 44
  PRESENT R0 else615 ; Checking DATACALL result 
  LDR R0 #32813 ; loading case number
  DCALLBL R0 ; casenumber 45
  LDR R0 #case529
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #32814 ; loading case number
  DCALLBL R0 ; casenumber 46
  PRESENT R0 else616 ; Checking DATACALL result 
  LDR R0 #32815 ; loading case number
  DCALLBL R0 ; casenumber 47
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOff_1 in mem
    LDR R0 #case521
  STR R0 $e; EnterNode storing statecode : 4
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE617
else616 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE617 NOOP;
  JMP OVERELSE618
else615 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE618 NOOP;
OVERELSE614 NOOP;
  JMP ENDS1961
ENDS1960 NOOP 
ENDS1961 NOOP 
  JMP ENDS1873
case521 NOOP; Switch Child branch
  LDR R0 #case521
  STR R0 $e; EnterNode storing statecode : 4
  LDR R0 #case517
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS1874
ENDS1870 NOOP 
ENDS1871 NOOP 
ENDS1872 NOOP 
ENDS1873 NOOP 
ENDS1874 NOOP 
  JMP ENDS4331
ENDS4330 NOOP 
ENDS4331 NOOP 
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case530 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS4830
case531 NOOP; Switch Child branch
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case532 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case534 NOOP; Switch Child branch
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  PRESENT R0 else624 ; Checking DATACALL result 
  LDR R0 #32821 ; loading case number
  DCALLBL R0 ; casenumber 53
  LDR R0 #case535
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE625
else624 NOOP
  LDR R0 #32818 ; loading case number
  DCALLBL R0 ; casenumber 50
  PRESENT R0 else626 ; Checking DATACALL result 
  LDR R0 #32819 ; loading case number
  DCALLBL R0 ; casenumber 51
  LDR R0 #32820 ; loading case number
  DCALLBL R0 ; casenumber 52
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOn_1 in mem
    LDR R0 #case533
  STR R0 $14; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE627
else626 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE627 NOOP;
OVERELSE625 NOOP;
  JMP ENDS4390
case535 NOOP; Switch Child branch
  LDR R0 #case535
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #case534
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #32822 ; loading case number
  DCALLBL R0 ; casenumber 54
  PRESENT R0 else629 ; Checking DATACALL result 
  LDR R0 #32826 ; loading case number
  DCALLBL R0 ; casenumber 58
  LDR R0 #case535
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE630
else629 NOOP
  LDR R0 #32823 ; loading case number
  DCALLBL R0 ; casenumber 55
  PRESENT R0 else631 ; Checking DATACALL result 
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R0 #32825 ; loading case number
  DCALLBL R0 ; casenumber 57
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOn_1 in mem
    LDR R0 #case533
  STR R0 $14; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE632
else631 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE632 NOOP;
OVERELSE630 NOOP;
  JMP ENDS4391
ENDS4390 NOOP 
ENDS4391 NOOP 
  JMP ENDS4490
case533 NOOP; Switch Child branch
  LDR R0 #case533
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 #case532
  STR R0 $14; EnterNode storing statecode : 0
  LDR R0 #case534
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #32827 ; loading case number
  DCALLBL R0 ; casenumber 59
  PRESENT R0 else634 ; Checking DATACALL result 
  LDR R0 #32831 ; loading case number
  DCALLBL R0 ; casenumber 63
  LDR R0 #case535
  STR R0 $15; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE635
else634 NOOP
  LDR R0 #32828 ; loading case number
  DCALLBL R0 ; casenumber 60
  PRESENT R0 else636 ; Checking DATACALL result 
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  LDR R0 #32830 ; loading case number
  DCALLBL R0 ; casenumber 62
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal AlarmOn_1 in mem
    LDR R0 #case533
  STR R0 $14; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE637
else636 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE637 NOOP;
OVERELSE635 NOOP;
  JMP ENDS4491
ENDS4490 NOOP 
ENDS4491 NOOP 
  JMP ENDS4831
ENDS4830 NOOP 
ENDS4831 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63801
  SUBV R1 R0 #0
  PRESENT R1 N6380
N63801 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY638;
N6380 NOOP 
  LDR R0 #case513
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY638;
DUMMY638
  JMP ENDS4851
ENDS4850 NOOP 
ENDS4851 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N63901
  SUBV R1 R0 #0
  PRESENT R1 N6390
N63901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY639;
N6390 NOOP 
  LDR R0 #case505
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case505
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY639;
DUMMY639
  JMP ENDS4872
ENDS4870 NOOP 
ENDS4871 NOOP 
ENDS4872 NOOP 
END0 JMP BEGIN0
  ENDPROG
