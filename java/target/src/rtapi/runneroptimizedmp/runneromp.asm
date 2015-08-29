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
  LDR R0 #case1993 ;
  STR R0 $9; Switch Node 
  LDR R0 #case1996 ;
  STR R0 $a; Switch Node 
  LDR R0 #case1998 ;
  STR R0 $b; Switch Node 
  LDR R0 #case2000 ;
  STR R0 $c; Switch Node 
  LDR R0 #case2002 ;
  STR R0 $d; Switch Node 
  LDR R0 #case2004 ;
  STR R0 $e; Switch Node 
  LDR R0 #case2006 ;
  STR R0 $f; Switch Node 
  LDR R0 #case2008 ;
  STR R0 $10; Switch Node 
  LDR R0 #case2010 ;
  STR R0 $11; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT2011 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR2011  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR2011;
FER2011 SEOT; This is basically the SEOT tick
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
case1992 NOOP; Switch Child branch
  LDR R0 #case1992
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS19740
case1993 NOOP; Switch Child branch
  LDR R0 #case1994
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case1994
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case1996
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case1997
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case2010
  STR R0 $11; EnterNode storing statecode : 1
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N201501
N201501 NOOP 
  LDR R1 $6
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $6
  JMP END0; Jumping to END
  JMP DUMMY2015;
DUMMY2015
  JMP ENDS19741
case1994 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case1995 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS11760
case1996 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case1997 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else2021 ;checking if the signal is present METER_1
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  PRESENT R0 else2022 ; Checking DATACALL result 
  LDR R1 $7
  MAX R1 #$3; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R0 #case1998
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #case2000
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R0 #case2001
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #case2003
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case2006
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 #case2007
  STR R0 $10; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N202401
  SUBV R1 R0 #1
  PRESENT R1 N202411
N202401 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2024;
N202411 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2024;
DUMMY2024
  JMP OVERELSE2025
else2022 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal WALK_1 in mem
    LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2025 NOOP;
  JMP OVERELSE2026
else2021 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2026 NOOP;
  JMP ENDS2020
case1998 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case1999 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS1130
case2000 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else2031 ;checking if the signal is present HEARTATTACK_1
  LDR R1 $8
  MAX R1 #$4; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2032
else2031 NOOP
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case2001 NOOP; Switch Child branch
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case2003 NOOP; Switch Child branch
  LDR R0 #case2003
  STR R0 $e; EnterNode storing statecode : 0
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  PRESENT R0 else2035 ; Checking DATACALL result 
  LDR R1 $8
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  LDR R0 #case2002
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal RUN_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2036
else2035 NOOP
  LDR R0 #case2004
  STR R0 $e; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2036 NOOP;
  JMP ENDS400
case2004 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else2038 ;checking if the signal is present STEP_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #512 ;loading the emit signal in
  STR R0 $2; emitted signal JUMP_1 in mem
    LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else2039 ;checking if the signal is present SECOND_1
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #case2003
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2040
else2039 NOOP
  LDR R0 #case2003
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2040 NOOP;
  JMP OVERELSE2041
else2038 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2041 NOOP;
  JMP ENDS401
ENDS400 NOOP 
ENDS401 NOOP 
  JMP ENDS730
case2002 NOOP; Switch Child branch
  LDR R0 $2 ; loading from mem
  OR R0 R0 #256 ;loading the emit signal in
  STR R0 $2; emitted signal RUN_1 in mem
    LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS731
ENDS730 NOOP 
ENDS731 NOOP 
OVERELSE2032 NOOP;
  JMP ENDS1131
ENDS1130 NOOP 
ENDS1131 NOOP 
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case2005 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS1190
case2006 NOOP; Switch Child branch
    LDR R0 $10
  JMP R0 ; SwitchNode unconditional jump
case2007 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else2046 ;checking if the signal is present HEARTBEAT_1
  LDR R0 #case2008
  STR R0 $10; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2047
else2046 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2047 NOOP;
  JMP ENDS1180
case2008 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else2049 ;checking if the signal is present SECOND_1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTATTACK_1 in mem
    LDR R0 #case2005
  STR R0 $f; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE2050
else2049 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE2050 NOOP;
  JMP ENDS1181
ENDS1180 NOOP 
ENDS1181 NOOP 
  JMP ENDS1191
ENDS1190 NOOP 
ENDS1191 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N205101
  SUBV R1 R0 #4
  PRESENT R1 N205114
  SUBV R1 R0 #0
  PRESENT R1 N20510
N205101 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2051;
N205114 NOOP 
  LDR R1 $7
  MAX R1 #$4; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  LDR R0 $2 ; loading from mem
  OR R0 R0 #128 ;loading the emit signal in
  STR R0 $2; emitted signal GOTOHOSPITAL_1 in mem
    LDR R0 #case1995
  STR R0 $a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2051;
N20510 NOOP 
  LDR R0 #case1997
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY2051;
DUMMY2051
  JMP ENDS2021
ENDS2020 NOOP 
ENDS2021 NOOP 
  JMP ENDS11761
ENDS11760 NOOP 
ENDS11761 NOOP 
    LDR R0 $11
  JMP R0 ; SwitchNode unconditional jump
case2009 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS19720
case2010 NOOP; Switch Child branch
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  PRESENT R0 else2054 ; Checking DATACALL result 
  LDR R1 $7
  MAX R1 #$2; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  LDR R0 #case2009
  STR R0 $11; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2055
else2054 NOOP
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  PRESENT R0 else2056 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal METER_1 in mem
    LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  PRESENT R0 else2057 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal STEP_1 in mem
    LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  PRESENT R0 else2058 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal SECOND_1 in mem
    LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  PRESENT R0 else2059 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2060
else2059 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2060 NOOP;
  JMP OVERELSE2061
else2058 NOOP
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  PRESENT R0 else2062 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2063
else2062 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2063 NOOP;
OVERELSE2061 NOOP;
  JMP OVERELSE2064
else2057 NOOP
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  PRESENT R0 else2065 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal SECOND_1 in mem
    LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  PRESENT R0 else2066 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2067
else2066 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2067 NOOP;
  JMP OVERELSE2068
else2065 NOOP
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  PRESENT R0 else2069 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2070
else2069 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2070 NOOP;
OVERELSE2068 NOOP;
OVERELSE2064 NOOP;
  JMP OVERELSE2071
else2056 NOOP
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  PRESENT R0 else2072 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal STEP_1 in mem
    LDR R0 #32794 ; loading case number
  DCALLBL R0 ; casenumber 26
  PRESENT R0 else2073 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal SECOND_1 in mem
    LDR R0 #32795 ; loading case number
  DCALLBL R0 ; casenumber 27
  LDR R0 #32796 ; loading case number
  DCALLBL R0 ; casenumber 28
  PRESENT R0 else2074 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2075
else2074 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2075 NOOP;
  JMP OVERELSE2076
else2073 NOOP
  LDR R0 #32797 ; loading case number
  DCALLBL R0 ; casenumber 29
  LDR R0 #32798 ; loading case number
  DCALLBL R0 ; casenumber 30
  PRESENT R0 else2077 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2078
else2077 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2078 NOOP;
OVERELSE2076 NOOP;
  JMP OVERELSE2079
else2072 NOOP
  LDR R0 #32799 ; loading case number
  DCALLBL R0 ; casenumber 31
  PRESENT R0 else2080 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal SECOND_1 in mem
    LDR R0 #32800 ; loading case number
  DCALLBL R0 ; casenumber 32
  LDR R0 #32801 ; loading case number
  DCALLBL R0 ; casenumber 33
  PRESENT R0 else2081 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2082
else2081 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2082 NOOP;
  JMP OVERELSE2083
else2080 NOOP
  LDR R0 #32802 ; loading case number
  DCALLBL R0 ; casenumber 34
  LDR R0 #32803 ; loading case number
  DCALLBL R0 ; casenumber 35
  PRESENT R0 else2084 ; Checking DATACALL result 
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal HEARTBEAT_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE2085
else2084 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE2085 NOOP;
OVERELSE2083 NOOP;
OVERELSE2079 NOOP;
OVERELSE2071 NOOP;
OVERELSE2055 NOOP;
  JMP ENDS19721
ENDS19720 NOOP 
ENDS19721 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N208601
  SUBV R1 R0 #0
  PRESENT R1 N20860
N208601 NOOP 
  LDR R1 $6
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $6
  JMP END0; Jumping to END
  JMP DUMMY2086;
N20860 NOOP 
  LDR R0 #case1992
  STR R0 $9; EnterNode storing statecode : 0
  LDR R1 $6
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $6
  LDR R0 #case1992
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY2086;
DUMMY2086
  JMP ENDS19742
ENDS19740 NOOP 
ENDS19741 NOOP 
ENDS19742 NOOP 
END0 JMP BEGIN0
  ENDPROG
