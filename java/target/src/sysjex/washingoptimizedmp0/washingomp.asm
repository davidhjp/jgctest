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
  LDR R0 #case147 ;
  STR R0 $8; Switch Node 
  LDR R0 #case150 ;
  STR R0 $9; Switch Node 
  LDR R0 #case152 ;
  STR R0 $a; Switch Node 
  LDR R0 #case154 ;
  STR R0 $b; Switch Node 
  LDR R0 #case156 ;
  STR R0 $c; Switch Node 
  LDR R0 #case158 ;
  STR R0 $d; Switch Node 
  LDR R0 #case160 ;
  STR R0 $e; Switch Node 
  LDR R0 #case162 ;
  STR R0 $f; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
  SEOT166 CLFZ;
    LDR R0 #0;clearing 
    LDR R1 #0;clearing 
    LDR R11 #0;clearing (This register will always contain zeroes !)
  LERR166  LER R0;loading the EREADY bit which is set from ENV
    PRESENT R0 LERR166;
  FER166 SEOT; This is basically the SEOT tick
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
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
    LDR R0 $8
  JMP R0 ; SwitchNode unconditional jump
case146 NOOP; Switch Child branch
  LDR R0 #case146
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS1340
case147 NOOP; Switch Child branch
  LDR R0 #case148
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case148
  STR R0 $8; EnterNode storing statecode : 2
  LDR R0 #case150
  STR R0 $9; EnterNode storing statecode : 1
  LDR R0 #case151
  STR R0 $a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case154
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #case155
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 #case160
  STR R0 $e; EnterNode storing statecode : 1
  LDR R0 #case161
  STR R0 $f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N17001
N17001 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY170;
DUMMY170
  JMP ENDS1341
case148 NOOP; Switch Child branch
    LDR R0 $9
  JMP R0 ; SwitchNode unconditional jump
case149 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS370
case150 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case151 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else176 ;checking if the signal is present washon_1
  LDR R0 #case152
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal WASHING_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE177
else176 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE177 NOOP;
  JMP ENDS150
case152 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else179 ;checking if the signal is present washoff_1
  LDR R0 #case151
  STR R0 $a; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE180
else179 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #2048 ;loading the emit signal in
  STR R0 $2; emitted signal WASHING_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE180 NOOP;
  JMP ENDS151
ENDS150 NOOP 
ENDS151 NOOP 
  JMP ENDS371
ENDS370 NOOP 
ENDS371 NOOP 
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case153 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1270
case154 NOOP; Switch Child branch
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case155 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #8192 ;Got the exact signal
  PRESENT R0 else184 ;checking if the signal is present spinon_1
  LDR R0 #case156
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #case157
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE185
else184 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE185 NOOP;
  JMP ENDS590
case156 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #2048 ;Got the exact signal
  PRESENT R0 else187 ;checking if the signal is present WASHING_1
  LDR R0 #case155
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE188
else187 NOOP
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case157 NOOP; Switch Child branch
  LDR R0 #case157
  STR R0 $d; EnterNode storing statecode : 0
  LDR R0 #case158
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal DRYING_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS470
case158 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #4096 ;Got the exact signal
  PRESENT R0 else191 ;checking if the signal is present spinoff_1
  LDR R0 #case155
  STR R0 $c; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE192
else191 NOOP
  LDR R0 $2 ; loading from mem
  OR R0 R0 #1024 ;loading the emit signal in
  STR R0 $2; emitted signal DRYING_1 in mem
    LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE192 NOOP;
  JMP ENDS471
ENDS470 NOOP 
ENDS471 NOOP 
OVERELSE188 NOOP;
  JMP ENDS591
ENDS590 NOOP 
ENDS591 NOOP 
  JMP ENDS1271
ENDS1270 NOOP 
ENDS1271 NOOP 
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case159 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1320
case160 NOOP; Switch Child branch
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case161 NOOP; Switch Child branch
  LDR R0 #case161
  STR R0 $f; EnterNode storing statecode : 0
  LDR R0 #case162
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1280
case162 NOOP; Switch Child branch
  LDR R0 #case162
  STR R0 $f; EnterNode storing statecode : 1
  LDR R0 $2 ; loading from mem
  OR R0 R0 #32768 ;loading the emit signal in
  STR R0 $2; emitted signal washon_1 in mem
    LDR R0 #case163
  STR R0 $f; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1281
case163 NOOP; Switch Child branch
  LDR R0 #case163
  STR R0 $f; EnterNode storing statecode : 2
  LDR R0 #case164
  STR R0 $f; EnterNode storing statecode : 3
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1282
case164 NOOP; Switch Child branch
  LDR R0 #case164
  STR R0 $f; EnterNode storing statecode : 3
  LDR R0 $2 ; loading from mem
  OR R0 R0 #8192 ;loading the emit signal in
  STR R0 $2; emitted signal spinon_1 in mem
    LDR R0 #case165
  STR R0 $f; EnterNode storing statecode : 4
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1283
case165 NOOP; Switch Child branch
  LDR R0 #case165
  STR R0 $f; EnterNode storing statecode : 4
  LDR R0 $2 ; loading from mem
  OR R0 R0 #4096 ;loading the emit signal in
  STR R0 $2; emitted signal spinoff_1 in mem
    LDR R0 $2 ; loading from mem
  OR R0 R0 #16384 ;loading the emit signal in
  STR R0 $2; emitted signal washoff_1 in mem
    LDR R0 #case161
  STR R0 $f; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1284
ENDS1280 NOOP 
ENDS1281 NOOP 
ENDS1282 NOOP 
ENDS1283 NOOP 
ENDS1284 NOOP 
  JMP ENDS1321
ENDS1320 NOOP 
ENDS1321 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N20001
  SUBV R1 R0 #0
  PRESENT R1 N2000
N20001 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY200;
N2000 NOOP 
  LDR R0 #case146
  STR R0 $8; EnterNode storing statecode : 0
  LDR R0 #case146
  STR R0 $8; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY200;
DUMMY200
  JMP ENDS1342
ENDS1340 NOOP 
ENDS1341 NOOP 
ENDS1342 NOOP 
END0 JMP BEGIN0
    ENDPROG
  