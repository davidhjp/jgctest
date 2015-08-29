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
  LDR R0 #case80 ;
  STR R0 $8; Switch Node 
  LDR R0 #case83 ;
  STR R0 $9; Switch Node 
  LDR R0 #case85 ;
  STR R0 $a; Switch Node 
  LDR R0 #case87 ;
  STR R0 $b; Switch Node 
  LDR R0 #case89 ;
  STR R0 $c; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
  LDR R7 #0;
  LDR R8 #0;previous clock-domain num
SEOT90 CLFZ;
  LDR R0 #0;clearing 
  LDR R1 #0;clearing 
  LDR R11 #0;clearing (This register will always contain zeroes !)
LERR90  LER R0;loading the EREADY bit which is set from ENV
  PRESENT R0 LERR90;
FER90 SEOT; This is basically the SEOT tick
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
  AND R0 R0 #$e000;
  LDR R1 $0000;
  AND R2 R1 #$e000;
  STR R2 $3; storing insigs to delayed
  AND R1 R1 #$1fff;
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
case79 NOOP; Switch Child branch
  LDR R0 #case79
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS650
case80 NOOP; Switch Child branch
  LDR R0 #case81
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case81
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case82
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case84
  STR R0 $a; EnterNode storing statecode : 0
  LDR R0 #case87
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case89
  STR R0 $c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N9401
N9401 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY94;
DUMMY94
  JMP ENDS651
case81 NOOP; Switch Child branch
    LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case82 NOOP; Switch Child branch
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #8192 ;Got the required signal in R0
  PRESENT R0 else97; checking if the signal is present R
  LDR R0 #case83
  STR R0 $9; EnterNode storing statecode : 1
  JMP END0; Jumping to END
  JMP OVERELSE98
else97 NOOP
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case84 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case86 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS30
case87 NOOP; Switch Child branch
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else103; checking if the signal is present A
  LDR R0 #case86
  STR R0 $b; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE104
else103 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE104 NOOP;
  JMP ENDS31
ENDS30 NOOP 
ENDS31 NOOP 
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case88 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS60
case89 NOOP; Switch Child branch
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else107; checking if the signal is present B
  LDR R0 #case88
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE108
else107 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE108 NOOP;
  JMP ENDS61
ENDS60 NOOP 
ENDS61 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N10901
  SUBV R1 R0 #0
  PRESENT R1 N1090
N10901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY109;
N1090 NOOP 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #32768 ;loaded the value
  STR R0 $1; emitted the signal O
    LDR R0 #case85
  STR R0 $a; EnterNode storing statecode : 1
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $3; loading input signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit B
  LDR R0 $3; loading input signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit A
  PRESENT R0 FALSE111; testing whether it is true - LogicalAnd
  PRESENT R1 FALSE111; testing whether it is true - LogicalAnd
  OR R2 R2 #1; result is true - LogicalAnd
FALSE111
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else110 ;checking if the signal is present A.getprestatus() && B.getprestatus()
  JMP END0; Jumping to END
  JMP OVERELSE112
else110 NOOP
  JMP END0; Jumping to END
OVERELSE112 NOOP;
  JMP DUMMY109;
DUMMY109
  JMP ENDS70
case85 NOOP; Switch Child branch
  AND R2 R2 R11; Clearing the result-register before evaluating boolean-expression --------------------;
  LDR R1 $3; loading input signal 16-bit (RIGHT)
  AND R1 R1 #16384; Anding to get the right signal bit B
  LDR R0 $3; loading input signal 16-bit (LEFT)
  AND R0 R0 #32768; Anding to get the right signal bit A
  PRESENT R0 FALSE115; testing whether it is true - LogicalAnd
  PRESENT R1 FALSE115; testing whether it is true - LogicalAnd
  OR R2 R2 #1; result is true - LogicalAnd
FALSE115
  AND R0 R0 R11; clearing contents of R0
  ADD R0 R0 R2; loading the boolean-results
  AND R0 R0 #1; getting the final result (boolean-expression)
  PRESENT R0 else114 ;checking if the signal is present A.getprestatus() && B.getprestatus()
  JMP END0; Jumping to END
  JMP OVERELSE116
else114 NOOP
  JMP END0; Jumping to END
OVERELSE116 NOOP;
  JMP ENDS71
ENDS70 NOOP 
ENDS71 NOOP 
OVERELSE98 NOOP;
  JMP ENDS210
case83 NOOP; Switch Child branch
  LDR R0 #case83
  STR R0 $9; EnterNode storing statecode : 1
  LDR R0 #case82
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case84
  STR R0 $a; EnterNode storing statecode : 0
  LDR R0 #case87
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case89
  STR R0 $c; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N11901
N11901 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY119;
DUMMY119
  JMP ENDS211
ENDS210 NOOP 
ENDS211 NOOP 
  JMP ENDS652
ENDS650 NOOP 
ENDS651 NOOP 
ENDS652 NOOP 
END0 JMP BEGIN0
  ENDPROG
