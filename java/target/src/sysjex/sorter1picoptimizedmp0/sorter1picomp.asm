start NOOP ;starting the program
  LDR R0 #32768;
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
  LDR R0 #case164 ;
  STR R0 $9; Switch Node 
  LDR R0 #case167 ;
  STR R0 $a; Switch Node 
  LDR R0 #case169 ;
  STR R0 $b; Switch Node 
  LDR R0 #case171 ;
  STR R0 $c; Switch Node 
  LDR R0 #case173 ;
  STR R0 $d; Switch Node 
  LDR R0 #case176 ;
  STR R0 $e; Switch Node 
  LDR R0 #case178 ;
  STR R0 $f; Switch Node 

BEGIN0 NOOP; loading the num which have to be init
    LDR R7 #0;
    LDR R8 #0;previous clock-domain num
  SEOT182 CLFZ;
    LDR R0 #0;clearing 
    LDR R1 #0;clearing 
    LDR R11 #0;clearing (This register will always contain zeroes !)
  LERR182  LER R0;loading the EREADY bit which is set from ENV
    PRESENT R0 LERR182;
  FER182 SEOT; This is basically the SEOT tick
    CER;clear the EREADY bit
    LDR R0 $0001; loading the output signals
    AND R1 R0 #$3fff;clearing output sig fields
    STR R1 $1
    AND R0 R0 #$c000;
    SSOP R0;throwing output signals to env
  ; Updating pre sigs - Delayed semantics 
    STR R0 $4 ;store it to pre-osig of this CD 
    LDR R0 $2; loading signals
    STR R0 $5; storing to delayed
    ;Setting the declared signals and terminate node to 0
  STR R11 $2 ; DSigs
  LSIP R0;getting input signals from SIP
    AND R0 R0 #$c000;
    LDR R1 $0000;
    AND R2 R1 #$c000;
    STR R2 $3; storing insigs to delayed
  AND R1 R1 #$3fff;
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
case163 NOOP; Switch Child branch
  LDR R0 #case163
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP ENDS1250
case164 NOOP; Switch Child branch
  LDR R0 #case165
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case165
  STR R0 $9; EnterNode storing statecode : 2
  LDR R0 #case167
  STR R0 $a; EnterNode storing statecode : 1
  LDR R0 #32769 ; loading case number
  DCALLBL R0 ; casenumber 1
  LDR R0 #case168
  STR R0 $b; EnterNode storing statecode : 0
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else186; checking if the signal is present NEWITEM
  LDR R0 #32770 ; loading case number
  DCALLBL R0 ; casenumber 2
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else187; checking if the signal is present ITEMPICKED
  LDR R0 #32771 ; loading case number
  DCALLBL R0 ; casenumber 3
  LDR R0 #32772 ; loading case number
  DCALLBL R0 ; casenumber 4
  PRESENT R0 else188 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE189
else188 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE189 NOOP;
  JMP OVERELSE190
else187 NOOP
  LDR R0 #32773 ; loading case number
  DCALLBL R0 ; casenumber 5
  PRESENT R0 else191 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE192
else191 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE192 NOOP;
OVERELSE190 NOOP;
  JMP OVERELSE193
else186 NOOP
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else194; checking if the signal is present ITEMPICKED
  LDR R0 #32774 ; loading case number
  DCALLBL R0 ; casenumber 6
  LDR R0 #32775 ; loading case number
  DCALLBL R0 ; casenumber 7
  PRESENT R0 else195 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE196
else195 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE196 NOOP;
  JMP OVERELSE197
else194 NOOP
  LDR R0 #32776 ; loading case number
  DCALLBL R0 ; casenumber 8
  PRESENT R0 else198 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE199
else198 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE199 NOOP;
OVERELSE197 NOOP;
OVERELSE193 NOOP;
  LDR R0 #case171
  STR R0 $c; EnterNode storing statecode : 1
  LDR R0 #case172
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N20001
N20001 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY200;
DUMMY200
  JMP ENDS1251
case165 NOOP; Switch Child branch
    LDR R0 $a
  JMP R0 ; SwitchNode unconditional jump
case166 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS610
case167 NOOP; Switch Child branch
    LDR R0 $b
  JMP R0 ; SwitchNode unconditional jump
case168 NOOP; Switch Child branch
  LDR R0 #case168
  STR R0 $b; EnterNode storing statecode : 0
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else206; checking if the signal is present NEWITEM
  LDR R0 #32777 ; loading case number
  DCALLBL R0 ; casenumber 9
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else207; checking if the signal is present ITEMPICKED
  LDR R0 #32778 ; loading case number
  DCALLBL R0 ; casenumber 10
  LDR R0 #32779 ; loading case number
  DCALLBL R0 ; casenumber 11
  PRESENT R0 else208 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE209
else208 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE209 NOOP;
  JMP OVERELSE210
else207 NOOP
  LDR R0 #32780 ; loading case number
  DCALLBL R0 ; casenumber 12
  PRESENT R0 else211 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE212
else211 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE212 NOOP;
OVERELSE210 NOOP;
  JMP OVERELSE213
else206 NOOP
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else214; checking if the signal is present ITEMPICKED
  LDR R0 #32781 ; loading case number
  DCALLBL R0 ; casenumber 13
  LDR R0 #32782 ; loading case number
  DCALLBL R0 ; casenumber 14
  PRESENT R0 else215 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE216
else215 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE216 NOOP;
  JMP OVERELSE217
else214 NOOP
  LDR R0 #32783 ; loading case number
  DCALLBL R0 ; casenumber 15
  PRESENT R0 else218 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE219
else218 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE219 NOOP;
OVERELSE217 NOOP;
OVERELSE213 NOOP;
  JMP ENDS50
case169 NOOP; Switch Child branch
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R0 #case168
  STR R0 $b; EnterNode storing statecode : 0
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else221; checking if the signal is present NEWITEM
  LDR R0 #32784 ; loading case number
  DCALLBL R0 ; casenumber 16
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else222; checking if the signal is present ITEMPICKED
  LDR R0 #32785 ; loading case number
  DCALLBL R0 ; casenumber 17
  LDR R0 #32786 ; loading case number
  DCALLBL R0 ; casenumber 18
  PRESENT R0 else223 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE224
else223 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE224 NOOP;
  JMP OVERELSE225
else222 NOOP
  LDR R0 #32787 ; loading case number
  DCALLBL R0 ; casenumber 19
  PRESENT R0 else226 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE227
else226 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE227 NOOP;
OVERELSE225 NOOP;
  JMP OVERELSE228
else221 NOOP
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #16384 ;Got the required signal in R0
  PRESENT R0 else229; checking if the signal is present ITEMPICKED
  LDR R0 #32788 ; loading case number
  DCALLBL R0 ; casenumber 20
  LDR R0 #32789 ; loading case number
  DCALLBL R0 ; casenumber 21
  PRESENT R0 else230 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE231
else230 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE231 NOOP;
  JMP OVERELSE232
else229 NOOP
  LDR R0 #32790 ; loading case number
  DCALLBL R0 ; casenumber 22
  PRESENT R0 else233 ; Checking DATACALL result 
  LDR R0 $1; loaded the memPointer
  OR R0 R0 #16384 ;loaded the value
  STR R0 $1; emitted the signal STOPLOADER
    LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP OVERELSE234
else233 NOOP
  LDR R0 #case169
  STR R0 $b; EnterNode storing statecode : 1
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE234 NOOP;
OVERELSE232 NOOP;
OVERELSE228 NOOP;
  JMP ENDS51
ENDS50 NOOP 
ENDS51 NOOP 
  JMP ENDS611
ENDS610 NOOP 
ENDS611 NOOP 
    LDR R0 $c
  JMP R0 ; SwitchNode unconditional jump
case170 NOOP; Switch Child branch
  LDR R1 $7
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS1230
case171 NOOP; Switch Child branch
    LDR R0 $d
  JMP R0 ; SwitchNode unconditional jump
case172 NOOP; Switch Child branch
  LDR R0 $3 ;Loaded the input signals into register
  AND R0 R0 #32768 ;Got the required signal in R0
  PRESENT R0 else238; checking if the signal is present NEWITEM
  LDR R0 #case173
  STR R0 $d; EnterNode storing statecode : 1
  LDR R0 #32791 ; loading case number
  DCALLBL R0 ; casenumber 23
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case176
  STR R0 $e; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 #case178
  STR R0 $f; EnterNode storing statecode : 1
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N24001
N24001 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY240;
DUMMY240
  JMP OVERELSE241
else238 NOOP
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
OVERELSE241 NOOP;
  JMP ENDS810
case173 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
    LDR R0 $e
  JMP R0 ; SwitchNode unconditional jump
case175 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS690
case176 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #32768 ;Got the exact signal
  PRESENT R0 else246 ;checking if the signal is present picture_1
  LDR R0 #32792 ; loading case number
  DCALLBL R0 ; casenumber 24
  LDR R0 #case175
  STR R0 $e; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE247
else246 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE247 NOOP;
  JMP ENDS691
ENDS690 NOOP 
ENDS691 NOOP 
    LDR R0 $f
  JMP R0 ; SwitchNode unconditional jump
case177 NOOP; Switch Child branch
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP ENDS720
case178 NOOP; Switch Child branch
  LDR R0 $5 ;Loading the register which has this signal
  AND R0 R0 #16384 ;Got the exact signal
  PRESENT R0 else250 ;checking if the signal is present edgepicture_1
  LDR R0 #32793 ; loading case number
  DCALLBL R0 ; casenumber 25
  LDR R0 #case177
  STR R0 $f; EnterNode storing statecode : 0
  LDR R1 $8
  MAX R1 #$0; comparing larger terminate code and stores to R1 
  STR R1 $8
  JMP OVERELSE251
else250 NOOP
  LDR R1 $8
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $8
OVERELSE251 NOOP;
  JMP ENDS721
ENDS720 NOOP 
ENDS721 NOOP 
  LDR R0 $8; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N25201
  SUBV R1 R0 #0
  PRESENT R1 N2520
N25201 NOOP 
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY252;
N2520 NOOP 
  LDR R0 #case174
  STR R0 $d; EnterNode storing statecode : 2
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP DUMMY252;
DUMMY252
  JMP ENDS811
case174 NOOP; Switch Child branch
  LDR R0 #case174
  STR R0 $d; EnterNode storing statecode : 2
  LDR R0 #case172
  STR R0 $d; EnterNode storing statecode : 0
  LDR R1 $7
  MAX R1 #$1; comparing larger terminate code and stores to R1 
  STR R1 $7
  JMP ENDS812
ENDS810 NOOP 
ENDS811 NOOP 
ENDS812 NOOP 
  JMP ENDS1231
ENDS1230 NOOP 
ENDS1231 NOOP 
  LDR R0 $7; loading TN code
  SUBV R1 R0 #1
  PRESENT R1 N25401
  SUBV R1 R0 #0
  PRESENT R1 N2540
N25401 NOOP 
  JMP END0; Jumping to END
  JMP DUMMY254;
N2540 NOOP 
  LDR R0 #case163
  STR R0 $9; EnterNode storing statecode : 0
  LDR R0 #case163
  STR R0 $9; EnterNode storing statecode : 0
  JMP END0; Jumping to END 
  JMP DUMMY254;
DUMMY254
  JMP ENDS1252
ENDS1250 NOOP 
ENDS1251 NOOP 
ENDS1252 NOOP 
END0 JMP BEGIN0
    ENDPROG
  