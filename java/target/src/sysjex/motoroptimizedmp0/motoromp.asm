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
  LDR R0 #case22942 ;
  STR R0 $9; Switch Node 
  LDR R0 #case22945 ;
  STR R0 $a; Switch Node 
  LDR R0 #case22947 ;
  STR R0 $b; Switch Node 
  LDR R0 #case22950 ;
  STR R0 $c; Switch Node 
  LDR R0 #case22952 ;
  STR R0 $d; Switch Node 
  LDR R0 #case22954 ;
  STR R0 $e; Switch Node 
  LDR R0 #case22956 ;
  STR R0 $f; Switch Node 
  LDR R0 #case22959 ;
  STR R0 $10; Switch Node 
  LDR R0 #case22961 ;
  STR R0 $11; Switch Node 
  LDR R0 #case22963 ;
  STR R0 $12; Switch Node 
  LDR R0 #case22965 ;
  STR R0 $13; Switch Node 
  LDR R0 #case22970 ;
  STR R0 $14; Switch Node 
  LDR R0 #case22972 ;
  STR R0 $15; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
  SEOT22991 CLFZ;
    LDR R0 #0;clearing 
    LDR R1 #0;clearing 
    LDR R11 #0;clearing (This register will always contain zeroes !)
  LERR22991  LER R0;loading the EREADY bit which is set from ENV
    PRESENT R0 LERR22991;
  FER22991 SEOT; This is basically the SEOT tick
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
case22941 NOOP; Switch Child branch
  LDR R0 #case22941
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS228030
case22942 NOOP; Switch Child branch
  LDR R0 #case22943
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case22943
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case22945
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case22963
  STR R0 $12; EnterNode storing statecode : 1
  LDR R0 #case22964
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case22970
  STR R0 $14; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case22971
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal Hold_1 in mem
    LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  PRESENT R0 else22995 ; Checking DATACALL result 
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #case22972
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  PRESENT R0 else22996 ; Checking DATACALL result 
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  LDR R0 #case22973
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE22997
else22996 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE22997 NOOP;
  JMP OVERELSE22998
else22995 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE22998 NOOP;
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2299901
N2299901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY22999;
DUMMY22999
  JMP ENDS228031
case22943 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case22944 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS224070
case22945 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case22946 NOOP; Switch Child branch
  LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R0 #case22947
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #1024 ;Got the exact signal
  PRESENT R0 else23005 ;checking if the signal is present LongStep_1
  LDR R0 #case22949
  STR R0 $c; EnterNode storing statecode : 0
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  LDR R0 #case22951
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  PRESENT R0 else23006 ; Checking DATACALL result 
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #case22948
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23007 ;checking if the signal is present Hold_1
  LDR R0 #case22954
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  PRESENT R0 else23009 ; Checking DATACALL result 
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23010 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  PRESENT R0 else23011 ; Checking DATACALL result 
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23012 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23013
else23012 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23013 NOOP;
  JMP OVERELSE23014
else23011 NOOP
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23014 NOOP;
    JMP OVERELSE23015
else23010 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23015 NOOP;
  JMP OVERELSE23016
else23009 NOOP
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23016 NOOP;
    LDR R0 #case22959
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  LDR R0 #case22960
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  PRESENT R0 else23017 ; Checking DATACALL result 
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23018
else23017 NOOP
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23018 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2301901
  SUBV R1 R0 #2
  PRESENT R1 N2301912
N2301901 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23019;
N2301912 NOOP 
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23019;
DUMMY23019
  JMP OVERELSE23020
else23007 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23020 NOOP;
  JMP OVERELSE23021
else23006 NOOP
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  LDR R0 #case22952
  STR R0 $d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23021 NOOP;
  JMP OVERELSE23022
else23005 NOOP
  LDR R0 #case22950
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  PRESENT R0 else23023 ; Checking DATACALL result 
  LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  LDR R0 #case22948
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23024 ;checking if the signal is present Hold_1
  LDR R0 #case22954
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  PRESENT R0 else23026 ; Checking DATACALL result 
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23027 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  PRESENT R0 else23028 ; Checking DATACALL result 
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23029 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23030
else23029 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23030 NOOP;
  JMP OVERELSE23031
else23028 NOOP
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23031 NOOP;
    JMP OVERELSE23032
else23027 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23032 NOOP;
  JMP OVERELSE23033
else23026 NOOP
  LDR R0 #32804 ; loading case number
  DCALLBL R0 ; casenumber 36
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23033 NOOP;
    LDR R0 #case22959
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32805 ; loading case number
  DCALLBL R0 ; casenumber 37
  LDR R0 #case22960
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32806 ; loading case number
  DCALLBL R0 ; casenumber 38
  PRESENT R0 else23034 ; Checking DATACALL result 
  LDR R0 #32807 ; loading case number
  DCALLBL R0 ; casenumber 39
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23035
else23034 NOOP
  LDR R0 #32808 ; loading case number
  DCALLBL R0 ; casenumber 40
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23035 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2303601
  SUBV R1 R0 #2
  PRESENT R1 N2303612
N2303601 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23036;
N2303612 NOOP 
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23036;
DUMMY23036
  JMP OVERELSE23037
else23024 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23037 NOOP;
  JMP OVERELSE23038
else23023 NOOP
  LDR R0 #32809 ; loading case number
  DCALLBL R0 ; casenumber 41
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23038 NOOP;
OVERELSE23022 NOOP;
  JMP ENDS60
case22947 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case22949 NOOP; Switch Child branch
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case22951 NOOP; Switch Child branch
  LDR R0 #case22951
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #32810 ; loading case number
  DCALLBL R0 ; casenumber 42
  PRESENT R0 else23042 ; Checking DATACALL result 
  LDR R0 #32811 ; loading case number
  DCALLBL R0 ; casenumber 43
  LDR R0 #case22948
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23043 ;checking if the signal is present Hold_1
  LDR R0 #case22954
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32812 ; loading case number
  DCALLBL R0 ; casenumber 44
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32813 ; loading case number
  DCALLBL R0 ; casenumber 45
  PRESENT R0 else23045 ; Checking DATACALL result 
  LDR R0 #32814 ; loading case number
  DCALLBL R0 ; casenumber 46
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23046 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32816 ; loading case number
  DCALLBL R0 ; casenumber 48
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32817 ; loading case number
  DCALLBL R0 ; casenumber 49
  PRESENT R0 else23047 ; Checking DATACALL result 
  LDR R0 #32818 ; loading case number
  DCALLBL R0 ; casenumber 50
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23048 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23049
else23048 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23049 NOOP;
  JMP OVERELSE23050
else23047 NOOP
  LDR R0 #32819 ; loading case number
  DCALLBL R0 ; casenumber 51
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23050 NOOP;
    JMP OVERELSE23051
else23046 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23051 NOOP;
  JMP OVERELSE23052
else23045 NOOP
  LDR R0 #32820 ; loading case number
  DCALLBL R0 ; casenumber 52
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23052 NOOP;
    LDR R0 #case22959
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32821 ; loading case number
  DCALLBL R0 ; casenumber 53
  LDR R0 #case22960
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32822 ; loading case number
  DCALLBL R0 ; casenumber 54
  PRESENT R0 else23053 ; Checking DATACALL result 
  LDR R0 #32823 ; loading case number
  DCALLBL R0 ; casenumber 55
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23054
else23053 NOOP
  LDR R0 #32824 ; loading case number
  DCALLBL R0 ; casenumber 56
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23054 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2305501
  SUBV R1 R0 #2
  PRESENT R1 N2305512
N2305501 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23055;
N2305512 NOOP 
  LDR R0 #32815 ; loading case number
  DCALLBL R0 ; casenumber 47
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23055;
DUMMY23055
  JMP OVERELSE23056
else23043 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23056 NOOP;
  JMP OVERELSE23057
else23042 NOOP
  LDR R0 #32825 ; loading case number
  DCALLBL R0 ; casenumber 57
  LDR R0 #case22952
  STR R0 $d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23057 NOOP;
  JMP ENDS80
case22952 NOOP; Switch Child branch
  LDR R0 #case22952
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 #case22951
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #32826 ; loading case number
  DCALLBL R0 ; casenumber 58
  PRESENT R0 else23059 ; Checking DATACALL result 
  LDR R0 #32827 ; loading case number
  DCALLBL R0 ; casenumber 59
  LDR R0 #case22948
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23060 ;checking if the signal is present Hold_1
  LDR R0 #case22954
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32828 ; loading case number
  DCALLBL R0 ; casenumber 60
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32829 ; loading case number
  DCALLBL R0 ; casenumber 61
  PRESENT R0 else23062 ; Checking DATACALL result 
  LDR R0 #32830 ; loading case number
  DCALLBL R0 ; casenumber 62
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23063 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32832 ; loading case number
  DCALLBL R0 ; casenumber 64
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32833 ; loading case number
  DCALLBL R0 ; casenumber 65
  PRESENT R0 else23064 ; Checking DATACALL result 
  LDR R0 #32834 ; loading case number
  DCALLBL R0 ; casenumber 66
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23065 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23066
else23065 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23066 NOOP;
  JMP OVERELSE23067
else23064 NOOP
  LDR R0 #32835 ; loading case number
  DCALLBL R0 ; casenumber 67
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23067 NOOP;
    JMP OVERELSE23068
else23063 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23068 NOOP;
  JMP OVERELSE23069
else23062 NOOP
  LDR R0 #32836 ; loading case number
  DCALLBL R0 ; casenumber 68
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23069 NOOP;
    LDR R0 #case22959
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32837 ; loading case number
  DCALLBL R0 ; casenumber 69
  LDR R0 #case22960
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32838 ; loading case number
  DCALLBL R0 ; casenumber 70
  PRESENT R0 else23070 ; Checking DATACALL result 
  LDR R0 #32839 ; loading case number
  DCALLBL R0 ; casenumber 71
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23071
else23070 NOOP
  LDR R0 #32840 ; loading case number
  DCALLBL R0 ; casenumber 72
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23071 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2307201
  SUBV R1 R0 #2
  PRESENT R1 N2307212
N2307201 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23072;
N2307212 NOOP 
  LDR R0 #32831 ; loading case number
  DCALLBL R0 ; casenumber 63
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23072;
DUMMY23072
  JMP OVERELSE23073
else23060 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23073 NOOP;
  JMP OVERELSE23074
else23059 NOOP
  LDR R0 #32841 ; loading case number
  DCALLBL R0 ; casenumber 73
  LDR R0 #case22952
  STR R0 $d; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23074 NOOP;
  JMP ENDS81
ENDS80 NOOP 
ENDS81 NOOP 
  JMP ENDS370
case22950 NOOP; Switch Child branch
  LDR R0 #32842 ; loading case number
  DCALLBL R0 ; casenumber 74
  PRESENT R0 else23076 ; Checking DATACALL result 
  LDR R0 #32843 ; loading case number
  DCALLBL R0 ; casenumber 75
  LDR R0 #case22948
  STR R0 $b; EnterNode storing statecode : 2
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23077 ;checking if the signal is present Hold_1
  LDR R0 #case22954
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32844 ; loading case number
  DCALLBL R0 ; casenumber 76
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32845 ; loading case number
  DCALLBL R0 ; casenumber 77
  PRESENT R0 else23079 ; Checking DATACALL result 
  LDR R0 #32846 ; loading case number
  DCALLBL R0 ; casenumber 78
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23080 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32848 ; loading case number
  DCALLBL R0 ; casenumber 80
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32849 ; loading case number
  DCALLBL R0 ; casenumber 81
  PRESENT R0 else23081 ; Checking DATACALL result 
  LDR R0 #32850 ; loading case number
  DCALLBL R0 ; casenumber 82
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23082 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23083
else23082 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23083 NOOP;
  JMP OVERELSE23084
else23081 NOOP
  LDR R0 #32851 ; loading case number
  DCALLBL R0 ; casenumber 83
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23084 NOOP;
    JMP OVERELSE23085
else23080 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23085 NOOP;
  JMP OVERELSE23086
else23079 NOOP
  LDR R0 #32852 ; loading case number
  DCALLBL R0 ; casenumber 84
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23086 NOOP;
    LDR R0 #case22959
  STR R0 $10; EnterNode storing statecode : 1
  LDR R0 #32853 ; loading case number
  DCALLBL R0 ; casenumber 85
  LDR R0 #case22960
  STR R0 $11; EnterNode storing statecode : 0
  LDR R0 #32854 ; loading case number
  DCALLBL R0 ; casenumber 86
  PRESENT R0 else23087 ; Checking DATACALL result 
  LDR R0 #32855 ; loading case number
  DCALLBL R0 ; casenumber 87
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23088
else23087 NOOP
  LDR R0 #32856 ; loading case number
  DCALLBL R0 ; casenumber 88
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23088 NOOP;
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2308901
  SUBV R1 R0 #2
  PRESENT R1 N2308912
N2308901 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23089;
N2308912 NOOP 
  LDR R0 #32847 ; loading case number
  DCALLBL R0 ; casenumber 79
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23089;
DUMMY23089
  JMP OVERELSE23090
else23077 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23090 NOOP;
  JMP OVERELSE23091
else23076 NOOP
  LDR R0 #32857 ; loading case number
  DCALLBL R0 ; casenumber 89
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23091 NOOP;
  JMP ENDS371
ENDS370 NOOP 
ENDS371 NOOP 
  JMP ENDS61
case22948 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case22953 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS2290
case22954 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case22955 NOOP; Switch Child branch
  LDR R0 #32859 ; loading case number
  DCALLBL R0 ; casenumber 91
  PRESENT R0 else23097 ; Checking DATACALL result 
  LDR R0 #32860 ; loading case number
  DCALLBL R0 ; casenumber 92
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23098 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32861 ; loading case number
  DCALLBL R0 ; casenumber 93
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32862 ; loading case number
  DCALLBL R0 ; casenumber 94
  PRESENT R0 else23099 ; Checking DATACALL result 
  LDR R0 #32863 ; loading case number
  DCALLBL R0 ; casenumber 95
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23100 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23101
else23100 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23101 NOOP;
  JMP OVERELSE23102
else23099 NOOP
  LDR R0 #32864 ; loading case number
  DCALLBL R0 ; casenumber 96
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23102 NOOP;
    JMP OVERELSE23103
else23098 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23103 NOOP;
  JMP OVERELSE23104
else23097 NOOP
  LDR R0 #32865 ; loading case number
  DCALLBL R0 ; casenumber 97
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23104 NOOP;
  JMP ENDS690
case22956 NOOP; Switch Child branch
  LDR R0 #32866 ; loading case number
  DCALLBL R0 ; casenumber 98
  PRESENT R0 else23106 ; Checking DATACALL result 
  LDR R0 #32867 ; loading case number
  DCALLBL R0 ; casenumber 99
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23107 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23108
else23107 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23108 NOOP;
  JMP OVERELSE23109
else23106 NOOP
  LDR R0 #32868 ; loading case number
  DCALLBL R0 ; casenumber 100
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23109 NOOP;
  JMP ENDS691
case22957 NOOP; Switch Child branch
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32869 ; loading case number
  DCALLBL R0 ; casenumber 101
  LDR R0 #case22955
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #32870 ; loading case number
  DCALLBL R0 ; casenumber 102
  PRESENT R0 else23111 ; Checking DATACALL result 
  LDR R0 #32871 ; loading case number
  DCALLBL R0 ; casenumber 103
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23112 ;checking if the signal is present Hold_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal Enable_1 in mem
  LDR R0 #32872 ; loading case number
  DCALLBL R0 ; casenumber 104
  LDR R0 #case22956
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #32873 ; loading case number
  DCALLBL R0 ; casenumber 105
  PRESENT R0 else23113 ; Checking DATACALL result 
  LDR R0 #32874 ; loading case number
  DCALLBL R0 ; casenumber 106
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else23114 ;checking if the signal is present Hold_1
  LDR R0 #case22957
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23115
else23114 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23115 NOOP;
  JMP OVERELSE23116
else23113 NOOP
  LDR R0 #32875 ; loading case number
  DCALLBL R0 ; casenumber 107
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23116 NOOP;
    JMP OVERELSE23117
else23112 NOOP
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23117 NOOP;
  JMP OVERELSE23118
else23111 NOOP
  LDR R0 #32876 ; loading case number
  DCALLBL R0 ; casenumber 108
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23118 NOOP;
    JMP ENDS692
ENDS690 NOOP 
ENDS691 NOOP 
ENDS692 NOOP 
  JMP ENDS2291
ENDS2290 NOOP 
ENDS2291 NOOP 
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case22958 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS2570
case22959 NOOP; Switch Child branch
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case22960 NOOP; Switch Child branch
  LDR R0 #32877 ; loading case number
  DCALLBL R0 ; casenumber 109
  PRESENT R0 else23122 ; Checking DATACALL result 
  LDR R0 #32878 ; loading case number
  DCALLBL R0 ; casenumber 110
  LDR R0 #case22961
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE23123
else23122 NOOP
  LDR R0 #32879 ; loading case number
  DCALLBL R0 ; casenumber 111
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE23123 NOOP;
  JMP ENDS2440
case22961 NOOP; Switch Child branch
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal LongStep_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS2441
ENDS2440 NOOP 
ENDS2441 NOOP 
  JMP ENDS2571
ENDS2570 NOOP 
ENDS2571 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2312501
  SUBV R1 R0 #2
  PRESENT R1 N2312512
  SUBV R1 R0 #0
  PRESENT R1 N231250
N2312501 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23125;
N2312512 NOOP 
  LDR R0 #32858 ; loading case number
  DCALLBL R0 ; casenumber 90
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23125;
N231250 NOOP 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal Step_1 in mem
    LDR R0 #case22946
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY23125;
DUMMY23125
  JMP ENDS62
ENDS60 NOOP 
ENDS61 NOOP 
ENDS62 NOOP 
  JMP ENDS224071
ENDS224070 NOOP 
ENDS224071 NOOP 
    LDR R0 $12
  JMP R0 ; SwitchNode unconditional jump
case22962 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS224330
case22963 NOOP; Switch Child branch
    LDR R0 $13
  JMP R0 ; SwitchNode unconditional jump
case22964 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else23129 ;checking if the signal is present Step_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal Coil1_1 in mem
  LDR R0 #32880 ; loading case number
  DCALLBL R0 ; casenumber 112
  LDR R0 #case22965
  STR R0 $13; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    JMP OVERELSE23130
else23129 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23130 NOOP;
  JMP ENDS224090
case22965 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else23132 ;checking if the signal is present Step_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal Coil2_1 in mem
  LDR R0 #32881 ; loading case number
  DCALLBL R0 ; casenumber 113
  LDR R0 #case22966
  STR R0 $13; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    JMP OVERELSE23133
else23132 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23133 NOOP;
  JMP ENDS224091
case22966 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else23135 ;checking if the signal is present Step_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal Coil1_1 in mem
  LDR R0 #32882 ; loading case number
  DCALLBL R0 ; casenumber 114
  LDR R0 #case22967
  STR R0 $13; EnterNode storing statecode : 3
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    JMP OVERELSE23136
else23135 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23136 NOOP;
  JMP ENDS224092
case22967 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else23138 ;checking if the signal is present Step_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal Coil2_1 in mem
  LDR R0 #32883 ; loading case number
  DCALLBL R0 ; casenumber 115
  LDR R0 #case22968
  STR R0 $13; EnterNode storing statecode : 4
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
    JMP OVERELSE23139
else23138 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23139 NOOP;
  JMP ENDS224093
case22968 NOOP; Switch Child branch
  LDR R0 #case22968
  STR R0 $13; EnterNode storing statecode : 4
  LDR R0 #case22964
  STR R0 $13; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS224094
ENDS224090 NOOP 
ENDS224091 NOOP 
ENDS224092 NOOP 
ENDS224093 NOOP 
ENDS224094 NOOP 
  JMP ENDS224331
ENDS224330 NOOP 
ENDS224331 NOOP 
    LDR R0 $14
  JMP R0 ; SwitchNode unconditional jump
case22969 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS228010
case22970 NOOP; Switch Child branch
    LDR R0 $15
  JMP R0 ; SwitchNode unconditional jump
case22971 NOOP; Switch Child branch
  LDR R0 #32884 ; loading case number
  DCALLBL R0 ; casenumber 116
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal Hold_1 in mem
    LDR R0 #32885 ; loading case number
  DCALLBL R0 ; casenumber 117
  PRESENT R0 else23144 ; Checking DATACALL result 
  LDR R0 #32886 ; loading case number
  DCALLBL R0 ; casenumber 118
  LDR R0 #case22972
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #32887 ; loading case number
  DCALLBL R0 ; casenumber 119
  LDR R0 #32888 ; loading case number
  DCALLBL R0 ; casenumber 120
  PRESENT R0 else23145 ; Checking DATACALL result 
  LDR R0 #32889 ; loading case number
  DCALLBL R0 ; casenumber 121
  LDR R0 #case22973
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE23146
else23145 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23146 NOOP;
  JMP OVERELSE23147
else23144 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23147 NOOP;
  JMP ENDS224540
case22972 NOOP; Switch Child branch
  LDR R0 #32890 ; loading case number
  DCALLBL R0 ; casenumber 122
  LDR R0 #32891 ; loading case number
  DCALLBL R0 ; casenumber 123
  PRESENT R0 else23149 ; Checking DATACALL result 
  LDR R0 #32892 ; loading case number
  DCALLBL R0 ; casenumber 124
  LDR R0 #case22973
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE23150
else23149 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23150 NOOP;
  JMP ENDS224541
case22973 NOOP; Switch Child branch
  LDR R0 #case22973
  STR R0 $15; EnterNode storing statecode : 2
  LDR R0 #32893 ; loading case number
  DCALLBL R0 ; casenumber 125
  LDR R0 #case22971
  STR R0 $15; EnterNode storing statecode : 0
  LDR R0 #32894 ; loading case number
  DCALLBL R0 ; casenumber 126
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal Hold_1 in mem
    LDR R0 #32895 ; loading case number
  DCALLBL R0 ; casenumber 127
  PRESENT R0 else23152 ; Checking DATACALL result 
  LDR R0 #32896 ; loading case number
  DCALLBL R0 ; casenumber 128
  LDR R0 #case22972
  STR R0 $15; EnterNode storing statecode : 1
  LDR R0 #32897 ; loading case number
  DCALLBL R0 ; casenumber 129
  LDR R0 #32898 ; loading case number
  DCALLBL R0 ; casenumber 130
  PRESENT R0 else23153 ; Checking DATACALL result 
  LDR R0 #32899 ; loading case number
  DCALLBL R0 ; casenumber 131
  LDR R0 #case22973
  STR R0 $15; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE23154
else23153 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23154 NOOP;
  JMP OVERELSE23155
else23152 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE23155 NOOP;
  JMP ENDS224542
ENDS224540 NOOP 
ENDS224541 NOOP 
ENDS224542 NOOP 
  JMP ENDS228011
ENDS228010 NOOP 
ENDS228011 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N2315601
  SUBV R1 R0 #0
  PRESENT R1 N231560
N2315601 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY23156;
N231560 NOOP 
  LDR R0 #case22941
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case22941
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY23156;
DUMMY23156
  JMP ENDS228032
ENDS228030 NOOP 
ENDS228031 NOOP 
ENDS228032 NOOP 
END0 JMP BEGIN0
    ENDPROG
  