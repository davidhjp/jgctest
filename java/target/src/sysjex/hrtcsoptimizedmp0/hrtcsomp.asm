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
  LDR R0 #case107 ;
  STR R0 $8; Switch Node 
  LDR R0 #case110 ;
  STR R0 $9; Switch Node 
  LDR R0 #case114 ;
  STR R0 $a; Switch Node 
  LDR R0 #case116 ;
  STR R0 $b; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
  SEOT117 CLFZ;
    LDR R0 #0;clearing 
    LDR R1 #0;clearing 
    LDR R11 #0;clearing (This register will always contain zeroes !)
  LERR117  LER R0;loading the EREADY bit which is set from ENV
    PRESENT R0 LERR117;
  FER117 SEOT; This is basically the SEOT tick
    CER;clear the EREADY bit
    LDR R0 $0001; loading the output signals
    AND R1 R0 #$7fff;clearing output sig fields
    STR R1 $1
    AND R0 R0 #$8000;
    SSOP R0;throwing output signals to env
  ; Updating pre sigs - Delayed semantics 
    STR R0 $4 ;store it to pre-osig of this CD 
    ;Setting the declared signals and terminate node to 0
  STR R11 $2 ; DSigs
  LSIP R0;getting input signals from SIP
    AND R0 R0 #$8000;
    LDR R1 $0000;
    AND R2 R1 #$8000;
    STR R2 $3; storing insigs to delayed
  AND R1 R1 #$7fff;
    OR R0 R0 R1;
    STR R0 $0000;storing SIP signals in mem
    LDR R0 #$8000
    DCALLBL R0 ; casenumber 0
  CEOT;now start processing
  RUN0 NOOP; the locks need to be inside the memory since if they are here then I am just eating up logic
    STR R11 $6; storing zero to this CD's Terminate Node
    STR R11 $7; storing zero to this CD's Terminate Node
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
    LDR R0 $8
  JMP R0 ; SwitchNode unconditional jump
case106 NOOP; Switch Child branch
  LDR R0 #case106
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS920
case107 NOOP; Switch Child branch
  LDR R0 #case108
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case108
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case109
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case114
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #32768 ;loaded the value
  STR R0 $1; emitted the signal GREEN_LIGHT
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case116
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N12101
N12101 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY121;
DUMMY121
  JMP ENDS921
case108 NOOP; Switch Child branch
    LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case109 NOOP; Switch Child branch
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else124; checking if the signal is present TOUCH
  LDR R0 #case110
  STR R0 $9; EnterNode storing statecode : 1
  JMP END0; Jumping to END
  JMP OVERELSE125
else124 NOOP
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case113 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS50
case114 NOOP; Switch Child branch
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #32768 ;loaded the value
  STR R0 $1; emitted the signal GREEN_LIGHT
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS51
ENDS50 NOOP 
ENDS51 NOOP 
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case115 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS270
case116 NOOP; Switch Child branch
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  PRESENT R0 else131 ; Checking DATACALL result 
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  LDR R0 #case115
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE132
else131 NOOP
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE132 NOOP;
  JMP ENDS271
ENDS270 NOOP 
ENDS271 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N13301
  SUBV R1 R0 #0
  PRESENT R1 N1330
N13301 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY133;
N1330 NOOP 
  LDR R0 #case110
  STR R0 $9; EnterNode storing statecode : 1
  JMP END0; Jumping to END
  JMP DUMMY133;
DUMMY133
OVERELSE125 NOOP;
  JMP ENDS300
case110 NOOP; Switch Child branch
  LDR R0 #case110
  STR R0 $9; EnterNode storing statecode : 1
  LDR R0 #case111
  STR R0 $9; EnterNode storing statecode : 2
  JMP END0; Jumping to END
  JMP ENDS301
case111 NOOP; Switch Child branch
  LDR R0 #case111
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case112
  STR R0 $9; EnterNode storing statecode : 3
  JMP END0; Jumping to END
  JMP ENDS302
case112 NOOP; Switch Child branch
  LDR R0 #case112
  STR R0 $9; EnterNode storing statecode : 3
  LDR R0 #case109
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case114
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #32768 ;loaded the value
  STR R0 $1; emitted the signal GREEN_LIGHT
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case116
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N13801
N13801 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY138;
DUMMY138
  JMP ENDS303
ENDS300 NOOP 
ENDS301 NOOP 
ENDS302 NOOP 
ENDS303 NOOP 
  JMP ENDS922
ENDS920 NOOP 
ENDS921 NOOP 
ENDS922 NOOP 
END0 JMP BEGIN0
    ENDPROG
  